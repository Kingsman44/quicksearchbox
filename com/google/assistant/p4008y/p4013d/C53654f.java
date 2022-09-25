package com.google.assistant.p4008y.p4013d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.d.f */
/* compiled from: PG */
public final class C53654f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53654f f140821e;

    /* renamed from: f */
    private static volatile C63010eb f140822f;

    /* renamed from: a */
    public int f140823a;

    /* renamed from: b */
    public boolean f140824b = true;

    /* renamed from: c */
    public boolean f140825c;

    /* renamed from: d */
    public boolean f140826d = true;

    static {
        C53654f fVar = new C53654f();
        f140821e = fVar;
        C62942bv.registerDefaultInstance(C53654f.class, fVar);
    }

    private C53654f() {
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
                return newMessageInfo(f140821e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0002\u0003ဇ\u0001", new Object[]{"a", "b", "d", C45240c.f118157a});
            case 3:
                return new C53654f();
            case 4:
                return new C53653e();
            case 5:
                return f140821e;
            case 6:
                C63010eb ebVar = f140822f;
                if (ebVar == null) {
                    synchronized (C53654f.class) {
                        ebVar = f140822f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140821e);
                            f140822f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
