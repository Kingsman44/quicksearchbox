package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

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

/* renamed from: com.google.android.libraries.assistant.d.c.c.aj */
/* compiled from: PG */
public final class C17880aj extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C17880aj f51221i;

    /* renamed from: j */
    private static volatile C63010eb f51222j;

    /* renamed from: a */
    public int f51223a;

    /* renamed from: b */
    public int f51224b;

    /* renamed from: c */
    public String f51225c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C17877ag f51226d;

    /* renamed from: e */
    public C17875ae f51227e;

    /* renamed from: f */
    public String f51228f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f51229g;

    /* renamed from: h */
    public C17872ab f51230h;

    static {
        C17880aj ajVar = new C17880aj();
        f51221i = ajVar;
        C62942bv.registerDefaultInstance(C17880aj.class, ajVar);
    }

    private C17880aj() {
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
                return newMessageInfo(f51221i, "\u0001\u0007\u0000\u0001\u0003\n\u0007\u0000\u0000\u0000\u0003ဌ\u0000\u0004ဈ\u0001\u0005ဉ\u0002\u0007ဉ\u0003\bဈ\u0004\tင\u0005\nဉ\u0006", new Object[]{"a", "b", C17878ah.f51220a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C17880aj();
            case 4:
                return new C17873ac();
            case 5:
                return f51221i;
            case 6:
                C63010eb ebVar = f51222j;
                if (ebVar == null) {
                    synchronized (C17880aj.class) {
                        ebVar = f51222j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51221i);
                            f51222j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
