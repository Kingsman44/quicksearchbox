package com.google.speech.p5224k.p5225a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.audio.p4107b.p4108a.C54591n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.speech.k.a.ab */
/* compiled from: PG */
public final class C67184ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67184ab f182603d;

    /* renamed from: e */
    public static final C62940bt f182604e;

    /* renamed from: g */
    private static volatile C63010eb f182605g;

    /* renamed from: a */
    public int f182606a;

    /* renamed from: b */
    public C54591n f182607b;

    /* renamed from: c */
    public String f182608c = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f182609f = 2;

    static {
        C67184ab abVar = new C67184ab();
        f182603d = abVar;
        C62942bv.registerDefaultInstance(C67184ab.class, abVar);
        f182604e = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, abVar, abVar, (C62958ce) null, 35351945, C63066gd.MESSAGE, C67184ab.class);
    }

    private C67184ab() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182609f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182609f = b;
                return null;
            case 2:
                return newMessageInfo(f182603d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67184ab();
            case 4:
                return new C67183aa();
            case 5:
                return f182603d;
            case 6:
                C63010eb ebVar = f182605g;
                if (ebVar == null) {
                    synchronized (C67184ab.class) {
                        ebVar = f182605g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182603d);
                            f182605g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
