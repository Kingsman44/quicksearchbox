package com.google.android.apps.gsa.staticplugins.webview;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.d */
/* compiled from: PG */
final class C118193d {

    /* renamed from: a */
    private final C91097g f328126a;

    /* renamed from: b */
    private final Context f328127b;

    public C118193d(Context context, C91097g gVar) {
        this.f328127b = context;
        this.f328126a = gVar;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean directCall(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = r5.f328127b     // Catch:{ RuntimeException -> 0x0037 }
            java.lang.String r2 = "android.permission.CALL_PHONE"
            int r3 = android.os.Process.myPid()     // Catch:{ RuntimeException -> 0x0037 }
            int r4 = android.os.Process.myUid()     // Catch:{ RuntimeException -> 0x0037 }
            int r1 = r1.checkPermission(r2, r3, r4)     // Catch:{ RuntimeException -> 0x0037 }
            if (r1 != 0) goto L_0x0037
            android.content.Context r1 = r5.f328127b
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            if (r1 == 0) goto L_0x0037
            int r1 = r1.getPhoneType()
            if (r1 == 0) goto L_0x0037
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.CALL"
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r1.<init>(r2, r6)
            com.google.android.apps.gsa.shared.util.t.g r6 = r5.f328126a     // Catch:{  }
            r6.mo65089a(r1)     // Catch:{  }
            r6 = 1
            return r6
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.webview.C118193d.directCall(java.lang.String):boolean");
    }
}
