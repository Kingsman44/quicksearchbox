package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.an */
/* compiled from: PG */
public final class C102142an extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C102142an f284946c;

    /* renamed from: d */
    private static volatile C63010eb f284947d;

    /* renamed from: a */
    public int f284948a;

    /* renamed from: b */
    public boolean f284949b;

    static {
        C102142an anVar = new C102142an();
        f284946c = anVar;
        C62942bv.registerDefaultInstance(C102142an.class, anVar);
    }

    private C102142an() {
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
                return newMessageInfo(f284946c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C102142an();
            case 4:
                return new C102141am();
            case 5:
                return f284946c;
            case 6:
                C63010eb ebVar = f284947d;
                if (ebVar == null) {
                    synchronized (C102142an.class) {
                        ebVar = f284947d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f284946c);
                            f284947d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
