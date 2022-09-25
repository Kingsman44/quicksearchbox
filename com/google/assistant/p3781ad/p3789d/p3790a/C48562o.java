package com.google.assistant.p3781ad.p3789d.p3790a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.a.o */
/* compiled from: PG */
public final class C48562o extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48562o f125453f;

    /* renamed from: h */
    private static volatile C63010eb f125454h;

    /* renamed from: a */
    public int f125455a;

    /* renamed from: b */
    public long f125456b;

    /* renamed from: c */
    public long f125457c;

    /* renamed from: d */
    public String f125458d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C48564q f125459e;

    /* renamed from: g */
    private byte f125460g = 2;

    static {
        C48562o oVar = new C48562o();
        f125453f = oVar;
        C62942bv.registerDefaultInstance(C48562o.class, oVar);
    }

    private C48562o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125460g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f125460g = b;
                return null;
            case 2:
                return newMessageInfo(f125453f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C48562o();
            case 4:
                return new C48561n();
            case 5:
                return f125453f;
            case 6:
                C63010eb ebVar = f125454h;
                if (ebVar == null) {
                    synchronized (C48562o.class) {
                        ebVar = f125454h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125453f);
                            f125454h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
