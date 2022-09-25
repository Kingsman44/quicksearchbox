package com.google.assistant.p4008y.p4010b;

import com.google.assistant.p4008y.p4009a.C53606o;
import com.google.assistant.p4008y.p4015e.C53670f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.b.e */
/* compiled from: PG */
public final class C53623e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53623e f140744c;

    /* renamed from: f */
    private static volatile C63010eb f140745f;

    /* renamed from: a */
    public int f140746a;

    /* renamed from: b */
    public C53670f f140747b;

    /* renamed from: d */
    private C53606o f140748d;

    /* renamed from: e */
    private byte f140749e = 2;

    static {
        C53623e eVar = new C53623e();
        f140744c = eVar;
        C62942bv.registerDefaultInstance(C53623e.class, eVar);
    }

    private C53623e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140749e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140749e = b;
                return null;
            case 2:
                return newMessageInfo(f140744c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "d"});
            case 3:
                return new C53623e();
            case 4:
                return new C53622d();
            case 5:
                return f140744c;
            case 6:
                C63010eb ebVar = f140745f;
                if (ebVar == null) {
                    synchronized (C53623e.class) {
                        ebVar = f140745f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140744c);
                            f140745f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
