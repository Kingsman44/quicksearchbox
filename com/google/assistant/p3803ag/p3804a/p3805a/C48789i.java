package com.google.assistant.p3803ag.p3804a.p3805a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3804a.C48849bp;
import com.google.assistant.p3803ag.p3804a.C48855bv;
import com.google.assistant.p3803ag.p3804a.C48883z;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.a.i */
/* compiled from: PG */
public final class C48789i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48789i f126241e;

    /* renamed from: g */
    private static volatile C63010eb f126242g;

    /* renamed from: a */
    public int f126243a;

    /* renamed from: b */
    public C48849bp f126244b;

    /* renamed from: c */
    public C62971cq f126245c = emptyProtobufList();

    /* renamed from: d */
    public C48883z f126246d;

    /* renamed from: f */
    private byte f126247f = 2;

    static {
        C48789i iVar = new C48789i();
        f126241e = iVar;
        C62942bv.registerDefaultInstance(C48789i.class, iVar);
    }

    private C48789i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126247f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126247f = b;
                return null;
            case 2:
                return newMessageInfo(f126241e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a, C48855bv.class, "d"});
            case 3:
                return new C48789i();
            case 4:
                return new C48788h();
            case 5:
                return f126241e;
            case 6:
                C63010eb ebVar = f126242g;
                if (ebVar == null) {
                    synchronized (C48789i.class) {
                        ebVar = f126242g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126241e);
                            f126242g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
