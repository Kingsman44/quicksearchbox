package com.google.assistant.p3781ad.p3789d.p3791b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.bl */
/* compiled from: PG */
public final class C48704bl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48704bl f125998c;

    /* renamed from: d */
    private static volatile C63010eb f125999d;

    /* renamed from: a */
    public int f126000a;

    /* renamed from: b */
    public String f126001b = BuildConfig.FLAVOR;

    static {
        C48704bl blVar = new C48704bl();
        f125998c = blVar;
        C62942bv.registerDefaultInstance(C48704bl.class, blVar);
    }

    private C48704bl() {
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
                return newMessageInfo(f125998c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C48704bl();
            case 4:
                return new C48703bk();
            case 5:
                return f125998c;
            case 6:
                C63010eb ebVar = f125999d;
                if (ebVar == null) {
                    synchronized (C48704bl.class) {
                        ebVar = f125999d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125998c);
                            f125999d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
