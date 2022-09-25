package com.google.android.libraries.lens.view.p2069am;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.at */
/* compiled from: PG */
public final class C25312at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C25312at f68870c;

    /* renamed from: e */
    private static volatile C63010eb f68871e;

    /* renamed from: a */
    public C25310ar f68872a;

    /* renamed from: b */
    public boolean f68873b;

    /* renamed from: d */
    private byte f68874d = 2;

    static {
        C25312at atVar = new C25312at();
        f68870c = atVar;
        C62942bv.registerDefaultInstance(C25312at.class, atVar);
    }

    private C25312at() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f68874d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f68874d = b;
                return null;
            case 2:
                return newMessageInfo(f68870c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C25312at();
            case 4:
                return new C25311as();
            case 5:
                return f68870c;
            case 6:
                C63010eb ebVar = f68871e;
                if (ebVar == null) {
                    synchronized (C25312at.class) {
                        ebVar = f68871e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68870c);
                            f68871e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
