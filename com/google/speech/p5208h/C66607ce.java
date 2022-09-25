package com.google.speech.p5208h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.h.ce */
/* compiled from: PG */
public final class C66607ce extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C66607ce f181191f;

    /* renamed from: h */
    private static volatile C63010eb f181192h;

    /* renamed from: a */
    public int f181193a;

    /* renamed from: b */
    public String f181194b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f181195c = true;

    /* renamed from: d */
    public boolean f181196d;

    /* renamed from: e */
    public boolean f181197e;

    /* renamed from: g */
    private byte f181198g = 2;

    static {
        C66607ce ceVar = new C66607ce();
        f181191f = ceVar;
        C62942bv.registerDefaultInstance(C66607ce.class, ceVar);
    }

    private C66607ce() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181198g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181198g = b;
                return null;
            case 2:
                return newMessageInfo(f181191f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0003\u0004ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", "d"});
            case 3:
                return new C66607ce();
            case 4:
                return new C66606cd();
            case 5:
                return f181191f;
            case 6:
                C63010eb ebVar = f181192h;
                if (ebVar == null) {
                    synchronized (C66607ce.class) {
                        ebVar = f181192h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181191f);
                            f181192h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
