package com.google.protos.p4985f.p5030q;

import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.bi */
/* compiled from: PG */
public final class C65088bi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65088bi f176235c;

    /* renamed from: e */
    private static volatile C63010eb f176236e;

    /* renamed from: a */
    public int f176237a;

    /* renamed from: b */
    public C51527l f176238b;

    /* renamed from: d */
    private byte f176239d = 2;

    static {
        C65088bi biVar = new C65088bi();
        f176235c = biVar;
        C62942bv.registerDefaultInstance(C65088bi.class, biVar);
    }

    private C65088bi() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176239d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176239d = b;
                return null;
            case 2:
                return newMessageInfo(f176235c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65088bi();
            case 4:
                return new C65087bh();
            case 5:
                return f176235c;
            case 6:
                C63010eb ebVar = f176236e;
                if (ebVar == null) {
                    synchronized (C65088bi.class) {
                        ebVar = f176236e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176235c);
                            f176236e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
