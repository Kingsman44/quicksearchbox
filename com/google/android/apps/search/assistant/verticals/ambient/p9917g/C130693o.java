package com.google.android.apps.search.assistant.verticals.ambient.p9917g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p4016z.C53715bm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.g.o */
/* compiled from: PG */
public final class C130693o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C130693o f357860d;

    /* renamed from: f */
    private static volatile C63010eb f357861f;

    /* renamed from: a */
    public int f357862a;

    /* renamed from: b */
    public C53715bm f357863b;

    /* renamed from: c */
    public long f357864c;

    /* renamed from: e */
    private byte f357865e = 2;

    static {
        C130693o oVar = new C130693o();
        f357860d = oVar;
        C62942bv.registerDefaultInstance(C130693o.class, oVar);
    }

    private C130693o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f357865e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f357865e = b;
                return null;
            case 2:
                return newMessageInfo(f357860d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C130693o();
            case 4:
                return new C130692n();
            case 5:
                return f357860d;
            case 6:
                C63010eb ebVar = f357861f;
                if (ebVar == null) {
                    synchronized (C130693o.class) {
                        ebVar = f357861f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f357860d);
                            f357861f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
