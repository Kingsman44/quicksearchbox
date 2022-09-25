package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.ay */
/* compiled from: PG */
public final class C124454ay extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C124454ay f343460c;

    /* renamed from: d */
    private static volatile C63010eb f343461d;

    /* renamed from: a */
    public int f343462a;

    /* renamed from: b */
    public C119885dz f343463b;

    static {
        C124454ay ayVar = new C124454ay();
        f343460c = ayVar;
        C62942bv.registerDefaultInstance(C124454ay.class, ayVar);
    }

    private C124454ay() {
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
                return newMessageInfo(f343460c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C124454ay();
            case 4:
                return new C124453ax();
            case 5:
                return f343460c;
            case 6:
                C63010eb ebVar = f343461d;
                if (ebVar == null) {
                    synchronized (C124454ay.class) {
                        ebVar = f343461d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343460c);
                            f343461d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
