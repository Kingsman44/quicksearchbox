package com.google.p4242bp.p4257f.p4262c.p4263a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.c.a.f */
/* compiled from: PG */
public final class C56335f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56335f f150159c;

    /* renamed from: d */
    private static volatile C63010eb f150160d;

    /* renamed from: a */
    public int f150161a;

    /* renamed from: b */
    public float f150162b;

    static {
        C56335f fVar = new C56335f();
        f150159c = fVar;
        C62942bv.registerDefaultInstance(C56335f.class, fVar);
    }

    private C56335f() {
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
                return newMessageInfo(f150159c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56335f();
            case 4:
                return new C56334e();
            case 5:
                return f150159c;
            case 6:
                C63010eb ebVar = f150160d;
                if (ebVar == null) {
                    synchronized (C56335f.class) {
                        ebVar = f150160d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150159c);
                            f150160d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
