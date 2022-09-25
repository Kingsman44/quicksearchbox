package com.google.p4283bv.p4380j.p4381a.p4382a.p4383a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.a.a.a.b */
/* compiled from: PG */
public final class C57674b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57674b f154054b;

    /* renamed from: d */
    private static volatile C63010eb f154055d;

    /* renamed from: a */
    public C62971cq f154056a = emptyProtobufList();

    /* renamed from: c */
    private byte f154057c = 2;

    static {
        C57674b bVar = new C57674b();
        f154054b = bVar;
        C62942bv.registerDefaultInstance(C57674b.class, bVar);
    }

    private C57674b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154057c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154057c = b;
                return null;
            case 2:
                return newMessageInfo(f154054b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C57676d.class});
            case 3:
                return new C57674b();
            case 4:
                return new C57673a();
            case 5:
                return f154054b;
            case 6:
                C63010eb ebVar = f154055d;
                if (ebVar == null) {
                    synchronized (C57674b.class) {
                        ebVar = f154055d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154054b);
                            f154055d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
