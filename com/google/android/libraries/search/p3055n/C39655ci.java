package com.google.android.libraries.search.p3055n;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.C66760aa;
import com.google.speech.p5218j.C66906dw;
import com.google.speech.p5218j.C66964g;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.p5219a.C66722az;

/* renamed from: com.google.android.libraries.search.n.ci */
/* compiled from: PG */
public final class C39655ci extends C62937bq implements C62938br {

    /* renamed from: j */
    public static final C39655ci f104377j;

    /* renamed from: k */
    public static final C62940bt f104378k;

    /* renamed from: m */
    private static volatile C63010eb f104379m;

    /* renamed from: a */
    public int f104380a;

    /* renamed from: b */
    public C39690f f104381b;

    /* renamed from: c */
    public C39276az f104382c;

    /* renamed from: d */
    public C39673d f104383d;

    /* renamed from: e */
    public C67050je f104384e;

    /* renamed from: f */
    public C66722az f104385f;

    /* renamed from: g */
    public int f104386g;

    /* renamed from: h */
    public C66906dw f104387h;

    /* renamed from: i */
    public C66760aa f104388i;

    /* renamed from: l */
    private byte f104389l = 2;

    static {
        C39655ci ciVar = new C39655ci();
        f104377j = ciVar;
        C62942bv.registerDefaultInstance(C39655ci.class, ciVar);
        f104378k = C62942bv.newSingularGeneratedExtension(C39670cx.f104424a, ciVar, ciVar, (C62958ce) null, 413019262, C63066gd.MESSAGE, C39655ci.class);
    }

    private C39655ci() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f104389l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f104389l = b;
                return null;
            case 2:
                return newMessageInfo(f104377j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ဌ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C66964g.m97397b(), C19618h.f54585a, "i"});
            case 3:
                return new C39655ci();
            case 4:
                return new C39654ch();
            case 5:
                return f104377j;
            case 6:
                C63010eb ebVar = f104379m;
                if (ebVar == null) {
                    synchronized (C39655ci.class) {
                        ebVar = f104379m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104377j);
                            f104379m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
