package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import androidx.activity.result.C0815b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4526f.C59052c;
import com.google.p4109av.p4114c.p4115a.p4116a.C54612e;
import com.google.p4109av.p4114c.p4115a.p4116a.C54613f;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.gb */
/* compiled from: PG */
public final /* synthetic */ class C132335gb implements C0815b {

    /* renamed from: a */
    public final /* synthetic */ C132336gc f361237a;

    public /* synthetic */ C132335gb(C132336gc gcVar) {
        this.f361237a = gcVar;
    }

    public final void onActivityResult(Object obj) {
        C132336gc gcVar = this.f361237a;
        C54613f fVar = (C54613f) obj;
        C54612e eVar = C54612e.UNKNOWN;
        C54612e a = C54612e.m87500a(fVar.f143385b);
        if (a == null) {
            a = C54612e.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            gcVar.f361244g.mo19974a(C37176a.f97022dh);
            Bundle a2 = C132361w.m215129a(gcVar.f361243f);
            a2.putString("supervised_oid", fVar.f143386c);
            gcVar.f361242e.mo50482c(gcVar.f361239b).mo50508d(R.id.assistant_ulp_deeplinking_fragment_success, a2);
        } else if (ordinal != 2) {
            C59052c cVar = (C59052c) ((C59052c) C132336gc.f361238a.mo56225c()).mo56372aa(39587);
            C54612e a3 = C54612e.m87500a(fVar.f143385b);
            if (a3 == null) {
                a3 = C54612e.UNKNOWN;
            }
            cVar.mo56387q("ULP Creation failed with status %d!", a3.f143381f);
            gcVar.f361244g.mo19974a(C37176a.f97023di);
            gcVar.f361242e.mo50482c(gcVar.f361239b).mo50508d(R.id.assistant_ulp_deeplinking_fragment_to_dialog, C132287ei.m214954a(gcVar.f361239b.getString(R.string.assistant_custodio_fatal_error_title), gcVar.f361239b.getString(R.string.assistant_custodio_fatal_error_body), gcVar.f361239b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
        } else {
            gcVar.f361242e.mo50482c(gcVar.f361239b).mo50510f();
        }
    }
}
