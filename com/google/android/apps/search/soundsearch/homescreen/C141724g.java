package com.google.android.apps.search.soundsearch.homescreen;

import android.content.Intent;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import com.google.android.apps.search.soundsearch.p10656e.C141661a;
import com.google.android.apps.search.soundsearch.p10657f.p10658a.p10659a.C141667c;
import com.google.android.apps.search.soundsearch.p10660g.p10661a.C141671a;
import com.google.android.apps.search.soundsearch.p10660g.p10661a.C141673c;
import com.google.android.apps.search.soundsearch.p10660g.p10661a.C141677g;
import com.google.android.apps.search.soundsearch.p10660g.p10661a.C141679i;
import com.google.android.apps.search.soundsearch.p10660g.p10661a.C141680j;
import com.google.android.apps.search.soundsearch.p10660g.p10661a.C141684n;
import com.google.android.apps.search.soundsearch.p10664h.C141706b;
import com.google.android.apps.search.soundsearch.p10664h.C141707c;
import com.google.android.apps.search.soundsearch.p10664h.C141708d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.p2872a.p2883k.C37203a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.audio.p4107b.p4108a.C54586i;
import com.google.audio.p4107b.p4108a.C54591n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.speech.p5224k.p5225a.C67184ab;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.soundsearch.homescreen.g */
/* compiled from: PG */
public final class C141724g {

    /* renamed from: a */
    public static final C59071e f384675a = C59071e.m91332i("com.google.android.apps.search.soundsearch.homescreen.g");

    /* renamed from: b */
    public static final Duration f384676b = Duration.ofSeconds(3);

    /* renamed from: c */
    public final C141720c f384677c;

    /* renamed from: d */
    public final C141680j f384678d;

    /* renamed from: e */
    public final C46801dp f384679e;

    /* renamed from: f */
    public final C21370a f384680f;

    /* renamed from: g */
    public final C141726i f384681g;

    /* renamed from: h */
    public final boolean f384682h;

    /* renamed from: i */
    public final String[] f384683i;

    /* renamed from: j */
    public C141684n f384684j = C141684n.f384546f;

    /* renamed from: k */
    public final C141667c f384685k;

    /* renamed from: l */
    private final AccountId f384686l;

    /* renamed from: m */
    private final C47770dh f384687m;

    public C141724g(AccountId accountId, C141720c cVar, C141680j jVar, C47770dh dhVar, C21370a aVar, C46801dp dpVar, C141667c cVar2, boolean z) {
        this.f384686l = accountId;
        this.f384677c = cVar;
        this.f384678d = jVar;
        this.f384687m = dhVar;
        this.f384680f = aVar;
        this.f384679e = dpVar;
        this.f384685k = cVar2;
        this.f384682h = z;
        this.f384681g = new C141726i();
        this.f384683i = cVar.getContext().getResources().getStringArray(R.array.soundsearch_progress_texts);
    }

    /* renamed from: c */
    public static C141720c m229958c(AccountId accountId) {
        C141720c cVar = new C141720c();
        C68324h.m98669f(cVar);
        C47247a.m84047b(cVar, accountId);
        return cVar;
    }

    /* renamed from: a */
    public final View mo116680a() {
        View view = this.f384677c.getView();
        view.getClass();
        return view;
    }

    /* renamed from: b */
    public final AudioVisualizerView mo116681b() {
        return (AudioVisualizerView) mo116680a().findViewById(R.id.soundsearch_audio_visualizer_view);
    }

    /* renamed from: d */
    public final void mo116682d() {
        AudioVisualizerView b = mo116681b();
        ((C59052c) ((C59052c) AudioVisualizerView.f384649a.mo56224b()).mo56372aa(41777)).mo56386p("Stop animation");
        b.f384651c.cancel();
        mo116680a().findViewById(R.id.soundsearch_listening_container).setVisibility(8);
    }

    /* renamed from: e */
    public final void mo116683e(Optional optional) {
        mo116682d();
        C141680j jVar = this.f384678d;
        ((C59052c) ((C59052c) C141680j.f384536a.mo56224b()).mo56372aa(41801)).mo56386p("#stopListening");
        jVar.f384538c.execute(C47810es.m84977q(new C141673c(jVar)));
        if (optional.isPresent()) {
            C54591n nVar = ((C67184ab) optional.get()).f182607b;
            if (nVar == null) {
                nVar = C54591n.f143323c;
            }
            if (nVar.f143325a.size() == 1) {
                C54591n nVar2 = ((C67184ab) optional.get()).f182607b;
                if (nVar2 == null) {
                    nVar2 = C54591n.f143323c;
                }
                Intent a = C141661a.m229884a((C54586i) nVar2.f143325a.get(0));
                if (!C141661a.m229886c(this.f384677c.getContext(), a)) {
                    Intent b = C141661a.m229885b((C54586i) nVar2.f143325a.get(0));
                    if (b != null && C141661a.m229886c(this.f384677c.getContext(), b)) {
                        C47709i.m84861a(this.f384677c, b);
                        this.f384677c.getActivity().finish();
                        return;
                    }
                } else {
                    C47709i.m84861a(this.f384677c, a);
                    this.f384677c.getActivity().finish();
                    return;
                }
            }
        }
        FragmentManager childFragmentManager = this.f384677c.getChildFragmentManager();
        C141707c cVar = (C141707c) C141708d.f384603d.createBuilder();
        if (optional.isPresent()) {
            C54591n nVar3 = ((C67184ab) optional.get()).f182607b;
            if (nVar3 == null) {
                nVar3 = C54591n.f143323c;
            }
            cVar.copyOnWrite();
            C141708d dVar = (C141708d) cVar.instance;
            nVar3.getClass();
            dVar.f384606b = nVar3;
            dVar.f384605a |= 1;
            if ((((C67184ab) optional.get()).f182606a & 4) != 0) {
                String str = ((C67184ab) optional.get()).f182608c;
                cVar.copyOnWrite();
                C141708d dVar2 = (C141708d) cVar.instance;
                str.getClass();
                dVar2.f384605a |= 2;
                dVar2.f384607c = str;
            }
        }
        AccountId accountId = this.f384686l;
        C141706b bVar = new C141706b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84039a(bVar, (C141708d) cVar.build());
        if (childFragmentManager.f634a.mo671c("RESULT_TAG") == null) {
            C0154a aVar = new C0154a(childFragmentManager);
            aVar.mo511h(R.id.soundsearch_result_fragment, bVar, "RESULT_TAG", 1);
            aVar.mo509f();
        } else {
            C0154a aVar2 = new C0154a(childFragmentManager);
            aVar2.mo689v(R.id.soundsearch_result_fragment, bVar, "RESULT_TAG");
            aVar2.mo509f();
        }
        bVar.mo17754z().f384622h = new C47591co(this.f384687m, "Clicked 'New search'", new C141722e(this));
    }

    /* renamed from: f */
    public final void mo116684f() {
        C141667c cVar = this.f384685k;
        if (!cVar.f384513b) {
            cVar.f384512a.mo19974a(C37203a.f98727f);
            cVar.f384513b = true;
        }
        C141680j jVar = this.f384678d;
        ((C59052c) ((C59052c) C141680j.f384536a.mo56224b()).mo56372aa(41800)).mo56386p("#startRecognition");
        jVar.f384543h = jVar.f384540e.mo26871c();
        C141677g gVar = new C141677g(jVar);
        jVar.f384538c.execute(C47810es.m84977q(new C141671a(jVar, new C141679i(jVar), gVar)));
    }
}
