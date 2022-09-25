package com.google.android.apps.search.assistant.verticals.calendar.localcalendar.p10037a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.a.b */
/* compiled from: PG */
public final class C131947b extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C131947b f360260j;

    /* renamed from: k */
    private static volatile C63010eb f360261k;

    /* renamed from: a */
    public int f360262a;

    /* renamed from: b */
    public String f360263b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f360264c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f360265d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f360266e;

    /* renamed from: f */
    public boolean f360267f;

    /* renamed from: g */
    public boolean f360268g;

    /* renamed from: h */
    public int f360269h;

    /* renamed from: i */
    public int f360270i;

    static {
        C131947b bVar = new C131947b();
        f360260j = bVar;
        C62942bv.registerDefaultInstance(C131947b.class, bVar);
    }

    private C131947b() {
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
                return newMessageInfo(f360260j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007င\u0006\bင\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C131947b();
            case 4:
                return new C131946a();
            case 5:
                return f360260j;
            case 6:
                C63010eb ebVar = f360261k;
                if (ebVar == null) {
                    synchronized (C131947b.class) {
                        ebVar = f360261k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360260j);
                            f360261k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
