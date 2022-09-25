package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6383h;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6371a.C81519a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81560c;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81819l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81820m;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81827t;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.C81871a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6398p.C81955a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81984au;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81993bc;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.C82041a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window.C82144au;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window.C82156bf;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.animation.impl.C147779b;
import com.google.android.libraries.animation.impl.C147783f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.h.w */
/* compiled from: PG */
public final class C81656w implements C82144au {

    /* renamed from: a */
    public static final C59071e f223319a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.h.w");

    /* renamed from: b */
    public final ViewGroup f223320b;

    /* renamed from: c */
    public final C22871g f223321c;

    /* renamed from: d */
    public final C81955a f223322d;

    /* renamed from: e */
    public final C91142g f223323e;

    /* renamed from: f */
    public final C81564g f223324f;

    /* renamed from: g */
    public final C81984au f223325g;

    /* renamed from: h */
    public final C81993bc f223326h;

    /* renamed from: i */
    public final C81819l f223327i;

    /* renamed from: j */
    public final C81827t f223328j;

    /* renamed from: k */
    public final C83358h f223329k;

    /* renamed from: l */
    public final C83357g f223330l = new C83361k(C81820m.f223773b, C0826b.class);

    /* renamed from: m */
    public final C83357g f223331m;

    /* renamed from: n */
    public final C83357g f223332n;

    /* renamed from: o */
    public final C83357g f223333o;

    /* renamed from: p */
    public final C83358h f223334p;

    /* renamed from: q */
    public final C58485gu f223335q;

    /* renamed from: r */
    public final C83363m f223336r;

    /* renamed from: s */
    public final View f223337s;

    /* renamed from: t */
    public final Optional f223338t;

    /* renamed from: u */
    public final C147785k f223339u;

    /* renamed from: v */
    private final C22871g f223340v;

    /* renamed from: w */
    private final C58495hd f223341w;

    /* renamed from: x */
    private final C83358h f223342x;

    public C81656w(Context context, C22871g gVar, C22871g gVar2, C81819l lVar, C81827t tVar, Map map, Set set, C81955a aVar, C82041a aVar2, C81871a aVar3, C91142g gVar3, C81564g gVar4, C147783f fVar, Optional optional, C81984au auVar, C81993bc bcVar, C82156bf bfVar) {
        C83361k kVar = new C83361k(false, C0826b.class);
        this.f223331m = kVar;
        C83361k kVar2 = new C83361k(false, C81519a.class);
        this.f223332n = kVar2;
        this.f223333o = new C83361k(true, C0826b.class);
        this.f223336r = new C83363m();
        this.f223340v = gVar;
        this.f223321c = gVar2;
        this.f223341w = C58495hd.m89898l(map);
        this.f223322d = aVar;
        this.f223323e = gVar3;
        this.f223324f = gVar4;
        this.f223325g = auVar;
        this.f223326h = bcVar;
        this.f223327i = lVar;
        this.f223328j = tVar;
        this.f223338t = optional;
        this.f223329k = aVar2.mo75477b();
        Context context2 = context;
        LayoutInflater cloneInContext = LayoutInflater.from(context).cloneInContext(context);
        this.f223337s = (View) Objects.requireNonNull(cloneInContext.inflate(R.layout.nga_assist_touch_outside_view, (ViewGroup) null));
        ViewGroup viewGroup = (ViewGroup) Objects.requireNonNull(cloneInContext.inflate(R.layout.nga_assist_root_container, (ViewGroup) null));
        this.f223320b = viewGroup;
        Objects.requireNonNull(viewGroup);
        C147779b bVar = new C147779b(fVar, new C81635b(viewGroup));
        bVar.f398751e = true;
        bVar.f398748b = new C81636c(this);
        C147785k a = bVar.mo124453a();
        this.f223339u = a;
        a.mo124464f();
        a.mo124461c(1.0f);
        this.f223335q = C58485gu.m89842j(set);
        C83358h k = C83349aj.m132656k(aVar2.mo75477b(), aVar3.mo75379b(), C81637d.f223298a);
        this.f223334p = C83349aj.m132651f(lVar.mo75155h(), lVar.mo75156i(), lVar.mo75162o(), lVar.mo75160m(), lVar.mo75159l(), k, kVar2, C81642i.f223303a);
        this.f223342x = bfVar.mo75526a(kVar, C81560c.LEGACY_TACTILE_OR_PANTHERA_PLATE);
    }

    /* renamed from: a */
    public final View mo75217a() {
        return this.f223320b;
    }

    /* renamed from: b */
    public final C83358h mo75218b() {
        return this.f223342x;
    }

    /* renamed from: c */
    public final C83358h mo75219c() {
        return this.f223333o;
    }

    /* renamed from: d */
    public final C83358h mo75220d() {
        return this.f223330l;
    }

    /* renamed from: e */
    public final void mo75221e() {
        this.f223320b.removeAllViews();
        this.f223320b.addView(this.f223337s, -1, -1);
        Collection.EL.stream(this.f223341w.entrySet()).sorted(C81638e.f223299a).map(C81639f.f223300a).forEach(new C81640g(this));
        this.f223340v.mo28212l("[NGA] onAssistUiCreate", new C81641h(this));
    }

    /* renamed from: f */
    public final void mo75222f() {
        this.f223340v.mo28212l("[NGA] onAssistUiDestroy", new C81644k(this));
        this.f223330l.mo76660b(C81820m.f223773b);
        this.f223331m.mo76660b(false);
        this.f223328j.mo75171x(false);
        this.f223333o.mo76660b(true);
    }
}
