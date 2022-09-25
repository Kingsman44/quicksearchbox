package com.google.protos.p4850an;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.bo */
/* compiled from: PG */
public final class C63397bo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63397bo f171329c;

    /* renamed from: e */
    private static volatile C63010eb f171330e;

    /* renamed from: a */
    public int f171331a;

    /* renamed from: b */
    public int f171332b;

    /* renamed from: d */
    private int f171333d;

    static {
        C63397bo boVar = new C63397bo();
        f171329c = boVar;
        C62942bv.registerDefaultInstance(C63397bo.class, boVar);
    }

    private C63397bo() {
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
                return newMessageInfo(f171329c, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003င\u0002\u0004င\u0003", new Object[]{"d", "a", "b"});
            case 3:
                return new C63397bo();
            case 4:
                return new C63396bn();
            case 5:
                return f171329c;
            case 6:
                C63010eb ebVar = f171330e;
                if (ebVar == null) {
                    synchronized (C63397bo.class) {
                        ebVar = f171330e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171329c);
                            f171330e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
