package com.google.assistant.p4008y.p4009a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.m */
/* compiled from: PG */
public final class C53604m extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53604m f140690f;

    /* renamed from: h */
    private static volatile C63010eb f140691h;

    /* renamed from: a */
    public int f140692a;

    /* renamed from: b */
    public C53612u f140693b;

    /* renamed from: c */
    public C53600i f140694c;

    /* renamed from: d */
    public C53608q f140695d;

    /* renamed from: e */
    public C53548ah f140696e;

    /* renamed from: g */
    private byte f140697g = 2;

    static {
        C53604m mVar = new C53604m();
        f140690f = mVar;
        C62942bv.registerDefaultInstance(C53604m.class, mVar);
    }

    private C53604m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140697g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140697g = b;
                return null;
            case 2:
                return newMessageInfo(f140690f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", "d"});
            case 3:
                return new C53604m();
            case 4:
                return new C53603l();
            case 5:
                return f140690f;
            case 6:
                C63010eb ebVar = f140691h;
                if (ebVar == null) {
                    synchronized (C53604m.class) {
                        ebVar = f140691h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140690f);
                            f140691h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
