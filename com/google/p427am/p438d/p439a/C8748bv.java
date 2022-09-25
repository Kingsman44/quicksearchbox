package com.google.p427am.p438d.p439a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.am.d.a.bv */
/* compiled from: PG */
public final class C8748bv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8748bv f30088c;

    /* renamed from: d */
    private static volatile C63010eb f30089d;

    /* renamed from: a */
    public C63088z f30090a = C63088z.f170246b;

    /* renamed from: b */
    public String f30091b = BuildConfig.FLAVOR;

    static {
        C8748bv bvVar = new C8748bv();
        f30088c = bvVar;
        C62942bv.registerDefaultInstance(C8748bv.class, bvVar);
    }

    private C8748bv() {
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
                return newMessageInfo(f30088c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C8748bv();
            case 4:
                return new C8747bu();
            case 5:
                return f30088c;
            case 6:
                C63010eb ebVar = f30089d;
                if (ebVar == null) {
                    synchronized (C8748bv.class) {
                        ebVar = f30089d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30088c);
                            f30089d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
