package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.z */
/* compiled from: PG */
public final class C16776z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C16776z f49087c;

    /* renamed from: d */
    private static volatile C63010eb f49088d;

    /* renamed from: a */
    public int f49089a;

    /* renamed from: b */
    public int f49090b;

    static {
        C16776z zVar = new C16776z();
        f49087c = zVar;
        C62942bv.registerDefaultInstance(C16776z.class, zVar);
    }

    private C16776z() {
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
                return newMessageInfo(f49087c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C16774x.f49086a});
            case 3:
                return new C16776z();
            case 4:
                return new C16773w();
            case 5:
                return f49087c;
            case 6:
                C63010eb ebVar = f49088d;
                if (ebVar == null) {
                    synchronized (C16776z.class) {
                        ebVar = f49088d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49087c);
                            f49088d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
