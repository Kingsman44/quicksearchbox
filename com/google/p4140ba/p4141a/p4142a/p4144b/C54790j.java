package com.google.p4140ba.p4141a.p4142a.p4144b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.a.b.j */
/* compiled from: PG */
public final class C54790j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54790j f143736c;

    /* renamed from: d */
    private static volatile C63010eb f143737d;

    /* renamed from: a */
    public int f143738a;

    /* renamed from: b */
    public C54789i f143739b;

    static {
        C54790j jVar = new C54790j();
        f143736c = jVar;
        C62942bv.registerDefaultInstance(C54790j.class, jVar);
    }

    private C54790j() {
        emptyProtobufList();
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
                return newMessageInfo(f143736c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C54790j();
            case 4:
                return new C54786f();
            case 5:
                return f143736c;
            case 6:
                C63010eb ebVar = f143737d;
                if (ebVar == null) {
                    synchronized (C54790j.class) {
                        ebVar = f143737d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143736c);
                            f143737d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
