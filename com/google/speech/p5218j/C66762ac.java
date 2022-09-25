package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.j.ac */
/* compiled from: PG */
public final class C66762ac extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66762ac f181574a;

    /* renamed from: b */
    public static final C62940bt f181575b;

    /* renamed from: c */
    private static volatile C63010eb f181576c;

    static {
        C66762ac acVar = new C66762ac();
        f181574a = acVar;
        C62942bv.registerDefaultInstance(C66762ac.class, acVar);
        f181575b = C62942bv.newSingularGeneratedExtension(C67105lf.f182433a, acVar, acVar, (C62958ce) null, 396882606, C63066gd.MESSAGE, C66762ac.class);
    }

    private C66762ac() {
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
                return newMessageInfo(f181574a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66762ac();
            case 4:
                return new C66761ab();
            case 5:
                return f181574a;
            case 6:
                C63010eb ebVar = f181576c;
                if (ebVar == null) {
                    synchronized (C66762ac.class) {
                        ebVar = f181576c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181574a);
                            f181576c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
