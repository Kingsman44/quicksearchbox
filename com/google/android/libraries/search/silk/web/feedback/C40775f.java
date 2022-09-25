package com.google.android.libraries.search.silk.web.feedback;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3221j.C41724a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4305j.C56716d;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.feedback.f */
/* compiled from: PG */
public final /* synthetic */ class C40775f implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkFeedbackMessageHandler f106902a;

    /* renamed from: b */
    public final /* synthetic */ C41724a f106903b;

    public /* synthetic */ C40775f(SilkFeedbackMessageHandler silkFeedbackMessageHandler, C41724a aVar) {
        this.f106902a = silkFeedbackMessageHandler;
        this.f106903b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkFeedbackMessageHandler silkFeedbackMessageHandler = this.f106902a;
        C41724a aVar = this.f106903b;
        C40769f fVar = silkFeedbackMessageHandler.f106895d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40772c(aVar), oVar, jSONObject, "Feedback", "showFeedbackWindow", C56716d.f151382c.getParserForType());
    }
}
