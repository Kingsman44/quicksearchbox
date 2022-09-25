package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.v */
/* compiled from: PG */
public final class C48406v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48406v f125106a;

    /* renamed from: b */
    private static volatile C63010eb f125107b;

    static {
        C48406v vVar = new C48406v();
        f125106a = vVar;
        C62942bv.registerDefaultInstance(C48406v.class, vVar);
    }

    private C48406v() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f125106a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48406v();
            case 4:
                return new C48403u();
            case 5:
                return f125106a;
            case 6:
                C63010eb ebVar = f125107b;
                if (ebVar == null) {
                    synchronized (C48406v.class) {
                        ebVar = f125107b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125106a);
                            f125107b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
