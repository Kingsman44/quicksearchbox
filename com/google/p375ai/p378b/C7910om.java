package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.om */
/* compiled from: PG */
public final class C7910om extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7910om f27794a;

    /* renamed from: c */
    private static volatile C63010eb f27795c;

    /* renamed from: b */
    private byte f27796b = 2;

    static {
        C7910om omVar = new C7910om();
        f27794a = omVar;
        C62942bv.registerDefaultInstance(C7910om.class, omVar);
    }

    private C7910om() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27796b);
            case 1:
                this.f27796b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f27794a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7910om();
            case 4:
                return new C7909ol();
            case 5:
                return f27794a;
            case 6:
                C63010eb ebVar = f27795c;
                if (ebVar == null) {
                    synchronized (C7910om.class) {
                        ebVar = f27795c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27794a);
                            f27795c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
