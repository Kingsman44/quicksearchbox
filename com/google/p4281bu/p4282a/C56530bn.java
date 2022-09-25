package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.bn */
/* compiled from: PG */
public final class C56530bn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56530bn f150959c;

    /* renamed from: d */
    private static volatile C63010eb f150960d;

    /* renamed from: a */
    public String f150961a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f150962b = BuildConfig.FLAVOR;

    static {
        C56530bn bnVar = new C56530bn();
        f150959c = bnVar;
        C62942bv.registerDefaultInstance(C56530bn.class, bnVar);
    }

    private C56530bn() {
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
                return newMessageInfo(f150959c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C56530bn();
            case 4:
                return new C56529bm();
            case 5:
                return f150959c;
            case 6:
                C63010eb ebVar = f150960d;
                if (ebVar == null) {
                    synchronized (C56530bn.class) {
                        ebVar = f150960d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150959c);
                            f150960d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
