package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.bd */
/* compiled from: PG */
public final class C62052bd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62052bd f167638a;

    /* renamed from: c */
    private static volatile C63010eb f167639c;

    /* renamed from: b */
    private byte f167640b = 2;

    static {
        C62052bd bdVar = new C62052bd();
        f167638a = bdVar;
        C62942bv.registerDefaultInstance(C62052bd.class, bdVar);
    }

    private C62052bd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167640b);
            case 1:
                this.f167640b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167638a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62052bd();
            case 4:
                return new C62051bc();
            case 5:
                return f167638a;
            case 6:
                C63010eb ebVar = f167639c;
                if (ebVar == null) {
                    synchronized (C62052bd.class) {
                        ebVar = f167639c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167638a);
                            f167639c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
