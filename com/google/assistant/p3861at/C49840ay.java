package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3825an.p3830c.p3831a.C49276av;
import com.google.assistant.p3825an.p3830c.p3831a.C49278ax;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ay */
/* compiled from: PG */
public final class C49840ay extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49840ay f129512f;

    /* renamed from: g */
    private static volatile C63010eb f129513g;

    /* renamed from: a */
    public int f129514a;

    /* renamed from: b */
    public String f129515b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129516c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f129517d;

    /* renamed from: e */
    public int f129518e;

    static {
        C49840ay ayVar = new C49840ay();
        f129512f = ayVar;
        C62942bv.registerDefaultInstance(C49840ay.class, ayVar);
    }

    private C49840ay() {
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
                return newMessageInfo(f129512f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C49276av.f127375a, "e", C49278ax.f127376a});
            case 3:
                return new C49840ay();
            case 4:
                return new C49839ax();
            case 5:
                return f129512f;
            case 6:
                C63010eb ebVar = f129513g;
                if (ebVar == null) {
                    synchronized (C49840ay.class) {
                        ebVar = f129513g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129512f);
                            f129513g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
