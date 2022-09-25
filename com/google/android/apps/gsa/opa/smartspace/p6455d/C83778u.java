package com.google.android.apps.gsa.opa.smartspace.p6455d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.d.u */
/* compiled from: PG */
public final class C83778u extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C83778u f228339k;

    /* renamed from: l */
    private static volatile C63010eb f228340l;

    /* renamed from: a */
    public int f228341a;

    /* renamed from: b */
    public String f228342b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f228343c;

    /* renamed from: d */
    public C62971cq f228344d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public int f228345e;

    /* renamed from: f */
    public String f228346f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f228347g;

    /* renamed from: h */
    public String f228348h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public long f228349i;

    /* renamed from: j */
    public C83776s f228350j;

    static {
        C83778u uVar = new C83778u();
        f228339k = uVar;
        C62942bv.registerDefaultInstance(C83778u.class, uVar);
    }

    private C83778u() {
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
                return newMessageInfo(f228339k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0004\u0003ဈ\u0006\u0004ဉ\b\u0005ဂ\u0007\u0007\u001a\bင\u0003\tဇ\u0005\nဇ\u0002", new Object[]{"a", "b", C10662f.f35572a, C19618h.f54585a, "j", "i", "d", "e", C30325g.f82003a, C45240c.f118157a});
            case 3:
                return new C83778u();
            case 4:
                return new C83777t();
            case 5:
                return f228339k;
            case 6:
                C63010eb ebVar = f228340l;
                if (ebVar == null) {
                    synchronized (C83778u.class) {
                        ebVar = f228340l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228339k);
                            f228340l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
