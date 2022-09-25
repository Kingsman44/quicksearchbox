package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.bi */
/* compiled from: PG */
public final class C64317bi extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64317bi f173892a;

    /* renamed from: d */
    private static volatile C63010eb f173893d;

    /* renamed from: b */
    private C62995dn f173894b = C62995dn.f170057a;

    /* renamed from: c */
    private C62995dn f173895c = C62995dn.f170057a;

    static {
        C64317bi biVar = new C64317bi();
        f173892a = biVar;
        C62942bv.registerDefaultInstance(C64317bi.class, biVar);
    }

    private C64317bi() {
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
                return newMessageInfo(f173892a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", C64316bh.f173891a, C45240c.f118157a, C64315bg.f173890a});
            case 3:
                return new C64317bi();
            case 4:
                return new C64314bf();
            case 5:
                return f173892a;
            case 6:
                C63010eb ebVar = f173893d;
                if (ebVar == null) {
                    synchronized (C64317bi.class) {
                        ebVar = f173893d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173892a);
                            f173893d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
