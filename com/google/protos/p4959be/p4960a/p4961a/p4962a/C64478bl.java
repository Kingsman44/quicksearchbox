package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.bl */
/* compiled from: PG */
public final class C64478bl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64478bl f174887c;

    /* renamed from: d */
    private static volatile C63010eb f174888d;

    /* renamed from: a */
    public String f174889a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f174890b = BuildConfig.FLAVOR;

    static {
        C64478bl blVar = new C64478bl();
        f174887c = blVar;
        C62942bv.registerDefaultInstance(C64478bl.class, blVar);
    }

    private C64478bl() {
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
                return newMessageInfo(f174887c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C64478bl();
            case 4:
                return new C64477bk();
            case 5:
                return f174887c;
            case 6:
                C63010eb ebVar = f174888d;
                if (ebVar == null) {
                    synchronized (C64478bl.class) {
                        ebVar = f174888d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174887c);
                            f174888d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
