package com.google.assistant.p3897e.p3921j;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.lg */
/* compiled from: PG */
public final class C52263lg extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C52263lg f137151o;

    /* renamed from: p */
    private static volatile C63010eb f137152p;

    /* renamed from: a */
    public int f137153a;

    /* renamed from: b */
    public boolean f137154b;

    /* renamed from: c */
    public boolean f137155c;

    /* renamed from: d */
    public boolean f137156d;

    /* renamed from: e */
    public int f137157e;

    /* renamed from: f */
    public boolean f137158f;

    /* renamed from: g */
    public boolean f137159g;

    /* renamed from: h */
    public boolean f137160h;

    /* renamed from: i */
    public boolean f137161i;

    /* renamed from: j */
    public boolean f137162j;

    /* renamed from: k */
    public boolean f137163k;

    /* renamed from: l */
    public C52249kt f137164l;

    /* renamed from: m */
    public C62971cq f137165m = emptyProtobufList();

    /* renamed from: n */
    public boolean f137166n;

    static {
        C52263lg lgVar = new C52263lg();
        f137151o = lgVar;
        C62942bv.registerDefaultInstance(C52263lg.class, lgVar);
    }

    private C52263lg() {
    }

    /* renamed from: a */
    public final void mo53824a() {
        C62971cq cqVar = this.f137165m;
        if (!cqVar.mo58948c()) {
            this.f137165m = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f137151o, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\tဇ\u0007\n\u001b\u000bဇ\b\fဇ\t\u000eဉ\u000b\u000fဇ\n\u0010ဇ\r", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C52247kr.m86552b(), C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "m", C52262lf.class, "i", "j", "l", C19621k.f54601a, C48004n.f124238a});
            case 3:
                return new C52263lg();
            case 4:
                return new C52260ld();
            case 5:
                return f137151o;
            case 6:
                C63010eb ebVar = f137152p;
                if (ebVar == null) {
                    synchronized (C52263lg.class) {
                        ebVar = f137152p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137151o);
                            f137152p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
