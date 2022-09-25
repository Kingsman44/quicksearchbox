package com.google.android.libraries.search.p3055n.p3086i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.i.g */
/* compiled from: PG */
public final class C39785g extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C39785g f104642a;

    /* renamed from: c */
    private static volatile C63010eb f104643c;

    /* renamed from: b */
    private byte f104644b = 2;

    static {
        C39785g gVar = new C39785g();
        f104642a = gVar;
        C62942bv.registerDefaultInstance(C39785g.class, gVar);
    }

    private C39785g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f104644b);
            case 1:
                this.f104644b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f104642a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C39785g();
            case 4:
                return new C39784f();
            case 5:
                return f104642a;
            case 6:
                C63010eb ebVar = f104643c;
                if (ebVar == null) {
                    synchronized (C39785g.class) {
                        ebVar = f104643c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104642a);
                            f104643c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
