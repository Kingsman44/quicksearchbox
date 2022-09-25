package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.aw */
/* compiled from: PG */
public final class C80301aw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80301aw f220371b;

    /* renamed from: c */
    private static volatile C63010eb f220372c;

    /* renamed from: a */
    public String f220373a = BuildConfig.FLAVOR;

    static {
        C80301aw awVar = new C80301aw();
        f220371b = awVar;
        C62942bv.registerDefaultInstance(C80301aw.class, awVar);
    }

    private C80301aw() {
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
                return newMessageInfo(f220371b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C80301aw();
            case 4:
                return new C80300av();
            case 5:
                return f220371b;
            case 6:
                C63010eb ebVar = f220372c;
                if (ebVar == null) {
                    synchronized (C80301aw.class) {
                        ebVar = f220372c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220371b);
                            f220372c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
