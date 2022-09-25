package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.j */
/* compiled from: PG */
public final class C123781j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C123781j f341939e;

    /* renamed from: g */
    private static volatile C63010eb f341940g;

    /* renamed from: a */
    public int f341941a;

    /* renamed from: b */
    public C123744bk f341942b;

    /* renamed from: c */
    public C123732az f341943c;

    /* renamed from: d */
    public C63042fg f341944d;

    /* renamed from: f */
    private byte f341945f = 2;

    static {
        C123781j jVar = new C123781j();
        f341939e = jVar;
        C62942bv.registerDefaultInstance(C123781j.class, jVar);
    }

    private C123781j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341945f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f341945f = b;
                return null;
            case 2:
                return newMessageInfo(f341939e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C123781j();
            case 4:
                return new C123780i();
            case 5:
                return f341939e;
            case 6:
                C63010eb ebVar = f341940g;
                if (ebVar == null) {
                    synchronized (C123781j.class) {
                        ebVar = f341940g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341939e);
                            f341940g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
