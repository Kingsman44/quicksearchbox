package com.google.android.apps.search.googleapp.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C1878d;
import androidx.core.graphics.C1924a;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.h.e.a;
import com.google.android.apps.gsa.h.e.d;
import com.google.android.apps.gsa.h.i.c;
import com.google.android.apps.gsa.h.i.e;
import com.google.android.apps.gsa.h.p.i;
import com.google.android.apps.gsa.h.u.g;
import com.google.android.apps.gsa.h.u.h;
import com.google.android.apps.gsa.p5855h.p5860q.C74541e;
import com.google.android.apps.gsa.search.core.p6507ag.p6510c.C84489b;
import com.google.android.apps.gsa.search.core.p6507ag.p6510c.C84490c;
import com.google.android.apps.gsa.search.core.p6507ag.p6510c.C84492e;
import com.google.android.apps.search.googleapp.activity.p10136a.C133376f;
import com.google.android.apps.search.googleapp.activity.p10137b.C133405b;
import com.google.android.apps.search.googleapp.activity.p10137b.C133409f;
import com.google.android.apps.search.googleapp.activity.p10137b.C133411h;
import com.google.android.apps.search.googleapp.activity.p10137b.C133412i;
import com.google.android.apps.search.googleapp.homescreen.p10312b.C136148a;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10320b.C136234d;
import com.google.android.apps.search.googleapp.incognito.p10320b.C136237g;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.incognito.p10329g.C136335x;
import com.google.android.apps.search.googleapp.incognito.p10329g.C136337z;
import com.google.android.apps.search.googleapp.p10117aa.p10118a.C133081f;
import com.google.android.apps.search.googleapp.p10117aa.p10119b.C133110a;
import com.google.android.apps.search.googleapp.p10310h.C136126g;
import com.google.android.apps.search.googleapp.p10338l.p10339a.C136382ae;
import com.google.android.apps.search.googleapp.p10370p.C136885u;
import com.google.android.apps.search.googleapp.p10527u.C139762c;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.p10536x.p10538b.C139866a;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C136969bx;
import com.google.android.apps.search.googleapp.promomanager.p10377f.C137119m;
import com.google.android.apps.search.googleapp.promomanager.p10377f.C137120n;
import com.google.android.apps.search.googleapp.search.p10409e.C137419h;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139684f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.material.navigation.C44820g;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.lifecycle.flow.C47426f;
import com.google.apps.tiktok.lifecycle.flow.C47429i;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.activity.w */
/* compiled from: PG */
public final class C133444w {

    /* renamed from: a */
    public static final C58974d f363591a = C58974d.m91135i("GoogleAppFragment");

    /* renamed from: A */
    public final C137119m f363592A;

    /* renamed from: B */
    public final C139866a f363593B;

    /* renamed from: C */
    public final C136969bx f363594C;

    /* renamed from: D */
    public final C133376f f363595D;

    /* renamed from: E */
    public final boolean f363596E;

    /* renamed from: F */
    public final boolean f363597F;

    /* renamed from: G */
    public final boolean f363598G;

    /* renamed from: H */
    public final int f363599H;

    /* renamed from: I */
    public final C133412i f363600I;

    /* renamed from: J */
    public final C137419h f363601J;

    /* renamed from: K */
    public final C136885u f363602K;

    /* renamed from: L */
    public final C46440f f363603L = new C133448b();

