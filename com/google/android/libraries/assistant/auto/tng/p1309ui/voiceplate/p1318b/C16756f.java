package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.google.assistant.p3897e.p3921j.ady;
import com.google.assistant.p3897e.p3921j.aeg;
import com.google.assistant.p3897e.p3921j.aei;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.f */
/* compiled from: PG */
public final class C16756f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C16756f f49030c;

    /* renamed from: e */
    private static volatile C63010eb f49031e;

    /* renamed from: a */
    public int f49032a = 0;

    /* renamed from: b */
    public Object f49033b;

    /* renamed from: d */
    private byte f49034d = 2;

    static {
        C16756f fVar = new C16756f();
        f49030c = fVar;
        C62942bv.registerDefaultInstance(C16756f.class, fVar);
    }

    private C16756f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f49034d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f49034d = b;
                return null;
            case 2:
                return newMessageInfo(f49030c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ြ\u0000", new Object[]{"b", "a", ady.class, aei.class, aeg.class});
            case 3:
                return new C16756f();
            case 4:
                return new C16755e();
            case 5:
                return f49030c;
            case 6:
                C63010eb ebVar = f49031e;
                if (ebVar == null) {
                    synchronized (C16756f.class) {
                        ebVar = f49031e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49030c);
                            f49031e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
