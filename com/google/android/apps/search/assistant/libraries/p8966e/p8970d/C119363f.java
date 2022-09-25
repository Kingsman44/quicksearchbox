package com.google.android.apps.search.assistant.libraries.p8966e.p8970d;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9008a.C119654d;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9029a.C119725a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17362b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.alz;
import com.google.assistant.p3897e.p3921j.aos;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.libraries.e.d.f */
/* compiled from: PG */
public final class C119363f {

    /* renamed from: a */
    public static final C59071e f332795a = C59071e.m91331h();

    /* renamed from: b */
    public static final C51785da f332796b;

    /* renamed from: c */
    public static final C33480d f332797c = C33480d.m62053a("speech_output_args", "assistant.api.client_op.SpeechOutputArgs", aos.f135519e);

    /* renamed from: d */
    public final C17508k f332798d;

    /* renamed from: e */
    public final C119725a f332799e;

    /* renamed from: f */
    public final C17362b f332800f;

    /* renamed from: g */
    private final C71422aw f332801g;

    static {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        C69664n.m101060f(czVar, "newBuilder()");
        alz a = C69664n.m101061g(czVar, "builder");
        a.mo53699b("tts.OUTPUT");
        C51773cz czVar2 = a.f135357a;
        czVar2.copyOnWrite();
        C51785da daVar = (C51785da) czVar2.instance;
        daVar.f135877a |= 2;
        daVar.f135879c = 2;
        f332796b = a.mo53698a();
    }

    public C119363f(C17508k kVar, C71422aw awVar, C119725a aVar, C17362b bVar) {
        C69664n.m101061g(kVar, "clientInfo");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f332798d = kVar;
        this.f332801g = awVar;
        this.f332799e = aVar;
        this.f332800f = bVar;
    }

    /* renamed from: a */
    public final C119908e mo104305a(C51809dy dyVar) {
        C69664n.m101061g(dyVar, "clientOp");
        return C119654d.m198571a(this.f332801g, new C119362e(dyVar, this, (C69577g) null));
    }
}
