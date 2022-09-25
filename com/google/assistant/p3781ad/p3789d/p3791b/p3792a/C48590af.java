package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3917i.p3918a.C51560mf;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.af */
/* compiled from: PG */
public final class C48590af extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48590af f125589d;

    /* renamed from: f */
    private static volatile C63010eb f125590f;

    /* renamed from: a */
    public C62971cq f125591a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f125592b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f125593c = emptyProtobufList();

    /* renamed from: e */
    private byte f125594e = 2;

    static {
        C48590af afVar = new C48590af();
        f125589d = afVar;
        C62942bv.registerDefaultInstance(C48590af.class, afVar);
    }

    private C48590af() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125594e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f125594e = b;
                return null;
            case 2:
                return newMessageInfo(f125589d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0001\u0001Л\u0002\u001b\u0003\u001b", new Object[]{"a", C51473j.class, "b", C51560mf.class, C45240c.f118157a, C51592nk.class});
            case 3:
                return new C48590af();
            case 4:
                return new C48589ae();
            case 5:
                return f125589d;
            case 6:
                C63010eb ebVar = f125590f;
                if (ebVar == null) {
                    synchronized (C48590af.class) {
                        ebVar = f125590f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125589d);
                            f125590f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
