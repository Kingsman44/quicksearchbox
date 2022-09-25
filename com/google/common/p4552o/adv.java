package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.adv */
/* compiled from: PG */
public final class adv extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final adv f158410l;

    /* renamed from: m */
    private static volatile C63010eb f158411m;

    /* renamed from: a */
    public int f158412a;

    /* renamed from: b */
    public String f158413b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f158414c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f158415d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f158416e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public long f158417f;

    /* renamed from: g */
    public String f158418g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f158419h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f158420i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public long f158421j;

    /* renamed from: k */
    public long f158422k;

    static {
        adv adv = new adv();
        f158410l = adv;
        C62942bv.registerDefaultInstance(adv.class, adv);
    }

    private adv() {
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
                return newMessageInfo(f158410l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဂ\b\nဂ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new adv();
            case 4:
                return new adu();
            case 5:
                return f158410l;
            case 6:
                C63010eb ebVar = f158411m;
                if (ebVar == null) {
                    synchronized (adv.class) {
                        ebVar = f158411m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158410l);
                            f158411m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
