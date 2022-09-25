package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.app.C0395p;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.nga.engine.aw.f;
import com.google.android.apps.gsa.nga.engine.p5913am.p5935p.C74946b;
import com.google.android.apps.gsa.nga.engine.p5964av.C75158f;
import com.google.android.apps.gsa.nga.engine.p5972aw.C75165g;
import com.google.android.apps.gsa.nga.shared.p6319ak.C80882b;
import com.google.android.apps.gsa.nga.shared.p6319ak.C80883c;
import com.google.android.apps.gsa.nga.shared.p6321am.p6323b.C80936f;
import com.google.android.apps.gsa.nga.shared.p6367t.C81506a;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.animation.C147768a;
import com.google.android.libraries.animation.C147770c;
import com.google.android.libraries.animation.C147774g;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.animation.C147790p;
import com.google.android.libraries.animation.C147794t;
import com.google.android.libraries.animation.impl.C147779b;
import com.google.android.libraries.animation.impl.C147783f;
import com.google.android.libraries.gsa.logoview.C22902b;
import com.google.android.libraries.gsa.logoview.C22906c;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.gsa.p1876k.C22871g;
import java.lang.ref.WeakReference;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

@Deprecated
/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.AnswerUiRenderer */
/* compiled from: PG */
public class AnswerUiRenderer implements C2376g {

    /* renamed from: a */
    public static final Duration f214882a = Duration.ofMillis(300);

    /* renamed from: o */
    private static final Duration f214883o = Duration.ofMillis(300);

    /* renamed from: A */
    private boolean f214884A;

    /* renamed from: B */
    private final C78080s f214885B = new C78080s(this);

    /* renamed from: b */
    public final C0395p f214886b;

    /* renamed from: c */
    public final C2391v f214887c;

    /* renamed from: d */
    public final C74946b f214888d;

    /* renamed from: e */
    public final C78075n f214889e;

    /* renamed from: f */
    public final View f214890f;

    /* renamed from: g */
    public final TextView f214891g;

    /* renamed from: h */
    public final TouchInterceptingFrameLayout f214892h;

    /* renamed from: i */
    public final ViewGroup f214893i;

    /* renamed from: j */
    public final TextView f214894j;

    /* renamed from: k */
    public final C78031ad f214895k;

    /* renamed from: l */
    public final C147785k f214896l;

    /* renamed from: m */
    public final ViewTreeObserver.OnGlobalLayoutListener f214897m = new C78028aa(this);

    /* renamed from: n */
    public final C78029ab f214898n = new C78029ab(this);

    /* renamed from: p */
    private final C78078q f214899p;

    /* renamed from: q */
    private final C78037aj f214900q;

    /* renamed from: r */
    private final C81506a f214901r;

    /* renamed from: s */
    private final MicHandler f214902s;

    /* renamed from: t */
    private final KeyboardHandler f214903t;

    /* renamed from: u */
    private final View f214904u;

    /* renamed from: v */
    private final LogoView f214905v;

    /* renamed from: w */
    private final C75165g f214906w;

    /* renamed from: x */
    private final C80882b f214907x;

    /* renamed from: y */
    private final Runnable f214908y;

    /* renamed from: z */
    private boolean f214909z;

    public AnswerUiRenderer(C0395p pVar, C2391v vVar, View view, C78078q qVar, C74946b bVar, C78037aj ajVar, C78075n nVar, C81506a aVar, C78049av avVar, C147783f fVar, C78057bc bcVar, C75165g gVar, C80883c cVar) {
        View view2 = view;
        C78049av avVar2 = avVar;
        C78057bc bcVar2 = bcVar;
        C78030ac acVar = new C78030ac(this);
        this.f214908y = acVar;
        C78081t tVar = new C78081t(view2);
        C80936f fVar2 = (C80936f) cVar.f221837a.mo17428b();
        fVar2.getClass();
        this.f214907x = new C80882b(tVar, fVar2);
        this.f214886b = pVar;
        this.f214887c = vVar;
        this.f214899p = qVar;
        this.f214888d = bVar;
        this.f214900q = ajVar;
        this.f214889e = nVar;
        this.f214901r = aVar;
        this.f214904u = view2;
        this.f214906w = gVar;
        TouchInterceptingFrameLayout touchInterceptingFrameLayout = (TouchInterceptingFrameLayout) view2.findViewById(R.id.answer_card_root);
        this.f214892h = touchInterceptingFrameLayout;
        this.f214893i = (ViewGroup) view2.findViewById(R.id.container);
        this.f214890f = view2.findViewById(R.id.logo_heading_view);
        this.f214891g = (TextView) view2.findViewById(R.id.heading);
        this.f214894j = (TextView) view2.findViewById(R.id.data_freshness);
        this.f214905v = (LogoView) view2.findViewById(R.id.logo);
        LogoView logoView = (LogoView) view2.findViewById(R.id.mic);
        logoView.getClass();
        C147783f fVar3 = (C147783f) bcVar2.f215014a.mo17428b();
        fVar3.getClass();
        C22871g gVar2 = (C22871g) bcVar2.f215015b.mo17428b();
        gVar2.getClass();
        C75158f fVar4 = (C75158f) bcVar2.f215016c.mo17428b();
        fVar4.getClass();
        C91142g gVar3 = (C91142g) bcVar2.f215017d.mo17428b();
        gVar3.getClass();
        C78075n nVar2 = (C78075n) bcVar2.f215018e.mo17428b();
        nVar2.getClass();
        MicHandler micHandler = r6;
        MicHandler micHandler2 = new MicHandler(vVar, logoView, fVar3, gVar2, fVar4, gVar3, nVar2);
        this.f214902s = micHandler;
        C22871g gVar4 = (C22871g) avVar2.f215005a.mo17428b();
        gVar4.getClass();
        C75158f fVar5 = (C75158f) avVar2.f215006b.mo17428b();
        fVar5.getClass();
        this.f214903t = new KeyboardHandler(pVar, vVar, view, gVar4, fVar5);
        C78031ad adVar = new C78031ad(touchInterceptingFrameLayout);
        this.f214895k = adVar;
        Objects.requireNonNull(touchInterceptingFrameLayout);
        C147770c cVar2 = new C147770c(new C78082u(touchInterceptingFrameLayout));
        C147794t b = C147794t.m240888b(0.0f, 1.0f);
        b.f398763c = new C147790p(0.0f, 1.0f);
        C147768a a = cVar2.mo124447a(b);
        C147770c cVar3 = new C147770c(adVar);
        C147794t b2 = C147794t.m240888b(0.0f, 1.0f);
        b2.f398763c = new C147790p(1.0f, 0.0f);
        C147779b bVar2 = new C147779b(fVar, C147774g.m240858a(a, cVar3.mo124447a(b2)));
        bVar2.f398748b = acVar;
        this.f214896l = bVar2.mo124453a();
    }

