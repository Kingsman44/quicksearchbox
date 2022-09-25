package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.oq */
/* compiled from: PG */
public final class C14584oq extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C14584oq f44091f;

    /* renamed from: g */
    private static volatile C63010eb f44092g;

    /* renamed from: a */
    public C14348fx f44093a;

    /* renamed from: b */
    public C14580om f44094b;

    /* renamed from: c */
    public int f44095c;

    /* renamed from: d */
    public boolean f44096d;

    /* renamed from: e */
    public boolean f44097e;

    static {
        C14584oq oqVar = new C14584oq();
        f44091f = oqVar;
        C62942bv.registerDefaultInstance(C14584oq.class, oqVar);
    }

    private C14584oq() {
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
                return newMessageInfo(f44091f, "\u0000\u0005\u0000\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002\t\u0003\t\u0004\u0004\u0005\u0007\u0006\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C14584oq();
            case 4:
                return new C14583op();
            case 5:
                return f44091f;
            case 6:
                C63010eb ebVar = f44092g;
                if (ebVar == null) {
                    synchronized (C14584oq.class) {
                        ebVar = f44092g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44091f);
                            f44092g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
