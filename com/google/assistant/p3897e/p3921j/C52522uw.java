package com.google.assistant.p3897e.p3921j;

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
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.uw */
/* compiled from: PG */
public final class C52522uw extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C52522uw f137864j;

    /* renamed from: k */
    private static volatile C63010eb f137865k;

    /* renamed from: a */
    public int f137866a;

    /* renamed from: b */
    public int f137867b;

    /* renamed from: c */
    public String f137868c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f137869d;

    /* renamed from: e */
    public String f137870e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f137871f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C63088z f137872g = C63088z.f170246b;

    /* renamed from: h */
    public int f137873h;

    /* renamed from: i */
    public int f137874i;

    static {
        C52522uw uwVar = new C52522uw();
        f137864j = uwVar;
        C62942bv.registerDefaultInstance(C52522uw.class, uwVar);
    }

    private C52522uw() {
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
                return newMessageInfo(f137864j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ည\u0005\u0007င\u0006\bဌ\u0007", new Object[]{"a", "b", C52521uv.f137863a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C52519ut.f137862a});
            case 3:
                return new C52522uw();
            case 4:
                return new C52518us();
            case 5:
                return f137864j;
            case 6:
                C63010eb ebVar = f137865k;
                if (ebVar == null) {
                    synchronized (C52522uw.class) {
                        ebVar = f137865k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137864j);
                            f137865k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
