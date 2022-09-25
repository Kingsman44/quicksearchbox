package com.google.android.libraries.assistant.p1467d.p1472c.p1474b.p1475a;

import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17909k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.b.a.i */
/* compiled from: PG */
public final class C17859i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17859i f51186c;

    /* renamed from: e */
    private static volatile C63010eb f51187e;

    /* renamed from: a */
    public int f51188a;

    /* renamed from: b */
    public C17909k f51189b;

    /* renamed from: d */
    private byte f51190d = 2;

    static {
        C17859i iVar = new C17859i();
        f51186c = iVar;
        C62942bv.registerDefaultInstance(C17859i.class, iVar);
    }

    private C17859i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f51190d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f51190d = b;
                return null;
            case 2:
                return newMessageInfo(f51186c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C17859i();
            case 4:
                return new C17858h();
            case 5:
                return f51186c;
            case 6:
                C63010eb ebVar = f51187e;
                if (ebVar == null) {
                    synchronized (C17859i.class) {
                        ebVar = f51187e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51186c);
                            f51187e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
