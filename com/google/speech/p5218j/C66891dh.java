package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.j.dh */
/* compiled from: PG */
public final class C66891dh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66891dh f181852c;

    /* renamed from: d */
    public static final C62940bt f181853d;

    /* renamed from: f */
    private static volatile C63010eb f181854f;

    /* renamed from: a */
    public int f181855a;

    /* renamed from: b */
    public C66999hh f181856b;

    /* renamed from: e */
    private byte f181857e = 2;

    static {
        C66891dh dhVar = new C66891dh();
        f181852c = dhVar;
        C62942bv.registerDefaultInstance(C66891dh.class, dhVar);
        f181853d = C62942bv.newSingularGeneratedExtension(C67105lf.f182433a, dhVar, dhVar, (C62958ce) null, 338581246, C63066gd.MESSAGE, C66891dh.class);
    }

    private C66891dh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181857e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181857e = b;
                return null;
            case 2:
                return newMessageInfo(f181852c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66891dh();
            case 4:
                return new C66890dg();
            case 5:
                return f181852c;
            case 6:
                C63010eb ebVar = f181854f;
                if (ebVar == null) {
                    synchronized (C66891dh.class) {
                        ebVar = f181854f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181852c);
                            f181854f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
