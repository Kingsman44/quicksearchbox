package com.google.common.p4552o.p4566l;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.f */
/* compiled from: PG */
public final class C60206f extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C60206f f162878k;

    /* renamed from: l */
    private static volatile C63010eb f162879l;

    /* renamed from: a */
    public int f162880a;

    /* renamed from: b */
    public C60210j f162881b;

    /* renamed from: c */
    public boolean f162882c;

    /* renamed from: d */
    public long f162883d;

    /* renamed from: e */
    public int f162884e;

    /* renamed from: f */
    public int f162885f;

    /* renamed from: g */
    public int f162886g;

    /* renamed from: h */
    public boolean f162887h;

    /* renamed from: i */
    public int f162888i;

    /* renamed from: j */
    public int f162889j;

    static {
        C60206f fVar = new C60206f();
        f162878k = fVar;
        C62942bv.registerDefaultInstance(C60206f.class, fVar);
    }

    private C60206f() {
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
                return newMessageInfo(f162878k, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0007င\u0006\bင\u0007\u000bင\n\fဇ\u000b\rင\f\u000eင\r", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C60206f();
            case 4:
                return new C60205e();
            case 5:
                return f162878k;
            case 6:
                C63010eb ebVar = f162879l;
                if (ebVar == null) {
                    synchronized (C60206f.class) {
                        ebVar = f162879l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162878k);
                            f162879l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
