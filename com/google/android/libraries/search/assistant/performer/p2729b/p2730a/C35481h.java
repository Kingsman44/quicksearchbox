package com.google.android.libraries.search.assistant.performer.p2729b.p2730a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.libraries.search.assistant.performer.b.a.h */
/* compiled from: PG */
public final class C35481h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C35481h f93174f;

    /* renamed from: g */
    private static volatile C63010eb f93175g;

    /* renamed from: a */
    public int f93176a;

    /* renamed from: b */
    public C52083ep f93177b;

    /* renamed from: c */
    public String f93178c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63042fg f93179d;

    /* renamed from: e */
    public C63042fg f93180e;

    static {
        C35481h hVar = new C35481h();
        f93174f = hVar;
        C62942bv.registerDefaultInstance(C35481h.class, hVar);
    }

    private C35481h() {
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
                return newMessageInfo(f93174f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002ለ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C35481h();
            case 4:
                return new C35480g();
            case 5:
                return f93174f;
            case 6:
                C63010eb ebVar = f93175g;
                if (ebVar == null) {
                    synchronized (C35481h.class) {
                        ebVar = f93175g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f93174f);
                            f93175g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
