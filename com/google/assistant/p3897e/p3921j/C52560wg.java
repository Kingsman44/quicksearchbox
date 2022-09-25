package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C50999cq;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.p5277z.p5282c.C68012b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.assistant.e.j.wg */
/* compiled from: PG */
public final class C52560wg extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C52560wg f137943j;

    /* renamed from: m */
    private static volatile C63010eb f137944m;

    /* renamed from: a */
    public int f137945a;

    /* renamed from: b */
    public int f137946b = 0;

    /* renamed from: c */
    public Object f137947c;

    /* renamed from: d */
    public String f137948d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C51098gh f137949e;

    /* renamed from: f */
    public C52568wo f137950f;

    /* renamed from: g */
    public String f137951g;

    /* renamed from: h */
    public String f137952h;

    /* renamed from: i */
    public C63204j f137953i;

    /* renamed from: k */
    private C50999cq f137954k;

    /* renamed from: l */
    private byte f137955l = 2;

    static {
        C52560wg wgVar = new C52560wg();
        f137943j = wgVar;
        C62942bv.registerDefaultInstance(C52560wg.class, wgVar);
    }

    private C52560wg() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        this.f137951g = BuildConfig.FLAVOR;
        this.f137952h = BuildConfig.FLAVOR;
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f137955l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f137955l = b;
                return null;
            case 2:
                return newMessageInfo(f137943j, "\u0001\t\u0001\u0001\u0001\u0013\t\u0000\u0000\u0004\u0001ဈ\u0000\u0002ဉ\u0002\u0003ᐉ\u0003\bဈ\u0005\nဈ\u0006\u000fြ\u0000\u0010ᐼ\u0000\u0012ᐉ\r\u0013ᐉ\u000e", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C68012b.class, C51016dg.class, "i", C19621k.f54601a});
            case 3:
                return new C52560wg();
            case 4:
                return new C52559wf();
            case 5:
                return f137943j;
            case 6:
                C63010eb ebVar = f137944m;
                if (ebVar == null) {
                    synchronized (C52560wg.class) {
                        ebVar = f137944m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137943j);
                            f137944m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
