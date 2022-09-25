package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.nlp.p4735b.p4736a.p4737a.C62815h;
import com.google.nlp.p4735b.p4736a.p4737a.C62817j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.cw */
/* compiled from: PG */
public final class C82853cw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C82853cw f225921d;

    /* renamed from: f */
    private static volatile C63010eb f225922f;

    /* renamed from: a */
    public int f225923a;

    /* renamed from: b */
    public C62815h f225924b;

    /* renamed from: c */
    public C62817j f225925c;

    /* renamed from: e */
    private byte f225926e = 2;

    static {
        C82853cw cwVar = new C82853cw();
        f225921d = cwVar;
        C62942bv.registerDefaultInstance(C82853cw.class, cwVar);
    }

    private C82853cw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f225926e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f225926e = b;
                return null;
            case 2:
                return newMessageInfo(f225921d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C82853cw();
            case 4:
                return new C82852cv();
            case 5:
                return f225921d;
            case 6:
                C63010eb ebVar = f225922f;
                if (ebVar == null) {
                    synchronized (C82853cw.class) {
                        ebVar = f225922f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225921d);
                            f225922f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
