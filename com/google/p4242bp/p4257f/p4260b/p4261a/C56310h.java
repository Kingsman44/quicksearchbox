package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4699e.C62189ab;
import com.google.lens.p4699e.C62191ad;
import com.google.lens.p4699e.C62225f;
import com.google.lens.p4699e.C62227h;
import com.google.lens.p4699e.C62229j;
import com.google.lens.p4699e.C62231l;
import com.google.lens.p4699e.C62233n;
import com.google.lens.p4699e.C62235p;
import com.google.lens.p4699e.C62237r;
import com.google.lens.p4699e.C62243x;
import com.google.lens.p4699e.C62245z;
import com.google.lens.p4700f.C62249d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.h */
/* compiled from: PG */
public final class C56310h extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C56310h f150072g;

    /* renamed from: h */
    private static volatile C63010eb f150073h;

    /* renamed from: a */
    public int f150074a;

    /* renamed from: b */
    public int f150075b = 0;

    /* renamed from: c */
    public Object f150076c;

    /* renamed from: d */
    public C56235ap f150077d;

    /* renamed from: e */
    public C62971cq f150078e;

    /* renamed from: f */
    public C62249d f150079f;

    static {
        C56310h hVar = new C56310h();
        f150072g = hVar;
        C62942bv.registerDefaultInstance(C56310h.class, hVar);
    }

    private C56310h() {
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        this.f150078e = emptyProtobufList();
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
                return newMessageInfo(f150072g, "\u0001\u000e\u0001\u0001\u0004\u0011\u000e\u0000\u0001\u0000\u0004ဉ\u0000\u0005ြ\u0000\u0006\u001b\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rဉ\f\u000eြ\u0000\u000fြ\u0000\u0010ြ\u0000\u0011ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C62231l.class, "e", C56241av.class, C62243x.class, C62227h.class, C62191ad.class, C62225f.class, C62189ab.class, C62237r.class, C10662f.f35572a, C62233n.class, C62245z.class, C62235p.class, C62229j.class});
            case 3:
                return new C56310h();
            case 4:
                return new C56309g();
            case 5:
                return f150072g;
            case 6:
                C63010eb ebVar = f150073h;
                if (ebVar == null) {
                    synchronized (C56310h.class) {
                        ebVar = f150073h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150072g);
                            f150073h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
