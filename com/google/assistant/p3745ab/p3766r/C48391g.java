package com.google.assistant.p3745ab.p3766r;

import com.google.assistant.p3745ab.C48260bq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.r.g */
/* compiled from: PG */
public final class C48391g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48391g f125079c;

    /* renamed from: d */
    private static volatile C63010eb f125080d;

    /* renamed from: a */
    public int f125081a = 0;

    /* renamed from: b */
    public Object f125082b;

    static {
        C48391g gVar = new C48391g();
        f125079c = gVar;
        C62942bv.registerDefaultInstance(C48391g.class, gVar);
    }

    private C48391g() {
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
                return newMessageInfo(f125079c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C48387c.class, C48260bq.class, C48389e.class});
            case 3:
                return new C48391g();
            case 4:
                return new C48390f();
            case 5:
                return f125079c;
            case 6:
                C63010eb ebVar = f125080d;
                if (ebVar == null) {
                    synchronized (C48391g.class) {
                        ebVar = f125080d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125079c);
                            f125080d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
