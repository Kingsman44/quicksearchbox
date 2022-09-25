package com.google.android.apps.auto.p450a.p451a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.auto.p450a.p452b.C8936b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4556c.C59676c;
import com.google.common.p4552o.p4556c.C59678e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.bk */
/* compiled from: PG */
public final class C8893bk extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C8893bk f30858l;

    /* renamed from: n */
    private static volatile C63010eb f30859n;

    /* renamed from: a */
    public int f30860a;

    /* renamed from: b */
    public int f30861b;

    /* renamed from: c */
    public String f30862c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f30863d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f30864e = emptyProtobufList();

    /* renamed from: f */
    public long f30865f;

    /* renamed from: g */
    public long f30866g;

    /* renamed from: h */
    public int f30867h;

    /* renamed from: i */
    public C8936b f30868i;

    /* renamed from: j */
    public int f30869j;

    /* renamed from: k */
    public boolean f30870k;

    /* renamed from: m */
    private int f30871m;

    static {
        C8893bk bkVar = new C8893bk();
        f30858l = bkVar;
        C62942bv.registerDefaultInstance(C8893bk.class, bkVar);
    }

    private C8893bk() {
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
                return newMessageInfo(f30858l, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0007\u001b\bဂ\u0004\tဂ\u0005\nဌ\u0006\u000bဉ\u0007\fဌ\b\rဇ\t", new Object[]{"m", "a", "b", C45240c.f118157a, "d", "e", C8892bj.class, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C59678e.f160008a, "i", "j", C59676c.f160007a, C19621k.f54601a});
            case 3:
                return new C8893bk();
            case 4:
                return new C8890bh();
            case 5:
                return f30858l;
            case 6:
                C63010eb ebVar = f30859n;
                if (ebVar == null) {
                    synchronized (C8893bk.class) {
                        ebVar = f30859n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30858l);
                            f30859n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
