package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.fz */
/* compiled from: PG */
public final class C55103fz extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55103fz f144995f;

    /* renamed from: g */
    private static volatile C63010eb f144996g;

    /* renamed from: a */
    public int f144997a;

    /* renamed from: b */
    public String f144998b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f144999c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f145000d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f145001e = BuildConfig.FLAVOR;

    static {
        C55103fz fzVar = new C55103fz();
        f144995f = fzVar;
        C62942bv.registerDefaultInstance(C55103fz.class, fzVar);
    }

    private C55103fz() {
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
                return newMessageInfo(f144995f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C55103fz();
            case 4:
                return new C55102fy();
            case 5:
                return f144995f;
            case 6:
                C63010eb ebVar = f144996g;
                if (ebVar == null) {
                    synchronized (C55103fz.class) {
                        ebVar = f144996g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144995f);
                            f144996g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
