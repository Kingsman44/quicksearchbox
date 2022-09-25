package com.google.p335a.p336a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.a.a.d */
/* compiled from: PG */
public final class C6582d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C6582d f19571g;

    /* renamed from: h */
    private static volatile C63010eb f19572h;

    /* renamed from: a */
    public int f19573a;

    /* renamed from: b */
    public String f19574b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f19575c;

    /* renamed from: d */
    public C62971cq f19576d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public String f19577e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f19578f;

    static {
        C6582d dVar = new C6582d();
        f19571g = dVar;
        C62942bv.registerDefaultInstance(C6582d.class, dVar);
    }

    private C6582d() {
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
                return newMessageInfo(f19571g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0004\u001a\u0005ဈ\u0002\u0007င\u0001\bဇ\u0004", new Object[]{"a", "b", "d", "e", C45240c.f118157a, C10662f.f35572a});
            case 3:
                return new C6582d();
            case 4:
                return new C6581c();
            case 5:
                return f19571g;
            case 6:
                C63010eb ebVar = f19572h;
                if (ebVar == null) {
                    synchronized (C6582d.class) {
                        ebVar = f19572h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19571g);
                            f19572h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
