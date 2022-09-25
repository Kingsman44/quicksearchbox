package com.google.p427am.p438d.p439a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.bh */
/* compiled from: PG */
public final class C8734bh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8734bh f30072c;

    /* renamed from: d */
    private static volatile C63010eb f30073d;

    /* renamed from: a */
    public String f30074a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C8751by f30075b;

    static {
        C8734bh bhVar = new C8734bh();
        f30072c = bhVar;
        C62942bv.registerDefaultInstance(C8734bh.class, bhVar);
    }

    private C8734bh() {
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
                return newMessageInfo(f30072c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C8734bh();
            case 4:
                return new C8733bg();
            case 5:
                return f30072c;
            case 6:
                C63010eb ebVar = f30073d;
                if (ebVar == null) {
                    synchronized (C8734bh.class) {
                        ebVar = f30073d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30072c);
                            f30073d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
