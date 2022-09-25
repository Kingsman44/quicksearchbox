package com.google.p5277z.p5281b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.b.d */
/* compiled from: PG */
public final class C67983d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67983d f184217c;

    /* renamed from: e */
    private static volatile C63010eb f184218e;

    /* renamed from: a */
    public C62971cq f184219a = emptyProtobufList();

    /* renamed from: b */
    public C67989j f184220b;

    /* renamed from: d */
    private byte f184221d = 2;

    static {
        C67983d dVar = new C67983d();
        f184217c = dVar;
        C62942bv.registerDefaultInstance(C67983d.class, dVar);
    }

    private C67983d() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184221d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184221d = b;
                return null;
            case 2:
                return newMessageInfo(f184217c, "\u0000\u0002\u0000\u0000\u0002\b\u0002\u0000\u0001\u0001\u0002Л\b\t", new Object[]{"a", C67981b.class, "b"});
            case 3:
                return new C67983d();
            case 4:
                return new C67982c();
            case 5:
                return f184217c;
            case 6:
                C63010eb ebVar = f184218e;
                if (ebVar == null) {
                    synchronized (C67983d.class) {
                        ebVar = f184218e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184217c);
                            f184218e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
