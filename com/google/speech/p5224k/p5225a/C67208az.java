package com.google.speech.p5224k.p5225a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.k.a.az */
/* compiled from: PG */
public final class C67208az extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67208az f182663a;

    /* renamed from: c */
    private static volatile C63010eb f182664c;

    /* renamed from: b */
    private byte f182665b = 2;

    static {
        C67208az azVar = new C67208az();
        f182663a = azVar;
        C62942bv.registerDefaultInstance(C67208az.class, azVar);
    }

    private C67208az() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182665b);
            case 1:
                this.f182665b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f182663a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67208az();
            case 4:
                return new C67207ay();
            case 5:
                return f182663a;
            case 6:
                C63010eb ebVar = f182664c;
                if (ebVar == null) {
                    synchronized (C67208az.class) {
                        ebVar = f182664c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182663a);
                            f182664c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
