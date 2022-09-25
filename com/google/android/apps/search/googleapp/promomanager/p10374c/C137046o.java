package com.google.android.apps.search.googleapp.promomanager.p10374c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63907au;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.c.o */
/* compiled from: PG */
public final class C137046o extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C137046o f372962e;

    /* renamed from: g */
    private static volatile C63010eb f372963g;

    /* renamed from: a */
    public int f372964a;

    /* renamed from: b */
    public C63042fg f372965b;

    /* renamed from: c */
    public boolean f372966c;

    /* renamed from: d */
    public C63907au f372967d;

    /* renamed from: f */
    private byte f372968f = 2;

    static {
        C137046o oVar = new C137046o();
        f372962e = oVar;
        C62942bv.registerDefaultInstance(C137046o.class, oVar);
    }

    private C137046o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f372968f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f372968f = b;
                return null;
            case 2:
                return newMessageInfo(f372962e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C137046o();
            case 4:
                return new C137045n();
            case 5:
                return f372962e;
            case 6:
                C63010eb ebVar = f372963g;
                if (ebVar == null) {
                    synchronized (C137046o.class) {
                        ebVar = f372963g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372962e);
                            f372963g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
