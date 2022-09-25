package com.google.android.apps.search.transcription.p10670f.p10678g;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.transcription.p10668d.C141764a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.transcription.f.g.x */
/* compiled from: PG */
public final class C141911x {

    /* renamed from: a */
    public static final C59071e f385039a = C59071e.m91332i("com.google.android.apps.search.transcription.f.g.x");

    /* renamed from: b */
    public final Context f385040b;

    /* renamed from: c */
    public final C141764a f385041c;

    public C141911x(Context context, C141764a aVar) {
        this.f385040b = context;
        this.f385041c = aVar;
    }

    /* renamed from: a */
    public static int m230344a(Intent intent) {
        int intExtra = intent.getIntExtra("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS", 0);
        if (intExtra <= 10000) {
            return intExtra;
        }
        ((C59052c) ((C59052c) f385039a.mo56225c()).mo56372aa(41940)).mo56387q("EXTRA_SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS is too high (max is %d), capped to max", 10000);
        return 10000;
    }

    /* renamed from: b */
    public static int m230345b(Intent intent) {
        int intExtra = intent.getIntExtra("android.speech.extras.SPEECH_INPUT_MINIMUM_LENGTH_MILLIS", 0);
        if (intExtra <= 300000) {
            return intExtra;
        }
        ((C59052c) ((C59052c) f385039a.mo56225c()).mo56372aa(41941)).mo56386p("EXTRA_SPEECH_INPUT_MINIMUM_LENGTH_MILLIS is too high, ignored");
        return 0;
    }

    /* renamed from: d */
    private static String m230346d(String str, String str2) {
        int length = str.length() - str2.length();
        return (length >= 0 && str.regionMatches(length, str2, 0, str2.length())) ? str.substring(0, length) : str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo116879c(android.content.Intent r6, int r7) {
        /*
            r5 = this;
            android.content.Context r0 = r5.f385040b
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r0 = r0.getNameForUid(r7)
            java.lang.String r0 = com.google.common.base.C58837ba.m90858g(r0)
            java.lang.String r1 = "calling_package"
            java.lang.String r6 = r6.getStringExtra(r1)
            java.lang.String r6 = com.google.common.base.C58837ba.m90858g(r6)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0074
            boolean r1 = r0.isEmpty()
            java.lang.String r2 = "Trigger application overridden to %s"
            if (r1 == 0) goto L_0x0033
            com.google.common.f.e r0 = f385039a
            com.google.common.f.x r0 = r0.mo56224b()
            r1 = 41949(0xa3dd, float:5.8783E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r1)).mo56389s(r2, r6)
            goto L_0x005d
        L_0x0033:
            android.content.Context r1 = r5.f385040b     // Catch:{ SecurityException -> 0x0061 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ SecurityException -> 0x0061 }
            java.lang.String[] r1 = r1.getPackagesForUid(r7)     // Catch:{ SecurityException -> 0x0061 }
            if (r1 == 0) goto L_0x0074
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ SecurityException -> 0x0061 }
            boolean r1 = r1.contains(r6)     // Catch:{ SecurityException -> 0x0061 }
            if (r1 == 0) goto L_0x0074
            com.google.common.f.e r0 = f385039a     // Catch:{ SecurityException -> 0x005f }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ SecurityException -> 0x005f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ SecurityException -> 0x005f }
            r1 = 41947(0xa3db, float:5.878E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ SecurityException -> 0x005f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ SecurityException -> 0x005f }
            r0.mo56389s(r2, r6)     // Catch:{ SecurityException -> 0x005f }
        L_0x005d:
            r0 = r6
            goto L_0x0074
        L_0x005f:
            r0 = move-exception
            goto L_0x0065
        L_0x0061:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0065:
            com.google.common.f.e r1 = f385039a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Failed to validate against UID: %d"
            r3 = 41948(0xa3dc, float:5.8782E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56387q(r2, r7)
            goto L_0x005d
        L_0x0074:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = ":"
            r6.<init>(r1)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = m230346d(r0, r6)
            boolean r7 = r6.equals(r0)
            if (r7 == 0) goto L_0x008d
            return r0
        L_0x008d:
            java.lang.String r7 = ".uid"
            java.lang.String r6 = m230346d(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.transcription.p10670f.p10678g.C141911x.mo116879c(android.content.Intent, int):java.lang.String");
    }
}
