package com.google.protos.p4985f.p4988b.p4996f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.f.b */
/* compiled from: PG */
public final class C64806b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64806b f175620a;

    /* renamed from: b */
    private static volatile C63010eb f175621b;

    static {
        C64806b bVar = new C64806b();
        f175620a = bVar;
        C62942bv.registerDefaultInstance(C64806b.class, bVar);
    }

    private C64806b() {
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
                return newMessageInfo(f175620a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C64806b();
            case 4:
                return new C64805a();
            case 5:
                return f175620a;
            case 6:
                C63010eb ebVar = f175621b;
                if (ebVar == null) {
                    synchronized (C64806b.class) {
                        ebVar = f175621b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175620a);
                            f175621b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
