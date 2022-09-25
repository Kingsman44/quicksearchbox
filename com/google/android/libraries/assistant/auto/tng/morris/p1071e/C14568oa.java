package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.oa */
/* compiled from: PG */
public final class C14568oa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14568oa f44045d;

    /* renamed from: e */
    private static volatile C63010eb f44046e;

    /* renamed from: a */
    public C14348fx f44047a;

    /* renamed from: b */
    public boolean f44048b;

    /* renamed from: c */
    public boolean f44049c;

    static {
        C14568oa oaVar = new C14568oa();
        f44045d = oaVar;
        C62942bv.registerDefaultInstance(C14568oa.class, oaVar);
    }

    private C14568oa() {
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
                return newMessageInfo(f44045d, "\u0000\u0003\u0000\u0000\u0006\b\u0003\u0000\u0000\u0000\u0006\t\u0007\u0007\b\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14568oa();
            case 4:
                return new C14566nz();
            case 5:
                return f44045d;
            case 6:
                C63010eb ebVar = f44046e;
                if (ebVar == null) {
                    synchronized (C14568oa.class) {
                        ebVar = f44046e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44045d);
                            f44046e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
