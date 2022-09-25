package com.google.assistant.p3860as;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.au */
/* compiled from: PG */
public final class C49758au extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49758au f128490b;

    /* renamed from: f */
    private static volatile C63010eb f128491f;

    /* renamed from: a */
    public C62971cq f128492a = emptyProtobufList();

    /* renamed from: c */
    private int f128493c;

    /* renamed from: d */
    private C61752n f128494d;

    /* renamed from: e */
    private byte f128495e = 2;

    static {
        C49758au auVar = new C49758au();
        f128490b = auVar;
        C62942bv.registerDefaultInstance(C49758au.class, auVar);
    }

    private C49758au() {
        C62942bv.emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128495e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128495e = b;
                return null;
            case 2:
                return newMessageInfo(f128490b, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0003\u001b", new Object[]{C45240c.f118157a, "d", "a", C49775bk.class});
            case 3:
                return new C49758au();
            case 4:
                return new C49757at();
            case 5:
                return f128490b;
            case 6:
                C63010eb ebVar = f128491f;
                if (ebVar == null) {
                    synchronized (C49758au.class) {
                        ebVar = f128491f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128490b);
                            f128491f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
