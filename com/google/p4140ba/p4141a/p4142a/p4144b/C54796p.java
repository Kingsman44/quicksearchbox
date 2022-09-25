package com.google.p4140ba.p4141a.p4142a.p4144b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.a.b.p */
/* compiled from: PG */
public final class C54796p extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C54796p f143746k;

    /* renamed from: l */
    private static volatile C63010eb f143747l;

    /* renamed from: a */
    public int f143748a;

    /* renamed from: b */
    public long f143749b;

    /* renamed from: c */
    public long f143750c;

    /* renamed from: d */
    public long f143751d;

    /* renamed from: e */
    public long f143752e;

    /* renamed from: f */
    public long f143753f;

    /* renamed from: g */
    public long f143754g;

    /* renamed from: h */
    public long f143755h;

    /* renamed from: i */
    public long f143756i;

    /* renamed from: j */
    public long f143757j;

    static {
        C54796p pVar = new C54796p();
        f143746k = pVar;
        C62942bv.registerDefaultInstance(C54796p.class, pVar);
    }

    private C54796p() {
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
                return newMessageInfo(f143746k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဃ\u0004\u0005ဃ\u0005\u0006ဃ\u0006\u0007ဃ\u0007\bဃ\u0003\tဃ\b", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "e", "j"});
            case 3:
                return new C54796p();
            case 4:
                return new C54795o();
            case 5:
                return f143746k;
            case 6:
                C63010eb ebVar = f143747l;
                if (ebVar == null) {
                    synchronized (C54796p.class) {
                        ebVar = f143747l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143746k);
                            f143747l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
