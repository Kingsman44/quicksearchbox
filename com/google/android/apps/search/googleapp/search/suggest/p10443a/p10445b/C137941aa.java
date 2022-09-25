package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.b.aa */
/* compiled from: PG */
public final class C137941aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C137941aa f375287c;

    /* renamed from: d */
    private static volatile C63010eb f375288d;

    /* renamed from: a */
    public int f375289a;

    /* renamed from: b */
    public boolean f375290b;

    static {
        C137941aa aaVar = new C137941aa();
        f375287c = aaVar;
        C62942bv.registerDefaultInstance(C137941aa.class, aaVar);
    }

    private C137941aa() {
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
                return newMessageInfo(f375287c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C137941aa();
            case 4:
                return new C137966z();
            case 5:
                return f375287c;
            case 6:
                C63010eb ebVar = f375288d;
                if (ebVar == null) {
                    synchronized (C137941aa.class) {
                        ebVar = f375288d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375287c);
                            f375288d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
