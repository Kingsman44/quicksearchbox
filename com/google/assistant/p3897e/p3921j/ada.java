package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3902c.p3907c.C51102gl;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ada */
/* compiled from: PG */
public final class ada extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final ada f134865f;

    /* renamed from: h */
    private static volatile C63010eb f134866h;

    /* renamed from: a */
    public int f134867a;

    /* renamed from: b */
    public C51098gh f134868b;

    /* renamed from: c */
    public C51102gl f134869c;

    /* renamed from: d */
    public C51986gl f134870d;

    /* renamed from: e */
    public boolean f134871e;

    /* renamed from: g */
    private byte f134872g = 2;

    static {
        ada ada = new ada();
        f134865f = ada;
        C62942bv.registerDefaultInstance(ada.class, ada);
    }

    private ada() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134872g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134872g = b;
                return null;
            case 2:
                return newMessageInfo(f134865f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new ada();
            case 4:
                return new acz();
            case 5:
                return f134865f;
            case 6:
                C63010eb ebVar = f134866h;
                if (ebVar == null) {
                    synchronized (ada.class) {
                        ebVar = f134866h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134865f);
                            f134866h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
