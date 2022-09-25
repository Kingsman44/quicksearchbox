package com.google.p4017at.p4082j.p4083a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.bl */
/* compiled from: PG */
public final class C54359bl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54359bl f142795d;

    /* renamed from: e */
    private static volatile C63010eb f142796e;

    /* renamed from: a */
    public String f142797a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f142798b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f142799c = BuildConfig.FLAVOR;

    static {
        C54359bl blVar = new C54359bl();
        f142795d = blVar;
        C62942bv.registerDefaultInstance(C54359bl.class, blVar);
    }

    private C54359bl() {
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
                return newMessageInfo(f142795d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54359bl();
            case 4:
                return new C54358bk();
            case 5:
                return f142795d;
            case 6:
                C63010eb ebVar = f142796e;
                if (ebVar == null) {
                    synchronized (C54359bl.class) {
                        ebVar = f142796e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142795d);
                            f142796e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
