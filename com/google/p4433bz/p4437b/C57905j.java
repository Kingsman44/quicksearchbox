package com.google.p4433bz.p4437b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bz.b.j */
/* compiled from: PG */
public final class C57905j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57905j f154883c;

    /* renamed from: d */
    private static volatile C63010eb f154884d;

    /* renamed from: a */
    public int f154885a = 0;

    /* renamed from: b */
    public Object f154886b;

    static {
        C57905j jVar = new C57905j();
        f154883c = jVar;
        C62942bv.registerDefaultInstance(C57905j.class, jVar);
    }

    private C57905j() {
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
                return newMessageInfo(f154883c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C57905j();
            case 4:
                return new C57904i();
            case 5:
                return f154883c;
            case 6:
                C63010eb ebVar = f154884d;
                if (ebVar == null) {
                    synchronized (C57905j.class) {
                        ebVar = f154884d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154883c);
                            f154884d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
