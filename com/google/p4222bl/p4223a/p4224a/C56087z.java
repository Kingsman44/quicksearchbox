package com.google.p4222bl.p4223a.p4224a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.a.z */
/* compiled from: PG */
public final class C56087z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56087z f149430b;

    /* renamed from: c */
    private static volatile C63010eb f149431c;

    /* renamed from: a */
    public String f149432a = BuildConfig.FLAVOR;

    static {
        C56087z zVar = new C56087z();
        f149430b = zVar;
        C62942bv.registerDefaultInstance(C56087z.class, zVar);
    }

    private C56087z() {
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
                return newMessageInfo(f149430b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C56087z();
            case 4:
                return new C56086y();
            case 5:
                return f149430b;
            case 6:
                C63010eb ebVar = f149431c;
                if (ebVar == null) {
                    synchronized (C56087z.class) {
                        ebVar = f149431c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149430b);
                            f149431c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
