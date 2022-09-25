package com.google.assistant.p3886c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62965cl;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.ec */
/* compiled from: PG */
public final class C50833ec extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C50833ec f132349k;

    /* renamed from: l */
    public static final C62965cl f132350l = new C62965cl(C50832eb.f132346f, C50832eb.UNDEFINED);

    /* renamed from: m */
    private static volatile C63010eb f132351m;

    /* renamed from: a */
    public int f132352a;

    /* renamed from: b */
    public C62995dn f132353b = C62995dn.f170057a;

    /* renamed from: c */
    public C62995dn f132354c;

    /* renamed from: d */
    public C62995dn f132355d;

    /* renamed from: e */
    public C62995dn f132356e;

    /* renamed from: f */
    public int f132357f;

    /* renamed from: g */
    public int f132358g;

    /* renamed from: h */
    public boolean f132359h;

    /* renamed from: i */
    public boolean f132360i;

    /* renamed from: j */
    public boolean f132361j;

    static {
        C50833ec ecVar = new C50833ec();
        f132349k = ecVar;
        C62942bv.registerDefaultInstance(C50833ec.class, ecVar);
    }

    private C50833ec() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f132354c = dnVar;
        this.f132355d = dnVar;
        this.f132356e = dnVar;
    }

    /* renamed from: a */
    public final C62995dn mo53480a() {
        C62995dn dnVar = this.f132353b;
        if (!dnVar.f170058b) {
            this.f132353b = dnVar.mo58980a();
        }
        return this.f132353b;
    }

    /* renamed from: b */
    public final C62995dn mo53481b() {
        C62995dn dnVar = this.f132354c;
        if (!dnVar.f170058b) {
            this.f132354c = dnVar.mo58980a();
        }
        return this.f132354c;
    }

    /* renamed from: c */
    public final C62995dn mo53482c() {
        C62995dn dnVar = this.f132355d;
        if (!dnVar.f170058b) {
            this.f132355d = dnVar.mo58980a();
        }
        return this.f132355d;
    }

    /* renamed from: d */
    public final C62995dn mo53483d() {
        C62995dn dnVar = this.f132356e;
        if (!dnVar.f170058b) {
            this.f132356e = dnVar.mo58980a();
        }
        return this.f132356e;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f132349k, "\u0001\t\u0000\u0001\u0001\t\t\u0004\u0000\u0000\u00012\u00022\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0000\u0007င\u0001\b2\t࠲", new Object[]{"a", "b", C50824du.f132336a, "d", C50826dw.f132338a, C19618h.f54585a, "i", "j", C10662f.f35572a, C30325g.f82003a, C45240c.f118157a, C50825dv.f132337a, "e", C50828dy.f132339a, C50832eb.m85964b()});
            case 3:
                return new C50833ec();
            case 4:
                return new C50827dx();
            case 5:
                return f132349k;
            case 6:
                C63010eb ebVar = f132351m;
                if (ebVar == null) {
                    synchronized (C50833ec.class) {
                        ebVar = f132351m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132349k);
                            f132351m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
