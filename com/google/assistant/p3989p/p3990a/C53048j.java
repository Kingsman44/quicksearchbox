package com.google.assistant.p3989p.p3990a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.p.a.j */
/* compiled from: PG */
public final class C53048j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53048j f139033e;

    /* renamed from: f */
    private static volatile C63010eb f139034f;

    /* renamed from: a */
    public int f139035a;

    /* renamed from: b */
    public C53046h f139036b;

    /* renamed from: c */
    public C62961ch f139037c = emptyIntList();

    /* renamed from: d */
    public String f139038d = BuildConfig.FLAVOR;

    static {
        C53048j jVar = new C53048j();
        f139033e = jVar;
        C62942bv.registerDefaultInstance(C53048j.class, jVar);
    }

    private C53048j() {
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
                return newMessageInfo(f139033e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0004\u0016\u0005ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C53048j();
            case 4:
                return new C53047i();
            case 5:
                return f139033e;
            case 6:
                C63010eb ebVar = f139034f;
                if (ebVar == null) {
                    synchronized (C53048j.class) {
                        ebVar = f139034f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139033e);
                            f139034f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
