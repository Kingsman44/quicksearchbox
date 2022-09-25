package com.google.android.gms.auth.p10743b.p10744a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.auth.b.a.k */
/* compiled from: PG */
public final class C142897k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142897k f387723c;

    /* renamed from: e */
    private static volatile C63010eb f387724e;

    /* renamed from: a */
    public int f387725a;

    /* renamed from: b */
    public String f387726b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f387727d;

    static {
        C142897k kVar = new C142897k();
        f387723c = kVar;
        C62942bv.registerDefaultInstance(C142897k.class, kVar);
    }

    private C142897k() {
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
                return newMessageInfo(f387723c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"d", "a", C142895i.f387722a, "b"});
            case 3:
                return new C142897k();
            case 4:
                return new C142894h();
            case 5:
                return f387723c;
            case 6:
                C63010eb ebVar = f387724e;
                if (ebVar == null) {
                    synchronized (C142897k.class) {
                        ebVar = f387724e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f387723c);
                            f387724e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
