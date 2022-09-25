package com.google.android.libraries.web.weblayer.p3464f.p3465a.p3466a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.web.weblayer.f.a.a.e */
/* compiled from: PG */
public final class C44231e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C44231e f115028a;

    /* renamed from: c */
    private static volatile C63010eb f115029c;

    /* renamed from: b */
    private C62995dn f115030b = C62995dn.f170057a;

    static {
        C44231e eVar = new C44231e();
        f115028a = eVar;
        C62942bv.registerDefaultInstance(C44231e.class, eVar);
    }

    private C44231e() {
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
                return newMessageInfo(f115028a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C44230d.f115027a});
            case 3:
                return new C44231e();
            case 4:
                return new C44229c();
            case 5:
                return f115028a;
            case 6:
                C63010eb ebVar = f115029c;
                if (ebVar == null) {
                    synchronized (C44231e.class) {
                        ebVar = f115029c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f115028a);
                            f115029c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
