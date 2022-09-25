package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.bg */
/* compiled from: PG */
public final class C49849bg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49849bg f129546d;

    /* renamed from: f */
    private static volatile C63010eb f129547f;

    /* renamed from: a */
    public String f129548a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f129549b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129550c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f129551e;

    static {
        C49849bg bgVar = new C49849bg();
        f129546d = bgVar;
        C62942bv.registerDefaultInstance(C49849bg.class, bgVar);
    }

    private C49849bg() {
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
                return newMessageInfo(f129546d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C49849bg();
            case 4:
                return new C49848bf();
            case 5:
                return f129546d;
            case 6:
                C63010eb ebVar = f129547f;
                if (ebVar == null) {
                    synchronized (C49849bg.class) {
                        ebVar = f129547f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129546d);
                            f129547f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
