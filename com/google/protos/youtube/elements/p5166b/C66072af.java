package com.google.protos.youtube.elements.p5166b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.b.af */
/* compiled from: PG */
public final class C66072af extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66072af f179671b;

    /* renamed from: d */
    private static volatile C63010eb f179672d;

    /* renamed from: a */
    public String f179673a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f179674c;

    static {
        C66072af afVar = new C66072af();
        f179671b = afVar;
        C62942bv.registerDefaultInstance(C66072af.class, afVar);
    }

    private C66072af() {
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
                return newMessageInfo(f179671b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C66072af();
            case 4:
                return new C66071ae();
            case 5:
                return f179671b;
            case 6:
                C63010eb ebVar = f179672d;
                if (ebVar == null) {
                    synchronized (C66072af.class) {
                        ebVar = f179672d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179671b);
                            f179672d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
