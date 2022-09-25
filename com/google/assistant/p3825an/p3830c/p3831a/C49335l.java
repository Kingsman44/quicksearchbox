package com.google.assistant.p3825an.p3830c.p3831a;

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
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.l */
/* compiled from: PG */
public final class C49335l extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C49335l f127511o;

    /* renamed from: p */
    private static volatile C63010eb f127512p;

    /* renamed from: a */
    public int f127513a;

    /* renamed from: b */
    public String f127514b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f127515c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f127516d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f127517e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f127518f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f127519g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f127520h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C49322cn f127521i;

    /* renamed from: j */
    public long f127522j;

    /* renamed from: k */
    public long f127523k;

    /* renamed from: l */
    public C49273as f127524l;

    /* renamed from: m */
    public String f127525m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public C62971cq f127526n = emptyProtobufList();

    static {
        C49335l lVar = new C49335l();
        f127511o = lVar;
        C62942bv.registerDefaultInstance(C49335l.class, lVar);
    }

    private C49335l() {
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
                return newMessageInfo(f127511o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဉ\u0007\tဂ\b\nဂ\t\u000bဉ\n\fဈ\u000b\r\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C49265ak.class});
            case 3:
                return new C49335l();
            case 4:
                return new C49334k();
            case 5:
                return f127511o;
            case 6:
                C63010eb ebVar = f127512p;
                if (ebVar == null) {
                    synchronized (C49335l.class) {
                        ebVar = f127512p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127511o);
                            f127512p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
