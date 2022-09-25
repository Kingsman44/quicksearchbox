package com.google.android.libraries.onegoogle.accountmenu.features.education;

import android.content.Context;
import android.content.res.Resources;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.accountmenu.features.C30635r;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30576c;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30577d;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30578e;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.EducationDatabase;
import com.google.android.libraries.onegoogle.tooltip.C31066b;
import com.google.android.libraries.onegoogle.tooltip.C31067c;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58800sl;
import com.google.protos.p4868ao.p4871b.p4872a.C63655i;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.s */
/* compiled from: PG */
public final class C30601s extends C30635r {

    /* renamed from: b */
    public final C58495hd f82666b;

    /* renamed from: c */
    public final C58528ij f82667c;

    /* renamed from: d */
    public final EducationDatabase f82668d;

    /* renamed from: e */
    public final C30578e f82669e;

    /* renamed from: f */
    public final Executor f82670f;

    /* renamed from: g */
    private final Resources f82671g;

    /* renamed from: h */
    private final int f82672h;

    public C30601s(Context context, int i, EducationDatabase educationDatabase, Executor executor, C58485gu guVar) {
        int i2;
        this.f82672h = i;
        this.f82668d = educationDatabase;
        this.f82669e = educationDatabase.mo36258A();
        this.f82670f = executor;
        C58480gp gpVar = new C58480gp(4);
        C58480gp gpVar2 = new C58480gp(4);
        C58490gz gzVar = new C58490gz(4);
        C58526ih ihVar = new C58526ih();
        this.f82671g = context.getResources();
        int i3 = ((C58724pq) guVar).f156474d;
        int i4 = 0;
        while (i4 < i3) {
            C30546a aVar = (C30546a) guVar.get(i4);
            int f = aVar.mo36211f();
            String a = C63655i.m96270a(f);
            if (f != 0) {
                gzVar.mo55429h(a, aVar);
                ihVar.mo55489i(aVar.mo36206a());
                gpVar.mo55395g(new C30576c(a));
                C58800sl lA = aVar.mo36206a().iterator();
                while (true) {
                    i2 = i4 + 1;
                    if (!lA.hasNext()) {
                        break;
                    }
                    gpVar2.mo55395g(new C30577d(a, this.f82671g.getResourceName(((Integer) lA.next()).intValue())));
                }
                i4 = i2;
            } else {
                throw null;
            }
        }
        this.f82666b = gzVar.mo55427f(true);
        this.f82667c = ihVar.mo55486f();
        executor.execute(new C30587e(this, educationDatabase, gpVar, gpVar2));
    }

    /* renamed from: a */
    public final void mo36285a(C2391v vVar, FragmentManager fragmentManager, C31067c cVar) {
        AccountParticleDisc accountParticleDisc = ((SelectedAccountDisc) cVar).f81902c;
        if (C31066b.m57973a(cVar)) {
            mo36290f(vVar, fragmentManager, cVar);
            return;
        }
        accountParticleDisc.getViewTreeObserver().addOnGlobalLayoutListener(new C30598p(this, cVar, accountParticleDisc, vVar, fragmentManager));
    }

    /* renamed from: b */
    public final void mo36286b(C2391v vVar, FragmentManager fragmentManager, C31067c cVar) {
        if (this.f82672h == 1) {
            mo36285a(vVar, fragmentManager, cVar);
        }
    }

    /* renamed from: c */
    public final void mo36287c(C2391v vVar, View view, int i) {
        if (this.f82667c.contains(Integer.valueOf(i))) {
            String resourceName = this.f82671g.getResourceName(i);
            C30600r rVar = new C30600r(this.f82670f, this.f82668d);
            rVar.mo5704e(vVar, new C30597o(this, rVar, vVar, resourceName, view));
        }
    }

    /* renamed from: d */
    public final void mo36288d(int i, boolean z) {
        this.f82670f.execute(new C30595m(this, i, z));
    }

    /* renamed from: e */
    public final void mo36289e(C30576c cVar) {
        if (cVar.f82602e == 0) {
            cVar.f82602e = System.currentTimeMillis();
        }
        this.f82668d.mo36258A().mo36271e(cVar);
    }

    /* renamed from: f */
    public final void mo36290f(C2391v vVar, FragmentManager fragmentManager, C31067c cVar) {
        C30600r rVar = new C30600r(this.f82670f, this.f82668d);
        C58838bb.m90884s(C31066b.m57973a(cVar), "Anchor is not visible on screen.");
        rVar.mo5704e(vVar, new C30590h(this, rVar, vVar, cVar, fragmentManager));
    }
}
