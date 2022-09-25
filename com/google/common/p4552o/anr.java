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

/* renamed from: com.google.common.o.anr */
/* compiled from: PG */
public final class anr extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final anr f159389m;

    /* renamed from: n */
    private static volatile C63010eb f159390n;

    /* renamed from: a */
    public int f159391a;

    /* renamed from: b */
    public aob f159392b;

    /* renamed from: c */
    public int f159393c;

    /* renamed from: d */
    public int f159394d;

    /* renamed from: e */
    public int f159395e;

    /* renamed from: f */
    public int f159396f;

    /* renamed from: g */
    public int f159397g;

    /* renamed from: h */
    public int f159398h;

    /* renamed from: i */
    public int f159399i;

    /* renamed from: j */
    public ano f159400j;

    /* renamed from: k */
    public boolean f159401k;

    /* renamed from: l */
    public int f159402l;

    static {
        anr anr = new anr();
        f159389m = anr;
        C62942bv.registerDefaultInstance(anr.class, anr);
    }

    private anr() {
        emptyProtobufList();
        emptyLongList();
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
                return newMessageInfo(f159389m, "\u0001\u000b\u0000\u0001\u0002\u0019\u000b\u0000\u0000\u0000\u0002ဉ\u0001\fင\n\rင\u000b\u000eင\f\u000fင\r\u0010င\u000e\u0013င\u0011\u0014ဌ\u0012\u0016ဉ\u0014\u0018ဇ\u0015\u0019င\u0016", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", anp.f159388a, "j", C19621k.f54601a, "l"});
            case 3:
                return new anr();
            case 4:
                return new anm();
            case 5:
                return f159389m;
            case 6:
                C63010eb ebVar = f159390n;
                if (ebVar == null) {
                    synchronized (anr.class) {
                        ebVar = f159390n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159389m);
                            f159390n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
