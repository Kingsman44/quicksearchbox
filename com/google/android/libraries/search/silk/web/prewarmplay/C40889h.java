package com.google.android.libraries.search.silk.web.prewarmplay;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3232u.C41735a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4316u.C56823b;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.prewarmplay.h */
/* compiled from: PG */
public final /* synthetic */ class C40889h implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkPrewarmPlayMessageHandler f107109a;

    /* renamed from: b */
    public final /* synthetic */ C41735a f107110b;

    public /* synthetic */ C40889h(SilkPrewarmPlayMessageHandler silkPrewarmPlayMessageHandler, C41735a aVar) {
        this.f107109a = silkPrewarmPlayMessageHandler;
        this.f107110b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkPrewarmPlayMessageHandler silkPrewarmPlayMessageHandler = this.f107109a;
        C41735a aVar = this.f107110b;
        C40769f fVar = silkPrewarmPlayMessageHandler.f107101d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40885d(aVar), oVar, jSONObject, "PrewarmPlay", "prewarm", C56823b.f151614b.getParserForType());
    }
}
