package com.google.android.apps.gsa.shared.p6974ae;

import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7682ga;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.ae.i */
/* compiled from: PG */
public final class C89100i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C89100i f241524c;

    /* renamed from: f */
    private static volatile C63010eb f241525f;

    /* renamed from: a */
    public C7669fo f241526a;

    /* renamed from: b */
    public C7682ga f241527b;

    /* renamed from: d */
    private int f241528d;

    /* renamed from: e */
    private byte f241529e = 2;

    static {
        C89100i iVar = new C89100i();
        f241524c = iVar;
        C62942bv.registerDefaultInstance(C89100i.class, iVar);
    }

    private C89100i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f241529e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f241529e = b;
                return null;
            case 2:
                return newMessageInfo(f241524c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C89100i();
            case 4:
                return new C89099h();
            case 5:
                return f241524c;
            case 6:
                C63010eb ebVar = f241525f;
                if (ebVar == null) {
                    synchronized (C89100i.class) {
                        ebVar = f241525f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241524c);
                            f241525f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
