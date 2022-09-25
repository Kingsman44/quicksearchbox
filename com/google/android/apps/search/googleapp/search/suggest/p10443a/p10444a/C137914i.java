package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10444a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.a.i */
/* compiled from: PG */
public final class C137914i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C137914i f375234c;

    /* renamed from: d */
    private static volatile C63010eb f375235d;

    /* renamed from: a */
    public int f375236a;

    /* renamed from: b */
    public boolean f375237b;

    static {
        C137914i iVar = new C137914i();
        f375234c = iVar;
        C62942bv.registerDefaultInstance(C137914i.class, iVar);
    }

    private C137914i() {
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
                return newMessageInfo(f375234c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C137914i();
            case 4:
                return new C137913h();
            case 5:
                return f375234c;
            case 6:
                C63010eb ebVar = f375235d;
                if (ebVar == null) {
                    synchronized (C137914i.class) {
                        ebVar = f375235d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375234c);
                            f375235d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
