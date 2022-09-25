package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

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
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.dp */
/* compiled from: PG */
public final class C124704dp extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C124704dp f344029i;

    /* renamed from: j */
    private static volatile C63010eb f344030j;

    /* renamed from: a */
    public int f344031a;

    /* renamed from: b */
    public String f344032b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f344033c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f344034d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f344035e;

    /* renamed from: f */
    public boolean f344036f;

    /* renamed from: g */
    public boolean f344037g;

    /* renamed from: h */
    public C63088z f344038h = C63088z.f170246b;

    static {
        C124704dp dpVar = new C124704dp();
        f344029i = dpVar;
        C62942bv.registerDefaultInstance(C124704dp.class, dpVar);
    }

    private C124704dp() {
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
                return newMessageInfo(f344029i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ည\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C124719q.m204381b(), C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C124704dp();
            case 4:
                return new C124703do();
            case 5:
                return f344029i;
            case 6:
                C63010eb ebVar = f344030j;
                if (ebVar == null) {
                    synchronized (C124704dp.class) {
                        ebVar = f344030j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344029i);
                            f344030j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
