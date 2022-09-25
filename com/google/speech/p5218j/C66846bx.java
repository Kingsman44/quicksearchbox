package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.j.bx */
/* compiled from: PG */
public final class C66846bx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66846bx f181764d;

    /* renamed from: e */
    public static final C62940bt f181765e;

    /* renamed from: f */
    private static volatile C63010eb f181766f;

    /* renamed from: a */
    public int f181767a;

    /* renamed from: b */
    public boolean f181768b;

    /* renamed from: c */
    public boolean f181769c;

    static {
        C66846bx bxVar = new C66846bx();
        f181764d = bxVar;
        C62942bv.registerDefaultInstance(C66846bx.class, bxVar);
        f181765e = C62942bv.newSingularGeneratedExtension(C66997hf.f182099z, bxVar, bxVar, (C62958ce) null, 372987231, C63066gd.MESSAGE, C66846bx.class);
    }

    private C66846bx() {
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
                return newMessageInfo(f181764d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66846bx();
            case 4:
                return new C66845bw();
            case 5:
                return f181764d;
            case 6:
                C63010eb ebVar = f181766f;
                if (ebVar == null) {
                    synchronized (C66846bx.class) {
                        ebVar = f181766f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181764d);
                            f181766f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
