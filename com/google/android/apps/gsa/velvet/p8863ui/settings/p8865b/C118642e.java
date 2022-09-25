package com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.b.e */
/* compiled from: PG */
public final class C118642e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C118642e f330984d;

    /* renamed from: e */
    private static volatile C63010eb f330985e;

    /* renamed from: a */
    public int f330986a;

    /* renamed from: b */
    public String f330987b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f330988c = BuildConfig.FLAVOR;

    static {
        C118642e eVar = new C118642e();
        f330984d = eVar;
        C62942bv.registerDefaultInstance(C118642e.class, eVar);
    }

    private C118642e() {
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
                return newMessageInfo(f330984d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C118642e();
            case 4:
                return new C118641d();
            case 5:
                return f330984d;
            case 6:
                C63010eb ebVar = f330985e;
                if (ebVar == null) {
                    synchronized (C118642e.class) {
                        ebVar = f330985e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f330984d);
                            f330985e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
