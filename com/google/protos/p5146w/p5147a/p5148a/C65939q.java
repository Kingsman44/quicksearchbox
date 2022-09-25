package com.google.protos.p5146w.p5147a.p5148a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p5146w.p5149b.p5157c.C65960j;

/* renamed from: com.google.protos.w.a.a.q */
/* compiled from: PG */
public final class C65939q extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65939q f179346a;

    /* renamed from: b */
    public static final C62940bt f179347b = C62942bv.newSingularGeneratedExtension(C65930h.f179300i, C65960j.f179410f, C65960j.f179410f, (C62958ce) null, 2006, C63066gd.MESSAGE, C65960j.class);

    /* renamed from: c */
    private static volatile C63010eb f179348c;

    static {
        C65939q qVar = new C65939q();
        f179346a = qVar;
        C62942bv.registerDefaultInstance(C65939q.class, qVar);
    }

    private C65939q() {
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
                return newMessageInfo(f179346a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65939q();
            case 4:
                return new C65938p();
            case 5:
                return f179346a;
            case 6:
                C63010eb ebVar = f179348c;
                if (ebVar == null) {
                    synchronized (C65939q.class) {
                        ebVar = f179348c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179346a);
                            f179348c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
