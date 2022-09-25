package com.google.lens.p4701g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4705i.p4706a.C62381l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.p */
/* compiled from: PG */
public final class C62353p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62353p f168325e;

    /* renamed from: g */
    private static volatile C63010eb f168326g;

    /* renamed from: a */
    public int f168327a;

    /* renamed from: b */
    public int f168328b = 0;

    /* renamed from: c */
    public Object f168329c;

    /* renamed from: d */
    public int f168330d;

    /* renamed from: f */
    private byte f168331f = 2;

    static {
        C62353p pVar = new C62353p();
        f168325e = pVar;
        C62942bv.registerDefaultInstance(C62353p.class, pVar);
    }

    private C62353p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168331f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168331f = b;
                return null;
            case 2:
                return newMessageInfo(f168325e, "\u0001\r\u0001\u0001\u0001\r\r\u0000\u0000\u0005\u0001ဌ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ᐼ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fᐼ\u0000\rᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C62360w.f168350a, C62268ar.class, C62284bg.class, C62314cj.class, C62274ax.class, C62299bv.class, C62339dh.class, C62381l.class, C62320cp.class, C62328cx.class, C62312ch.class, C62345h.class, C62255ae.class});
            case 3:
                return new C62353p();
            case 4:
                return new C62352o();
            case 5:
                return f168325e;
            case 6:
                C63010eb ebVar = f168326g;
                if (ebVar == null) {
                    synchronized (C62353p.class) {
                        ebVar = f168326g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168325e);
                            f168326g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
