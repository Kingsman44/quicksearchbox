package com.google.android.libraries.p11016ak;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ak.p */
/* compiled from: PG */
public final class C147734p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C147734p f398651e;

    /* renamed from: f */
    private static volatile C63010eb f398652f;

    /* renamed from: a */
    public C147732n f398653a;

    /* renamed from: b */
    public C62971cq f398654b = emptyProtobufList();

    /* renamed from: c */
    public String f398655c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f398656d;

    static {
        C147734p pVar = new C147734p();
        f398651e = pVar;
        C62942bv.registerDefaultInstance(C147734p.class, pVar);
    }

    private C147734p() {
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
                return newMessageInfo(f398651e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003Ȉ\u0004\u0004", new Object[]{"a", "b", C147736r.class, C45240c.f118157a, "d"});
            case 3:
                return new C147734p();
            case 4:
                return new C147733o();
            case 5:
                return f398651e;
            case 6:
                C63010eb ebVar = f398652f;
                if (ebVar == null) {
                    synchronized (C147734p.class) {
                        ebVar = f398652f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f398651e);
                            f398652f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
