package com.google.p4160bf.p4164b.p4165a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55526af;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.au */
/* compiled from: PG */
public final class C55611au extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55611au f146727d;

    /* renamed from: f */
    private static volatile C63010eb f146728f;

    /* renamed from: a */
    public C62971cq f146729a = emptyProtobufList();

    /* renamed from: b */
    public long f146730b;

    /* renamed from: c */
    public long f146731c;

    /* renamed from: e */
    private int f146732e;

    static {
        C55611au auVar = new C55611au();
        f146727d = auVar;
        C62942bv.registerDefaultInstance(C55611au.class, auVar);
    }

    private C55611au() {
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
                return newMessageInfo(f146727d, "\u0001\u0003\u0000\u0001\u0004\u0007\u0003\u0000\u0001\u0000\u0004ဂ\u0001\u0005ဂ\u0002\u0007\u001b", new Object[]{"e", "b", C45240c.f118157a, "a", C55526af.class});
            case 3:
                return new C55611au();
            case 4:
                return new C55610at();
            case 5:
                return f146727d;
            case 6:
                C63010eb ebVar = f146728f;
                if (ebVar == null) {
                    synchronized (C55611au.class) {
                        ebVar = f146728f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146727d);
                            f146728f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
