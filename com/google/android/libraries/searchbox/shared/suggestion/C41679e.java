package com.google.android.libraries.searchbox.shared.suggestion;

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
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.e */
/* compiled from: PG */
public final class C41679e extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C41679e f109005p;

    /* renamed from: q */
    private static volatile C63010eb f109006q;

    /* renamed from: a */
    public int f109007a;

    /* renamed from: b */
    public C41663ac f109008b;

    /* renamed from: c */
    public C41693s f109009c;

    /* renamed from: d */
    public C41689o f109010d;

    /* renamed from: e */
    public C41695u f109011e;

    /* renamed from: f */
    public C41691q f109012f;

    /* renamed from: g */
    public C41661aa f109013g;

    /* renamed from: h */
    public C41697w f109014h;

    /* renamed from: i */
    public C41687m f109015i;

    /* renamed from: j */
    public C41667ag f109016j;

    /* renamed from: k */
    public C41699y f109017k;

    /* renamed from: l */
    public C41681g f109018l;

    /* renamed from: m */
    public C41683i f109019m;

    /* renamed from: n */
    public C41685k f109020n;

    /* renamed from: o */
    public C41677c f109021o;

    static {
        C41679e eVar = new C41679e();
        f109005p = eVar;
        C62942bv.registerDefaultInstance(C41679e.class, eVar);
    }

    private C41679e() {
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
                return newMessageInfo(f109005p, "\u0001\u000e\u0000\u0001\u0002\u0010\u000e\u0000\u0000\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t\fဉ\n\rဉ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u000e", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a});
            case 3:
                return new C41679e();
            case 4:
                return new C41678d();
            case 5:
                return f109005p;
            case 6:
                C63010eb ebVar = f109006q;
                if (ebVar == null) {
                    synchronized (C41679e.class) {
                        ebVar = f109006q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109005p);
                            f109006q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
