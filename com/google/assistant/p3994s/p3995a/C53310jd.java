package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.jd */
/* compiled from: PG */
public final class C53310jd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53310jd f139802c;

    /* renamed from: e */
    private static volatile C63010eb f139803e;

    /* renamed from: a */
    public int f139804a = 0;

    /* renamed from: b */
    public Object f139805b;

    /* renamed from: d */
    private byte f139806d = 2;

    static {
        C53310jd jdVar = new C53310jd();
        f139802c = jdVar;
        C62942bv.registerDefaultInstance(C53310jd.class, jdVar);
    }

    private C53310jd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139806d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139806d = b;
                return null;
            case 2:
                return newMessageInfo(f139802c, "\u0001\u0010\u0001\u0000\u0001\u0012\u0010\u0000\u0000\u0002\u0001ြ\u0000\u0002ြ\u0000\u0004ᐼ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nᐼ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fြ\u0000\u0010ြ\u0000\u0011ြ\u0000\u0012ြ\u0000", new Object[]{"b", "a", C53305iz.class, C53319jm.class, C53331jy.class, C53157dm.class, C53329jw.class, C53303ix.class, C53316jj.class, C53082as.class, C53107bq.class, C53314jh.class, C53163ds.class, C53312jf.class, C53252h.class, C53334ka.class, C53325js.class, C53327ju.class});
            case 3:
                return new C53310jd();
            case 4:
                return new C53309jc();
            case 5:
                return f139802c;
            case 6:
                C63010eb ebVar = f139803e;
                if (ebVar == null) {
                    synchronized (C53310jd.class) {
                        ebVar = f139803e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139802c);
                            f139803e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
