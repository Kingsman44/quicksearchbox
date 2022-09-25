package com.google.p4500cm.p4501a.p4511d.p4512a.p4513a;

import com.google.p4152bb.p4153a.C54946ad;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cm.a.d.a.a.b */
/* compiled from: PG */
public final class C58166b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C58166b f155509b;

    /* renamed from: d */
    private static volatile C63010eb f155510d;

    /* renamed from: a */
    public C62971cq f155511a = emptyProtobufList();

    /* renamed from: c */
    private byte f155512c = 2;

    static {
        C58166b bVar = new C58166b();
        f155509b = bVar;
        C62942bv.registerDefaultInstance(C58166b.class, bVar);
    }

    private C58166b() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f155512c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f155512c = b;
                return null;
            case 2:
                return newMessageInfo(f155509b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", C54946ad.class});
            case 3:
                return new C58166b();
            case 4:
                return new C58165a();
            case 5:
                return f155509b;
            case 6:
                C63010eb ebVar = f155510d;
                if (ebVar == null) {
                    synchronized (C58166b.class) {
                        ebVar = f155510d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155509b);
                            f155510d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
