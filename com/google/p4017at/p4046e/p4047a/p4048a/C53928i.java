package com.google.p4017at.p4046e.p4047a.p4048a;

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
import com.google.protobuf.C63042fg;

/* renamed from: com.google.at.e.a.a.i */
/* compiled from: PG */
public final class C53928i extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C53928i f141500i;

    /* renamed from: j */
    private static volatile C63010eb f141501j;

    /* renamed from: a */
    public int f141502a;

    /* renamed from: b */
    public String f141503b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f141504c;

    /* renamed from: d */
    public C63042fg f141505d;

    /* renamed from: e */
    public C63042fg f141506e;

    /* renamed from: f */
    public C53931l f141507f;

    /* renamed from: g */
    public C53921b f141508g;

    /* renamed from: h */
    public C53927h f141509h;

    static {
        C53928i iVar = new C53928i();
        f141500i = iVar;
        C62942bv.registerDefaultInstance(C53928i.class, iVar);
    }

    private C53928i() {
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
                return newMessageInfo(f141500i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဌ\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0007ဈ\u0000\bဉ\u0007", new Object[]{"a", C45240c.f118157a, C53925f.m87062b(), "d", "e", C10662f.f35572a, C30325g.f82003a, "b", C19618h.f54585a});
            case 3:
                return new C53928i();
            case 4:
                return new C53923d();
            case 5:
                return f141500i;
            case 6:
                C63010eb ebVar = f141501j;
                if (ebVar == null) {
                    synchronized (C53928i.class) {
                        ebVar = f141501j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141500i);
                            f141501j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
