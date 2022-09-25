package com.google.android.apps.search.googleapp.notificationsurvey;

import com.google.p4283bv.p4354e.p4356b.C57057b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.notificationsurvey.n */
/* compiled from: PG */
public final class C136824n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C136824n f372430c;

    /* renamed from: e */
    private static volatile C63010eb f372431e;

    /* renamed from: a */
    public int f372432a;

    /* renamed from: b */
    public C57057b f372433b;

    /* renamed from: d */
    private byte f372434d = 2;

    static {
        C136824n nVar = new C136824n();
        f372430c = nVar;
        C62942bv.registerDefaultInstance(C136824n.class, nVar);
    }

    private C136824n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f372434d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f372434d = b;
                return null;
            case 2:
                return newMessageInfo(f372430c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C136824n();
            case 4:
                return new C136823m();
            case 5:
                return f372430c;
            case 6:
                C63010eb ebVar = f372431e;
                if (ebVar == null) {
                    synchronized (C136824n.class) {
                        ebVar = f372431e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372430c);
                            f372431e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
