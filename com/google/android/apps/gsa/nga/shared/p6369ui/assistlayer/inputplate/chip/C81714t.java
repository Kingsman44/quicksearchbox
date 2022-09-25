package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.content.Context;
import android.support.p033v7.p040e.C0430l;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80589w;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80784fe;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82006n;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82007o;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82008p;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82010r;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82012t;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82013u;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.common.p4552o.p4566l.C60213m;
import com.google.common.p4552o.p4566l.C60214n;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.t */
/* compiled from: PG */
public final class C81714t extends C0640fb implements C81680af {

    /* renamed from: a */
    public C58485gu f223462a = C58485gu.m89845m();

    /* renamed from: b */
    public boolean f223463b = false;

    /* renamed from: c */
    public final Optional f223464c;

    /* renamed from: d */
    public C0430l f223465d;

    /* renamed from: e */
    private final LayoutInflater f223466e;

    /* renamed from: f */
    private final C81674a f223467f;

    /* renamed from: g */
    private final C81698d f223468g;

    /* renamed from: h */
    private final C81688an f223469h;

    /* renamed from: i */
    private final C82013u f223470i;

    public C81714t(C81674a aVar, C81698d dVar, C81688an anVar, Context context, Optional optional, C82013u uVar) {
        this.f223469h = anVar;
        this.f223466e = LayoutInflater.from(context).cloneInContext(context);
        this.f223467f = aVar;
        this.f223464c = optional;
        this.f223468g = dVar;
        this.f223470i = uVar;
    }

    /* renamed from: a */
    public final C28293k mo75233a(int i) {
        Optional ofNullable = Optional.ofNullable(((C80784fe) this.f223462a.get(i)).mo74603a());
        int intValue = ((Integer) ofNullable.map(C81707m.f223454a).orElse(0)).intValue();
        if (intValue == 0) {
            intValue = 39510;
        }
        C28292j jVar = new C28292j(intValue);
        jVar.mo33795i(5);
        C60213m mVar = (C60213m) C60214n.f162914g.createBuilder();
        mVar.copyOnWrite();
        C60214n nVar = (C60214n) mVar.instance;
        nVar.f162916a |= 1;
        nVar.f162917b = i;
        jVar.mo33793g((C60214n) mVar.build());
        ofNullable.ifPresent(new C81708n(jVar));
        C28293k e = C28293k.m52908e(jVar, new C28293k[0]);
        C28292j jVar2 = new C28292j(92675);
        aqp aqp = jVar2.f76974b;
        aqp.copyOnWrite();
        aqs aqs = (aqs) aqp.instance;
        aqs aqs2 = aqs.f159780k;
        aqs.f159782a |= 2;
        aqs.f159784c = i;
        return C28293k.m52908e(jVar2, e);
    }

    public final int getItemCount() {
        return this.f223462a.size();
    }

    public final int getItemViewType(int i) {
        C80589w a = ((C80784fe) this.f223462a.get(i)).mo74603a();
        if (a != null && a.f221227f) {
            return 2;
        }
        if (this.f223463b) {
            return TextUtils.isEmpty(((C80784fe) this.f223462a.get(i)).mo74609f()) ? 4 : 3;
        }
        return 1;
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        if (ghVar instanceof C81706l) {
            C81674a aVar = this.f223467f;
            C81698d dVar = this.f223468g;
            C81688an anVar = this.f223469h;
            ((C81706l) ghVar).f223453a.mo75229b((C80784fe) this.f223462a.get(i), aVar, dVar, anVar);
        } else if (ghVar instanceof C81693as) {
            C81693as asVar = (C81693as) ghVar;
            C81693as asVar2 = asVar;
            int i2 = i;
            asVar.f224195e.mo75449a(new C81692ar(asVar2, (C80784fe) this.f223462a.get(i), i2, this.f223467f, this.f223469h, this.f223468g));
        } else if (ghVar instanceof C81695au) {
            C81695au auVar = (C81695au) ghVar;
            C81695au auVar2 = auVar;
            int i3 = i;
            auVar.f224195e.mo75449a(new C81694at(auVar2, (C80784fe) this.f223462a.get(i), i3, this.f223467f, this.f223469h, this.f223468g));
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C81706l((C81705k) this.f223466e.inflate(R.layout.nga_assist_chip, viewGroup, false), this.f223464c);
        }
        if (i == 2) {
            return new C81685ak((C81705k) this.f223466e.inflate(R.layout.nga_assist_chip, viewGroup, false));
        }
        if (i == 3) {
            return C81693as.m129834a(viewGroup.getContext(), this.f223470i, this.f223464c.map(new C81710p(viewGroup)));
        }
        if (i == 4) {
            Context context = viewGroup.getContext();
            return new C81695au(new FrameLayout(context), this.f223470i, this.f223464c.map(new C81711q(viewGroup)));
        }
        throw new IllegalArgumentException("Unknown chip view type.");
    }

    public final void onViewAttachedToWindow(C0673gh ghVar) {
        if (ghVar instanceof C82010r) {
            C82012t tVar = ((C82010r) ghVar).f224195e;
            if (!tVar.f224202g && tVar.f224201f.isCancelled()) {
                tVar.f224201f = C83349aj.m132646a(tVar.f224199d.f224173g, C82006n.f224189a);
                tVar.f224199d.mo75445b(tVar.f224197b);
                new C90873ag(tVar.f224201f, tVar.f224198c, "onViewInflated", new C82007o(tVar)).mo85223a(C82008p.f224191a);
            }
        }
    }

    public final void onViewDetachedFromWindow(C0673gh ghVar) {
        if (ghVar instanceof C82010r) {
            ((C82010r) ghVar).f224195e.f224201f.cancel(false);
        }
    }
}
