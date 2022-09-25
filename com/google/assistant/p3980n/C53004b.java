package com.google.assistant.p3980n;

import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.n.b */
/* compiled from: PG */
public final class C53004b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53004b f138939c;

    /* renamed from: e */
    private static volatile C63010eb f138940e;

    /* renamed from: a */
    public int f138941a;

    /* renamed from: b */
    public C51715bm f138942b;

    /* renamed from: d */
    private byte f138943d = 2;

    static {
        C53004b bVar = new C53004b();
        f138939c = bVar;
        C62942bv.registerDefaultInstance(C53004b.class, bVar);
    }

    private C53004b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138943d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138943d = b;
                return null;
            case 2:
                return newMessageInfo(f138939c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53004b();
            case 4:
                return new C52997a();
            case 5:
                return f138939c;
            case 6:
                C63010eb ebVar = f138940e;
                if (ebVar == null) {
                    synchronized (C53004b.class) {
                        ebVar = f138940e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138939c);
                            f138940e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
