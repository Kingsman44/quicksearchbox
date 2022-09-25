package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.dt */
/* compiled from: PG */
public final class C87792dt extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C87792dt f237575b;

    /* renamed from: e */
    private static volatile C63010eb f237576e;

    /* renamed from: a */
    public String f237577a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f237578c;

    /* renamed from: d */
    private byte f237579d = 2;

    static {
        C87792dt dtVar = new C87792dt();
        f237575b = dtVar;
        C62942bv.registerDefaultInstance(C87792dt.class, dtVar);
    }

    private C87792dt() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f237579d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f237579d = b;
                return null;
            case 2:
                return newMessageInfo(f237575b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C87792dt();
            case 4:
                return new C87791ds();
            case 5:
                return f237575b;
            case 6:
                C63010eb ebVar = f237576e;
                if (ebVar == null) {
                    synchronized (C87792dt.class) {
                        ebVar = f237576e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237575b);
                            f237576e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
