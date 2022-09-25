package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.pw */
/* compiled from: PG */
public final class C14617pw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14617pw f44183c;

    /* renamed from: e */
    private static volatile C63010eb f44184e;

    /* renamed from: a */
    public int f44185a;

    /* renamed from: b */
    public C53435nu f44186b;

    /* renamed from: d */
    private byte f44187d = 2;

    static {
        C14617pw pwVar = new C14617pw();
        f44183c = pwVar;
        C62942bv.registerDefaultInstance(C14617pw.class, pwVar);
    }

    private C14617pw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f44187d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f44187d = b;
                return null;
            case 2:
                return newMessageInfo(f44183c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001\f\u0002Љ", new Object[]{"a", "b"});
            case 3:
                return new C14617pw();
            case 4:
                return new C14616pv();
            case 5:
                return f44183c;
            case 6:
                C63010eb ebVar = f44184e;
                if (ebVar == null) {
                    synchronized (C14617pw.class) {
                        ebVar = f44184e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44183c);
                            f44184e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
