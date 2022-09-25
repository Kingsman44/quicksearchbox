package com.google.android.libraries.lens.ondevice.p2037n;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.ai */
/* compiled from: PG */
public final class C24776ai extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C24776ai f67699e;

    /* renamed from: f */
    private static volatile C63010eb f67700f;

    /* renamed from: a */
    public int f67701a;

    /* renamed from: b */
    public String f67702b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f67703c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f67704d = BuildConfig.FLAVOR;

    static {
        C24776ai aiVar = new C24776ai();
        f67699e = aiVar;
        C62942bv.registerDefaultInstance(C24776ai.class, aiVar);
    }

    private C24776ai() {
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
                return newMessageInfo(f67699e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C24776ai();
            case 4:
                return new C24775ah();
            case 5:
                return f67699e;
            case 6:
                C63010eb ebVar = f67700f;
                if (ebVar == null) {
                    synchronized (C24776ai.class) {
                        ebVar = f67700f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67699e);
                            f67700f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
