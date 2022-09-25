package com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.k.b.h */
/* compiled from: PG */
public final class C80483h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80483h f220932d;

    /* renamed from: e */
    private static volatile C63010eb f220933e;

    /* renamed from: a */
    public String f220934a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f220935b;

    /* renamed from: c */
    public int f220936c;

    static {
        C80483h hVar = new C80483h();
        f220932d = hVar;
        C62942bv.registerDefaultInstance(C80483h.class, hVar);
    }

    private C80483h() {
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
                return newMessageInfo(f220932d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80483h();
            case 4:
                return new C80480e();
            case 5:
                return f220932d;
            case 6:
                C63010eb ebVar = f220933e;
                if (ebVar == null) {
                    synchronized (C80483h.class) {
                        ebVar = f220933e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220932d);
                            f220933e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
