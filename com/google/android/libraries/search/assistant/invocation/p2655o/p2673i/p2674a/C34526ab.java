package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34049bl;
import com.google.android.libraries.search.p3055n.C39253ac;
import com.google.android.libraries.search.p3055n.C39822z;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.ab */
/* compiled from: PG */
public final class C34526ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34526ab f91759c;

    /* renamed from: d */
    public static final C62940bt f91760d;

    /* renamed from: e */
    private static volatile C63010eb f91761e;

    /* renamed from: a */
    public int f91762a = 0;

    /* renamed from: b */
    public Object f91763b;

    static {
        C34526ab abVar = new C34526ab();
        f91759c = abVar;
        C62942bv.registerDefaultInstance(C34526ab.class, abVar);
        f91760d = C62942bv.newSingularGeneratedExtension(C34049bl.f90749a, abVar, abVar, (C62958ce) null, 1, C63066gd.MESSAGE, C34526ab.class);
    }

    private C34526ab() {
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
                return newMessageInfo(f91759c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C39822z.class, C39253ac.class});
            case 3:
                return new C34526ab();
            case 4:
                return new C34525aa();
            case 5:
                return f91759c;
            case 6:
                C63010eb ebVar = f91761e;
                if (ebVar == null) {
                    synchronized (C34526ab.class) {
                        ebVar = f91761e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91759c);
                            f91761e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
