package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.au */
/* compiled from: PG */
public final class C87712au extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87712au f237180c;

    /* renamed from: d */
    private static volatile C63010eb f237181d;

    /* renamed from: a */
    public int f237182a;

    /* renamed from: b */
    public boolean f237183b;

    static {
        C87712au auVar = new C87712au();
        f237180c = auVar;
        C62942bv.registerDefaultInstance(C87712au.class, auVar);
    }

    private C87712au() {
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
                return newMessageInfo(f237180c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87712au();
            case 4:
                return new C87711at();
            case 5:
                return f237180c;
            case 6:
                C63010eb ebVar = f237181d;
                if (ebVar == null) {
                    synchronized (C87712au.class) {
                        ebVar = f237181d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237180c);
                            f237181d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
