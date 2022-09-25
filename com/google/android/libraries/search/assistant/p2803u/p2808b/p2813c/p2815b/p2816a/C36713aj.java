package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C50358uc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.aj */
/* compiled from: PG */
public final class C36713aj extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C36713aj f95647k;

    /* renamed from: l */
    private static volatile C63010eb f95648l;

    /* renamed from: a */
    public int f95649a;

    /* renamed from: b */
    public C36736l f95650b;

    /* renamed from: c */
    public C50358uc f95651c;

    /* renamed from: d */
    public String f95652d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f95653e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C36724ar f95654f;

    /* renamed from: g */
    public C63088z f95655g = C63088z.f170246b;

    /* renamed from: h */
    public String f95656h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public boolean f95657i;

    /* renamed from: j */
    public boolean f95658j;

    static {
        C36713aj ajVar = new C36713aj();
        f95647k = ajVar;
        C62942bv.registerDefaultInstance(C36713aj.class, ajVar);
    }

    private C36713aj() {
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
                return newMessageInfo(f95647k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဉ\u0005\u0007ည\u0006\bဈ\u0007\tဇ\b\nဇ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C36713aj();
            case 4:
                return new C36712ai();
            case 5:
                return f95647k;
            case 6:
                C63010eb ebVar = f95648l;
                if (ebVar == null) {
                    synchronized (C36713aj.class) {
                        ebVar = f95648l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95647k);
                            f95648l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
