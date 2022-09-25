package com.google.android.libraries.search.silk.web.panes;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3230s.C41733a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4314s.C56817d;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.panes.l */
/* compiled from: PG */
public final /* synthetic */ class C40868l implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkPanesMessageHandler f107069a;

    /* renamed from: b */
    public final /* synthetic */ C41733a f107070b;

    public /* synthetic */ C40868l(SilkPanesMessageHandler silkPanesMessageHandler, C41733a aVar) {
        this.f107069a = silkPanesMessageHandler;
        this.f107070b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkPanesMessageHandler silkPanesMessageHandler = this.f107069a;
        C41733a aVar = this.f107070b;
        C40769f fVar = silkPanesMessageHandler.f107055d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40865i(aVar), oVar, jSONObject, "Panes", "openMediaPane", C56817d.f151604b.getParserForType());
    }
}
