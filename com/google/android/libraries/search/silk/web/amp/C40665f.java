package com.google.android.libraries.search.silk.web.amp;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3206a.C41709a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56618j;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.amp.f */
/* compiled from: PG */
public final /* synthetic */ class C40665f implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkAmpMessageHandler f106697a;

    /* renamed from: b */
    public final /* synthetic */ C41709a f106698b;

    public /* synthetic */ C40665f(SilkAmpMessageHandler silkAmpMessageHandler, C41709a aVar) {
        this.f106697a = silkAmpMessageHandler;
        this.f106698b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkAmpMessageHandler silkAmpMessageHandler = this.f106697a;
        C41709a aVar = this.f106698b;
        C40769f fVar = silkAmpMessageHandler.f106690d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40662c(aVar), oVar, jSONObject, "Amp", "prefetch", C56618j.f151169c.getParserForType());
    }
}
