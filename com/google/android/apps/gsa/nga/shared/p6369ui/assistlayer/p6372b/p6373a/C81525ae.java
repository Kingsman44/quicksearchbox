package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6372b.p6373a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.p091b.C1874w;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80696by;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.C81673b;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6371a.C81519a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81810c;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81819l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81984au;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81993bc;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82002j;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82003k;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82004l;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83352b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.nga.shared.p6417x.C83369s;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.animation.impl.C147783f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.p1879c.C22865a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.b.a.ae */
/* compiled from: PG */
public final class C81525ae implements C81810c, C81673b {

    /* renamed from: a */
    public static final C59071e f222944a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.b.a.ae");

    /* renamed from: b */
    public static final Duration f222945b = Duration.ofMillis(300);

    /* renamed from: c */
    public static final Duration f222946c = Duration.ofMillis(200);

    /* renamed from: d */
    public final FrameLayout f222947d;

    /* renamed from: e */
    public final C22871g f222948e;

    /* renamed from: f */
    public final C81564g f222949f;

    /* renamed from: g */
    public final C83363m f222950g;

    /* renamed from: h */
    public final C81993bc f222951h;

    /* renamed from: i */
    public final C82003k f222952i;

    /* renamed from: j */
    public C147785k f222953j;

    /* renamed from: k */
    public final int f222954k;

    /* renamed from: l */
    public final C83357g f222955l = new C83361k(Optional.empty(), C22865a.class);

    /* renamed from: m */
    public final C83357g f222956m = new C83361k(false, C81519a.class);

    /* renamed from: n */
    public final C83358h f222957n;

    /* renamed from: o */
    public final C83358h f222958o;

    /* renamed from: p */
    public final C83358h f222959p;

    /* renamed from: q */
    public final C147783f f222960q;

    /* renamed from: r */
    private final C22871g f222961r;

    /* renamed from: s */
    private final C83363m f222962s;

    /* renamed from: t */
    private Supplier f222963t;

    public C81525ae(Context context, C81993bc bcVar, C147783f fVar, C22871g gVar, C22871g gVar2, C82004l lVar, C81984au auVar, C81564g gVar3, C81819l lVar2) {
        this.f222951h = bcVar;
        this.f222960q = fVar;
        this.f222947d = new FrameLayout(context);
        this.f222952i = lVar.mo75447a(new C81531f(this), C82002j.m130248c("blueBar"));
        this.f222948e = gVar;
        this.f222961r = gVar2;
        this.f222949f = gVar3;
        this.f222950g = new C83363m();
        this.f222962s = new C83363m();
        C83358h k = C83349aj.m132656k(lVar2.mo75159l(), lVar2.mo75153f(), C81532g.f222978a);
        this.f222957n = k;
        this.f222958o = C83349aj.m132656k(k, auVar.mo75426a(R.string.nga_assist_refined_blue_bar_description), C81533h.f222979a);
        this.f222959p = C83349aj.m132655j(k, auVar.mo75426a(R.string.nga_assist_blue_bar_action_message), auVar.mo75426a(R.string.nga_assist_family_broadcast_blue_bar_action_message), C81534i.f222980a);
        this.f222954k = context.getResources().getDimensionPixelOffset(R.dimen.nga_assist_blue_bar_container_padding_top);
    }

    /* renamed from: a */
    public final View mo75126a() {
        return this.f222947d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Optional mo75127b() {
        return ((Optional) ((C83361k) this.f222952i.f224173g).f227199b.get()).map(C81544s.f222990a);
    }

    /* renamed from: c */
    public final void mo75128c() {
        this.f222962s.mo76663c(this.f222955l, new C83369s(this.f222948e, "blueBarBoldFontUpdate", new C81538m(this)));
        try {
            this.f222955l.mo76660b(Optional.ofNullable(C1874w.m5107d(this.f222947d.getContext(), R.font.google_sans_text_bold)));
        } catch (Resources.NotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f222944a.mo56226d()).mo56382g(e)).mo56372aa(6146)).mo56386p("Couldn't load bold font.");
        }
    }

    /* renamed from: d */
    public final void mo75129d() {
        this.f222961r.mo28212l("[NGA] BlueBarRenderer.loadBoldFont", new C81540o(this));
        this.f222950g.mo76663c(this.f222957n, new C81541p(this));
        this.f222950g.mo76663c(C83349aj.m132656k(this.f222952i.f224173g, this.f222956m, C81542q.f222988a), new C81543r(this));
        this.f222952i.mo75445b(this.f222947d);
    }

    /* renamed from: e */
    public final void mo75130e() {
        this.f222950g.mo76661a();
        this.f222962s.mo76661a();
        this.f222952i.mo75444a();
    }

    /* renamed from: f */
    public final void mo75131f(Supplier supplier) {
        if (this.f222963t != supplier) {
            this.f222963t = supplier;
            mo75133h(((C80696by) ((C83352b) this.f222957n).mo76654b()).mo74429c());
        }
    }

    /* renamed from: g */
    public final void mo75132g(Optional optional) {
        mo75127b().ifPresent(new C81547v(optional));
    }

    /* renamed from: h */
    public final void mo75133h(int i) {
        Supplier supplier = this.f222963t;
        if (supplier != null) {
            ((Optional) ((C83361k) this.f222952i.f224173g).f227199b.get()).map(C81549x.f222999a).ifPresent(new C81550y(this, i, supplier));
        }
    }
}
