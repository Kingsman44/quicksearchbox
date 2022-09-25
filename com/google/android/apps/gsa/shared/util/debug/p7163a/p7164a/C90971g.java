package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C59829gv;
import com.google.common.p4552o.C59831gx;
import com.google.common.p4552o.C59838hb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.g */
/* compiled from: PG */
public final class C90971g extends C90983s {
    public C90971g(C90974j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85255a(MessageLite messageLite) {
        C59831gx gxVar = (C59831gx) messageLite;
        if (gxVar != null) {
            C59838hb hbVar = gxVar.f161681b;
            if (hbVar == null) {
                hbVar = C59838hb.f161707d;
            }
            if (hbVar.f161709a.size() > 0) {
                this.f254188a.mo85258b("Client Experiment flags");
                this.f254188a.mo85261e();
                for (C59829gv gvVar : hbVar.f161709a) {
                    this.f254188a.mo85259c(gvVar.f161676b, gvVar.f161677c);
                }
                this.f254188a.mo85260d();
            }
            C90972h.m148590a("Client Experiment Ids", hbVar.f161710b, this.f254188a);
            C90972h.m148590a("Trigger Experiment Ids", hbVar.f161711c, this.f254188a);
            C90972h.m148590a("GWS Experiment Ids", gxVar.f161682c, this.f254188a);
            C90972h.m148590a("Override Trigger Ids", gxVar.f161683d, this.f254188a);
            String str = gxVar.f161684e;
            if (str.length() > 0) {
                C90972h.m148593d("Experiment token", C58485gu.m89846n(str), this.f254188a);
            }
        }
    }
}
