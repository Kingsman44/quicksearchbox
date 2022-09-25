package com.google.android.libraries.lens.view.p2069am;

import com.google.lens.p4699e.C62219be;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.ao */
/* compiled from: PG */
public final class C25307ao extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C25307ao f68833c;

    /* renamed from: e */
    private static volatile C63010eb f68834e;

    /* renamed from: a */
    public C62219be f68835a;

    /* renamed from: b */
    public C62971cq f68836b = C62942bv.emptyProtobufList();

    /* renamed from: d */
    private byte f68837d = 2;

    static {
        C25307ao aoVar = new C25307ao();
        f68833c = aoVar;
        C62942bv.registerDefaultInstance(C25307ao.class, aoVar);
    }

    private C25307ao() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f68837d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f68837d = b;
                return null;
            case 2:
                return newMessageInfo(f68833c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0001\u0001Љ\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C25307ao();
            case 4:
                return new C25306an();
            case 5:
                return f68833c;
            case 6:
                C63010eb ebVar = f68834e;
                if (ebVar == null) {
                    synchronized (C25307ao.class) {
                        ebVar = f68834e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68833c);
                            f68834e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
