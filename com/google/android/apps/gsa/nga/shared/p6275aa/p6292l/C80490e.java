package com.google.android.apps.gsa.nga.shared.p6275aa.p6292l;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.l.e */
/* compiled from: PG */
public final class C80490e extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C80490e f220957f;

    /* renamed from: g */
    private static volatile C63010eb f220958g;

    /* renamed from: a */
    public int f220959a;

    /* renamed from: b */
    public int f220960b;

    /* renamed from: c */
    public int f220961c;

    /* renamed from: d */
    public String f220962d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C29690f f220963e;

    static {
        C80490e eVar = new C80490e();
        f220957f = eVar;
        C62942bv.registerDefaultInstance(C80490e.class, eVar);
    }

    private C80490e() {
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
                return newMessageInfo(f220957f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C80487b.m128181b(), C45240c.f118157a, C80489d.f220956a, "d", "e"});
            case 3:
                return new C80490e();
            case 4:
                return new C80488c();
            case 5:
                return f220957f;
            case 6:
                C63010eb ebVar = f220958g;
                if (ebVar == null) {
                    synchronized (C80490e.class) {
                        ebVar = f220958g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220957f);
                            f220958g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
