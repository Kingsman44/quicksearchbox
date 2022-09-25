package com.google.p4283bv.p4380j.p4381a.p4382a.p4384b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p395al.p398b.p399a.p402b.p403a.p404a.C8431d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.a.a.b.b */
/* compiled from: PG */
public final class C57678b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57678b f154063b;

    /* renamed from: e */
    private static volatile C63010eb f154064e;

    /* renamed from: a */
    public C8431d f154065a;

    /* renamed from: c */
    private int f154066c;

    /* renamed from: d */
    private byte f154067d = 2;

    static {
        C57678b bVar = new C57678b();
        f154063b = bVar;
        C62942bv.registerDefaultInstance(C57678b.class, bVar);
    }

    private C57678b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154067d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154067d = b;
                return null;
            case 2:
                return newMessageInfo(f154063b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C57678b();
            case 4:
                return new C57677a();
            case 5:
                return f154063b;
            case 6:
                C63010eb ebVar = f154064e;
                if (ebVar == null) {
                    synchronized (C57678b.class) {
                        ebVar = f154064e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154063b);
                            f154064e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
