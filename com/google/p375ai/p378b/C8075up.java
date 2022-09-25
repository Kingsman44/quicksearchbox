package com.google.p375ai.p378b;

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

/* renamed from: com.google.ai.b.up */
/* compiled from: PG */
public final class C8075up extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C8075up f28418l;

    /* renamed from: m */
    private static volatile C63010eb f28419m;

    /* renamed from: a */
    public int f28420a;

    /* renamed from: b */
    public int f28421b;

    /* renamed from: c */
    public int f28422c;

    /* renamed from: d */
    public int f28423d;

    /* renamed from: e */
    public String f28424e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f28425f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f28426g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f28427h = 2;

    /* renamed from: i */
    public String f28428i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public int f28429j;

    /* renamed from: k */
    public int f28430k;

    static {
        C8075up upVar = new C8075up();
        f28418l = upVar;
        C62942bv.registerDefaultInstance(C8075up.class, upVar);
    }

    private C8075up() {
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
                return newMessageInfo(f28418l, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0006ဌ\u0002\u0007ဈ\u0005\bဌ\u0006\tဈ\u0007\u000eင\u000b\u000fင\f", new Object[]{"a", "b", C7681g.m22803b(), C45240c.f118157a, C7681g.m22803b(), "e", C10662f.f35572a, "d", C7681g.m22803b(), C30325g.f82003a, C19618h.f54585a, C8074uo.m22932b(), "i", "j", C19621k.f54601a});
            case 3:
                return new C8075up();
            case 4:
                return new C8072um();
            case 5:
                return f28418l;
            case 6:
                C63010eb ebVar = f28419m;
                if (ebVar == null) {
                    synchronized (C8075up.class) {
                        ebVar = f28419m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28418l);
                            f28419m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
