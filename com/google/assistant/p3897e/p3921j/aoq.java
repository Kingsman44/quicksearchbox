package com.google.assistant.p3897e.p3921j;

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

/* renamed from: com.google.assistant.e.j.aoq */
/* compiled from: PG */
public final class aoq extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final aoq f135508j;

    /* renamed from: k */
    private static volatile C63010eb f135509k;

    /* renamed from: a */
    public int f135510a;

    /* renamed from: b */
    public int f135511b;

    /* renamed from: c */
    public String f135512c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f135513d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f135514e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f135515f;

    /* renamed from: g */
    public String f135516g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f135517h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f135518i = BuildConfig.FLAVOR;

    static {
        aoq aoq = new aoq();
        f135508j = aoq;
        C62942bv.registerDefaultInstance(aoq.class, aoq);
    }

    private aoq() {
    }

    /* renamed from: a */
    public static C63010eb m86355a() {
        return f135508j.getParserForType();
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
                return newMessageInfo(f135508j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, aoo.f135507a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new aoq();
            case 4:
                return new aon();
            case 5:
                return f135508j;
            case 6:
                C63010eb ebVar = f135509k;
                if (ebVar == null) {
                    synchronized (aoq.class) {
                        ebVar = f135509k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135508j);
                            f135509k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
