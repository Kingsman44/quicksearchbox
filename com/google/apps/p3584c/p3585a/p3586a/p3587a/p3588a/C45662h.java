package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.apps.p3581b.p3582a.p3583a.C45619h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.h */
/* compiled from: PG */
public final class C45662h extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C45662h f120115j;

    /* renamed from: k */
    private static volatile C63010eb f120116k;

    /* renamed from: a */
    public int f120117a;

    /* renamed from: b */
    public int f120118b;

    /* renamed from: c */
    public int f120119c;

    /* renamed from: d */
    public long f120120d;

    /* renamed from: e */
    public String f120121e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f120122f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f120123g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f120124h;

    /* renamed from: i */
    public C45619h f120125i;

    static {
        C45662h hVar = new C45662h();
        f120115j = hVar;
        C62942bv.registerDefaultInstance(C45662h.class, hVar);
    }

    private C45662h() {
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
                return newMessageInfo(f120115j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0001\u0002ဂ\u0002\u0003ဈ\u0003\u0004ဌ\u0000\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဉ\u0007", new Object[]{"a", C45240c.f118157a, C45660f.f120114a, "d", "e", "b", C45658d.f120113a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C45647b.f120092a, "i"});
            case 3:
                return new C45662h();
            case 4:
                return new C45620a();
            case 5:
                return f120115j;
            case 6:
                C63010eb ebVar = f120116k;
                if (ebVar == null) {
                    synchronized (C45662h.class) {
                        ebVar = f120116k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120115j);
                            f120116k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
