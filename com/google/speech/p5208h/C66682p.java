package com.google.speech.p5208h;

import com.google.p4500cm.p4514b.C58170d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.p */
/* compiled from: PG */
public final class C66682p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66682p f181399b;

    /* renamed from: c */
    public static final C62940bt f181400c;

    /* renamed from: f */
    private static volatile C63010eb f181401f;

    /* renamed from: a */
    public C58170d f181402a;

    /* renamed from: d */
    private int f181403d;

    /* renamed from: e */
    private byte f181404e = 2;

    static {
        C66682p pVar = new C66682p();
        f181399b = pVar;
        C62942bv.registerDefaultInstance(C66682p.class, pVar);
        f181400c = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, pVar, pVar, (C62958ce) null, 56527459, C63066gd.MESSAGE, C66682p.class);
    }

    private C66682p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181404e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181404e = b;
                return null;
            case 2:
                return newMessageInfo(f181399b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C66682p();
            case 4:
                return new C66681o();
            case 5:
                return f181399b;
            case 6:
                C63010eb ebVar = f181401f;
                if (ebVar == null) {
                    synchronized (C66682p.class) {
                        ebVar = f181401f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181399b);
                            f181401f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
