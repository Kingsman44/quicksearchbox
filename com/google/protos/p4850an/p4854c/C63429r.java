package com.google.protos.p4850an.p4854c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4850an.C63352aw;

/* renamed from: com.google.protos.an.c.r */
/* compiled from: PG */
public final class C63429r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63429r f171415b;

    /* renamed from: c */
    public static final C62940bt f171416c;

    /* renamed from: h */
    private static volatile C63010eb f171417h;

    /* renamed from: a */
    public C63408ai f171418a;

    /* renamed from: d */
    private int f171419d;

    /* renamed from: e */
    private C63408ai f171420e;

    /* renamed from: f */
    private C63425n f171421f;

    /* renamed from: g */
    private byte f171422g = 2;

    static {
        C63429r rVar = new C63429r();
        f171415b = rVar;
        C62942bv.registerDefaultInstance(C63429r.class, rVar);
        f171416c = C62942bv.newSingularGeneratedExtension(C63352aw.f171196a, rVar, rVar, (C62958ce) null, 50114969, C63066gd.MESSAGE, C63429r.class);
    }

    private C63429r() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171422g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171422g = b;
                return null;
            case 2:
                return newMessageInfo(f171415b, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\bᐉ\u0005", new Object[]{"d", "e", "a", C10662f.f35572a});
            case 3:
                return new C63429r();
            case 4:
                return new C63428q();
            case 5:
                return f171415b;
            case 6:
                C63010eb ebVar = f171417h;
                if (ebVar == null) {
                    synchronized (C63429r.class) {
                        ebVar = f171417h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171415b);
                            f171417h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
