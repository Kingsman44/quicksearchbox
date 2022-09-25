package com.google.assistant.p3838ao.p3839a.p3845e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.cd */
/* compiled from: PG */
public final class C49574cd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49574cd f127912d;

    /* renamed from: e */
    private static volatile C63010eb f127913e;

    /* renamed from: a */
    public int f127914a;

    /* renamed from: b */
    public String f127915b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public double f127916c;

    static {
        C49574cd cdVar = new C49574cd();
        f127912d = cdVar;
        C62942bv.registerDefaultInstance(C49574cd.class, cdVar);
    }

    private C49574cd() {
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
                return newMessageInfo(f127912d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49574cd();
            case 4:
                return new C49573cc();
            case 5:
                return f127912d;
            case 6:
                C63010eb ebVar = f127913e;
                if (ebVar == null) {
                    synchronized (C49574cd.class) {
                        ebVar = f127913e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127912d);
                            f127913e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
