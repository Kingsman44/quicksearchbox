package com.google.android.libraries.search.silk.web.amp;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3206a.C41709a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56616h;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.amp.h */
/* compiled from: PG */
public final /* synthetic */ class C40667h implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkAmpMessageHandler f106700a;

    /* renamed from: b */
    public final /* synthetic */ C41709a f106701b;

    public /* synthetic */ C40667h(SilkAmpMessageHandler silkAmpMessageHandler, C41709a aVar) {
        this.f106700a = silkAmpMessageHandler;
        this.f106701b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkAmpMessageHandler silkAmpMessageHandler = this.f106700a;
        C41709a aVar = this.f106701b;
        C40769f fVar = silkAmpMessageHandler.f106690d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40668i(aVar), oVar, jSONObject, "Amp", "open", C56616h.f151163d.getParserForType());
    }
}
