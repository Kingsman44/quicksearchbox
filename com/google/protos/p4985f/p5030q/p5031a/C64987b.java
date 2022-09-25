package com.google.protos.p4985f.p5030q.p5031a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.protos.f.q.a.b */
/* compiled from: PG */
public final class C64987b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64987b f175977b;

    /* renamed from: d */
    private static volatile C63010eb f175978d;

    /* renamed from: a */
    public C62971cq f175979a = emptyProtobufList();

    /* renamed from: c */
    private byte f175980c = 2;

    static {
        C64987b bVar = new C64987b();
        f175977b = bVar;
        C62942bv.registerDefaultInstance(C64987b.class, bVar);
    }

    private C64987b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175980c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175980c = b;
                return null;
            case 2:
                return newMessageInfo(f175977b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C67087ko.class});
            case 3:
                return new C64987b();
            case 4:
                return new C64986a();
            case 5:
                return f175977b;
            case 6:
                C63010eb ebVar = f175978d;
                if (ebVar == null) {
                    synchronized (C64987b.class) {
                        ebVar = f175978d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175977b);
                            f175978d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
