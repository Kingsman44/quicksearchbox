package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126985f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126987h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126992m;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.tts.TtsViewModel;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9536b.C127131b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9810d.C129382x;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9810d.C129383y;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58852bp;
import com.google.common.p4522b.C58495hd;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.u */
/* compiled from: PG */
public final /* synthetic */ class C130302u implements C58852bp {

    /* renamed from: a */
    public final /* synthetic */ C130158ah f357172a;

    public /* synthetic */ C130302u(C130158ah ahVar) {
        this.f357172a = ahVar;
    }

    /* renamed from: a */
    public final void mo40846a(Object obj) {
        C126992m mVar;
        C126992m mVar2;
        C130158ah ahVar = this.f357172a;
        C126988i iVar = (C126988i) obj;
        if (!iVar.equals(C126988i.f349669h)) {
            if (C126987h.m207729a(iVar.f349674d) == 2) {
                C129382x xVar = ahVar.f356875l;
                C69664n.m101061g(iVar, "errorData");
                C58495hd hdVar = xVar.f355299b;
                C126985f a = C126985f.m207727a(iVar.f349676f);
                if (a == null) {
                    a = C126985f.ERROR_UNKNOWN;
                }
                if (hdVar.containsKey(a)) {
                    C119834cb cbVar = iVar.f349677g;
                    if (cbVar == null) {
                        cbVar = C119834cb.f333765b;
                    }
                    ResponseInfoViewModel responseInfoViewModel = ahVar.f356860D;
                    responseInfoViewModel.getClass();
                    if (!cbVar.equals(responseInfoViewModel.f356837b) || cbVar.equals(C119834cb.f333765b)) {
                        ResponseInfoViewModel responseInfoViewModel2 = ahVar.f356860D;
                        responseInfoViewModel2.getClass();
                        responseInfoViewModel2.f356837b = cbVar;
                        ahVar.f356880q.mo109546b();
                        if (iVar.f349674d == 7) {
                            mVar = (C126992m) iVar.f349675e;
                        } else {
                            mVar = C126992m.f349681d;
                        }
                        if ((mVar.f349683a & 1) != 0) {
                            TtsViewModel ttsViewModel = ahVar.f356861E;
                            ttsViewModel.getClass();
                            if (iVar.f349674d == 7) {
                                mVar2 = (C126992m) iVar.f349675e;
                            } else {
                                mVar2 = C126992m.f349681d;
                            }
                            ttsViewModel.mo107940a(mVar2.f349684b, Locale.getDefault().toLanguageTag(), true);
                        }
                        C129382x xVar2 = ahVar.f356875l;
                        C69664n.m101061g(iVar, "errorData");
                        C126985f a2 = C126985f.m207727a(iVar.f349676f);
                        if (a2 == null) {
                            a2 = C126985f.ERROR_UNKNOWN;
                        }
                        C69664n.m101060f(a2, "errorData.errorCategory");
                        C129383y yVar = (C129383y) xVar2.f355299b.get(a2);
                        if (yVar != null) {
                            Fragment a3 = yVar.mo109012a(xVar2.f355298a, iVar);
                            C0154a aVar = new C0154a(ahVar.f356866c.getChildFragmentManager());
                            aVar.mo511h(R.id.assistant_response_layer_content, a3, "ResponseErrorFragment", 1);
                            aVar.mo509f();
                            return;
                        }
                        new StringBuilder("No fragment defined for category: ").append(a2);
                        throw new IllegalStateException("No fragment defined for category: ".concat(String.valueOf(a2)));
                    }
                    return;
                }
                return;
            }
            C127131b.m207924a(iVar, ahVar.f356872i, ahVar.f356878o, ahVar.f356866c.getContext());
        }
    }
}
