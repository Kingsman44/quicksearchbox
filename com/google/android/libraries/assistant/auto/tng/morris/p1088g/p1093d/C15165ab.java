package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14557nq;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14560nt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14561nu;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.ab */
/* compiled from: PG */
public final /* synthetic */ class C15165ab implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C15169af f45496a;

    /* renamed from: b */
    public final /* synthetic */ C14561nu f45497b;

    /* renamed from: c */
    public final /* synthetic */ ContextThemeWrapper f45498c;

    public /* synthetic */ C15165ab(C15169af afVar, C14561nu nuVar, ContextThemeWrapper contextThemeWrapper) {
        this.f45496a = afVar;
        this.f45497b = nuVar;
        this.f45498c = contextThemeWrapper;
    }

    public final void onClick(View view) {
        String str;
        C15169af afVar = this.f45496a;
        C14561nu nuVar = this.f45497b;
        ContextThemeWrapper contextThemeWrapper = this.f45498c;
        C58976aa aaVar = C58975e.f156826a;
        String str2 = nuVar.f44024a;
        afVar.mo22044a(contextThemeWrapper, false);
        C14558nr nrVar = afVar.f45506d;
        nrVar.getClass();
        int a = C14557nq.m30639a(nrVar.f44018d);
        if (a != 0 && a == 4) {
            int a2 = C14560nt.m30640a(nuVar.f44027d);
            if (a2 == 0) {
                a2 = 1;
            }
            int i = a2 - 2;
            if (i == 2) {
                afVar.f45509g.mo21435c(C37182a.f97938dK.mo40813g());
                if (afVar.f45511i.mo79746e(C90051dc.f248927x)) {
                    afVar.f45510h.mo21421f(C37182a.f98223ij.mo40813g());
                }
            } else if (i != 4) {
                if (i != 8) {
                    C59104x d = C15169af.f45503a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "Morris.ImmersiveRndr");
                    C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(46006);
                    switch (a2) {
                        case 2:
                            str = "UNKNOWN";
                            break;
                        case 3:
                            str = "MEDIA";
                            break;
                        case 4:
                            str = "CONTACT";
                            break;
                        case 5:
                            str = "DESTINATION_HOME";
                            break;
                        case 6:
                            str = "CALL_TO_ACTION";
                            break;
                        case 7:
                            str = "DESTINATION_WORK";
                            break;
                        case 8:
                            str = "DESTINATION_GENERAL";
                            break;
                        case 9:
                            str = "DESTINATION_INPUT";
                            break;
                        case 10:
                            str = "RECENT_CALL";
                            break;
                        default:
                            str = "UNRECOGNIZED";
                            break;
                    }
                    cVar.mo56389s("Attempted to log calling AppFlow for invalid suggestion type: %s", str);
                } else {
                    afVar.f45509g.mo21435c(C37182a.f97937dJ.mo40813g());
                    if (afVar.f45511i.mo79746e(C90051dc.f248927x)) {
                        afVar.f45510h.mo21421f(C37182a.f98224ik.mo40813g());
                    }
                }
            } else if (afVar.f45511i.mo79746e(C90051dc.f248927x)) {
                afVar.f45510h.mo21421f(C37182a.f98225il.mo40813g());
            }
        }
        C14492lf lfVar = nuVar.f44025b;
        if (lfVar != null) {
            afVar.f45508f.mo21875g(lfVar);
        }
    }
}
