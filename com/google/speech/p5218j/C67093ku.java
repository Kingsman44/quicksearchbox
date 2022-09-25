package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ku */
/* compiled from: PG */
public final class C67093ku extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67093ku f182396a;

    /* renamed from: c */
    private static volatile C63010eb f182397c;

    /* renamed from: b */
    private byte f182398b = 2;

    static {
        C67093ku kuVar = new C67093ku();
        f182396a = kuVar;
        C62942bv.registerDefaultInstance(C67093ku.class, kuVar);
    }

    private C67093ku() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182398b);
            case 1:
                this.f182398b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f182396a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67093ku();
            case 4:
                return new C67092kt();
            case 5:
                return f182396a;
            case 6:
                C63010eb ebVar = f182397c;
                if (ebVar == null) {
                    synchronized (C67093ku.class) {
                        ebVar = f182397c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182396a);
                            f182397c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
