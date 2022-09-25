package com.google.p4283bv.p4287b.p4288a.p4289a.p4320y;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.y.b */
/* compiled from: PG */
public final class C56837b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56837b f151645a;

    /* renamed from: b */
    private static volatile C63010eb f151646b;

    static {
        C56837b bVar = new C56837b();
        f151645a = bVar;
        C62942bv.registerDefaultInstance(C56837b.class, bVar);
    }

    private C56837b() {
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
                return newMessageInfo(f151645a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56837b();
            case 4:
                return new C56836a();
            case 5:
                return f151645a;
            case 6:
                C63010eb ebVar = f151646b;
                if (ebVar == null) {
                    synchronized (C56837b.class) {
                        ebVar = f151646b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151645a);
                            f151646b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
