package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.C48218ad;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.agj */
/* compiled from: PG */
public final class agj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final agj f158643e;

    /* renamed from: f */
    private static volatile C63010eb f158644f;

    /* renamed from: a */
    public int f158645a;

    /* renamed from: b */
    public String f158646b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C48218ad f158647c;

    /* renamed from: d */
    public boolean f158648d;

    static {
        agj agj = new agj();
        f158643e = agj;
        C62942bv.registerDefaultInstance(agj.class, agj);
    }

    private agj() {
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
                return newMessageInfo(f158643e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new agj();
            case 4:
                return new agi();
            case 5:
                return f158643e;
            case 6:
                C63010eb ebVar = f158644f;
                if (ebVar == null) {
                    synchronized (agj.class) {
                        ebVar = f158644f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158643e);
                            f158644f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
