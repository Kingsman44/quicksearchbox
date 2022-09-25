package com.google.p4283bv.p4380j.p4385b.p4386a.p4387a.p4388a.p4389a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.a.a.a.a.b */
/* compiled from: PG */
public final class C57684b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57684b f154072c;

    /* renamed from: d */
    private static volatile C63010eb f154073d;

    /* renamed from: a */
    public int f154074a;

    /* renamed from: b */
    public boolean f154075b;

    static {
        C57684b bVar = new C57684b();
        f154072c = bVar;
        C62942bv.registerDefaultInstance(C57684b.class, bVar);
    }

    private C57684b() {
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
                return newMessageInfo(f154072c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C57684b();
            case 4:
                return new C57683a();
            case 5:
                return f154072c;
            case 6:
                C63010eb ebVar = f154073d;
                if (ebVar == null) {
                    synchronized (C57684b.class) {
                        ebVar = f154073d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154072c);
                            f154073d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
