package com.google.assistant.p3886c;

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
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.c.p */
/* compiled from: PG */
public final class C50844p extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C50844p f132387m;

    /* renamed from: n */
    private static volatile C63010eb f132388n;

    /* renamed from: a */
    public int f132389a;

    /* renamed from: b */
    public String f132390b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f132391c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63088z f132392d = C63088z.f170246b;

    /* renamed from: e */
    public C63088z f132393e = C63088z.f170246b;

    /* renamed from: f */
    public String f132394f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public long f132395g;

    /* renamed from: h */
    public long f132396h;

    /* renamed from: i */
    public long f132397i;

    /* renamed from: j */
    public long f132398j;

    /* renamed from: k */
    public long f132399k;

    /* renamed from: l */
    public long f132400l;

    static {
        C50844p pVar = new C50844p();
        f132387m = pVar;
        C62942bv.registerDefaultInstance(C50844p.class, pVar);
    }

    private C50844p() {
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
                return newMessageInfo(f132387m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l"});
            case 3:
                return new C50844p();
            case 4:
                return new C50843o();
            case 5:
                return f132387m;
            case 6:
                C63010eb ebVar = f132388n;
                if (ebVar == null) {
                    synchronized (C50844p.class) {
                        ebVar = f132388n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132387m);
                            f132388n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
