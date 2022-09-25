package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.w */
/* compiled from: PG */
public final class C8693w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f30025c = new C8688r();

    /* renamed from: e */
    public static final C62962ci f30026e = new C8689s();

    /* renamed from: f */
    public static final C8693w f30027f;

    /* renamed from: g */
    private static volatile C63010eb f30028g;

    /* renamed from: a */
    public int f30029a;

    /* renamed from: b */
    public C62961ch f30030b = emptyIntList();

    /* renamed from: d */
    public C62961ch f30031d = emptyIntList();

    static {
        C8693w wVar = new C8693w();
        f30027f = wVar;
        C62942bv.registerDefaultInstance(C8693w.class, wVar);
    }

    private C8693w() {
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
                return newMessageInfo(f30027f, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0002\u0000\u0001\f\u0003,\u0004,", new Object[]{"a", "b", "d"});
            case 3:
                return new C8693w();
            case 4:
                return new C8690t();
            case 5:
                return f30027f;
            case 6:
                C63010eb ebVar = f30028g;
                if (ebVar == null) {
                    synchronized (C8693w.class) {
                        ebVar = f30028g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30027f);
                            f30028g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
