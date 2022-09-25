package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2678b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34047bj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.p3055n.C39677db;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.b.c */
/* compiled from: PG */
public final class C34554c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C34554c f91805e;

    /* renamed from: f */
    public static final C62940bt f91806f;

    /* renamed from: g */
    private static volatile C63010eb f91807g;

    /* renamed from: a */
    public int f91808a;

    /* renamed from: b */
    public int f91809b = 0;

    /* renamed from: c */
    public Object f91810c;

    /* renamed from: d */
    public C39677db f91811d;

    static {
        C34554c cVar = new C34554c();
        f91805e = cVar;
        C62942bv.registerDefaultInstance(C34554c.class, cVar);
        f91806f = C62942bv.newSingularGeneratedExtension(C34047bj.f90746a, cVar, cVar, (C62958ce) null, 1, C63066gd.MESSAGE, C34554c.class);
    }

    private C34554c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f91805e, "\u0001\u0003\u0001\u0001\u0001d\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000dဉ\u0002", new Object[]{C45240c.f118157a, "b", "a", C32849cq.class, "d"});
            case 3:
                return new C34554c();
            case 4:
                return new C34553b();
            case 5:
                return f91805e;
            case 6:
                C63010eb ebVar = f91807g;
                if (ebVar == null) {
                    synchronized (C34554c.class) {
                        ebVar = f91807g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91805e);
                            f91807g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
