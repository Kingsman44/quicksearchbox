package com.google.android.libraries.assistant.auto.tng.media.mediabrowser;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.s */
/* compiled from: PG */
public final class C14057s implements C47352j {

    /* renamed from: a */
    private static final C59071e f42688a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.media.mediabrowser.s");

    /* renamed from: b */
    private final C69464a f42689b;

    /* renamed from: c */
    private final Context f42690c;

    /* renamed from: d */
    private final PackageManager f42691d;

    public C14057s(Context context, PackageManager packageManager, C69464a aVar) {
        this.f42690c = context;
        this.f42691d = packageManager;
        this.f42689b = aVar;
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        ComponentName componentName = new ComponentName(this.f42690c.getPackageName(), "com.google.android.libraries.assistant.auto.tng.media.mediabrowser.NewsMediaBrowserService");
        int i = true != ((Boolean) this.f42689b.mo17428b()).booleanValue() ? 2 : 1;
        if (i == this.f42691d.getComponentEnabledSetting(componentName)) {
            return C60856cj.m92900i(true);
        }
        ((C59052c) ((C59052c) f42688a.mo56224b()).mo56372aa(45284)).mo56387q("Setting TNG News Media Browser to %d.", i);
        try {
            this.f42691d.setComponentEnabledSetting(componentName, i, 1);
            return C60856cj.m92900i(true);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f42688a.mo56226d()).mo56382g(e)).mo56372aa(45285)).mo56386p("Setting OpaMediaBrowser state failed.");
            return C60856cj.m92900i(false);
        }
    }
}
