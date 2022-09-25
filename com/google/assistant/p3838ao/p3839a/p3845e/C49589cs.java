package com.google.assistant.p3838ao.p3839a.p3845e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.cs */
/* compiled from: PG */
public final class C49589cs extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49589cs f127959d;

    /* renamed from: e */
    private static volatile C63010eb f127960e;

    /* renamed from: a */
    public int f127961a;

    /* renamed from: b */
    public String f127962b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C49591cu f127963c;

    static {
        C49589cs csVar = new C49589cs();
        f127959d = csVar;
        C62942bv.registerDefaultInstance(C49589cs.class, csVar);
    }

    private C49589cs() {
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
                return newMessageInfo(f127959d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49589cs();
            case 4:
                return new C49588cr();
            case 5:
                return f127959d;
            case 6:
                C63010eb ebVar = f127960e;
                if (ebVar == null) {
                    synchronized (C49589cs.class) {
                        ebVar = f127960e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127959d);
                            f127960e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
