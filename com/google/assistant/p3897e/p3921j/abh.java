package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.abh */
/* compiled from: PG */
public final class abh extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final abh f134715g;

    /* renamed from: i */
    private static volatile C63010eb f134716i;

    /* renamed from: a */
    public String f134717a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f134718b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f134719c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f134720d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public double f134721e;

    /* renamed from: f */
    public double f134722f;

    /* renamed from: h */
    private int f134723h;

    static {
        abh abh = new abh();
        f134715g = abh;
        C62942bv.registerDefaultInstance(abh.class, abh);
    }

    private abh() {
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
                return newMessageInfo(f134715g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005က\u0004\u0006က\u0005", new Object[]{C19618h.f54585a, "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new abh();
            case 4:
                return new abg();
            case 5:
                return f134715g;
            case 6:
                C63010eb ebVar = f134716i;
                if (ebVar == null) {
                    synchronized (abh.class) {
                        ebVar = f134716i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134715g);
                            f134716i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
