package com.google.knowledge.p4682d.p4683a.p4684a.p4685a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.d.a.a.a.b */
/* compiled from: PG */
public final class C61986b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C61986b f167521b;

    /* renamed from: c */
    private static volatile C63010eb f167522c;

    /* renamed from: a */
    public C61988d f167523a;

    static {
        C61986b bVar = new C61986b();
        f167521b = bVar;
        C62942bv.registerDefaultInstance(C61986b.class, bVar);
    }

    private C61986b() {
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
                return newMessageInfo(f167521b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C61986b();
            case 4:
                return new C61985a();
            case 5:
                return f167521b;
            case 6:
                C63010eb ebVar = f167522c;
                if (ebVar == null) {
                    synchronized (C61986b.class) {
                        ebVar = f167522c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167521b);
                            f167522c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
