package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.j.i */
/* compiled from: PG */
public final class C67018i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67018i f182179a;

    /* renamed from: b */
    public static final C62940bt f182180b;

    /* renamed from: c */
    private static volatile C63010eb f182181c;

    static {
        C67018i iVar = new C67018i();
        f182179a = iVar;
        C62942bv.registerDefaultInstance(C67018i.class, iVar);
        f182180b = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, iVar, iVar, (C62958ce) null, 430798715, C63066gd.MESSAGE, C67018i.class);
    }

    private C67018i() {
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
                return newMessageInfo(f182179a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67018i();
            case 4:
                return new C66991h();
            case 5:
                return f182179a;
            case 6:
                C63010eb ebVar = f182181c;
                if (ebVar == null) {
                    synchronized (C67018i.class) {
                        ebVar = f182181c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182179a);
                            f182181c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
