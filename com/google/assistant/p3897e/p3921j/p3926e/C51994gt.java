package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.e.gt */
/* compiled from: PG */
public final class C51994gt extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C51994gt f136465g;

    /* renamed from: h */
    private static volatile C63010eb f136466h;

    /* renamed from: a */
    public int f136467a;

    /* renamed from: b */
    public boolean f136468b;

    /* renamed from: c */
    public String f136469c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63088z f136470d = C63088z.f170246b;

    /* renamed from: e */
    public boolean f136471e;

    /* renamed from: f */
    public boolean f136472f;

    static {
        C51994gt gtVar = new C51994gt();
        f136465g = gtVar;
        C62942bv.registerDefaultInstance(C51994gt.class, gtVar);
    }

    private C51994gt() {
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
                return newMessageInfo(f136465g, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဈ\u0001\u0004ည\u0003\u0006ဇ\u0004\bဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C51994gt();
            case 4:
                return new C51993gs();
            case 5:
                return f136465g;
            case 6:
                C63010eb ebVar = f136466h;
                if (ebVar == null) {
                    synchronized (C51994gt.class) {
                        ebVar = f136466h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136465g);
                            f136466h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
