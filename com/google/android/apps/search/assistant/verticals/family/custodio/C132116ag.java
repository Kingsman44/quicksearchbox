package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import android.support.p031v4.app.C0205bx;
import com.google.android.apps.search.assistant.verticals.family.custodio.C132363y;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.p4526f.C59052c;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8675e;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ag */
/* compiled from: PG */
public final /* synthetic */ class C132116ag implements C0205bx {

    /* renamed from: a */
    public final /* synthetic */ C132363y.C132365a f360635a;

    /* renamed from: b */
    public final /* synthetic */ C8675e f360636b;

    public /* synthetic */ C132116ag(C132363y.C132365a aVar, C8675e eVar) {
        this.f360635a = aVar;
        this.f360636b = eVar;
    }

    /* renamed from: a */
    public final void mo631a(String str, Bundle bundle) {
        C132363y.C132365a aVar = this.f360635a;
        C8675e eVar = this.f360636b;
        String string = C132363y.this.f361309c.getString("entry_point_id");
        String string2 = C132363y.this.f361309c.getString("supervised_oid");
        if (string == null || string2 == null) {
            ((C59052c) ((C59052c) C132363y.f361307a.mo56225c()).mo56372aa(39517)).mo56386p("Information required for device unlinking missing from args!");
            C132363y.this.mo110668a();
            return;
        }
        String string3 = bundle.getString("device_id");
        if (string3 == null) {
            ((C59052c) ((C59052c) C132363y.f361307a.mo56225c()).mo56372aa(39518)).mo56386p("Information required for device unlinking missing from FragmentResultListener bundle!");
            C132363y.this.mo110668a();
            return;
        }
        Bundle bundle2 = new Bundle();
        C8628ag agVar = eVar.f29994c;
        if (agVar == null) {
            agVar = C8628ag.f29890g;
        }
        bundle2.putString("UPDATE_CALLBACK_CHILD_NAME_KEY", agVar.f29893b);
        bundle2.putString("UPDATE_CALLBACK_DEVICE_OR_HOME_NAME_KEY", bundle.getString("device_name"));
        C47538ax c = C132363y.this.f361314h.mo51613c("assistant_custodio_dlf_result_listener");
        try {
            C132363y yVar = C132363y.this;
            yVar.f361317k.mo50445g(C46438d.m82810b(yVar.f361310d.mo110503c(string, string2, string3)), new C46436b(bundle2), C132363y.this.f361318l);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132110aa.m214749a(th, th);
        }
        throw th;
    }
}
