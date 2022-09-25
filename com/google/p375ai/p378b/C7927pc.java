package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.pc */
/* compiled from: PG */
public final class C7927pc extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C7927pc f27849l;

    /* renamed from: m */
    private static volatile C63010eb f27850m;

    /* renamed from: a */
    public int f27851a;

    /* renamed from: b */
    public long f27852b;

    /* renamed from: c */
    public int f27853c = 1;

    /* renamed from: d */
    public String f27854d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f27855e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f27856f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C7926pb f27857g;

    /* renamed from: h */
    public int f27858h;

    /* renamed from: i */
    public C62971cq f27859i = emptyProtobufList();

    /* renamed from: j */
    public C62971cq f27860j;

    /* renamed from: k */
    public C62971cq f27861k;

    static {
        C7927pc pcVar = new C7927pc();
        f27849l = pcVar;
        C62942bv.registerDefaultInstance(C7927pc.class, pcVar);
    }

    private C7927pc() {
        emptyIntList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        this.f27860j = emptyProtobufList();
        this.f27861k = emptyProtobufList();
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
                return newMessageInfo(f27849l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0003\u0000\u0001ဂ\u0001\u0002ဌ\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဉ\u0007\u0006\u001b\tဌ\b\n\u001b\f\u001b\rဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, C7922oy.f27839a, "d", "e", C30325g.f82003a, "i", C7921ox.class, C19618h.f54585a, C7915or.m22890b(), "j", C7921ox.class, C19621k.f54601a, C7921ox.class, C10662f.f35572a});
            case 3:
                return new C7927pc();
            case 4:
                return new C7919ov();
            case 5:
                return f27849l;
            case 6:
                C63010eb ebVar = f27850m;
                if (ebVar == null) {
                    synchronized (C7927pc.class) {
                        ebVar = f27850m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27849l);
                            f27850m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
