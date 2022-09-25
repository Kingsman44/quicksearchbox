package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.gg */
/* compiled from: PG */
public final class C51399gg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51399gg f133852b;

    /* renamed from: d */
    private static volatile C63010eb f133853d;

    /* renamed from: a */
    public String f133854a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f133855c;

    static {
        C51399gg ggVar = new C51399gg();
        f133852b = ggVar;
        C62942bv.registerDefaultInstance(C51399gg.class, ggVar);
    }

    private C51399gg() {
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
                return newMessageInfo(f133852b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51399gg();
            case 4:
                return new C51398gf();
            case 5:
                return f133852b;
            case 6:
                C63010eb ebVar = f133853d;
                if (ebVar == null) {
                    synchronized (C51399gg.class) {
                        ebVar = f133853d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133852b);
                            f133853d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
