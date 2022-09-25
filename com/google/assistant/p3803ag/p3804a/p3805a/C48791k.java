package com.google.assistant.p3803ag.p3804a.p3805a;

import com.google.assistant.p3803ag.p3804a.C48865h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.a.k */
/* compiled from: PG */
public final class C48791k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48791k f126248b;

    /* renamed from: d */
    private static volatile C63010eb f126249d;

    /* renamed from: a */
    public C62971cq f126250a = emptyProtobufList();

    /* renamed from: c */
    private byte f126251c = 2;

    static {
        C48791k kVar = new C48791k();
        f126248b = kVar;
        C62942bv.registerDefaultInstance(C48791k.class, kVar);
    }

    private C48791k() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126251c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126251c = b;
                return null;
            case 2:
                return newMessageInfo(f126248b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C48865h.class});
            case 3:
                return new C48791k();
            case 4:
                return new C48790j();
            case 5:
                return f126248b;
            case 6:
                C63010eb ebVar = f126249d;
                if (ebVar == null) {
                    synchronized (C48791k.class) {
                        ebVar = f126249d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126248b);
                            f126249d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
