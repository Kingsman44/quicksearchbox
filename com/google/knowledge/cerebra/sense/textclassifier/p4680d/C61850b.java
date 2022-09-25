package com.google.knowledge.cerebra.sense.textclassifier.p4680d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.d.b */
/* compiled from: PG */
public final class C61850b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61850b f167138d;

    /* renamed from: e */
    private static volatile C63010eb f167139e;

    /* renamed from: a */
    public int f167140a;

    /* renamed from: b */
    public String f167141b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f167142c = BuildConfig.FLAVOR;

    static {
        C61850b bVar = new C61850b();
        f167138d = bVar;
        C62942bv.registerDefaultInstance(C61850b.class, bVar);
    }

    private C61850b() {
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
                return newMessageInfo(f167138d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C61850b();
            case 4:
                return new C61849a();
            case 5:
                return f167138d;
            case 6:
                C63010eb ebVar = f167139e;
                if (ebVar == null) {
                    synchronized (C61850b.class) {
                        ebVar = f167139e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167138d);
                            f167139e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
