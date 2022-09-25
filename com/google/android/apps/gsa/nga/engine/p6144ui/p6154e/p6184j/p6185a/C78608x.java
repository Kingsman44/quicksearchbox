package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6184j.p6185a;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.j.a.x */
/* compiled from: PG */
final class C78608x implements C22868d {

    /* renamed from: a */
    final /* synthetic */ boolean f216412a;

    /* renamed from: b */
    final /* synthetic */ C78583aa f216413b;

    public C78608x(C78583aa aaVar, boolean z) {
        this.f216413b = aaVar;
        this.f216412a = z;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C89859i iVar = this.f216413b.f216353m;
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.ASSISTANT_AVS_SCREENSHOT_FAILED;
        iVar.mo74236a(fVar.mo83699a());
        this.f216413b.f216349i.mo73652b(C78583aa.f216343d);
        C59104x c = C78583aa.f216340a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AvsController");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(5220)).mo56386p("Failed to take screenshot");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C89859i iVar = this.f216413b.f216353m;
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.ASSISTANT_AVS_SCREENSHOT_SUCCEEDED;
        iVar.mo74236a(fVar.mo83699a());
        if (this.f216412a) {
            this.f216413b.f216349i.mo73652b(C78583aa.f216341b);
        }
    }
}
