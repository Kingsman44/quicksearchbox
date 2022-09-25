package com.google.android.apps.search.googleapp.saves.p10388b.p10389a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.saves.b.a.i */
/* compiled from: PG */
public final class C137202i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C137202i f373314b;

    /* renamed from: c */
    private static volatile C63010eb f373315c;

    /* renamed from: a */
    public long f373316a;

    static {
        C137202i iVar = new C137202i();
        f373314b = iVar;
        C62942bv.registerDefaultInstance(C137202i.class, iVar);
    }

    private C137202i() {
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
                return newMessageInfo(f373314b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"a"});
            case 3:
                return new C137202i();
            case 4:
                return new C137201h();
            case 5:
                return f373314b;
            case 6:
                C63010eb ebVar = f373315c;
                if (ebVar == null) {
                    synchronized (C137202i.class) {
                        ebVar = f373315c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373314b);
                            f373315c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
