package com.google.android.libraries.search.silk.web.signin;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3236y.C41740a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.signin.f */
/* compiled from: PG */
public final /* synthetic */ class C40928f implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkSignInMessageHandler f107187a;

    /* renamed from: b */
    public final /* synthetic */ C41740a f107188b;

    public /* synthetic */ C40928f(SilkSignInMessageHandler silkSignInMessageHandler, C41740a aVar) {
        this.f107187a = silkSignInMessageHandler;
        this.f107188b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkSignInMessageHandler silkSignInMessageHandler = this.f107187a;
        C41740a aVar = this.f107188b;
        C40769f fVar = silkSignInMessageHandler.f107180c;
        Objects.requireNonNull(aVar);
        fVar.mo42719c(new C40926d(aVar), oVar, jSONObject, "SignIn", "chooseAccount");
    }
}
