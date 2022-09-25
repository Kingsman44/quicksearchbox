package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ti */
/* compiled from: PG */
public final class C50337ti extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50337ti f131008b;

    /* renamed from: d */
    private static volatile C63010eb f131009d;

    /* renamed from: a */
    public String f131010a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f131011c;

    static {
        C50337ti tiVar = new C50337ti();
        f131008b = tiVar;
        C62942bv.registerDefaultInstance(C50337ti.class, tiVar);
    }

    private C50337ti() {
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
                return newMessageInfo(f131008b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50337ti();
            case 4:
                return new C50336th();
            case 5:
                return f131008b;
            case 6:
                C63010eb ebVar = f131009d;
                if (ebVar == null) {
                    synchronized (C50337ti.class) {
                        ebVar = f131009d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131008b);
                            f131009d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
