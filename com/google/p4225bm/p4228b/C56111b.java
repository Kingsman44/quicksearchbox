package com.google.p4225bm.p4228b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4820d.p4828e.C63246d;

/* renamed from: com.google.bm.b.b */
/* compiled from: PG */
public final class C56111b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56111b f149471c;

    /* renamed from: d */
    private static volatile C63010eb f149472d;

    /* renamed from: a */
    public int f149473a;

    /* renamed from: b */
    public C63246d f149474b;

    static {
        C56111b bVar = new C56111b();
        f149471c = bVar;
        C62942bv.registerDefaultInstance(C56111b.class, bVar);
    }

    private C56111b() {
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
                return newMessageInfo(f149471c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56111b();
            case 4:
                return new C56110a();
            case 5:
                return f149471c;
            case 6:
                C63010eb ebVar = f149472d;
                if (ebVar == null) {
                    synchronized (C56111b.class) {
                        ebVar = f149472d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149471c);
                            f149472d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
