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

/* renamed from: com.google.v.a.j.eh */
/* compiled from: PG */
public final class C67759eh extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C67759eh f183833i;

    /* renamed from: j */
    private static volatile C63010eb f183834j;

    /* renamed from: a */
    public int f183835a;

    /* renamed from: b */
    public C67761ej f183836b;

    /* renamed from: c */
    public C63088z f183837c = C63088z.f170246b;

    /* renamed from: d */
    public C63088z f183838d;

    /* renamed from: e */
    public C63088z f183839e;

    /* renamed from: f */
    public C63088z f183840f;

    /* renamed from: g */
    public C63088z f183841g;

    /* renamed from: h */
    public C63088z f183842h;

    static {
        C67759eh ehVar = new C67759eh();
        f183833i = ehVar;
        C62942bv.registerDefaultInstance(C67759eh.class, ehVar);
    }

    private C67759eh() {
        C63088z zVar = C63088z.f170246b;
        this.f183838d = zVar;
        this.f183839e = zVar;
        this.f183840f = zVar;
        this.f183841g = zVar;
        this.f183842h = zVar;
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
                return newMessageInfo(f183833i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C67759eh();
            case 4:
                return new C67758eg();
            case 5:
                return f183833i;
            case 6:
                C63010eb ebVar = f183834j;
                if (ebVar == null) {
                    synchronized (C67759eh.class) {
                        ebVar = f183834j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183833i);
                            f183834j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
