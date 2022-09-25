package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34049bl;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.w */
/* compiled from: PG */
public final class C34313w extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C34313w f91242e;

    /* renamed from: g */
    private static volatile C63010eb f91243g;

    /* renamed from: a */
    public int f91244a = 0;

    /* renamed from: b */
    public Object f91245b;

    /* renamed from: c */
    public int f91246c;

    /* renamed from: d */
    public C34049bl f91247d;

    /* renamed from: f */
    private byte f91248f = 2;

    static {
        C34313w wVar = new C34313w();
        f91242e = wVar;
        C62942bv.registerDefaultInstance(C34313w.class, wVar);
    }

    private C34313w() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f91248f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f91248f = b;
                return null;
            case 2:
                return newMessageInfo(f91242e, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0001\u0001\f\u0002Љ\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", C45240c.f118157a, "d", C34312v.class, C34309s.class, C34307q.class});
            case 3:
                return new C34313w();
            case 4:
                return new C34305o();
            case 5:
                return f91242e;
            case 6:
                C63010eb ebVar = f91243g;
                if (ebVar == null) {
                    synchronized (C34313w.class) {
                        ebVar = f91243g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91242e);
                            f91243g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
