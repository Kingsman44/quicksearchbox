package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.dn */
/* compiled from: PG */
public final class C119873dn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119873dn f333836c;

    /* renamed from: e */
    private static volatile C63010eb f333837e;

    /* renamed from: a */
    public int f333838a = 0;

    /* renamed from: b */
    public Object f333839b;

    /* renamed from: d */
    private byte f333840d = 2;

    static {
        C119873dn dnVar = new C119873dn();
        f333836c = dnVar;
        C62942bv.registerDefaultInstance(C119873dn.class, dnVar);
    }

    private C119873dn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333840d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333840d = b;
                return null;
            case 2:
                return newMessageInfo(f333836c, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004м\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"b", "a", C119904w.class, C119785ag.class, C119885dz.class, C119844cl.class, C119867dh.class, C119837ce.class});
            case 3:
                return new C119873dn();
            case 4:
                return new C119871dl();
            case 5:
                return f333836c;
            case 6:
                C63010eb ebVar = f333837e;
                if (ebVar == null) {
                    synchronized (C119873dn.class) {
                        ebVar = f333837e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333836c);
                            f333837e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
