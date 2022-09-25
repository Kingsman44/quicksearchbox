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

/* renamed from: com.google.assistant.an.c.a.g */
/* compiled from: PG */
public final class C49330g extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C49330g f127488o;

    /* renamed from: p */
    private static volatile C63010eb f127489p;

    /* renamed from: a */
    public int f127490a;

    /* renamed from: b */
    public String f127491b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f127492c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f127493d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f127494e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C49275au f127495f;

    /* renamed from: g */
    public String f127496g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f127497h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f127498i;

    /* renamed from: j */
    public int f127499j;

    /* renamed from: k */
    public C62971cq f127500k = emptyProtobufList();

    /* renamed from: l */
    public String f127501l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public String f127502m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public String f127503n = BuildConfig.FLAVOR;

    static {
        C49330g gVar = new C49330g();
        f127488o = gVar;
        C62942bv.registerDefaultInstance(C49330g.class, gVar);
    }

    private C49330g() {
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
                return newMessageInfo(f127488o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0004\u0005ဈ\u0005\u0006ဌ\u0007\u0007ဌ\b\bဈ\u0003\tဈ\u0006\n\u001b\u000bဈ\t\fဈ\n\rဈ\u000b", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, "i", C49278ax.f127376a, "j", C49276av.f127375a, "e", C19618h.f54585a, C19621k.f54601a, C49265ak.class, "l", "m", C48004n.f124238a});
            case 3:
                return new C49330g();
            case 4:
                return new C49329f();
            case 5:
                return f127488o;
            case 6:
                C63010eb ebVar = f127489p;
                if (ebVar == null) {
                    synchronized (C49330g.class) {
                        ebVar = f127489p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127488o);
                            f127489p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
