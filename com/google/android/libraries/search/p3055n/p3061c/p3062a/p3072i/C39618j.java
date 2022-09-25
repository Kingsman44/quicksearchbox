package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3072i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.c.a.i.j */
/* compiled from: PG */
public final class C39618j extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C39618j f104289c;

    /* renamed from: e */
    private static volatile C63010eb f104290e;

    /* renamed from: a */
    public int f104291a;

    /* renamed from: b */
    public boolean f104292b;

    /* renamed from: d */
    private byte f104293d = 2;

    static {
        C39618j jVar = new C39618j();
        f104289c = jVar;
        C62942bv.registerDefaultInstance(C39618j.class, jVar);
    }

    private C39618j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f104293d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f104293d = b;
                return null;
            case 2:
                return newMessageInfo(f104289c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C39618j();
            case 4:
                return new C39617i();
            case 5:
                return f104289c;
            case 6:
                C63010eb ebVar = f104290e;
                if (ebVar == null) {
                    synchronized (C39618j.class) {
                        ebVar = f104290e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104289c);
                            f104290e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
