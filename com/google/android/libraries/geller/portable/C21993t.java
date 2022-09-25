package com.google.android.libraries.geller.portable;

import com.google.protobuf.MessageLite;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4985f.p5030q.p5032b.C65028am;
import com.google.protos.p4985f.p5030q.p5032b.C65031ap;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.geller.portable.t */
/* compiled from: PG */
public final /* synthetic */ class C21993t implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Geller f60667a;

    /* renamed from: b */
    public final /* synthetic */ String f60668b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f60669c;

    /* renamed from: d */
    public final /* synthetic */ String f60670d;

    /* renamed from: e */
    public final /* synthetic */ int f60671e;

    /* renamed from: f */
    public final /* synthetic */ C63662ac f60672f;

    /* renamed from: g */
    public final /* synthetic */ MessageLite f60673g;

    public /* synthetic */ C21993t(Geller geller, String str, C65753ak akVar, String str2, int i, C63662ac acVar, MessageLite messageLite) {
        this.f60667a = geller;
        this.f60668b = str;
        this.f60669c = akVar;
        this.f60670d = str2;
        this.f60671e = i;
        this.f60672f = acVar;
        this.f60673g = messageLite;
    }

    public final Object call() {
        Geller geller = this.f60667a;
        String str = this.f60668b;
        C65753ak akVar = this.f60669c;
        String str2 = this.f60670d;
        int i = this.f60671e;
        C63662ac acVar = this.f60672f;
        MessageLite messageLite = this.f60673g;
        C65028am amVar = (C65028am) C65031ap.f176100j.createBuilder();
        amVar.copyOnWrite();
        C65031ap apVar = (C65031ap) amVar.instance;
        apVar.f176102a |= 4;
        apVar.f176105d = i;
        return geller.mo27177d(str, akVar, str2, (C65031ap) amVar.build(), acVar, messageLite);
    }
}
