package com.google.speech.p5230n.p5232b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.b */
/* compiled from: PG */
public final class C67405b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67405b f183200a;

    /* renamed from: b */
    private static volatile C63010eb f183201b;

    static {
        C67405b bVar = new C67405b();
        f183200a = bVar;
        C62942bv.registerDefaultInstance(C67405b.class, bVar);
    }

    private C67405b() {
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
                return newMessageInfo(f183200a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67405b();
            case 4:
                return new C67384a();
            case 5:
                return f183200a;
            case 6:
                C63010eb ebVar = f183201b;
                if (ebVar == null) {
                    synchronized (C67405b.class) {
                        ebVar = f183201b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183200a);
                            f183201b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
