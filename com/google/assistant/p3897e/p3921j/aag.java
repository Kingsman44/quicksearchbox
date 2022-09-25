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

/* renamed from: com.google.assistant.e.j.aag */
/* compiled from: PG */
public final class aag extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final aag f134631k;

    /* renamed from: l */
    private static volatile C63010eb f134632l;

    /* renamed from: a */
    public int f134633a;

    /* renamed from: b */
    public String f134634b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f134635c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public aaf f134636d;

    /* renamed from: e */
    public int f134637e;

    /* renamed from: f */
    public long f134638f;

    /* renamed from: g */
    public long f134639g;

    /* renamed from: h */
    public long f134640h;

    /* renamed from: i */
    public boolean f134641i;

    /* renamed from: j */
    public boolean f134642j;

    static {
        aag aag = new aag();
        f134631k = aag;
        C62942bv.registerDefaultInstance(aag.class, aag);
    }

    private aag() {
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
                return newMessageInfo(f134631k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဇ\u0007\tဇ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", aac.f134625a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new aag();
            case 4:
                return new aab();
            case 5:
                return f134631k;
            case 6:
                C63010eb ebVar = f134632l;
                if (ebVar == null) {
                    synchronized (aag.class) {
                        ebVar = f134632l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134631k);
                            f134632l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
