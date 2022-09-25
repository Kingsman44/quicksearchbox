package com.google.android.apps.gsa.assist;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.ah */
/* compiled from: PG */
public final class C9337ah extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9337ah f32395e;

    /* renamed from: f */
    private static volatile C63010eb f32396f;

    /* renamed from: a */
    public int f32397a;

    /* renamed from: b */
    public String f32398b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f32399c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f32400d = C62942bv.emptyProtobufList();

    static {
        C9337ah ahVar = new C9337ah();
        f32395e = ahVar;
        C62942bv.registerDefaultInstance(C9337ah.class, ahVar);
    }

    private C9337ah() {
    }

    /* renamed from: a */
    public final void mo17543a() {
        C62971cq cqVar = this.f32399c;
        if (!cqVar.mo58948c()) {
            this.f32399c = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f32395e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001a", new Object[]{"a", "b", C45240c.f118157a, C9336ag.class, "d"});
            case 3:
                return new C9337ah();
            case 4:
                return new C9334ae();
            case 5:
                return f32395e;
            case 6:
                C63010eb ebVar = f32396f;
                if (ebVar == null) {
                    synchronized (C9337ah.class) {
                        ebVar = f32396f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32395e);
                            f32396f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
