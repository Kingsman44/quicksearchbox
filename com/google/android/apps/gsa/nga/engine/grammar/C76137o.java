package com.google.android.apps.gsa.nga.engine.grammar;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.grammar.o */
/* compiled from: PG */
public final class C76137o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C76137o f211091c;

    /* renamed from: e */
    private static volatile C63010eb f211092e;

    /* renamed from: a */
    public int f211093a = 0;

    /* renamed from: b */
    public Object f211094b;

    /* renamed from: d */
    private byte f211095d = 2;

    static {
        C76137o oVar = new C76137o();
        f211091c = oVar;
        C62942bv.registerDefaultInstance(C76137o.class, oVar);
    }

    private C76137o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f211095d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f211095d = b;
                return null;
            case 2:
                return newMessageInfo(f211091c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Ȼ\u0000\u0002м\u0000", new Object[]{"b", "a", C80513b.class});
            case 3:
                return new C76137o();
            case 4:
                return new C76136n();
            case 5:
                return f211091c;
            case 6:
                C63010eb ebVar = f211092e;
                if (ebVar == null) {
                    synchronized (C76137o.class) {
                        ebVar = f211092e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211091c);
                            f211092e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
