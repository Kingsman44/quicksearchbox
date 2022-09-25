package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.cy */
/* compiled from: PG */
public final class C56568cy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56568cy f151042c;

    /* renamed from: d */
    private static volatile C63010eb f151043d;

    /* renamed from: a */
    public C56587m f151044a;

    /* renamed from: b */
    public int f151045b;

    static {
        C56568cy cyVar = new C56568cy();
        f151042c = cyVar;
        C62942bv.registerDefaultInstance(C56568cy.class, cyVar);
    }

    private C56568cy() {
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
                return newMessageInfo(f151042c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C56568cy();
            case 4:
                return new C56566cw();
            case 5:
                return f151042c;
            case 6:
                C63010eb ebVar = f151043d;
                if (ebVar == null) {
                    synchronized (C56568cy.class) {
                        ebVar = f151043d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151042c);
                            f151043d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
