package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.kl */
/* compiled from: PG */
public final class C60092kl extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C60092kl f162479k;

    /* renamed from: l */
    private static volatile C63010eb f162480l;

    /* renamed from: a */
    public int f162481a;

    /* renamed from: b */
    public String f162482b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f162483c;

    /* renamed from: d */
    public long f162484d;

    /* renamed from: e */
    public C60059jh f162485e;

    /* renamed from: f */
    public String f162486f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C60089ki f162487g;

    /* renamed from: h */
    public int f162488h;

    /* renamed from: i */
    public int f162489i;

    /* renamed from: j */
    public boolean f162490j;

    static {
        C60092kl klVar = new C60092kl();
        f162479k = klVar;
        C62942bv.registerDefaultInstance(C60092kl.class, klVar);
    }

    private C60092kl() {
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
                return newMessageInfo(f162479k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007င\u0006\bဌ\u0007\tဇ\b", new Object[]{"a", "b", C45240c.f118157a, C60091kk.m92524b(), "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C60299nl.f163137a, "j"});
            case 3:
                return new C60092kl();
            case 4:
                return new C60087kg();
            case 5:
                return f162479k;
            case 6:
                C63010eb ebVar = f162480l;
                if (ebVar == null) {
                    synchronized (C60092kl.class) {
                        ebVar = f162480l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162479k);
                            f162480l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
