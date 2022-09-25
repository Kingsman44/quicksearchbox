package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.gu */
/* compiled from: PG */
public final class C7702gu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7702gu f26879c;

    /* renamed from: e */
    private static volatile C63010eb f26880e;

    /* renamed from: a */
    public C62971cq f26881a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f26882b = emptyProtobufList();

    /* renamed from: d */
    private byte f26883d = 2;

    static {
        C7702gu guVar = new C7702gu();
        f26879c = guVar;
        C62942bv.registerDefaultInstance(C7702gu.class, guVar);
    }

    private C7702gu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26883d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26883d = b;
                return null;
            case 2:
                return newMessageInfo(f26879c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"a", C7718hj.class, "b", C7718hj.class});
            case 3:
                return new C7702gu();
            case 4:
                return new C7701gt();
            case 5:
                return f26879c;
            case 6:
                C63010eb ebVar = f26880e;
                if (ebVar == null) {
                    synchronized (C7702gu.class) {
                        ebVar = f26880e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26879c);
                            f26880e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
