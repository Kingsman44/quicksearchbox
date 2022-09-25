package com.google.p4129b.p4130a.p4131a.p4132a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.bn */
/* compiled from: PG */
public final class C54697bn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54697bn f143570e;

    /* renamed from: f */
    private static volatile C63010eb f143571f;

    /* renamed from: a */
    public int f143572a = 0;

    /* renamed from: b */
    public Object f143573b;

    /* renamed from: c */
    public int f143574c;

    /* renamed from: d */
    public String f143575d = BuildConfig.FLAVOR;

    static {
        C54697bn bnVar = new C54697bn();
        f143570e = bnVar;
        C62942bv.registerDefaultInstance(C54697bn.class, bnVar);
    }

    private C54697bn() {
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
                return newMessageInfo(f143570e, "\u0000\u0005\u0001\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0004?\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"b", "a", C45240c.f118157a, "d", C54740z.class, C54683b.class});
            case 3:
                return new C54697bn();
            case 4:
                return new C54696bm();
            case 5:
                return f143570e;
            case 6:
                C63010eb ebVar = f143571f;
                if (ebVar == null) {
                    synchronized (C54697bn.class) {
                        ebVar = f143571f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143570e);
                            f143571f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
