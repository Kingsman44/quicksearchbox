package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d;

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

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.q */
/* compiled from: PG */
public final class C121253q extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C121253q f336807i;

    /* renamed from: j */
    private static volatile C63010eb f336808j;

    /* renamed from: a */
    public int f336809a;

    /* renamed from: b */
    public String f336810b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f336811c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f336812d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f336813e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f336814f;

    /* renamed from: g */
    public boolean f336815g;

    /* renamed from: h */
    public boolean f336816h;

    static {
        C121253q qVar = new C121253q();
        f336807i = qVar;
        C62942bv.registerDefaultInstance(C121253q.class, qVar);
    }

    private C121253q() {
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
                return newMessageInfo(f336807i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C121253q();
            case 4:
                return new C121252p();
            case 5:
                return f336807i;
            case 6:
                C63010eb ebVar = f336808j;
                if (ebVar == null) {
                    synchronized (C121253q.class) {
                        ebVar = f336808j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336807i);
                            f336808j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
