package com.google.android.libraries.search.silk.web.panes;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3230s.C41733a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4314s.C56815b;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.panes.r */
/* compiled from: PG */
public final /* synthetic */ class C40874r implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkPanesMessageHandler f107078a;

    /* renamed from: b */
    public final /* synthetic */ C41733a f107079b;

    public /* synthetic */ C40874r(SilkPanesMessageHandler silkPanesMessageHandler, C41733a aVar) {
        this.f107078a = silkPanesMessageHandler;
        this.f107079b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkPanesMessageHandler silkPanesMessageHandler = this.f107078a;
        C41733a aVar = this.f107079b;
        C40769f fVar = silkPanesMessageHandler.f107055d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40859c(aVar), oVar, jSONObject, "Panes", "closeModalPane", C56815b.f151602a.getParserForType());
    }
}
