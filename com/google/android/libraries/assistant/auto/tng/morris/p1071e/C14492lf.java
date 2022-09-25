package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.lf */
/* compiled from: PG */
public final class C14492lf extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C14492lf f43796e;

    /* renamed from: g */
    private static volatile C63010eb f43797g;

    /* renamed from: a */
    public int f43798a = 0;

    /* renamed from: b */
    public Object f43799b;

    /* renamed from: c */
    public int f43800c = 0;

    /* renamed from: d */
    public Object f43801d;

    /* renamed from: f */
    private byte f43802f = 2;

    static {
        C14492lf lfVar = new C14492lf();
        f43796e = lfVar;
        C62942bv.registerDefaultInstance(C14492lf.class, lfVar);
    }

    private C14492lf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43802f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43802f = b;
                return null;
            case 2:
                return newMessageInfo(f43796e, "\u0000\u0014\u0002\u0000\u0001\u0018\u0014\u0000\u0000\u0007\u0001<\u0000\u0002<\u0000\u0003м\u0001\u0004<\u0001\u0005м\u0001\u0006<\u0001\u0007<\u0001\f<\u0000\r<\u0000\u000eм\u0001\u000fм\u0001\u0010м\u0001\u0011<\u0001\u0012м\u0001\u0013<\u0001\u0014м\u0001\u0015<\u0001\u0016<\u0001\u0017<\u0001\u0018<\u0001", new Object[]{"b", "a", "d", C45240c.f118157a, C14485kz.class, C14491le.class, C14365gn.class, C14477kr.class, C14427iv.class, C14417il.class, C14393ho.class, C14389hk.class, C14489lc.class, C14414ii.class, C14385hg.class, C14425it.class, C14479kt.class, C14482kw.class, C14396hr.class, C14422iq.class, C14387hi.class, C14391hm.class, C14398ht.class, C14370gs.class});
            case 3:
                return new C14492lf();
            case 4:
                return new C14371gt();
            case 5:
                return f43796e;
            case 6:
                C63010eb ebVar = f43797g;
                if (ebVar == null) {
                    synchronized (C14492lf.class) {
                        ebVar = f43797g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43796e);
                            f43797g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
