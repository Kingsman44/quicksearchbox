package com.google.android.apps.gsa.staticplugins.accl.performers.p7341b;

import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p4003x.p4004a.C53523b;
import com.google.assistant.p4003x.p4004a.C53526c;
import com.google.assistant.p4003x.p4004a.C53529f;
import com.google.assistant.p4003x.p4004a.C53530g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.b.c */
/* compiled from: PG */
public final class C92895c extends C22538o {

    /* renamed from: a */
    public static final /* synthetic */ int f259153a = 0;

    /* renamed from: b */
    private static final C59071e f259154b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.b.c");

    /* renamed from: c */
    private static final C58528ij f259155c = new C58759qy("proactive.DISMISS");

    /* renamed from: d */
    private final C53523b f259156d;

    public C92895c(C53523b bVar) {
        this.f259156d = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C58528ij ijVar = f259155c;
        if (!((C58759qy) ijVar).f156534a.equals(dyVar.f135936b)) {
            ((C59052c) ((C59052c) f259154b.mo56226d()).mo56372aa(13152)).mo56389s("received not supported ClientOp: %s", dyVar.f135936b);
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, String.format("ClientOp name is incorrect. %1$s is not supported", new Object[]{dyVar.f135936b})));
        }
        String str = dyVar.f135936b;
        C53523b bVar = this.f259156d;
        C53529f fVar = (C53529f) C53530g.f140481c.createBuilder();
        fVar.copyOnWrite();
        C53530g gVar = (C53530g) fVar.instance;
        dyVar.getClass();
        gVar.f140484b = dyVar;
        gVar.f140483a = 1 | gVar.f140483a;
        return C60922j.m93044g(C70876o.m103760a(bVar.f189039a.mo39510a(C53526c.m86854b(), bVar.f189040b), (C53530g) fVar.build()), new C92894b(dyVar), C60826bg.f164896a);
    }
}
