package com.google.android.apps.gsa.shared.monet.p7070b.p7093l.p7094a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.l.a.b */
/* compiled from: PG */
public final class C90253b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C90253b f252103g;

    /* renamed from: h */
    private static volatile C63010eb f252104h;

    /* renamed from: a */
    public int f252105a;

    /* renamed from: b */
    public boolean f252106b;

    /* renamed from: c */
    public String f252107c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f252108d;

    /* renamed from: e */
    public String f252109e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f252110f;

    static {
        C90253b bVar = new C90253b();
        f252103g = bVar;
        C62942bv.registerDefaultInstance(C90253b.class, bVar);
    }

    private C90253b() {
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
                return newMessageInfo(f252103g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C90253b();
            case 4:
                return new C90252a();
            case 5:
                return f252103g;
            case 6:
                C63010eb ebVar = f252104h;
                if (ebVar == null) {
                    synchronized (C90253b.class) {
                        ebVar = f252104h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252103g);
                            f252104h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
