package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ok */
/* compiled from: PG */
public final class C14578ok extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C14578ok f44075f;

    /* renamed from: g */
    private static volatile C63010eb f44076g;

    /* renamed from: a */
    public C14348fx f44077a;

    /* renamed from: b */
    public C14580om f44078b;

    /* renamed from: c */
    public int f44079c;

    /* renamed from: d */
    public int f44080d;

    /* renamed from: e */
    public boolean f44081e;

    static {
        C14578ok okVar = new C14578ok();
        f44075f = okVar;
        C62942bv.registerDefaultInstance(C14578ok.class, okVar);
    }

    private C14578ok() {
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
                return newMessageInfo(f44075f, "\u0000\u0005\u0000\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002\t\u0003\t\u0004\u0004\u0005\u0004\u0006\u0007", new Object[]{"b", "a", C45240c.f118157a, "d", "e"});
            case 3:
                return new C14578ok();
            case 4:
                return new C14577oj();
            case 5:
                return f44075f;
            case 6:
                C63010eb ebVar = f44076g;
                if (ebVar == null) {
                    synchronized (C14578ok.class) {
                        ebVar = f44076g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44075f);
                            f44076g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
