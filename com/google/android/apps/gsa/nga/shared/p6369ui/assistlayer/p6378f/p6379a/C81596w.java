package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6378f.p6379a;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80734di;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6371a.C81519a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6375d.C81553a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81810c;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81819l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81822o;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81993bc;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82002j;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82003k;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82004l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.C82043c;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.animation.C147774g;
import com.google.android.libraries.animation.impl.C147779b;
import com.google.android.libraries.animation.impl.C147783f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.f.a.w */
/* compiled from: PG */
public final class C81596w implements C82043c, C81822o, C81810c {

    /* renamed from: a */
    public static final C59071e f223185a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.f.a.w");

    /* renamed from: b */
    public static final Duration f223186b = Duration.ofMillis(200);

    /* renamed from: o */
    private static final Duration f223187o = Duration.ofMillis(300);

    /* renamed from: c */
    public final FrameLayout f223188c;

    /* renamed from: d */
    public final C22871g f223189d;

    /* renamed from: e */
    public final C81564g f223190e;

    /* renamed from: f */
    public final C81819l f223191f;

    /* renamed from: g */
    public final C83363m f223192g;

    /* renamed from: h */
    public final C81993bc f223193h;

    /* renamed from: i */
    public final Optional f223194i;

    /* renamed from: j */
    public final Context f223195j;

    /* renamed from: k */
    public final C81553a f223196k;

    /* renamed from: l */
    public final C81515c f223197l;

    /* renamed from: m */
    public final C91142g f223198m;

    /* renamed from: n */
    public final C83357g f223199n = new C83361k(false, C81519a.class);

    /* renamed from: p */
    private final C82003k f223200p;

    /* renamed from: q */
    private Supplier f223201q;

    /* renamed from: r */
    private final C147783f f223202r;

    public C81596w(Context context, C81993bc bcVar, C147783f fVar, C22871g gVar, C81553a aVar, C82004l lVar, C81564g gVar2, Optional optional, C81515c cVar, C91142g gVar3, C81819l lVar2) {
        this.f223193h = bcVar;
        this.f223202r = fVar;
        this.f223200p = lVar.mo75447a(C81591r.f223179a, C82002j.m130247b("heroChip"));
        this.f223188c = new FrameLayout(context);
        this.f223189d = gVar;
        this.f223194i = optional;
        this.f223195j = context;
        this.f223197l = cVar;
        this.f223196k = aVar;
        this.f223190e = gVar2;
        this.f223191f = lVar2;
        this.f223198m = gVar3;
        this.f223192g = new C83363m();
    }

    /* renamed from: g */
    public static void m129730g(C80734di diVar, C81594u uVar) {
        boolean g = diVar.mo74636g();
        if (g) {
            ((C81574a) uVar).f223147b.mo124460b(1.0f, f223187o);
        } else {
            ((C81574a) uVar).f223147b.mo124460b(0.0f, f223186b);
        }
        ((C81574a) uVar).f223146a.setEnabled(g);
    }

    /* renamed from: h */
    public static void m129731h(TextView textView) {
        textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    /* renamed from: a */
    public final RectF mo75196a() {
        return (RectF) mo75199f().map(C81589p.f223177a).orElse(new RectF());
    }

    /* renamed from: b */
    public final View mo75197b() {
        return this.f223188c;
    }

    /* renamed from: c */
    public final C81594u mo75198c(View view, String str) {
        C147783f fVar = this.f223202r;
        Objects.requireNonNull(view);
        return new C81574a(view, new C147779b(fVar, C147774g.m240858a(new C81592s(view), new C81576c(view))).mo124453a(), str);
    }

    /* renamed from: d */
    public final void mo75129d() {
        this.f223192g.mo76663c(this.f223191f.mo75158k(), new C81578e(this));
        this.f223192g.mo76663c(C83349aj.m132656k(this.f223200p.f224173g, this.f223199n, C81579f.f223157a), new C81580g(this));
        this.f223200p.mo75445b(this.f223188c);
    }

    /* renamed from: e */
    public final void mo75130e() {
        this.f223192g.mo76661a();
        this.f223200p.mo75444a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Optional mo75199f() {
        return ((Optional) ((C83361k) this.f223200p.f224173g).f227199b.get()).map(C81581h.f223159a);
    }

    /* renamed from: i */
    public final void mo75200i(Supplier supplier) {
        if (this.f223201q != supplier) {
            this.f223201q = supplier;
            mo75201j(((C80734di) this.f223191f.mo75158k().mo76657c()).mo74542e());
        }
    }

    /* renamed from: j */
    public final void mo75201j(int i) {
        Supplier supplier = this.f223201q;
        if (supplier != null) {
            mo75199f().ifPresent(new C81577d(this, i, supplier));
        }
    }
}
