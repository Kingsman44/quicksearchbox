package com.google.android.libraries.assistant.auto.ondevice.utils.p715a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4988b.p4993d.C64782b;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.utils.a.f */
/* compiled from: PG */
public final class C11938f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C11938f f38347e;

    /* renamed from: f */
    private static volatile C63010eb f38348f;

    /* renamed from: a */
    public int f38349a;

    /* renamed from: b */
    public C64782b f38350b;

    /* renamed from: c */
    public boolean f38351c;

    /* renamed from: d */
    public C62971cq f38352d = emptyProtobufList();

    static {
        C11938f fVar = new C11938f();
        f38347e = fVar;
        C62942bv.registerDefaultInstance(C11938f.class, fVar);
    }

    private C11938f() {
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
                return newMessageInfo(f38347e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C51809dy.class});
            case 3:
                return new C11938f();
            case 4:
                return new C11937e();
            case 5:
                return f38347e;
            case 6:
                C63010eb ebVar = f38348f;
                if (ebVar == null) {
                    synchronized (C11938f.class) {
                        ebVar = f38348f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38347e);
                            f38348f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
