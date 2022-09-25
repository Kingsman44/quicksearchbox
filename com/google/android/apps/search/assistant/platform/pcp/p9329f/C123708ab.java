package com.google.android.apps.search.assistant.platform.pcp.p9329f;

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

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.ab */
/* compiled from: PG */
public final class C123708ab extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C123708ab f341685n;

    /* renamed from: o */
    private static volatile C63010eb f341686o;

    /* renamed from: a */
    public int f341687a;

    /* renamed from: b */
    public String f341688b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f341689c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C123707aa f341690d;

    /* renamed from: e */
    public int f341691e;

    /* renamed from: f */
    public long f341692f;

    /* renamed from: g */
    public long f341693g;

    /* renamed from: h */
    public long f341694h;

    /* renamed from: i */
    public long f341695i;

    /* renamed from: j */
    public String f341696j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public long f341697k;

    /* renamed from: l */
    public boolean f341698l;

    /* renamed from: m */
    public boolean f341699m;

    static {
        C123708ab abVar = new C123708ab();
        f341685n = abVar;
        C62942bv.registerDefaultInstance(C123708ab.class, abVar);
    }

    private C123708ab() {
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
                return newMessageInfo(f341685n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\b\bဂ\u0006\tဂ\u0007\nဂ\t\u000bဇ\n\fဇ\u000b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C123795x.f341989a, C10662f.f35572a, C30325g.f82003a, "j", C19618h.f54585a, "i", C19621k.f54601a, "l", "m"});
            case 3:
                return new C123708ab();
            case 4:
                return new C123794w();
            case 5:
                return f341685n;
            case 6:
                C63010eb ebVar = f341686o;
                if (ebVar == null) {
                    synchronized (C123708ab.class) {
                        ebVar = f341686o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341685n);
                            f341686o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
