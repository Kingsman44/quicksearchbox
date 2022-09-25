package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.fz */
/* compiled from: PG */
public final class C59798fz extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C59798fz f161600i;

    /* renamed from: j */
    private static volatile C63010eb f161601j;

    /* renamed from: a */
    public int f161602a;

    /* renamed from: b */
    public String f161603b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f161604c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f161605d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f161606e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f161607f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public String f161608g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f161609h = BuildConfig.FLAVOR;

    static {
        C59798fz fzVar = new C59798fz();
        f161600i = fzVar;
        C62942bv.registerDefaultInstance(C59798fz.class, fzVar);
    }

    private C59798fz() {
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
                return newMessageInfo(f161600i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005\u001a\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C59798fz();
            case 4:
                return new C59797fy();
            case 5:
                return f161600i;
            case 6:
                C63010eb ebVar = f161601j;
                if (ebVar == null) {
                    synchronized (C59798fz.class) {
                        ebVar = f161601j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161600i);
                            f161601j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
