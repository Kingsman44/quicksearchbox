package com.google.p4283bv.p4287b.p4288a.p4289a.p4310o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.o.p */
/* compiled from: PG */
public final class C56772p extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C56772p f151501h;

    /* renamed from: i */
    private static volatile C63010eb f151502i;

    /* renamed from: a */
    public int f151503a;

    /* renamed from: b */
    public C56771o f151504b;

    /* renamed from: c */
    public C56769m f151505c;

    /* renamed from: d */
    public C56761e f151506d;

    /* renamed from: e */
    public C56767k f151507e;

    /* renamed from: f */
    public C56765i f151508f;

    /* renamed from: g */
    public C56763g f151509g;

    static {
        C56772p pVar = new C56772p();
        f151501h = pVar;
        C62942bv.registerDefaultInstance(C56772p.class, pVar);
    }

    private C56772p() {
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
                return newMessageInfo(f151501h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C56772p();
            case 4:
                return new C56759c();
            case 5:
                return f151501h;
            case 6:
                C63010eb ebVar = f151502i;
                if (ebVar == null) {
                    synchronized (C56772p.class) {
                        ebVar = f151502i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151501h);
                            f151502i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
