package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3912f.C51209d;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4552o.p4553a.C59529cz;
import com.google.common.p4552o.p4553a.C59569y;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.assistant.e.i.a.li */
/* compiled from: PG */
public final class C51536li extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C51536li f134316k;

    /* renamed from: m */
    private static volatile C63010eb f134317m;

    /* renamed from: a */
    public int f134318a;

    /* renamed from: b */
    public int f134319b;

    /* renamed from: c */
    public String f134320c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f134321d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f134322e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C52230ka f134323f;

    /* renamed from: g */
    public C63070h f134324g;

    /* renamed from: h */
    public int f134325h;

    /* renamed from: i */
    public C59569y f134326i;

    /* renamed from: j */
    public C59529cz f134327j;

    /* renamed from: l */
    private byte f134328l = 2;

    static {
        C51536li liVar = new C51536li();
        f134316k = liVar;
        C62942bv.registerDefaultInstance(C51536li.class, liVar);
    }

    private C51536li() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134328l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134328l = b;
                return null;
            case 2:
                return newMessageInfo(f134316k, "\u0001\t\u0000\u0001\u0002\u000f\t\u0000\u0000\u0001\u0002ဌ\u0000\u0003ဈ\u0001\u0005ဈ\u0005\tဉ\b\u000bဉ\t\fဈ\u0002\rဌ\n\u000eဉ\u000b\u000fᐉ\f", new Object[]{"a", "b", C51535lh.m86212b(), C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, "d", C19618h.f54585a, C51209d.m86087b(), "i", "j"});
            case 3:
                return new C51536li();
            case 4:
                return new C51533lf();
            case 5:
                return f134316k;
            case 6:
                C63010eb ebVar = f134317m;
                if (ebVar == null) {
                    synchronized (C51536li.class) {
                        ebVar = f134317m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134316k);
                            f134317m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
