package com.google.p4653i.p4654a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.t */
/* compiled from: PG */
public final class C61710t extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C61710t f166708k;

    /* renamed from: m */
    private static volatile C63010eb f166709m;

    /* renamed from: a */
    public int f166710a;

    /* renamed from: b */
    public int f166711b;

    /* renamed from: c */
    public int f166712c;

    /* renamed from: d */
    public int f166713d;

    /* renamed from: e */
    public C61709s f166714e;

    /* renamed from: f */
    public int f166715f = 1;

    /* renamed from: g */
    public int f166716g = 1;

    /* renamed from: h */
    public long f166717h;

    /* renamed from: i */
    public boolean f166718i;

    /* renamed from: j */
    public boolean f166719j;

    /* renamed from: l */
    private byte f166720l = 2;

    static {
        C61710t tVar = new C61710t();
        f166708k = tVar;
        C62942bv.registerDefaultInstance(C61710t.class, tVar);
    }

    private C61710t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166720l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166720l = b;
                return null;
            case 2:
                return newMessageInfo(f166708k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ᐉ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007စ\u0006\bဇ\u0007\tဇ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C61706p.f166700a, C30325g.f82003a, C61704n.f166699a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C61710t();
            case 4:
                return new C61703m();
            case 5:
                return f166708k;
            case 6:
                C63010eb ebVar = f166709m;
                if (ebVar == null) {
                    synchronized (C61710t.class) {
                        ebVar = f166709m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166708k);
                            f166709m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
