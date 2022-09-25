package com.google.android.apps.gsa.staticplugins.p7391an.p7397e;

import android.widget.ImageView;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.shared.search.doodle.C90496b;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.e.e */
/* compiled from: PG */
public final class C94006e implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C94009h f262555a;

    public C94006e(C94009h hVar) {
        this.f262555a = hVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C94009h.f262558a.mo56225c()).mo56382g(th)).mo56372aa(19371)).mo56386p("Failed to decode GIF");
        this.f262555a.mo88282e();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            this.f262555a.mo88282e();
            return;
        }
        C94007f fVar = (C94007f) axVar.mo56107c();
        C94009h hVar = this.f262555a;
        hVar.f262574q = fVar;
        hVar.f262571n = hVar.f262566i ? hVar.f262559b.f252924E : hVar.f262559b.f252948n;
        hVar.f262568k = new WebImageView(hVar.f262561d);
        this.f262555a.f262568k.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C94009h hVar2 = this.f262555a;
        hVar2.f262568k.setContentDescription(hVar2.f262559b.f252939e);
        C94009h hVar3 = this.f262555a;
        hVar3.f262570m = hVar3.mo88280c(hVar3.f262568k);
        this.f262555a.f262568k.setBackgroundColor(0);
        this.f262555a.f262568k.setImageDrawable(fVar.f262556a);
        C94009h hVar4 = this.f262555a;
        hVar4.f262569l = true;
        C90496b.m147523c(hVar4.f262570m, hVar4.f262559b);
        this.f262555a.mo88284g(fVar.f262556a);
        if (this.f262555a.f262572o) {
            fVar.mo88276a();
        } else {
            fVar.mo88277b();
        }
        C94009h hVar5 = this.f262555a;
        hVar5.f262560c.mo88297h(hVar5.f262570m, hVar5.mo88279b());
    }
}
