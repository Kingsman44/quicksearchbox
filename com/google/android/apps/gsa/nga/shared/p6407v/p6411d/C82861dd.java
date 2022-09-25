package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.afy;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.dd */
/* compiled from: PG */
public final class C82861dd extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C82861dd f225934g;

    /* renamed from: i */
    private static volatile C63010eb f225935i;

    /* renamed from: a */
    public int f225936a;

    /* renamed from: b */
    public String f225937b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f225938c;

    /* renamed from: d */
    public C80513b f225939d;

    /* renamed from: e */
    public int f225940e;

    /* renamed from: f */
    public boolean f225941f;

    /* renamed from: h */
    private byte f225942h = 2;

    static {
        C82861dd ddVar = new C82861dd();
        f225934g = ddVar;
        C62942bv.registerDefaultInstance(C82861dd.class, ddVar);
    }

    private C82861dd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f225942h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f225942h = b;
                return null;
            case 2:
                return newMessageInfo(f225934g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002\u0004ဌ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", afy.m92394b(), C10662f.f35572a});
            case 3:
                return new C82861dd();
            case 4:
                return new C82860dc();
            case 5:
                return f225934g;
            case 6:
                C63010eb ebVar = f225935i;
                if (ebVar == null) {
                    synchronized (C82861dd.class) {
                        ebVar = f225935i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225934g);
                            f225935i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
