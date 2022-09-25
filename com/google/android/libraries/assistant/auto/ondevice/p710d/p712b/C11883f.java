package com.google.android.libraries.assistant.auto.ondevice.p710d.p712b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.d.b.f */
/* compiled from: PG */
public final class C11883f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C11883f f38242d;

    /* renamed from: f */
    private static volatile C63010eb f38243f;

    /* renamed from: a */
    public C62971cq f38244a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f38245b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public boolean f38246c;

    /* renamed from: e */
    private int f38247e;

    static {
        C11883f fVar = new C11883f();
        f38242d = fVar;
        C62942bv.registerDefaultInstance(C11883f.class, fVar);
    }

    private C11883f() {
        emptyIntList();
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
                return newMessageInfo(f38242d, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0002\u0000\u0003\u001a\u0004\u001a\u0005ဇ\u0000", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C11883f();
            case 4:
                return new C11882e();
            case 5:
                return f38242d;
            case 6:
                C63010eb ebVar = f38243f;
                if (ebVar == null) {
                    synchronized (C11883f.class) {
                        ebVar = f38243f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38242d);
                            f38243f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
