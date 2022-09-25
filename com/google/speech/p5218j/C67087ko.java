package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
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
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.speech.j.ko */
/* compiled from: PG */
public final class C67087ko extends C62937bq implements C62938br {

    /* renamed from: n */
    public static final C67087ko f182366n;

    /* renamed from: r */
    private static volatile C63010eb f182367r;

    /* renamed from: a */
    public int f182368a;

    /* renamed from: b */
    public C67050je f182369b;

    /* renamed from: c */
    public C67083kk f182370c;

    /* renamed from: d */
    public C67077ke f182371d;

    /* renamed from: e */
    public C67038it f182372e;

    /* renamed from: f */
    public C67026ih f182373f;

    /* renamed from: g */
    public String f182374g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C67117lr f182375h;

    /* renamed from: i */
    public C67171p f182376i;

    /* renamed from: j */
    public C67064js f182377j;

    /* renamed from: k */
    public C67046ja f182378k;

    /* renamed from: l */
    public C66917eg f182379l;

    /* renamed from: m */
    public C67056jk f182380m;

    /* renamed from: o */
    private C67139mm f182381o;

    /* renamed from: p */
    private C67093ku f182382p;

    /* renamed from: q */
    private byte f182383q = 2;

    static {
        C67087ko koVar = new C67087ko();
        f182366n = koVar;
        C62942bv.registerDefaultInstance(C67087ko.class, koVar);
    }

    private C67087ko() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182383q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182383q = b;
                return null;
            case 2:
                return newMessageInfo(f182366n, "\u0001\u000e\u0000\u0001\u0001\u001a\u000e\u0000\u0000\u0007\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0005ဉ\u0005\u0006ဈ\u0006\u0007ᐉ\u0007\bဉ\t\tဉ\u000e\nဉ\u000f\rဉ\u0012\u000eᐉ\u0013\u0014ᐉ\b\u0015ᐉ\u0002\u001aᐉ\u0018", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, C66412o.f180592a, "i", "j", C19621k.f54601a, "l", "m", C19618h.f54585a, "d", "p"});
            case 3:
                return new C67087ko();
            case 4:
                return new C67086kn();
            case 5:
                return f182366n;
            case 6:
                C63010eb ebVar = f182367r;
                if (ebVar == null) {
                    synchronized (C67087ko.class) {
                        ebVar = f182367r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182366n);
                            f182367r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
