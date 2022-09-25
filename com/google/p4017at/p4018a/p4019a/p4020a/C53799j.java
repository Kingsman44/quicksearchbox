package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.j */
/* compiled from: PG */
public final class C53799j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53799j f141206b;

    /* renamed from: c */
    private static volatile C63010eb f141207c;

    /* renamed from: a */
    public C62961ch f141208a = emptyIntList();

    static {
        C53799j jVar = new C53799j();
        f141206b = jVar;
        C62942bv.registerDefaultInstance(C53799j.class, jVar);
    }

    private C53799j() {
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
                return newMessageInfo(f141206b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
            case 3:
                return new C53799j();
            case 4:
                return new C53798i();
            case 5:
                return f141206b;
            case 6:
                C63010eb ebVar = f141207c;
                if (ebVar == null) {
                    synchronized (C53799j.class) {
                        ebVar = f141207c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141206b);
                            f141207c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
