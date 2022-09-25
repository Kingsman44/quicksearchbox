package com.google.protos.p5129p.p5131b;

import com.google.assistant.p3897e.p3929l.p3930a.C52676ai;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.assistant.p3897e.p3929l.p3930a.C52694b;
import com.google.assistant.p3897e.p3929l.p3930a.C52714bt;
import com.google.assistant.p3897e.p3929l.p3930a.C52716bv;
import com.google.assistant.p3897e.p3929l.p3930a.C52722ca;
import com.google.assistant.p3897e.p3929l.p3930a.C52731cj;
import com.google.assistant.p3897e.p3929l.p3930a.C52744cw;
import com.google.assistant.p3897e.p3929l.p3930a.C52748d;
import com.google.assistant.p3897e.p3929l.p3930a.C52749da;
import com.google.assistant.p3897e.p3929l.p3930a.C52752dd;
import com.google.assistant.p3897e.p3929l.p3930a.C52796x;
import com.google.assistant.p3897e.p3929l.p3930a.C52798z;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4874ap.p4875a.p4876a.C63671j;
import com.google.protos.p4985f.p4988b.p4996f.C64811g;
import com.google.protos.p4985f.p5038s.p5039a.C65333b;

/* renamed from: com.google.protos.p.b.r */
/* compiled from: PG */
public final class C65849r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65849r f179002c;

    /* renamed from: e */
    private static volatile C63010eb f179003e;

    /* renamed from: a */
    public int f179004a = 0;

    /* renamed from: b */
    public Object f179005b;

    /* renamed from: d */
    private byte f179006d = 2;

    static {
        C65849r rVar = new C65849r();
        f179002c = rVar;
        C62942bv.registerDefaultInstance(C65849r.class, rVar);
    }

    private C65849r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179006d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179006d = b;
                return null;
            case 2:
                return newMessageInfo(f179002c, "\u0001\u0011\u0001\u0000\u0001\u0011\u0011\u0000\u0000\u0002\u0001ြ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tᐼ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fြ\u0000\u0010ြ\u0000\u0011ြ\u0000", new Object[]{"b", "a", C63671j.class, C52731cj.class, C52748d.class, C52752dd.class, C65828de.class, C52676ai.class, C52796x.class, C52716bv.class, C52714bt.class, C52686as.class, C52744cw.class, C65333b.class, C52694b.class, C52722ca.class, C52798z.class, C52749da.class, C64811g.class});
            case 3:
                return new C65849r();
            case 4:
                return new C65848q();
            case 5:
                return f179002c;
            case 6:
                C63010eb ebVar = f179003e;
                if (ebVar == null) {
                    synchronized (C65849r.class) {
                        ebVar = f179003e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179002c);
                            f179003e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
