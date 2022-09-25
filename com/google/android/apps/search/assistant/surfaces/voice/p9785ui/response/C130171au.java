package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.text.TextUtils;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9538d.C127170c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.C129320i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9872c.C130186a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext.C130282b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext.C130288h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3917i.p3918a.C51381fp;
import com.google.assistant.p3897e.p3917i.p3918a.C51387fv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.p3922a.C51656n;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Iterator;
import java.util.List;
import p3186j$.time.Duration;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.au */
/* compiled from: PG */
public final class C130171au {

    /* renamed from: a */
    public static final C59071e f356900a = C59071e.m91331h();

    /* renamed from: b */
    public final C130299r f356901b;

    /* renamed from: c */
    public final boolean f356902c;

    /* renamed from: d */
    public boolean f356903d;

    /* renamed from: e */
    public boolean f356904e;

    /* renamed from: f */
    public ResponseInfoViewModel f356905f;

    /* renamed from: g */
    private final C130186a f356906g;

    /* renamed from: h */
    private final C21370a f356907h;

    /* renamed from: i */
    private final C130149a f356908i;

    /* renamed from: j */
    private final AccountId f356909j;

    /* renamed from: k */
    private final boolean f356910k;

    public C130171au(C130299r rVar, C130186a aVar, C21370a aVar2, C130149a aVar3, AccountId accountId, boolean z, boolean z2) {
        C69664n.m101061g(aVar, "transcriptionResponseDataService");
        C69664n.m101061g(aVar2, "clock");
        C69664n.m101061g(aVar3, "backNavigationController");
        C69664n.m101061g(accountId, "accountId");
        this.f356901b = rVar;
        this.f356906g = aVar;
        this.f356907h = aVar2;
        this.f356908i = aVar3;
        this.f356909j = accountId;
        this.f356910k = z;
        this.f356902c = z2;
    }

    /* renamed from: d */
    private final void m212512d(String str, String str2) {
        C0154a aVar = new C0154a(this.f356901b.getChildFragmentManager());
        aVar.mo691x(R.anim.assistant_response_layer_content_fade_in, R.anim.assistant_response_layer_content_fade_out, 0, 0);
        AccountId accountId = this.f356909j;
        C130282b bVar = new C130282b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84040b(bVar, str);
        aVar.mo511h(R.id.assistant_response_layer_content, bVar, str2, 1);
        aVar.mo509f();
    }

    /* renamed from: a */
    public final void mo109545a() {
        FragmentManager childFragmentManager = this.f356901b.getChildFragmentManager();
        C69664n.m101060f(childFragmentManager, "fragment.getChildFragmentManager()");
        Fragment b = childFragmentManager.f634a.mo670b(R.id.assistant_response_layer_transcription_container);
        if (b == null) {
            m212512d(BuildConfig.FLAVOR, "chit_chat_query_place_holder");
            return;
        }
        C130288h hVar = (C130288h) b;
        String obj = hVar.mo17754z().mo109628b().toString();
        if (TextUtils.isEmpty(obj)) {
            m212512d(BuildConfig.FLAVOR, "chit_chat_query_place_holder");
            return;
        }
        hVar.mo17754z().mo109630d(BuildConfig.FLAVOR);
        m212512d(obj, "CHIT_CHAT_QUERY_FRAGMENT_TAG");
    }

