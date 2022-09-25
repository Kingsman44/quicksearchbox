package com.google.android.apps.search.transcription.p10679ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.search.transcription.C141741b;
import com.google.android.apps.search.transcription.p10670f.C141768a;
import com.google.android.apps.search.transcription.p10670f.C141786ae;
import com.google.android.apps.search.transcription.p10670f.C141804aw;
import com.google.android.apps.search.transcription.p10670f.C141808b;
import com.google.android.apps.search.transcription.p10670f.C141850br;
import com.google.android.apps.search.transcription.p10670f.C141851bs;
import com.google.android.apps.search.transcription.p10670f.C141853bu;
import com.google.android.apps.search.transcription.p10670f.C141915i;
import com.google.android.apps.search.transcription.p10670f.p10673b.C141811c;
import com.google.android.apps.search.transcription.p10670f.p10673b.C141813e;
import com.google.android.apps.search.transcription.p10670f.p10673b.C141814f;
import com.google.android.apps.search.transcription.p10670f.p10673b.C141820l;
import com.google.android.apps.search.transcription.p10670f.p10673b.C141824p;
import com.google.android.apps.search.transcription.p10670f.p10673b.C141826r;
import com.google.android.apps.search.transcription.p10670f.p10673b.C141827s;
import com.google.android.apps.search.transcription.p10670f.p10673b.C141828t;
import com.google.android.apps.search.transcription.p10670f.p10673b.C141829u;
import com.google.android.apps.search.transcription.p10679ui.C141952s;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2884l.C37206a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.aqg;
import com.google.common.p4552o.aqh;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.HashMap;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.transcription.ui.n */
/* compiled from: PG */
public final class C141947n extends C141936c implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C141952s f385177a;

    /* renamed from: c */
    private Context f385178c;

    /* renamed from: d */
    private final C2393x f385179d = new C2393x(this);

    /* renamed from: e */
    private boolean f385180e;

    @Deprecated
    public C141947n() {
        C19559g.m37304c();
    }

    /* renamed from: f */
    static C141947n m230436f(C141741b bVar) {
        C141947n nVar = new C141947n();
        C68324h.m98669f(nVar);
        C47243l.m84039a(nVar, bVar);
        return nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo116906b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f385178c == null) {
            this.f385178c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f385178c;
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
        return this.f385179d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C141952s mo17754z() {
        C141952s sVar = this.f385177a;
        if (sVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f385180e) {
            return sVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141946m.m230435a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Throwable th;
        String str;
        String str2;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C141952s j = mo17754z();
            C141829u uVar = j.f385187c;
            C141741b bVar = j.f385190f;
            Intent intent = j.f385186b.getIntent();
            String d = C141786ae.m230050d(j.f385186b);
            long j2 = bVar.f384722b;
            HashMap hashMap = uVar.f384903c;
            Long valueOf = Long.valueOf(j2);
            C141826r rVar = (C141826r) hashMap.get(valueOf);
            if (rVar == null) {
                C141827s sVar = uVar.f384902b;
                C46778cv cvVar = (C46778cv) sVar.f384896a.mo17428b();
                cvVar.getClass();
                C60887da daVar = (C60887da) sVar.f384897b.mo17428b();
                daVar.getClass();
                C37215b bVar2 = (C37215b) sVar.f384898c.mo17428b();
                bVar2.getClass();
                C141804aw awVar = (C141804aw) sVar.f384899d.mo17428b();
                awVar.getClass();
                bVar.getClass();
                C141826r rVar2 = r4;
                C141826r rVar3 = new C141826r(cvVar, daVar, bVar2, awVar, bVar);
                C58838bb.m90883r(rVar2.f384892g == null);
                String e = C141786ae.m230051e(intent);
                boolean g = C141786ae.m230053g(intent);
                Optional empty = Optional.empty();
                if ("com.google.android.apps.search.transcription.embedded".equals(d)) {
                    empty = C141786ae.m230048b(intent);
                }
                Optional c = C141786ae.m230049c(intent);
                C141850br y = C141851bs.m230219y();
                if (empty.isPresent()) {
                    y.mo116801f(empty);
                    y.mo116811p(true);
                }
                if (c.isPresent()) {
                    y.mo116800e(c);
                }
                y.mo116809n(C141786ae.m230047a(intent));
                y.mo116808m(e);
                ((C141915i) y).f385049b = d;
                ((C141915i) y).f385053f = 2;
                y.mo116814s(g);
                y.mo116806k(true);
                y.mo116815t(true);
                y.mo116817v(5000);
                C141768a b = C141808b.m230094b();
                b.mo116715b(C39226b.TAG_TRANSCRIPTION_VOICE_RECOGNITION);
                y.mo116799d(Optional.m71637of(b.mo116714a()));
                C141851bs w = y.mo116818w();
                rVar2.mo116792f(new C141811c(w.mo116830l()));
                if ((rVar2.f384890e.f384721a & 2) != 0) {
                    C37215b bVar3 = rVar2.f384887b;
                    C37252a j3 = C37206a.f98779b.mo40816j("requestId", Long.toString(rVar2.f384891f));
                    C62940bt btVar = aqh.f159745g;
                    aqg aqg = (aqg) aqh.f159744f.createBuilder();
                    long longValue = Long.valueOf(rVar2.f384890e.f384723c).longValue();
                    aqg.copyOnWrite();
                    aqh aqh = (aqh) aqg.instance;
                    aqh.f159747a |= 1;
                    aqh.f159748b = longValue;
                    long j4 = rVar2.f384891f;
                    aqg.copyOnWrite();
                    aqh aqh2 = (aqh) aqg.instance;
                    aqh2.f159747a |= 2;
                    aqh2.f159749c = j4;
                    String n = w.mo116832n();
                    aqg.copyOnWrite();
                    aqh aqh3 = (aqh) aqg.instance;
                    n.getClass();
                    aqh3.f159747a |= 4;
                    aqh3.f159750d = n;
                    String l = w.mo116830l();
                    aqg.copyOnWrite();
                    aqh aqh4 = (aqh) aqg.instance;
                    l.getClass();
                    aqh4.f159747a |= 8;
                    aqh4.f159751e = l;
                    ((C37253b) j3).mo40792p(btVar, (aqh) aqg.build());
                    bVar3.mo19974a(j3);
                    str = "android.speech.extra.PROMPT";
                } else {
                    C37215b bVar4 = rVar2.f384887b;
                    C37252a j5 = C37206a.f98770a.mo40816j("requestId", Long.toString(rVar2.f384891f));
                    C62940bt btVar2 = aqh.f159745g;
                    aqg aqg2 = (aqg) aqh.f159744f.createBuilder();
                    long j6 = rVar2.f384891f;
                    aqg2.copyOnWrite();
                    aqh aqh5 = (aqh) aqg2.instance;
                    str = "android.speech.extra.PROMPT";
                    aqh5.f159747a |= 2;
                    aqh5.f159749c = j6;
                    String n2 = w.mo116832n();
                    aqg2.copyOnWrite();
                    aqh aqh6 = (aqh) aqg2.instance;
                    n2.getClass();
                    aqh6.f159747a |= 4;
                    aqh6.f159750d = n2;
                    String l2 = w.mo116830l();
                    aqg2.copyOnWrite();
                    aqh aqh7 = (aqh) aqg2.instance;
                    l2.getClass();
                    aqh7.f159747a |= 8;
                    aqh7.f159751e = l2;
                    ((C37253b) j5).mo40792p(btVar2, (aqh) aqg2.build());
                    bVar4.mo19974a(j5);
                }
                if (w.mo116839u()) {
                    rVar2.f384887b.mo19974a(C37206a.f98793p.mo40816j("requestId", Long.toString(rVar2.f384891f)));
                }
                if (w.mo116826h().isPresent()) {
                    rVar2.f384887b.mo19974a(C37206a.f98794q.mo40816j("requestId", Long.toString(rVar2.f384891f)));
                }
                rVar2.f384893h = rVar2.f384889d.mo116758a(w, new C141820l(rVar2), new C141824p(rVar2));
                rVar2.f384892g = rVar2.f384888c.mo19399b(C47810es.m84978r(new C141814f(rVar2)));
                rVar2.mo116790d("start transcription", rVar2.f384892g);
                uVar.f384903c.put(valueOf, rVar2);
                rVar = rVar2;
            } else {
                str = "android.speech.extra.PROMPT";
            }
            C46719bc bcVar = new C46719bc(uVar.f384901a, new C141828t(rVar), C141826r.m230134b(j2));
            View inflate = layoutInflater.inflate(R.layout.transcription_fragment, viewGroup, false);
            TextView textView = (TextView) inflate.findViewById(R.id.transcription_intent_api_language);
            TextView textView2 = (TextView) inflate.findViewById(R.id.transcription_intent_api_text);
            String str3 = str;
            if (j.f385186b.getIntent().hasExtra(str3)) {
                str2 = j.f385186b.getIntent().getStringExtra(str3);
            } else {
                str2 = j.f385186b.getString(R.string.transcription_app_start_speaking);
            }
            textView2.setText(str2);
            C141938e eVar = new C141938e(inflate);
            eVar.mo116913c();
            eVar.mo116911a(new C47591co(j.f385189e, "Clicked 'mic image' to stop listening", new C141948o(j)), j.f385186b.getString(R.string.transcription_app_tap_to_stop_listening));
            Button button = (Button) inflate.findViewById(R.id.transcription_retry_button);
            button.setOnClickListener(new C47591co(j.f385189e, "Clicked 'Try again button'", new C141949p(j)));
            j.f385188d.mo50708b(bcVar, C46788de.DONT_CARE, new C141952s.C141953a(textView, textView2, eVar, button));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th2) {
            C141946m.m230435a(th, th2);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f385180e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141946m.m230435a(th, th);
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
            C141946m.m230435a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        C60870cx cxVar;
        this.f122869b.mo51381i();
        try {
            mo51118s();
            C141952s j = mo17754z();
            if (!j.f385186b.isChangingConfigurations()) {
                C141826r rVar = (C141826r) j.f385187c.f384903c.remove(Long.valueOf(j.f385190f.f384722b));
                if (!(rVar == null || (cxVar = rVar.f384892g) == null)) {
                    rVar.mo116790d("remove state", C47638k.m84751b(cxVar).mo51520a(new C141813e(rVar), rVar.f384888c));
                }
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141946m.m230435a(th, th);
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

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f385180e) {
                super.onAttach(context);
                if (this.f385177a == null) {
                    Object jN = mo116905a().mo17653jN();
                    Activity activity = (Activity) ((C74178nm) jN).f207136c.f205710e.mo17428b();
                    C141829u uVar = (C141829u) ((C74178nm) jN).f207130a.d.f201708eH.mo17428b();
                    C46801dp dpVar = (C46801dp) ((C74178nm) jN).f207138e.mo17428b();
                    C47770dh dhVar = (C47770dh) ((C74178nm) jN).f207130a.a.f202593X.mo17428b();
                    Bundle a = ((C74178nm) jN).mo70044a();
                    C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C141741b bVar = (C141741b) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C141741b.f384719d, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                    C68225k.m98532d(bVar);
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C141947n) {
                        C141947n nVar = (C141947n) fragment;
                        C68225k.m98532d(nVar);
                        this.f385177a = new C141952s(activity, uVar, dpVar, dhVar, bVar, nVar, (C141853bu) ((C74178nm) jN).f207130a.d.f201709eI.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f385179d));
                    } else {
                        String obj = C141952s.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
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
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C141946m.m230435a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
