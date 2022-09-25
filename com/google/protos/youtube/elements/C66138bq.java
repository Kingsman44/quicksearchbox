package com.google.protos.youtube.elements;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.bq */
/* compiled from: PG */
public final class C66138bq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66138bq f179845d;

    /* renamed from: e */
    public static final C62940bt f179846e;

    /* renamed from: g */
    private static volatile C63010eb f179847g;

    /* renamed from: a */
    public int f179848a;

    /* renamed from: b */
    public float f179849b;

    /* renamed from: c */
    public CommandOuterClass$Command f179850c;

    /* renamed from: f */
    private byte f179851f = 2;

    static {
        C66138bq bqVar = new C66138bq();
        f179845d = bqVar;
        C62942bv.registerDefaultInstance(C66138bq.class, bqVar);
        f179846e = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bqVar, bqVar, (C62958ce) null, 182590845, C63066gd.MESSAGE, C66138bq.class);
    }

    private C66138bq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179851f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179851f = b;
                return null;
            case 2:
                return newMessageInfo(f179845d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ခ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66138bq();
            case 4:
                return new C66137bp();
            case 5:
                return f179845d;
            case 6:
                C63010eb ebVar = f179847g;
                if (ebVar == null) {
                    synchronized (C66138bq.class) {
                        ebVar = f179847g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179845d);
                            f179847g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
