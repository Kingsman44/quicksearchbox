package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.p7585a;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.a.a.a.g */
/* compiled from: PG */
public final class C96977g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C96977g f271018b;

    /* renamed from: e */
    private static volatile C63010eb f271019e;

    /* renamed from: a */
    public C88474x f271020a;

    /* renamed from: c */
    private int f271021c;

    /* renamed from: d */
    private byte f271022d = 2;

    static {
        C96977g gVar = new C96977g();
        f271018b = gVar;
        C62942bv.registerDefaultInstance(C96977g.class, gVar);
    }

    private C96977g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f271022d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f271022d = b;
                return null;
            case 2:
                return newMessageInfo(f271018b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C96977g();
            case 4:
                return new C96976f();
            case 5:
                return f271018b;
            case 6:
                C63010eb ebVar = f271019e;
                if (ebVar == null) {
                    synchronized (C96977g.class) {
                        ebVar = f271019e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271018b);
                            f271019e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
