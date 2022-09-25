package com.google.assistant.p3858ar.p3859a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.C48766x;
import com.google.p4242bp.p4257f.p4262c.p4263a.C56339j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ar.a.f */
/* compiled from: PG */
public final class C49716f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49716f f128307b;

    /* renamed from: e */
    private static volatile C63010eb f128308e;

    /* renamed from: a */
    public C56339j f128309a;

    /* renamed from: c */
    private int f128310c;

    /* renamed from: d */
    private C48766x f128311d;

    static {
        C49716f fVar = new C49716f();
        f128307b = fVar;
        C62942bv.registerDefaultInstance(C49716f.class, fVar);
    }

    private C49716f() {
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
                return newMessageInfo(f128307b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{C45240c.f118157a, "d", "a"});
            case 3:
                return new C49716f();
            case 4:
                return new C49715e();
            case 5:
                return f128307b;
            case 6:
                C63010eb ebVar = f128308e;
                if (ebVar == null) {
                    synchronized (C49716f.class) {
                        ebVar = f128308e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128307b);
                            f128308e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
