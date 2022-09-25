package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.amo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.bn */
/* compiled from: PG */
public final class C88443bn extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C88443bn f239106g;

    /* renamed from: h */
    private static volatile C63010eb f239107h;

    /* renamed from: a */
    public int f239108a;

    /* renamed from: b */
    public String f239109b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f239110c;

    /* renamed from: d */
    public boolean f239111d;

    /* renamed from: e */
    public int f239112e;

    /* renamed from: f */
    public boolean f239113f;

    static {
        C88443bn bnVar = new C88443bn();
        f239106g = bnVar;
        C62942bv.registerDefaultInstance(C88443bn.class, bnVar);
    }

    private C88443bn() {
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
                return newMessageInfo(f239106g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0006ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", amo.m92436b(), C10662f.f35572a});
            case 3:
                return new C88443bn();
            case 4:
                return new C88442bm();
            case 5:
                return f239106g;
            case 6:
                C63010eb ebVar = f239107h;
                if (ebVar == null) {
                    synchronized (C88443bn.class) {
                        ebVar = f239107h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239106g);
                            f239107h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
