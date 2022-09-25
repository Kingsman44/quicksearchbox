package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.afb */
/* compiled from: PG */
public final class afb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final afb f134984e;

    /* renamed from: f */
    private static volatile C63010eb f134985f;

    /* renamed from: a */
    public int f134986a;

    /* renamed from: b */
    public int f134987b;

    /* renamed from: c */
    public String f134988c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f134989d = true;

    static {
        afb afb = new afb();
        f134984e = afb;
        C62942bv.registerDefaultInstance(afb.class, afb);
    }

    private afb() {
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
                return newMessageInfo(f134984e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new afb();
            case 4:
                return new afa();
            case 5:
                return f134984e;
            case 6:
                C63010eb ebVar = f134985f;
                if (ebVar == null) {
                    synchronized (afb.class) {
                        ebVar = f134985f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134984e);
                            f134985f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
