package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aqk */
/* compiled from: PG */
public final class aqk extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aqk f159753e;

    /* renamed from: g */
    private static volatile C63010eb f159754g;

    /* renamed from: a */
    public int f159755a;

    /* renamed from: b */
    public String f159756b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f159757c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public float f159758d;

    /* renamed from: f */
    private C62995dn f159759f = C62995dn.f170057a;

    static {
        aqk aqk = new aqk();
        f159753e = aqk;
        C62942bv.registerDefaultInstance(aqk.class, aqk);
    }

    private aqk() {
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
                return newMessageInfo(f159753e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u00052", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, aqj.f159752a});
            case 3:
                return new aqk();
            case 4:
                return new aqi();
            case 5:
                return f159753e;
            case 6:
                C63010eb ebVar = f159754g;
                if (ebVar == null) {
                    synchronized (aqk.class) {
                        ebVar = f159754g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159753e);
                            f159754g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
