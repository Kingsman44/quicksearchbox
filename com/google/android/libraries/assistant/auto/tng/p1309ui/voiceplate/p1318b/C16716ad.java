package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ad */
/* compiled from: PG */
public final class C16716ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C16716ad f48880c;

    /* renamed from: d */
    private static volatile C63010eb f48881d;

    /* renamed from: a */
    public int f48882a;

    /* renamed from: b */
    public int f48883b;

    static {
        C16716ad adVar = new C16716ad();
        f48880c = adVar;
        C62942bv.registerDefaultInstance(C16716ad.class, adVar);
    }

    private C16716ad() {
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
                return newMessageInfo(f48880c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C16714ab.f48879a});
            case 3:
                return new C16716ad();
            case 4:
                return new C16713aa();
            case 5:
                return f48880c;
            case 6:
                C63010eb ebVar = f48881d;
                if (ebVar == null) {
                    synchronized (C16716ad.class) {
                        ebVar = f48881d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48880c);
                            f48881d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
