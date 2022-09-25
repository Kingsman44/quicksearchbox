package com.google.protos.p4985f.p5002e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.e.g */
/* compiled from: PG */
public final class C64838g extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C64838g f175698i;

    /* renamed from: j */
    private static volatile C63010eb f175699j;

    /* renamed from: a */
    public int f175700a;

    /* renamed from: b */
    public String f175701b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f175702c;

    /* renamed from: d */
    public double f175703d;

    /* renamed from: e */
    public double f175704e;

    /* renamed from: f */
    public String f175705f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C64837f f175706g;

    /* renamed from: h */
    public C64835d f175707h;

    static {
        C64838g gVar = new C64838g();
        f175698i = gVar;
        C62942bv.registerDefaultInstance(C64838g.class, gVar);
    }

    private C64838g() {
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
                return newMessageInfo(f175698i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0004က\u0003\u0005က\u0004\u0006ဈ\u0005\bဉ\u0007\tဉ\b", new Object[]{"a", "b", C45240c.f118157a, C64841j.f175720a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C64838g();
            case 4:
                return new C64833b();
            case 5:
                return f175698i;
            case 6:
                C63010eb ebVar = f175699j;
                if (ebVar == null) {
                    synchronized (C64838g.class) {
                        ebVar = f175699j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175698i);
                            f175699j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
