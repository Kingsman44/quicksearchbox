package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C66902ds;

/* renamed from: com.google.common.o.agz */
/* compiled from: PG */
public final class agz extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final agz f158679e;

    /* renamed from: f */
    private static volatile C63010eb f158680f;

    /* renamed from: a */
    public int f158681a;

    /* renamed from: b */
    public int f158682b;

    /* renamed from: c */
    public int f158683c;

    /* renamed from: d */
    public C62961ch f158684d = emptyIntList();

    static {
        agz agz = new agz();
        f158679e = agz;
        C62942bv.registerDefaultInstance(agz.class, agz);
    }

    private agz() {
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
                Object[] objArr = new Object[6];
                objArr[0] = "a";
                objArr[1] = "b";
                C62959cf cfVar = C66902ds.f181873a;
                objArr[4] = cfVar;
                objArr[2] = cfVar;
                objArr[3] = C45240c.f118157a;
                objArr[5] = "d";
                return newMessageInfo(f158679e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003'", objArr);
            case 3:
                return new agz();
            case 4:
                return new agy();
            case 5:
                return f158679e;
            case 6:
                C63010eb ebVar = f158680f;
                if (ebVar == null) {
                    synchronized (agz.class) {
                        ebVar = f158680f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158679e);
                            f158680f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
