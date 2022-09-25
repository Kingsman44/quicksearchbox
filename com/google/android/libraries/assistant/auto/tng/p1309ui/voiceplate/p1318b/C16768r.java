package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.r */
/* compiled from: PG */
public final class C16768r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C16768r f49069c;

    /* renamed from: d */
    private static volatile C63010eb f49070d;

    /* renamed from: a */
    public int f49071a;

    /* renamed from: b */
    public int f49072b;

    static {
        C16768r rVar = new C16768r();
        f49069c = rVar;
        C62942bv.registerDefaultInstance(C16768r.class, rVar);
    }

    private C16768r() {
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
                return newMessageInfo(f49069c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C16768r();
            case 4:
                return new C16767q();
            case 5:
                return f49069c;
            case 6:
                C63010eb ebVar = f49070d;
                if (ebVar == null) {
                    synchronized (C16768r.class) {
                        ebVar = f49070d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49069c);
                            f49070d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
