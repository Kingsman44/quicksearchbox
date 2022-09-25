package com.google.p4117aw.p4118a.p4119a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aw.a.a.q */
/* compiled from: PG */
public final class C54639q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54639q f143453d;

    /* renamed from: e */
    private static volatile C63010eb f143454e;

    /* renamed from: a */
    public int f143455a;

    /* renamed from: b */
    public int f143456b;

    /* renamed from: c */
    public C54630h f143457c;

    static {
        C54639q qVar = new C54639q();
        f143453d = qVar;
        C62942bv.registerDefaultInstance(C54639q.class, qVar);
    }

    private C54639q() {
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
                return newMessageInfo(f143453d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C54624b.m87508b(), C45240c.f118157a});
            case 3:
                return new C54639q();
            case 4:
                return new C54638p();
            case 5:
                return f143453d;
            case 6:
                C63010eb ebVar = f143454e;
                if (ebVar == null) {
                    synchronized (C54639q.class) {
                        ebVar = f143454e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143453d);
                            f143454e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
