package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.C48384r;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49845bc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ab */
/* compiled from: PG */
public final class C87693ab extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C87693ab f237115j;

    /* renamed from: k */
    private static volatile C63010eb f237116k;

    /* renamed from: a */
    public int f237117a;

    /* renamed from: b */
    public C87692aa f237118b;

    /* renamed from: c */
    public C49826ak f237119c;

    /* renamed from: d */
    public String f237120d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f237121e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f237122f;

    /* renamed from: g */
    public String f237123g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C48384r f237124h;

    /* renamed from: i */
    public C49845bc f237125i;

    static {
        C87693ab abVar = new C87693ab();
        f237115j = abVar;
        C62942bv.registerDefaultInstance(C87693ab.class, abVar);
    }

    private C87693ab() {
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
                return newMessageInfo(f237115j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006ဈ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C88312x.f238835a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C87693ab();
            case 4:
                return new C88285w();
            case 5:
                return f237115j;
            case 6:
                C63010eb ebVar = f237116k;
                if (ebVar == null) {
                    synchronized (C87693ab.class) {
                        ebVar = f237116k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237115j);
                            f237116k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
