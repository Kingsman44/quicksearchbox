package com.google.android.apps.search.lens.p10547a;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.p1623at.p1632e.C19557e;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.search.lens.a.f */
/* compiled from: PG */
public final class C139921f {

    /* renamed from: a */
    public static final C58974d f380364a = C58974d.m91135i("LensEntryPoints");

    /* renamed from: b */
    private final Context f380365b;

    public C139921f(Context context) {
        this.f380365b = context;
    }

    /* renamed from: a */
    public final Intent mo115337a(Bundle bundle) {
        Intent intent = new Intent();
        String str = "com.google.android.apps.search.lens.standalone";
        if (!str.equals(this.f380365b.getPackageName()) && (!"userdebug".equals(Build.TYPE) || !C19557e.m37301c())) {
            str = "com.google.android.googlequicksearchbox";
        }
        intent.setClassName(str, "com.google.android.apps.search.lens.LensActivity");
        if (bundle != null && !bundle.getBoolean("clear_task_stack", true)) {
            intent.addFlags(C89885b.S3REQUEST_VALUE);
        } else {
            intent.addFlags(268435456);
            intent.addFlags(32768);
        }
        intent.putExtras(bundle);
        return intent;
    }

    /* renamed from: b */
    public final void mo115338b(Bundle bundle) {
        new C139920e(this.f380365b).mo115336a(mo115337a(bundle));
    }
}
