package com.google.android.apps.gsa.sidekick.shared.monet.p7251g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.g.e */
/* compiled from: PG */
public final class C91837e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C91837e f256113e;

    /* renamed from: g */
    private static volatile C63010eb f256114g;

    /* renamed from: a */
    public int f256115a;

    /* renamed from: b */
    public long f256116b;

    /* renamed from: c */
    public String f256117c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C91835c f256118d;

    /* renamed from: f */
    private byte f256119f = 2;

    static {
        C91837e eVar = new C91837e();
        f256113e = eVar;
        C62942bv.registerDefaultInstance(C91837e.class, eVar);
    }

    private C91837e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f256119f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f256119f = b;
                return null;
            case 2:
                return newMessageInfo(f256113e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C91837e();
            case 4:
                return new C91836d();
            case 5:
                return f256113e;
            case 6:
                C63010eb ebVar = f256114g;
                if (ebVar == null) {
                    synchronized (C91837e.class) {
                        ebVar = f256114g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256113e);
                            f256114g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
