package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.cz */
/* compiled from: PG */
public final class C80724cz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80724cz f221601d;

    /* renamed from: f */
    private static volatile C63010eb f221602f;

    /* renamed from: a */
    public int f221603a;

    /* renamed from: b */
    public String f221604b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63204j f221605c;

    /* renamed from: e */
    private byte f221606e = 2;

    static {
        C80724cz czVar = new C80724cz();
        f221601d = czVar;
        C62942bv.registerDefaultInstance(C80724cz.class, czVar);
    }

    private C80724cz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f221606e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f221606e = b;
                return null;
            case 2:
                return newMessageInfo(f221601d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80724cz();
            case 4:
                return new C80723cy();
            case 5:
                return f221601d;
            case 6:
                C63010eb ebVar = f221602f;
                if (ebVar == null) {
                    synchronized (C80724cz.class) {
                        ebVar = f221602f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221601d);
                            f221602f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
