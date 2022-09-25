package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.xk */
/* compiled from: PG */
public final class C88323xk extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C88323xk f238852f;

    /* renamed from: h */
    private static volatile C63010eb f238853h;

    /* renamed from: a */
    public int f238854a;

    /* renamed from: b */
    public long f238855b;

    /* renamed from: c */
    public long f238856c;

    /* renamed from: d */
    public C88431bb f238857d;

    /* renamed from: e */
    public long f238858e = -1;

    /* renamed from: g */
    private byte f238859g = 2;

    static {
        C88323xk xkVar = new C88323xk();
        f238852f = xkVar;
        C62942bv.registerDefaultInstance(C88323xk.class, xkVar);
    }

    private C88323xk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238859g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238859g = b;
                return null;
            case 2:
                return newMessageInfo(f238852f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0004ᐉ\u0003\u0006ဂ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C88323xk();
            case 4:
                return new C88322xj();
            case 5:
                return f238852f;
            case 6:
                C63010eb ebVar = f238853h;
                if (ebVar == null) {
                    synchronized (C88323xk.class) {
                        ebVar = f238853h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238852f);
                            f238853h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
