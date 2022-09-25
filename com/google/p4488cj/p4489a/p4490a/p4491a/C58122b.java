package com.google.p4488cj.p4489a.p4490a.p4491a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4488cj.p4489a.p4490a.C58125b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.cj.a.a.a.b */
/* compiled from: PG */
public final class C58122b extends C62937bq implements C62938br {

    /* renamed from: p */
    public static final C58122b f155367p;

    /* renamed from: r */
    private static volatile C63010eb f155368r;

    /* renamed from: a */
    public int f155369a;

    /* renamed from: b */
    public float f155370b;

    /* renamed from: c */
    public float f155371c;

    /* renamed from: d */
    public float f155372d;

    /* renamed from: e */
    public float f155373e;

    /* renamed from: f */
    public float f155374f;

    /* renamed from: g */
    public C58125b f155375g;

    /* renamed from: h */
    public long f155376h;

    /* renamed from: i */
    public int f155377i = -1;

    /* renamed from: j */
    public float f155378j;

    /* renamed from: k */
    public float f155379k;

    /* renamed from: l */
    public boolean f155380l;

    /* renamed from: m */
    public boolean f155381m;

    /* renamed from: n */
    public boolean f155382n;

    /* renamed from: o */
    public boolean f155383o;

    /* renamed from: q */
    private byte f155384q = 2;

    static {
        C58122b bVar = new C58122b();
        f155367p = bVar;
        C62942bv.registerDefaultInstance(C58122b.class, bVar);
    }

    private C58122b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f155384q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f155384q = b;
                return null;
            case 2:
                return newMessageInfo(f155367p, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဂ\u0006\u0006င\u0007\u0007ခ\u0004\bခ\b\tဉ\u0005\nခ\t\u000bဇ\n\fဇ\u000b\u000fဇ\u000e\u0010ဇ\u000f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C19618h.f54585a, "i", C10662f.f35572a, "j", C30325g.f82003a, C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a});
            case 3:
                return new C58122b();
            case 4:
                return new C58121a();
            case 5:
                return f155367p;
            case 6:
                C63010eb ebVar = f155368r;
                if (ebVar == null) {
                    synchronized (C58122b.class) {
                        ebVar = f155368r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155367p);
                            f155368r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
