package com.google.android.libraries.search.silk.web.share;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3235x.C41739b;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4320y.C56840e;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.share.l */
/* compiled from: PG */
public final /* synthetic */ class C40916l implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkShareMessageHandler f107165a;

    /* renamed from: b */
    public final /* synthetic */ C41739b f107166b;

    public /* synthetic */ C40916l(SilkShareMessageHandler silkShareMessageHandler, C41739b bVar) {
        this.f107165a = silkShareMessageHandler;
        this.f107166b = bVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkShareMessageHandler silkShareMessageHandler = this.f107165a;
        C41739b bVar = this.f107166b;
        C40769f fVar = silkShareMessageHandler.f107152e;
        Objects.requireNonNull(bVar);
        fVar.mo42722f(new C40908d(bVar), oVar, jSONObject, "Share", "showShareSheet", C56840e.f151648f.getParserForType());
    }
}
