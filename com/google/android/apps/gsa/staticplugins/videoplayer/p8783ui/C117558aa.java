package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.monet.p7070b.p7082ah.C90215f;
import com.google.android.apps.gsa.shared.monet.p7113e.C90317a;
import com.google.android.apps.gsa.shared.monet.p7113e.C90318b;
import com.google.android.apps.gsa.shared.monet.p7114f.C90323a;
import com.google.android.apps.gsa.shared.monet.p7114f.C90324b;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91881e;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.C105022c;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.C105023d;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117553g;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.search.video.thirdparty.C41598ab;
import com.google.android.libraries.search.video.thirdparty.C41599ac;
import com.google.android.libraries.search.video.thirdparty.C41606h;
import com.google.android.libraries.search.video.thirdparty.C41607i;
import com.google.android.libraries.search.video.thirdparty.C41610l;
import com.google.android.libraries.search.video.thirdparty.C41611m;
import com.google.android.libraries.search.video.thirdparty.C41613o;
import com.google.android.libraries.search.video.thirdparty.C41617s;
import com.google.android.libraries.search.video.thirdparty.C41624y;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54782b;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54785e;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.aa */
/* compiled from: PG */
final class C117558aa extends C22939d implements C41606h {

    /* renamed from: a */
    public final C90318b f326321a;

    /* renamed from: b */
    public C90317a f326322b;

    /* renamed from: c */
    C91881e f326323c;

    /* renamed from: d */
    public C41607i f326324d;

    /* renamed from: e */
    private final C117553g f326325e;

    /* renamed from: f */
    private final Context f326326f;

    /* renamed from: g */
    private final C90323a f326327g;

    /* renamed from: h */
    private final C90324b f326328h = new C117604z(this);

    /* renamed from: i */
    private final Optional f326329i;

    /* renamed from: j */
    private FrameLayout f326330j;

    /* renamed from: k */
    private final C41611m f326331k;

    /* renamed from: l */
    private final C41613o f326332l;

    public C117558aa(C22945j jVar, C117553g gVar, Context context, Optional optional, C41613o oVar, C41611m mVar, C90318b bVar, C90323a aVar) {
        super(jVar);
        this.f326325e = gVar;
        this.f326326f = context;
        this.f326332l = oVar;
        this.f326331k = mVar;
        this.f326321a = bVar;
        this.f326327g = aVar;
        this.f326329i = optional;
    }

    /* renamed from: h */
    private final void m195408h() {
        C41607i iVar = this.f326324d;
        if (iVar != null) {
            iVar.mo44173G();
            this.f326324d = null;
        }
    }

    /* renamed from: e */
    public final void mo103370e() {
        C90317a aVar = this.f326322b;
        if (aVar != null) {
            this.f326321a.mo83999b(aVar);
            this.f326322b = null;
        }
    }

    /* renamed from: hW */
    public final void mo44142hW() {
        mo103370e();
    }

    /* renamed from: i */
    public final void mo44143i(int i) {
    }

    /* renamed from: im */
    public final void mo28298im() {
        mo103370e();
        m195408h();
        C91881e eVar = this.f326323c;
        if (eVar != null) {
            eVar.mo86419g(5);
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        TouchInterceptingFrameLayout touchInterceptingFrameLayout = new TouchInterceptingFrameLayout(this.f326326f);
        touchInterceptingFrameLayout.f253398a = new C117600v(this);
        mo28295iC(touchInterceptingFrameLayout);
        FrameLayout frameLayout = new FrameLayout(this.f326326f);
        this.f326330j = frameLayout;
        touchInterceptingFrameLayout.addView(frameLayout);
        this.f63126Q.mo28327o("PLAY", new C117601w(this));
        this.f63126Q.mo28327o("PAUSE", new C117602x(this));
        this.f326327g.mo84004a(this.f326328h);
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        int i;
        C90215f fVar = (C90215f) ((C117581c) this.f326325e).f326400a.f63720e;
        Context context = this.f326326f;
        C41598ab f = C41599ac.m72859f();
        f.mo44154b(true);
        int i2 = 0;
        f.mo44156d(false);
        f.mo44155c(false);
        C41617s a = C41624y.m72991a(context, f.mo44153a());
        float f2 = fVar.f252026d;
        int i3 = this.f326326f.getResources().getConfiguration().orientation;
        if (i3 == 2) {
            int i4 = fVar.f252027e;
            i = i4;
            i2 = (int) (((float) i4) * f2);
        } else if (i3 == 1 || i3 == 0) {
            i2 = fVar.f252028f;
            i = (int) (((float) i2) / f2);
        } else {
            i = 0;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i);
        layoutParams.gravity = 17;
        this.f326330j.setLayoutParams(layoutParams);
        a.mo44184d(f2);
        a.mo44182b(this.f326330j);
        C41607i a2 = this.f326331k.mo44179a(this.f326332l, a);
        this.f326324d = a2;
        ((C41610l) a2).mo44169C(this.f326326f, fVar.f252025c, Optional.empty(), Optional.empty());
        a.mo44181a(this.f326324d);
        this.f326324d.mo44168B(this);
        if (this.f326329i.isPresent() && (fVar.f252023a & 64) != 0) {
            C105023d dVar = (C105023d) this.f326329i.get();
            int a3 = C54782b.m87527a(fVar.f252030h);
            int i5 = a3 == 0 ? 1 : a3;
            String str = fVar.f252025c;
            C54785e eVar = fVar.f252029g;
            if (eVar == null) {
                eVar = C54785e.f143724d;
            }
            C91881e a4 = dVar.mo94478a(0, i5, (String) null, str, 3, false, Optional.m71637of(eVar), Optional.empty());
            C41607i iVar = this.f326324d;
            iVar.getClass();
            Objects.requireNonNull(iVar);
            ((C105022c) a4).f292642b = Optional.m71637of(new C117603y(iVar));
            this.f326323c = a4;
            C41607i iVar2 = this.f326324d;
            iVar2.getClass();
            iVar2.mo44168B(a4);
        }
    }

    /* renamed from: j */
    public final void mo44144j(int i) {
    }

    /* renamed from: js */
    public final void mo28301js() {
        mo103370e();
        m195408h();
        this.f326327g.mo84005b(this.f326328h);
    }

    /* renamed from: k */
    public final void mo44145k(int i, C41607i iVar) {
    }
}
