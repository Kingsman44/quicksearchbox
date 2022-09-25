package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.pm */
/* compiled from: PG */
public final class C14607pm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14607pm f44163d;

    /* renamed from: e */
    private static volatile C63010eb f44164e;

    /* renamed from: a */
    public String f44165a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C14361gj f44166b;

    /* renamed from: c */
    public int f44167c;

    static {
        C14607pm pmVar = new C14607pm();
        f44163d = pmVar;
        C62942bv.registerDefaultInstance(C14607pm.class, pmVar);
    }

    private C14607pm() {
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
                return newMessageInfo(f44163d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u000b", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14607pm();
            case 4:
                return new C14606pl();
            case 5:
                return f44163d;
            case 6:
                C63010eb ebVar = f44164e;
                if (ebVar == null) {
                    synchronized (C14607pm.class) {
                        ebVar = f44164e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44163d);
                            f44164e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
