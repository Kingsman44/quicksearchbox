package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.fy */
/* compiled from: PG */
public final class C49975fy extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49975fy f129911b;

    /* renamed from: d */
    private static volatile C63010eb f129912d;

    /* renamed from: a */
    public String f129913a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f129914c;

    static {
        C49975fy fyVar = new C49975fy();
        f129911b = fyVar;
        C62942bv.registerDefaultInstance(C49975fy.class, fyVar);
    }

    private C49975fy() {
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
                return newMessageInfo(f129911b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C49975fy();
            case 4:
                return new C49974fx();
            case 5:
                return f129911b;
            case 6:
                C63010eb ebVar = f129912d;
                if (ebVar == null) {
                    synchronized (C49975fy.class) {
                        ebVar = f129912d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129911b);
                            f129912d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
