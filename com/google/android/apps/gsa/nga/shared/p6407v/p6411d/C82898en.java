package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.en */
/* compiled from: PG */
public final class C82898en extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C82898en f226124g;

    /* renamed from: h */
    private static volatile C63010eb f226125h;

    /* renamed from: a */
    public int f226126a;

    /* renamed from: b */
    public String f226127b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52236kg f226128c;

    /* renamed from: d */
    public int f226129d;

    /* renamed from: e */
    public long f226130e;

    /* renamed from: f */
    public long f226131f;

    static {
        C82898en enVar = new C82898en();
        f226124g = enVar;
        C62942bv.registerDefaultInstance(C82898en.class, enVar);
    }

    private C82898en() {
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
                return newMessageInfo(f226124g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C82897em.m132420b(), "e", C10662f.f35572a});
            case 3:
                return new C82898en();
            case 4:
                return new C82895ek();
            case 5:
                return f226124g;
            case 6:
                C63010eb ebVar = f226125h;
                if (ebVar == null) {
                    synchronized (C82898en.class) {
                        ebVar = f226125h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226124g);
                            f226125h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
