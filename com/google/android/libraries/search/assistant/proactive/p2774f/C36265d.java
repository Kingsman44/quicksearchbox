package com.google.android.libraries.search.assistant.proactive.p2774f;

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

/* renamed from: com.google.android.libraries.search.assistant.proactive.f.d */
/* compiled from: PG */
public final class C36265d extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C36265d f94713k;

    /* renamed from: l */
    private static volatile C63010eb f94714l;

    /* renamed from: a */
    public int f94715a;

    /* renamed from: b */
    public C49826ak f94716b;

    /* renamed from: c */
    public String f94717c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f94718d;

    /* renamed from: e */
    public String f94719e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f94720f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f94721g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C48384r f94722h;

    /* renamed from: i */
    public C49845bc f94723i;

    /* renamed from: j */
    public String f94724j = BuildConfig.FLAVOR;

    static {
        C36265d dVar = new C36265d();
        f94713k = dVar;
        C62942bv.registerDefaultInstance(C36265d.class, dVar);
    }

    private C36265d() {
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
                return newMessageInfo(f94713k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\b", new Object[]{"a", "b", C45240c.f118157a, "d", C36263b.f94712a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C36265d();
            case 4:
                return new C36262a();
            case 5:
                return f94713k;
            case 6:
                C63010eb ebVar = f94714l;
                if (ebVar == null) {
                    synchronized (C36265d.class) {
                        ebVar = f94714l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f94713k);
                            f94714l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
