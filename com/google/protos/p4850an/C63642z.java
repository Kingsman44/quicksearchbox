package com.google.protos.p4850an;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.z */
/* compiled from: PG */
public final class C63642z extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63642z f172112e;

    /* renamed from: g */
    private static volatile C63010eb f172113g;

    /* renamed from: a */
    public int f172114a;

    /* renamed from: b */
    public String f172115b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f172116c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f172117d = emptyProtobufList();

    /* renamed from: f */
    private byte f172118f = 2;

    static {
        C63642z zVar = new C63642z();
        f172112e = zVar;
        C62942bv.registerDefaultInstance(C63642z.class, zVar);
    }

    private C63642z() {
    }

    /* renamed from: a */
    public final void mo59228a() {
        C62971cq cqVar = this.f172117d;
        if (!cqVar.mo58948c()) {
            this.f172117d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172118f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172118f = b;
                return null;
            case 2:
                return newMessageInfo(f172112e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л", new Object[]{"a", "b", C45240c.f118157a, "d", C63634r.class});
            case 3:
                return new C63642z();
            case 4:
                return new C63641y();
            case 5:
                return f172112e;
            case 6:
                C63010eb ebVar = f172113g;
                if (ebVar == null) {
                    synchronized (C63642z.class) {
                        ebVar = f172113g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172112e);
                            f172113g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
