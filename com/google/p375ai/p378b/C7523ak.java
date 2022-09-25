package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ak */
/* compiled from: PG */
public final class C7523ak extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C7523ak f26041f;

    /* renamed from: g */
    private static volatile C63010eb f26042g;

    /* renamed from: a */
    public int f26043a;

    /* renamed from: b */
    public String f26044b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f26045c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f26046d;

    /* renamed from: e */
    public boolean f26047e;

    static {
        C7523ak akVar = new C7523ak();
        f26041f = akVar;
        C62942bv.registerDefaultInstance(C7523ak.class, akVar);
    }

    private C7523ak() {
        emptyIntList();
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
                return newMessageInfo(f26041f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C7523ak();
            case 4:
                return new C7522aj();
            case 5:
                return f26041f;
            case 6:
                C63010eb ebVar = f26042g;
                if (ebVar == null) {
                    synchronized (C7523ak.class) {
                        ebVar = f26042g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26041f);
                            f26042g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
