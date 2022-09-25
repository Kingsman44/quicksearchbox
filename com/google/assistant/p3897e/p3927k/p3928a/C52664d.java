package com.google.assistant.p3897e.p3927k.p3928a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.k.a.d */
/* compiled from: PG */
public final class C52664d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52664d f138253a;

    /* renamed from: e */
    private static volatile C63010eb f138254e;

    /* renamed from: b */
    private int f138255b;

    /* renamed from: c */
    private C52662b f138256c;

    /* renamed from: d */
    private byte f138257d = 2;

    static {
        C52664d dVar = new C52664d();
        f138253a = dVar;
        C62942bv.registerDefaultInstance(C52664d.class, dVar);
    }

    private C52664d() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138257d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138257d = b;
                return null;
            case 2:
                return newMessageInfo(f138253a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C52664d();
            case 4:
                return new C52663c();
            case 5:
                return f138253a;
            case 6:
                C63010eb ebVar = f138254e;
                if (ebVar == null) {
                    synchronized (C52664d.class) {
                        ebVar = f138254e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138253a);
                            f138254e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
