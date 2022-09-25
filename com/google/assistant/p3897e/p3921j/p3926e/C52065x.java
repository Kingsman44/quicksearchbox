package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.x */
/* compiled from: PG */
public final class C52065x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52065x f136633a;

    /* renamed from: h */
    private static volatile C63010eb f136634h;

    /* renamed from: b */
    private int f136635b;

    /* renamed from: c */
    private C51016dg f136636c;

    /* renamed from: d */
    private C51016dg f136637d;

    /* renamed from: e */
    private C51016dg f136638e;

    /* renamed from: f */
    private C51016dg f136639f;

    /* renamed from: g */
    private byte f136640g = 2;

    static {
        C52065x xVar = new C52065x();
        f136633a = xVar;
        C62942bv.registerDefaultInstance(C52065x.class, xVar);
    }

    private C52065x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136640g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136640g = b;
                return null;
            case 2:
                return newMessageInfo(f136633a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C52065x();
            case 4:
                return new C52064w();
            case 5:
                return f136633a;
            case 6:
                C63010eb ebVar = f136634h;
                if (ebVar == null) {
                    synchronized (C52065x.class) {
                        ebVar = f136634h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136633a);
                            f136634h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
