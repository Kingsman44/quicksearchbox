package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

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

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.ck */
/* compiled from: PG */
public final class C80244ck extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C80244ck f220137i;

    /* renamed from: j */
    private static volatile C63010eb f220138j;

    /* renamed from: a */
    public int f220139a;

    /* renamed from: b */
    public int f220140b = 1;

    /* renamed from: c */
    public String f220141c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f220142d;

    /* renamed from: e */
    public boolean f220143e;

    /* renamed from: f */
    public C80269x f220144f;

    /* renamed from: g */
    public C80187ah f220145g;

    /* renamed from: h */
    public String f220146h = BuildConfig.FLAVOR;

    static {
        C80244ck ckVar = new C80244ck();
        f220137i = ckVar;
        C62942bv.registerDefaultInstance(C80244ck.class, ckVar);
    }

    private C80244ck() {
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
                return newMessageInfo(f220137i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", C80246cm.m128103b(), C45240c.f118157a, "d", C80220bn.f220096a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C80244ck();
            case 4:
                return new C80243cj();
            case 5:
                return f220137i;
            case 6:
                C63010eb ebVar = f220138j;
                if (ebVar == null) {
                    synchronized (C80244ck.class) {
                        ebVar = f220138j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220137i);
                            f220138j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
