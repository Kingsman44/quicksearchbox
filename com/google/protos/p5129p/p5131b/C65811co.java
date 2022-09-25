package com.google.protos.p5129p.p5131b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.co */
/* compiled from: PG */
public final class C65811co extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C65811co f178905g;

    /* renamed from: i */
    private static volatile C63010eb f178906i;

    /* renamed from: a */
    public int f178907a;

    /* renamed from: b */
    public String f178908b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f178909c;

    /* renamed from: d */
    public String f178910d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C65808cl f178911e;

    /* renamed from: f */
    public String f178912f = BuildConfig.FLAVOR;

    /* renamed from: h */
    private byte f178913h = 2;

    static {
        C65811co coVar = new C65811co();
        f178905g = coVar;
        C62942bv.registerDefaultInstance(C65811co.class, coVar);
    }

    private C65811co() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178913h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178913h = b;
                return null;
            case 2:
                return newMessageInfo(f178905g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, C65753ak.m96798c(), "d", "e", C10662f.f35572a});
            case 3:
                return new C65811co();
            case 4:
                return new C65810cn();
            case 5:
                return f178905g;
            case 6:
                C63010eb ebVar = f178906i;
                if (ebVar == null) {
                    synchronized (C65811co.class) {
                        ebVar = f178906i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178905g);
                            f178906i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
