package com.google.protos.p5066i.p5067a;

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
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63010eb;
import com.google.protos.p4972d.p4983c.C64639h;
import com.google.protos.p4972d.p4983c.C64640i;

/* renamed from: com.google.protos.i.a.d */
/* compiled from: PG */
public final class C65473d extends C62937bq implements C62938br {

    /* renamed from: m */
    public static final C65473d f177963m;

    /* renamed from: o */
    private static volatile C63010eb f177964o;

    /* renamed from: a */
    public int f177965a;

    /* renamed from: b */
    public String f177966b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f177967c;

    /* renamed from: d */
    public long f177968d;

    /* renamed from: e */
    public long f177969e;

    /* renamed from: f */
    public long f177970f;

    /* renamed from: g */
    public String f177971g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f177972h;

    /* renamed from: i */
    public int f177973i;

    /* renamed from: j */
    public C64639h f177974j;

    /* renamed from: k */
    public C62964ck f177975k = emptyLongList();

    /* renamed from: l */
    public String f177976l = BuildConfig.FLAVOR;

    /* renamed from: n */
    private byte f177977n = 2;

    static {
        C65473d dVar = new C65473d();
        f177963m = dVar;
        C62942bv.registerDefaultInstance(C65473d.class, dVar);
    }

    private C65473d() {
    }

    /* renamed from: a */
    public final void mo59379a() {
        C62964ck ckVar = this.f177975k;
        if (!ckVar.mo58948c()) {
            this.f177975k = C62942bv.mutableCopy(ckVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177977n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f177977n = b;
                return null;
            case 2:
                return newMessageInfo(f177963m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0002\u0003ဂ\u0003\u0004ဂ\u0004\u0005ဈ\u0005\u0006ဌ\u0006\u0007ဌ\u0007\t\u0014\u000bဈ\u000b\fင\u0001\rဉ\t", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C65470a.f177962a, "i", C64640i.f175227a, C19621k.f54601a, "l", C45240c.f118157a, "j"});
            case 3:
                return new C65473d();
            case 4:
                return new C65472c();
            case 5:
                return f177963m;
            case 6:
                C63010eb ebVar = f177964o;
                if (ebVar == null) {
                    synchronized (C65473d.class) {
                        ebVar = f177964o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177963m);
                            f177964o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
