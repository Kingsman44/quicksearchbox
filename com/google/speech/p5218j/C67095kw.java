package com.google.speech.p5218j;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.kw */
/* compiled from: PG */
public final class C67095kw extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C67095kw f182399i;

    /* renamed from: j */
    private static volatile C63010eb f182400j;

    /* renamed from: a */
    public int f182401a;

    /* renamed from: b */
    public long f182402b;

    /* renamed from: c */
    public long f182403c;

    /* renamed from: d */
    public long f182404d;

    /* renamed from: e */
    public long f182405e;

    /* renamed from: f */
    public long f182406f;

    /* renamed from: g */
    public long f182407g;

    /* renamed from: h */
    public long f182408h;

    static {
        C67095kw kwVar = new C67095kw();
        f182399i = kwVar;
        C62942bv.registerDefaultInstance(C67095kw.class, kwVar);
    }

    private C67095kw() {
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
                return newMessageInfo(f182399i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0000\u0001ဂ\u0002\u0002ဂ\u0003\u0003ဂ\u0004\u0007ဂ\u0001\tဂ\u0007\nဂ\b\u000bဂ\t", new Object[]{"a", C45240c.f118157a, "d", "e", "b", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C67095kw();
            case 4:
                return new C67094kv();
            case 5:
                return f182399i;
            case 6:
                C63010eb ebVar = f182400j;
                if (ebVar == null) {
                    synchronized (C67095kw.class) {
                        ebVar = f182400j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182399i);
                            f182400j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
