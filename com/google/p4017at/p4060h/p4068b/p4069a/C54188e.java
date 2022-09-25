package com.google.p4017at.p4060h.p4068b.p4069a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4671b.C61818k;
import com.google.p395al.p417d.p418a.C8584k;
import com.google.p4463ce.p4475b.C58058c;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58131b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4813ah.p4814a.p4815a.C63171d;

/* renamed from: com.google.at.h.b.a.e */
/* compiled from: PG */
public final class C54188e extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54188e f142203f;

    /* renamed from: l */
    private static volatile C63010eb f142204l;

    /* renamed from: a */
    public int f142205a;

    /* renamed from: b */
    public C58131b f142206b;

    /* renamed from: c */
    public C61818k f142207c;

    /* renamed from: d */
    public int f142208d;

    /* renamed from: e */
    public C8584k f142209e;

    /* renamed from: g */
    private C62995dn f142210g = C62995dn.f170057a;

    /* renamed from: h */
    private C62995dn f142211h = C62995dn.f170057a;

    /* renamed from: i */
    private C58058c f142212i;

    /* renamed from: j */
    private C63171d f142213j;

    /* renamed from: k */
    private byte f142214k = 2;

    static {
        C54188e eVar = new C54188e();
        f142203f = eVar;
        C62942bv.registerDefaultInstance(C54188e.class, eVar);
    }

    private C54188e() {
    }

    /* renamed from: a */
    public final C62995dn mo54075a() {
        C62995dn dnVar = this.f142210g;
        if (!dnVar.f170058b) {
            this.f142210g = dnVar.mo58980a();
        }
        return this.f142210g;
    }

    /* renamed from: b */
    public final C62995dn mo54076b() {
        C62995dn dnVar = this.f142211h;
        if (!dnVar.f170058b) {
            this.f142211h = dnVar.mo58980a();
        }
        return this.f142211h;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142214k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142214k = b;
                return null;
            case 2:
                return newMessageInfo(f142203f, "\u0001\b\u0000\u0001\u0001\n\b\u0002\u0000\u0002\u00012\u00022\u0003ဉ\u0000\u0005ᐉ\u0001\u0006ဉ\u0002\u0007ဌ\u0003\tဉ\u0005\nᐉ\u0006", new Object[]{"a", C30325g.f82003a, C54186c.f142201a, C19618h.f54585a, C54187d.f142202a, "b", C45240c.f118157a, "i", "d", C54199p.f142242a, "e", "j"});
            case 3:
                return new C54188e();
            case 4:
                return new C54185b();
            case 5:
                return f142203f;
            case 6:
                C63010eb ebVar = f142204l;
                if (ebVar == null) {
                    synchronized (C54188e.class) {
                        ebVar = f142204l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142203f);
                            f142204l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
