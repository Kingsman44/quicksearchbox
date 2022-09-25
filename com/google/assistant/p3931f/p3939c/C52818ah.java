package com.google.assistant.p3931f.p3939c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.assistant.f.c.ah */
/* compiled from: PG */
public final class C52818ah extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52818ah f138576e;

    /* renamed from: f */
    private static volatile C63010eb f138577f;

    /* renamed from: a */
    public int f138578a;

    /* renamed from: b */
    public int f138579b = 0;

    /* renamed from: c */
    public Object f138580c;

    /* renamed from: d */
    public String f138581d = BuildConfig.FLAVOR;

    static {
        C52818ah ahVar = new C52818ah();
        f138576e = ahVar;
        C62942bv.registerDefaultInstance(C52818ah.class, ahVar);
    }

    private C52818ah() {
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
                return newMessageInfo(f138576e, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002Ȼ\u0000\u0003:\u0000\u00043\u0000\u0005<\u0000\u0006<\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C52834k.class, C63037fb.class});
            case 3:
                return new C52818ah();
            case 4:
                return new C52816af();
            case 5:
                return f138576e;
            case 6:
                C63010eb ebVar = f138577f;
                if (ebVar == null) {
                    synchronized (C52818ah.class) {
                        ebVar = f138577f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138576e);
                            f138577f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
