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

/* renamed from: com.google.common.o.ne */
/* compiled from: PG */
public final class C60292ne extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C60292ne f163113l;

    /* renamed from: m */
    private static volatile C63010eb f163114m;

    /* renamed from: a */
    public int f163115a;

    /* renamed from: b */
    public int f163116b;

    /* renamed from: c */
    public String f163117c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f163118d;

    /* renamed from: e */
    public String f163119e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f163120f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f163121g;

    /* renamed from: h */
    public boolean f163122h;

    /* renamed from: i */
    public boolean f163123i;

    /* renamed from: j */
    public String f163124j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f163125k = BuildConfig.FLAVOR;

    static {
        C60292ne neVar = new C60292ne();
        f163113l = neVar;
        C62942bv.registerDefaultInstance(C60292ne.class, neVar);
    }

    private C60292ne() {
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
                return newMessageInfo(f163113l, "\u0001\n\u0000\u0001\u0003\r\n\u0000\u0000\u0000\u0003ဋ\u0002\u0005ဈ\u0004\u0006င\u0005\u0007ဈ\u0006\bဈ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဈ\u000b\rဈ\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C60292ne();
            case 4:
                return new C60291nd();
            case 5:
                return f163113l;
            case 6:
                C63010eb ebVar = f163114m;
                if (ebVar == null) {
                    synchronized (C60292ne.class) {
                        ebVar = f163114m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163113l);
                            f163114m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
