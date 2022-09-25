package com.google.android.libraries.search.silk.web.phonecall;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3231t.C41734a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4315t.C56821b;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.phonecall.e */
/* compiled from: PG */
public final /* synthetic */ class C40879e implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkPhonecallMessageHandler f107091a;

    /* renamed from: b */
    public final /* synthetic */ C41734a f107092b;

    public /* synthetic */ C40879e(SilkPhonecallMessageHandler silkPhonecallMessageHandler, C41734a aVar) {
        this.f107091a = silkPhonecallMessageHandler;
        this.f107092b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkPhonecallMessageHandler silkPhonecallMessageHandler = this.f107091a;
        C41734a aVar = this.f107092b;
        C40769f fVar = silkPhonecallMessageHandler.f107086d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40881g(aVar), oVar, jSONObject, "Phonecall", "callPhoneNumber", C56821b.f151610b.getParserForType());
    }
}
