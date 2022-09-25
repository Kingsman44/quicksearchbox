package com.google.android.libraries.assistant.p1467d.p1472c.p1474b;

import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17909k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.b.i */
/* compiled from: PG */
public final class C17869i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17869i f51204c;

    /* renamed from: e */
    private static volatile C63010eb f51205e;

    /* renamed from: a */
    public int f51206a;

    /* renamed from: b */
    public C17909k f51207b;

    /* renamed from: d */
    private byte f51208d = 2;

    static {
        C17869i iVar = new C17869i();
        f51204c = iVar;
        C62942bv.registerDefaultInstance(C17869i.class, iVar);
    }

    private C17869i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f51208d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f51208d = b;
                return null;
            case 2:
                return newMessageInfo(f51204c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C17869i();
            case 4:
                return new C17868h();
            case 5:
                return f51204c;
            case 6:
                C63010eb ebVar = f51205e;
                if (ebVar == null) {
                    synchronized (C17869i.class) {
                        ebVar = f51205e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51204c);
                            f51205e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
