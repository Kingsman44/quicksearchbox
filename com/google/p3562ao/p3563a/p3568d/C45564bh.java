package com.google.p3562ao.p3563a.p3568d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.bh */
/* compiled from: PG */
public final class C45564bh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C45564bh f119077c;

    /* renamed from: d */
    private static volatile C63010eb f119078d;

    /* renamed from: a */
    public C45558bb f119079a;

    /* renamed from: b */
    public C45530aa f119080b;

    static {
        C45564bh bhVar = new C45564bh();
        f119077c = bhVar;
        C62942bv.registerDefaultInstance(C45564bh.class, bhVar);
    }

    private C45564bh() {
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
                return newMessageInfo(f119077c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C45564bh();
            case 4:
                return new C45563bg();
            case 5:
                return f119077c;
            case 6:
                C63010eb ebVar = f119078d;
                if (ebVar == null) {
                    synchronized (C45564bh.class) {
                        ebVar = f119078d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119077c);
                            f119078d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
