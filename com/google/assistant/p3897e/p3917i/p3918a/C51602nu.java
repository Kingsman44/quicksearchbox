package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.adm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.nu */
/* compiled from: PG */
public final class C51602nu extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51602nu f134484e;

    /* renamed from: f */
    private static volatile C63010eb f134485f;

    /* renamed from: a */
    public int f134486a;

    /* renamed from: b */
    public String f134487b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f134488c;

    /* renamed from: d */
    public adm f134489d;

    static {
        C51602nu nuVar = new C51602nu();
        f134484e = nuVar;
        C62942bv.registerDefaultInstance(C51602nu.class, nuVar);
    }

    private C51602nu() {
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
                return newMessageInfo(f134484e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51602nu();
            case 4:
                return new C51601nt();
            case 5:
                return f134484e;
            case 6:
                C63010eb ebVar = f134485f;
                if (ebVar == null) {
                    synchronized (C51602nu.class) {
                        ebVar = f134485f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134484e);
                            f134485f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
