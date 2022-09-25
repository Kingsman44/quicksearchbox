package com.google.protos.p4985f.p4988b.p4993d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.d.t */
/* compiled from: PG */
public final class C64800t extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64800t f175614b;

    /* renamed from: c */
    private static volatile C63010eb f175615c;

    /* renamed from: a */
    public C62995dn f175616a = C62995dn.f170057a;

    static {
        C64800t tVar = new C64800t();
        f175614b = tVar;
        C62942bv.registerDefaultInstance(C64800t.class, tVar);
    }

    private C64800t() {
    }

    /* renamed from: a */
    public final C62995dn mo59313a() {
        C62995dn dnVar = this.f175616a;
        if (!dnVar.f170058b) {
            this.f175616a = dnVar.mo58980a();
        }
        return this.f175616a;
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
                return newMessageInfo(f175614b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C64795o.f175611a});
            case 3:
                return new C64800t();
            case 4:
                return new C64789i();
            case 5:
                return f175614b;
            case 6:
                C63010eb ebVar = f175615c;
                if (ebVar == null) {
                    synchronized (C64800t.class) {
                        ebVar = f175615c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175614b);
                            f175615c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
