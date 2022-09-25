package com.google.assistant.p3980n.p3985c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.n.c.o */
/* compiled from: PG */
public final class C53024o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53024o f138977d;

    /* renamed from: f */
    private static volatile C63010eb f138978f;

    /* renamed from: a */
    public int f138979a;

    /* renamed from: b */
    public String f138980b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f138981c;

    /* renamed from: e */
    private byte f138982e = 2;

    static {
        C53024o oVar = new C53024o();
        f138977d = oVar;
        C62942bv.registerDefaultInstance(C53024o.class, oVar);
    }

    private C53024o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138982e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138982e = b;
                return null;
            case 2:
                return newMessageInfo(f138977d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C53022m.f138976a});
            case 3:
                return new C53024o();
            case 4:
                return new C53021l();
            case 5:
                return f138977d;
            case 6:
                C63010eb ebVar = f138978f;
                if (ebVar == null) {
                    synchronized (C53024o.class) {
                        ebVar = f138978f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138977d);
                            f138978f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
