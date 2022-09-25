package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90273b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7669fo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.h */
/* compiled from: PG */
public final class C91801h extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C91801h f256011n;

    /* renamed from: p */
    private static volatile C63010eb f256012p;

    /* renamed from: a */
    public int f256013a;

    /* renamed from: b */
    public boolean f256014b;

    /* renamed from: c */
    public boolean f256015c;

    /* renamed from: d */
    public boolean f256016d;

    /* renamed from: e */
    public boolean f256017e;

    /* renamed from: f */
    public C7669fo f256018f;

    /* renamed from: g */
    public C62971cq f256019g = emptyProtobufList();

    /* renamed from: h */
    public String f256020h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f256021i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C91788al f256022j;

    /* renamed from: k */
    public boolean f256023k;

    /* renamed from: l */
    public String f256024l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public boolean f256025m;

    /* renamed from: o */
    private byte f256026o = 2;

    static {
        C91801h hVar = new C91801h();
        f256011n = hVar;
        C62942bv.registerDefaultInstance(C91801h.class, hVar);
    }

    private C91801h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f256026o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f256026o = b;
                return null;
            case 2:
                return newMessageInfo(f256011n, "\u0001\f\u0000\u0001\u0002\u0013\f\u0000\u0001\u0002\u0002ဇ\u0001\u0004ဇ\u0002\u0005ဇ\u0003\nဇ\u0004\u000bဉ\u0005\fЛ\u000eဈ\u0006\u000fဈ\u0007\u0010ᐉ\b\u0011ဇ\t\u0012ဈ\n\u0013ဇ\u000b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C90273b.class, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C91801h();
            case 4:
                return new C91800g();
            case 5:
                return f256011n;
            case 6:
                C63010eb ebVar = f256012p;
                if (ebVar == null) {
                    synchronized (C91801h.class) {
                        ebVar = f256012p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256011n);
                            f256012p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
