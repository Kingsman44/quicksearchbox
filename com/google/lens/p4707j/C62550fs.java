package com.google.lens.p4707j;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.fs */
/* compiled from: PG */
public final class C62550fs extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62550fs f168871g;

    /* renamed from: j */
    private static volatile C63010eb f168872j;

    /* renamed from: a */
    public int f168873a = 0;

    /* renamed from: b */
    public Object f168874b;

    /* renamed from: c */
    public long f168875c;

    /* renamed from: d */
    public int f168876d;

    /* renamed from: e */
    public C62971cq f168877e = emptyProtobufList();

    /* renamed from: f */
    public double f168878f;

    /* renamed from: h */
    private int f168879h;

    /* renamed from: i */
    private byte f168880i = 2;

    static {
        C62550fs fsVar = new C62550fs();
        f168871g = fsVar;
        C62942bv.registerDefaultInstance(C62550fs.class, fsVar);
    }

    private C62550fs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168880i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168880i = b;
                return null;
            case 2:
                return newMessageInfo(f168871g, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0004\u0001ဂ\u0000\u0002ဌ\u0001\u0003Л\u0004က\u0002\u0005ᐼ\u0000\u0006ᐼ\u0000\u0007ᐼ\u0000", new Object[]{"b", "a", C19618h.f54585a, C45240c.f118157a, "d", C62541fj.f168853a, "e", C62561gc.class, C10662f.f35572a, C62546fo.class, C62544fm.class, C62549fr.class});
            case 3:
                return new C62550fs();
            case 4:
                return new C62547fp();
            case 5:
                return f168871g;
            case 6:
                C63010eb ebVar = f168872j;
                if (ebVar == null) {
                    synchronized (C62550fs.class) {
                        ebVar = f168872j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168871g);
                            f168872j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
