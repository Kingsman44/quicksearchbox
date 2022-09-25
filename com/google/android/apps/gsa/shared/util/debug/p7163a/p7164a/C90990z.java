package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.common.p4552o.C59845hi;
import com.google.common.p4552o.C59846hj;
import com.google.common.p4552o.C59848hl;
import com.google.protobuf.C62971cq;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.z */
/* compiled from: PG */
public final class C90990z extends C90983s {
    public C90990z(C90974j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85255a(MessageLite messageLite) {
        String str;
        C59848hl hlVar = (C59848hl) messageLite;
        if (hlVar != null) {
            this.f254188a.mo85258b("Jar Information");
            this.f254188a.mo85261e();
            C62971cq<C59846hj> cqVar = hlVar.f161739a;
            if (!cqVar.isEmpty()) {
                this.f254188a.mo85258b("Extradex Loaded Jars");
                this.f254188a.mo85261e();
                for (C59846hj hjVar : cqVar) {
                    int i = hjVar.f161732a;
                    if ((i & 4) != 0) {
                        str = hjVar.f161735d;
                    } else {
                        str = hjVar.f161733b;
                    }
                    if ((i & 8) != 0) {
                        str = str + " (file: " + hjVar.f161736e + ")";
                    }
                    int i2 = hjVar.f161734c;
                    int a = C59845hi.m92514a(i2);
                    if (!(a == 0 || a == 1)) {
                        int a2 = C59845hi.m92514a(i2);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        int i3 = a2 - 1;
                        str = str + " (" + (i3 != 0 ? i3 != 1 ? i3 != 2 ? "ASSET" : "DEV" : "BLOB" : "UNKNOWN") + ")";
                    }
                    this.f254188a.mo85257a(str);
                }
                this.f254188a.mo85260d();
            }
            this.f254188a.mo85260d();
        }
    }
}
