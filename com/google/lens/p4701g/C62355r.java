package com.google.lens.p4701g;

import com.google.android.libraries.p1657ba.p1664c.p1668c.p1670b.C19658f;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1671c.C19665d;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4705i.p4706a.C62377h;
import com.google.lens.p4705i.p4706a.C62383n;
import com.google.lens.p4707j.C62431bh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.r */
/* compiled from: PG */
public final class C62355r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62355r f168332e;

    /* renamed from: h */
    private static volatile C63010eb f168333h;

    /* renamed from: a */
    public int f168334a = 0;

    /* renamed from: b */
    public Object f168335b;

    /* renamed from: c */
    public C62359v f168336c;

    /* renamed from: d */
    public C62431bh f168337d;

    /* renamed from: f */
    private int f168338f;

    /* renamed from: g */
    private byte f168339g = 2;

    static {
        C62355r rVar = new C62355r();
        f168332e = rVar;
        C62942bv.registerDefaultInstance(C62355r.class, rVar);
    }

    private C62355r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168339g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168339g = b;
                return null;
            case 2:
                return newMessageInfo(f168332e, "\u0001\u0011\u0001\u0001\u0002d\u0011\u0000\u0000\b\u0002ဉ\u0001\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ြ\u0000\u0006ᐼ\u0000\u0007ᐼ\u0000\bြ\u0000\tြ\u0000\nᐼ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eᐼ\u0000\u000fြ\u0000\u0010ᐼ\u0000\u0011ᐼ\u0000dဉ\u0011", new Object[]{"b", "a", C10662f.f35572a, C45240c.f118157a, C62270at.class, C62286bi.class, C62316cl.class, C62276az.class, C19665d.class, C62333db.class, C62324ct.class, C62301bx.class, C62341dj.class, C62383n.class, C19658f.class, C62377h.class, C62306cb.class, C62347j.class, C62257ag.class, "d"});
            case 3:
                return new C62355r();
            case 4:
                return new C62354q();
            case 5:
                return f168332e;
            case 6:
                C63010eb ebVar = f168333h;
                if (ebVar == null) {
                    synchronized (C62355r.class) {
                        ebVar = f168333h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168332e);
                            f168333h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
