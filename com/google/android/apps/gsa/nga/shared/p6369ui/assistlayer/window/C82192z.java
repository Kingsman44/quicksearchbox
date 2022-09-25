package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Region;
import android.service.voice.VoiceInteractionSession;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.annotation.C0826b;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80832ak;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80833al;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80855bg;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80856bh;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.lockscreen.C81845a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.lockscreen.impl.C81865t;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.lockscreen.impl.C81866u;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81558a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81559b;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81561d;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81566i;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81569l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81809b;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81819l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81820m;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81827t;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6389l.p6390a.C81843a;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83352b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83356f;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.C130125a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5294a.C68221g;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.z */
/* compiled from: PG */
public final class C82192z implements C82123a, C81558a {

    /* renamed from: a */
    static final Duration f224624a = Duration.ofMillis(100);

    /* renamed from: b */
    public static final C59071e f224625b = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.z");

    /* renamed from: u */
    private static final Duration f224626u = Duration.ofMillis(500);

    /* renamed from: A */
    private final Optional f224627A;

    /* renamed from: B */
    private Optional f224628B;

    /* renamed from: C */
    private final C81843a f224629C;

    /* renamed from: c */
    public final C83357g f224630c = new C83361k(C81809b.f223743a, C0826b.class);

    /* renamed from: d */
    public final C83358h f224631d;

    /* renamed from: e */
    public final C83356f f224632e;

    /* renamed from: f */
    public final TouchInterceptingFrameLayout f224633f;

    /* renamed from: g */
    public final Context f224634g;

    /* renamed from: h */
    public final C81559b f224635h;

    /* renamed from: i */
    public final C81566i f224636i;

    /* renamed from: j */
    public final C82167bq f224637j;

    /* renamed from: k */
    public final C22871g f224638k;

    /* renamed from: l */
    public final C130125a f224639l;

    /* renamed from: m */
    public final C82144au f224640m;

    /* renamed from: n */
    public final C82144au f224641n;

    /* renamed from: o */
    public final C82156bf f224642o;

    /* renamed from: p */
    public final C81827t f224643p;

    /* renamed from: q */
    public final C83363m f224644q;

    /* renamed from: r */
    public final Queue f224645r;

    /* renamed from: s */
    public final C81845a f224646s;

    /* renamed from: t */
    public final C104149a f224647t;

    /* renamed from: v */
    private final C83357g f224648v;

    /* renamed from: w */
    private final C83357g f224649w;

    /* renamed from: x */
    private final C83358h f224650x;

    /* renamed from: y */
    private final C81564g f224651y;

    /* renamed from: z */
    private final C83363m f224652z;

    public C82192z(Context context, C81559b bVar, C81566i iVar, C82167bq bqVar, C22871g gVar, C81843a aVar, C104149a aVar2, C130125a aVar3, Optional optional, C82144au auVar, C82144au auVar2, C82156bf bfVar, C81827t tVar, C81866u uVar, C83358h hVar, C81564g gVar2) {
        C81866u uVar2 = uVar;
        C83361k kVar = new C83361k(false, C0826b.class);
        this.f224648v = kVar;
        C83361k kVar2 = new C83361k(false, C0826b.class);
        this.f224649w = kVar2;
        this.f224652z = new C83363m();
        this.f224644q = new C83363m();
        this.f224645r = new ArrayDeque();
        this.f224628B = Optional.empty();
        this.f224634g = context;
        this.f224647t = aVar2;
        this.f224627A = optional;
        this.f224635h = bVar;
        this.f224636i = iVar;
        this.f224637j = bqVar;
        this.f224638k = gVar;
        TouchInterceptingFrameLayout touchInterceptingFrameLayout = new TouchInterceptingFrameLayout(context);
        this.f224633f = touchInterceptingFrameLayout;
        this.f224629C = aVar;
        this.f224639l = aVar3;
        this.f224640m = auVar;
        this.f224641n = auVar2;
        this.f224642o = bfVar;
        this.f224643p = tVar;
        this.f224651y = gVar2;
        touchInterceptingFrameLayout.f253399b = new C82189w(this);
        Context context2 = (Context) ((C68221g) uVar2.f223872a).f184583a;
        context2.getClass();
        C22871g gVar3 = (C22871g) ((C68221g) uVar2.f223873b).f184583a;
        gVar3.getClass();
        C22871g gVar4 = (C22871g) ((C68221g) uVar2.f223874c).f184583a;
        gVar4.getClass();
        C81819l lVar = (C81819l) ((C68221g) uVar2.f223875d).f184583a;
        lVar.getClass();
        C81843a aVar4 = (C81843a) uVar2.f223876e.mo17428b();
        aVar4.getClass();
        C81569l lVar2 = (C81569l) ((C68221g) uVar2.f223877f).f184583a;
        lVar2.getClass();
        this.f224646s = new C81865t(this, context2, gVar3, gVar4, lVar, aVar4, lVar2);
        this.f224650x = C83349aj.m132656k(kVar2, kVar, C82190x.f224622a);
        this.f224631d = C83349aj.m132655j(auVar.mo75218b(), auVar2.mo75218b(), hVar, C82191y.f224623a);
        this.f224632e = new C83356f(Optional.empty(), C0826b.class);
    }

