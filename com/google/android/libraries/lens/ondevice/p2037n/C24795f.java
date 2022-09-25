package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4701g.C62250a;
import com.google.lens.p4701g.C62253ac;
import com.google.lens.p4701g.C62310cf;
import com.google.lens.p4701g.C62318cn;
import com.google.lens.p4701g.C62326cv;
import com.google.lens.p4701g.C62349l;
import com.google.lens.p4705i.p4706a.C62375f;
import com.google.lens.p4705i.p4706a.C62379j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.f */
/* compiled from: PG */
public final class C24795f extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C24795f f67747l;

    /* renamed from: m */
    private static volatile C63010eb f67748m;

    /* renamed from: a */
    public int f67749a;

    /* renamed from: b */
    public int f67750b;

    /* renamed from: c */
    public C24814y f67751c;

    /* renamed from: d */
    public C62310cf f67752d;

    /* renamed from: e */
    public C62326cv f67753e;

    /* renamed from: f */
    public C62318cn f67754f;

    /* renamed from: g */
    public C24790aw f67755g;

    /* renamed from: h */
    public C62349l f67756h;

    /* renamed from: i */
    public C62253ac f67757i;

    /* renamed from: j */
    public C62379j f67758j;

    /* renamed from: k */
    public C62375f f67759k;

    static {
        C24795f fVar = new C24795f();
        f67747l = fVar;
        C62942bv.registerDefaultInstance(C24795f.class, fVar);
    }

    private C24795f() {
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
                return newMessageInfo(f67747l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bဌ\u0000\tဉ\b\nဉ\t", new Object[]{"a", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "b", C62250a.f168059a, "j", C19621k.f54601a});
            case 3:
                return new C24795f();
            case 4:
                return new C24794e();
            case 5:
                return f67747l;
            case 6:
                C63010eb ebVar = f67748m;
                if (ebVar == null) {
                    synchronized (C24795f.class) {
                        ebVar = f67748m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67747l);
                            f67748m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
