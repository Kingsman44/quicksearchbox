package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.bn */
/* compiled from: PG */
public final class C82817bn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82817bn f225668e;

    /* renamed from: f */
    private static volatile C63010eb f225669f;

    /* renamed from: a */
    public String f225670a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f225671b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f225672c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f225673d;

    static {
        C82817bn bnVar = new C82817bn();
        f225668e = bnVar;
        C62942bv.registerDefaultInstance(C82817bn.class, bnVar);
    }

    private C82817bn() {
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
                return newMessageInfo(f225668e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C82817bn();
            case 4:
                return new C82816bm();
            case 5:
                return f225668e;
            case 6:
                C63010eb ebVar = f225669f;
                if (ebVar == null) {
                    synchronized (C82817bn.class) {
                        ebVar = f225669f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225668e);
                            f225669f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
