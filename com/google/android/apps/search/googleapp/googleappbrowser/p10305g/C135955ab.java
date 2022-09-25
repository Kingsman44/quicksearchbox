package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.ab */
/* compiled from: PG */
public final class C135955ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C135955ab f370293d;

    /* renamed from: e */
    private static volatile C63010eb f370294e;

    /* renamed from: a */
    public int f370295a;

    /* renamed from: b */
    public boolean f370296b;

    /* renamed from: c */
    public boolean f370297c;

    static {
        C135955ab abVar = new C135955ab();
        f370293d = abVar;
        C62942bv.registerDefaultInstance(C135955ab.class, abVar);
    }

    private C135955ab() {
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
                return newMessageInfo(f370293d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C135955ab();
            case 4:
                return new C135954aa();
            case 5:
                return f370293d;
            case 6:
                C63010eb ebVar = f370294e;
                if (ebVar == null) {
                    synchronized (C135955ab.class) {
                        ebVar = f370294e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f370293d);
                            f370294e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
