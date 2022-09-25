package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.assistant.p3897e.p3921j.aas;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.az */
/* compiled from: PG */
public final class C80205az extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80205az f220051c;

    /* renamed from: e */
    private static volatile C63010eb f220052e;

    /* renamed from: a */
    public int f220053a = 0;

    /* renamed from: b */
    public Object f220054b;

    /* renamed from: d */
    private byte f220055d = 2;

    static {
        C80205az azVar = new C80205az();
        f220051c = azVar;
        C62942bv.registerDefaultInstance(C80205az.class, azVar);
    }

    private C80205az() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220055d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220055d = b;
                return null;
            case 2:
                return newMessageInfo(f220051c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0001\u0001ြ\u0000\u0002ᐼ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", C80257l.class, aas.class, C80263r.class, C62912at.class});
            case 3:
                return new C80205az();
            case 4:
                return new C80204ay();
            case 5:
                return f220051c;
            case 6:
                C63010eb ebVar = f220052e;
                if (ebVar == null) {
                    synchronized (C80205az.class) {
                        ebVar = f220052e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220051c);
                            f220052e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
