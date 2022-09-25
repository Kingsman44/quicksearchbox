package com.google.android.libraries.assistant.contexttrigger;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f */
/* compiled from: PG */
public final class C17693f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C17693f f50865e;

    /* renamed from: g */
    private static volatile C63010eb f50866g;

    /* renamed from: a */
    public int f50867a;

    /* renamed from: b */
    public String f50868b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C48917s f50869c;

    /* renamed from: d */
    public long f50870d;

    /* renamed from: f */
    private byte f50871f = 2;

    static {
        C17693f fVar = new C17693f();
        f50865e = fVar;
        C62942bv.registerDefaultInstance(C17693f.class, fVar);
    }

    private C17693f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f50871f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f50871f = b;
                return null;
            case 2:
                return newMessageInfo(f50865e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C17693f();
            case 4:
                return new C17686e();
            case 5:
                return f50865e;
            case 6:
                C63010eb ebVar = f50866g;
                if (ebVar == null) {
                    synchronized (C17693f.class) {
                        ebVar = f50866g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50865e);
                            f50866g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
