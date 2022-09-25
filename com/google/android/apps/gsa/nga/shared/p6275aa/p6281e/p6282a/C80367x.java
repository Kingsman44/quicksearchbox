package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.x */
/* compiled from: PG */
public final class C80367x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80367x f220521c;

    /* renamed from: d */
    private static volatile C63010eb f220522d;

    /* renamed from: a */
    public String f220523a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f220524b;

    static {
        C80367x xVar = new C80367x();
        f220521c = xVar;
        C62942bv.registerDefaultInstance(C80367x.class, xVar);
    }

    private C80367x() {
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
                return newMessageInfo(f220521c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C80367x();
            case 4:
                return new C80366w();
            case 5:
                return f220521c;
            case 6:
                C63010eb ebVar = f220522d;
                if (ebVar == null) {
                    synchronized (C80367x.class) {
                        ebVar = f220522d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220521c);
                            f220522d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
