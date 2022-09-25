package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.ca */
/* compiled from: PG */
public final class C66603ca extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C66603ca f181183a;

    /* renamed from: b */
    public static final C62940bt f181184b;

    /* renamed from: d */
    private static volatile C63010eb f181185d;

    /* renamed from: c */
    private byte f181186c = 2;

    static {
        C66603ca caVar = new C66603ca();
        f181183a = caVar;
        C62942bv.registerDefaultInstance(C66603ca.class, caVar);
        f181184b = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, caVar, caVar, (C62958ce) null, 47096292, C63066gd.MESSAGE, C66603ca.class);
    }

    private C66603ca() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181186c);
            case 1:
                this.f181186c = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f181183a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66603ca();
            case 4:
                return new C66600bz();
            case 5:
                return f181183a;
            case 6:
                C63010eb ebVar = f181185d;
                if (ebVar == null) {
                    synchronized (C66603ca.class) {
                        ebVar = f181185d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181183a);
                            f181185d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
