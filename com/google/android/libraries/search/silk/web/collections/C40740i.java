package com.google.android.libraries.search.silk.web.collections;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3219h.C41722a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56696b;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.collections.i */
/* compiled from: PG */
public final /* synthetic */ class C40740i implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkCollectionsV2MessageHandler f106836a;

    /* renamed from: b */
    public final /* synthetic */ C41722a f106837b;

    public /* synthetic */ C40740i(SilkCollectionsV2MessageHandler silkCollectionsV2MessageHandler, C41722a aVar) {
        this.f106836a = silkCollectionsV2MessageHandler;
        this.f106837b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkCollectionsV2MessageHandler silkCollectionsV2MessageHandler = this.f106836a;
        C41722a aVar = this.f106837b;
        C40769f fVar = silkCollectionsV2MessageHandler.f106826d;
        Objects.requireNonNull(aVar);
        fVar.mo42722f(new C40738g(aVar), oVar, jSONObject, "CollectionsV2", "openCollection", C56696b.f151332b.getParserForType());
    }
}
