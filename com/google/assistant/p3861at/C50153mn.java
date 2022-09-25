package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.mn */
/* compiled from: PG */
public final class C50153mn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50153mn f130384d;

    /* renamed from: e */
    private static volatile C63010eb f130385e;

    /* renamed from: a */
    public int f130386a;

    /* renamed from: b */
    public String f130387b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f130388c;

    static {
        C50153mn mnVar = new C50153mn();
        f130384d = mnVar;
        C62942bv.registerDefaultInstance(C50153mn.class, mnVar);
    }

    private C50153mn() {
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
                return newMessageInfo(f130384d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C50150mk.f130383a});
            case 3:
                return new C50153mn();
            case 4:
                return new C50152mm();
            case 5:
                return f130384d;
            case 6:
                C63010eb ebVar = f130385e;
                if (ebVar == null) {
                    synchronized (C50153mn.class) {
                        ebVar = f130385e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130384d);
                            f130385e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
