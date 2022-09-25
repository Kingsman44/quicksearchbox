package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aan */
/* compiled from: PG */
public final class aan extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final aan f128708o;

    /* renamed from: p */
    private static volatile C63010eb f128709p;

    /* renamed from: a */
    public int f128710a;

    /* renamed from: b */
    public int f128711b;

    /* renamed from: c */
    public String f128712c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f128713d;

    /* renamed from: e */
    public String f128714e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f128715f;

    /* renamed from: g */
    public String f128716g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f128717h;

    /* renamed from: i */
    public String f128718i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public boolean f128719j;

    /* renamed from: k */
    public C50500zj f128720k;

    /* renamed from: l */
    public boolean f128721l;

    /* renamed from: m */
    public boolean f128722m;

    /* renamed from: n */
    public abt f128723n;

    static {
        aan aan = new aan();
        f128708o = aan;
        C62942bv.registerDefaultInstance(aan.class, aan);
    }

    private aan() {
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
                return newMessageInfo(f128708o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004ဌ\u0004\u0005ဈ\u0005\u0006ဇ\u0006\bဈ\u0007\tဉ\t\nဇ\n\u000bဇ\b\fဇ\u000b\rဉ\f\u000eဂ\u0002", new Object[]{"a", "b", aam.f128707a, C45240c.f118157a, "e", C10662f.f35572a, abr.m85722b(), C30325g.f82003a, C19618h.f54585a, "i", C19621k.f54601a, "l", "j", "m", C48004n.f124238a, "d"});
            case 3:
                return new aan();
            case 4:
                return new aal();
            case 5:
                return f128708o;
            case 6:
                C63010eb ebVar = f128709p;
                if (ebVar == null) {
                    synchronized (aan.class) {
                        ebVar = f128709p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128708o);
                            f128709p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
