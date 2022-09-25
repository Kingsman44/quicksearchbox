package com.google.p4653i.p4654a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.au */
/* compiled from: PG */
public final class C61680au extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C61680au f166625b;

    /* renamed from: c */
    private static volatile C63010eb f166626c;

    /* renamed from: a */
    public C62961ch f166627a = emptyIntList();

    static {
        C61680au auVar = new C61680au();
        f166625b = auVar;
        C62942bv.registerDefaultInstance(C61680au.class, auVar);
    }

    private C61680au() {
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
                return newMessageInfo(f166625b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C61677ar.f166624a});
            case 3:
                return new C61680au();
            case 4:
                return new C61679at();
            case 5:
                return f166625b;
            case 6:
                C63010eb ebVar = f166626c;
                if (ebVar == null) {
                    synchronized (C61680au.class) {
                        ebVar = f166626c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166625b);
                            f166626c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
