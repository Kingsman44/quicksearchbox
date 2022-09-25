package com.google.android.apps.search.googleapp.compliance;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.compliance.v */
/* compiled from: PG */
public final class C133655v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C133655v f364060c;

    /* renamed from: d */
    private static volatile C63010eb f364061d;

    /* renamed from: a */
    public int f364062a;

    /* renamed from: b */
    public boolean f364063b;

    static {
        C133655v vVar = new C133655v();
        f364060c = vVar;
        C62942bv.registerDefaultInstance(C133655v.class, vVar);
    }

    private C133655v() {
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
                return newMessageInfo(f364060c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C133655v();
            case 4:
                return new C133654u();
            case 5:
                return f364060c;
            case 6:
                C63010eb ebVar = f364061d;
                if (ebVar == null) {
                    synchronized (C133655v.class) {
                        ebVar = f364061d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f364060c);
                            f364061d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
