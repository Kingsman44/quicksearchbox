package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54120s;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.dw */
/* compiled from: PG */
public final class C87795dw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87795dw f237581c;

    /* renamed from: e */
    private static volatile C63010eb f237582e;

    /* renamed from: a */
    public int f237583a;

    /* renamed from: b */
    public C54120s f237584b;

    /* renamed from: d */
    private byte f237585d = 2;

    static {
        C87795dw dwVar = new C87795dw();
        f237581c = dwVar;
        C62942bv.registerDefaultInstance(C87795dw.class, dwVar);
    }

    private C87795dw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f237585d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f237585d = b;
                return null;
            case 2:
                return newMessageInfo(f237581c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87795dw();
            case 4:
                return new C87794dv();
            case 5:
                return f237581c;
            case 6:
                C63010eb ebVar = f237582e;
                if (ebVar == null) {
                    synchronized (C87795dw.class) {
                        ebVar = f237582e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237581c);
                            f237582e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
