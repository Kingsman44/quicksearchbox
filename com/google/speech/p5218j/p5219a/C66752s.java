package com.google.speech.p5218j.p5219a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;
import com.google.speech.p5218j.C66760aa;
import com.google.speech.p5218j.C66764ae;
import com.google.speech.p5218j.C66880cz;
import com.google.speech.p5218j.C66906dw;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67153n;
import com.google.speech.p5218j.C67160ng;

/* renamed from: com.google.speech.j.a.s */
/* compiled from: PG */
public final class C66752s extends C62937bq implements C62938br {

    /* renamed from: q */
    public static final C66752s f181544q;

    /* renamed from: s */
    private static volatile C63010eb f181545s;

    /* renamed from: a */
    public int f181546a;

    /* renamed from: b */
    public boolean f181547b = true;

    /* renamed from: c */
    public boolean f181548c;

    /* renamed from: d */
    public int f181549d;

    /* renamed from: e */
    public C66745l f181550e;

    /* renamed from: f */
    public C66745l f181551f;

    /* renamed from: g */
    public C66722az f181552g;

    /* renamed from: h */
    public C66760aa f181553h;

    /* renamed from: i */
    public int f181554i;

    /* renamed from: j */
    public C67153n f181555j;

    /* renamed from: k */
    public C66880cz f181556k;

    /* renamed from: l */
    public int f181557l;

    /* renamed from: m */
    public C67050je f181558m;

    /* renamed from: n */
    public C66764ae f181559n;

    /* renamed from: o */
    public C66906dw f181560o;

    /* renamed from: p */
    public boolean f181561p;

    /* renamed from: r */
    private byte f181562r = 2;

    static {
        C66752s sVar = new C66752s();
        f181544q = sVar;
        C62942bv.registerDefaultInstance(C66752s.class, sVar);
    }

    private C66752s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181562r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181562r = b;
                return null;
            case 2:
                return newMessageInfo(f181544q, "\u0001\u000f\u0000\u0001\u0002f\u000f\u0000\u0000\u0002\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဉ\u0003\u0005ᐉ\u0005\u0006င\u0002\bဉ\u0006\tင\u0007\nဉ\b\u000bᐉ\t\u0010ဉ\u0004\u0011ဌ\u000f\u0014ဉ\u0011\u0015ဉ\u0012\u0016ဉ\u0013fဇ\u0014", new Object[]{"a", "b", C45240c.f118157a, "e", C30325g.f82003a, "d", C19618h.f54585a, "i", "j", C19621k.f54601a, C10662f.f35572a, "l", C67160ng.f182557a, "m", C48004n.f124238a, C66412o.f180592a, "p"});
            case 3:
                return new C66752s();
            case 4:
                return new C66751r();
            case 5:
                return f181544q;
            case 6:
                C63010eb ebVar = f181545s;
                if (ebVar == null) {
                    synchronized (C66752s.class) {
                        ebVar = f181545s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181544q);
                            f181545s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
