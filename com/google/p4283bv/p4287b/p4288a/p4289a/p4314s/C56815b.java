package com.google.p4283bv.p4287b.p4288a.p4289a.p4314s;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.s.b */
/* compiled from: PG */
public final class C56815b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56815b f151602a;

    /* renamed from: b */
    private static volatile C63010eb f151603b;

    static {
        C56815b bVar = new C56815b();
        f151602a = bVar;
        C62942bv.registerDefaultInstance(C56815b.class, bVar);
    }

    private C56815b() {
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
                return newMessageInfo(f151602a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56815b();
            case 4:
                return new C56814a();
            case 5:
                return f151602a;
            case 6:
                C63010eb ebVar = f151603b;
                if (ebVar == null) {
                    synchronized (C56815b.class) {
                        ebVar = f151603b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151602a);
                            f151603b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
