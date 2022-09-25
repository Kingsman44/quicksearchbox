package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.assistant.s.b.ba */
/* compiled from: PG */
public final class C19167ba extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f53671c = new C19163ax();

    /* renamed from: e */
    public static final C62962ci f53672e = new C19164ay();

    /* renamed from: s */
    public static final C19167ba f53673s;

    /* renamed from: t */
    private static volatile C63010eb f53674t;

    /* renamed from: a */
    public int f53675a;

    /* renamed from: b */
    public C62961ch f53676b = emptyIntList();

    /* renamed from: d */
    public C62961ch f53677d = emptyIntList();

    /* renamed from: f */
    public boolean f53678f;

    /* renamed from: g */
    public boolean f53679g;

    /* renamed from: h */
    public boolean f53680h;

    /* renamed from: i */
    public boolean f53681i;

    /* renamed from: j */
    public double f53682j = 0.95d;

    /* renamed from: k */
    public double f53683k = 0.95d;

    /* renamed from: l */
    public int f53684l = 2;

    /* renamed from: m */
    public C19141ab f53685m;

    /* renamed from: n */
    public boolean f53686n;

    /* renamed from: o */
    public boolean f53687o;

    /* renamed from: p */
    public C62971cq f53688p = C62942bv.emptyProtobufList();

    /* renamed from: q */
    public C19145af f53689q;

    /* renamed from: r */
    public C19195w f53690r;

    static {
        C19167ba baVar = new C19167ba();
        f53673s = baVar;
        C62942bv.registerDefaultInstance(C19167ba.class, baVar);
    }

    private C19167ba() {
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
                return newMessageInfo(f53673s, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0003\u0000\u0001\u001e\u0002\u001e\u0003ဇ\u0000\u0004ဇ\u0001\u0005ဇ\u0002\u0006က\u0004\u0007က\u0005\bင\u0006\nဉ\u0007\u000bဇ\b\fဇ\t\r\u001a\u000eဉ\n\u000fဉ\u000b\u0010ဇ\u0003", new Object[]{"a", "b", C48672ag.m85260c(), "d", C48672ag.m85260c(), C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, "i"});
            case 3:
                return new C19167ba();
            case 4:
                return new C19165az();
            case 5:
                return f53673s;
            case 6:
                C63010eb ebVar = f53674t;
                if (ebVar == null) {
                    synchronized (C19167ba.class) {
                        ebVar = f53674t;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53673s);
                            f53674t = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
