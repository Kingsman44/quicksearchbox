package com.google.assistant.p3861at;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.vg */
/* compiled from: PG */
public final class C50389vg extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C50389vg f131154g;

    /* renamed from: h */
    private static volatile C63010eb f131155h;

    /* renamed from: a */
    public int f131156a;

    /* renamed from: b */
    public int f131157b = 1;

    /* renamed from: c */
    public C50395vm f131158c;

    /* renamed from: d */
    public boolean f131159d;

    /* renamed from: e */
    public boolean f131160e;

    /* renamed from: f */
    public C50457xu f131161f;

    static {
        C50389vg vgVar = new C50389vg();
        f131154g = vgVar;
        C62942bv.registerDefaultInstance(C50389vg.class, vgVar);
    }

    private C50389vg() {
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
                return newMessageInfo(f131154g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဉ\u0005\u0005ဇ\u0004", new Object[]{"a", "b", C50386vd.f131153a, C45240c.f118157a, "d", C10662f.f35572a, "e"});
            case 3:
                return new C50389vg();
            case 4:
                return new C50388vf();
            case 5:
                return f131154g;
            case 6:
                C63010eb ebVar = f131155h;
                if (ebVar == null) {
                    synchronized (C50389vg.class) {
                        ebVar = f131155h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131154g);
                            f131155h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
