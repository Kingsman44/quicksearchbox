package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import androidx.activity.C0800m;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9538d.C127170c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.C129320i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.C129331t;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.SuggestionViewModel;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext.C130288h;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import java.util.List;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.af */
/* compiled from: PG */
final class C130156af extends C0800m {

    /* renamed from: a */
    final /* synthetic */ C130158ah f356854a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C130156af(C130158ah ahVar) {
        super(true);
        this.f356854a = ahVar;
    }

    /* renamed from: a */
    public final void mo608a() {
        Fragment b;
        C130158ah ahVar = this.f356854a;
        C130149a aVar = ahVar.f356882s;
        if (aVar == null) {
            return;
        }
        if (ahVar.f356886w) {
            BackNavigationTupleListViewModel backNavigationTupleListViewModel = aVar.f356845d;
            if (backNavigationTupleListViewModel == null || backNavigationTupleListViewModel.f356828b.size() <= 0) {
                aVar.mo109534b();
                return;
            }
            BackNavigationTupleListViewModel backNavigationTupleListViewModel2 = aVar.f356845d;
            backNavigationTupleListViewModel2.getClass();
            C130174b bVar = null;
            if (!backNavigationTupleListViewModel2.f356828b.isEmpty()) {
                C130174b bVar2 = (C130174b) C58557jl.m90131l(backNavigationTupleListViewModel2.f356828b);
                if (Duration.ofMillis(backNavigationTupleListViewModel2.f356829c.mo26871c()).minus(bVar2.f356917b).compareTo(BackNavigationTupleListViewModel.f356827a) > 0) {
                    backNavigationTupleListViewModel2.f356828b.clear();
                } else {
                    List list = backNavigationTupleListViewModel2.f356828b;
                    list.remove(list.size() - 1);
                    bVar = bVar2;
                }
            }
            if (bVar == null) {
                aVar.mo109534b();
                return;
            }
            FragmentManager childFragmentManager = aVar.f356843b.getChildFragmentManager();
            C0154a aVar2 = new C0154a(childFragmentManager);
            for (Fragment fragment : childFragmentManager.f634a.mo677i()) {
                if (fragment.getId() == R.id.assistant_response_layer_content && !"ASSISTANT_HEADER_FRAGMENT_TAG".equals(fragment.getTag())) {
                    aVar2.mo516m(fragment);
                }
            }
            aVar2.mo509f();
            if (aVar.f356843b.getChildFragmentManager().mo462ac()) {
                C63088z zVar = bVar.f356918c;
                if (zVar != null) {
                    aVar.f356844c.mo108034b(zVar);
                }
                C58485gu j = C58485gu.m89842j(bVar.f356919d);
                C129320i iVar = (C129320i) aVar.f356843b.getChildFragmentManager().f634a.mo671c("SUGGESTION_FRAGMENT_TAG");
                if (iVar != null) {
                    C129331t j2 = iVar.mo17754z();
                    SuggestionViewModel suggestionViewModel = j2.f355217p;
                    suggestionViewModel.getClass();
                    suggestionViewModel.f355121a = BuildConfig.FLAVOR;
                    j2.f355208g.mo108965a(j);
                }
                C127170c cVar = bVar.f356916a;
                if (cVar != null && (b = aVar.f356843b.getChildFragmentManager().f634a.mo670b(R.id.assistant_response_layer_transcription_container)) != null) {
                    ((C130288h) b).mo17754z().mo109632f(cVar);
                    return;
                }
                return;
            }
            C59104x c = C130149a.f356842a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BackNavigationController");
            ((C59052c) ((C59052c) c).mo56372aa(38736)).mo56386p("Failed to retrieve last response from Back Navigation.");
            aVar.mo109534b();
            return;
        }
        aVar.mo109534b();
    }
}
