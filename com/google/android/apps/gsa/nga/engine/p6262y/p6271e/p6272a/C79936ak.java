package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.ak */
/* compiled from: PG */
public final class C79936ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C79936ak f219171c;

    /* renamed from: d */
    private static volatile C63010eb f219172d;

    /* renamed from: a */
    public int f219173a;

    /* renamed from: b */
    public String f219174b = BuildConfig.FLAVOR;

    static {
        C79936ak akVar = new C79936ak();
        f219171c = akVar;
        C62942bv.registerDefaultInstance(C79936ak.class, akVar);
    }

    private C79936ak() {
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
                return newMessageInfo(f219171c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C79936ak();
            case 4:
                return new C79935aj();
            case 5:
                return f219171c;
            case 6:
                C63010eb ebVar = f219172d;
                if (ebVar == null) {
                    synchronized (C79936ak.class) {
                        ebVar = f219172d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219171c);
                            f219172d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
