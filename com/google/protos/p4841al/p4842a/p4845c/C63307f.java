package com.google.protos.p4841al.p4842a.p4845c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.al.a.c.f */
/* compiled from: PG */
public final class C63307f extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C63307f f171094l;

    /* renamed from: m */
    private static volatile C63010eb f171095m;

    /* renamed from: a */
    public int f171096a;

    /* renamed from: b */
    public C63311j f171097b;

    /* renamed from: c */
    public float f171098c;

    /* renamed from: d */
    public C63311j f171099d;

    /* renamed from: e */
    public C63311j f171100e;

    /* renamed from: f */
    public C63311j f171101f;

    /* renamed from: g */
    public C63311j f171102g;

    /* renamed from: h */
    public C63311j f171103h;

    /* renamed from: i */
    public C63311j f171104i;

    /* renamed from: j */
    public C63311j f171105j;

    /* renamed from: k */
    public C63311j f171106k;

    static {
        C63307f fVar = new C63307f();
        f171094l = fVar;
        C62942bv.registerDefaultInstance(C63307f.class, fVar);
    }

    private C63307f() {
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
                return newMessageInfo(f171094l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C63307f();
            case 4:
                return new C63306e();
            case 5:
                return f171094l;
            case 6:
                C63010eb ebVar = f171095m;
                if (ebVar == null) {
                    synchronized (C63307f.class) {
                        ebVar = f171095m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171094l);
                            f171095m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
