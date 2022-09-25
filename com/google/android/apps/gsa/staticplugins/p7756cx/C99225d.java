package com.google.android.apps.gsa.staticplugins.p7756cx;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91757c;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.reminders.C145778g;
import com.google.android.gms.reminders.C145779h;
import com.google.android.gms.reminders.model.C145822ab;
import com.google.android.gms.reminders.model.Task;
import com.google.android.libraries.p11024al.p11025a.C147748d;
import com.google.android.libraries.p11024al.p11025a.C147753i;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.cx.d */
/* compiled from: PG */
public final /* synthetic */ class C99225d implements C91757c {

    /* renamed from: a */
    public final /* synthetic */ C99233l f277588a;

    /* renamed from: b */
    public final /* synthetic */ Collection f277589b;

    public /* synthetic */ C99225d(C99233l lVar, Collection collection) {
        this.f277588a = lVar;
        this.f277589b = collection;
    }

    /* renamed from: a */
    public final Object mo86253a(C143851w wVar) {
        boolean z;
        C99233l lVar = this.f277588a;
        List<Task> list = (List) C90877ak.m148472f(lVar.f277608f.mo124431b(lVar.f277609g, wVar, this.f277589b));
        boolean z2 = false;
        if (list == null || list.isEmpty()) {
            C59104x c = C99233l.f277603a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmsRemindersHelper");
            ((C59052c) ((C59052c) c).mo56372aa(31665)).mo56386p("No existing reminders found to archive.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Task task : list) {
            if (task.mo122076m() == null || !task.mo122076m().mo122041j().booleanValue()) {
                arrayList.add(task.mo122077n().mo122058h());
            } else {
                C145822ab abVar = new C145822ab(task);
                abVar.f394342b = Long.valueOf(System.currentTimeMillis());
                abVar.f394343c = true;
                abVar.f394345e = false;
                abVar.f394346f = false;
                arrayList2.add(abVar.mo122169a());
            }
        }
        if (!arrayList.isEmpty()) {
            C147753i iVar = lVar.f277608f;
            C145779h hVar = C145778g.f394146c;
            if (!((Status) C90877ak.m148472f(C60922j.m93045h(iVar.mo124431b(hVar, wVar, arrayList), new C147748d(hVar, wVar), C60826bg.f164896a))).mo119097c()) {
                z = false;
                C58431eu g = C58431eu.m89654f(arrayList2).mo55247g(new C99223b(lVar, wVar));
                boolean r = C58557jl.m90137r(g.mo55248h(), C99224c.f277587a);
                if (z && r) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }
        z = true;
        C58431eu g2 = C58431eu.m89654f(arrayList2).mo55247g(new C99223b(lVar, wVar));
        boolean r2 = C58557jl.m90137r(g2.mo55248h(), C99224c.f277587a);
        z2 = true;
        return Boolean.valueOf(z2);
    }
}
