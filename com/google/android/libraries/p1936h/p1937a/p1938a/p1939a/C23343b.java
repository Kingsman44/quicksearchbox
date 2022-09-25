package com.google.android.libraries.p1936h.p1937a.p1938a.p1939a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.libraries.h.a.a.a.b */
/* compiled from: PG */
public final class C23343b {

    /* renamed from: a */
    static final C58495hd f63875a;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("com.google.android.calendar", 133);
        gzVar.mo55429h("com.google.android.apps.classroom", 179);
        gzVar.mo55429h("com.google.android.googlequicksearchbox", 233);
        f63875a = gzVar.mo55427f(true);
    }

    /* renamed from: a */
    public static int m43780a(Context context) {
        return ((Integer) f63875a.getOrDefault(context.getPackageName(), 132)).intValue();
    }

    /* renamed from: b */
    public static Intent m43781b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.meetings"));
        return intent;
    }
}
