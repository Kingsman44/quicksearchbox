package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.dx */
/* compiled from: PG */
public final class C59739dx extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C59739dx f160346j;

    /* renamed from: k */
    private static volatile C63010eb f160347k;

    /* renamed from: a */
    public int f160348a;

    /* renamed from: b */
    public int f160349b;

    /* renamed from: c */
    public int f160350c;

    /* renamed from: d */
    public int f160351d;

    /* renamed from: e */
    public int f160352e;

    /* renamed from: f */
    public int f160353f;

    /* renamed from: g */
    public int f160354g;

    /* renamed from: h */
    public int f160355h;

    /* renamed from: i */
    public long f160356i;

    static {
        C59739dx dxVar = new C59739dx();
        f160346j = dxVar;
        C62942bv.registerDefaultInstance(C59739dx.class, dxVar);
    }

    private C59739dx() {
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
                return newMessageInfo(f160346j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဃ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C59739dx();
            case 4:
                return new C59738dw();
            case 5:
                return f160346j;
            case 6:
                C63010eb ebVar = f160347k;
                if (ebVar == null) {
                    synchronized (C59739dx.class) {
                        ebVar = f160347k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160346j);
                            f160347k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