    /* renamed from: a */
    public final void mo75138a(C81561d dVar) {
        C82155be beVar = (C82155be) this.f224642o.f224574b.get(dVar.mo75147a());
        if (beVar == null) {
            return;
        }
        if (!((C82154bd) ((C83361k) beVar.f224570g).f227199b.get()).equals(C82154bd.DISABLED)) {
            ((C83361k) beVar.f224570g).f227199b.get();
            return;
        }
        ((C59052c) ((C59052c) C82156bf.f224573a.mo56224b()).mo56372aa(6508)).mo56389s("request to enable client %s", beVar.f224566c);
        beVar.f224571h.cancel(false);
        beVar.f224570g.mo76660b(C82154bd.REQUESTED);
        C60870cx a = C83349aj.m132646a(beVar.f224569f, C82148ay.f224554a);
        Duration duration = C82155be.f224564a;
        beVar.f224571h = C90877ak.m148471e(a, duration.toMillis(), TimeUnit.MILLISECONDS, beVar.f224568e);
        C90875ai.m148465b(new C82149az(beVar), beVar.f224571h, beVar.f224567d, "[NGA] request").mo85223a(new C82151ba(beVar));
    }

    /* renamed from: b */
    public final void mo75139b(Configuration configuration) {
        this.f224638k.mo28212l("[NGA] onConfigurationChanged", new C82182p(this, configuration));
    }

