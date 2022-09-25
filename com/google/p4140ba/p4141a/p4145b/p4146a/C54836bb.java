package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.bb */
/* compiled from: PG */
public final class C54836bb extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C54836bb f143896h;

    /* renamed from: i */
    private static volatile C63010eb f143897i;

    /* renamed from: a */
    public int f143898a;

    /* renamed from: b */
    public float f143899b;

    /* renamed from: c */
    public float f143900c;

    /* renamed from: d */
    public int f143901d;

    /* renamed from: e */
    public boolean f143902e;

    /* renamed from: f */
    public boolean f143903f;

    /* renamed from: g */
    public boolean f143904g;

    static {
        C54836bb bbVar = new C54836bb();
        f143896h = bbVar;
        C62942bv.registerDefaultInstance(C54836bb.class, bbVar);
    }

    private C54836bb() {
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
                return newMessageInfo(f143896h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C54836bb();
            case 4:
                return new C54835ba();
            case 5:
                return f143896h;
            case 6:
                C63010eb ebVar = f143897i;
                if (ebVar == null) {
                    synchronized (C54836bb.class) {
                        ebVar = f143897i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143896h);
                            f143897i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
