package com.google.p4129b.p4130a.p4131a.p4132a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.b.a.a.a.bl */
/* compiled from: PG */
public final class C54695bl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54695bl f143566c;

    /* renamed from: d */
    private static volatile C63010eb f143567d;

    /* renamed from: a */
    public C63088z f143568a = C63088z.f170246b;

    /* renamed from: b */
    public String f143569b = BuildConfig.FLAVOR;

    static {
        C54695bl blVar = new C54695bl();
        f143566c = blVar;
        C62942bv.registerDefaultInstance(C54695bl.class, blVar);
    }

    private C54695bl() {
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
                return newMessageInfo(f143566c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C54695bl();
            case 4:
                return new C54694bk();
            case 5:
                return f143566c;
            case 6:
                C63010eb ebVar = f143567d;
                if (ebVar == null) {
                    synchronized (C54695bl.class) {
                        ebVar = f143567d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143566c);
                            f143567d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
