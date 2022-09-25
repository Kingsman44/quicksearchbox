package com.google.assistant.p3994s.p3995a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3929l.p3930a.C52777eb;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4816ai.p4818b.C63204j;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.assistant.s.a.nh */
/* compiled from: PG */
public final class C53422nh extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C53422nh f140182m;

    /* renamed from: q */
    private static volatile C63010eb f140183q;

    /* renamed from: a */
    public int f140184a;

    /* renamed from: b */
    public C53413mz f140185b;

    /* renamed from: c */
    public boolean f140186c;

    /* renamed from: d */
    public C53407mt f140187d;

    /* renamed from: e */
    public C53370lj f140188e;

    /* renamed from: f */
    public C53356kw f140189f;

    /* renamed from: g */
    public C63088z f140190g;

    /* renamed from: h */
    public long f140191h;

    /* renamed from: i */
    public boolean f140192i;

    /* renamed from: j */
    public int f140193j;

    /* renamed from: k */
    public C53399ml f140194k;

    /* renamed from: l */
    public C63204j f140195l;

    /* renamed from: n */
    private C53384lx f140196n;

    /* renamed from: o */
    private C52777eb f140197o;

    /* renamed from: p */
    private byte f140198p = 2;

    static {
        C53422nh nhVar = new C53422nh();
        f140182m = nhVar;
        C62942bv.registerDefaultInstance(C53422nh.class, nhVar);
    }

    private C53422nh() {
        emptyProtobufList();
        emptyProtobufList();
        this.f140190g = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140198p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140198p = b;
                return null;
            case 2:
                return newMessageInfo(f140182m, "\u0001\r\u0000\u0001\u0002\u0012\r\u0000\u0000\u0004\u0002ᐉ\u0000\u0003ᐉ\u0004\u0004ဉ\u0005\u0005ဉ\u0002\u0006ည\u0006\u0007ဂ\u0007\tဇ\b\nဌ\t\u000bᐉ\n\fဇ\u0001\u000fဉ\f\u0011ᐉ\u000e\u0012ဉ\u000f", new Object[]{"a", "b", "e", C10662f.f35572a, "d", C30325g.f82003a, C19618h.f54585a, "i", "j", C53306j.m86810b(), C48004n.f124238a, C45240c.f118157a, C19621k.f54601a, "l", C66412o.f180592a});
            case 3:
                return new C53422nh();
            case 4:
                return new C53421ng();
            case 5:
                return f140182m;
            case 6:
                C63010eb ebVar = f140183q;
                if (ebVar == null) {
                    synchronized (C53422nh.class) {
                        ebVar = f140183q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140182m);
                            f140183q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
