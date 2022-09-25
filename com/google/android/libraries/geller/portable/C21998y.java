package com.google.android.libraries.geller.portable;

import com.google.protobuf.MessageLite;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4985f.p5030q.p5032b.C65031ap;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.geller.portable.y */
/* compiled from: PG */
public final /* synthetic */ class C21998y implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Geller f60693a;

    /* renamed from: b */
    public final /* synthetic */ String f60694b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f60695c;

    /* renamed from: d */
    public final /* synthetic */ String f60696d;

    /* renamed from: e */
    public final /* synthetic */ C65031ap f60697e;

    /* renamed from: f */
    public final /* synthetic */ C63662ac f60698f;

    /* renamed from: g */
    public final /* synthetic */ MessageLite f60699g;

    public /* synthetic */ C21998y(Geller geller, String str, C65753ak akVar, String str2, C65031ap apVar, C63662ac acVar, MessageLite messageLite) {
        this.f60693a = geller;
        this.f60694b = str;
        this.f60695c = akVar;
        this.f60696d = str2;
        this.f60697e = apVar;
        this.f60698f = acVar;
        this.f60699g = messageLite;
    }

    public final Object call() {
        return this.f60693a.mo27177d(this.f60694b, this.f60695c, this.f60696d, this.f60697e, this.f60698f, this.f60699g);
    }
}
