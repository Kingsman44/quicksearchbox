package com.google.assistant.p3931f.p3939c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.c.z */
/* compiled from: PG */
public final class C52849z extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52849z f138656d;

    /* renamed from: e */
    private static volatile C63010eb f138657e;

    /* renamed from: a */
    public int f138658a = 0;

    /* renamed from: b */
    public Object f138659b;

    /* renamed from: c */
    public String f138660c = BuildConfig.FLAVOR;

    static {
        C52849z zVar = new C52849z();
        f138656d = zVar;
        C62942bv.registerDefaultInstance(C52849z.class, zVar);
    }

    private C52849z() {
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
                return newMessageInfo(f138656d, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȉ", new Object[]{"b", "a", C45240c.f118157a});
            case 3:
                return new C52849z();
            case 4:
                return new C52848y();
            case 5:
                return f138656d;
            case 6:
                C63010eb ebVar = f138657e;
                if (ebVar == null) {
                    synchronized (C52849z.class) {
                        ebVar = f138657e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138656d);
                            f138657e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
