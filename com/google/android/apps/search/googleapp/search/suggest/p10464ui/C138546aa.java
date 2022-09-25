package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.binaries.satin.app.anh;
import com.google.android.apps.gsa.binaries.satin.app.aqe;
import com.google.android.apps.gsa.shared.logger.p7064i.C89922b;
import com.google.android.apps.search.googleapp.p10516t.p10520d.C139697a;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139701a;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.apps.search.googleapp.pixelsuggest.C136895e;
import com.google.android.apps.search.googleapp.search.p10412h.p10414b.C137470a;
import com.google.android.apps.search.googleapp.search.p10412h.p10414b.C137471b;
import com.google.android.apps.search.googleapp.search.suggest.C138014af;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137916ab;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137917ac;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137918ad;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137922ah;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137927am;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137929ao;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138057n;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138058o;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138068y;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10465a.C138545a;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138576a;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138577b;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138578c;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138579d;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138580e;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138582g;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138583h;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138584i;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138585j;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138586k;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138587l;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138588m;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138590o;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138591p;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138623ab;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138645ax;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138649ba;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138651d;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138657j;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138663p;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138665r;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138671x;
import com.google.android.apps.search.googleapp.search.suggest.plugins.p10454a.C138135a;
import com.google.android.apps.search.googleapp.search.suggest.plugins.p10454a.C138139e;
import com.google.android.apps.search.googleapp.search.suggest.plugins.p10454a.C138142h;
import com.google.android.apps.search.googleapp.search.suggest.plugins.p10454a.C138146l;
import com.google.android.apps.search.googleapp.search.suggest.plugins.p10455b.p10456a.C138149b;
import com.google.android.apps.search.googleapp.search.suggest.plugins.p10457c.C138151b;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.p3638c.C46753j;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4552o.aod;
import com.google.common.p4552o.apd;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.List;
import java.util.Locale;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.aa */
/* compiled from: PG */
public final class C138546aa extends C138600bi implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C138558am f376830a;

    /* renamed from: c */
    private Context f376831c;

    /* renamed from: d */
    private final C2393x f376832d = new C2393x(this);

    /* renamed from: e */
    private boolean f376833e;

    @Deprecated
    public C138546aa() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C138558am mo17754z() {
        C138558am amVar = this.f376830a;
        if (amVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f376833e) {
            return amVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114321b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f376831c == null) {
            this.f376831c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f376831c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f376832d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f122869b.mo51373a("Fragment:onActivityResult");
        try {
            mo51110k(i, i2, intent);
            C138558am a2 = mo17754z();
            if (i == 1) {
                C137916ab abVar = a2.f376864e;
                C46459k.m82829b(C47638k.m84752c((List) Collection.EL.stream(((C137929ao) abVar).f375261c).map(C137917ac.f375247a).collect(Collectors.toCollection(C137922ah.f375253a))).mo51520a(C47810es.m84978r(new C137918ad((C137929ao) abVar)), ((C137929ao) abVar).f375262d), "Failed to clear source caches", new Object[0]);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C138677z.m225243a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138677z.m225243a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C138558am a = mo17754z();
            a.f376865f.mo50429i(a.f376856C);
            a.f376865f.mo50429i(a.f376857D);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138677z.m225243a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C47558bi a;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C138558am a2 = mo17754z();
            C138057n nVar = a2.f376873n;
            nVar.f375632c = true;
            nVar.f375633d = true;
            C47558bi a3 = C47831fm.m85006a("SuggestionsFragmentPeer#onCreateView");
            try {
                View inflate = layoutInflater.inflate(R.layout.googleapp_suggestions_fragment, viewGroup, false);
                if (a2.f376884y) {
                    inflate.setBackgroundResource(R.color.googleapp_pixel_suggestions_fragment_background);
                    inflate.findViewById(R.id.googleapp_hairline).setVisibility(8);
                    int dimensionPixelOffset = inflate.getResources().getDimensionPixelOffset(R.dimen.googleapp_pixel_suggestions_padding_vertical);
                    int dimensionPixelOffset2 = inflate.getResources().getDimensionPixelOffset(R.dimen.googleapp_pixel_suggestions_padding_horizontal);
                    RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.googleapp_suggestions);
                    recyclerView.setPaddingRelative(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
                    recyclerView.setClipToPadding(false);
                }
                C28306ab abVar = a2.f376874o;
                abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(108192)));
                C138547ab abVar2 = (C138547ab) C138548ac.f376834c.createBuilder();
                C139704d a4 = C139704d.m227141a(a2.f376862c.f376845b);
                if (a4 == null) {
                    a4 = C139704d.UNKNOWN;
                }
                abVar2.copyOnWrite();
                C138548ac acVar = (C138548ac) abVar2.instance;
                acVar.f376837b = a4.f379715p;
                acVar.f376836a |= 1;
                C138548ac acVar2 = (C138548ac) abVar2.build();
                if (a2.f376861b.getChildFragmentManager().f634a.mo671c("searchBox") == null) {
                    a = C47831fm.m85006a("SuggestionsFragmentPeer#attachSearchBoxFragment");
                    C0154a aVar = new C0154a(a2.f376861b.getChildFragmentManager());
                    AccountId accountId = a2.f376863d;
                    C69664n.m101061g(accountId, "accountId");
                    C69664n.m101061g(acVar2, "argument");
                    C138575b bVar = new C138575b();
                    C68324h.m98669f(bVar);
                    C47247a.m84047b(bVar, accountId);
                    C47243l.m84039a(bVar, acVar2);
                    aVar.mo511h(R.id.googleapp_search_box_fragment_container, bVar, "searchBox", 1);
                    aVar.mo509f();
                    a.close();
                }
                RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.googleapp_suggestions);
                C28306ab abVar3 = a2.f376874o;
                abVar3.mo33801b(recyclerView2, abVar3.f76990a.mo33805a(C28427h.m53115a(108179)));
                recyclerView2.setLayoutManager(new C138564ap(a2, a2.f376861b.getContext()));
                C46753j jVar = new C46753j();
                jVar.f122102a = a2.f376867h;
                recyclerView2.setAdapter(jVar.mo50770a());
                C2043bi.m5555ai(recyclerView2, C138554ai.f376849a);
                if (a2.f376854A.f376822a.mo50378a(C62912at.f169862a) == null) {
                    C139704d a5 = C139704d.m227141a(a2.f376862c.f376845b);
                    if (a5 == null) {
                        a5 = C139704d.UNKNOWN;
                    }
                    a2.mo114331i(a5, false);
                }
                if (bundle != null) {
                    a2.mo114335m(a2.f376854A.mo114315d(), a2.f376854A.mo114312a());
                } else {
                    if (a2.f376861b.getView() != null) {
                        a2.mo114329g();
                    }
                    a2.f376866g.mo50707a(new C46719bc(((C137929ao) a2.f376864e).f375259a, C137927am.f375258a, "suggestions"), a2.f376855B);
                }
                if (!a2.f376858E.f101930a) {
                    C2043bi.m5555ai(inflate, new C138555aj(inflate));
                }
                a2.f376872m.mo115167b(new C138556ak(a2));
                a3.close();
                if (inflate != null) {
                    C47831fm.m85019n();
                    return inflate;
                }
                throw new NullPointerException("Fragment cannot use Event annotations with null view!");
            } catch (Throwable th) {
                a3.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C138677z.m225243a(th2, th3);
            }
            throw th2;
        }
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            mo17754z().f376859F = null;
            this.f376833e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C138677z.m225243a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C138677z.m225243a(th, th);
        }
        throw th;
    }

    public final void onHiddenChanged(boolean z) {
        C138558am a = mo17754z();
        if (!z && a.mo114327e().getItemCount() >= 0) {
            a.f376869j.mo113759d();
            a.f376870k.mo115170a();
        }
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C138558am a = mo17754z();
            if (a.f376861b.isVisible()) {
                C138057n nVar = a.f376873n;
                if (!nVar.f375632c) {
                    C138058o oVar = nVar.f375630a;
                    Duration ofNanos = Duration.ofNanos(nVar.f375631b.mo26872d());
                    C37215b bVar = oVar.f375634a;
                    C37252a d = C37182a.f97802ah.mo40811d(ofNanos.toNanos());
                    ((C37253b) d).mo40795s("surface", "AGA");
                    bVar.mo19974a(d);
                }
                nVar.f375632c = true;
                nVar.f375633d = true;
            }
            e.close();
            return;
        } catch (Throwable th) {
            C138677z.m225243a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f122869b.mo51381i();
        try {
            mo51118s();
            C138558am a = mo17754z();
            if (a.f376861b.isVisible()) {
                boolean z = a.f376861b.getActivity() != null && a.f376861b.getActivity().isChangingConfigurations();
                C138057n nVar = a.f376873n;
                if (!z && nVar.f375632c && nVar.f375633d) {
                    apd b = a.f376868i.mo114113b(a.f376854A.mo114315d(), aod.ABANDONMENT);
                    C138057n nVar2 = a.f376873n;
                    nVar2.f375630a.mo114103a(b, Duration.ofNanos(nVar2.f375631b.mo26872d()), "AGA");
                    a.f376864e.mo114047c(a.f376868i.mo114115d(Optional.empty()), aod.ABANDONMENT);
                }
            }
            a.f376873n.f375632c = false;
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138677z.m225243a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C138558am a = mo17754z();
            C47393f.m84233d(this, C138584i.class, new C138572ax(a));
            C47393f.m84233d(this, C138585j.class, new C138573ay(a));
            C47393f.m84233d(this, C138587l.class, new C138574az(a));
            C47393f.m84233d(this, C138588m.class, new C138592ba(a));
            C47393f.m84233d(this, C138591p.class, new C138593bb(a));
            C47393f.m84233d(this, C138582g.class, new C138594bc(a));
            C47393f.m84233d(this, C138577b.class, new C138595bd(a));
            C47393f.m84233d(this, C138576a.class, new C138596be());
            C47393f.m84233d(this, C138579d.class, new C138597bf(a));
            C47393f.m84233d(this, C138580e.class, new C138565aq(a));
            C47393f.m84233d(this, C138586k.class, new C138566ar(a));
            C47393f.m84233d(this, C138583h.class, new C138567as(a));
            C47393f.m84233d(this, C138590o.class, new C138568at(a));
            C47393f.m84233d(this, C138578c.class, new C138569au(a));
            C47393f.m84233d(this, C138146l.class, new C138570av(a));
            C47393f.m84233d(this, C138135a.class, new C138571aw(a));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138677z.m225243a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.google.android.apps.search.googleapp.search.suggest.a.ab, java.lang.Object] */
    public final void onAttach(Context context) {
        C138546aa aaVar = this;
        aaVar.f122869b.mo51381i();
        try {
            if (!aaVar.f376833e) {
                super.onAttach(context);
                if (aaVar.f376830a == null) {
                    Object jN = mo114387d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C138546aa) {
                        C138546aa aaVar2 = (C138546aa) fragment;
                        C68225k.m98532d(aaVar2);
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C138552ag agVar = (C138552ag) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C138552ag.f376842f, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(agVar);
                        C21370a aVar = (C21370a) ((C74176nj) jN).f206677a.i.mo17428b();
                        AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                        ? iA = ((C74176nj) jN).f206730b.mo66426iA();
                        C46439e eVar = (C46439e) ((C74176nj) jN).f206942f.mo17428b();
                        C46801dp dpVar = (C46801dp) ((C74176nj) jN).f207084k.mo17428b();
                        C58490gz j = C58495hd.m89896j(11);
                        C138014af afVar = C138014af.SPYW_IN_CONTEXT_CONTROL;
                        aqe aqe = ((C74176nj) jN).f206730b.f198027a;
                        j.mo55429h(afVar, new C138142h(aqe.f199228b.f198663m, aqe.f199472ff));
                        j.mo55429h(C138014af.SPYW_IN_CONTEXT_CONTROL_HEADER, new C138139e(((C74176nj) jN).f206730b.f198027a.f199497gD));
                        j.mo55429h(C138014af.WEATHER, new C138149b());
                        C138014af afVar2 = C138014af.CORE;
                        C69464a aVar2 = ((C74176nj) jN).f206691aN;
                        anh anh = ((C74176nj) jN).f206730b;
                        j.mo55429h(afVar2, new C138657j(aVar2, anh.f198663m, anh.f198102bV, anh.f198027a.f199543gx));
                        C138014af afVar3 = C138014af.HEADER;
                        anh anh2 = ((C74176nj) jN).f206730b;
                        j.mo55429h(afVar3, new C138671x(anh2.f198102bV, anh2.f198103bW));
                        C138014af afVar4 = C138014af.APP_STRIP;
                        C69464a aVar3 = ((C74176nj) jN).f206836d.f205391d;
                        anh anh3 = ((C74176nj) jN).f206730b;
                        C69464a aVar4 = anh3.f198663m;
                        C69464a aVar5 = anh3.f198027a.f199472ff;
                        C69464a aVar6 = ((C74176nj) jN).f207092s;
                        C69464a aVar7 = ((C74176nj) jN).f206677a.b.f200496kg;
                        C69464a aVar8 = aVar5;
                        C69464a aVar9 = aVar6;
                        C69464a aVar10 = aVar3;
                        C69464a aVar11 = aVar4;
                        j.mo55429h(afVar4, new C138651d(aVar10, aVar11, aVar8, aVar9, aVar7, anh3.f198101bU, anh3.f198104bX));
                        C138014af afVar5 = C138014af.UNIVERSAL;
                        C69464a aVar12 = ((C74176nj) jN).f206836d.f205391d;
                        C69464a aVar13 = ((C74176nj) jN).f206690aM;
                        C69464a aVar14 = ((C74176nj) jN).f207092s;
                        anh anh4 = ((C74176nj) jN).f206730b;
                        C69464a aVar15 = anh4.f198663m;
                        C46801dp dpVar2 = dpVar;
                        C69464a aVar16 = aVar15;
                        C69464a aVar17 = aVar12;
                        C69464a aVar18 = aVar13;
                        C69464a aVar19 = aVar14;
                        j.mo55429h(afVar5, new C138645ax(aVar17, aVar18, aVar19, aVar16, ((C74176nj) jN).f206692aO, anh4.f198102bV, anh4.f198027a.f199543gx));
                        j.mo55429h(C138014af.DIVIDER, new C138665r());
                        C138014af afVar6 = C138014af.DISCOVER_PROMO;
                        C69464a aVar20 = ((C74176nj) jN).f206836d.f205391d;
                        anh anh5 = ((C74176nj) jN).f206730b;
                        j.mo55429h(afVar6, new C138663p(aVar20, anh5.f198663m, anh5.f198027a.f199472ff));
                        C138014af afVar7 = C138014af.MANAGE_ACTIVITY;
                        anh anh6 = ((C74176nj) jN).f206730b;
                        j.mo55429h(afVar7, new C138623ab(anh6.f198663m, anh6.f198027a.f199381du));
                        j.mo55429h(C138014af.XUIKIT, new C138151b(((C74176nj) jN).f206693aP));
                        aaVar = this;
                        aaVar.f376830a = new C138558am(aaVar2, agVar, aVar, accountId, iA, eVar, dpVar2, new C138649ba(j.mo55427f(true)), (C138068y) ((C74176nj) jN).f206730b.f198027a.f199382dv.mo17428b(), new C137470a(C139697a.m227129a(((C74176nj) jN).f206730b.f198027a.mo66885eE()), (C137471b) ((C74176nj) jN).f206677a.d.f201635co.mo17428b(), (C89922b) ((C74176nj) jN).f206677a.b.f200016bd.mo17428b(), (C21370a) ((C74176nj) jN).f206677a.i.mo17428b()), (C139701a) ((C74176nj) jN).f206677a.b.f200102dJ.mo17428b(), ((C74176nj) jN).f206677a.c.mo67649e(), (C139680b) ((C74176nj) jN).f206836d.f205429k.mo17428b(), ((C74176nj) jN).mo69691eb(), (C138057n) ((C74176nj) jN).f206730b.f198027a.f199496gC.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C136895e) ((C74176nj) jN).f206677a.b.f200496kg.mo17428b(), ((C74176nj) jN).f206677a.d.mo67815dJ(), ((C74176nj) jN).f206730b.mo66110cC(), (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b(), ((C74176nj) jN).f206730b.mo66108cA(), (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b(), (C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b(), ((C74176nj) jN).mo69702em(), ((Boolean) ((C74176nj) jN).f206730b.f198102bV.mo17428b()).booleanValue(), ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199543gx.mo17428b()).booleanValue(), new C138545a((InstanceStateStoreFactory) ((C74176nj) jN).f206689aL.mo17428b(), (InstanceStateStoreFactory) ((C74176nj) jN).f206694aQ.mo17428b(), (InstanceStateStoreFactory) ((C74176nj) jN).f206695aR.mo17428b(), (InstanceStateStoreFactory) ((C74176nj) jN).f206696aS.mo17428b(), (InstanceStateStoreFactory) ((C74176nj) jN).f206680aC.mo17428b(), (InstanceStateStoreFactory) ((C74176nj) jN).f206697aT.mo17428b(), (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b()));
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(aaVar.f122869b, aaVar.f376832d));
                    } else {
                        String obj = C138558am.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = aaVar.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            th = th;
            Throwable th2 = th;
            C47831fm.m85019n();
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
