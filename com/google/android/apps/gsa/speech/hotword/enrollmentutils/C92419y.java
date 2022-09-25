package com.google.android.apps.gsa.speech.hotword.enrollmentutils;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C67139mm;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.y */
/* compiled from: PG */
public final class C92419y extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C92419y f257739e;

    /* renamed from: g */
    private static volatile C63010eb f257740g;

    /* renamed from: a */
    public int f257741a;

    /* renamed from: b */
    public boolean f257742b;

    /* renamed from: c */
    public boolean f257743c;

    /* renamed from: d */
    public C67139mm f257744d;

    /* renamed from: f */
    private byte f257745f = 2;

    static {
        C92419y yVar = new C92419y();
        f257739e = yVar;
        C62942bv.registerDefaultInstance(C92419y.class, yVar);
    }

    private C92419y() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f257745f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f257745f = b;
                return null;
            case 2:
                return newMessageInfo(f257739e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C92419y();
            case 4:
                return new C92418x();
            case 5:
                return f257739e;
            case 6:
                C63010eb ebVar = f257740g;
                if (ebVar == null) {
                    synchronized (C92419y.class) {
                        ebVar = f257740g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f257739e);
                            f257740g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
