package com.google.android.apps.search.googleapp.p10544z.p10546b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.z.b.d */
/* compiled from: PG */
public final class C139909d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C139909d f380326b;

    /* renamed from: c */
    private static volatile C63010eb f380327c;

    /* renamed from: a */
    public C62995dn f380328a = C62995dn.f170057a;

    static {
        C139909d dVar = new C139909d();
        f380326b = dVar;
        C62942bv.registerDefaultInstance(C139909d.class, dVar);
    }

    private C139909d() {
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
                return newMessageInfo(f380326b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C139908c.f380325a});
            case 3:
                return new C139909d();
            case 4:
                return new C139907b();
            case 5:
                return f380326b;
            case 6:
                C63010eb ebVar = f380327c;
                if (ebVar == null) {
                    synchronized (C139909d.class) {
                        ebVar = f380327c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f380326b);
                            f380327c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
