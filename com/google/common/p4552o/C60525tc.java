package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.common.o.tc */
/* compiled from: PG */
public final class C60525tc extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C60525tc f163884r;

    /* renamed from: s */
    private static volatile C63010eb f163885s;

    /* renamed from: a */
    public int f163886a;

    /* renamed from: b */
    public boolean f163887b;

    /* renamed from: c */
    public boolean f163888c;

    /* renamed from: d */
    public boolean f163889d;

    /* renamed from: e */
    public boolean f163890e;

    /* renamed from: f */
    public boolean f163891f;

    /* renamed from: g */
    public boolean f163892g;

    /* renamed from: h */
    public boolean f163893h;

    /* renamed from: i */
    public boolean f163894i;

    /* renamed from: j */
    public int f163895j;

    /* renamed from: k */
    public int f163896k;

    /* renamed from: l */
    public int f163897l;

    /* renamed from: m */
    public int f163898m;

    /* renamed from: n */
    public boolean f163899n;

    /* renamed from: o */
    public boolean f163900o;

    /* renamed from: p */
    public boolean f163901p;

    /* renamed from: q */
    public int f163902q;

    static {
        C60525tc tcVar = new C60525tc();
        f163884r = tcVar;
        C62942bv.registerDefaultInstance(C60525tc.class, tcVar);
    }

    private C60525tc() {
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
                return newMessageInfo(f163884r, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဋ\b\nဋ\t\u000bဋ\n\u000eဋ\r\u000fဇ\u000e\u0010ဇ\u000f\u0011ဇ\u0010\u0012ဋ\u0011", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q"});
            case 3:
                return new C60525tc();
            case 4:
                return new C60524tb();
            case 5:
                return f163884r;
            case 6:
                C63010eb ebVar = f163885s;
                if (ebVar == null) {
                    synchronized (C60525tc.class) {
                        ebVar = f163885s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163884r);
                            f163885s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
