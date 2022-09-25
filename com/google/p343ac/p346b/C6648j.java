package com.google.p343ac.p346b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ac.b.j */
/* compiled from: PG */
public final class C6648j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C6648j f19882c;

    /* renamed from: d */
    private static volatile C63010eb f19883d;

    /* renamed from: a */
    public C62961ch f19884a = emptyIntList();

    /* renamed from: b */
    public C62961ch f19885b = emptyIntList();

    static {
        C6648j jVar = new C6648j();
        f19882c = jVar;
        C62942bv.registerDefaultInstance(C6648j.class, jVar);
    }

    private C6648j() {
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
                return newMessageInfo(f19882c, "\u0001\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0002\u0000\u0001\u0016\u0004\u0016", new Object[]{"a", "b"});
            case 3:
                return new C6648j();
            case 4:
                return new C6647i();
            case 5:
                return f19882c;
            case 6:
                C63010eb ebVar = f19883d;
                if (ebVar == null) {
                    synchronized (C6648j.class) {
                        ebVar = f19883d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19882c);
                            f19883d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
