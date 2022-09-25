package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.jz */
/* compiled from: PG */
public final class C60077jz extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C60077jz f162419m;

    /* renamed from: n */
    private static volatile C63010eb f162420n;

    /* renamed from: a */
    public int f162421a;

    /* renamed from: b */
    public int f162422b;

    /* renamed from: c */
    public int f162423c;

    /* renamed from: d */
    public int f162424d;

    /* renamed from: e */
    public int f162425e;

    /* renamed from: f */
    public int f162426f;

    /* renamed from: g */
    public int f162427g;

    /* renamed from: h */
    public int f162428h;

    /* renamed from: i */
    public int f162429i;

    /* renamed from: j */
    public int f162430j;

    /* renamed from: k */
    public int f162431k;

    /* renamed from: l */
    public int f162432l;

    static {
        C60077jz jzVar = new C60077jz();
        f162419m = jzVar;
        C62942bv.registerDefaultInstance(C60077jz.class, jzVar);
    }

    private C60077jz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f162419m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t\u000bဋ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l"});
            case 3:
                return new C60077jz();
            case 4:
                return new C60076jy();
            case 5:
                return f162419m;
            case 6:
                C63010eb ebVar = f162420n;
                if (ebVar == null) {
                    synchronized (C60077jz.class) {
                        ebVar = f162420n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162419m);
                            f162420n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
