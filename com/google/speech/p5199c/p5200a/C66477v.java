package com.google.speech.p5199c.p5200a;

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

/* renamed from: com.google.speech.c.a.v */
/* compiled from: PG */
public final class C66477v extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C66477v f180755j;

    /* renamed from: l */
    private static volatile C63010eb f180756l;

    /* renamed from: a */
    public int f180757a;

    /* renamed from: b */
    public C66457b f180758b;

    /* renamed from: c */
    public long f180759c;

    /* renamed from: d */
    public long f180760d;

    /* renamed from: e */
    public int f180761e;

    /* renamed from: f */
    public int f180762f;

    /* renamed from: g */
    public long f180763g;

    /* renamed from: h */
    public int f180764h;

    /* renamed from: i */
    public C62971cq f180765i = emptyProtobufList();

    /* renamed from: k */
    private C66474s f180766k;

    static {
        C66477v vVar = new C66477v();
        f180755j = vVar;
        C62942bv.registerDefaultInstance(C66477v.class, vVar);
    }

    private C66477v() {
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
                return newMessageInfo(f180755j, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0006င\u0005\u0007ဂ\u0006\nဉ\n\u000bင\t\f\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19621k.f54601a, C19618h.f54585a, "i", C66476u.class});
            case 3:
                return new C66477v();
            case 4:
                return new C66469n();
            case 5:
                return f180755j;
            case 6:
                C63010eb ebVar = f180756l;
                if (ebVar == null) {
                    synchronized (C66477v.class) {
                        ebVar = f180756l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180755j);
                            f180756l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
