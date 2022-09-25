package com.google.assistant.p3803ag.p3804a.p3806b;

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

/* renamed from: com.google.assistant.ag.a.b.m */
/* compiled from: PG */
public final class C48832m extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C48832m f126340i;

    /* renamed from: j */
    private static volatile C63010eb f126341j;

    /* renamed from: a */
    public int f126342a;

    /* renamed from: b */
    public String f126343b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f126344c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f126345d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f126346e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f126347f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f126348g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f126349h;

    static {
        C48832m mVar = new C48832m();
        f126340i = mVar;
        C62942bv.registerDefaultInstance(C48832m.class, mVar);
    }

    private C48832m() {
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
                return newMessageInfo(f126340i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဌ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C48830k.f126339a});
            case 3:
                return new C48832m();
            case 4:
                return new C48829j();
            case 5:
                return f126340i;
            case 6:
                C63010eb ebVar = f126341j;
                if (ebVar == null) {
                    synchronized (C48832m.class) {
                        ebVar = f126341j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126340i);
                            f126341j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
