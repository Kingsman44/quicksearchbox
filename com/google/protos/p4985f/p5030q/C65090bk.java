package com.google.protos.p4985f.p5030q;

import com.google.assistant.p3897e.p3917i.p3918a.C51566ml;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.bk */
/* compiled from: PG */
public final class C65090bk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65090bk f176240c;

    /* renamed from: d */
    private static volatile C63010eb f176241d;

    /* renamed from: a */
    public int f176242a;

    /* renamed from: b */
    public C51566ml f176243b;

    static {
        C65090bk bkVar = new C65090bk();
        f176240c = bkVar;
        C62942bv.registerDefaultInstance(C65090bk.class, bkVar);
    }

    private C65090bk() {
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
                return newMessageInfo(f176240c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65090bk();
            case 4:
                return new C65089bj();
            case 5:
                return f176240c;
            case 6:
                C63010eb ebVar = f176241d;
                if (ebVar == null) {
                    synchronized (C65090bk.class) {
                        ebVar = f176241d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176240c);
                            f176241d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
