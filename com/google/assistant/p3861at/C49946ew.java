package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
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
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.assistant.at.ew */
/* compiled from: PG */
public final class C49946ew extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C49946ew f129824q;

    /* renamed from: r */
    private static volatile C63010eb f129825r;

    /* renamed from: a */
    public int f129826a;

    /* renamed from: b */
    public C62971cq f129827b = emptyProtobufList();

    /* renamed from: c */
    public String f129828c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f129829d;

    /* renamed from: e */
    public C62971cq f129830e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public C62971cq f129831f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public C62971cq f129832g = C62942bv.emptyProtobufList();

    /* renamed from: h */
    public C62971cq f129833h = C62942bv.emptyProtobufList();

    /* renamed from: i */
    public boolean f129834i;

    /* renamed from: j */
    public boolean f129835j;

    /* renamed from: k */
    public boolean f129836k;

    /* renamed from: l */
    public boolean f129837l;

    /* renamed from: m */
    public C62971cq f129838m = C62942bv.emptyProtobufList();

    /* renamed from: n */
    public C62971cq f129839n = C62942bv.emptyProtobufList();

    /* renamed from: o */
    public boolean f129840o;

    /* renamed from: p */
    public boolean f129841p;

    static {
        C49946ew ewVar = new C49946ew();
        f129824q = ewVar;
        C62942bv.registerDefaultInstance(C49946ew.class, ewVar);
    }

    private C49946ew() {
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
                return newMessageInfo(f129824q, "\u0001\u000f\u0000\u0001\u0001\u0015\u000f\u0000\u0007\u0000\u0001\u001b\u0002ဈ\u0000\u0003\u001a\u0004ဇ\u0001\u0006\u001a\bဇ\u0003\t\u001a\n\u001a\u000bဇ\u0007\u000e\u001a\u000f\u001a\u0012ဇ\n\u0013ဇ\u000b\u0014ဇ\u0005\u0015ဇ\u0006", new Object[]{"a", "b", C49944eu.class, C45240c.f118157a, "e", "d", C10662f.f35572a, "i", C19618h.f54585a, C30325g.f82003a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "j", C19621k.f54601a});
            case 3:
                return new C49946ew();
            case 4:
                return new C49945ev();
            case 5:
                return f129824q;
            case 6:
                C63010eb ebVar = f129825r;
                if (ebVar == null) {
                    synchronized (C49946ew.class) {
                        ebVar = f129825r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129824q);
                            f129825r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
