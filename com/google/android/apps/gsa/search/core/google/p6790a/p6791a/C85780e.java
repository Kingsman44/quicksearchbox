package com.google.android.apps.gsa.search.core.google.p6790a.p6791a;

import com.google.android.gms.common.moduleinstall.C143960a;
import com.google.android.gms.common.moduleinstall.C143962c;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.a.e */
/* compiled from: PG */
final class C85780e implements C143960a {

    /* renamed from: a */
    final /* synthetic */ C85781f f231931a;

    /* renamed from: b */
    private final C143962c f231932b;

    public C85780e(C85781f fVar, C143962c cVar) {
        this.f231931a = fVar;
        this.f231932b = cVar;
    }

    /* renamed from: a */
    public final void mo79440a(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        switch (moduleInstallStatusUpdate.f390190b) {
            case 1:
                ((C59052c) ((C59052c) C85781f.f231933a.mo56224b()).mo56372aa(7998)).mo56386p("Install pending");
                return;
            case 2:
                ((C59052c) ((C59052c) C85781f.f231933a.mo56224b()).mo56372aa(7999)).mo56386p("Downloading...");
                return;
            case 3:
                ((C59052c) ((C59052c) C85781f.f231933a.mo56224b()).mo56372aa(8000)).mo56387q("Download cancelled. Error code: %s", moduleInstallStatusUpdate.f390193e);
                this.f231931a.f231935c.set(false);
                this.f231932b.mo119495c(this);
                return;
            case 4:
                ((C59052c) ((C59052c) C85781f.f231933a.mo56224b()).mo56372aa(8001)).mo56386p("Install completed successfully");
                this.f231931a.f231935c.set(false);
                this.f231932b.mo119495c(this);
                return;
            case 5:
                ((C59052c) ((C59052c) C85781f.f231933a.mo56224b()).mo56372aa(8002)).mo56387q("Module Install failed. Error code: %s", moduleInstallStatusUpdate.f390193e);
                this.f231931a.f231935c.set(false);
                this.f231932b.mo119495c(this);
                return;
            case 6:
                ((C59052c) ((C59052c) C85781f.f231933a.mo56224b()).mo56372aa(8003)).mo56386p("Download completed, installing.");
                return;
            default:
                ((C59052c) ((C59052c) C85781f.f231933a.mo56224b()).mo56372aa(7997)).mo56387q("Unknown install state: %s", moduleInstallStatusUpdate.f390190b);
                this.f231931a.f231935c.set(false);
                return;
        }
    }
}
