package com.google.speech.p5218j.p5219a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.ad */
/* compiled from: PG */
public final class C66700ad extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66700ad f181439d;

    /* renamed from: f */
    private static volatile C63010eb f181440f;

    /* renamed from: a */
    public int f181441a;

    /* renamed from: b */
    public String f181442b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f181443c = emptyProtobufList();

    /* renamed from: e */
    private byte f181444e = 2;

    static {
        C66700ad adVar = new C66700ad();
        f181439d = adVar;
        C62942bv.registerDefaultInstance(C66700ad.class, adVar);
    }

    private C66700ad() {
    }

    /* renamed from: a */
    public final void mo59709a() {
        C62971cq cqVar = this.f181443c;
        if (!cqVar.mo58948c()) {
            this.f181443c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181444e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181444e = b;
                return null;
            case 2:
                return newMessageInfo(f181439d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"a", "b", C45240c.f118157a, C66702af.class});
            case 3:
                return new C66700ad();
            case 4:
                return new C66699ac();
            case 5:
                return f181439d;
            case 6:
                C63010eb ebVar = f181440f;
                if (ebVar == null) {
                    synchronized (C66700ad.class) {
                        ebVar = f181440f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181439d);
                            f181440f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
