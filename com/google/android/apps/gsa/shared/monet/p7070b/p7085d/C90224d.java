package com.google.android.apps.gsa.shared.monet.p7070b.p7085d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
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

/* renamed from: com.google.android.apps.gsa.shared.monet.b.d.d */
/* compiled from: PG */
public final class C90224d extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C90224d f252050l;

    /* renamed from: m */
    private static volatile C63010eb f252051m;

    /* renamed from: a */
    public int f252052a;

    /* renamed from: b */
    public int f252053b;

    /* renamed from: c */
    public int f252054c;

    /* renamed from: d */
    public String f252055d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f252056e;

    /* renamed from: f */
    public int f252057f;

    /* renamed from: g */
    public int f252058g;

    /* renamed from: h */
    public boolean f252059h;

    /* renamed from: i */
    public boolean f252060i;

    /* renamed from: j */
    public String f252061j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public boolean f252062k = true;

    static {
        C90224d dVar = new C90224d();
        f252050l = dVar;
        C62942bv.registerDefaultInstance(C90224d.class, dVar);
    }

    private C90224d() {
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
                return newMessageInfo(f252050l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဌ\u0004\u0006င\u0005\u0007ဇ\u0007\bဈ\b\tဇ\u0006\nဇ\t", new Object[]{"a", "b", C90222b.f252049a, C45240c.f118157a, "d", "e", C10662f.f35572a, C90208n.m146768b(), C30325g.f82003a, "i", "j", C19618h.f54585a, C19621k.f54601a});
            case 3:
                return new C90224d();
            case 4:
                return new C90221a();
            case 5:
                return f252050l;
            case 6:
                C63010eb ebVar = f252051m;
                if (ebVar == null) {
                    synchronized (C90224d.class) {
                        ebVar = f252051m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252050l);
                            f252051m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