    /* renamed from: b */
    public final void mo109546b() {
        C59052c cVar = (C59052c) f356900a.mo56224b();
        cVar.mo56379ah(new C59094n(38761));
        cVar.mo56386p("#DRL: Clearing screen content");
        C130186a aVar = this.f356906g;
        C51656n nVar = C51656n.f134597e;
        C69664n.m101060f(nVar, "getDefaultInstance()");
        aVar.mo109566c(nVar);
        FragmentManager childFragmentManager = this.f356901b.getChildFragmentManager();
        C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
        C0154a aVar2 = new C0154a(childFragmentManager);
        aVar2.mo691x(R.anim.assistant_response_layer_content_fade_in, R.anim.assistant_response_layer_content_fade_out, 0, 0);
        List i = childFragmentManager.f634a.mo677i();
        C69664n.m101060f(i, "fragmentManager.fragments");
        for (Fragment fragment : C69540x.m100816w(i)) {
            if (fragment.getId() == R.id.assistant_response_layer_content && !C69664n.m101066l(fragment.getTag(), "ASSISTANT_HEADER_FRAGMENT_TAG")) {
                if (this.f356910k) {
                    aVar2.mo686s("back_stack_tag");
                    aVar2.f824t = true;
                }
                aVar2.mo516m(fragment);
            }
        }
        Fragment c = this.f356901b.getChildFragmentManager().f634a.mo671c("SUGGESTION_FRAGMENT_TAG");
        C69664n.m101059e(c, "null cannot be cast to non-null type com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.SuggestionFragment");
        C58485gu c2 = ((C129320i) c).mo17754z().mo108970c();
        C69664n.m101060f(c2, "fragment.childFragmentMa… .getSuggestionChipList()");
        this.f356908i.mo109533a();
        C130149a aVar3 = this.f356908i;
        Duration ofMillis = Duration.ofMillis(this.f356907h.mo26871c());
        if (aVar3.f356845d != null) {
            aVar3.mo109533a();
            BackNavigationTupleListViewModel backNavigationTupleListViewModel = aVar3.f356845d;
            backNavigationTupleListViewModel.getClass();
            C127170c cVar2 = backNavigationTupleListViewModel.f356831e;
            if (ofMillis != null) {
                C63088z zVar = backNavigationTupleListViewModel.f356832f;
                if (c2 != null) {
                    C130174b bVar = new C130174b(cVar2, ofMillis, zVar, c2);
                    if (backNavigationTupleListViewModel.f356828b.size() >= 5) {
                        backNavigationTupleListViewModel.f356828b.remove(0);
                    }
                    backNavigationTupleListViewModel.f356828b.add(bVar);
                } else {
                    throw new NullPointerException("Null suggestionChipList");
                }
            } else {
                throw new NullPointerException("Null elapsedRealtime");
            }
        }
        Fragment c3 = childFragmentManager.f634a.mo671c("SUGGESTION_FRAGMENT_TAG");
        if (c3 != null) {
            ((C129320i) c3).mo17754z().mo108972e();
        }
        aVar2.mo505b(false);
        childFragmentManager.mo467ah();
        ((DynamicResponseLayerView) C2043bi.m5589r(this.f356901b.requireView(), R.id.assistant_response_container)).mo17754z().mo109609b(false);
    }

    /* renamed from: c */
    public final boolean mo109547c(C51809dy dyVar) {
        C51387fv fvVar;
        int a;
        C69664n.m101061g(dyVar, "clientOp");
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        C62971cq cqVar = dwVar.f135932a;
        C69664n.m101060f(cqVar, "clientOp.getArgs().getArgList()");
        Iterator it = cqVar.iterator();
        while (true) {
            fvVar = null;
            if (!it.hasNext()) {
                break;
            }
            C52232kc kcVar = (C52232kc) it.next();
            if (C69664n.m101066l("show_drl_visual_treatment_args", kcVar.f137065b)) {
                try {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    fvVar = (C51387fv) C62942bv.parseFrom((C62942bv) C51387fv.f133828e, kaVar.f137061c, C62921ba.m95368a());
                } catch (Exception unused) {
                    C59052c cVar = (C59052c) f356900a.mo56225c();
                    cVar.mo56379ah(new C59094n(38760));
                    cVar.mo56386p("Failed to retrieve DrlVisualTreatmentParams from Chit-Chat response. ");
                }
            }
        }
        if (fvVar == null || (a = C51381fp.m86172a(fvVar.f133833d)) == 0 || a != 2) {
            return false;
        }
        return true;
    }
}
