package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.kg */
/* compiled from: PG */
public final class C52236kg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52236kg f137089d;

    /* renamed from: e */
    private static volatile C63010eb f137090e;

    /* renamed from: a */
    public int f137091a;

    /* renamed from: b */
    public int f137092b;

    /* renamed from: c */
    public String f137093c = BuildConfig.FLAVOR;

    static {
        C52236kg kgVar = new C52236kg();
        f137089d = kgVar;
        C62942bv.registerDefaultInstance(C52236kg.class, kgVar);
    }

    private C52236kg() {
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
                return newMessageInfo(f137089d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C52235kf.m86550b(), C45240c.f118157a});
            case 3:
                return new C52236kg();
            case 4:
                return new C52233kd();
            case 5:
                return f137089d;
            case 6:
                C63010eb ebVar = f137090e;
                if (ebVar == null) {
                    synchronized (C52236kg.class) {
                        ebVar = f137090e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137089d);
                            f137090e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
