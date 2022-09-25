package com.google.p4184bj.p4204d.p4205a.p4207b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.d.a.b.b */
/* compiled from: PG */
public final class C56010b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56010b f149170c;

    /* renamed from: d */
    private static volatile C63010eb f149171d;

    /* renamed from: a */
    public int f149172a = 0;

    /* renamed from: b */
    public Object f149173b;

    static {
        C56010b bVar = new C56010b();
        f149170c = bVar;
        C62942bv.registerDefaultInstance(C56010b.class, bVar);
    }

    private C56010b() {
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
                return newMessageInfo(f149170c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ွ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C56010b();
            case 4:
                return new C56009a();
            case 5:
                return f149170c;
            case 6:
                C63010eb ebVar = f149171d;
                if (ebVar == null) {
                    synchronized (C56010b.class) {
                        ebVar = f149171d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149170c);
                            f149171d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
