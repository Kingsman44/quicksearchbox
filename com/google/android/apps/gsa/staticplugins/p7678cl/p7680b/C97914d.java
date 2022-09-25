package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.d */
/* compiled from: PG */
public final class C97914d extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C97914d f273393j;

    /* renamed from: k */
    private static volatile C63010eb f273394k;

    /* renamed from: a */
    public int f273395a;

    /* renamed from: b */
    public int f273396b;

    /* renamed from: c */
    public C97918h f273397c;

    /* renamed from: d */
    public long f273398d;

    /* renamed from: e */
    public long f273399e;

    /* renamed from: f */
    public String f273400f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public long f273401g;

    /* renamed from: h */
    public long f273402h;

    /* renamed from: i */
    public long f273403i;

    static {
        C97914d dVar = new C97914d();
        f273393j = dVar;
        C62942bv.registerDefaultInstance(C97914d.class, dVar);
    }

    private C97914d() {
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
                return newMessageInfo(f273393j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0006ဈ\u0005\u0007ဂ\u0006\bဂ\u0007\nဂ\b", new Object[]{"a", "b", C97913c.m162191b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C97914d();
            case 4:
                return new C97874a();
            case 5:
                return f273393j;
            case 6:
                C63010eb ebVar = f273394k;
                if (ebVar == null) {
                    synchronized (C97914d.class) {
                        ebVar = f273394k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273393j);
                            f273394k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
