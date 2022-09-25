package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.assistant.e.c.c.ep */
/* compiled from: PG */
public final class C51052ep extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51052ep f132933e;

    /* renamed from: f */
    private static volatile C63010eb f132934f;

    /* renamed from: a */
    public int f132935a;

    /* renamed from: b */
    public int f132936b = 0;

    /* renamed from: c */
    public Object f132937c;

    /* renamed from: d */
    public String f132938d = BuildConfig.FLAVOR;

    static {
        C51052ep epVar = new C51052ep();
        f132933e = epVar;
        C62942bv.registerDefaultInstance(C51052ep.class, epVar);
    }

    private C51052ep() {
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
                return newMessageInfo(f132933e, "\u0000\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002Ȼ\u0000\u0003:\u0000\u00043\u0000\u0006<\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C63037fb.class});
            case 3:
                return new C51052ep();
            case 4:
                return new C51051eo();
            case 5:
                return f132933e;
            case 6:
                C63010eb ebVar = f132934f;
                if (ebVar == null) {
                    synchronized (C51052ep.class) {
                        ebVar = f132934f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132933e);
                            f132934f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
