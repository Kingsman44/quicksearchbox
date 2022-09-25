package com.google.android.libraries.search.silk.web.timestamp;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3237z.C41741a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.timestamp.e */
/* compiled from: PG */
public final /* synthetic */ class C40935e implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkTimestampMessageHandler f107203a;

    /* renamed from: b */
    public final /* synthetic */ C41741a f107204b;

    public /* synthetic */ C40935e(SilkTimestampMessageHandler silkTimestampMessageHandler, C41741a aVar) {
        this.f107203a = silkTimestampMessageHandler;
        this.f107204b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkTimestampMessageHandler silkTimestampMessageHandler = this.f107203a;
        C41741a aVar = this.f107204b;
        C40769f fVar = silkTimestampMessageHandler.f107197d;
        Objects.requireNonNull(aVar);
        fVar.mo42721e(new C40936f(aVar), oVar, jSONObject, "Timestamp", "getFirstByteTime");
    }
}
