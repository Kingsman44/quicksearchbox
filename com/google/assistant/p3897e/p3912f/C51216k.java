package com.google.assistant.p3897e.p3912f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.f.k */
/* compiled from: PG */
public final class C51216k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51216k f133340d;

    /* renamed from: e */
    private static volatile C63010eb f133341e;

    /* renamed from: a */
    public int f133342a;

    /* renamed from: b */
    public String f133343b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f133344c;

    static {
        C51216k kVar = new C51216k();
        f133340d = kVar;
        C62942bv.registerDefaultInstance(C51216k.class, kVar);
    }

    private C51216k() {
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
                return newMessageInfo(f133340d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51216k();
            case 4:
                return new C51215j();
            case 5:
                return f133340d;
            case 6:
                C63010eb ebVar = f133341e;
                if (ebVar == null) {
                    synchronized (C51216k.class) {
                        ebVar = f133341e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133340d);
                            f133341e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
