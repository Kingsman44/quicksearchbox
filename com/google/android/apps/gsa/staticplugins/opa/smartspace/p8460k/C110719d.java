package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8460k;

import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.reminders.C145775d;
import com.google.android.gms.reminders.C145778g;
import com.google.android.gms.reminders.C145779h;
import com.google.android.gms.reminders.LoadRemindersOptions;
import com.google.android.gms.reminders.internal.p10862a.C145803v;
import com.google.android.gms.reminders.model.C145854z;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.k.d */
/* compiled from: PG */
public final /* synthetic */ class C110719d implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C110722g f308503a;

    public /* synthetic */ C110719d(C110722g gVar) {
        this.f308503a = gVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C110722g gVar = this.f308503a;
        long b = gVar.f308513g.mo26870b();
        C145775d dVar = new C145775d();
        dVar.f394141h = 1;
        dVar.f394135b = Long.valueOf(b);
        dVar.f394136c = Long.valueOf(b + C110722g.f308508b);
        int i = 0;
        dVar.mo121945c(1);
        LoadRemindersOptions a = dVar.mo121943a();
        C110724i iVar = gVar.f308514h;
        C58480gp e = C58485gu.m89837e();
        String F = iVar.f308523a.mo79659F();
        if (F == null) {
            return e.mo55394f();
        }
        C145779h hVar = C145778g.f394146c;
        C143851w a2 = iVar.mo98864a(iVar.f308524b, F);
        if (!a2.mo119133h() && !a2.mo119134i()) {
            C58976aa aaVar = C58975e.f156826a;
            a2.mo119131f();
        }
        C145803v vVar = (C145803v) hVar.mo121949b(a2, a).mo117316a();
        if (!vVar.f394179b.mo119097c()) {
            return e.mo55394f();
        }
        C145854z zVar = vVar.f394178a;
        if (zVar != null) {
            while (i < zVar.mo119324c()) {
                try {
                    e.mo55395g(new TaskEntity(zVar.mo119329d(i)));
                    i++;
                } finally {
                    zVar.mo119102b();
                }
            }
        }
        return e.mo55394f();
    }
}
