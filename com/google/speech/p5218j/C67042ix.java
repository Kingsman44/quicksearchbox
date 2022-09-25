package com.google.speech.p5218j;

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
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ix */
/* compiled from: PG */
public final class C67042ix extends C62937bq implements C62938br {

    /* renamed from: l */
    public static final C67042ix f182227l;

    /* renamed from: o */
    private static volatile C63010eb f182228o;

    /* renamed from: a */
    public int f182229a;

    /* renamed from: b */
    public C62971cq f182230b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C62971cq f182231c = emptyProtobufList();

    /* renamed from: d */
    public float f182232d;

    /* renamed from: e */
    public float f182233e;

    /* renamed from: f */
    public C67171p f182234f;

    /* renamed from: g */
    public C67091ks f182235g;

    /* renamed from: h */
    public int f182236h;

    /* renamed from: i */
    public C67095kw f182237i;

    /* renamed from: j */
    public int f182238j;

    /* renamed from: k */
    public C67024if f182239k;

    /* renamed from: m */
    private C67050je f182240m;

    /* renamed from: n */
    private byte f182241n = 2;

    static {
        C67042ix ixVar = new C67042ix();
        f182227l = ixVar;
        C62942bv.registerDefaultInstance(C67042ix.class, ixVar);
    }

    private C67042ix() {
    }

    /* renamed from: a */
    public final void mo59767a() {
        C62971cq cqVar = this.f182230b;
        if (!cqVar.mo58948c()) {
            this.f182230b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182241n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182241n = b;
                return null;
            case 2:
                return newMessageInfo(f182227l, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0002\u0001\u0001\u001a\u0002ခ\u0001\u0003ဉ\u0003\u0004ဉ\u0005\u0005ခ\u0000\u0006ဌ\u0006\u0007ဉ\u0007\nЛ\rဉ\u0004\u000fဌ\u000b\u0010ဉ\f", new Object[]{"a", "b", "e", C10662f.f35572a, C30325g.f82003a, "d", C19618h.f54585a, C67040iv.f182226a, "i", C45240c.f118157a, C67058jm.class, "m", "j", C67081ki.f182350a, C19621k.f54601a});
            case 3:
                return new C67042ix();
            case 4:
                return new C67039iu();
            case 5:
                return f182227l;
            case 6:
                C63010eb ebVar = f182228o;
                if (ebVar == null) {
                    synchronized (C67042ix.class) {
                        ebVar = f182228o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182227l);
                            f182228o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
