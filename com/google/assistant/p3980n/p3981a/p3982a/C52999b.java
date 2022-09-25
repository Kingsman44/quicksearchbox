package com.google.assistant.p3980n.p3981a.p3982a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.n.a.a.b */
/* compiled from: PG */
public final class C52999b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52999b f138927c;

    /* renamed from: d */
    private static volatile C63010eb f138928d;

    /* renamed from: a */
    public int f138929a;

    /* renamed from: b */
    public String f138930b = BuildConfig.FLAVOR;

    static {
        C52999b bVar = new C52999b();
        f138927c = bVar;
        C62942bv.registerDefaultInstance(C52999b.class, bVar);
    }

    private C52999b() {
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
                return newMessageInfo(f138927c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52999b();
            case 4:
                return new C52998a();
            case 5:
                return f138927c;
            case 6:
                C63010eb ebVar = f138928d;
                if (ebVar == null) {
                    synchronized (C52999b.class) {
                        ebVar = f138928d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138927c);
                            f138928d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
