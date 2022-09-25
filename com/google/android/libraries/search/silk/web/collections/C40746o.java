package com.google.android.libraries.search.silk.web.collections;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3219h.C41722a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56704j;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.collections.o */
/* compiled from: PG */
public final /* synthetic */ class C40746o implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkCollectionsV2MessageHandler f106845a;

    /* renamed from: b */
    public final /* synthetic */ C41722a f106846b;

    public /* synthetic */ C40746o(SilkCollectionsV2MessageHandler silkCollectionsV2MessageHandler, C41722a aVar) {
        this.f106845a = silkCollectionsV2MessageHandler;
        this.f106846b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkCollectionsV2MessageHandler silkCollectionsV2MessageHandler = this.f106845a;
        C41722a aVar = this.f106846b;
        C40769f fVar = silkCollectionsV2MessageHandler.f106826d;
        Objects.requireNonNull(aVar);
        fVar.mo42722f(new C40734c(aVar), oVar, jSONObject, "CollectionsV2", "setActiveList", C56704j.f151353b.getParserForType());
    }
}
