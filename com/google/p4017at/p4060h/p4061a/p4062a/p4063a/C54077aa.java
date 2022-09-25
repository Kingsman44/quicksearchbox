package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.aa */
/* compiled from: PG */
public final class C54077aa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54077aa f141883d;

    /* renamed from: f */
    private static volatile C63010eb f141884f;

    /* renamed from: a */
    public boolean f141885a;

    /* renamed from: b */
    public int f141886b = 2;

    /* renamed from: c */
    public int f141887c = 5;

    /* renamed from: e */
    private int f141888e;

    static {
        C54077aa aaVar = new C54077aa();
        f141883d = aaVar;
        C62942bv.registerDefaultInstance(C54077aa.class, aaVar);
    }

    private C54077aa() {
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
                return newMessageInfo(f141883d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C54077aa();
            case 4:
                return new C54127z();
            case 5:
                return f141883d;
            case 6:
                C63010eb ebVar = f141884f;
                if (ebVar == null) {
                    synchronized (C54077aa.class) {
                        ebVar = f141884f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141883d);
                            f141884f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
