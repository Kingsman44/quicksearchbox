package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.bf */
/* compiled from: PG */
public final class C16359bf extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C16359bf f48152f;

    /* renamed from: g */
    private static volatile C63010eb f48153g;

    /* renamed from: a */
    public int f48154a;

    /* renamed from: b */
    public boolean f48155b;

    /* renamed from: c */
    public String f48156c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f48157d;

    /* renamed from: e */
    public boolean f48158e;

    static {
        C16359bf bfVar = new C16359bf();
        f48152f = bfVar;
        C62942bv.registerDefaultInstance(C16359bf.class, bfVar);
    }

    private C16359bf() {
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
                return newMessageInfo(f48152f, "\u0001\u0004\u0000\u0001\u0002\b\u0004\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဈ\u0001\u0007ဇ\u0003\bဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C16359bf();
            case 4:
                return new C16358be();
            case 5:
                return f48152f;
            case 6:
                C63010eb ebVar = f48153g;
                if (ebVar == null) {
                    synchronized (C16359bf.class) {
                        ebVar = f48153g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48152f);
                            f48153g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
