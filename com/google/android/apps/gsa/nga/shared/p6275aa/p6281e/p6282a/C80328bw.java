package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.bw */
/* compiled from: PG */
public final class C80328bw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80328bw f220422d;

    /* renamed from: e */
    private static volatile C63010eb f220423e;

    /* renamed from: a */
    public C80321bp f220424a;

    /* renamed from: b */
    public String f220425b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f220426c = BuildConfig.FLAVOR;

    static {
        C80328bw bwVar = new C80328bw();
        f220422d = bwVar;
        C62942bv.registerDefaultInstance(C80328bw.class, bwVar);
    }

    private C80328bw() {
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
                return newMessageInfo(f220422d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80328bw();
            case 4:
                return new C80327bv();
            case 5:
                return f220422d;
            case 6:
                C63010eb ebVar = f220423e;
                if (ebVar == null) {
                    synchronized (C80328bw.class) {
                        ebVar = f220423e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220422d);
                            f220423e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
