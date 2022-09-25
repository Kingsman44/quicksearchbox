package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.aau */
/* compiled from: PG */
public final class aau extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aau f237104c;

    /* renamed from: d */
    private static volatile C63010eb f237105d;

    /* renamed from: a */
    public int f237106a;

    /* renamed from: b */
    public boolean f237107b;

    static {
        aau aau = new aau();
        f237104c = aau;
        C62942bv.registerDefaultInstance(aau.class, aau);
    }

    private aau() {
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
                return newMessageInfo(f237104c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aau();
            case 4:
                return new aat();
            case 5:
                return f237104c;
            case 6:
                C63010eb ebVar = f237105d;
                if (ebVar == null) {
                    synchronized (aau.class) {
                        ebVar = f237105d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237104c);
                            f237105d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
