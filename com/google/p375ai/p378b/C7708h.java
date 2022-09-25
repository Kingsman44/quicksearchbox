package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ai.b.h */
/* compiled from: PG */
public final class C7708h extends C62937bq implements C62938br {

    /* renamed from: n */
    public static final C7708h f26894n;

    /* renamed from: p */
    private static volatile C63010eb f26895p;

    /* renamed from: a */
    public int f26896a;

    /* renamed from: b */
    public int f26897b;

    /* renamed from: c */
    public String f26898c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f26899d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f26900e;

    /* renamed from: f */
    public boolean f26901f;

    /* renamed from: g */
    public boolean f26902g;

    /* renamed from: h */
    public C7799kj f26903h;

    /* renamed from: i */
    public C63088z f26904i = C63088z.f170246b;

    /* renamed from: j */
    public boolean f26905j;

    /* renamed from: k */
    public boolean f26906k;

    /* renamed from: l */
    public C8178yk f26907l;

    /* renamed from: m */
    public int f26908m = 1;

    /* renamed from: o */
    private byte f26909o = 2;

    static {
        C7708h hVar = new C7708h();
        f26894n = hVar;
        C62942bv.registerDefaultInstance(C7708h.class, hVar);
    }

    private C7708h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26909o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26909o = b;
                return null;
            case 2:
                return newMessageInfo(f26894n, "\u0001\f\u0000\u0001\u0001\u0013\f\u0000\u0000\u0002\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0003\u0004ᐉ\u0006\u0005ည\u0007\u0007ဈ\u0002\tဇ\b\nဇ\u0005\fဇ\n\u000eဇ\u0004\u0012ᐉ\u000b\u0013ဌ\f", new Object[]{"a", "b", C7681g.m22803b(), C45240c.f118157a, "e", C19618h.f54585a, "i", "d", "j", C30325g.f82003a, C19621k.f54601a, C10662f.f35572a, "l", "m", C7600d.f26264a});
            case 3:
                return new C7708h();
            case 4:
                return new C7573c();
            case 5:
                return f26894n;
            case 6:
                C63010eb ebVar = f26895p;
                if (ebVar == null) {
                    synchronized (C7708h.class) {
                        ebVar = f26895p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26894n);
                            f26895p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
