package com.google.p4283bv.p4287b.p4288a.p4289a.p4294ad;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.ad.b */
/* compiled from: PG */
public final class C56632b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56632b f151199a;

    /* renamed from: b */
    private static volatile C63010eb f151200b;

    static {
        C56632b bVar = new C56632b();
        f151199a = bVar;
        C62942bv.registerDefaultInstance(C56632b.class, bVar);
    }

    private C56632b() {
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
                return newMessageInfo(f151199a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56632b();
            case 4:
                return new C56631a();
            case 5:
                return f151199a;
            case 6:
                C63010eb ebVar = f151200b;
                if (ebVar == null) {
                    synchronized (C56632b.class) {
                        ebVar = f151200b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151199a);
                            f151200b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
