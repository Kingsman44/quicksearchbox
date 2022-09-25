package com.google.android.libraries.assistant.auto.ondevice.p713e;

import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.assistant.p3745ab.C48292ct;
import com.google.p5277z.p5281b.C67987h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.e.e */
/* compiled from: PG */
public final class C11889e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C11889e f38250c;

    /* renamed from: e */
    private static volatile C63010eb f38251e;

    /* renamed from: a */
    public int f38252a = 0;

    /* renamed from: b */
    public Object f38253b;

    /* renamed from: d */
    private byte f38254d = 2;

    static {
        C11889e eVar = new C11889e();
        f38250c = eVar;
        C62942bv.registerDefaultInstance(C11889e.class, eVar);
    }

    private C11889e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f38254d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f38254d = b;
                return null;
            case 2:
                return newMessageInfo(f38250c, "\u0001\f\u0001\u0000\u0001\r\f\u0000\u0000\u0001\u0001ျ\u0000\u0002ျ\u0000\u0004ဿ\u0000\u0005ျ\u0000\u0006့\u0000\u0007ျ\u0000\bဿ\u0000\t်\u0000\nျ\u0000\u000b့\u0000\fဿ\u0000\rᐼ\u0000", new Object[]{"b", "a", C48292ct.m85217b(), C11887c.f38249a, C67987h.f184224a, C19088t.class});
            case 3:
                return new C11889e();
            case 4:
                return new C11885a();
            case 5:
                return f38250c;
            case 6:
                C63010eb ebVar = f38251e;
                if (ebVar == null) {
                    synchronized (C11889e.class) {
                        ebVar = f38251e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38250c);
                            f38251e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
