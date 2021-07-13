package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class WliProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        var decoder = new WliProtocolDecoder(null);

        verifyNull(decoder, binary(
                "0232776c693a30343930333332303332343103"));

        verifyPosition(decoder, binary(
                "0231000101bba758c900010034000500ff001001258fc9013e80ed00001183350101e20006003200090030000a0032000b003331000c0031000d00343438000e003530000f003100100031303800130032001b003134001c0033392c33352c32382c33382c34302c33372c33332c33382c33352c34322c33372c3335001d003130001e0038002300343235002400303100250031303432320026003336343733002700323800280037002900312c312c312c312c31302e3232352e3135312e3230342c36353533352c302c39392c39392c3235352c3235352c3235352c323535002a0030002c0030003000300032003000330031003400ff001c0214130502061b0101258fc9013e80ed000001e2000000000000004d004500302c323031392f30352f30322c30363a33333a30302c323031392f30352f30322c30363a32363a3230005a003000f100352c302c342c302c2d312c2d3100f2003300f3003100f50038363634323530333137303639323400f600312c302c302c3431322c3000f70038343437373200f80032312c31312c302c302c302c302c2c2c2c2c2c302c3000f9003300fa00393100fb0032313100fc0032313000ff00313535363737383533340003"));

        verifyAttributes(decoder, binary(
                "0231001f008931c7fe00010032353200030030352f32362f323000040031373a32353a34300007004d322e31313954204d617220323020323031340008003000090031303800f600332c382c313338372c33363200f70038313634383200f800302c313134372c302c322c302c3000f9003300fa00383900fb0032353400fc0031383400ff00313539303531333934300003"));

    }

}
