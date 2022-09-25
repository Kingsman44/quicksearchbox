package com.google.p4160bf.p4161a.p4163b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.cc */
/* compiled from: PG */
public final class C55493cc extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C55493cc f146431l;

    /* renamed from: m */
    private static volatile C63010eb f146432m;

    /* renamed from: a */
    public int f146433a;

    /* renamed from: b */
    public int f146434b;

    /* renamed from: c */
    public String f146435c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f146436d;

    /* renamed from: e */
    public C62971cq f146437e = emptyProtobufList();

    /* renamed from: f */
    public long f146438f;

    /* renamed from: g */
    public int f146439g;

    /* renamed from: h */
    public C55500h f146440h;

    /* renamed from: i */
    public C55474bk f146441i;

    /* renamed from: j */
    public int f146442j;

    /* renamed from: k */
    public int f146443k;

    static {
        C55493cc ccVar = new C55493cc();
        f146431l = ccVar;
        C62942bv.registerDefaultInstance(C55493cc.class, ccVar);
    }

    private C55493cc() {
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
                return newMessageInfo(f146431l, "\u0001\n\u0000\u0001\u0001\"\n\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0005ဉ\u0007\tဌ\u0002\nဌ\f\u000bဂ\u0003\f\u001b\rဌ\r\u000eဉ\u000b\"ဌ\u0006", new Object[]{"a", "b", C55489bz.m87699b(), C45240c.f118157a, C19618h.f54585a, "d", C55484bu.f146378a, "j", C55486bw.f146379a, C10662f.f35572a, "e", C55492cb.class, C19621k.f54601a, C55459aw.f146318a, "i", C30325g.f82003a, C55506n.f146479a});
            case 3:
                return new C55493cc();
            case 4:
                return new C55485bv();
            case 5:
                return f146431l;
            case 6:
                C63010eb ebVar = f146432m;
                if (ebVar == null) {
                    synchronized (C55493cc.class) {
                        ebVar = f146432m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146431l);
                            f146432m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
