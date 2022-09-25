package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.f */
/* compiled from: PG */
public final class C98215f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C98215f f274236b;

    /* renamed from: c */
    private static volatile C63010eb f274237c;

    /* renamed from: a */
    public C62995dn f274238a = C62995dn.f170057a;

    static {
        C98215f fVar = new C98215f();
        f274236b = fVar;
        C62942bv.registerDefaultInstance(C98215f.class, fVar);
    }

    private C98215f() {
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
                return newMessageInfo(f274236b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C98213d.f274235a});
            case 3:
                return new C98215f();
            case 4:
                return new C98214e();
            case 5:
                return f274236b;
            case 6:
                C63010eb ebVar = f274237c;
                if (ebVar == null) {
                    synchronized (C98215f.class) {
                        ebVar = f274237c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f274236b);
                            f274237c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
