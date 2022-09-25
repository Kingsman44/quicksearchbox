package com.google.android.apps.gsa.staticplugins.mediabrowser;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.mediabrowser.c */
/* compiled from: PG */
public final class C102695c implements C86091a {

    /* renamed from: a */
    private static final C59071e f286657a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.mediabrowser.c");

    /* renamed from: b */
    private final Context f286658b;

    /* renamed from: c */
    private final C68214a f286659c;

    public C102695c(Context context, C68214a aVar) {
        this.f286658b = context;
        this.f286659c = aVar;
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        ComponentName componentName = new ComponentName(this.f286658b.getPackageName(), "com.google.android.apps.gsa.staticplugins.mediabrowser.OpaMediaBrowserService");
        int i = true != ((C86124t) this.f286659c.mo27525b()).mo79746e(C90086ek.f250440dF) ? 2 : 1;
        PackageManager packageManager = this.f286658b.getPackageManager();
        if (i != packageManager.getComponentEnabledSetting(componentName)) {
            ((C59052c) ((C59052c) f286657a.mo56224b()).mo56372aa(20942)).mo56387q("Setting OMP browser to %d.", i);
            try {
                packageManager.setComponentEnabledSetting(componentName, i, 1);
            } catch (RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) f286657a.mo56226d()).mo56382g(e)).mo56372aa(20943)).mo56386p("Setting OpaMediaBrowser state failed.");
            }
        }
    }
}
