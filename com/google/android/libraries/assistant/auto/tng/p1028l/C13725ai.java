package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5224k.p5225a.C67238p;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.ai */
/* compiled from: PG */
public final class C13725ai extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C13725ai f41855d;

    /* renamed from: f */
    private static volatile C63010eb f41856f;

    /* renamed from: a */
    public int f41857a;

    /* renamed from: b */
    public C67238p f41858b;

    /* renamed from: c */
    public C61752n f41859c;

    /* renamed from: e */
    private byte f41860e = 2;

    static {
        C13725ai aiVar = new C13725ai();
        f41855d = aiVar;
        C62942bv.registerDefaultInstance(C13725ai.class, aiVar);
    }

    private C13725ai() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f41860e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f41860e = b;
                return null;
            case 2:
                return newMessageInfo(f41855d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C13725ai();
            case 4:
                return new C13724ah();
            case 5:
                return f41855d;
            case 6:
                C63010eb ebVar = f41856f;
                if (ebVar == null) {
                    synchronized (C13725ai.class) {
                        ebVar = f41856f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41855d);
                            f41856f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
