package com.google.android.apps.search.podcasts.p10590o;

import com.google.p4017at.p4082j.p4083a.C54455t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.o.u */
/* compiled from: PG */
public final class C140728u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C140728u f382156c;

    /* renamed from: d */
    private static volatile C63010eb f382157d;

    /* renamed from: a */
    public C54455t f382158a;

    /* renamed from: b */
    public int f382159b;

    static {
        C140728u uVar = new C140728u();
        f382156c = uVar;
        C62942bv.registerDefaultInstance(C140728u.class, uVar);
    }

    private C140728u() {
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
                return newMessageInfo(f382156c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C140728u();
            case 4:
                return new C140727t();
            case 5:
                return f382156c;
            case 6:
                C63010eb ebVar = f382157d;
                if (ebVar == null) {
                    synchronized (C140728u.class) {
                        ebVar = f382157d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f382156c);
                            f382157d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
