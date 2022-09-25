package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ax */
/* compiled from: PG */
public final class C14213ax extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14213ax f42997c;

    /* renamed from: e */
    private static volatile C63010eb f42998e;

    /* renamed from: a */
    public int f42999a;

    /* renamed from: b */
    public C53435nu f43000b;

    /* renamed from: d */
    private byte f43001d = 2;

    static {
        C14213ax axVar = new C14213ax();
        f42997c = axVar;
        C62942bv.registerDefaultInstance(C14213ax.class, axVar);
    }

    private C14213ax() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43001d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43001d = b;
                return null;
            case 2:
                return newMessageInfo(f42997c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001\f\u0002Љ", new Object[]{"a", "b"});
            case 3:
                return new C14213ax();
            case 4:
                return new C14211av();
            case 5:
                return f42997c;
            case 6:
                C63010eb ebVar = f42998e;
                if (ebVar == null) {
                    synchronized (C14213ax.class) {
                        ebVar = f42998e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42997c);
                            f42998e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
