package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80434n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80436p;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.cq */
/* compiled from: PG */
public final class C82847cq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C82847cq f225903d;

    /* renamed from: f */
    private static volatile C63010eb f225904f;

    /* renamed from: a */
    public int f225905a;

    /* renamed from: b */
    public C80434n f225906b;

    /* renamed from: c */
    public C80436p f225907c;

    /* renamed from: e */
    private byte f225908e = 2;

    static {
        C82847cq cqVar = new C82847cq();
        f225903d = cqVar;
        C62942bv.registerDefaultInstance(C82847cq.class, cqVar);
    }

    private C82847cq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f225908e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f225908e = b;
                return null;
            case 2:
                return newMessageInfo(f225903d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C82847cq();
            case 4:
                return new C82846cp();
            case 5:
                return f225903d;
            case 6:
                C63010eb ebVar = f225904f;
                if (ebVar == null) {
                    synchronized (C82847cq.class) {
                        ebVar = f225904f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225903d);
                            f225904f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
