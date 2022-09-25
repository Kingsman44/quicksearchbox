package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66244fd;
import com.google.protos.youtube.elements.C66251i;
import com.google.protos.youtube.elements.C66256n;
import com.google.protos.youtube.elements.C66257o;

/* renamed from: com.google.protos.aw.c.a.a.a.a.b.b.p */
/* compiled from: PG */
public final class C64131p extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C64131p f173388i;

    /* renamed from: j */
    public static final C62940bt f173389j;

    /* renamed from: l */
    private static volatile C63010eb f173390l;

    /* renamed from: a */
    public int f173391a;

    /* renamed from: b */
    public long f173392b;

    /* renamed from: c */
    public C64129n f173393c;

    /* renamed from: d */
    public C66256n f173394d;

    /* renamed from: e */
    public int f173395e;

    /* renamed from: f */
    public float f173396f;

    /* renamed from: g */
    public int f173397g;

    /* renamed from: h */
    public int f173398h;

    /* renamed from: k */
    private byte f173399k = 2;

    static {
        C64131p pVar = new C64131p();
        f173388i = pVar;
        C62942bv.registerDefaultInstance(C64131p.class, pVar);
        f173389j = C62942bv.newSingularGeneratedExtension(C66244fd.f180131a, pVar, pVar, (C62958ce) null, 309765337, C63066gd.MESSAGE, C64131p.class);
    }

    private C64131p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173399k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173399k = b;
                return null;
            case 2:
                return newMessageInfo(f173388i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ᐉ\u0002\u0002ဂ\u0000\u0003ဋ\u0003\u0004ခ\u0004\u0005ဌ\u0005\u0006ဌ\u0006\u0007ဉ\u0001", new Object[]{"a", "d", "b", "e", C10662f.f35572a, C30325g.f82003a, C66257o.f180165a, C19618h.f54585a, C66251i.f180146a, C45240c.f118157a});
            case 3:
                return new C64131p();
            case 4:
                return new C64130o();
            case 5:
                return f173388i;
            case 6:
                C63010eb ebVar = f173390l;
                if (ebVar == null) {
                    synchronized (C64131p.class) {
                        ebVar = f173390l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173388i);
                            f173390l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
