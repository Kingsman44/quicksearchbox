package com.google.android.apps.gsa.staticplugins.p7932f.p7934b;

import android.content.Intent;
import com.google.android.libraries.assistant.ampactions.AmpWebView;
import com.google.android.libraries.gsa.p1876k.C22869e;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.f.b.g */
/* compiled from: PG */
public final /* synthetic */ class C100679g implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C100686n f281514a;

    public /* synthetic */ C100679g(C100686n nVar) {
        this.f281514a = nVar;
    }

    public final void run() {
        C100686n nVar = this.f281514a;
        AmpWebView ampWebView = nVar.f281530h;
        if (ampWebView != null) {
            C100685m mVar = ampWebView.f36233f;
            if (mVar != null) {
                JSONObject jSONObject = ampWebView.f36232e;
                Intent intent = new Intent();
                if (jSONObject != null) {
                    intent.putExtra("result", jSONObject.toString());
                }
                mVar.f281522a.f281527e.mo28212l("finishActivityWithResult", new C100684l(mVar, intent));
            }
            nVar.f281530h = null;
        } else {
            nVar.f281527e.mo28212l("finishActivity", new C100674b(nVar));
        }
        nVar.f281524b.mo19493a();
    }
}
