package com.google.p5238v.p5239a.p5255j;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.dz */
/* compiled from: PG */
public final class C67750dz extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C67750dz f183807i;

    /* renamed from: j */
    private static volatile C63010eb f183808j;

    /* renamed from: a */
    public int f183809a;

    /* renamed from: b */
    public C67753eb f183810b;

    /* renamed from: c */
    public C63088z f183811c = C63088z.f170246b;

    /* renamed from: d */
    public C63088z f183812d;

    /* renamed from: e */
    public C63088z f183813e;

    /* renamed from: f */
    public C63088z f183814f;

    /* renamed from: g */
    public C63088z f183815g;

    /* renamed from: h */
    public C63088z f183816h;

    static {
        C67750dz dzVar = new C67750dz();
        f183807i = dzVar;
        C62942bv.registerDefaultInstance(C67750dz.class, dzVar);
    }

    private C67750dz() {
        C63088z zVar = C63088z.f170246b;
        this.f183812d = zVar;
        this.f183813e = zVar;
        this.f183814f = zVar;
        this.f183815g = zVar;
        this.f183816h = zVar;
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
                return newMessageInfo(f183807i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C67750dz();
            case 4:
                return new C67749dy();
            case 5:
                return f183807i;
            case 6:
                C63010eb ebVar = f183808j;
                if (ebVar == null) {
                    synchronized (C67750dz.class) {
                        ebVar = f183808j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183807i);
                            f183808j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
