package com.google.android.apps.gsa.shared.p7045k;

import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.shared.k.y */
/* compiled from: PG */
public final /* synthetic */ class C89829y implements C22864c {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0235, code lost:
        if (r1.equals(com.google.android.libraries.p579ar.faceviewer.C10662f.f35572a) != false) goto L_0x0270;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17879a(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "time_format"
            java.lang.String r2 = "locale"
            java.lang.String r3 = "settings"
            java.lang.String r4 = "setup"
            java.lang.String r5 = "device_info"
            java.lang.String r6 = "capabilities"
            com.google.android.apps.gsa.shared.aa.m r13 = (com.google.android.apps.gsa.shared.p6968aa.C89057m) r13
            r7 = 0
            java.lang.String r13 = r13.mo83035e()     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            r8.<init>(r13)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            com.google.android.apps.gsa.shared.k.ab r13 = new com.google.android.apps.gsa.shared.k.ab     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            r13.<init>()     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            org.json.JSONObject r9 = r8.getJSONObject(r5)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            org.json.JSONObject r9 = r9.getJSONObject(r6)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r10 = "cloudcast_supported"
            r11 = 0
            boolean r9 = r9.optBoolean(r10, r11)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            r13.f243036a = r9     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r9 = "opt_in"
            org.json.JSONObject r9 = r8.getJSONObject(r9)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r10 = "cloud_ipc"
            boolean r9 = r9.optBoolean(r10, r11)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            r13.f243037b = r9     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            org.json.JSONObject r9 = r8.getJSONObject(r5)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            org.json.JSONObject r9 = r9.getJSONObject(r6)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r10 = "assistant_supported"
            boolean r9 = r9.optBoolean(r10, r11)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            r13.f243038c = r9     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            org.json.JSONObject r9 = r8.getJSONObject(r5)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            org.json.JSONObject r9 = r9.getJSONObject(r6)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r10 = "display_supported"
            boolean r9 = r9.optBoolean(r10, r11)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            r13.f243044i = r9     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            org.json.JSONObject r5 = r8.getJSONObject(r5)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            org.json.JSONObject r9 = r5.getJSONObject(r6)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r10 = "multi_user_supported"
            boolean r9 = r9.optBoolean(r10, r11)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            r13.f243042g = r9     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            org.json.JSONObject r6 = r5.getJSONObject(r6)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            r13.f243043h = r6     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r6 = "cloud_device_id"
            java.lang.String r5 = r5.getString(r6)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            r13.f243046k = r5     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            boolean r5 = r8.has(r3)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            r6 = 1
            if (r5 == 0) goto L_0x009e
            org.json.JSONObject r3 = r8.getJSONObject(r3)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            boolean r5 = r3.has(r2)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            if (r5 == 0) goto L_0x0092
            java.lang.String r2 = r3.optString(r2)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            goto L_0x0093
        L_0x0092:
            r2 = r7
        L_0x0093:
            r13.f243045j = r2     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            boolean r2 = r3.has(r1)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            if (r2 == 0) goto L_0x009e
            r3.optInt(r1, r6)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
        L_0x009e:
            java.lang.String r1 = "net"
            org.json.JSONObject r1 = r8.getJSONObject(r1)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r2 = "ethernet_connected"
            boolean r1 = r1.optBoolean(r2, r11)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            r13.f243039d = r1     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            org.json.JSONObject r1 = r8.getJSONObject(r4)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r2 = "tos_accepted"
            boolean r1 = r1.optBoolean(r2, r11)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            r13.f243040e = r1     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            org.json.JSONObject r1 = r8.getJSONObject(r4)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r2 = "setup_state"
            int r1 = r1.optInt(r2, r11)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            r2 = 61
            if (r1 == r2) goto L_0x00c8
            r1 = 1
            goto L_0x00c9
        L_0x00c8:
            r1 = 0
        L_0x00c9:
            r13.f243041f = r1     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            org.json.JSONObject r1 = r8.getJSONObject(r4)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r2 = "ssid_suffix"
            java.lang.String r1 = r1.optString(r2)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r2 = "[0-9]*$"
            java.lang.String r1 = r1.replaceAll(r2, r0)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            int r2 = r1.length()     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            if (r2 != 0) goto L_0x00f2
            com.google.common.f.e r1 = com.google.android.apps.gsa.shared.p7045k.C89795ac.f243050a     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r2 = "SSID suffix not found."
            r3 = 10534(0x2926, float:1.4761E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            com.google.assistant.at.cf r1 = com.google.assistant.p3861at.C49875cf.UNKNOWN     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            goto L_0x0298
        L_0x00f2:
            int r2 = r1.hashCode()     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            switch(r2) {
                case 97: goto L_0x0264;
                case 98: goto L_0x0259;
                case 99: goto L_0x024e;
                case 100: goto L_0x0243;
                case 101: goto L_0x0238;
                case 102: goto L_0x022f;
                case 103: goto L_0x0224;
                case 104: goto L_0x0219;
                case 105: goto L_0x020e;
                case 106: goto L_0x0202;
                case 107: goto L_0x01f7;
                case 108: goto L_0x01eb;
                case 109: goto L_0x01df;
                case 110: goto L_0x01d4;
                case 111: goto L_0x01c9;
                case 112: goto L_0x01be;
                case 113: goto L_0x01b2;
                case 114: goto L_0x01a6;
                case 115: goto L_0x019a;
                case 116: goto L_0x018e;
                case 117: goto L_0x0182;
                case 118: goto L_0x0176;
                case 119: goto L_0x016a;
                default: goto L_0x00f9;
            }
        L_0x00f9:
            switch(r2) {
                case 3818: goto L_0x015f;
                case 119418: goto L_0x0153;
                case 119795: goto L_0x0147;
                case 119800: goto L_0x013b;
                case 119855: goto L_0x012f;
                case 119975: goto L_0x0124;
                case 119995: goto L_0x0119;
                default: goto L_0x00fc;
            }
        L_0x00fc:
            switch(r2) {
                case 119789: goto L_0x010d;
                case 119790: goto L_0x0101;
                default: goto L_0x00ff;
            }
        L_0x00ff:
            goto L_0x026f
        L_0x0101:
            java.lang.String r2 = "ync"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 15
            goto L_0x0270
        L_0x010d:
            java.lang.String r2 = "ynb"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 10
            goto L_0x0270
        L_0x0119:
            java.lang.String r2 = "ytv"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 1
            goto L_0x0270
        L_0x0124:
            java.lang.String r2 = "ytb"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 2
            goto L_0x0270
        L_0x012f:
            java.lang.String r2 = "ypf"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 30
            goto L_0x0270
        L_0x013b:
            java.lang.String r2 = "ynm"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 9
            goto L_0x0270
        L_0x0147:
            java.lang.String r2 = "ynh"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 31
            goto L_0x0270
        L_0x0153:
            java.lang.String r2 = "ybc"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 8
            goto L_0x0270
        L_0x015f:
            java.lang.String r2 = "xb"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 3
            goto L_0x0270
        L_0x016a:
            java.lang.String r2 = "w"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 14
            goto L_0x0270
        L_0x0176:
            java.lang.String r2 = "v"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 29
            goto L_0x0270
        L_0x0182:
            java.lang.String r2 = "u"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 13
            goto L_0x0270
        L_0x018e:
            java.lang.String r2 = "t"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 28
            goto L_0x0270
        L_0x019a:
            java.lang.String r2 = "s"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 12
            goto L_0x0270
        L_0x01a6:
            java.lang.String r2 = "r"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 27
            goto L_0x0270
        L_0x01b2:
            java.lang.String r2 = "q"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 11
            goto L_0x0270
        L_0x01be:
            java.lang.String r2 = "p"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 7
            goto L_0x0270
        L_0x01c9:
            java.lang.String r2 = "o"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 6
            goto L_0x0270
        L_0x01d4:
            java.lang.String r2 = "n"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 5
            goto L_0x0270
        L_0x01df:
            java.lang.String r2 = "m"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 26
            goto L_0x0270
        L_0x01eb:
            java.lang.String r2 = "l"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 25
            goto L_0x0270
        L_0x01f7:
            java.lang.String r2 = "k"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 4
            goto L_0x0270
        L_0x0202:
            java.lang.String r2 = "j"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 24
            goto L_0x0270
        L_0x020e:
            java.lang.String r2 = "i"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 23
            goto L_0x0270
        L_0x0219:
            java.lang.String r2 = "h"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 22
            goto L_0x0270
        L_0x0224:
            java.lang.String r2 = "g"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 21
            goto L_0x0270
        L_0x022f:
            java.lang.String r2 = "f"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            goto L_0x0270
        L_0x0238:
            java.lang.String r2 = "e"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 20
            goto L_0x0270
        L_0x0243:
            java.lang.String r2 = "d"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 19
            goto L_0x0270
        L_0x024e:
            java.lang.String r2 = "c"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 18
            goto L_0x0270
        L_0x0259:
            java.lang.String r2 = "b"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 17
            goto L_0x0270
        L_0x0264:
            java.lang.String r2 = "a"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x026f
            r11 = 16
            goto L_0x0270
        L_0x026f:
            r11 = -1
        L_0x0270:
            switch(r11) {
                case 0: goto L_0x0288;
                case 1: goto L_0x0288;
                case 2: goto L_0x0288;
                case 3: goto L_0x0288;
                case 4: goto L_0x0285;
                case 5: goto L_0x0285;
                case 6: goto L_0x0285;
                case 7: goto L_0x0285;
                case 8: goto L_0x0285;
                case 9: goto L_0x0285;
                case 10: goto L_0x0285;
                case 11: goto L_0x0282;
                case 12: goto L_0x027f;
                case 13: goto L_0x027c;
                case 14: goto L_0x027c;
                case 15: goto L_0x027c;
                case 16: goto L_0x0279;
                case 17: goto L_0x0279;
                case 18: goto L_0x0279;
                case 19: goto L_0x0279;
                case 20: goto L_0x0279;
                case 21: goto L_0x0279;
                case 22: goto L_0x0279;
                case 23: goto L_0x0279;
                case 24: goto L_0x0279;
                case 25: goto L_0x0279;
                case 26: goto L_0x0279;
                case 27: goto L_0x0279;
                case 28: goto L_0x0279;
                case 29: goto L_0x0279;
                case 30: goto L_0x0279;
                case 31: goto L_0x0276;
                default: goto L_0x0273;
            }
        L_0x0273:
            com.google.common.f.e r2 = com.google.android.apps.gsa.shared.p7045k.C89795ac.f243050a     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            goto L_0x028b
        L_0x0276:
            com.google.assistant.at.cf r1 = com.google.assistant.p3861at.C49875cf.TITAN     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            goto L_0x0298
        L_0x0279:
            com.google.assistant.at.cf r1 = com.google.assistant.p3861at.C49875cf.UNKNOWN     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            goto L_0x0298
        L_0x027c:
            com.google.assistant.at.cf r1 = com.google.assistant.p3861at.C49875cf.MANHATTAN     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            goto L_0x0298
        L_0x027f:
            com.google.assistant.at.cf r1 = com.google.assistant.p3861at.C49875cf.JASPER     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            goto L_0x0298
        L_0x0282:
            com.google.assistant.at.cf r1 = com.google.assistant.p3861at.C49875cf.ANDROID_THINGS_CUBE     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            goto L_0x0298
        L_0x0285:
            com.google.assistant.at.cf r1 = com.google.assistant.p3861at.C49875cf.CHIRP     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            goto L_0x0298
        L_0x0288:
            com.google.assistant.at.cf r1 = com.google.assistant.p3861at.C49875cf.ANDROID_TV     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            goto L_0x0298
        L_0x028b:
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r3 = "Invalid or unknown SSID suffix: %s"
            r4 = 10533(0x2925, float:1.476E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56389s(r3, r1)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            com.google.assistant.at.cf r1 = com.google.assistant.p3861at.C49875cf.UNKNOWN     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
        L_0x0298:
            r13.f243049n = r1     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r1 = "sign"
            org.json.JSONObject r1 = r8.getJSONObject(r1)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r2 = "certificate"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r2 = "(\n|-*BEGIN CERTIFICATE-*|-*END CERTIFICATE-*)"
            java.lang.String r0 = r1.replaceAll(r2, r0)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            r13.f243047l = r0     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            java.lang.String r0 = "version"
            int r0 = r8.optInt(r0)     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            r13.f243048m = r0     // Catch:{ JSONException -> 0x02c9, d -> 0x02ba, ak -> 0x02b8 }
            r7 = r13
            goto L_0x02d7
        L_0x02b8:
            r13 = move-exception
            goto L_0x02bb
        L_0x02ba:
            r13 = move-exception
        L_0x02bb:
            com.google.common.f.e r0 = com.google.android.apps.gsa.shared.p7045k.C89795ac.f243050a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Failure to connect to device."
            r2 = 10540(0x292c, float:1.477E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r13)).mo56372aa(r2)).mo56386p(r1)
            goto L_0x02d7
        L_0x02c9:
            r13 = move-exception
            com.google.common.f.e r0 = com.google.android.apps.gsa.shared.p7045k.C89795ac.f243050a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "JSON failure."
            r2 = 10539(0x292b, float:1.4768E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r13)).mo56372aa(r2)).mo56386p(r1)
        L_0x02d7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7045k.C89829y.mo17879a(java.lang.Object):java.lang.Object");
    }
}
