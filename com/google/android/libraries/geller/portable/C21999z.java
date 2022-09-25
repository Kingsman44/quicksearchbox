package com.google.android.libraries.geller.portable;

import com.google.protobuf.MessageLite;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4985f.p5030q.p5032b.C65031ap;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.geller.portable.z */
/* compiled from: PG */
public final /* synthetic */ class C21999z implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Geller f60700a;

    /* renamed from: b */
    public final /* synthetic */ String f60701b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f60702c;

    /* renamed from: d */
    public final /* synthetic */ String f60703d;

    /* renamed from: e */
    public final /* synthetic */ C65031ap f60704e;

    /* renamed from: f */
    public final /* synthetic */ C63662ac f60705f;

    /* renamed from: g */
    public final /* synthetic */ MessageLite f60706g;

    public /* synthetic */ C21999z(Geller geller, String str, C65753ak akVar, String str2, C65031ap apVar, C63662ac acVar, MessageLite messageLite) {
        this.f60700a = geller;
        this.f60701b = str;
        this.f60702c = akVar;
        this.f60703d = str2;
        this.f60704e = apVar;
        this.f60705f = acVar;
        this.f60706g = messageLite;
    }

    public final Object call() {
        return this.f60700a.mo27177d(this.f60701b, this.f60702c, this.f60703d, this.f60704e, this.f60705f, this.f60706g);
    }
}
