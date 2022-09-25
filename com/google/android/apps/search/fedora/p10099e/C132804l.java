package com.google.android.apps.search.fedora.p10099e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.e.l */
/* compiled from: PG */
public final class C132804l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C132804l f362339e;

    /* renamed from: f */
    private static volatile C63010eb f362340f;

    /* renamed from: a */
    public int f362341a;

    /* renamed from: b */
    public String f362342b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62995dn f362343c = C62995dn.f170057a;

    /* renamed from: d */
    public C62995dn f362344d = C62995dn.f170057a;

    static {
        C132804l lVar = new C132804l();
        f362339e = lVar;
        C62942bv.registerDefaultInstance(C132804l.class, lVar);
    }

    private C132804l() {
    }

    /* renamed from: a */
    public final C62995dn mo110908a() {
        C62995dn dnVar = this.f362343c;
        if (!dnVar.f170058b) {
            this.f362343c = dnVar.mo58980a();
        }
        return this.f362343c;
    }

    /* renamed from: b */
    public final C62995dn mo110909b() {
        C62995dn dnVar = this.f362344d;
        if (!dnVar.f170058b) {
            this.f362344d = dnVar.mo58980a();
        }
        return this.f362344d;
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
                return newMessageInfo(f362339e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0002\u0000\u0000\u00012\u00022\u0003ဈ\u0000", new Object[]{"a", C45240c.f118157a, C132802j.f362338a, "d", C132801i.f362337a, "b"});
            case 3:
                return new C132804l();
            case 4:
                return new C132803k();
            case 5:
                return f362339e;
            case 6:
                C63010eb ebVar = f362340f;
                if (ebVar == null) {
                    synchronized (C132804l.class) {
                        ebVar = f362340f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362339e);
                            f362340f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
