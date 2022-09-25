package com.google.android.libraries.p1657ba.p1664c.p1668c.p1671c;

import com.google.android.libraries.p1657ba.p1664c.p1668c.C19652b;
import com.google.android.libraries.p1657ba.p1664c.p1668c.C19666d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ba.c.c.c.b */
/* compiled from: PG */
public final class C19663b extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C19663b f54684c;

    /* renamed from: f */
    private static volatile C63010eb f54685f;

    /* renamed from: a */
    public C19652b f54686a;

    /* renamed from: b */
    public C62971cq f54687b = emptyProtobufList();

    /* renamed from: d */
    private int f54688d;

    /* renamed from: e */
    private byte f54689e = 2;

    static {
        C19663b bVar = new C19663b();
        f54684c = bVar;
        C62942bv.registerDefaultInstance(C19663b.class, bVar);
    }

    private C19663b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f54689e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f54689e = b;
                return null;
            case 2:
                return newMessageInfo(f54684c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"d", "a", "b", C19666d.class});
            case 3:
                return new C19663b();
            case 4:
                return new C19662a();
            case 5:
                return f54684c;
            case 6:
                C63010eb ebVar = f54685f;
                if (ebVar == null) {
                    synchronized (C19663b.class) {
                        ebVar = f54685f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f54684c);
                            f54685f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
