package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16716ad;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16772v;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.y */
/* compiled from: PG */
public final class C13079y extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C13079y f40577f;

    /* renamed from: h */
    private static volatile C63010eb f40578h;

    /* renamed from: a */
    public int f40579a;

    /* renamed from: b */
    public C13015ac f40580b;

    /* renamed from: c */
    public C13060f f40581c;

    /* renamed from: d */
    public C16772v f40582d;

    /* renamed from: e */
    public C16716ad f40583e;

    /* renamed from: g */
    private byte f40584g = 2;

    static {
        C13079y yVar = new C13079y();
        f40577f = yVar;
        C62942bv.registerDefaultInstance(C13079y.class, yVar);
    }

    private C13079y() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f40584g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f40584g = b;
                return null;
            case 2:
                return newMessageInfo(f40577f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C13079y();
            case 4:
                return new C13078x();
            case 5:
                return f40577f;
            case 6:
                C63010eb ebVar = f40578h;
                if (ebVar == null) {
                    synchronized (C13079y.class) {
                        ebVar = f40578h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40577f);
                            f40578h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
