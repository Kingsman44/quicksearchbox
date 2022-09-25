package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.fo */
/* compiled from: PG */
public final class C57498fo extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C57498fo f153583d;

    /* renamed from: g */
    private static volatile C63010eb f153584g;

    /* renamed from: a */
    public int f153585a = 0;

    /* renamed from: b */
    public Object f153586b;

    /* renamed from: c */
    public C57474er f153587c;

    /* renamed from: e */
    private int f153588e;

    /* renamed from: f */
    private byte f153589f = 2;

    static {
        C57498fo foVar = new C57498fo();
        f153583d = foVar;
        C62942bv.registerDefaultInstance(C57498fo.class, foVar);
    }

    private C57498fo() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153589f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153589f = b;
                return null;
            case 2:
                return newMessageInfo(f153583d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C57349aa.class, C57492fi.class});
            case 3:
                return new C57498fo();
            case 4:
                return new C57496fm();
            case 5:
                return f153583d;
            case 6:
                C63010eb ebVar = f153584g;
                if (ebVar == null) {
                    synchronized (C57498fo.class) {
                        ebVar = f153584g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153583d);
                            f153584g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
