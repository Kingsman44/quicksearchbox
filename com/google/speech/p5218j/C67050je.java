package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.je */
/* compiled from: PG */
public final class C67050je extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C67050je f182262f;

    /* renamed from: g */
    private static volatile C63010eb f182263g;

    /* renamed from: a */
    public int f182264a;

    /* renamed from: b */
    public C67048jc f182265b;

    /* renamed from: c */
    public C67073ka f182266c;

    /* renamed from: d */
    public C67091ks f182267d;

    /* renamed from: e */
    public C67052jg f182268e;

    static {
        C67050je jeVar = new C67050je();
        f182262f = jeVar;
        C62942bv.registerDefaultInstance(C67050je.class, jeVar);
    }

    private C67050je() {
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
                return newMessageInfo(f182262f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C67050je();
            case 4:
                return new C67049jd();
            case 5:
                return f182262f;
            case 6:
                C63010eb ebVar = f182263g;
                if (ebVar == null) {
                    synchronized (C67050je.class) {
                        ebVar = f182263g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182262f);
                            f182263g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
