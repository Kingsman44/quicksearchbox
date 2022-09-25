package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.bz */
/* compiled from: PG */
public final class C66848bz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66848bz f181770c;

    /* renamed from: e */
    private static volatile C63010eb f181771e;

    /* renamed from: a */
    public String f181772a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f181773b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f181774d;

    static {
        C66848bz bzVar = new C66848bz();
        f181770c = bzVar;
        C62942bv.registerDefaultInstance(C66848bz.class, bzVar);
    }

    private C66848bz() {
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
                return newMessageInfo(f181770c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C66848bz();
            case 4:
                return new C66847by();
            case 5:
                return f181770c;
            case 6:
                C63010eb ebVar = f181771e;
                if (ebVar == null) {
                    synchronized (C66848bz.class) {
                        ebVar = f181771e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181770c);
                            f181771e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
