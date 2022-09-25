package com.google.protos.p4985f.p5030q.p5033c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.c.b */
/* compiled from: PG */
public final class C65108b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65108b f176264c;

    /* renamed from: d */
    private static volatile C63010eb f176265d;

    /* renamed from: a */
    public int f176266a;

    /* renamed from: b */
    public long f176267b;

    static {
        C65108b bVar = new C65108b();
        f176264c = bVar;
        C62942bv.registerDefaultInstance(C65108b.class, bVar);
    }

    private C65108b() {
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
                return newMessageInfo(f176264c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65108b();
            case 4:
                return new C65107a();
            case 5:
                return f176264c;
            case 6:
                C63010eb ebVar = f176265d;
                if (ebVar == null) {
                    synchronized (C65108b.class) {
                        ebVar = f176265d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176264c);
                            f176265d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
