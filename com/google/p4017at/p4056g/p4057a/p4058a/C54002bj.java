package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62450c;
import com.google.lens.p4707j.C62496ds;
import com.google.lens.p4707j.C62588v;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56251be;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4963bf.p4964a.p4965a.C64573av;
import com.google.protos.p4963bf.p4964a.p4965a.C64591bm;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.at.g.a.a.bj */
/* compiled from: PG */
public final class C54002bj extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C54002bj f141677q;

    /* renamed from: s */
    private static volatile C63010eb f141678s;

    /* renamed from: a */
    public C56244ay f141679a;

    /* renamed from: b */
    public C63088z f141680b = C63088z.f170246b;

    /* renamed from: c */
    public C54022cc f141681c;

    /* renamed from: d */
    public C54064p f141682d;

    /* renamed from: e */
    public C54001bi f141683e;

    /* renamed from: f */
    public C56251be f141684f;

    /* renamed from: g */
    public C53988aw f141685g;

    /* renamed from: h */
    public int f141686h;

    /* renamed from: i */
    public C62496ds f141687i;

    /* renamed from: j */
    public C62588v f141688j;

    /* renamed from: k */
    public C62971cq f141689k = emptyProtobufList();

    /* renamed from: l */
    public C53999bg f141690l;

    /* renamed from: m */
    public C53990ay f141691m;

    /* renamed from: n */
    public C62450c f141692n;

    /* renamed from: o */
    public C64573av f141693o;

    /* renamed from: p */
    public C64591bm f141694p;

    /* renamed from: r */
    private byte f141695r = 2;

    static {
        C54002bj bjVar = new C54002bj();
        f141677q = bjVar;
        C62942bv.registerDefaultInstance(C54002bj.class, bjVar);
    }

    private C54002bj() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141695r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141695r = b;
                return null;
            case 2:
                return newMessageInfo(f141677q, "\u0000\u0010\u0000\u0000\u0001\u001c\u0010\u0000\u0001\u0004\u0001\t\u0002\t\u0003Љ\u0004Љ\t\t\f\t\r\f\u000e\t\u0011Л\u0014\t\u0016\t\u0017\t\u0018\t\u0019Љ\u001a\n\u001c\t", new Object[]{"a", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C19621k.f54601a, C53986au.class, "j", C48004n.f124238a, C66412o.f180592a, "l", "p", "b", "m"});
            case 3:
                return new C54002bj();
            case 4:
                return new C53984as();
            case 5:
                return f141677q;
            case 6:
                C63010eb ebVar = f141678s;
                if (ebVar == null) {
                    synchronized (C54002bj.class) {
                        ebVar = f141678s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141677q);
                            f141678s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
