package com.google.speech.p5208h;

import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.f */
/* compiled from: PG */
public final class C66672f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66672f f181366c;

    /* renamed from: d */
    public static final C62940bt f181367d;

    /* renamed from: e */
    private static volatile C63010eb f181368e;

    /* renamed from: a */
    public int f181369a;

    /* renamed from: b */
    public C52081en f181370b;

    static {
        C66672f fVar = new C66672f();
        f181366c = fVar;
        C62942bv.registerDefaultInstance(C66672f.class, fVar);
        f181367d = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, fVar, fVar, (C62958ce) null, 116159442, C63066gd.MESSAGE, C66672f.class);
    }

    private C66672f() {
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
                return newMessageInfo(f181366c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C66672f();
            case 4:
                return new C66660e();
            case 5:
                return f181366c;
            case 6:
                C63010eb ebVar = f181368e;
                if (ebVar == null) {
                    synchronized (C66672f.class) {
                        ebVar = f181368e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181366c);
                            f181368e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
