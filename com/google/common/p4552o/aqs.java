package com.google.common.p4552o;

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
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.common.o.aqs */
/* compiled from: PG */
public final class aqs extends C62937bq implements C62938br {

    /* renamed from: k */
    public static final aqs f159780k;

    /* renamed from: m */
    private static volatile C63010eb f159781m;

    /* renamed from: a */
    public int f159782a;

    /* renamed from: b */
    public int f159783b;

    /* renamed from: c */
    public int f159784c = -1;

    /* renamed from: d */
    public C62961ch f159785d = emptyIntList();

    /* renamed from: e */
    public String f159786e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f159787f;

    /* renamed from: g */
    public C63204j f159788g;

    /* renamed from: h */
    public int f159789h;

    /* renamed from: i */
    public int f159790i = -1;

    /* renamed from: j */
    public C60411pf f159791j;

    /* renamed from: l */
    private byte f159792l = 2;

    static {
        aqs aqs = new aqs();
        f159780k = aqs;
        C62942bv.registerDefaultInstance(aqs.class, aqs);
    }

    private aqs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f159792l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f159792l = b;
                return null;
            case 2:
                return newMessageInfo(f159780k, "\u0001\t\u0000\u0001\u0001è\t\u0000\u0001\u0002\u0001င\u0000\u0003င\u0001\u0004\u0016\u0005ဈ\u0002\u0006ဌ\u0005\u0007င\u0003\u000bᐉ\u0004င\u0007èᐉ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C19618h.f54585a, aqq.f159779a, C10662f.f35572a, C30325g.f82003a, "i", "j"});
            case 3:
                return new aqs();
            case 4:
                return new aqp();
            case 5:
                return f159780k;
            case 6:
                C63010eb ebVar = f159781m;
                if (ebVar == null) {
                    synchronized (aqs.class) {
                        ebVar = f159781m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159780k);
                            f159781m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
