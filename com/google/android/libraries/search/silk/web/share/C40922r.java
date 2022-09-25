package com.google.android.libraries.search.silk.web.share;

import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import org.json.JSONObject;

/* renamed from: com.google.android.libraries.search.silk.web.share.r */
/* compiled from: PG */
public final /* synthetic */ class C40922r implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkShareMessageHandler f107174a;

    public /* synthetic */ C40922r(SilkShareMessageHandler silkShareMessageHandler) {
        this.f107174a = silkShareMessageHandler;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        this.f107174a.f107153f.mo44352a(new C40913i(oVar));
        oVar.mo46960a(C41743a.m73211l(C41743a.m73201b(jSONObject)).toString());
    }
}
