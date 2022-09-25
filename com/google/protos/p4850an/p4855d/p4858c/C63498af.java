package com.google.protos.p4850an.p4855d.p4858c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4850an.C63352aw;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.protos.an.d.c.af */
/* compiled from: PG */
public final class C63498af extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63498af f171734e;

    /* renamed from: f */
    public static final C62940bt f171735f;

    /* renamed from: t */
    private static volatile C63010eb f171736t;

    /* renamed from: a */
    public int f171737a;

    /* renamed from: b */
    public boolean f171738b;

    /* renamed from: c */
    public C62971cq f171739c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f171740d;

    /* renamed from: g */
    private int f171741g;

    /* renamed from: h */
    private boolean f171742h;

    /* renamed from: i */
    private boolean f171743i;

    /* renamed from: j */
    private boolean f171744j;

    /* renamed from: k */
    private boolean f171745k;

    /* renamed from: l */
    private boolean f171746l;

    /* renamed from: m */
    private C63496ad f171747m;

    /* renamed from: n */
    private C63529bj f171748n;

    /* renamed from: o */
    private C63518az f171749o;

    /* renamed from: p */
    private C63545r f171750p;

    /* renamed from: q */
    private C63525bf f171751q;

    /* renamed from: r */
    private C63543p f171752r;

    /* renamed from: s */
    private byte f171753s = 2;

    static {
        C63498af afVar = new C63498af();
        f171734e = afVar;
        C62942bv.registerDefaultInstance(C63498af.class, afVar);
        f171735f = C62942bv.newSingularGeneratedExtension(C63352aw.f171196a, afVar, afVar, (C62958ce) null, 56889045, C63066gd.MESSAGE, C63498af.class);
    }

    private C63498af() {
        emptyProtobufList();
        emptyProtobufList();
        this.f171740d = emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171753s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171753s = b;
                return null;
            case 2:
                return newMessageInfo(f171734e, "\u0001\u000e\u0000\u0002\u0001;\u000e\u0000\u0002\b\u0001ဇ\u0000\u0005Л\nЛ\fဇ\n\rဇ\u000b\u000eဇ\f\u000fဇ\r\u0010ဇ\u000e\u0011ᐉ.3ᐉ*5ᐉ+7ᐉ,:ᐉ-;ᐉ;", new Object[]{"a", C30325g.f82003a, "b", C45240c.f118157a, C63541n.class, "d", C63500ah.class, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "q", "m", C48004n.f124238a, C66412o.f180592a, "p", C33259r.f88929b});
            case 3:
                return new C63498af();
            case 4:
                return new C63497ae();
            case 5:
                return f171734e;
            case 6:
                C63010eb ebVar = f171736t;
                if (ebVar == null) {
                    synchronized (C63498af.class) {
                        ebVar = f171736t;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171734e);
                            f171736t = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
