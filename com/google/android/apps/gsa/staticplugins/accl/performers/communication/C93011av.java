package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.search.assistant.performer.communication.C35578cg;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.av */
/* compiled from: PG */
public final class C93011av extends C35578cg {

    /* renamed from: a */
    private static final C58974d f259462a = C58974d.m91136j();

    /* renamed from: b */
    private final C93015az f259463b;

    /* renamed from: c */
    private final Executor f259464c;

    public C93011av(C93015az azVar, Executor executor) {
        this.f259463b = azVar;
        this.f259464c = executor;
    }

    /* renamed from: b */
    public final void mo39721b(C51809dy dyVar, C70862aj ajVar) {
        try {
            C60856cj.m92911t(this.f259463b.mo20765a(dyVar, (C22434e) null), new C93010au(ajVar), this.f259464c);
        } catch (Exception e) {
            ((C58970a) ((C58970a) ((C58970a) f259462a.mo56225c()).mo56382g(e)).mo56372aa(13198)).mo56389s("Failed to perform incoming call client op: %s", dyVar.f135936b);
            ajVar.mo20122b(e);
        }
    }
}
