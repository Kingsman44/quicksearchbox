package com.google.android.libraries.search.logging.p3046g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.android.libraries.search.logging.g.u */
/* compiled from: PG */
public final class C39215u extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C39215u f103167f;

    /* renamed from: h */
    private static volatile C63010eb f103168h;

    /* renamed from: a */
    public int f103169a;

    /* renamed from: b */
    public String f103170b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f103171c;

    /* renamed from: d */
    public C62971cq f103172d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C63204j f103173e;

    /* renamed from: g */
    private byte f103174g = 2;

    static {
        C39215u uVar = new C39215u();
        f103167f = uVar;
        C62942bv.registerDefaultInstance(C39215u.class, uVar);
    }

    private C39215u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f103174g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f103174g = b;
                return null;
            case 2:
                return newMessageInfo(f103167f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002င\u0001\u0003\u001a\u0004ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C39215u();
            case 4:
                return new C39214t();
            case 5:
                return f103167f;
            case 6:
                C63010eb ebVar = f103168h;
                if (ebVar == null) {
                    synchronized (C39215u.class) {
                        ebVar = f103168h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103167f);
                            f103168h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
