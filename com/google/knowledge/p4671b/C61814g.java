package com.google.knowledge.p4671b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.b.g */
/* compiled from: PG */
public final class C61814g extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C61814g f166984j;

    /* renamed from: k */
    private static volatile C63010eb f166985k;

    /* renamed from: a */
    public int f166986a;

    /* renamed from: b */
    public String f166987b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f166988c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f166989d;

    /* renamed from: e */
    public long f166990e;

    /* renamed from: f */
    public String f166991f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f166992g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C61816i f166993h;

    /* renamed from: i */
    public C62995dn f166994i = C62995dn.f170057a;

    static {
        C61814g gVar = new C61814g();
        f166984j = gVar;
        C62942bv.registerDefaultInstance(C61814g.class, gVar);
    }

    private C61814g() {
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
                return newMessageInfo(f166984j, "\u0001\b\u0000\u0001\u0001\f\b\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0003\u0003ဈ\u0004\u0004ဈ\u0005\u0006ဉ\u0007\n2\u000bဈ\u0001\fဇ\u0002", new Object[]{"a", "b", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C61813f.f166983a, C45240c.f118157a, "d"});
            case 3:
                return new C61814g();
            case 4:
                return new C61812e();
            case 5:
                return f166984j;
            case 6:
                C63010eb ebVar = f166985k;
                if (ebVar == null) {
                    synchronized (C61814g.class) {
                        ebVar = f166985k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166984j);
                            f166985k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
