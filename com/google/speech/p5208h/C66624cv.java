package com.google.speech.p5208h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.cv */
/* compiled from: PG */
public final class C66624cv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66624cv f181247d;

    /* renamed from: e */
    public static final C62940bt f181248e;

    /* renamed from: f */
    private static volatile C63010eb f181249f;

    /* renamed from: a */
    public int f181250a;

    /* renamed from: b */
    public boolean f181251b;

    /* renamed from: c */
    public boolean f181252c = true;

    static {
        C66624cv cvVar = new C66624cv();
        f181247d = cvVar;
        C62942bv.registerDefaultInstance(C66624cv.class, cvVar);
        f181248e = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, cvVar, cvVar, (C62958ce) null, 124211619, C63066gd.MESSAGE, C66624cv.class);
    }

    private C66624cv() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f181247d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66624cv();
            case 4:
                return new C66623cu();
            case 5:
                return f181247d;
            case 6:
                C63010eb ebVar = f181249f;
                if (ebVar == null) {
                    synchronized (C66624cv.class) {
                        ebVar = f181249f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181247d);
                            f181249f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
