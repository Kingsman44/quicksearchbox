package com.google.protos.p4985f.p5036r;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C49065fd;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.r.m */
/* compiled from: PG */
public final class C65327m extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C65327m f176666i;

    /* renamed from: j */
    private static volatile C63010eb f176667j;

    /* renamed from: a */
    public int f176668a;

    /* renamed from: b */
    public C49065fd f176669b;

    /* renamed from: c */
    public C52428rj f176670c;

    /* renamed from: d */
    public C65326l f176671d;

    /* renamed from: e */
    public String f176672e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public long f176673f;

    /* renamed from: g */
    public long f176674g;

    /* renamed from: h */
    public String f176675h = BuildConfig.FLAVOR;

    static {
        C65327m mVar = new C65327m();
        f176666i = mVar;
        C62942bv.registerDefaultInstance(C65327m.class, mVar);
    }

    private C65327m() {
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
                return newMessageInfo(f176666i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0006ဃ\u0005\u0007ဃ\u0006\bဈ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C65327m();
            case 4:
                return new C65324j();
            case 5:
                return f176666i;
            case 6:
                C63010eb ebVar = f176667j;
                if (ebVar == null) {
                    synchronized (C65327m.class) {
                        ebVar = f176667j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176666i);
                            f176667j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
