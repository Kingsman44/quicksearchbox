package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5208h.C66578bd;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.sf */
/* compiled from: PG */
public final class C88183sf extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C88183sf f238383g;

    /* renamed from: h */
    private static volatile C63010eb f238384h;

    /* renamed from: a */
    public int f238385a;

    /* renamed from: b */
    public String f238386b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f238387c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f238388d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f238389e;

    /* renamed from: f */
    public int f238390f = 3;

    static {
        C88183sf sfVar = new C88183sf();
        f238383g = sfVar;
        C62942bv.registerDefaultInstance(C88183sf.class, sfVar);
    }

    private C88183sf() {
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
                return newMessageInfo(f238383g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0005င\u0004\u0006ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C66578bd.f181100a});
            case 3:
                return new C88183sf();
            case 4:
                return new C88182se();
            case 5:
                return f238383g;
            case 6:
                C63010eb ebVar = f238384h;
                if (ebVar == null) {
                    synchronized (C88183sf.class) {
                        ebVar = f238384h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238383g);
                            f238384h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
