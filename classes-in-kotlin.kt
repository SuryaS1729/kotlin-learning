open class SmartDevice(val name: String, val category: String){
    

    var deviceStatus = "Online"
    
    open fun turnOn(){
	 println("device is turned on")
    }
    
    open fun turnOff(){
	 println("device is turned off")
    }

    
}

class SmartTvDevice(deviceName: String, deviceCategory: String):
      SmartDevice(name = deviceName, category = deviceCategory){

          var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
        
        var channelNumber = 1 
          set(value){
              if(value in 0..200){
                  field = value
              }
          }
          
        fun increaseSpeakerVolume(){
            
            speakerVolume++
            
            println("speaker volume increased to $speakerVolume")

        
        }
        
        fun nextChannel(){
					channelNumber++
						
            println("channel number $channelNumber")
        
        }
        
      override fun turnOn() {
        deviceStatus = "on"
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                "set to $channelNumber."
        )
    }
        
       override fun turnOff() {
        deviceStatus = "off"
        println("$name turned off")
    }
          
          
          
      
      
      }
      
      
      
class SmartLightDevice(deviceName:String, deviceCategory:String):
	  SmartDevice(name = deviceName, category = deviceCategory){
           var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
        
        fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }
        
           override fun turnOn() {
        deviceStatus = "on"
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }
            
           override fun turnOff() {
        deviceStatus = "off"
        brightnessLevel = 0
        println("Smart Light turned off")
    }
           
           
             
        
      }
      
      
class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {

    fun turnOnTv() {
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }
    
    fun turnOnLight() {
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        smartLightDevice.turnOff()
    }
    
    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }
    
    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}
      
      
      
      
      
      
      
      
      
      
      
      
      


fun main() {

 var smartDevice: SmartDevice = SmartTvDevice("Android TV", "Entertainment")
     smartDevice.turnOn()
     
     smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()

    
}