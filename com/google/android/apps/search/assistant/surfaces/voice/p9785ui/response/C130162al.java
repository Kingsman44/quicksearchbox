package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.text.TextUtils;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9538d.C127170c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext.C130282b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext.C130283c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext.C130288h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130304b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.al */
/* compiled from: PG */
final class C130162al implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C130158ah f356893a;

    public C130162al(C130158ah ahVar) {
        this.f356893a = ahVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C130158ah ahVar = this.f356893a;
        C130149a aVar = ahVar.f356882s;
        C127170c cVar = ((C130304b) bVar).f357176a;
        BackNavigationTupleListViewModel backNavigationTupleListViewModel = aVar.f356845d;
        backNavigationTupleListViewModel.getClass();
        backNavigationTupleListViewModel.f356831e = backNavigationTupleListViewModel.f356830d;
        backNavigationTupleListViewModel.f356830d = cVar;
        if (ahVar.f356858B) {
            ResponseInfoViewModel responseInfoViewModel = ahVar.f356860D;
            responseInfoViewModel.getClass();
            if (!responseInfoViewModel.f356839d && responseInfoViewModel.f356838c) {
                C130171au auVar = ahVar.f356880q;
                C59052c cVar2 = (C59052c) C130171au.f356900a.mo56224b();
                cVar2.mo56379ah(new C59094n(38765));
                cVar2.mo56386p("New transcription received. Try to replace chit chat query place holder with real query.");
                FragmentManager childFragmentManager = auVar.f356901b.getChildFragmentManager();
                C69664n.m101060f(childFragmentManager, "fragment.getChildFragmentManager()");
                Fragment c = childFragmentManager.f634a.mo671c("chit_chat_query_place_holder");
                if (c != null) {
                    Fragment b = childFragmentManager.f634a.mo670b(R.id.assistant_response_layer_transcription_container);
                    String obj = b != null ? ((C130288h) b).mo17754z().mo109628b().toString() : BuildConfig.FLAVOR;
                    if (!TextUtils.isEmpty(obj)) {
                        C130283c a = ((C130282b) c).mo17754z();
                        a.f357139b = obj;
                        TextView textView = (TextView) a.f357138a.requireView().findViewById(R.id.assistant_chit_chat_query_text);
                        if (textView != null) {
                            textView.setText(obj);
                        }
                    }
                }
            }
        }
        ResponseInfoViewModel responseInfoViewModel2 = ahVar.f356860D;
        responseInfoViewModel2.getClass();
        responseInfoViewModel2.f356839d = true;
        return C47392e.f123115a;
    }
}
