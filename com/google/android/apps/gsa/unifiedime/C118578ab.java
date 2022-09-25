package com.google.android.apps.gsa.unifiedime;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6841s.C86590i;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.C88499t;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.util.C91035f;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.unifiedime.ab */
/* compiled from: PG */
final class C118578ab extends C88499t {

    /* renamed from: a */
    final /* synthetic */ C118579ac f330819a;

    public C118578ab(C118579ac acVar) {
        this.f330819a = acVar;
    }

    /* renamed from: f */
    public final void mo17567f(ParcelableVoiceAction parcelableVoiceAction) {
        C59071e eVar = C118579ac.f330820a;
        C58976aa aaVar = C58975e.f156826a;
        try {
            if (this.f330819a.f330840u != null) {
                SearchError searchError = (SearchError) parcelableVoiceAction.f236008a;
                if (searchError != null) {
                    if (!C118579ac.f330821b.contains(Integer.valueOf(searchError.mo81135N()))) {
                        C118595m mVar = this.f330819a.f330840u;
                        mVar.getClass();
                        mVar.mo103781e(3);
                        return;
                    }
                }
                C118595m mVar2 = this.f330819a.f330840u;
                mVar2.getClass();
                mVar2.mo103782f(9);
            }
        } catch (Exception e) {
            C59104x c = C118579ac.f330820a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "UnifiedImeServiceConn");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(34025)).mo56386p("IUnifiedImeServiceCallback#showError failed ");
        }
    }

    /* renamed from: g */
    public final void mo17568g(int i) {
        C59071e eVar = C118579ac.f330820a;
        C58976aa aaVar = C58975e.f156826a;
        try {
            C118595m mVar = this.f330819a.f330840u;
            if (mVar != null) {
                mVar.mo103782f(i);
            }
            C118579ac acVar = this.f330819a;
            if (acVar.f330837r && i == 2 && ((C86590i) acVar.f330827h.mo27525b()).mo80207c()) {
                C118579ac acVar2 = this.f330819a;
                Context context = acVar2.f330822c;
                String F = ((C86054o) acVar2.f330828i.mo27525b()).mo79659F();
                F.getClass();
                C86338r rVar = (C86338r) this.f330819a.f330830k.mo27525b();
                C90021c cVar = (C90021c) this.f330819a.f330823d.mo27525b();
                if (C118583ag.m196885e(F, rVar)) {
                    C118583ag.m196884d(context, context.getString(R.string.signed_in_as_audio_history, new Object[]{C91035f.m148708d(F)}));
                    C118583ag.m196882b(F, rVar);
                }
                this.f330819a.f330837r = false;
            }
        } catch (Exception e) {
            C59104x c = C118579ac.f330820a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "UnifiedImeServiceConn");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(34027)).mo56386p("IUnifiedImeServiceCallback#showRecognitionState failed ");
        }
    }

    /* renamed from: i */
    public final void mo17570i(String str, String str2, String str3) {
        C59071e eVar = C118579ac.f330820a;
        C58976aa aaVar = C58975e.f156826a;
        if (str3 != null && !str3.equals(this.f330819a.f330835p)) {
            C59104x d = C118579ac.f330820a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "UnifiedImeServiceConn");
            ((C59052c) ((C59052c) d).mo56372aa(34031)).mo56386p("RecognizerLanguage != update language");
        }
        C58485gu m = C58485gu.m89845m();
        C118579ac acVar = this.f330819a;
        C118600r a = C118579ac.m196872a(m, String.valueOf(str).concat(String.valueOf(str2)), acVar.f330835p, ((C90021c) acVar.f330823d.mo27525b()).mo79746e(C90082eg.f250048de));
        try {
            C118595m mVar = this.f330819a.f330840u;
            if (mVar != null) {
                mVar.mo103783g(a.toByteArray());
            }
        } catch (Exception e) {
            C59104x c = C118579ac.f330820a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "UnifiedImeServiceConn");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(34030)).mo56386p("IUnifiedImeServiceCallback#updateRecognizedText failed ");
        }
    }

    /* renamed from: s */
    public final void mo49091s(List list, String str, String str2) {
        C59071e eVar = C118579ac.f330820a;
        C58976aa aaVar = C58975e.f156826a;
        C118579ac acVar = this.f330819a;
        acVar.f330835p = str2;
        C118600r a = C118579ac.m196872a(list, str, acVar.f330835p, ((C90021c) acVar.f330823d.mo27525b()).mo79746e(C90082eg.f250048de));
        try {
            C118595m mVar = this.f330819a.f330840u;
            if (mVar != null) {
                mVar.mo103783g(a.toByteArray());
            }
        } catch (Exception e) {
            C59104x c = C118579ac.f330820a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "UnifiedImeServiceConn");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(34024)).mo56386p("IUnifiedImeServiceCallback#onTranscriptionUpdate failed ");
        }
    }
}
