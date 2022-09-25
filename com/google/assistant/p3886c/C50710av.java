package com.google.assistant.p3886c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.av */
/* compiled from: PG */
public final class C50710av extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50710av f131964d;

    /* renamed from: e */
    private static volatile C63010eb f131965e;

    /* renamed from: a */
    public int f131966a;

    /* renamed from: b */
    public int f131967b = 1;

    /* renamed from: c */
    public String f131968c = BuildConfig.FLAVOR;

    static {
        C50710av avVar = new C50710av();
        f131964d = avVar;
        C62942bv.registerDefaultInstance(C50710av.class, avVar);
    }

    private C50710av() {
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
                return newMessageInfo(f131964d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C50708at.f131963a, C45240c.f118157a});
            case 3:
                return new C50710av();
            case 4:
                return new C50707as();
            case 5:
                return f131964d;
            case 6:
                C63010eb ebVar = f131965e;
                if (ebVar == null) {
                    synchronized (C50710av.class) {
                        ebVar = f131965e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131964d);
                            f131965e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
