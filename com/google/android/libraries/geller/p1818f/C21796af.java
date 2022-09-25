package com.google.android.libraries.geller.p1818f;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5129p.p5131b.C65788bs;
import com.google.protos.p5129p.p5131b.C65789bt;
import com.google.protos.p5129p.p5131b.C65811co;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70769g;

@Deprecated
/* renamed from: com.google.android.libraries.geller.f.af */
/* compiled from: PG */
public final class C21796af {

    /* renamed from: a */
    public static final long f60120a = TimeUnit.MINUTES.toMillis(60);

    /* renamed from: b */
    public static final List f60121b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final C21370a f60122c;

    /* renamed from: d */
    public final Executor f60123d;

    /* renamed from: e */
    public final String f60124e;

    /* renamed from: f */
    public final C58833ax f60125f;

    /* renamed from: g */
    public final C58833ax f60126g;

    public C21796af(C21370a aVar, Executor executor, String str, C58833ax axVar, C58833ax axVar2) {
        this.f60122c = aVar;
        this.f60123d = executor;
        this.f60124e = str;
        this.f60125f = axVar;
        this.f60126g = axVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo27120a(C70286co coVar, C70769g gVar, C65811co coVar2, List list) {
        return C60922j.m93045h(C60838bs.m92859i(((C65788bs) C65789bt.m96808a(coVar).mo62574m(gVar)).mo59428b(coVar2)), new C21795ae(this, list, coVar2, coVar, gVar), this.f60123d);
    }
}
