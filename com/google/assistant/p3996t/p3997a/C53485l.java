package com.google.assistant.p3996t.p3997a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.t.a.l */
/* compiled from: PG */
public final class C53485l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53485l f140364d;

    /* renamed from: e */
    private static volatile C63010eb f140365e;

    /* renamed from: a */
    public String f140366a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f140367b;

    /* renamed from: c */
    public int f140368c;

    static {
        C53485l lVar = new C53485l();
        f140364d = lVar;
        C62942bv.registerDefaultInstance(C53485l.class, lVar);
    }

    private C53485l() {
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
                return newMessageInfo(f140364d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53485l();
            case 4:
                return new C53484k();
            case 5:
                return f140364d;
            case 6:
                C63010eb ebVar = f140365e;
                if (ebVar == null) {
                    synchronized (C53485l.class) {
                        ebVar = f140365e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140364d);
                            f140365e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
