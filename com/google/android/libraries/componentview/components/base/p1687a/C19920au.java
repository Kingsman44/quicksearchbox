package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.base.a.au */
/* compiled from: PG */
public final class C19920au extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19920au f55724b;

    /* renamed from: c */
    private static volatile C63010eb f55725c;

    /* renamed from: a */
    public C62961ch f55726a = emptyIntList();

    static {
        C19920au auVar = new C19920au();
        f55724b = auVar;
        C62942bv.registerDefaultInstance(C19920au.class, auVar);
    }

    private C19920au() {
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
                return newMessageInfo(f55724b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C19918as.f55723a});
            case 3:
                return new C19920au();
            case 4:
                return new C19917ar();
            case 5:
                return f55724b;
            case 6:
                C63010eb ebVar = f55725c;
                if (ebVar == null) {
                    synchronized (C19920au.class) {
                        ebVar = f55725c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55724b);
                            f55725c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
