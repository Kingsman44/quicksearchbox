package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.cr */
/* compiled from: PG */
public final class C66620cr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66620cr f181239c;

    /* renamed from: d */
    public static final C62940bt f181240d;

    /* renamed from: e */
    private static volatile C63010eb f181241e;

    /* renamed from: a */
    public int f181242a;

    /* renamed from: b */
    public int f181243b;

    static {
        C66620cr crVar = new C66620cr();
        f181239c = crVar;
        C62942bv.registerDefaultInstance(C66620cr.class, crVar);
        f181240d = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, crVar, crVar, (C62958ce) null, 29735924, C63066gd.MESSAGE, C66620cr.class);
    }

    private C66620cr() {
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
                return newMessageInfo(f181239c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66620cr();
            case 4:
                return new C66619cq();
            case 5:
                return f181239c;
            case 6:
                C63010eb ebVar = f181241e;
                if (ebVar == null) {
                    synchronized (C66620cr.class) {
                        ebVar = f181241e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181239c);
                            f181241e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
