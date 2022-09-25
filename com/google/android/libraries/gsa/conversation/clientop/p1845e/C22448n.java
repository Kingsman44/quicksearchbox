package com.google.android.libraries.gsa.conversation.clientop.p1845e;

import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.e.n */
/* compiled from: PG */
public final class C22448n extends C22538o {

    /* renamed from: a */
    private static final C59071e f61991a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.clientop.e.n");

    /* renamed from: b */
    private final C68214a f61992b;

    /* renamed from: c */
    private final C68214a f61993c;

    /* renamed from: d */
    private final C68214a f61994d;

    /* renamed from: e */
    private final C68214a f61995e;

    /* renamed from: f */
    private C52115fu f61996f;

    public C22448n(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f61992b = aVar;
        this.f61993c = aVar2;
        this.f61994d = aVar3;
        this.f61995e = aVar4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r8, com.google.android.libraries.gsa.conversation.clientop.C22434e r9) {
        /*
            r7 = this;
            java.lang.String r9 = "device.MODIFY_SETTING"
            java.lang.String r0 = r8.f135936b
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0199
            com.google.assistant.e.j.dw r8 = r8.f135938d
            if (r8 != 0) goto L_0x0010
            com.google.assistant.e.j.dw r8 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0010:
            com.google.assistant.e.j.fu r9 = com.google.assistant.p3897e.p3921j.C52115fu.f136753n
            com.google.protobuf.eb r9 = r9.getParserForType()
            java.lang.String r0 = "modify_setting_args"
            com.google.protobuf.MessageLite r8 = m41992m(r8, r0, r9)
            com.google.assistant.e.j.fu r8 = (com.google.assistant.p3897e.p3921j.C52115fu) r8
            r7.f61996f = r8
            int r9 = r8.f136755a
            r0 = 2
            r9 = r9 & r0
            if (r9 == 0) goto L_0x0193
            java.lang.String r8 = r8.f136760f
            int r9 = r8.hashCode()
            r1 = 0
            r2 = -1
            r3 = 3
            r4 = 1
            switch(r9) {
                case -697981146: goto L_0x0052;
                case 2664213: goto L_0x0048;
                case 460509838: goto L_0x003e;
                case 1878763007: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x005c
        L_0x0034:
            java.lang.String r9 = "VOLUME_LEVEL"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x005c
            r8 = 3
            goto L_0x005d
        L_0x003e:
            java.lang.String r9 = "BLUETOOTH"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x005c
            r8 = 0
            goto L_0x005d
        L_0x0048:
            java.lang.String r9 = "WIFI"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x005c
            r8 = 2
            goto L_0x005d
        L_0x0052:
            java.lang.String r9 = "FLASHLIGHT"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x005c
            r8 = 1
            goto L_0x005d
        L_0x005c:
            r8 = -1
        L_0x005d:
            r9 = 0
            if (r8 == 0) goto L_0x014b
            if (r8 == r4) goto L_0x013c
            if (r8 == r0) goto L_0x00f8
            if (r8 == r3) goto L_0x0072
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.UNIMPLEMENTED
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r8, r9)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            goto L_0x0192
        L_0x0072:
            dagger.a r8 = r7.f61995e
            java.lang.Object r8 = r8.mo27525b()
            android.media.AudioManager r8 = (android.media.AudioManager) r8
            if (r8 != 0) goto L_0x0084
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.UNAVAILABLE
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r8, r9)
            goto L_0x00f2
        L_0x0084:
            com.google.assistant.e.j.fu r1 = r7.f61996f
            int r5 = r1.f136757c
            int r5 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r5)
            if (r5 != 0) goto L_0x008f
            r5 = 1
        L_0x008f:
            int r5 = r5 + r2
            switch(r5) {
                case 1: goto L_0x00ea;
                case 2: goto L_0x00e2;
                case 3: goto L_0x00dc;
                case 4: goto L_0x00d8;
                case 5: goto L_0x00d4;
                case 6: goto L_0x00a8;
                default: goto L_0x0093;
            }
        L_0x0093:
            com.google.common.f.e r8 = f61991a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r0 = "Unexpected Change type for Volume Level setting"
            r1 = 48288(0xbca0, float:6.7666E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r1)).mo56386p(r0)
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r8, r9)
            goto L_0x00f2
        L_0x00a8:
            int r9 = r1.f136759e
            int r9 = com.google.assistant.p3897e.p3921j.C52114ft.m86509a(r9)
            if (r9 != 0) goto L_0x00b1
            r9 = 1
        L_0x00b1:
            int r1 = r8.getStreamVolume(r3)
            double r5 = (double) r1
            int r9 = r9 + r2
            if (r9 == r4) goto L_0x00cb
            if (r9 == r0) goto L_0x00bc
            goto L_0x00cf
        L_0x00bc:
            int r9 = r8.getStreamMaxVolume(r3)
            double r0 = (double) r9
            com.google.assistant.e.j.fu r9 = r7.f61996f
            double r5 = r9.f136758d
            java.lang.Double.isNaN(r0)
            double r5 = r5 * r0
            goto L_0x00cf
        L_0x00cb:
            com.google.assistant.e.j.fu r9 = r7.f61996f
            double r5 = r9.f136758d
        L_0x00cf:
            int r9 = (int) r5
            r8.setStreamVolume(r3, r9, r4)
            goto L_0x00f0
        L_0x00d4:
            r8.adjustSuggestedStreamVolume(r2, r3, r4)
            goto L_0x00f0
        L_0x00d8:
            r8.adjustSuggestedStreamVolume(r4, r3, r4)
            goto L_0x00f0
        L_0x00dc:
            r9 = 101(0x65, float:1.42E-43)
            r8.adjustSuggestedStreamVolume(r9, r3, r4)
            goto L_0x00f0
        L_0x00e2:
            r9 = -100
            r0 = 16
            r8.adjustSuggestedStreamVolume(r9, r3, r0)
            goto L_0x00f0
        L_0x00ea:
            r9 = 100
            r0 = 4
            r8.adjustSuggestedStreamVolume(r9, r3, r0)
        L_0x00f0:
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a
        L_0x00f2:
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            goto L_0x0192
        L_0x00f8:
            dagger.a r8 = r7.f61994d
            java.lang.Object r8 = r8.mo27525b()
            android.net.wifi.WifiManager r8 = (android.net.wifi.WifiManager) r8
            if (r8 != 0) goto L_0x0109
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.UNAVAILABLE
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r8, r9)
            goto L_0x0137
        L_0x0109:
            com.google.assistant.e.j.fu r3 = r7.f61996f
            int r3 = r3.f136757c
            int r3 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r3)
            if (r3 != 0) goto L_0x0114
            r3 = 1
        L_0x0114:
            int r3 = r3 + r2
            if (r3 == r4) goto L_0x0132
            if (r3 == r0) goto L_0x012e
            com.google.common.f.e r8 = f61991a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r0 = "Unexpected Change type for Wifi setting"
            r1 = 48289(0xbca1, float:6.7667E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r1)).mo56386p(r0)
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r8, r9)
            goto L_0x0137
        L_0x012e:
            r8.setWifiEnabled(r1)
            goto L_0x0135
        L_0x0132:
            r8.setWifiEnabled(r4)
        L_0x0135:
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a
        L_0x0137:
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            goto L_0x0192
        L_0x013c:
            dagger.a r8 = r7.f61993c
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.libraries.gsa.conversation.clientop.e.g r8 = (com.google.android.libraries.gsa.conversation.clientop.p1845e.C22441g) r8
            com.google.assistant.e.j.fu r9 = r7.f61996f
            com.google.common.util.concurrent.cx r8 = r8.mo27620a(r9)
            goto L_0x0192
        L_0x014b:
            dagger.a r8 = r7.f61992b
            java.lang.Object r8 = r8.mo27525b()
            android.bluetooth.BluetoothManager r8 = (android.bluetooth.BluetoothManager) r8
            android.bluetooth.BluetoothAdapter r8 = r8.getAdapter()
            if (r8 != 0) goto L_0x0160
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.UNAVAILABLE
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r8, r9)
            goto L_0x018e
        L_0x0160:
            com.google.assistant.e.j.fu r1 = r7.f61996f
            int r1 = r1.f136757c
            int r1 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r1)
            if (r1 != 0) goto L_0x016b
            r1 = 1
        L_0x016b:
            int r1 = r1 + r2
            if (r1 == r4) goto L_0x0189
            if (r1 == r0) goto L_0x0185
            com.google.common.f.e r8 = f61991a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r0 = "Unexpected Change type for Bluetooth setting"
            r1 = 48287(0xbc9f, float:6.7664E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r1)).mo56386p(r0)
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r8, r9)
            goto L_0x018e
        L_0x0185:
            r8.disable()
            goto L_0x018c
        L_0x0189:
            r8.enable()
        L_0x018c:
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a
        L_0x018e:
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
        L_0x0192:
            return r8
        L_0x0193:
            com.google.android.libraries.gsa.conversation.clientop.k r8 = new com.google.android.libraries.gsa.conversation.clientop.k
            r8.<init>()
            throw r8
        L_0x0199:
            com.google.android.libraries.gsa.conversation.clientop.d r9 = new com.google.android.libraries.gsa.conversation.clientop.d
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.conversation.clientop.p1845e.C22448n.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }
}
