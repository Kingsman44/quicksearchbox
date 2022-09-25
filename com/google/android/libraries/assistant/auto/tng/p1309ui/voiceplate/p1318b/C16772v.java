package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.v */
/* compiled from: PG */
public final class C16772v extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C16772v f49081d;

    /* renamed from: e */
    private static volatile C63010eb f49082e;

    /* renamed from: a */
    public int f49083a;

    /* renamed from: b */
    public boolean f49084b;

    /* renamed from: c */
    public boolean f49085c;

    static {
        C16772v vVar = new C16772v();
        f49081d = vVar;
        C62942bv.registerDefaultInstance(C16772v.class, vVar);
    }

    private C16772v() {
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
                return newMessageInfo(f49081d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C16772v();
            case 4:
                return new C16771u();
            case 5:
                return f49081d;
            case 6:
                C63010eb ebVar = f49082e;
                if (ebVar == null) {
                    synchronized (C16772v.class) {
                        ebVar = f49082e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49081d);
                            f49082e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
