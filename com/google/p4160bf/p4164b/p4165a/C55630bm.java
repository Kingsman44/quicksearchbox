package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.bm */
/* compiled from: PG */
public final class C55630bm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55630bm f146787d;

    /* renamed from: e */
    private static volatile C63010eb f146788e;

    /* renamed from: a */
    public int f146789a;

    /* renamed from: b */
    public String f146790b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C55564bq f146791c;

    static {
        C55630bm bmVar = new C55630bm();
        f146787d = bmVar;
        C62942bv.registerDefaultInstance(C55630bm.class, bmVar);
    }

    private C55630bm() {
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
                return newMessageInfo(f146787d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55630bm();
            case 4:
                return new C55629bl();
            case 5:
                return f146787d;
            case 6:
                C63010eb ebVar = f146788e;
                if (ebVar == null) {
                    synchronized (C55630bm.class) {
                        ebVar = f146788e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146787d);
                            f146788e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
