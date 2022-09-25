package com.google.speech.recognizer.p5233a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.recognizer.a.aj */
/* compiled from: PG */
public final class C67441aj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67441aj f183270b;

    /* renamed from: f */
    private static volatile C63010eb f183271f;

    /* renamed from: a */
    public int f183272a;

    /* renamed from: c */
    private int f183273c;

    /* renamed from: d */
    private C67468p f183274d;

    /* renamed from: e */
    private byte f183275e = 2;

    static {
        C67441aj ajVar = new C67441aj();
        f183270b = ajVar;
        C62942bv.registerDefaultInstance(C67441aj.class, ajVar);
    }

    private C67441aj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183275e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183275e = b;
                return null;
            case 2:
                return newMessageInfo(f183270b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{C45240c.f118157a, "d", "a"});
            case 3:
                return new C67441aj();
            case 4:
                return new C67440ai();
            case 5:
                return f183270b;
            case 6:
                C63010eb ebVar = f183271f;
                if (ebVar == null) {
                    synchronized (C67441aj.class) {
                        ebVar = f183271f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183270b);
                            f183271f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
