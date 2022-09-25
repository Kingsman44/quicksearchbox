package com.google.assistant.p4008y;

import com.google.assistant.p4008y.p4013d.C53660l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.b */
/* compiled from: PG */
public final class C53618b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53618b f140732c;

    /* renamed from: d */
    private static volatile C63010eb f140733d;

    /* renamed from: a */
    public int f140734a;

    /* renamed from: b */
    public C53660l f140735b;

    static {
        C53618b bVar = new C53618b();
        f140732c = bVar;
        C62942bv.registerDefaultInstance(C53618b.class, bVar);
    }

    private C53618b() {
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
                return newMessageInfo(f140732c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53618b();
            case 4:
                return new C53539a();
            case 5:
                return f140732c;
            case 6:
                C63010eb ebVar = f140733d;
                if (ebVar == null) {
                    synchronized (C53618b.class) {
                        ebVar = f140733d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140732c);
                            f140733d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
