package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.p7585a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.a.a.a.d */
/* compiled from: PG */
public final class C96974d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C96974d f271014b;

    /* renamed from: d */
    private static volatile C63010eb f271015d;

    /* renamed from: a */
    public C62971cq f271016a = emptyProtobufList();

    /* renamed from: c */
    private byte f271017c = 2;

    static {
        C96974d dVar = new C96974d();
        f271014b = dVar;
        C62942bv.registerDefaultInstance(C96974d.class, dVar);
    }

    private C96974d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f271017c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f271017c = b;
                return null;
            case 2:
                return newMessageInfo(f271014b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C96978h.class});
            case 3:
                return new C96974d();
            case 4:
                return new C96973c();
            case 5:
                return f271014b;
            case 6:
                C63010eb ebVar = f271015d;
                if (ebVar == null) {
                    synchronized (C96974d.class) {
                        ebVar = f271015d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271014b);
                            f271015d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
