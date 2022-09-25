package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.recognizer.p5233a.C67438ag;

/* renamed from: com.google.speech.h.bl */
/* compiled from: PG */
public final class C66586bl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66586bl f181121c;

    /* renamed from: d */
    public static final C62940bt f181122d;

    /* renamed from: f */
    private static volatile C63010eb f181123f;

    /* renamed from: a */
    public int f181124a;

    /* renamed from: b */
    public C67438ag f181125b;

    /* renamed from: e */
    private byte f181126e = 2;

    static {
        C66586bl blVar = new C66586bl();
        f181121c = blVar;
        C62942bv.registerDefaultInstance(C66586bl.class, blVar);
        f181122d = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, blVar, blVar, (C62958ce) null, 197069864, C63066gd.MESSAGE, C66586bl.class);
    }

    private C66586bl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181126e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181126e = b;
                return null;
            case 2:
                return newMessageInfo(f181121c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66586bl();
            case 4:
                return new C66585bk();
            case 5:
                return f181121c;
            case 6:
                C63010eb ebVar = f181123f;
                if (ebVar == null) {
                    synchronized (C66586bl.class) {
                        ebVar = f181123f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181121c);
                            f181123f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
