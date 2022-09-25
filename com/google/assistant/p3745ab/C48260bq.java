package com.google.assistant.p3745ab;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.p9330a.C123703a;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.p9330a.C123705c;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14309el;
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
import p001a.p007b.p011b.p012a.C0027c;

/* renamed from: com.google.assistant.ab.bq */
/* compiled from: PG */
public final class C48260bq extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C48260bq f124825o;

    /* renamed from: p */
    private static volatile C63010eb f124826p;

    /* renamed from: a */
    public int f124827a;

    /* renamed from: b */
    public String f124828b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f124829c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f124830d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f124831e;

    /* renamed from: f */
    public int f124832f;

    /* renamed from: g */
    public int f124833g;

    /* renamed from: h */
    public int f124834h;

    /* renamed from: i */
    public String f124835i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public int f124836j;

    /* renamed from: k */
    public int f124837k;

    /* renamed from: l */
    public C62971cq f124838l = C62942bv.emptyProtobufList();

    /* renamed from: m */
    public C62971cq f124839m = C62942bv.emptyProtobufList();

    /* renamed from: n */
    public int f124840n;

    static {
        C48260bq bqVar = new C48260bq();
        f124825o = bqVar;
        C62942bv.registerDefaultInstance(C48260bq.class, bqVar);
    }

    private C48260bq() {
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
                return newMessageInfo(f124825o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004င\u0004\u0005ဌ\u0005\u0006ဌ\u0006\u0007ဈ\u0007\bဌ\b\tဈ\u0002\nဌ\t\u000b\u001a\f\u001a\rဌ\n", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, C123705c.f341679a, C19618h.f54585a, C123703a.f341678a, "i", "j", C14309el.m30602b(), "d", C19621k.f54601a, C0027c.m10b(), "l", "m", C48004n.f124238a, C48259bp.f124824a});
            case 3:
                return new C48260bq();
            case 4:
                return new C48258bo();
            case 5:
                return f124825o;
            case 6:
                C63010eb ebVar = f124826p;
                if (ebVar == null) {
                    synchronized (C48260bq.class) {
                        ebVar = f124826p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124825o);
                            f124826p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
