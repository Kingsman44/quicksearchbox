package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.ca */
/* compiled from: PG */
public final class C80333ca extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80333ca f220432c;

    /* renamed from: d */
    private static volatile C63010eb f220433d;

    /* renamed from: a */
    public String f220434a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f220435b = BuildConfig.FLAVOR;

    static {
        C80333ca caVar = new C80333ca();
        f220432c = caVar;
        C62942bv.registerDefaultInstance(C80333ca.class, caVar);
    }

    private C80333ca() {
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
                return newMessageInfo(f220432c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C80333ca();
            case 4:
                return new C80331bz();
            case 5:
                return f220432c;
            case 6:
                C63010eb ebVar = f220433d;
                if (ebVar == null) {
                    synchronized (C80333ca.class) {
                        ebVar = f220433d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220432c);
                            f220433d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
