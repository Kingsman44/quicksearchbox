package com.google.p4438c.p4439a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.c.a.f */
/* compiled from: PG */
public final class C57917f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C57917f f154908f;

    /* renamed from: g */
    private static volatile C63010eb f154909g;

    /* renamed from: a */
    public int f154910a;

    /* renamed from: b */
    public int f154911b;

    /* renamed from: c */
    public int f154912c;

    /* renamed from: d */
    public int f154913d;

    /* renamed from: e */
    public C62961ch f154914e = emptyIntList();

    static {
        C57917f fVar = new C57917f();
        f154908f = fVar;
        C62942bv.registerDefaultInstance(C57917f.class, fVar);
    }

    private C57917f() {
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
                return newMessageInfo(f154908f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004'", new Object[]{"a", "b", C45240c.f118157a, "d", C66419b.m97203b(), "e"});
            case 3:
                return new C57917f();
            case 4:
                return new C57916e();
            case 5:
                return f154908f;
            case 6:
                C63010eb ebVar = f154909g;
                if (ebVar == null) {
                    synchronized (C57917f.class) {
                        ebVar = f154909g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154908f);
                            f154909g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
