package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.an */
/* compiled from: PG */
public final class C16726an extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C16726an f48921d;

    /* renamed from: e */
    private static volatile C63010eb f48922e;

    /* renamed from: a */
    public int f48923a;

    /* renamed from: b */
    public boolean f48924b;

    /* renamed from: c */
    public boolean f48925c;

    static {
        C16726an anVar = new C16726an();
        f48921d = anVar;
        C62942bv.registerDefaultInstance(C16726an.class, anVar);
    }

    private C16726an() {
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
                return newMessageInfo(f48921d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C16726an();
            case 4:
                return new C16725am();
            case 5:
                return f48921d;
            case 6:
                C63010eb ebVar = f48922e;
                if (ebVar == null) {
                    synchronized (C16726an.class) {
                        ebVar = f48922e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48921d);
                            f48922e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
