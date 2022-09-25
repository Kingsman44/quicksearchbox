package com.google.android.libraries.search.silk.web.panes;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3230s.C41733a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.panes.n */
/* compiled from: PG */
public final /* synthetic */ class C40870n implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkPanesMessageHandler f107072a;

    /* renamed from: b */
    public final /* synthetic */ C41733a f107073b;

    public /* synthetic */ C40870n(SilkPanesMessageHandler silkPanesMessageHandler, C41733a aVar) {
        this.f107072a = silkPanesMessageHandler;
        this.f107073b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkPanesMessageHandler silkPanesMessageHandler = this.f107072a;
        C41733a aVar = this.f107073b;
        C40769f fVar = silkPanesMessageHandler.f107055d;
        Objects.requireNonNull(aVar);
        fVar.mo42719c(new C40864h(aVar), oVar, jSONObject, "Panes", "closeMediaPane");
    }
}
