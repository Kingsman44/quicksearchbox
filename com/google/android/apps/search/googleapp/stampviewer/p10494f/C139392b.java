package com.google.android.apps.search.googleapp.stampviewer.p10494f;

import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.f.b */
/* compiled from: PG */
public final class C139392b extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C139392b f379029j;

    /* renamed from: l */
    private static volatile C63010eb f379030l;

    /* renamed from: a */
    public int f379031a;

    /* renamed from: b */
    public C56610b f379032b;

    /* renamed from: c */
    public boolean f379033c;

    /* renamed from: d */
    public C63204j f379034d;

    /* renamed from: e */
    public boolean f379035e;

    /* renamed from: f */
    public boolean f379036f;

    /* renamed from: g */
    public int f379037g;

    /* renamed from: h */
    public int f379038h;

    /* renamed from: i */
    public boolean f379039i;

    /* renamed from: k */
    private byte f379040k = 2;

    static {
        C139392b bVar = new C139392b();
        f379029j = bVar;
        C62942bv.registerDefaultInstance(C139392b.class, bVar);
    }

    private C139392b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f379040k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f379040k = b;
                return null;
            case 2:
                return newMessageInfo(f379029j, "\u0001\b\u0000\u0001\u0004\u000f\b\u0000\u0000\u0001\u0004ဇ\u0001\u0006ᐉ\u0002\nဇ\u0003\u000bဇ\u0004\fဌ\u0005\rဋ\u0006\u000eဉ\u0000\u000fဇ\u0007", new Object[]{"a", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C139343y.m226484b(), C19618h.f54585a, "b", "i"});
            case 3:
                return new C139392b();
            case 4:
                return new C139391a();
            case 5:
                return f379029j;
            case 6:
                C63010eb ebVar = f379030l;
                if (ebVar == null) {
                    synchronized (C139392b.class) {
                        ebVar = f379030l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f379029j);
                            f379030l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
