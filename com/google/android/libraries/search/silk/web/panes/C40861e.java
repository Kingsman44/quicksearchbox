package com.google.android.libraries.search.silk.web.panes;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3230s.C41733a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.panes.e */
/* compiled from: PG */
public final /* synthetic */ class C40861e implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkPanesMessageHandler f107061a;

    /* renamed from: b */
    public final /* synthetic */ C41733a f107062b;

    public /* synthetic */ C40861e(SilkPanesMessageHandler silkPanesMessageHandler, C41733a aVar) {
        this.f107061a = silkPanesMessageHandler;
        this.f107062b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkPanesMessageHandler silkPanesMessageHandler = this.f107061a;
        C41733a aVar = this.f107062b;
        C40769f fVar = silkPanesMessageHandler.f107055d;
        Objects.requireNonNull(aVar);
        fVar.mo42719c(new C40866j(aVar), oVar, jSONObject, "Panes", "close");
    }
}
