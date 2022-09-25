package com.google.assistant.p4008y.p4010b;

import com.google.assistant.p4008y.p4009a.C53604m;
import com.google.assistant.p4008y.p4015e.C53668d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.b.c */
/* compiled from: PG */
public final class C53621c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53621c f140738c;

    /* renamed from: f */
    private static volatile C63010eb f140739f;

    /* renamed from: a */
    public int f140740a;

    /* renamed from: b */
    public C53668d f140741b;

    /* renamed from: d */
    private C53604m f140742d;

    /* renamed from: e */
    private byte f140743e = 2;

    static {
        C53621c cVar = new C53621c();
        f140738c = cVar;
        C62942bv.registerDefaultInstance(C53621c.class, cVar);
    }

    private C53621c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140743e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140743e = b;
                return null;
            case 2:
                return newMessageInfo(f140738c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "d"});
            case 3:
                return new C53621c();
            case 4:
                return new C53620b();
            case 5:
                return f140738c;
            case 6:
                C63010eb ebVar = f140739f;
                if (ebVar == null) {
                    synchronized (C53621c.class) {
                        ebVar = f140739f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140738c);
                            f140739f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
