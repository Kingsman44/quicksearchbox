package com.google.p4242bp.p4243a.p4247d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.a.d.b */
/* compiled from: PG */
public final class C56162b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56162b f149632c;

    /* renamed from: e */
    private static volatile C63010eb f149633e;

    /* renamed from: a */
    public C62971cq f149634a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f149635b = emptyProtobufList();

    /* renamed from: d */
    private byte f149636d = 2;

    static {
        C56162b bVar = new C56162b();
        f149632c = bVar;
        C62942bv.registerDefaultInstance(C56162b.class, bVar);
    }

    private C56162b() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149636d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149636d = b;
                return null;
            case 2:
                return newMessageInfo(f149632c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"a", C56164d.class, "b", C56164d.class});
            case 3:
                return new C56162b();
            case 4:
                return new C56161a();
            case 5:
                return f149632c;
            case 6:
                C63010eb ebVar = f149633e;
                if (ebVar == null) {
                    synchronized (C56162b.class) {
                        ebVar = f149633e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149632c);
                            f149633e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
