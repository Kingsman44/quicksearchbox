package com.google.android.libraries.search.p3055n;

import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.libraries.search.n.aj */
/* compiled from: PG */
public final class C39260aj extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C39260aj f103414f;

    /* renamed from: g */
    public static final C62940bt f103415g;

    /* renamed from: h */
    private static volatile C63010eb f103416h;

    /* renamed from: a */
    public int f103417a;

    /* renamed from: b */
    public C37462ck f103418b;

    /* renamed from: c */
    public C39277b f103419c;

    /* renamed from: d */
    public C67050je f103420d;

    /* renamed from: e */
    public C62910ar f103421e;

    static {
        C39260aj ajVar = new C39260aj();
        f103414f = ajVar;
        C62942bv.registerDefaultInstance(C39260aj.class, ajVar);
        f103415g = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, ajVar, ajVar, (C62958ce) null, 334865978, C63066gd.MESSAGE, C39260aj.class);
    }

    private C39260aj() {
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
                return newMessageInfo(f103414f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C39260aj();
            case 4:
                return new C39259ai();
            case 5:
                return f103414f;
            case 6:
                C63010eb ebVar = f103416h;
                if (ebVar == null) {
                    synchronized (C39260aj.class) {
                        ebVar = f103416h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103414f);
                            f103416h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
