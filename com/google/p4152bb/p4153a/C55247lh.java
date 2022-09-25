package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.lh */
/* compiled from: PG */
public final class C55247lh extends C62937bq implements C62938br {

    /* renamed from: i */
    public static final C62962ci f145476i = new C55245lf();

    /* renamed from: k */
    public static final C55247lh f145477k;

    /* renamed from: m */
    private static volatile C63010eb f145478m;

    /* renamed from: a */
    public int f145479a;

    /* renamed from: b */
    public String f145480b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f145481c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f145482d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f145483e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f145484f;

    /* renamed from: g */
    public String f145485g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C62961ch f145486h = emptyIntList();

    /* renamed from: j */
    public C55136he f145487j;

    /* renamed from: l */
    private byte f145488l = 2;

    static {
        C55247lh lhVar = new C55247lh();
        f145477k = lhVar;
        C62942bv.registerDefaultInstance(C55247lh.class, lhVar);
    }

    private C55247lh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145488l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145488l = b;
                return null;
            case 2:
                return newMessageInfo(f145477k, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0004\u0004ဈ\u0005\u0007ဌ\u0006\bဈ\u0007\n\u001e\u000bᐉ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C55418u.f146030a, C30325g.f82003a, C19618h.f54585a, C55018cv.m87559b(), "j"});
            case 3:
                return new C55247lh();
            case 4:
                return new C55246lg();
            case 5:
                return f145477k;
            case 6:
                C63010eb ebVar = f145478m;
                if (ebVar == null) {
                    synchronized (C55247lh.class) {
                        ebVar = f145478m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145477k);
                            f145478m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
