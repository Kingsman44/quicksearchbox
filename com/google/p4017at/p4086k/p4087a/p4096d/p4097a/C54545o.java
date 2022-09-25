package com.google.p4017at.p4086k.p4087a.p4096d.p4097a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.d.a.o */
/* compiled from: PG */
public final class C54545o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54545o f143200d;

    /* renamed from: e */
    private static volatile C63010eb f143201e;

    /* renamed from: a */
    public String f143202a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public double f143203b;

    /* renamed from: c */
    public double f143204c;

    static {
        C54545o oVar = new C54545o();
        f143200d = oVar;
        C62942bv.registerDefaultInstance(C54545o.class, oVar);
    }

    private C54545o() {
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
                return newMessageInfo(f143200d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0003\u0000\u0004\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54545o();
            case 4:
                return new C54544n();
            case 5:
                return f143200d;
            case 6:
                C63010eb ebVar = f143201e;
                if (ebVar == null) {
                    synchronized (C54545o.class) {
                        ebVar = f143201e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143200d);
                            f143201e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
