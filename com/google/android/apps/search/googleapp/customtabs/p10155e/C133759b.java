package com.google.android.apps.search.googleapp.customtabs.p10155e;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.customtabs.p10156f.C133771b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.e.b */
/* compiled from: PG */
public final class C133759b extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C133759b f364312i;

    /* renamed from: j */
    private static volatile C63010eb f364313j;

    /* renamed from: a */
    public int f364314a;

    /* renamed from: b */
    public C133771b f364315b;

    /* renamed from: c */
    public String f364316c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f364317d;

    /* renamed from: e */
    public boolean f364318e;

    /* renamed from: f */
    public boolean f364319f;

    /* renamed from: g */
    public long f364320g;

    /* renamed from: h */
    public boolean f364321h;

    static {
        C133759b bVar = new C133759b();
        f364312i = bVar;
        C62942bv.registerDefaultInstance(C133759b.class, bVar);
    }

    private C133759b() {
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
                return newMessageInfo(f364312i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C133759b();
            case 4:
                return new C133758a();
            case 5:
                return f364312i;
            case 6:
                C63010eb ebVar = f364313j;
                if (ebVar == null) {
                    synchronized (C133759b.class) {
                        ebVar = f364313j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f364312i);
                            f364313j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
