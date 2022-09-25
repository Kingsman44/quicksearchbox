package com.google.common.p4552o;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.ajg */
/* compiled from: PG */
public final class ajg extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final ajg f158865g;

    /* renamed from: h */
    public static final C62940bt f158866h;

    /* renamed from: i */
    private static volatile C63010eb f158867i;

    /* renamed from: a */
    public int f158868a;

    /* renamed from: b */
    public int f158869b;

    /* renamed from: c */
    public int f158870c;

    /* renamed from: d */
    public int f158871d;

    /* renamed from: e */
    public int f158872e;

    /* renamed from: f */
    public aiz f158873f;

    static {
        ajg ajg = new ajg();
        f158865g = ajg;
        C62942bv.registerDefaultInstance(ajg.class, ajg);
        f158866h = C62942bv.newSingularGeneratedExtension(aqs.f159780k, ajg, ajg, (C62958ce) null, 296, C63066gd.MESSAGE, ajg.class);
    }

    private ajg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f158865g, "\u0001\u0005\u0000\u0001\u0005\u000b\u0005\u0000\u0000\u0000\u0005ဌ\u0004\u0006ဌ\u0005\bဌ\b\tဌ\t\u000bဉ\n", new Object[]{"a", "b", ajf.f158864a, C45240c.f118157a, ajd.f158863a, "d", aja.f158861a, "e", ajc.f158862a, C10662f.f35572a});
            case 3:
                return new ajg();
            case 4:
                return new ajb();
            case 5:
                return f158865g;
            case 6:
                C63010eb ebVar = f158867i;
                if (ebVar == null) {
                    synchronized (ajg.class) {
                        ebVar = f158867i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158865g);
                            f158867i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