    /* renamed from: c */
    public final void mo75140c() {
        C59071e eVar = f224625b;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(6485)).mo56386p("onCreate");
        this.f224649w.mo76660b(false);
        this.f224652z.mo76661a();
        Window b = this.f224636i.mo75174b();
        if (b == null) {
            ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(6486)).mo56386p("Window is null in onCreate().");
        } else {
            C130125a aVar = this.f224639l;
            Context context = this.f224634g;
            C81566i iVar = this.f224636i;
            Objects.requireNonNull(iVar);
            aVar.mo109519e(b, context, new C82185s(iVar));
        }
        this.f224649w.mo76660b(true);
        this.f224652z.mo76663c(this.f224649w, new C82186t(this));
        this.f224652z.mo76663c(this.f224650x, new C82187u(this));
    }

    /* renamed from: d */
    public final void mo75141d() {
        ((C59052c) ((C59052c) f224625b.mo56224b()).mo56372aa(6487)).mo56386p("onDestroy");
        this.f224648v.mo76660b(false);
        this.f224649w.mo76660b(false);
        this.f224639l.mo109516b();
        this.f224652z.mo76661a();
    }

    /* renamed from: e */
    public final void mo75142e() {
        ((C59052c) ((C59052c) f224625b.mo56224b()).mo56372aa(6488)).mo56386p("onHide");
        this.f224648v.mo76660b(false);
        this.f224629C.mo75369a(2);
        this.f224639l.mo109517c();
    }

    /* renamed from: f */
    public final void mo75143f() {
        ((C59052c) ((C59052c) f224625b.mo56224b()).mo56372aa(6489)).mo56386p("onShow");
        this.f224648v.mo76660b(true);
        this.f224629C.mo75369a(3);
        this.f224639l.mo109518d();
    }

    /* renamed from: g */
    public final void mo75144g(VoiceInteractionSession.Insets insets) {
        C81820m f = C81820m.m130061f((C81820m) this.f224640m.mo75220d().mo76657c(), (C81820m) this.f224641n.mo75220d().mo76657c());
        C81809b bVar = (C81809b) ((C83361k) this.f224630c).f227199b.get();
        if (bVar.equals(C81809b.f223743a)) {
            insets.touchableInsets = 0;
            return;
        }
        int a = f.mo75343a();
        int i = a - 1;
        if (a == 0) {
            throw null;
        } else if (i == 0) {
            insets.touchableInsets = 0;
        } else if (i == 1) {
            insets.touchableInsets = 3;
            insets.touchableRegion.setPath(f.mo75347b(), new Region(0, 0, bVar.mo75337e(), bVar.mo75336d()));
            Region region = insets.touchableRegion;
        } else if (i == 2) {
            insets.touchableInsets = 3;
            insets.touchableRegion.setEmpty();
        }
    }

    /* renamed from: h */
    public final boolean mo75145h() {
        return ((Boolean) this.f224640m.mo75218b().mo76657c()).booleanValue() || ((Boolean) this.f224641n.mo75218b().mo76657c()).booleanValue();
    }

    /* renamed from: i */
    public final C83358h mo75521i() {
        return this.f224650x;
    }

    /* renamed from: j */
    public final void mo75522j(Intent intent) {
        ((C59052c) ((C59052c) f224625b.mo56224b()).mo56372aa(6492)).mo56386p("startAssistantActivity");
        if (((Boolean) ((C83352b) this.f224650x).mo76654b()).booleanValue()) {
            this.f224635h.mo75146a(intent);
            return;
        }
        this.f224645r.add(intent);
        this.f224638k.mo28213m("[NGA] removeStartIntent", f224626u.toMillis(), new C82169c(this, intent));
    }

    /* renamed from: k */
    public final Display mo75532k() {
        Window b;
        if (!((Boolean) this.f224628B.orElse(false)).booleanValue() || (b = this.f224636i.mo75174b()) == null) {
            return null;
        }
        return b.getWindowManager().getDefaultDisplay();
    }

    /* renamed from: l */
    public final void mo75533l(C58485gu guVar) {
        boolean z = !guVar.isEmpty();
        this.f224633f.removeAllViews();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            this.f224633f.addView(((C82144au) guVar.get(i)).mo75217a());
        }
        if (z) {
            if (!this.f224628B.equals(Optional.m71637of(true))) {
                this.f224628B = Optional.m71637of(true);
                this.f224636i.mo75176d();
                this.f224629C.mo75369a(4);
                Window b = this.f224636i.mo75174b();
                if (b == null) {
                    ((C59052c) ((C59052c) f224625b.mo56226d()).mo56372aa(6476)).mo56386p("Window from session was null, cannot enable AssistUi");
                    return;
                }
                Resources resources = this.f224634g.getResources();
                this.f224630c.mo76660b(C81809b.m129993j(mo75532k(), resources, resources.getConfiguration()));
                C2043bi.m5555ai(b.getDecorView(), new C82184r(this));
                C82167bq bqVar = this.f224637j;
                TouchInterceptingFrameLayout touchInterceptingFrameLayout = this.f224633f;
                C58838bb.m90884s(!bqVar.f224596e, "cannot enableWindow when already enabled");
                bqVar.f224596e = true;
                b.getDecorView().setOnTouchListener(new C82161bk(bqVar));
                touchInterceptingFrameLayout.f253398a = new C82162bl(bqVar);
                bqVar.f224593b.mo76660b(C82165bo.NONE);
                bqVar.f224594c.mo76660b((C82166bp) ((Optional) this.f224632e.mo76657c()).orElse(C82166bp.FOCUSABLE));
                bqVar.f224592a.mo76663c(bqVar.f224595d, new C82163bm(b));
                ViewParent parent = this.f224633f.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.f224633f);
                }
                this.f224636i.mo75178f(this.f224633f);
                this.f224627A.ifPresent(C82150b.f224556a);
            }
        } else if (!this.f224628B.equals(Optional.m71637of(false))) {
            this.f224628B = Optional.m71637of(false);
            C82167bq bqVar2 = this.f224637j;
            bqVar2.f224592a.mo76661a();
            bqVar2.f224596e = false;
            this.f224636i.mo75175c();
            this.f224629C.mo75369a(5);
            this.f224627A.ifPresent(C82179m.f224610a);
        }
    }

    /* renamed from: m */
    public final void mo75534m(boolean z) {
        this.f224643p.mo75172y(z);
        C81564g gVar = this.f224651y;
        C80832ak akVar = (C80832ak) C80833al.f221756c.createBuilder();
        C80855bg bgVar = (C80855bg) C80856bh.f221798b.createBuilder();
        bgVar.copyOnWrite();
        ((C80856bh) bgVar.instance).f221800a = z;
        akVar.copyOnWrite();
        C80833al alVar = (C80833al) akVar.instance;
        C80856bh bhVar = (C80856bh) bgVar.build();
        bhVar.getClass();
        alVar.f221759b = bhVar;
        alVar.f221758a = 6;
        gVar.mo73553b((C80833al) akVar.build());
    }
}
