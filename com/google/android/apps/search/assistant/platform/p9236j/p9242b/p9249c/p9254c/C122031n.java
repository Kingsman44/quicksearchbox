package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.n */
/* compiled from: PG */
public final class C122031n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C122031n f338578b;

    /* renamed from: c */
    private static volatile C63010eb f338579c;

    /* renamed from: a */
    public int f338580a;

    static {
        C122031n nVar = new C122031n();
        f338578b = nVar;
        C62942bv.registerDefaultInstance(C122031n.class, nVar);
    }

    private C122031n() {
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
                return newMessageInfo(f338578b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C122031n();
            case 4:
                return new C122030m();
            case 5:
                return f338578b;
            case 6:
                C63010eb ebVar = f338579c;
                if (ebVar == null) {
                    synchronized (C122031n.class) {
                        ebVar = f338579c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338578b);
                            f338579c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
