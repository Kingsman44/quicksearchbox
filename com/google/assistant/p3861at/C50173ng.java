package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.at.ng */
/* compiled from: PG */
public final class C50173ng extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C50173ng f130419k;

    /* renamed from: n */
    private static volatile C63010eb f130420n;

    /* renamed from: a */
    public int f130421a;

    /* renamed from: b */
    public String f130422b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130423c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f130424d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public String f130425e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f130426f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C50181no f130427g;

    /* renamed from: h */
    public boolean f130428h;

    /* renamed from: i */
    public String f130429i;

    /* renamed from: j */
    public C62971cq f130430j;

    /* renamed from: l */
    private C50185ns f130431l;

    /* renamed from: m */
    private C62995dn f130432m = C62995dn.f170057a;

    static {
        C50173ng ngVar = new C50173ng();
        f130419k = ngVar;
        C62942bv.registerDefaultInstance(C50173ng.class, ngVar);
    }

    private C50173ng() {
        C62942bv.emptyProtobufList();
        this.f130429i = BuildConfig.FLAVOR;
        this.f130430j = C62942bv.emptyProtobufList();
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
                return newMessageInfo(f130419k, "\u0001\u000b\u0000\u0001\u0001\u0015\u000b\u0001\u0002\u0000\u0001ဈ\u0000\u0003ဈ\u0004\u0006ဉ\u0007\bဉ\t\u000bဈ\u0003\f\u001a\rဈ\u0001\u000eဇ\u000b\u0010ဈ\f\u0012\u001a\u00152", new Object[]{"a", "b", C10662f.f35572a, "l", C30325g.f82003a, "e", "d", C45240c.f118157a, C19618h.f54585a, "i", "j", "m", C50172nf.f130418a});
            case 3:
                return new C50173ng();
            case 4:
                return new C50169nc();
            case 5:
                return f130419k;
            case 6:
                C63010eb ebVar = f130420n;
                if (ebVar == null) {
                    synchronized (C50173ng.class) {
                        ebVar = f130420n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130419k);
                            f130420n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
