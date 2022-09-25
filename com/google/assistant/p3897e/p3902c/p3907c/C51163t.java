package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.t */
/* compiled from: PG */
public final class C51163t extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C51163t f133176l;

    /* renamed from: n */
    private static volatile C63010eb f133177n;

    /* renamed from: a */
    public int f133178a;

    /* renamed from: b */
    public String f133179b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51141hx f133180c;

    /* renamed from: d */
    public boolean f133181d;

    /* renamed from: e */
    public int f133182e;

    /* renamed from: f */
    public C51165v f133183f;

    /* renamed from: g */
    public C51165v f133184g;

    /* renamed from: h */
    public C51167x f133185h;

    /* renamed from: i */
    public int f133186i;

    /* renamed from: j */
    public int f133187j;

    /* renamed from: k */
    public int f133188k;

    /* renamed from: m */
    private byte f133189m = 2;

    static {
        C51163t tVar = new C51163t();
        f133176l = tVar;
        C62942bv.registerDefaultInstance(C51163t.class, tVar);
    }

    private C51163t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133189m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133189m = b;
                return null;
            case 2:
                return newMessageInfo(f133176l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0004\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bင\u0007\tင\b\nင\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C51160q.f133175a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C51163t();
            case 4:
                return new C51162s();
            case 5:
                return f133176l;
            case 6:
                C63010eb ebVar = f133177n;
                if (ebVar == null) {
                    synchronized (C51163t.class) {
                        ebVar = f133177n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133176l);
                            f133177n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
