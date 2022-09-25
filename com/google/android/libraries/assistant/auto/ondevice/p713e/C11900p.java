package com.google.android.libraries.assistant.auto.ondevice.p713e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.e.p */
/* compiled from: PG */
public final class C11900p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C11900p f38273b;

    /* renamed from: d */
    private static volatile C63010eb f38274d;

    /* renamed from: a */
    public C62971cq f38275a = emptyProtobufList();

    /* renamed from: c */
    private byte f38276c = 2;

    static {
        C11900p pVar = new C11900p();
        f38273b = pVar;
        C62942bv.registerDefaultInstance(C11900p.class, pVar);
    }

    private C11900p() {
    }

    /* renamed from: a */
    public final void mo20292a() {
        C62971cq cqVar = this.f38275a;
        if (!cqVar.mo58948c()) {
            this.f38275a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f38276c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f38276c = b;
                return null;
            case 2:
                return newMessageInfo(f38273b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C11889e.class});
            case 3:
                return new C11900p();
            case 4:
                return new C11899o();
            case 5:
                return f38273b;
            case 6:
                C63010eb ebVar = f38274d;
                if (ebVar == null) {
                    synchronized (C11900p.class) {
                        ebVar = f38274d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38273b);
                            f38274d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
