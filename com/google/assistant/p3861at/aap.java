package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aap */
/* compiled from: PG */
public final class aap extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aap f128724c;

    /* renamed from: e */
    private static volatile C63010eb f128725e;

    /* renamed from: a */
    public int f128726a = 0;

    /* renamed from: b */
    public Object f128727b;

    /* renamed from: d */
    private byte f128728d = 2;

    static {
        aap aap = new aap();
        f128724c = aap;
        C62942bv.registerDefaultInstance(aap.class, aap);
    }

    private aap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128728d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128728d = b;
                return null;
            case 2:
                return newMessageInfo(f128724c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ြ\u0000\u0004ᐼ\u0000\u0005ြ\u0000", new Object[]{"b", "a", abh.class, acp.class, abf.class, abp.class, aak.class});
            case 3:
                return new aap();
            case 4:
                return new aao();
            case 5:
                return f128724c;
            case 6:
                C63010eb ebVar = f128725e;
                if (ebVar == null) {
                    synchronized (aap.class) {
                        ebVar = f128725e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128724c);
                            f128725e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
