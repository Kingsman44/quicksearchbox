package com.google.p4488cj.p4489a.p4490a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cj.a.a.b */
/* compiled from: PG */
public final class C58125b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C58125b f155389b;

    /* renamed from: c */
    private static volatile C63010eb f155390c;

    /* renamed from: a */
    public C62960cg f155391a = emptyFloatList();

    static {
        C58125b bVar = new C58125b();
        f155389b = bVar;
        C62942bv.registerDefaultInstance(C58125b.class, bVar);
    }

    private C58125b() {
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
                return newMessageInfo(f155389b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0013", new Object[]{"a"});
            case 3:
                return new C58125b();
            case 4:
                return new C58120a();
            case 5:
                return f155389b;
            case 6:
                C63010eb ebVar = f155390c;
                if (ebVar == null) {
                    synchronized (C58125b.class) {
                        ebVar = f155390c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155389b);
                            f155390c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
