package com.google.android.apps.gsa.opaonboarding.p6462d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C49879cj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.d.f */
/* compiled from: PG */
public final class C83919f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83919f f228563e;

    /* renamed from: f */
    private static volatile C63010eb f228564f;

    /* renamed from: a */
    public int f228565a;

    /* renamed from: b */
    public C62971cq f228566b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public int f228567c;

    /* renamed from: d */
    public C62971cq f228568d = emptyProtobufList();

    static {
        C83919f fVar = new C83919f();
        f228563e = fVar;
        C62942bv.registerDefaultInstance(C83919f.class, fVar);
    }

    private C83919f() {
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
                return newMessageInfo(f228563e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001a\u0002ဌ\u0000\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C83920g.f228569a, "d", C49879cj.class});
            case 3:
                return new C83919f();
            case 4:
                return new C83918e();
            case 5:
                return f228563e;
            case 6:
                C63010eb ebVar = f228564f;
                if (ebVar == null) {
                    synchronized (C83919f.class) {
                        ebVar = f228564f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228563e);
                            f228564f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
