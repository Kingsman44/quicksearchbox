package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aab */
/* compiled from: PG */
public final class aab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aab f128678d;

    /* renamed from: f */
    private static volatile C63010eb f128679f;

    /* renamed from: a */
    public int f128680a;

    /* renamed from: b */
    public float f128681b;

    /* renamed from: c */
    public aad f128682c;

    /* renamed from: e */
    private C62995dn f128683e = C62995dn.f170057a;

    static {
        aab aab = new aab();
        f128678d = aab;
        C62942bv.registerDefaultInstance(aab.class, aab);
    }

    private aab() {
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
                return newMessageInfo(f128678d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0001\u0000\u0000\u0001ခ\u0000\u00032\u0004ဉ\u0002", new Object[]{"a", "b", "e", aaa.f128677a, C45240c.f118157a});
            case 3:
                return new aab();
            case 4:
                return new C50516zz();
            case 5:
                return f128678d;
            case 6:
                C63010eb ebVar = f128679f;
                if (ebVar == null) {
                    synchronized (aab.class) {
                        ebVar = f128679f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128678d);
                            f128679f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
