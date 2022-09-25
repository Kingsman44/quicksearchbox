package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.c */
/* compiled from: PG */
public final class C56273c extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56273c f149970f;

    /* renamed from: g */
    private static volatile C63010eb f149971g;

    /* renamed from: a */
    public int f149972a;

    /* renamed from: b */
    public float f149973b;

    /* renamed from: c */
    public float f149974c;

    /* renamed from: d */
    public float f149975d;

    /* renamed from: e */
    public float f149976e;

    static {
        C56273c cVar = new C56273c();
        f149970f = cVar;
        C62942bv.registerDefaultInstance(C56273c.class, cVar);
    }

    private C56273c() {
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
                return newMessageInfo(f149970f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56273c();
            case 4:
                return new C56246b();
            case 5:
                return f149970f;
            case 6:
                C63010eb ebVar = f149971g;
                if (ebVar == null) {
                    synchronized (C56273c.class) {
                        ebVar = f149971g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149970f);
                            f149971g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
