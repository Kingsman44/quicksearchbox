package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.ax */
/* compiled from: PG */
public final class C80302ax extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80302ax f220374c;

    /* renamed from: d */
    private static volatile C63010eb f220375d;

    /* renamed from: a */
    public String f220376a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C80301aw f220377b;

    static {
        C80302ax axVar = new C80302ax();
        f220374c = axVar;
        C62942bv.registerDefaultInstance(C80302ax.class, axVar);
    }

    private C80302ax() {
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
                return newMessageInfo(f220374c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C80302ax();
            case 4:
                return new C80299au();
            case 5:
                return f220374c;
            case 6:
                C63010eb ebVar = f220375d;
                if (ebVar == null) {
                    synchronized (C80302ax.class) {
                        ebVar = f220375d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220374c);
                            f220375d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
