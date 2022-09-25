package com.google.assistant.p3863av.p3871d.p3872a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.net.p4726a.p4728b.C62724b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.d.a.d */
/* compiled from: PG */
public final class C50562d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50562d f131591a;

    /* renamed from: e */
    private static volatile C63010eb f131592e;

    /* renamed from: b */
    private int f131593b;

    /* renamed from: c */
    private C62724b f131594c;

    /* renamed from: d */
    private byte f131595d = 2;

    static {
        C50562d dVar = new C50562d();
        f131591a = dVar;
        C62942bv.registerDefaultInstance(C50562d.class, dVar);
    }

    private C50562d() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f131595d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f131595d = b;
                return null;
            case 2:
                return newMessageInfo(f131591a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C50562d();
            case 4:
                return new C50561c();
            case 5:
                return f131591a;
            case 6:
                C63010eb ebVar = f131592e;
                if (ebVar == null) {
                    synchronized (C50562d.class) {
                        ebVar = f131592e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131591a);
                            f131592e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
