package com.google.android.libraries.search.p2904c;

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

/* renamed from: com.google.android.libraries.search.c.ay */
/* compiled from: PG */
public final class C37360ay extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C37360ay f99224l;

    /* renamed from: m */
    private static volatile C63010eb f99225m;

    /* renamed from: a */
    public int f99226a;

    /* renamed from: b */
    public int f99227b = 6;

    /* renamed from: c */
    public int f99228c = 16000;

    /* renamed from: d */
    public int f99229d = 1;

    /* renamed from: e */
    public int f99230e = 2;

    /* renamed from: f */
    public int f99231f;

    /* renamed from: g */
    public C37354as f99232g;

    /* renamed from: h */
    public C37356au f99233h;

    /* renamed from: i */
    public long f99234i;

    /* renamed from: j */
    public C37359ax f99235j;

    /* renamed from: k */
    public boolean f99236k;

    static {
        C37360ay ayVar = new C37360ay();
        f99224l = ayVar;
        C62942bv.registerDefaultInstance(C37360ay.class, ayVar);
    }

    private C37360ay() {
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
                return newMessageInfo(f99224l, "\u0001\n\u0000\u0001\u0001i\n\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0006ဋ\u0004\u0007ဃ\u0007\bဉ\u0005\tဉ\u0006\fဉ\biဇ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, "i", C30325g.f82003a, C19618h.f54585a, "j", C19621k.f54601a});
            case 3:
                return new C37360ay();
            case 4:
                return new C37357av();
            case 5:
                return f99224l;
            case 6:
                C63010eb ebVar = f99225m;
                if (ebVar == null) {
                    synchronized (C37360ay.class) {
                        ebVar = f99225m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99224l);
                            f99225m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
