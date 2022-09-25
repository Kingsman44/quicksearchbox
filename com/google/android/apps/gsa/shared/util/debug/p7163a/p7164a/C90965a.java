package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.android.libraries.search.p2904c.C37584ey;
import com.google.common.p4552o.C59778ff;
import com.google.common.p4552o.C59780fh;
import com.google.common.p4552o.C59796fx;
import com.google.common.p4552o.C59817gj;
import com.google.common.p4552o.C59831gx;
import com.google.common.p4552o.C59848hl;
import com.google.common.p4552o.C59858hv;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.a */
/* compiled from: PG */
public final class C90965a extends C90983s {
    public C90965a(C90974j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85255a(MessageLite messageLite) {
        C59817gj gjVar;
        C59858hv hvVar;
        C59831gx gxVar;
        C59848hl hlVar;
        C59778ff ffVar;
        C59780fh fhVar;
        C59796fx fxVar = (C59796fx) messageLite;
        C37584ey eyVar = null;
        if ((fxVar.f161582a & 1) != 0) {
            gjVar = fxVar.f161583b;
            if (gjVar == null) {
                gjVar = C59817gj.f161645e;
            }
        } else {
            gjVar = null;
        }
        C90972h.m148591b(gjVar, new C90969e(this.f254188a));
        if ((fxVar.f161582a & 2) != 0) {
            hvVar = fxVar.f161584c;
            if (hvVar == null) {
                hvVar = C59858hv.f161763g;
            }
        } else {
            hvVar = null;
        }
        C90972h.m148591b(hvVar, new C90986v(this.f254188a));
        C90972h.m148593d("Features", fxVar.f161585d, this.f254188a);
        if ((fxVar.f161582a & 4) != 0) {
            gxVar = fxVar.f161586e;
            if (gxVar == null) {
                gxVar = C59831gx.f161678f;
            }
        } else {
            gxVar = null;
        }
        C90972h.m148591b(gxVar, new C90971g(this.f254188a));
        if ((fxVar.f161582a & 8) != 0) {
            hlVar = fxVar.f161589h;
            if (hlVar == null) {
                hlVar = C59848hl.f161737b;
            }
        } else {
            hlVar = null;
        }
        C90972h.m148591b(hlVar, new C90990z(this.f254188a));
        C90972h.m148592c("Executors", fxVar.f161587f, new C90970f(this.f254188a));
        C90972h.m148592c("Loopers", fxVar.f161588g, new C90975k(this.f254188a));
        C90972h.m148592c("Recent log events", fxVar.f161590i, new C90973i(this.f254188a));
        C90972h.m148592c("Recent TaskGraphs", fxVar.f161592k, new C90988x(this.f254188a));
        C90972h.m148592c("Profiling Statistics", fxVar.f161591j, new C90982r(this.f254188a));
        ArrayList arrayList = new ArrayList(fxVar.f161594m);
        Collections.reverse(arrayList);
        C90972h.m148592c("AppFlow events currently in buffer", arrayList, new C90966b(this.f254188a));
        if ((fxVar.f161582a & 128) != 0) {
            ffVar = fxVar.f161596o;
            if (ffVar == null) {
                ffVar = C59778ff.f161522b;
            }
        } else {
            ffVar = null;
        }
        C90972h.m148591b(ffVar, new C90979o(this.f254188a));
        if ((fxVar.f161582a & 64) != 0) {
            fhVar = fxVar.f161595n;
            if (fhVar == null) {
                fhVar = C59780fh.f161525b;
            }
        } else {
            fhVar = null;
        }
        C90972h.m148591b(fhVar, new C90980p(this.f254188a));
        C90972h.m148592c("Platform Task Statistics", fxVar.f161597p, new C90981q(this.f254188a));
        if ((fxVar.f161582a & 1024) != 0 && (eyVar = fxVar.f161598q) == null) {
            eyVar = C37584ey.f99862e;
        }
        C90972h.m148591b(eyVar, new C90968d(this.f254188a));
    }
}
