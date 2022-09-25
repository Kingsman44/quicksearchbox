package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.ab */
/* compiled from: PG */
public final class C121548ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C121548ab f337287c;

    /* renamed from: e */
    private static volatile C63010eb f337288e;

    /* renamed from: a */
    public int f337289a;

    /* renamed from: b */
    public C34053bp f337290b;

    /* renamed from: d */
    private byte f337291d = 2;

    static {
        C121548ab abVar = new C121548ab();
        f337287c = abVar;
        C62942bv.registerDefaultInstance(C121548ab.class, abVar);
    }

    private C121548ab() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f337291d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f337291d = b;
                return null;
            case 2:
                return newMessageInfo(f337287c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001\f\u0002Љ", new Object[]{"a", "b"});
            case 3:
                return new C121548ab();
            case 4:
                return new C121547aa();
            case 5:
                return f337287c;
            case 6:
                C63010eb ebVar = f337288e;
                if (ebVar == null) {
                    synchronized (C121548ab.class) {
                        ebVar = f337288e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f337287c);
                            f337288e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
