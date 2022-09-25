package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aff */
/* compiled from: PG */
public final class aff extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aff f129149e;

    /* renamed from: f */
    private static volatile C63010eb f129150f;

    /* renamed from: a */
    public int f129151a;

    /* renamed from: b */
    public String f129152b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public double f129153c;

    /* renamed from: d */
    public double f129154d;

    static {
        aff aff = new aff();
        f129149e = aff;
        C62942bv.registerDefaultInstance(aff.class, aff);
    }

    private aff() {
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
                return newMessageInfo(f129149e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0001\u0002က\u0002\u0003က\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new aff();
            case 4:
                return new afe();
            case 5:
                return f129149e;
            case 6:
                C63010eb ebVar = f129150f;
                if (ebVar == null) {
                    synchronized (aff.class) {
                        ebVar = f129150f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129149e);
                            f129150f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
