package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c;

import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p375ai.p378b.C7692gk;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8025st;
import com.google.p375ai.p378b.C8034tb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.ah */
/* compiled from: PG */
public final class C104491ah extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C104491ah f290608o;

    /* renamed from: q */
    private static volatile C63010eb f290609q;

    /* renamed from: a */
    public int f290610a;

    /* renamed from: b */
    public C8025st f290611b;

    /* renamed from: c */
    public C8034tb f290612c;

    /* renamed from: d */
    public C9278v f290613d;

    /* renamed from: e */
    public int f290614e;

    /* renamed from: f */
    public C7718hj f290615f;

    /* renamed from: g */
    public C7718hj f290616g;

    /* renamed from: h */
    public int f290617h;

    /* renamed from: i */
    public int f290618i;

    /* renamed from: j */
    public int f290619j = -1;

    /* renamed from: k */
    public int f290620k = -1;

    /* renamed from: l */
    public int f290621l = -1;

    /* renamed from: m */
    public int f290622m;

    /* renamed from: n */
    public boolean f290623n;

    /* renamed from: p */
    private byte f290624p = 2;

    static {
        C104491ah ahVar = new C104491ah();
        f290608o = ahVar;
        C62942bv.registerDefaultInstance(C104491ah.class, ahVar);
    }

    private C104491ah() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f290624p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f290624p = b;
                return null;
            case 2:
                return newMessageInfo(f290608o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ᐉ\u0002\u0005ဌ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bင\u0006\tင\u0007\nင\b\u000bင\t\fင\n\rင\u000b\u000eဇ\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C7692gk.f26860a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C104491ah();
            case 4:
                return new C104490ag();
            case 5:
                return f290608o;
            case 6:
                C63010eb ebVar = f290609q;
                if (ebVar == null) {
                    synchronized (C104491ah.class) {
                        ebVar = f290609q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290608o);
                            f290609q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
