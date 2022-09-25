package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.hp */
/* compiled from: PG */
public final class C7724hp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7724hp f27005a;

    /* renamed from: c */
    private static volatile C63010eb f27006c;

    /* renamed from: b */
    private byte f27007b = 2;

    static {
        C7724hp hpVar = new C7724hp();
        f27005a = hpVar;
        C62942bv.registerDefaultInstance(C7724hp.class, hpVar);
    }

    private C7724hp() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27007b);
            case 1:
                this.f27007b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f27005a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7724hp();
            case 4:
                return new C7723ho();
            case 5:
                return f27005a;
            case 6:
                C63010eb ebVar = f27006c;
                if (ebVar == null) {
                    synchronized (C7724hp.class) {
                        ebVar = f27006c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27005a);
                            f27006c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
