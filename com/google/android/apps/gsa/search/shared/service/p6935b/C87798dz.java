package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.dz */
/* compiled from: PG */
public final class C87798dz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87798dz f237587c;

    /* renamed from: d */
    private static volatile C63010eb f237588d;

    /* renamed from: a */
    public int f237589a;

    /* renamed from: b */
    public String f237590b = BuildConfig.FLAVOR;

    static {
        C87798dz dzVar = new C87798dz();
        f237587c = dzVar;
        C62942bv.registerDefaultInstance(C87798dz.class, dzVar);
    }

    private C87798dz() {
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
                return newMessageInfo(f237587c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87798dz();
            case 4:
                return new C87797dy();
            case 5:
                return f237587c;
            case 6:
                C63010eb ebVar = f237588d;
                if (ebVar == null) {
                    synchronized (C87798dz.class) {
                        ebVar = f237588d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237587c);
                            f237588d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