    /* renamed from: M */
    public final C46792di f363604M = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C58970a) ((C58970a) ((C58970a) C133444w.f363591a.mo56225c()).mo56382g(th)).mo56372aa(40035)).mo56386p("Failed to read incognito timeout state");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            Boolean bool = (Boolean) obj;
            C133444w wVar = C133444w.this;
            if (wVar.f363619d != null && wVar.f363635t != null && bool.booleanValue()) {
                View findViewById = C133444w.this.f363619d.requireView().findViewById(R.id.googleapp_navigation_bar_container);
                C136337z zVar = C133444w.this.f363635t;
                if (findViewById.getVisibility() != 0) {
                    findViewById = null;
                }
                int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(zVar.f371216k);
                View view = zVar.f371208c.getView();
                view.getClass();
                Snackbar q = Snackbar.m79661q((Context) null, view, zVar.f371206a.getString(R.string.googleapp_incognito_session_timed_out_msg, new Object[]{Integer.valueOf(minutes)}), (int) zVar.f371217l);
                if (findViewById != null) {
                    q.mo48349n(findViewById);
                }
                q.mo48353t(R.string.googleapp_incognito_timeout_action_btn_text, new C136335x(zVar, q));
                q.mo48343h();
                C46459k.m82829b(zVar.f371211f.f371025a.mo46039a(C136237g.f371022a, C60826bg.f164896a), "Failed to set timed out status for Incognito session.", new Object[0]);
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: N */
    public final C46792di f363605N = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C58970a) ((C58970a) ((C58970a) C133444w.f363591a.mo56225c()).mo56382g(th)).mo56372aa(40036)).mo56386p("Failed to receive Google App Browser fragment for removal.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            String str = (String) obj;
            if (C133444w.this.f363619d != null && !str.isEmpty()) {
                FragmentManager childFragmentManager = C133444w.this.f363619d.getChildFragmentManager();
                Fragment c = childFragmentManager.f634a.mo671c(str);
                if (c != null) {
                    C0154a aVar = new C0154a(childFragmentManager);
                    aVar.mo516m(c);
                    aVar.mo509f();
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: O */
    C139779t f363606O;

    /* renamed from: P */
    public C139779t f363607P;

    /* renamed from: Q */
    public final C84490c f363608Q;

    /* renamed from: R */
    public final C84492e f363609R;

    /* renamed from: S */
    public final C84489b f363610S;

    /* renamed from: T */
    public final C38553h f363611T;

    /* renamed from: U */
    private final C28443m f363612U;

    /* renamed from: V */
    private final boolean f363613V;

    /* renamed from: W */
    private final AtomicReference f363614W;

    /* renamed from: X */
    private final C136382ae f363615X;

    /* renamed from: Y */
    private final boolean f363616Y;

    /* renamed from: b */
    public final AccountId f363617b;

    /* renamed from: c */
    public final Activity f363618c;

    /* renamed from: d */
    public final C133430i f363619d;

    /* renamed from: e */
    public final C46439e f363620e;

    /* renamed from: f */
    public final C133395as f363621f;

    /* renamed from: g */
    public final Map f363622g;

    /* renamed from: h */
    public final C62921ba f363623h;

    /* renamed from: i */
    public final C136148a f363624i;

    /* renamed from: j */
    final Optional f363625j;

    /* renamed from: k */
    public final C139684f f363626k;

    /* renamed from: l */
    public final HotwordDetectionRequester f363627l;

    /* renamed from: m */
    public final boolean f363628m;

    /* renamed from: n */
    public final boolean f363629n;

    /* renamed from: o */
    public final C28306ab f363630o;

    /* renamed from: p */
    public final C133421bh f363631p;

    /* renamed from: q */
    public final C133417bd f363632q;

    /* renamed from: r */
    public final HashMap f363633r = new HashMap();

    /* renamed from: s */
    public final C136247a f363634s;

    /* renamed from: t */
    public final C136337z f363635t;

    /* renamed from: u */
    public final C136234d f363636u;

    /* renamed from: v */
    public final C46801dp f363637v;

    /* renamed from: w */
    public final C133411h f363638w;

    /* renamed from: x */
    public final Optional f363639x;

    /* renamed from: y */
    public final C133110a f363640y;

    /* renamed from: z */
    public final C133081f f363641z;

    /* renamed from: com.google.android.apps.search.googleapp.activity.w$a */
    /* compiled from: PG */
    final class C133447a implements C46792di {

        /* renamed from: a */
        private final C133444w f363644a;

        public C133447a(C133444w wVar) {
            this.f363644a = wVar;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            throw new AssertionError(th);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            Optional optional = (Optional) obj;
            if (optional.isPresent()) {
                this.f363644a.mo111153j(((Boolean) optional.get()).booleanValue());
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    /* renamed from: com.google.android.apps.search.googleapp.activity.w$b */
    /* compiled from: PG */
    final class C133448b implements C46440f {
        public C133448b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C58970a aVar = (C58970a) C133444w.f363591a.mo56225c();
            aVar.mo56378ag(C38505d.f101864b, 160765908);
            ((C58970a) ((C58970a) aVar.mo56382g(th)).mo56372aa(40037)).mo56386p("Failed to create an intent");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            C133426e eVar;
            C133426e eVar2;
            e eVar3;
            d dVar;
            C139767h hVar;
            Void voidR = (Void) obj;
            C133397au auVar = (C133397au) ((ProtoParsers.ParcelableProto) obj2).mo58938a(C133397au.f363485c, C133444w.this.f363623h.mo58829b());
            int i = auVar.f363487a;
            boolean z = false;
            int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (i3 == 0) {
                C133421bh bhVar = C133444w.this.f363631p;
                if (i == 1) {
                    eVar = (C133426e) auVar.f363488b;
                } else {
                    eVar = C133426e.f363567e;
                }
                C139779t tVar = C139779t.UNSPECIFIED;
                C139779t a = C139779t.m227245a(eVar.f363572d);
                if (a == null) {
                    a = C139779t.UNSPECIFIED;
                }
                switch (a.ordinal()) {
                    case 0:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalArgumentException("Unsupported tab type");
                    case 1:
                        if (eVar.f363570b == 2) {
                            z = true;
                        }
                        C58838bb.m90869d(z, "Homescreen options must be provided for navigating to the AGSA-C homescreen");
                        c cVar = bhVar.f363552a;
                        if (eVar.f363570b == 2) {
                            eVar3 = (e) eVar.f363571c;
                        } else {
                            eVar3 = e.c;
                        }
                        cVar.mo41491f(eVar3);
                        break;
                    case 2:
                        int i4 = eVar.f363570b;
                        if (i4 == 6) {
                            bhVar.f363553b.mo41491f((i) eVar.f363571c);
                            break;
                        } else if (i4 == 7) {
                            bhVar.f363554c.mo41490e((h) eVar.f363571c);
                            break;
                        } else {
                            throw new IllegalArgumentException("Either Text or Voice Search options must be provided for navigating to AGSA-C Search");
                        }
                    case 3:
                        if (eVar.f363570b == 5) {
                            z = true;
                        }
                        C58838bb.m90869d(z, "Collections options must be provided for navigating to AGSA-C Collections");
                        a aVar = bhVar.f363555d;
                        if (eVar.f363570b == 5) {
                            dVar = (d) eVar.f363571c;
                        } else {
                            dVar = d.c;
                        }
                        aVar.mo41491f(dVar);
                        break;
                }
                C133444w wVar = C133444w.this;
                if (wVar.f363598G) {
                    if (auVar.f363487a == 1) {
                        eVar2 = (C133426e) auVar.f363488b;
                    } else {
                        eVar2 = C133426e.f363567e;
                    }
                    C139779t a2 = C139779t.m227245a(eVar2.f363572d);
                    if (a2 == null) {
                        a2 = C139779t.UNSPECIFIED;
                    }
                    wVar.f363606O = a2;
                }
            } else if (i3 == 1) {
                C133444w wVar2 = C133444w.this;
                if (i == 2) {
                    hVar = (C139767h) auVar.f363488b;
                } else {
                    hVar = C139767h.f379869k;
                }
                wVar2.mo111151h(hVar);
            } else if (i3 == 2) {
                throw new IllegalArgumentException("No navigation data has been passed.");
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C133444w(AccountId accountId, Activity activity, C133430i iVar, C46439e eVar, Map map, C133395as asVar, C62921ba baVar, C136148a aVar, C137419h hVar, C28443m mVar, boolean z, Optional optional, C139684f fVar, HotwordDetectionRequester hotwordDetectionRequester, C84492e eVar2, C84489b bVar, C84490c cVar, C28306ab abVar, C133421bh bhVar, C133417bd bdVar, C133411h hVar2, C38553h hVar3, IncognitoLifecycleObserver incognitoLifecycleObserver, C136247a aVar2, C136337z zVar, C136234d dVar, C46801dp dpVar, Optional optional2, AtomicReference atomicReference, C133110a aVar3, C133081f fVar2, C137120n nVar, C136969bx bxVar, C139866a aVar4, C136885u uVar, C133376f fVar3, C136382ae aeVar, boolean z2, boolean z3, boolean z4, boolean z5, C133412i iVar2, boolean z6, boolean z7, C47429i iVar3) {
        C133430i iVar4 = iVar;
        HotwordDetectionRequester hotwordDetectionRequester2 = hotwordDetectionRequester;
        C133411h hVar4 = hVar2;
        boolean z8 = z4;
        boolean z9 = z7;
        this.f363617b = accountId;
        this.f363618c = activity;
        this.f363619d = iVar4;
        this.f363620e = eVar;
        this.f363622g = map;
        this.f363621f = asVar;
        this.f363623h = baVar;
        this.f363624i = aVar;
        this.f363612U = mVar;
        this.f363613V = z;
        this.f363625j = optional;
        this.f363626k = fVar;
        this.f363627l = hotwordDetectionRequester2;
        this.f363608Q = cVar;
        this.f363628m = z9;
        iVar4.f363574a.mo5790b(hotwordDetectionRequester2);
        this.f363609R = eVar2;
        this.f363610S = bVar;
        this.f363630o = abVar;
        this.f363631p = bhVar;
        this.f363632q = bdVar;
        this.f363638w = hVar4;
        this.f363611T = hVar3;
        this.f363634s = aVar2;
        this.f363636u = dVar;
        this.f363635t = zVar;
        this.f363637v = dpVar;
        this.f363639x = optional2;
        this.f363614W = atomicReference;
        this.f363640y = aVar3;
        this.f363641z = fVar2;
        this.f363594C = bxVar;
        this.f363593B = aVar4;
        this.f363592A = nVar.mo113538a(R.id.googleapp_promotion_container);
        this.f363595D = fVar3;
        this.f363615X = aeVar;
        this.f363596E = z2;
        this.f363597F = z3;
        incognitoLifecycleObserver.mo112948g();
        this.f363616Y = z5;
        this.f363598G = z8;
        this.f363599H = true != z8 ? R.id.googleapp_top_level_destination_container : R.id.googleapp_nav_host;
        this.f363600I = iVar2;
        this.f363629n = z6;
        this.f363601J = hVar;
        this.f363602K = uVar;
        if (z9) {
            C47426f.m84293a(iVar3.mo51262a(hVar4.f363530b), new C133433l(this));
        }
    }

    /* renamed from: n */
    private final void m216579n(int i) {
        if (this.f363613V) {
            C28443m mVar = this.f363612U;
            C28440j f = C28442l.m53140f();
            f.mo33895b(C28375ak.m53063e(i));
            C28442l a = f.mo33894a();
            Activity activity = this.f363618c;
            int i2 = C28485y.f77298f;
            mVar.mo33853c(a, C28485y.m53234a(activity.findViewById(16908290)));
        }
    }

    /* renamed from: o */
    private final void m216580o() {
        boolean l = mo111155l();
        mo111153j(l);
        this.f363638w.mo111132a(l);
    }

    /* renamed from: p */
    private final void m216581p(C139779t tVar, C139779t tVar2) {
        this.f363633r.put(tVar, Integer.valueOf(Color.alpha(this.f363618c.getWindow().getStatusBarColor())));
        mo111152i(tVar2);
    }

    /* renamed from: a */
    public final ViewGroup mo111144a() {
        View view = this.f363619d.getView();
        view.getClass();
        return (ViewGroup) view;
    }

    /* renamed from: b */
    public final C133405b mo111145b() {
        return (C133405b) this.f363619d.getChildFragmentManager().f634a.mo670b(true != this.f363600I.mo111133a() ? R.id.googleapp_navigation_bar_container : R.id.googleapp_navigation_rail_container);
    }

    /* renamed from: c */
    public final C47392e mo111146c(C139762c cVar) {
        mo111150g(cVar.mo115221a());
        return C47392e.f123115a;
    }

    /* renamed from: d */
    public final void mo111147d(Intent intent) {
        String f = C136126g.m221192f(intent);
        if (f != null) {
            this.f363614W.set(f);
        }
    }

    /* renamed from: e */
    public final void mo111148e() {
        C133405b b = mo111145b();
        b.getClass();
        C133409f a = b.mo17754z();
        C139779t tVar = this.f363606O;
        tVar.getClass();
        C44820g gVar = ((NavigationBarView) a.f363512b.requireView().findViewById(R.id.googleapp_navigation_bar)).f116864a;
        int ordinal = tVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            gVar.findItem(R.id.googleapp_navigation_bar_discover).setChecked(true);
        } else if (ordinal == 2) {
            gVar.findItem(R.id.googleapp_navigation_bar_search).setChecked(true);
        } else if (ordinal == 3) {
            gVar.findItem(R.id.googleapp_navigation_bar_collections).setChecked(true);
        } else if (ordinal == 4) {
            gVar.findItem(R.id.googleapp_navigation_bar_tabs).setChecked(true);
        } else if (ordinal != 6) {
            if (ordinal == 7) {
                gVar.findItem(R.id.googleapp_navigation_bar_inbox).setChecked(true);
            }
        } else if (a.f363527q) {
            gVar.findItem(R.id.googleapp_navigation_bar_search).setChecked(true);
        }
    }

    /* renamed from: f */
    public final void mo111149f(Intent intent) {
        C139779t tVar = this.f363606O;
        if (tVar != null && tVar == C139779t.HOME_SCREEN && C136126g.m221193g(intent) && !this.f363624i.mo112802a()) {
            Intent putExtra = C74541e.m120515a(5).putExtra("SKIP_EXIT_ANIMATION", true);
            putExtra.putExtra("source", "and.gsa.launcher.icon");
            C47810es.m84979s(this.f363618c, putExtra);
            this.f363618c.finishAndRemoveTask();
        }
    }

    /* renamed from: g */
    public final void mo111150g(C139767h hVar) {
        C47633f fVar;
        C46439e eVar = this.f363620e;
        C133421bh bhVar = this.f363631p;
        boolean z = !bhVar.f363561j.mo113716a();
        C139779t tVar = C139779t.UNSPECIFIED;
        C139779t a = C139779t.m227245a(hVar.f379872b);
        if (a == null) {
            a = C139779t.UNSPECIFIED;
        }
        int ordinal = a.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                fVar = ordinal != 3 ? C47633f.m84733g(C60856cj.m92900i(C133421bh.m216558b(hVar))) : C47633f.m84733g(bhVar.f363558g.mo112950a()).mo51515h(new C133420bg(hVar, z), bhVar.f363557f);
            } else if ((hVar.f379871a & 64) == 0 || !hVar.f379879i) {
                if (bhVar.f363561j.mo113716a()) {
                    fVar = C47633f.m84733g(C60856cj.m92900i(C133421bh.m216558b(hVar)));
                } else if (hVar.f379876f.isEmpty()) {
                    fVar = bhVar.f363553b.a.a(4).mo51515h(C133419bf.f363549a, bhVar.f363557f);
                } else {
                    C133425d dVar = (C133425d) C133426e.f363567e.createBuilder();
                    C139779t tVar2 = C139779t.SEARCH;
                    dVar.copyOnWrite();
                    C133426e eVar2 = (C133426e) dVar.instance;
                    eVar2.f363572d = tVar2.f379907i;
                    eVar2.f363569a = 1 | eVar2.f363569a;
                    i b = com.google.android.apps.gsa.h.p.a.b(hVar.f379876f, bhVar.f363556e.mo115169a(), Collections.unmodifiableMap(hVar.f379875e));
                    dVar.copyOnWrite();
                    C133426e eVar3 = (C133426e) dVar.instance;
                    b.getClass();
                    eVar3.f363571c = b;
                    eVar3.f363570b = 6;
                    fVar = C47633f.m84733g(C60856cj.m92900i(C133421bh.m216557a((C133426e) dVar.build())));
                }
            } else if (bhVar.f363559h.mo112951a()) {
                fVar = C47633f.m84733g(C60856cj.m92900i(C133421bh.m216558b(hVar)));
            } else {
                C133425d dVar2 = (C133425d) C133426e.f363567e.createBuilder();
                C139779t tVar3 = C139779t.SEARCH;
                dVar2.copyOnWrite();
                C133426e eVar4 = (C133426e) dVar2.instance;
                eVar4.f363572d = tVar3.f379907i;
                eVar4.f363569a |= 1;
                Optional a2 = bhVar.f363556e.mo115169a();
                g createBuilder = h.c.createBuilder();
                Objects.requireNonNull(createBuilder);
                a2.ifPresent(new com.google.android.apps.gsa.h.u.a(createBuilder));
                h build = createBuilder.build();
                dVar2.copyOnWrite();
                C133426e eVar5 = (C133426e) dVar2.instance;
                build.getClass();
                eVar5.f363571c = build;
                eVar5.f363570b = 7;
                fVar = C47633f.m84733g(C60856cj.m92900i(C133421bh.m216557a((C133426e) dVar2.build())));
            }
        } else if (!bhVar.f363560i.mo112802a()) {
            c cVar = bhVar.f363552a;
            fVar = cVar.a.a().mo51515h(com.google.android.apps.gsa.h.i.a.a, cVar.b).mo51515h(C133418be.f363548a, bhVar.f363557f);
        } else {
            fVar = C47633f.m84733g(C60856cj.m92900i(C133421bh.m216558b(hVar)));
        }
        eVar.mo50428h(C46438d.m82809a(fVar).f121541a, (Object) null, this.f363603L);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo111151h(C139767h hVar) {
        C139779t tVar;
        C139779t a = C139779t.m227245a(hVar.f379872b);
        if (a == null) {
            a = C139779t.UNSPECIFIED;
        }
        if (!this.f363622g.containsKey(a)) {
            ((C58970a) ((C58970a) f363591a.mo56226d()).mo56372aa(40038)).mo56389s("This build does not have a fragment with TabType %s", a.name());
            return;
        }
        if (this.f363640y.mo110979b() && !hVar.f379880j.isEmpty()) {
            this.f363614W.set(hVar.f379880j);
        }
        if ((this.f363616Y || this.f363598G) && this.f363607P != C139779t.HOME_SCREEN && a == (tVar = C139779t.HOME_SCREEN)) {
            this.f363607P = tVar;
        }
        C139779t tVar2 = this.f363606O;
        tVar2.getClass();
        m216581p(tVar2, a);
        this.f363595D.mo111113e(hVar, this.f363606O, a);
        this.f363606O = a;
        Activity activity = this.f363618c;
        int i = C28485y.f77298f;
        C28306ab.m52931g(activity.findViewById(16908290));
        m216580o();
        mo111144a().requestApplyInsets();
        this.f363592A.mo113537d();
        this.f363594C.mo113463t(this.f363606O);
    }

    /* renamed from: i */
    public final void mo111152i(C139779t tVar) {
        if (!this.f363611T.f101930a) {
            this.f363618c.getWindow().setStatusBarColor(C1924a.m5189h(C1878d.m5128a(this.f363619d.requireContext(), R.color.agsa_color_background), ((Integer) Map.EL.getOrDefault(this.f363633r, tVar, 0)).intValue()));
        }
    }

    /* renamed from: j */
    public final void mo111153j(boolean z) {
        if (mo111145b() != null) {
            C47558bi a = C47831fm.m85006a("GoogleAppActivityMainFragmentPeer#updateNavigationBarVisibilityWithCurrentTabHighlighted");
            try {
                View findViewById = mo111144a().findViewById(R.id.googleapp_navigation_bar_container);
                int i = 0;
                if (this.f363600I.mo111133a()) {
                    View findViewById2 = mo111144a().findViewById(R.id.googleapp_navigation_rail_container);
                    if (z) {
                        mo111148e();
                        findViewById2.setVisibility(0);
                    } else {
                        findViewById2.setVisibility(4);
                    }
                } else {
                    if (z) {
                        mo111148e();
                        findViewById.setVisibility(0);
                    } else {
                        findViewById.setVisibility(8);
                    }
                    C2043bi.m5524R(mo111144a().findViewById(R.id.googleapp_content_wrapper));
                }
                if (findViewById.getVisibility() != 0) {
                    i = this.f363618c.getColor(R.color.agsa_color_status_nav_bar_protection);
                }
                this.f363618c.getWindow().setNavigationBarColor(i);
                a.close();
                return;
            } catch (Throwable th) {
                C133431j.m216575a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ca, code lost:
        if (java.lang.Boolean.parseBoolean(r0) != false) goto L_0x00d7;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo111154k() {
        /*
            r6 = this;
            com.google.android.apps.search.googleapp.promomanager.f.m r0 = r6.f363592A
            r0.mo113537d()
            com.google.android.apps.search.googleapp.activity.a.f r0 = r6.f363595D
            com.google.android.apps.search.googleapp.u.t r1 = r6.f363606O
            r1.getClass()
            java.lang.Class<com.google.android.apps.search.googleapp.u.i> r2 = com.google.android.apps.search.googleapp.p10527u.C139768i.class
            j$.util.Optional r0 = r0.mo111111c(r1, r2)
            boolean r1 = r0.isPresent()
            r2 = 1
            if (r1 == 0) goto L_0x002b
            java.lang.Object r0 = r0.get()
            com.google.android.apps.search.googleapp.u.i r0 = (com.google.android.apps.search.googleapp.p10527u.C139768i) r0
            boolean r0 = r0.mo111224g()
            if (r0 != 0) goto L_0x0026
            goto L_0x002b
        L_0x0026:
            r0 = 3
            r6.m216579n(r0)
            return r2
        L_0x002b:
            com.google.android.apps.search.googleapp.u.t r0 = r6.f363606O
            r0.getClass()
            com.google.android.apps.search.googleapp.u.t r1 = com.google.android.apps.search.googleapp.p10527u.C139779t.HOME_SCREEN
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L_0x003d
            r6.m216579n(r2)
            return r1
        L_0x003d:
            com.google.android.apps.search.googleapp.activity.a.f r0 = r6.f363595D
            com.google.android.apps.search.googleapp.u.t r3 = r6.f363607P
            r3.getClass()
            boolean r0 = r0.mo111115g(r3)
            r3 = 2
            if (r0 == 0) goto L_0x0097
            r6.m216579n(r3)
            com.google.android.apps.search.googleapp.u.t r0 = r6.f363606O
            r0.getClass()
            com.google.android.apps.search.googleapp.u.t r1 = com.google.android.apps.search.googleapp.p10527u.C139779t.HOME_SCREEN
            r6.m216581p(r0, r1)
            com.google.android.apps.search.googleapp.activity.a.f r0 = r6.f363595D
            com.google.android.apps.search.googleapp.u.h r1 = com.google.android.apps.search.googleapp.p10527u.C139767h.f379869k
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.googleapp.u.f r1 = (com.google.android.apps.search.googleapp.p10527u.C139765f) r1
            com.google.android.apps.search.googleapp.u.t r3 = com.google.android.apps.search.googleapp.p10527u.C139779t.HOME_SCREEN
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.search.googleapp.u.h r4 = (com.google.android.apps.search.googleapp.p10527u.C139767h) r4
            int r3 = r3.f379907i
            r4.f379872b = r3
            int r3 = r4.f379871a
            r3 = r3 | r2
            r4.f379871a = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.search.googleapp.u.h r1 = (com.google.android.apps.search.googleapp.p10527u.C139767h) r1
            com.google.android.apps.search.googleapp.u.t r3 = r6.f363606O
            com.google.android.apps.search.googleapp.u.t r4 = com.google.android.apps.search.googleapp.p10527u.C139779t.HOME_SCREEN
            r0.mo111113e(r1, r3, r4)
            com.google.android.apps.search.googleapp.u.t r0 = com.google.android.apps.search.googleapp.p10527u.C139779t.HOME_SCREEN
            r6.f363606O = r0
            android.app.Activity r0 = r6.f363618c
            int r1 = com.google.android.libraries.logging.p2185ve.C28485y.f77298f
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            com.google.android.libraries.logging.p2185ve.C28306ab.m52931g(r0)
            r6.m216580o()
            return r2
        L_0x0097:
            com.google.android.apps.search.googleapp.u.t r0 = r6.f363606O
            com.google.android.apps.search.googleapp.u.t r4 = com.google.android.apps.search.googleapp.p10527u.C139779t.SEARCH
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00cd
            android.app.Activity r0 = r6.f363618c
            android.content.Intent r0 = r0.getIntent()
            com.google.common.f.a.d r4 = com.google.android.apps.search.googleapp.p10310h.C136126g.f370751a
            android.net.Uri r0 = r0.getData()
            if (r0 != 0) goto L_0x00be
            com.google.common.f.a.d r0 = com.google.android.apps.search.googleapp.p10310h.C136126g.f370751a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r4 = "intent does not contain data"
            r5 = 40575(0x9e7f, float:5.6858E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r5)).mo56386p(r4)
            goto L_0x00cd
        L_0x00be:
            java.lang.String r4 = "go_back_to_discover_feed_from_srp"
            java.lang.String r0 = r0.getQueryParameter(r4)
            if (r0 == 0) goto L_0x00cd
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L_0x00cd
            goto L_0x00d7
        L_0x00cd:
            com.google.android.apps.search.googleapp.u.t r0 = r6.f363606O
            com.google.android.apps.search.googleapp.u.t r4 = com.google.android.apps.search.googleapp.p10527u.C139779t.COLLECTIONS
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x010b
        L_0x00d7:
            r6.m216579n(r3)
            com.google.android.apps.search.googleapp.u.h r0 = com.google.android.apps.search.googleapp.p10527u.C139767h.f379869k
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.u.f r0 = (com.google.android.apps.search.googleapp.p10527u.C139765f) r0
            com.google.android.apps.search.googleapp.u.t r1 = com.google.android.apps.search.googleapp.p10527u.C139779t.HOME_SCREEN
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.search.googleapp.u.h r3 = (com.google.android.apps.search.googleapp.p10527u.C139767h) r3
            int r1 = r1.f379907i
            r3.f379872b = r1
            int r1 = r3.f379871a
            r1 = r1 | r2
            r3.f379871a = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.search.googleapp.u.h r0 = (com.google.android.apps.search.googleapp.p10527u.C139767h) r0
            r6.mo111150g(r0)
            com.google.android.apps.search.googleapp.homescreen.b.a r0 = r6.f363624i
            boolean r0 = r0.mo112802a()
            if (r0 != 0) goto L_0x010a
            android.app.Activity r0 = r6.f363618c
            r0.finishAndRemoveTask()
        L_0x010a:
            return r2
        L_0x010b:
            r6.m216579n(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.activity.C133444w.mo111154k():boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        p5462h.p5473f.p5475b.C69664n.m101060f(r15, "fragmentAnnotation");
        r7.put(r15, r11);
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111156m(java.lang.String r18, java.io.PrintWriter r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r17
            com.google.android.apps.search.googleapp.l.a.ae r3 = r2.f363615X     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.lang.String r4 = "prefix"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r4)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            com.google.android.apps.search.googleapp.l.a.aa r4 = new com.google.android.apps.search.googleapp.l.a.aa     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            com.google.android.apps.search.googleapp.l.a.c r5 = r3.f371306d     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.util.Map r6 = r5.f371310a     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.util.Map r7 = r5.f371311b     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.util.Map r5 = r5.f371312c     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            com.google.android.apps.search.googleapp.l.a.ac r5 = com.google.android.apps.search.googleapp.p10338l.p10339a.C136379ab.m221604a(r6, r7, r5)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            com.google.android.apps.search.googleapp.l.a.ac r6 = r3.f371305c     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            com.google.android.apps.search.googleapp.l.a.ac r5 = r5.mo112957a(r6)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            com.google.android.apps.search.googleapp.l.a.e r6 = r3.f371307e     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            com.google.android.libraries.p1623at.p1632e.C19559g.m37304c()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r7.<init>()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r8.<init>()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r9.<init>()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            h.a.a.c r10 = new h.a.a.c     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r11 = 10
            r10.<init>(r11)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            android.app.Activity r11 = r6.f371315a     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            boolean r12 = r11 instanceof android.support.p031v4.app.C0167am     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            if (r12 == 0) goto L_0x006b
            android.support.v4.app.am r11 = (android.support.p031v4.app.C0167am) r11     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            android.support.v4.app.FragmentManager r11 = r11.mo545jw()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            android.support.v4.app.cc r11 = r11.f634a     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.util.List r11 = r11.mo677i()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
        L_0x0052:
            boolean r12 = r11.hasNext()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            if (r12 == 0) goto L_0x006b
            java.lang.Object r12 = r11.next()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            android.support.v4.app.Fragment r12 = (android.support.p031v4.app.Fragment) r12     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.lang.String r13 = "fragment"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.util.List r12 = r6.mo112967a(r12)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r10.addAll(r12)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            goto L_0x0052
        L_0x006b:
            java.util.List r6 = p5462h.p5463a.C69540x.m100943a(r10)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
        L_0x0073:
            boolean r10 = r6.hasNext()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r11 = 0
            if (r10 == 0) goto L_0x0107
            java.lang.Object r10 = r6.next()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            android.support.v4.app.Fragment r10 = (android.support.p031v4.app.Fragment) r10     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            boolean r12 = r10 instanceof com.google.apps.tiktok.inject.C47231d     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            if (r12 == 0) goto L_0x0087
            com.google.apps.tiktok.inject.d r10 = (com.google.apps.tiktok.inject.C47231d) r10     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            goto L_0x0088
        L_0x0087:
            r10 = r11
        L_0x0088:
            if (r10 == 0) goto L_0x008f
            java.lang.Object r10 = r10.mo17754z()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            goto L_0x0090
        L_0x008f:
            r10 = r11
        L_0x0090:
            if (r10 == 0) goto L_0x0103
            boolean r12 = r10 instanceof com.google.android.apps.search.googleapp.p10338l.C136408b     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            if (r12 == 0) goto L_0x0099
            r11 = r10
            com.google.android.apps.search.googleapp.l.b r11 = (com.google.android.apps.search.googleapp.p10338l.C136408b) r11     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
        L_0x0099:
            if (r11 == 0) goto L_0x0103
            com.google.android.apps.search.googleapp.l.a r11 = r11.mo112985b()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            if (r11 == 0) goto L_0x0103
            java.lang.Class r12 = r10.getClass()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r12.getCanonicalName()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.lang.Class r12 = r10.getClass()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.lang.annotation.Annotation[] r12 = r12.getAnnotations()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.lang.String r13 = "fragmentPeer.javaClass.annotations"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            int r13 = r12.length     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r14 = 0
        L_0x00b7:
            if (r14 >= r13) goto L_0x00eb
            r15 = r12[r14]     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            boolean r2 = r15 instanceof com.google.android.apps.search.googleapp.p10338l.p10339a.C136388g     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r16 = r6
            java.lang.String r6 = "fragmentAnnotation"
            if (r2 == 0) goto L_0x00ce
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r6)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r7.put(r15, r11)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
        L_0x00c9:
            r2 = r17
            r6 = r16
            goto L_0x0073
        L_0x00ce:
            boolean r2 = r15 instanceof com.google.android.apps.search.googleapp.p10338l.p10339a.C136377a     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            if (r2 == 0) goto L_0x00d9
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r6)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r8.put(r15, r11)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            goto L_0x00c9
        L_0x00d9:
            boolean r2 = r15 instanceof com.google.android.apps.search.googleapp.p10338l.p10339a.C136383b     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            if (r2 == 0) goto L_0x00e4
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r6)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r9.put(r15, r11)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            goto L_0x00c9
        L_0x00e4:
            int r14 = r14 + 1
            r2 = r17
            r6 = r16
            goto L_0x00b7
        L_0x00eb:
            r16 = r6
            java.lang.Class r2 = r10.getClass()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.lang.String r2 = r2.getCanonicalName()     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.lang.String r6 = "<unknown fragment peer class>"
            if (r2 != 0) goto L_0x00fa
            r2 = r6
        L_0x00fa:
            com.google.android.apps.search.googleapp.l.a.d r6 = new com.google.android.apps.search.googleapp.l.a.d     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r6.<init>(r2)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r9.put(r6, r11)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            goto L_0x00c9
        L_0x0103:
            r2 = r17
            goto L_0x0073
        L_0x0107:
            com.google.android.apps.search.googleapp.l.a.ac r2 = com.google.android.apps.search.googleapp.p10338l.p10339a.C136379ab.m221604a(r7, r8, r9)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            com.google.android.apps.search.googleapp.l.a.ac r2 = r5.mo112957a(r2)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            h.c.o r5 = r3.f371308f     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r4.<init>(r2, r5)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            kotlinx.coroutines.aw r2 = r3.f371309g     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            com.google.android.apps.search.googleapp.l.a.ad r3 = new com.google.android.apps.search.googleapp.l.a.ad     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r3.<init>(r4, r0, r11)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r0 = 3
            com.google.common.util.concurrent.cx r0 = kotlinx.coroutines.p5578d.C71663i.m104692e(r2, r11, r3, r0)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r3 = 4
            java.lang.Object r0 = r0.get(r3, r2)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            r1.append(r0)     // Catch:{ ExecutionException -> 0x0132, InterruptedException -> 0x0130, TimeoutException -> 0x012e }
            return
        L_0x012e:
            r0 = move-exception
            goto L_0x0133
        L_0x0130:
            r0 = move-exception
            goto L_0x0133
        L_0x0132:
            r0 = move-exception
        L_0x0133:
            java.lang.String r2 = com.google.android.apps.search.googleapp.p10338l.p10339a.C136382ae.f371303a
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ": "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.append(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.activity.C133444w.mo111156m(java.lang.String, java.io.PrintWriter):void");
    }

    /* renamed from: l */
    public final boolean mo111155l() {
        C133376f fVar = this.f363595D;
        C139779t tVar = this.f363606O;
        tVar.getClass();
        return ((Boolean) fVar.mo111110b(tVar).map(C133434m.f363580a).orElse(true)).booleanValue();
    }
}
