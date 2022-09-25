package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.c.a.bx */
/* compiled from: PG */
public final class C20154bx extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C20154bx f56530h;

    /* renamed from: i */
    private static volatile C63010eb f56531i;

    /* renamed from: a */
    public int f56532a;

    /* renamed from: b */
    public String f56533b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public double f56534c;

    /* renamed from: d */
    public C20150bt f56535d;

    /* renamed from: e */
    public double f56536e;

    /* renamed from: f */
    public C20150bt f56537f;

    /* renamed from: g */
    public C62971cq f56538g = emptyProtobufList();

    static {
        C20154bx bxVar = new C20154bx();
        f56530h = bxVar;
        C62942bv.registerDefaultInstance(C20154bx.class, bxVar);
    }

    private C20154bx() {
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
                return newMessageInfo(f56530h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002က\u0001\u0003ဉ\u0002\u0004က\u0003\u0005ဉ\u0004\u0006\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C20156bz.class});
            case 3:
                return new C20154bx();
            case 4:
                return new C20153bw();
            case 5:
                return f56530h;
            case 6:
                C63010eb ebVar = f56531i;
                if (ebVar == null) {
                    synchronized (C20154bx.class) {
                        ebVar = f56531i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56530h);
                            f56531i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
