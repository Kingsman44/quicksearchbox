package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.pc */
/* compiled from: PG */
public final class C14597pc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C14597pc f44122e;

    /* renamed from: f */
    private static volatile C63010eb f44123f;

    /* renamed from: a */
    public String f44124a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f44125b;

    /* renamed from: c */
    public int f44126c;

    /* renamed from: d */
    public long f44127d;

    static {
        C14597pc pcVar = new C14597pc();
        f44122e = pcVar;
        C62942bv.registerDefaultInstance(C14597pc.class, pcVar);
    }

    private C14597pc() {
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
                return newMessageInfo(f44122e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\f\u0004\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C14597pc();
            case 4:
                return new C14596pb();
            case 5:
                return f44122e;
            case 6:
                C63010eb ebVar = f44123f;
                if (ebVar == null) {
                    synchronized (C14597pc.class) {
                        ebVar = f44123f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44122e);
                            f44123f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
