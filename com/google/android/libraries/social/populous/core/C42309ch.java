package com.google.android.libraries.social.populous.core;

import com.google.p4181bi.C55794ad;
import com.google.p4181bi.C55846h;
import com.google.p4181bi.C55847i;

/* renamed from: com.google.android.libraries.social.populous.core.ch */
/* compiled from: PG */
public enum C42309ch {
    OBJECT_TYPE_UNSPECIFIED,
    PERSON,
    GROUP,
    CUSTOM,
    CHAT_GROUP,
    CHAT_ROOM,
    CHAT_UNNAMED_ROOM,
    CHAT_CLASSIC_NAMED_ROOM,
    CHAT_CLASSIC_UNNAMED_ROOM;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.libraries.social.populous.core.C42309ch m74492a(java.lang.String r1) {
        /*
            if (r1 != 0) goto L_0x0005
            com.google.android.libraries.social.populous.core.ch r1 = GROUP
            return r1
        L_0x0005:
            int r0 = r1.hashCode()
            switch(r0) {
                case -1610205135: goto L_0x0053;
                case -510864508: goto L_0x0049;
                case -441194837: goto L_0x003f;
                case 2067288: goto L_0x0035;
                case 2521307: goto L_0x002b;
                case 245928600: goto L_0x0021;
                case 1289018985: goto L_0x0017;
                case 2052758725: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x005d
        L_0x000d:
            java.lang.String r0 = "DYNAMITE_ROOM"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x005d
            r1 = 3
            goto L_0x005e
        L_0x0017:
            java.lang.String r0 = "GROUP_DM"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x005d
            r1 = 1
            goto L_0x005e
        L_0x0021:
            java.lang.String r0 = "DYNAMITE_CLASSIC_NAMED_ROOM"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x005d
            r1 = 6
            goto L_0x005e
        L_0x002b:
            java.lang.String r0 = "ROOM"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x005d
            r1 = 2
            goto L_0x005e
        L_0x0035:
            java.lang.String r0 = "CHAT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x005d
            r1 = 0
            goto L_0x005e
        L_0x003f:
            java.lang.String r0 = "DYNAMITE_NAMED_ROOM"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x005d
            r1 = 4
            goto L_0x005e
        L_0x0049:
            java.lang.String r0 = "DYNAMITE_UNNAMED_ROOM"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x005d
            r1 = 5
            goto L_0x005e
        L_0x0053:
            java.lang.String r0 = "DYNAMITE_CLASSIC_UNNAMED_ROOM"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x005d
            r1 = 7
            goto L_0x005e
        L_0x005d:
            r1 = -1
        L_0x005e:
            switch(r1) {
                case 0: goto L_0x0070;
                case 1: goto L_0x0070;
                case 2: goto L_0x006d;
                case 3: goto L_0x006d;
                case 4: goto L_0x006d;
                case 5: goto L_0x006a;
                case 6: goto L_0x0067;
                case 7: goto L_0x0064;
                default: goto L_0x0061;
            }
        L_0x0061:
            com.google.android.libraries.social.populous.core.ch r1 = GROUP
            return r1
        L_0x0064:
            com.google.android.libraries.social.populous.core.ch r1 = CHAT_CLASSIC_UNNAMED_ROOM
            return r1
        L_0x0067:
            com.google.android.libraries.social.populous.core.ch r1 = CHAT_CLASSIC_NAMED_ROOM
            return r1
        L_0x006a:
            com.google.android.libraries.social.populous.core.ch r1 = CHAT_UNNAMED_ROOM
            return r1
        L_0x006d:
            com.google.android.libraries.social.populous.core.ch r1 = CHAT_ROOM
            return r1
        L_0x0070:
            com.google.android.libraries.social.populous.core.ch r1 = CHAT_GROUP
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.C42309ch.m74492a(java.lang.String):com.google.android.libraries.social.populous.core.ch");
    }

    /* renamed from: c */
    public static C42309ch m74494c(String str) {
        return (C42309ch) Enum.valueOf(C42309ch.class, str);
    }

    /* renamed from: b */
    public static C42309ch m74493b(C55847i iVar) {
        C55794ad adVar;
        int i = iVar.f147360a;
        int a = C55846h.m87793a(i);
        int i2 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i2 == 0) {
            return PERSON;
        } else {
            if (i2 != 1) {
                return OBJECT_TYPE_UNSPECIFIED;
            }
            if (i == 2) {
                adVar = (C55794ad) iVar.f147361b;
            } else {
                adVar = C55794ad.f147223g;
            }
            return m74492a(adVar.f147230f);
        }
    }
}
