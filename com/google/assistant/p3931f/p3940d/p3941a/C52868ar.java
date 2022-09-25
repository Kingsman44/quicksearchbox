package com.google.assistant.p3931f.p3940d.p3941a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.ar */
/* compiled from: PG */
public final class C52868ar extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52868ar f138706d;

    /* renamed from: e */
    private static volatile C63010eb f138707e;

    /* renamed from: a */
    public C52858ah f138708a;

    /* renamed from: b */
    public String f138709b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f138710c = BuildConfig.FLAVOR;

    static {
        C52868ar arVar = new C52868ar();
        f138706d = arVar;
        C62942bv.registerDefaultInstance(C52868ar.class, arVar);
    }

    private C52868ar() {
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
                return newMessageInfo(f138706d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52868ar();
            case 4:
                return new C52867aq();
            case 5:
                return f138706d;
            case 6:
                C63010eb ebVar = f138707e;
                if (ebVar == null) {
                    synchronized (C52868ar.class) {
                        ebVar = f138707e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138706d);
                            f138707e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
