package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.android.libraries.assistant.d.c.c.g */
/* compiled from: PG */
public final class C17905g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17905g f51296c;

    /* renamed from: d */
    private static volatile C63010eb f51297d;

    /* renamed from: a */
    public int f51298a;

    /* renamed from: b */
    public int f51299b;

    static {
        C17905g gVar = new C17905g();
        f51296c = gVar;
        C62942bv.registerDefaultInstance(C17905g.class, gVar);
    }

    private C17905g() {
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
                return newMessageInfo(f51296c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C17904f.f51295a});
            case 3:
                return new C17905g();
            case 4:
                return new C17903e();
            case 5:
                return f51296c;
            case 6:
                C63010eb ebVar = f51297d;
                if (ebVar == null) {
                    synchronized (C17905g.class) {
                        ebVar = f51297d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51296c);
                            f51297d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
