package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63063ga;

/* renamed from: com.google.assistant.an.c.a.by */
/* compiled from: PG */
public final class C49306by extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49306by f127435e;

    /* renamed from: h */
    private static volatile C63010eb f127436h;

    /* renamed from: a */
    public String f127437a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63063ga f127438b;

    /* renamed from: c */
    public String f127439c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f127440d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private int f127441f;

    /* renamed from: g */
    private C62995dn f127442g = C62995dn.f170057a;

    static {
        C49306by byVar = new C49306by();
        f127435e = byVar;
        C62942bv.registerDefaultInstance(C49306by.class, byVar);
    }

    private C49306by() {
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
                return newMessageInfo(f127435e, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u00062\u0007ဈ\u0005", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, C30325g.f82003a, C49305bx.f127434a, "d"});
            case 3:
                return new C49306by();
            case 4:
                return new C49304bw();
            case 5:
                return f127435e;
            case 6:
                C63010eb ebVar = f127436h;
                if (ebVar == null) {
                    synchronized (C49306by.class) {
                        ebVar = f127436h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127435e);
                            f127436h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
