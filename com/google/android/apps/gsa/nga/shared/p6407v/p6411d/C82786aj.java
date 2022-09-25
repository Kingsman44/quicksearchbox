package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.aj */
/* compiled from: PG */
public final class C82786aj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C82786aj f225562d;

    /* renamed from: f */
    private static volatile C63010eb f225563f;

    /* renamed from: a */
    public int f225564a;

    /* renamed from: b */
    public int f225565b;

    /* renamed from: c */
    public C62995dn f225566c = C62995dn.f170057a;

    /* renamed from: e */
    private byte f225567e = 2;

    static {
        C82786aj ajVar = new C82786aj();
        f225562d = ajVar;
        C62942bv.registerDefaultInstance(C82786aj.class, ajVar);
    }

    private C82786aj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f225567e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f225567e = b;
                return null;
            case 2:
                return newMessageInfo(f225562d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001ᔌ\u0000\u00022", new Object[]{"a", "b", C82785ai.f225561a, C45240c.f118157a, C82784ah.f225560a});
            case 3:
                return new C82786aj();
            case 4:
                return new C82783ag();
            case 5:
                return f225562d;
            case 6:
                C63010eb ebVar = f225563f;
                if (ebVar == null) {
                    synchronized (C82786aj.class) {
                        ebVar = f225563f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225562d);
                            f225563f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
