package com.google.android.libraries.search.silk.web.searchbox;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3233v.C41736a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4318w.C56831b;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.searchbox.d */
/* compiled from: PG */
public final /* synthetic */ class C40895d implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkSearchboxMessageHandler f107125a;

    /* renamed from: b */
    public final /* synthetic */ C41736a f107126b;

    public /* synthetic */ C40895d(SilkSearchboxMessageHandler silkSearchboxMessageHandler, C41736a aVar) {
        this.f107125a = silkSearchboxMessageHandler;
        this.f107126b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkSearchboxMessageHandler silkSearchboxMessageHandler = this.f107125a;
        C41736a aVar = this.f107126b;
        C40769f fVar = silkSearchboxMessageHandler.f107119c;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40897f(aVar), oVar, jSONObject, "Searchbox", "updateDisplayQuery", C56831b.f151632b.getParserForType());
    }
}
