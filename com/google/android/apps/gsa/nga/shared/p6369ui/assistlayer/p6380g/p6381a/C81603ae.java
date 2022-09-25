package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6380g.p6381a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.gsa.nga.api.a.bc;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80708cj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80710cl;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81569l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81810c;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81819l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81824q;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81979ap;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81980aq;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81993bc;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82002j;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82003k;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82004l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.C82044d;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6406c.C82195b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83352b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.nga.shared.p6417x.C83369s;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.libraries.animation.C147774g;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.animation.impl.C147779b;
import com.google.android.libraries.animation.impl.C147783f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.g.a.ae */
/* compiled from: PG */
public final class C81603ae implements C81810c, C81824q, C82044d {

    /* renamed from: a */
    public static final C59071e f223221a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.g.a.ae");

    /* renamed from: b */
    public static final Duration f223222b = Duration.ofMillis(300);

    /* renamed from: c */
    public static final Duration f223223c = Duration.ofMillis(200);

    /* renamed from: d */
    public final FrameLayout f223224d;

    /* renamed from: e */
    public final C22871g f223225e;

    /* renamed from: f */
    public final C22871g f223226f;

    /* renamed from: g */
    public final C81819l f223227g;

    /* renamed from: h */
    public final C83363m f223228h;

    /* renamed from: i */
    public final C81564g f223229i;

    /* renamed from: j */
    public final C81993bc f223230j;

    /* renamed from: k */
    public float f223231k;

    /* renamed from: l */
    public final C81979ap f223232l;

    /* renamed from: m */
    public final Optional f223233m;

    /* renamed from: n */
    public final C104149a f223234n;

    /* renamed from: o */
    private final C83358h f223235o;

    /* renamed from: p */
    private final C82003k f223236p;

    /* renamed from: q */
    private final C82003k f223237q;

    /* renamed from: r */
    private C147785k f223238r;

    /* renamed from: s */
    private C147785k f223239s;

    /* renamed from: t */
    private final C147783f f223240t;

    public C81603ae(Context context, C81993bc bcVar, C22871g gVar, C22871g gVar2, C82195b bVar, C147783f fVar, C81819l lVar, C104149a aVar, C81564g gVar3, C81569l lVar2, C82004l lVar3, Optional optional) {
        bc bcVar2;
        this.f223230j = bcVar;
        this.f223224d = new FrameLayout(context);
        this.f223225e = gVar2;
        this.f223233m = optional;
        bVar.mo75537a(context);
        this.f223240t = fVar;
        this.f223234n = aVar;
        this.f223229i = gVar3;
        this.f223236p = lVar3.mo75447a(new C81628y(this), C82002j.m130247b("rightIcon"));
        if (((Boolean) ((C83352b) lVar2.f223143k).mo76654b()).booleanValue()) {
            bcVar2 = bc.c;
        } else {
            bcVar2 = bc.b;
        }
        this.f223237q = lVar3.mo75447a(new C81629z(this, bcVar2), C82002j.m130247b("leftIcon"));
        this.f223226f = gVar;
        this.f223227g = lVar;
        this.f223228h = new C83363m();
        this.f223232l = C81980aq.m130228a(context);
        this.f223235o = C83349aj.m132655j(lVar.mo75150c(), lVar.mo75168u(), lVar2.f223138f, C81599aa.f223215a);
    }

    /* renamed from: i */
    public static void m129745i(ViewGroup viewGroup, View view, int i) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(view);
        }
        if (i >= viewGroup.getChildCount()) {
            viewGroup.addView(view);
        } else {
            viewGroup.addView(view, i);
        }
    }

    /* renamed from: j */
    public static void m129746j(C147785k kVar, float f, Duration duration) {
        if (duration.isZero()) {
            kVar.mo124464f();
            kVar.mo124461c(f);
            return;
        }
        kVar.mo124460b(f, duration);
    }

    /* renamed from: b */
    public final C147785k mo75202b(ImageView imageView) {
        if (this.f223239s == null) {
            C147783f fVar = this.f223240t;
            Objects.requireNonNull(imageView);
            this.f223239s = new C147779b(fVar, C147774g.m240858a(new C81614k(imageView), new C81616m(imageView))).mo124453a();
        }
        return this.f223239s;
    }

    /* renamed from: c */
    public final C147785k mo75203c(View view) {
        if (this.f223238r == null) {
            C147783f fVar = this.f223240t;
            Objects.requireNonNull(view);
            this.f223238r = new C147779b(fVar, C147774g.m240858a(new C81626w(view), new C81627x(view))).mo124453a();
        }
        return this.f223238r;
    }

    /* renamed from: d */
    public final void mo75129d() {
        this.f223228h.mo76663c(this.f223236p.f224173g, new C81609f(this));
        this.f223228h.mo76663c(this.f223237q.f224173g, new C81610g(this));
        this.f223228h.mo76663c(this.f223235o, new C83369s(this.f223226f, "layoutConfig", new C81611h(this)));
        this.f223236p.mo75445b(this.f223224d);
        this.f223237q.mo75445b(this.f223224d);
    }

    /* renamed from: e */
    public final void mo75130e() {
        this.f223228h.mo76661a();
        this.f223236p.mo75444a();
        this.f223237q.mo75444a();
    }

    /* renamed from: f */
    public final Duration mo75204f(Duration duration) {
        if (!((C80710cl) this.f223227g.mo75156i().mo76657c()).mo74471b().equals(C80708cj.GONE)) {
            return duration;
        }
        return Duration.ZERO;
    }

    /* renamed from: g */
    public final Optional mo75205g() {
        return (Optional) ((C83361k) this.f223236p.f224173g).f227199b.get();
    }

    /* renamed from: h */
    public final Optional mo75206h() {
        return (Optional) ((C83361k) this.f223237q.f224173g).f227199b.get();
    }

    /* renamed from: k */
    public final void mo75207k() {
        mo75205g().ifPresent(new C81624u(this));
        mo75206h().ifPresent(new C81625v(this));
    }

    /* renamed from: l */
    public final void mo75208l(float f) {
        this.f223231k = f;
        mo75207k();
    }

    /* renamed from: m */
    public final View mo75209m() {
        return this.f223224d;
    }
}