    /* renamed from: l */
    private final void m125250l() {
        if (this.f214884A) {
            this.f214901r.mo73129c();
            this.f214884A = false;
        }
    }

    /* renamed from: g */
    public final void mo72973g() {
        this.f214900q.f214955c.ifPresent(C78086y.f215072a);
        this.f214886b.finish();
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        this.f214904u.setSystemUiVisibility(this.f214886b.getWindow().getDecorView().getSystemUiVisibility() | 1792);
        this.f214904u.setOnClickListener(new C78083v(this));
        LogoView logoView = this.f214905v;
        logoView.mo28225e(11, true);
        logoView.mo28223c(C22902b.m42827a(logoView).floatValue() * 0.35f, C22906c.m42844a(logoView).floatValue() * 0.35f);
        C2043bi.m5555ai(this.f214892h, C78079r.f215065a);
        MicHandler micHandler = this.f214902s;
        micHandler.f214925c.getLifecycle().mo5790b(micHandler.f214932j);
        micHandler.f214926d.mo28225e(7, true);
        LogoView logoView2 = micHandler.f214926d;
        logoView2.mo28223c(C22902b.m42827a(logoView2).floatValue() * 0.35f, C22906c.m42844a(micHandler.f214926d).floatValue() * 0.35f);
        micHandler.f214926d.setOnClickListener(new C78053az(micHandler));
        KeyboardHandler keyboardHandler = this.f214903t;
        keyboardHandler.f214916b.getLifecycle().mo5790b(keyboardHandler.f214921g);
        this.f214892h.setAlpha(0.0f);
        this.f214892h.getLayoutTransition().enableTransitionType(4);
        this.f214892h.f253398a = new C78084w(this);
        this.f214899p.f215064b = new WeakReference(this);
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        this.f214899p.f215064b = null;
        MicHandler micHandler = this.f214902s;
        micHandler.f214925c.getLifecycle().mo5791c(micHandler.f214932j);
        KeyboardHandler keyboardHandler = this.f214903t;
        keyboardHandler.f214916b.getLifecycle().mo5791c(keyboardHandler.f214921g);
    }

    /* renamed from: gX */
    public final void mo3522gX(C2391v vVar) {
        C75165g gVar = this.f214906w;
        f.a(gVar.f209602a, this.f214907x);
        m125250l();
    }

    /* renamed from: gY */
    public final void mo3523gY(C2391v vVar) {
        if (this.f214909z) {
            mo72975i();
        }
        C75165g gVar = this.f214906w;
        gVar.f209602a.set(this.f214907x);
    }

    /* renamed from: gZ */
    public final void mo3524gZ(C2391v vVar) {
        this.f214901r.mo73130f();
        C78037aj ajVar = this.f214900q;
        C78080s sVar = this.f214885B;
        ajVar.f214954b.mo75092c(sVar);
        ajVar.f214953a.mo28212l("[NGA] notifyListeners", new C78035ah(ajVar, sVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo72974h(Optional optional) {
        optional.ifPresent(new C78087z(this));
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        this.f214901r.mo73131g();
        C78037aj ajVar = this.f214900q;
        ajVar.f214954b.mo75093d(this.f214885B);
        mo72976j();
        mo72977k();
    }

    /* renamed from: i */
    public final void mo72975i() {
        if (!this.f214884A) {
            this.f214901r.mo73133l();
            this.f214884A = true;
            this.f214909z = true;
        }
    }

    /* renamed from: j */
    public final void mo72976j() {
        int childCount = this.f214893i.getChildCount();
        if (!this.f214886b.mo545jw().f634a.mo677i().isEmpty()) {
            Fragment fragment = (Fragment) this.f214886b.mo545jw().f634a.mo677i().get(0);
            FragmentManager fragmentManager = fragment.getFragmentManager();
            if (fragmentManager != null) {
                C0154a aVar = new C0154a(fragmentManager);
                aVar.mo516m(fragment);
                aVar.mo509f();
            }
        } else if (childCount > 0) {
            this.f214893i.removeAllViews();
        }
    }

    /* renamed from: k */
    public final void mo72977k() {
        m125250l();
        this.f214896l.mo124460b(0.0f, f214883o);
    }
}
