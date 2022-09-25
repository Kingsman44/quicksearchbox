package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.k */
/* compiled from: PG */
public final class C57503k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57503k f153601c;

    /* renamed from: f */
    private static volatile C63010eb f153602f;

    /* renamed from: a */
    public float f153603a = 1.0f;

    /* renamed from: b */
    public C57499g f153604b;

    /* renamed from: d */
    private int f153605d;

    /* renamed from: e */
    private byte f153606e = 2;

    static {
        C57503k kVar = new C57503k();
        f153601c = kVar;
        C62942bv.registerDefaultInstance(C57503k.class, kVar);
    }

    private C57503k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153606e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153606e = b;
                return null;
            case 2:
                return newMessageInfo(f153601c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ခ\u0000\u0002ᐉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C57503k();
            case 4:
                return new C57502j();
            case 5:
                return f153601c;
            case 6:
                C63010eb ebVar = f153602f;
                if (ebVar == null) {
                    synchronized (C57503k.class) {
                        ebVar = f153602f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153601c);
                            f153602f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
