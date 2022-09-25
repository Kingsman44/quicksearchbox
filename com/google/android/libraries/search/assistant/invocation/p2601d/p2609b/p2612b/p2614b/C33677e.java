package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.p2904c.C37454cc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.b.e */
/* compiled from: PG */
public final class C33677e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33677e f89987c;

    /* renamed from: e */
    private static volatile C63010eb f89988e;

    /* renamed from: a */
    public C34053bp f89989a;

    /* renamed from: b */
    public C37454cc f89990b;

    /* renamed from: d */
    private byte f89991d = 2;

    static {
        C33677e eVar = new C33677e();
        f89987c = eVar;
        C62942bv.registerDefaultInstance(C33677e.class, eVar);
    }

    private C33677e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f89991d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f89991d = b;
                return null;
            case 2:
                return newMessageInfo(f89987c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C33677e();
            case 4:
                return new C33676d();
            case 5:
                return f89987c;
            case 6:
                C63010eb ebVar = f89988e;
                if (ebVar == null) {
                    synchronized (C33677e.class) {
                        ebVar = f89988e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89987c);
                            f89988e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
