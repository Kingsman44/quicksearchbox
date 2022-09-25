package com.google.p4242bp.p4243a.p4245b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C54974be;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.a.b.g */
/* compiled from: PG */
public final class C56148g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56148g f149606b;

    /* renamed from: d */
    private static volatile C63010eb f149607d;

    /* renamed from: a */
    public C54974be f149608a;

    /* renamed from: c */
    private int f149609c;

    static {
        C56148g gVar = new C56148g();
        f149606b = gVar;
        C62942bv.registerDefaultInstance(C56148g.class, gVar);
    }

    private C56148g() {
        emptyProtobufList();
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
                return newMessageInfo(f149606b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C56148g();
            case 4:
                return new C56147f();
            case 5:
                return f149606b;
            case 6:
                C63010eb ebVar = f149607d;
                if (ebVar == null) {
                    synchronized (C56148g.class) {
                        ebVar = f149607d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149606b);
                            f149607d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
