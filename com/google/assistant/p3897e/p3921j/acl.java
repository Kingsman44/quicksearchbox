package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.e.j.acl */
/* compiled from: PG */
public final class acl extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final acl f134809g;

    /* renamed from: h */
    private static volatile C63010eb f134810h;

    /* renamed from: a */
    public int f134811a;

    /* renamed from: b */
    public C63042fg f134812b;

    /* renamed from: c */
    public acn f134813c;

    /* renamed from: d */
    public String f134814d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f134815e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f134816f = BuildConfig.FLAVOR;

    static {
        acl acl = new acl();
        f134809g = acl;
        C62942bv.registerDefaultInstance(acl.class, acl);
    }

    private acl() {
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
                return newMessageInfo(f134809g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new acl();
            case 4:
                return new ack();
            case 5:
                return f134809g;
            case 6:
                C63010eb ebVar = f134810h;
                if (ebVar == null) {
                    synchronized (acl.class) {
                        ebVar = f134810h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134809g);
                            f134810h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
