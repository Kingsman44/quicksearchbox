package com.google.android.libraries.geller.portable;

import com.google.protobuf.MessageLite;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4985f.p5030q.p5032b.C65028am;
import com.google.protos.p4985f.p5030q.p5032b.C65031ap;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.geller.portable.u */
/* compiled from: PG */
public final /* synthetic */ class C21994u implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Geller f60674a;

    /* renamed from: b */
    public final /* synthetic */ String f60675b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f60676c;

    /* renamed from: d */
    public final /* synthetic */ String f60677d;

    /* renamed from: e */
    public final /* synthetic */ int f60678e;

    /* renamed from: f */
    public final /* synthetic */ C63662ac f60679f;

    /* renamed from: g */
    public final /* synthetic */ MessageLite f60680g;

    public /* synthetic */ C21994u(Geller geller, String str, C65753ak akVar, String str2, int i, C63662ac acVar, MessageLite messageLite) {
        this.f60674a = geller;
        this.f60675b = str;
        this.f60676c = akVar;
        this.f60677d = str2;
        this.f60678e = i;
        this.f60679f = acVar;
        this.f60680g = messageLite;
    }

    public final Object call() {
        Geller geller = this.f60674a;
        String str = this.f60675b;
        C65753ak akVar = this.f60676c;
        String str2 = this.f60677d;
        int i = this.f60678e;
        C63662ac acVar = this.f60679f;
        MessageLite messageLite = this.f60680g;
        C65028am amVar = (C65028am) C65031ap.f176100j.createBuilder();
        amVar.copyOnWrite();
        C65031ap apVar = (C65031ap) amVar.instance;
        apVar.f176102a |= 4;
        apVar.f176105d = i;
        return geller.mo27177d(str, akVar, str2, (C65031ap) amVar.build(), acVar, messageLite);
    }
}
