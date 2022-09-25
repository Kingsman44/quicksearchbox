package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

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

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.az */
/* compiled from: PG */
public final class C82802az extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C82802az f225623j;

    /* renamed from: k */
    private static volatile C63010eb f225624k;

    /* renamed from: a */
    public int f225625a;

    /* renamed from: b */
    public C82806bc f225626b;

    /* renamed from: c */
    public int f225627c;

    /* renamed from: d */
    public String f225628d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f225629e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f225630f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public long f225631g;

    /* renamed from: h */
    public long f225632h;

    /* renamed from: i */
    public long f225633i;

    static {
        C82802az azVar = new C82802az();
        f225623j = azVar;
        C62942bv.registerDefaultInstance(C82802az.class, azVar);
    }

    private C82802az() {
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
                return newMessageInfo(f225623j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0007ဂ\u0005\bဂ\u0006\tဂ\u0007", new Object[]{"a", "b", C45240c.f118157a, C82801ay.f225622a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C82802az();
            case 4:
                return new C82800ax();
            case 5:
                return f225623j;
            case 6:
                C63010eb ebVar = f225624k;
                if (ebVar == null) {
                    synchronized (C82802az.class) {
                        ebVar = f225624k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225623j);
                            f225624k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
