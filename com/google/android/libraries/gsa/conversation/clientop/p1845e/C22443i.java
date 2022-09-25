package com.google.android.libraries.gsa.conversation.clientop.p1845e;

import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C52097fc;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.e.i */
/* compiled from: PG */
public final class C22443i extends C22538o {

    /* renamed from: a */
    private final C68214a f61968a;

    /* renamed from: b */
    private final C68214a f61969b;

    /* renamed from: c */
    private final C68214a f61970c;

    /* renamed from: d */
    private final C68214a f61971d;

    /* renamed from: e */
    private C52097fc f61972e;

    public C22443i(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f61968a = aVar;
        this.f61969b = aVar2;
        this.f61970c = aVar3;
        this.f61971d = aVar4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r11, com.google.android.libraries.gsa.conversation.clientop.C22434e r12) {
        /*
            r10 = this;
            java.lang.String r12 = "device.GET_SETTINGS"
            java.lang.String r0 = r11.f135936b
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x017b
            com.google.assistant.e.j.dw r11 = r11.f135938d
            if (r11 != 0) goto L_0x0010
            com.google.assistant.e.j.dw r11 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0010:
            com.google.assistant.e.j.fc r12 = com.google.assistant.p3897e.p3921j.C52097fc.f136720f
            com.google.protobuf.eb r12 = r12.getParserForType()
            java.lang.String r0 = "get_device_settings_args"
            com.google.protobuf.MessageLite r11 = m41992m(r11, r0, r12)
            com.google.assistant.e.j.fc r11 = (com.google.assistant.p3897e.p3921j.C52097fc) r11
            r10.f61972e = r11
            com.google.protobuf.cq r11 = r11.f136724c
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L_0x0175
            com.google.assistant.e.j.fm r12 = com.google.assistant.p3897e.p3921j.C52107fm.f136742d
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.e.j.fd r12 = (com.google.assistant.p3897e.p3921j.C52098fd) r12
            r0 = 0
            r1 = 0
        L_0x0032:
            int r2 = r11.size()
            if (r1 >= r2) goto L_0x0164
            java.lang.Object r2 = r11.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            r4 = 3
            r5 = 1
            r6 = -1
            r7 = 2
            switch(r3) {
                case -697981146: goto L_0x0068;
                case 2664213: goto L_0x005e;
                case 460509838: goto L_0x0054;
                case 1878763007: goto L_0x004a;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x0072
        L_0x004a:
            java.lang.String r3 = "VOLUME_LEVEL"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0072
            r3 = 3
            goto L_0x0073
        L_0x0054:
            java.lang.String r3 = "BLUETOOTH"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0072
            r3 = 0
            goto L_0x0073
        L_0x005e:
            java.lang.String r3 = "WIFI"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0072
            r3 = 2
            goto L_0x0073
        L_0x0068:
            java.lang.String r3 = "FLASHLIGHT"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0072
            r3 = 1
            goto L_0x0073
        L_0x0072:
            r3 = -1
        L_0x0073:
            r8 = 4
            if (r3 == 0) goto L_0x0131
            if (r3 == r5) goto L_0x00f6
            if (r3 == r7) goto L_0x00cd
            if (r3 == r4) goto L_0x009a
            com.google.assistant.e.j.fi r3 = com.google.assistant.p3897e.p3921j.C52103fi.f136729i
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.fe r3 = (com.google.assistant.p3897e.p3921j.C52099fe) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.e.j.fi r4 = (com.google.assistant.p3897e.p3921j.C52103fi) r4
            r4.f136734d = r0
            int r5 = r4.f136731a
            r5 = r5 | r8
            r4.f136731a = r5
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.j.fi r3 = (com.google.assistant.p3897e.p3921j.C52103fi) r3
            goto L_0x015d
        L_0x009a:
            dagger.a r3 = r10.f61971d
            java.lang.Object r3 = r3.mo27525b()
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            if (r3 != 0) goto L_0x00a6
            r4 = 2
            goto L_0x00ae
        L_0x00a6:
            boolean r3 = r3.isVolumeFixed()
            if (r3 == 0) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r4 = 4
        L_0x00ae:
            com.google.assistant.e.j.fi r3 = com.google.assistant.p3897e.p3921j.C52103fi.f136729i
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.fe r3 = (com.google.assistant.p3897e.p3921j.C52099fe) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.j.fi r5 = (com.google.assistant.p3897e.p3921j.C52103fi) r5
            int r4 = r4 + r6
            r5.f136734d = r4
            int r4 = r5.f136731a
            r4 = r4 | r8
            r5.f136731a = r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.j.fi r3 = (com.google.assistant.p3897e.p3921j.C52103fi) r3
            goto L_0x015d
        L_0x00cd:
            dagger.a r3 = r10.f61970c
            java.lang.Object r3 = r3.mo27525b()
            android.net.wifi.WifiManager r3 = (android.net.wifi.WifiManager) r3
            com.google.assistant.e.j.fi r4 = com.google.assistant.p3897e.p3921j.C52103fi.f136729i
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.fe r4 = (com.google.assistant.p3897e.p3921j.C52099fe) r4
            if (r3 == 0) goto L_0x00e0
            r7 = 4
        L_0x00e0:
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.assistant.e.j.fi r3 = (com.google.assistant.p3897e.p3921j.C52103fi) r3
            int r7 = r7 + r6
            r3.f136734d = r7
            int r5 = r3.f136731a
            r5 = r5 | r8
            r3.f136731a = r5
            com.google.protobuf.bv r3 = r4.build()
            com.google.assistant.e.j.fi r3 = (com.google.assistant.p3897e.p3921j.C52103fi) r3
            goto L_0x015d
        L_0x00f6:
            dagger.a r3 = r10.f61969b
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.libraries.gsa.conversation.clientop.e.g r3 = (com.google.android.libraries.gsa.conversation.clientop.p1845e.C22441g) r3
            com.google.assistant.e.j.fi r4 = com.google.assistant.p3897e.p3921j.C52103fi.f136729i
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.fe r4 = (com.google.assistant.p3897e.p3921j.C52099fe) r4
            android.content.pm.PackageManager r5 = r3.f61964b
            java.lang.String r9 = "android.hardware.camera"
            boolean r5 = r5.hasSystemFeature(r9)
            if (r5 == 0) goto L_0x011b
            android.content.pm.PackageManager r3 = r3.f61964b
            java.lang.String r5 = "android.hardware.camera.flash"
            boolean r3 = r3.hasSystemFeature(r5)
            if (r3 == 0) goto L_0x011b
            r7 = 4
        L_0x011b:
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.assistant.e.j.fi r3 = (com.google.assistant.p3897e.p3921j.C52103fi) r3
            int r7 = r7 + r6
            r3.f136734d = r7
            int r5 = r3.f136731a
            r5 = r5 | r8
            r3.f136731a = r5
            com.google.protobuf.bv r3 = r4.build()
            com.google.assistant.e.j.fi r3 = (com.google.assistant.p3897e.p3921j.C52103fi) r3
            goto L_0x015d
        L_0x0131:
            com.google.assistant.e.j.fi r3 = com.google.assistant.p3897e.p3921j.C52103fi.f136729i
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.fe r3 = (com.google.assistant.p3897e.p3921j.C52099fe) r3
            dagger.a r4 = r10.f61968a
            java.lang.Object r4 = r4.mo27525b()
            android.bluetooth.BluetoothManager r4 = (android.bluetooth.BluetoothManager) r4
            android.bluetooth.BluetoothAdapter r4 = r4.getAdapter()
            if (r4 == 0) goto L_0x0148
            r7 = 4
        L_0x0148:
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.e.j.fi r4 = (com.google.assistant.p3897e.p3921j.C52103fi) r4
            int r7 = r7 + r6
            r4.f136734d = r7
            int r5 = r4.f136731a
            r5 = r5 | r8
            r4.f136731a = r5
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.j.fi r3 = (com.google.assistant.p3897e.p3921j.C52103fi) r3
        L_0x015d:
            r12.mo53798b(r2, r3)
            int r1 = r1 + 1
            goto L_0x0032
        L_0x0164:
            java.lang.String r11 = "assistant.api.client_op.GetDeviceSettingsResult"
            com.google.protobuf.bv r12 = r12.build()
            java.lang.String r0 = "get_device_settings_result"
            com.google.assistant.e.j.ec r11 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41821a(r0, r11, r12)
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            return r11
        L_0x0175:
            com.google.android.libraries.gsa.conversation.clientop.k r11 = new com.google.android.libraries.gsa.conversation.clientop.k
            r11.<init>()
            throw r11
        L_0x017b:
            com.google.android.libraries.gsa.conversation.clientop.d r12 = new com.google.android.libraries.gsa.conversation.clientop.d
            r12.<init>(r11)
            goto L_0x0182
        L_0x0181:
            throw r12
        L_0x0182:
            goto L_0x0181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.conversation.clientop.p1845e.C22443i.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }
}
