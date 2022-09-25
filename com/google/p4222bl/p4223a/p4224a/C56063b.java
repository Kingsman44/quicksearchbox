package com.google.p4222bl.p4223a.p4224a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.a.b */
/* compiled from: PG */
public final class C56063b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56063b f149379c;

    /* renamed from: d */
    private static volatile C63010eb f149380d;

    /* renamed from: a */
    public int f149381a = 0;

    /* renamed from: b */
    public Object f149382b;

    static {
        C56063b bVar = new C56063b();
        f149379c = bVar;
        C62942bv.registerDefaultInstance(C56063b.class, bVar);
    }

    private C56063b() {
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
                return newMessageInfo(f149379c, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"b", "a", C56071j.class});
            case 3:
                return new C56063b();
            case 4:
                return new C56056a();
            case 5:
                return f149379c;
            case 6:
                C63010eb ebVar = f149380d;
                if (ebVar == null) {
                    synchronized (C56063b.class) {
                        ebVar = f149380d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149379c);
                            f149380d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
