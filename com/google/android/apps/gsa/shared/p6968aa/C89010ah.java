package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.plugins.p6468a.C84054a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.C59839hc;
import com.google.common.p4552o.C59842hf;
import com.google.common.p4552o.C60333oq;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70295cx;
import p5488io.grpc.C70296cy;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;

/* renamed from: com.google.android.apps.gsa.shared.aa.ah */
/* compiled from: PG */
public final class C89010ah extends C89000a {

    /* renamed from: l */
    final String f241208l;

    /* renamed from: m */
    public C70334de f241209m;

    /* renamed from: n */
    private final String f241210n;

    /* renamed from: o */
    private final int f241211o;

    /* renamed from: p */
    private final C70338di f241212p;

    public C89010ah(String str, int i, C70338di diVar, int i2, String str2, C21370a aVar, C58833ax axVar) {
        super(i2, aVar, axVar);
        this.f241210n = str;
        this.f241211o = i;
        this.f241212p = diVar;
        this.f241208l = str2;
    }

    /* renamed from: q */
    public static List m144716q(C70334de deVar) {
        Set<String> e = deVar.mo62030e();
        ArrayList arrayList = new ArrayList(e.size());
        for (String str : e) {
            if (!str.endsWith("-bin")) {
                Iterable a = deVar.mo62026a(new C70290cs(str, C70334de.f187481c));
                if (a != null) {
                    C70295cx cxVar = new C70295cx((C70296cy) a);
                    while (cxVar.hasNext()) {
                        arrayList.add(new C89014al(str, (String) cxVar.next()));
                    }
                }
            } else {
                arrayList.add(new C89014al(str, "[BINARY]"));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final long mo82960c() {
        C70334de deVar = this.f241209m;
        if (deVar == null) {
            return 0;
        }
        String str = this.f241210n;
        String str2 = this.f241212p.f187497b;
        return C89016an.m144745b("POST", "https://" + str + "/" + str2, m144716q(deVar));
    }

    /* renamed from: d */
    public final C59842hf mo82961d() {
        C59839hc hcVar = (C59839hc) C59842hf.f161717k.createBuilder();
        C60333oq f = mo82963f();
        hcVar.copyOnWrite();
        C59842hf hfVar = (C59842hf) hcVar.instance;
        f.getClass();
        hfVar.f161720b = f;
        hfVar.f161719a |= 1;
        if (this.f241185j != null) {
            int i = this.f241185j.f241279a;
            hcVar.copyOnWrite();
            C59842hf hfVar2 = (C59842hf) hcVar.instance;
            hfVar2.f161719a |= 1024;
            hfVar2.f161726h = i;
        }
        return (C59842hf) hcVar.build();
    }

    /* renamed from: e */
    public final C59842hf mo82962e() {
        return mo82961d();
    }

    /* renamed from: g */
    public final void mo27451g(C91005e eVar) {
        eVar.mo85277b("gRPC request to https://%s:%d/%s ", C90752i.m148229c(this.f241210n), C90752i.m148230d(Integer.valueOf(this.f241211o)), C90752i.m148229c(this.f241212p.f187497b));
        eVar.mo85277b("[type: %s, tag: %s, started: %b, authority: %s, deadline: %s] ", C90752i.m148231e(this.f241212p.f187496a), C90752i.m148229c(C84054a.m133949a(this.f241177b)), C90752i.m148228b(Boolean.valueOf(mo82982r())), C90752i.m148229c((CharSequence) null), C90752i.m148229c(this.f241208l));
        C70334de deVar = this.f241209m;
        if (deVar != null) {
            C89014al.m144738a(eVar, m144716q(deVar));
        }
        eVar.mo85277b(" ", new C90752i[0]);
        super.mo27451g(eVar);
    }

    /* renamed from: r */
    public final boolean mo82982r() {
        return this.f241209m != null;
    }
}
