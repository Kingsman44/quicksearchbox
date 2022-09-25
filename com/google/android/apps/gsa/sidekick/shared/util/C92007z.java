package com.google.android.apps.gsa.sidekick.shared.util;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.z */
/* compiled from: PG */
public final class C92007z extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C92007z f256515g;

    /* renamed from: h */
    private static volatile C63010eb f256516h;

    /* renamed from: a */
    public int f256517a;

    /* renamed from: b */
    public C62971cq f256518b = emptyProtobufList();

    /* renamed from: c */
    public C92005x f256519c;

    /* renamed from: d */
    public C92005x f256520d;

    /* renamed from: e */
    public C62971cq f256521e = emptyProtobufList();

    /* renamed from: f */
    public String f256522f = BuildConfig.FLAVOR;

    static {
        C92007z zVar = new C92007z();
        f256515g = zVar;
        C62942bv.registerDefaultInstance(C92007z.class, zVar);
    }

    private C92007z() {
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
                return newMessageInfo(f256515g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u001b\u0005ဈ\u0002", new Object[]{"a", "b", C92005x.class, C45240c.f118157a, "d", "e", C92007z.class, C10662f.f35572a});
            case 3:
                return new C92007z();
            case 4:
                return new C92006y();
            case 5:
                return f256515g;
            case 6:
                C63010eb ebVar = f256516h;
                if (ebVar == null) {
                    synchronized (C92007z.class) {
                        ebVar = f256516h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256515g);
                            f256516h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
