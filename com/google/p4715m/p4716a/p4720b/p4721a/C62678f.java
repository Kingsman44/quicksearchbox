package com.google.p4715m.p4716a.p4720b.p4721a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.b.a.f */
/* compiled from: PG */
public final class C62678f extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C62678f f169215k;

    /* renamed from: l */
    private static volatile C63010eb f169216l;

    /* renamed from: a */
    public int f169217a;

    /* renamed from: b */
    public long f169218b;

    /* renamed from: c */
    public String f169219c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f169220d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f169221e;

    /* renamed from: f */
    public String f169222f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f169223g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C62971cq f169224h = C62942bv.emptyProtobufList();

    /* renamed from: i */
    public C62674b f169225i;

    /* renamed from: j */
    public int f169226j;

    static {
        C62678f fVar = new C62678f();
        f169215k = fVar;
        C62942bv.registerDefaultInstance(C62678f.class, fVar);
    }

    private C62678f() {
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
                return newMessageInfo(f169215k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\bဈ\u0007\tဈ\b\n\u001a\u000bဉ\t\fဌ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C62676d.f169214a});
            case 3:
                return new C62678f();
            case 4:
                return new C62675c();
            case 5:
                return f169215k;
            case 6:
                C63010eb ebVar = f169216l;
                if (ebVar == null) {
                    synchronized (C62678f.class) {
                        ebVar = f169216l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169215k);
                            f169216l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
