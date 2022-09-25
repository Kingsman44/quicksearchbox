package com.google.assistant.p3745ab.p3774z;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.z.m */
/* compiled from: PG */
public final class C48449m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48449m f125174a;

    /* renamed from: b */
    private static volatile C63010eb f125175b;

    static {
        C48449m mVar = new C48449m();
        f125174a = mVar;
        C62942bv.registerDefaultInstance(C48449m.class, mVar);
    }

    private C48449m() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f125174a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48449m();
            case 4:
                return new C48448l();
            case 5:
                return f125174a;
            case 6:
                C63010eb ebVar = f125175b;
                if (ebVar == null) {
                    synchronized (C48449m.class) {
                        ebVar = f125175b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125174a);
                            f125175b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
