package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35626as;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35648i;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35665z;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.k.n */
/* compiled from: PG */
public final class C12801n {

    /* renamed from: a */
    public static final C59071e f39985a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.k.n");

    /* renamed from: b */
    public static final C58495hd f39986b;

    /* renamed from: c */
    public final C15481g f39987c;

    /* renamed from: d */
    private final Executor f39988d;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C52235kf.ABORTED, C62722b.ABORTED);
        gzVar.mo55429h(C52235kf.CANCELLED, C62722b.CANCELLED);
        gzVar.mo55429h(C52235kf.DEADLINE_EXCEEDED, C62722b.DEADLINE_EXCEEDED);
        gzVar.mo55429h(C52235kf.FAILED_PRECONDITION, C62722b.FAILED_PRECONDITION);
        gzVar.mo55429h(C52235kf.IGNORE, C62722b.OK);
        gzVar.mo55429h(C52235kf.INTERNAL, C62722b.INTERNAL);
        gzVar.mo55429h(C52235kf.INVALID_ARGUMENT, C62722b.INVALID_ARGUMENT);
        gzVar.mo55429h(C52235kf.OK, C62722b.OK);
        gzVar.mo55429h(C52235kf.PERMISSION_DENIED, C62722b.PERMISSION_DENIED);
        gzVar.mo55429h(C52235kf.UNAUTHENTICATED, C62722b.UNAUTHENTICATED);
        gzVar.mo55429h(C52235kf.UNKNOWN, C62722b.UNKNOWN);
        f39986b = gzVar.mo55427f(false);
    }

    public C12801n(Executor executor, C15481g gVar) {
        this.f39988d = executor;
        this.f39987c = gVar;
    }

    /* renamed from: a */
    public final C35648i mo20798a(C35648i iVar) {
        return new C12798k(new C12793f(this), iVar);
    }

    /* renamed from: b */
    public final C35665z mo20799b(C35665z zVar) {
        return new C12795h(new C12799l(this), zVar);
    }

    /* renamed from: c */
    public final C35626as mo20800c(C35626as asVar) {
        return new C12800m(new C12797j(this), asVar);
    }

    /* renamed from: d */
    public final C60870cx mo20801d(C60870cx cxVar) {
        C12790c cVar = C12790c.f39971a;
        C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(cVar), this.f39988d);
        C12792e eVar = C12792e.f39973a;
        return C60846c.m92878g(g, Exception.class, C47810es.m84963c(eVar), this.f39988d);
    }
}
