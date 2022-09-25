package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import android.app.DirectAction;
import android.os.Bundle;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33883a;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33884b;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33885c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61538b;
import com.google.p4238bo.p4239a.p4240a.p4241a.C56125i;
import java.util.concurrent.Executor;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5533i.C70876o;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.bl */
/* compiled from: PG */
public final class C121585bl implements C33885c {

    /* renamed from: a */
    public static final C59071e f337359a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.j.a.bl");

    /* renamed from: b */
    public final Executor f337360b;

    /* renamed from: c */
    public final C121660q f337361c;

    /* renamed from: d */
    public final C34053bp f337362d;

    /* renamed from: e */
    private final C121658o f337363e;

    /* renamed from: f */
    private final C34037b f337364f;

    public C121585bl(Executor executor, C121658o oVar, C121660q qVar, C34037b bVar, C34053bp bpVar) {
        this.f337360b = executor;
        this.f337363e = oVar;
        this.f337361c = qVar;
        this.f337364f = bVar;
        this.f337362d = bpVar;
    }

    /* renamed from: a */
    public final C60870cx mo39113a() {
        C121547aa aaVar = (C121547aa) C121548ab.f337287c.createBuilder();
        C34037b bVar = this.f337364f;
        aaVar.copyOnWrite();
        ((C121548ab) aaVar.instance).f337289a = bVar.getNumber();
        C34053bp bpVar = this.f337362d;
        aaVar.copyOnWrite();
        bpVar.getClass();
        ((C121548ab) aaVar.instance).f337290b = bpVar;
        C121658o oVar = this.f337363e;
        C60870cx a = C70876o.m103760a(oVar.f189039a.mo39510a(C121662s.m201042c(), oVar.f189040b), (C121548ab) aaVar.build());
        C121577bd bdVar = C121577bd.f337341a;
        return C60922j.m93044g(a, C47810es.m84963c(bdVar), this.f337360b);
    }

    /* renamed from: b */
    public final C60870cx mo39114b(C33883a aVar) {
        return C2169h.m6027a(new C121570ax(this, aVar));
    }

    /* renamed from: c */
    public final C60870cx mo39115c(C33884b bVar) {
        return C2169h.m6027a(new C121576bc(this, bVar));
    }

    /* renamed from: d */
    public final C60870cx mo39116d(DirectAction directAction, Bundle bundle) {
        C70334de deVar = new C70334de();
        C61538b.m94270a(C121596bw.f337377b, directAction, deVar);
        C61538b.m94270a(C121596bw.f337376a, bundle, deVar);
        C70879r rVar = new C70879r(deVar);
        C121559am amVar = (C121559am) C121560an.f337310b.createBuilder();
        C34053bp bpVar = this.f337362d;
        amVar.copyOnWrite();
        bpVar.getClass();
        ((C121560an) amVar.instance).f337312a = bpVar;
        C60870cx b = C56125i.m87910b((C121658o) this.f337363e.mo62576o(rVar), C121574ba.f337337a, (C121560an) amVar.build());
        C121575bb bbVar = C121575bb.f337338a;
        return C60922j.m93044g(b, C47810es.m84963c(bbVar), this.f337360b);
    }

    /* renamed from: e */
    public final C60870cx mo39117e(String str) {
        C121563aq aqVar = (C121563aq) C121564ar.f337316c.createBuilder();
        C34053bp bpVar = this.f337362d;
        aqVar.copyOnWrite();
        bpVar.getClass();
        ((C121564ar) aqVar.instance).f337318a = bpVar;
        aqVar.copyOnWrite();
        str.getClass();
        ((C121564ar) aqVar.instance).f337319b = str;
        C60870cx b = C56125i.m87910b(this.f337363e, C121567au.f337323a, (C121564ar) aqVar.build());
        C121569aw awVar = C121569aw.f337327a;
        return C60922j.m93044g(b, C47810es.m84963c(awVar), this.f337360b);
    }
}
