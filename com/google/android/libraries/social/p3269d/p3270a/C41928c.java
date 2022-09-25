package com.google.android.libraries.social.p3269d.p3270a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.social.d.a.c */
/* compiled from: PG */
public final class C41928c extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C41928c f109385a;

    /* renamed from: d */
    private static volatile C63010eb f109386d;

    /* renamed from: b */
    private C62995dn f109387b = C62995dn.f170057a;

    /* renamed from: c */
    private byte f109388c = 2;

    static {
        C41928c cVar = new C41928c();
        f109385a = cVar;
        C62942bv.registerDefaultInstance(C41928c.class, cVar);
    }

    private C41928c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f109388c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f109388c = b;
                return null;
            case 2:
                return newMessageInfo(f109385a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C41927b.f109384a});
            case 3:
                return new C41928c();
            case 4:
                return new C41923a();
            case 5:
                return f109385a;
            case 6:
                C63010eb ebVar = f109386d;
                if (ebVar == null) {
                    synchronized (C41928c.class) {
                        ebVar = f109386d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109385a);
                            f109386d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
