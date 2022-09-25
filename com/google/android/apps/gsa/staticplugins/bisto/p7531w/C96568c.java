package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124638bd;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124640bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10712d.C142444fo;
import com.google.android.p10712d.C142445fp;
import com.google.android.p10712d.C142446fq;
import com.google.android.p10712d.C142447fr;
import com.google.android.p10712d.C142455fz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.c */
/* compiled from: PG */
final class C96568c extends C96588ct {

    /* renamed from: a */
    private static final C59071e f270164a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.c");

    /* renamed from: b */
    private static final long f270165b = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: c */
    private final Iterator f270166c;

    /* renamed from: d */
    private final AtomicBoolean f270167d = new AtomicBoolean(false);

    public C96568c(C22871g gVar, C22871g gVar2, C96579ck ckVar, C21370a aVar, C95355bf bfVar, C124721s sVar, C124629av avVar) {
        super(gVar, gVar2, ckVar, aVar, bfVar, sVar, avVar);
        ArrayList arrayList = new ArrayList();
        C124650bp bpVar = null;
        for (C124650bp bpVar2 : avVar.f343828o) {
            if (bpVar2.f343893b != 0) {
                arrayList.add(bpVar2);
            } else {
                bpVar = bpVar2;
            }
        }
        if (bpVar != null) {
            arrayList.add(bpVar);
        }
        this.f270166c = arrayList.iterator();
    }

    /* renamed from: a */
    public final String mo90248a() {
        return "ApplyOtaTask";
    }

    /* renamed from: b */
    public final void mo90249b() {
        if (!this.f270166c.hasNext()) {
            C59104x c = f270164a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ApplyOtaTask");
            ((C59052c) ((C59052c) c).mo56372aa(16538)).mo56386p("Empty list of device to apply OTA");
            mo90261i(C118826c.f331422a);
            return;
        }
        C124650bp bpVar = (C124650bp) this.f270166c.next();
        C22871g gVar = this.f270197i;
        int i = bpVar.f343893b;
        gVar.mo28212l("Send apply #" + i, new C96541b(this, bpVar));
    }

    /* renamed from: c */
    public final void mo90250c(C124650bp bpVar) {
        long j;
        C124627at a = C124627at.m204292a(bpVar.f343906o);
        if (a == null) {
            a = C124627at.UNKNOWN_OTA_TYPE;
        }
        int i = bpVar.f343893b;
        int ordinal = a.ordinal();
        int i2 = 0;
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            C142446fq fqVar = (C142446fq) C142447fr.f386529e.createBuilder();
            fqVar.copyOnWrite();
            C142447fr frVar = (C142447fr) fqVar.instance;
            frVar.f386531a |= 4;
            frVar.f386534d = i;
            int a2 = C124638bd.m204303a(this.f270201m.f343817d);
            boolean z = a2 != 0 && a2 == 2;
            fqVar.copyOnWrite();
            C142447fr frVar2 = (C142447fr) fqVar.instance;
            frVar2.f386531a |= 1;
            frVar2.f386532b = z;
            int a3 = C124640bf.m204304a(this.f270201m.f343818e);
            boolean z2 = a3 != 0 && a3 == 2;
            fqVar.copyOnWrite();
            C142447fr frVar3 = (C142447fr) fqVar.instance;
            frVar3.f386531a |= 2;
            frVar3.f386533c = z2;
            if (!mo90264l(fqVar.build(), C142455fz.OTA_APPLY, (C96586cr) null)) {
                C59104x c = f270164a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ApplyOtaTask");
                ((C59052c) ((C59052c) c).mo56372aa(16540)).mo56387q("Error sending apply to subDevice: %d", i);
                this.f270167d.set(true);
            }
        } else if (ordinal != 4) {
            C59104x c2 = f270164a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ApplyOtaTask");
            ((C59052c) ((C59052c) c2).mo56372aa(16539)).mo56352E("unexpected ota type=%s for device=%d", a, i);
        } else {
            C142444fo foVar = (C142444fo) C142445fp.f386524d.createBuilder();
            foVar.copyOnWrite();
            C142445fp fpVar = (C142445fp) foVar.instance;
            fpVar.f386526a |= 1;
            fpVar.f386527b = i;
            String str = bpVar.f343903l;
            foVar.copyOnWrite();
            C142445fp fpVar2 = (C142445fp) foVar.instance;
            str.getClass();
            fpVar2.f386526a |= 2;
            fpVar2.f386528c = str;
            if (!mo90264l(foVar.build(), C142455fz.OTA_APPLY, (C96586cr) null)) {
                C59104x c3 = f270164a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "ApplyOtaTask");
                ((C59052c) ((C59052c) c3).mo56372aa(16541)).mo56387q("Error sending activate feature to subDevice: %d", i);
                this.f270167d.set(true);
            }
        }
        if (this.f270166c.hasNext()) {
            C124650bp bpVar2 = (C124650bp) this.f270166c.next();
            int i3 = bpVar2.f343893b;
            if (i3 == 0) {
                j = f270165b;
            } else {
                i2 = i3;
                j = 0;
            }
            this.f270197i.mo28213m("Send apply #" + i2, j, new C96513a(this, bpVar2));
        } else if (this.f270167d.get()) {
            mo90262j(new C96587cs("ERROR_SENDING_APPLY"));
        } else {
            mo90265m();
            mo90261i(C118826c.f331422a);
        }
    }
}
