package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.te */
/* compiled from: PG */
public final class C52477te extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C52477te f137748h;

    /* renamed from: i */
    private static volatile C63010eb f137749i;

    /* renamed from: a */
    public int f137750a;

    /* renamed from: b */
    public int f137751b = 0;

    /* renamed from: c */
    public Object f137752c;

    /* renamed from: d */
    public long f137753d;

    /* renamed from: e */
    public boolean f137754e;

    /* renamed from: f */
    public boolean f137755f;

    /* renamed from: g */
    public String f137756g = BuildConfig.FLAVOR;

    static {
        C52477te teVar = new C52477te();
        f137748h = teVar;
        C62942bv.registerDefaultInstance(C52477te.class, teVar);
    }

    private C52477te() {
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
                return newMessageInfo(f137748h, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ဈ\u0006", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C52393qb.class, C52403ql.class, C52397qf.class, C30325g.f82003a});
            case 3:
                return new C52477te();
            case 4:
                return new C52476td();
            case 5:
                return f137748h;
            case 6:
                C63010eb ebVar = f137749i;
                if (ebVar == null) {
                    synchronized (C52477te.class) {
                        ebVar = f137749i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137748h);
                            f137749i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
