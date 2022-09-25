package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.libraries.gsa.monet.shared.p1894d.C23107j;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.lk */
/* compiled from: PG */
public final class C87999lk extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C87999lk f237973g;

    /* renamed from: h */
    private static volatile C63010eb f237974h;

    /* renamed from: a */
    public int f237975a;

    /* renamed from: b */
    public int f237976b;

    /* renamed from: c */
    public boolean f237977c;

    /* renamed from: d */
    public C87996lh f237978d;

    /* renamed from: e */
    public int f237979e;

    /* renamed from: f */
    public C23107j f237980f;

    static {
        C87999lk lkVar = new C87999lk();
        f237973g = lkVar;
        C62942bv.registerDefaultInstance(C87999lk.class, lkVar);
    }

    private C87999lk() {
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
                return newMessageInfo(f237973g, "\u0001\u0005\u0000\u0001\u0003\t\u0005\u0000\u0000\u0000\u0003ဇ\u0001\u0005ဉ\u0002\u0006င\u0003\u0007ဌ\u0000\tဉ\u0004", new Object[]{"a", C45240c.f118157a, "d", "e", "b", C87997li.f237972a, C10662f.f35572a});
            case 3:
                return new C87999lk();
            case 4:
                return new C87994lf();
            case 5:
                return f237973g;
            case 6:
                C63010eb ebVar = f237974h;
                if (ebVar == null) {
                    synchronized (C87999lk.class) {
                        ebVar = f237974h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237973g);
                            f237974h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
