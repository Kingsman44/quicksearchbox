package com.google.assistant.p3994s.p3995a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.m */
/* compiled from: PG */
public final class C53387m extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C53387m f140090g;

    /* renamed from: i */
    private static volatile C63010eb f140091i;

    /* renamed from: a */
    public int f140092a;

    /* renamed from: b */
    public int f140093b = 0;

    /* renamed from: c */
    public Object f140094c;

    /* renamed from: d */
    public C53461q f140095d;

    /* renamed from: e */
    public long f140096e;

    /* renamed from: f */
    public long f140097f;

    /* renamed from: h */
    private byte f140098h = 2;

    static {
        C53387m mVar = new C53387m();
        f140090g = mVar;
        C62942bv.registerDefaultInstance(C53387m.class, mVar);
    }

    private C53387m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140098h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140098h = b;
                return null;
            case 2:
                return newMessageInfo(f140090g, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ြ\u0000\u0003ဂ\u0003\u0004ဂ\u0004\u0005ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C53441o.class, "e", C10662f.f35572a, C53372ll.class});
            case 3:
                return new C53387m();
            case 4:
                return new C53360l();
            case 5:
                return f140090g;
            case 6:
                C63010eb ebVar = f140091i;
                if (ebVar == null) {
                    synchronized (C53387m.class) {
                        ebVar = f140091i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140090g);
                            f140091i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
