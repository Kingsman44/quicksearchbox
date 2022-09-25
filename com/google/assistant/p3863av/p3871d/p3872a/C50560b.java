package com.google.assistant.p3863av.p3871d.p3872a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.d.a.b */
/* compiled from: PG */
public final class C50560b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50560b f131586a;

    /* renamed from: e */
    private static volatile C63010eb f131587e;

    /* renamed from: b */
    private int f131588b;

    /* renamed from: c */
    private C50562d f131589c;

    /* renamed from: d */
    private byte f131590d = 2;

    static {
        C50560b bVar = new C50560b();
        f131586a = bVar;
        C62942bv.registerDefaultInstance(C50560b.class, bVar);
    }

    private C50560b() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f131590d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f131590d = b;
                return null;
            case 2:
                return newMessageInfo(f131586a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C50560b();
            case 4:
                return new C50559a();
            case 5:
                return f131586a;
            case 6:
                C63010eb ebVar = f131587e;
                if (ebVar == null) {
                    synchronized (C50560b.class) {
                        ebVar = f131587e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131586a);
                            f131587e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
