package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3825an.p3832d.p3833a.C49351b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aar */
/* compiled from: PG */
public final class aar extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aar f128729d;

    /* renamed from: f */
    private static volatile C63010eb f128730f;

    /* renamed from: a */
    public int f128731a = 0;

    /* renamed from: b */
    public Object f128732b;

    /* renamed from: c */
    public String f128733c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f128734e;

    static {
        aar aar = new aar();
        f128729d = aar;
        C62942bv.registerDefaultInstance(aar.class, aar);
    }

    private aar() {
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
                return newMessageInfo(f128729d, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ဿ\u0000\u0004ျ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C49351b.m85420b()});
            case 3:
                return new aar();
            case 4:
                return new aaq();
            case 5:
                return f128729d;
            case 6:
                C63010eb ebVar = f128730f;
                if (ebVar == null) {
                    synchronized (aar.class) {
                        ebVar = f128730f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128729d);
                            f128730f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
