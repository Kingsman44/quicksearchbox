package com.google.android.apps.gsa.unifiedime;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.unifiedime.x */
/* compiled from: PG */
public final class C118606x extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C118606x f330892g;

    /* renamed from: h */
    private static volatile C63010eb f330893h;

    /* renamed from: a */
    public int f330894a;

    /* renamed from: b */
    public String f330895b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f330896c;

    /* renamed from: d */
    public String f330897d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f330898e = emptyProtobufList();

    /* renamed from: f */
    public C118590h f330899f;

    static {
        C118606x xVar = new C118606x();
        f330892g = xVar;
        C62942bv.registerDefaultInstance(C118606x.class, xVar);
    }

    private C118606x() {
    }

    /* renamed from: a */
    public final void mo103785a() {
        C62971cq cqVar = this.f330898e;
        if (!cqVar.mo58948c()) {
            this.f330898e = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f330892g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0004ဈ\u0002\u0005\u001b\u0006ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C118604v.class, C10662f.f35572a});
            case 3:
                return new C118606x();
            case 4:
                return new C118605w();
            case 5:
                return f330892g;
            case 6:
                C63010eb ebVar = f330893h;
                if (ebVar == null) {
                    synchronized (C118606x.class) {
                        ebVar = f330893h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f330892g);
                            f330893h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
