package com.google.knowledge.cerebra.sense.textclassifier.p4678b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3863av.p3864a.p3865a.p3866a.C50528f;
import com.google.assistant.p3863av.p3864a.p3865a.p3866a.C50532j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.b.d */
/* compiled from: PG */
public final class C61846d extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C61846d f167118n;

    /* renamed from: o */
    private static volatile C63010eb f167119o;

    /* renamed from: a */
    public int f167120a;

    /* renamed from: b */
    public C62971cq f167121b = emptyProtobufList();

    /* renamed from: c */
    public int f167122c;

    /* renamed from: d */
    public int f167123d;

    /* renamed from: e */
    public boolean f167124e;

    /* renamed from: f */
    public boolean f167125f;

    /* renamed from: g */
    public boolean f167126g;

    /* renamed from: h */
    public boolean f167127h;

    /* renamed from: i */
    public boolean f167128i;

    /* renamed from: j */
    public C63088z f167129j = C63088z.f170246b;

    /* renamed from: k */
    public C50528f f167130k;

    /* renamed from: l */
    public C50532j f167131l;

    /* renamed from: m */
    public String f167132m = BuildConfig.FLAVOR;

    static {
        C61846d dVar = new C61846d();
        f167118n = dVar;
        C62942bv.registerDefaultInstance(C61846d.class, dVar);
    }

    private C61846d() {
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
                return newMessageInfo(f167118n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\nည\u0007\u000bဉ\b\fဉ\t\rဈ\n", new Object[]{"a", "b", C61845c.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C61846d();
            case 4:
                return new C61843a();
            case 5:
                return f167118n;
            case 6:
                C63010eb ebVar = f167119o;
                if (ebVar == null) {
                    synchronized (C61846d.class) {
                        ebVar = f167119o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167118n);
                            f167119o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
