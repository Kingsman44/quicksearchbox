package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b;

import com.google.assistant.p3897e.p3921j.C52434rp;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.j */
/* compiled from: PG */
public final class C12737j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f39848c = new C12734g();

    /* renamed from: e */
    public static final C62962ci f39849e = new C12735h();

    /* renamed from: f */
    public static final C12737j f39850f;

    /* renamed from: g */
    private static volatile C63010eb f39851g;

    /* renamed from: a */
    public C62971cq f39852a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62961ch f39853b = emptyIntList();

    /* renamed from: d */
    public C62961ch f39854d = emptyIntList();

    static {
        C12737j jVar = new C12737j();
        f39850f = jVar;
        C62942bv.registerDefaultInstance(C12737j.class, jVar);
    }

    private C12737j() {
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
                return newMessageInfo(f39850f, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u001e\u0003,", new Object[]{"a", "b", C55912b.m87802b(), "d", C52434rp.m86631b()});
            case 3:
                return new C12737j();
            case 4:
                return new C12736i();
            case 5:
                return f39850f;
            case 6:
                C63010eb ebVar = f39851g;
                if (ebVar == null) {
                    synchronized (C12737j.class) {
                        ebVar = f39851g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f39850f);
                            f39851g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
