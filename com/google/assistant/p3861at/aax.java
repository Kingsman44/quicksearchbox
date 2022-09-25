package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aax */
/* compiled from: PG */
public final class aax extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final aax f128740f;

    /* renamed from: g */
    private static volatile C63010eb f128741g;

    /* renamed from: a */
    public int f128742a;

    /* renamed from: b */
    public String f128743b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public abv f128744c;

    /* renamed from: d */
    public int f128745d;

    /* renamed from: e */
    public aar f128746e;

    static {
        aax aax = new aax();
        f128740f = aax;
        C62942bv.registerDefaultInstance(aax.class, aax);
    }

    private aax() {
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
                return newMessageInfo(f128740f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002\u0004ဌ\u0003\u0006ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", aau.f128739a, "e"});
            case 3:
                return new aax();
            case 4:
                return new aaw();
            case 5:
                return f128740f;
            case 6:
                C63010eb ebVar = f128741g;
                if (ebVar == null) {
                    synchronized (aax.class) {
                        ebVar = f128741g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128740f);
                            f128741g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
