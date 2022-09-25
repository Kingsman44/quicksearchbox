package com.google.android.apps.gsa.opa;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.t */
/* compiled from: PG */
public final class C83811t extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C83811t f228414h;

    /* renamed from: i */
    private static volatile C63010eb f228415i;

    /* renamed from: a */
    public C83815x f228416a;

    /* renamed from: b */
    public C83815x f228417b;

    /* renamed from: c */
    public boolean f228418c;

    /* renamed from: d */
    public boolean f228419d;

    /* renamed from: e */
    public boolean f228420e;

    /* renamed from: f */
    public boolean f228421f;

    /* renamed from: g */
    public boolean f228422g;

    static {
        C83811t tVar = new C83811t();
        f228414h = tVar;
        C62942bv.registerDefaultInstance(C83811t.class, tVar);
    }

    private C83811t() {
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
                return newMessageInfo(f228414h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C83811t();
            case 4:
                return new C83723s();
            case 5:
                return f228414h;
            case 6:
                C63010eb ebVar = f228415i;
                if (ebVar == null) {
                    synchronized (C83811t.class) {
                        ebVar = f228415i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228414h);
                            f228415i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
