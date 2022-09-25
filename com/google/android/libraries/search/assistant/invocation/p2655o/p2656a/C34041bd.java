package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.bd */
/* compiled from: PG */
public final class C34041bd extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C34041bd f90724g;

    /* renamed from: i */
    private static volatile C63010eb f90725i;

    /* renamed from: a */
    public int f90726a;

    /* renamed from: b */
    public C34065ca f90727b;

    /* renamed from: c */
    public C62971cq f90728c = emptyProtobufList();

    /* renamed from: d */
    public C34093db f90729d;

    /* renamed from: e */
    public C34047bj f90730e;

    /* renamed from: f */
    public C62910ar f90731f;

    /* renamed from: h */
    private byte f90732h = 2;

    static {
        C34041bd bdVar = new C34041bd();
        f90724g = bdVar;
        C62942bv.registerDefaultInstance(C34041bd.class, bdVar);
    }

    private C34041bd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90732h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f90732h = b;
                return null;
            case 2:
                return newMessageInfo(f90724g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0003ဉ\u0001\u0004ᐉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, C34034ax.class, "d", "e", C10662f.f35572a});
            case 3:
                return new C34041bd();
            case 4:
                return new C34040bc();
            case 5:
                return f90724g;
            case 6:
                C63010eb ebVar = f90725i;
                if (ebVar == null) {
                    synchronized (C34041bd.class) {
                        ebVar = f90725i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90724g);
                            f90725i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
