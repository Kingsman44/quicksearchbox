package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.tr */
/* compiled from: PG */
public final class C52490tr extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C52490tr f137795g;

    /* renamed from: h */
    private static volatile C63010eb f137796h;

    /* renamed from: a */
    public int f137797a;

    /* renamed from: b */
    public int f137798b = 0;

    /* renamed from: c */
    public Object f137799c;

    /* renamed from: d */
    public String f137800d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f137801e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f137802f;

    static {
        C52490tr trVar = new C52490tr();
        f137795g = trVar;
        C62942bv.registerDefaultInstance(C52490tr.class, trVar);
    }

    private C52490tr() {
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
                return newMessageInfo(f137795g, "\u0001\u0012\u0001\u0001\u0001\u0012\u0012\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0002\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nဈ\u0001\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fြ\u0000\u0010ြ\u0000\u0011ြ\u0000\u0012ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C10662f.f35572a, C52487to.class, C52494tv.class, C52509uj.class, C52481ti.class, C52496tx.class, C52479tg.class, C52475tc.class, "e", C52505uf.class, C52485tm.class, C52470sy.class, C52473ta.class, C52503ud.class, C52477te.class, C52483tk.class, C52501ub.class});
            case 3:
                return new C52490tr();
            case 4:
                return new C52488tp();
            case 5:
                return f137795g;
            case 6:
                C63010eb ebVar = f137796h;
                if (ebVar == null) {
                    synchronized (C52490tr.class) {
                        ebVar = f137796h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137795g);
                            f137796h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
