package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import android.support.p033v7.app.C0391l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.ab */
/* compiled from: PG */
class C36703ab implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C36704ac f95608a;

    public C36703ab(C36704ac acVar) {
        this.f95608a = acVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C59104x c = C36704ac.f95609a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OmniconsentFrag");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(51563)).mo56386p("fetchUdcConsentUiDataSource.subscriptionCallbacks onError");
        this.f95608a.f95611c.mo19974a(C37176a.f97296iq);
        C36704ac acVar = this.f95608a;
        C0391l lVar = new C0391l(acVar.f95610b);
        lVar.mo1300f(R.string.assistant_omniconsent_retry_message_connection_error);
        lVar.setNegativeButton(R.string.assistant_omniconsent_retry_negative, new C36751z(acVar));
        lVar.setPositiveButton(R.string.assistant_omniconsent_retry_positive, new C36702aa(acVar));
        lVar.mo1298d();
        lVar.create().show();
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18078b(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        this.f95608a.f95622n = Optional.m71637of((C36734j) obj);
        C36704ac acVar = this.f95608a;
        if (acVar.f95623o) {
            acVar.f95623o = false;
            return;
        }
        acVar.f95611c.mo19974a(C37176a.f97295ip);
        this.f95608a.mo40338b(2);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
