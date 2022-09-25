package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1094e;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14738h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14152v;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14291du;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14612pr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14613ps;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15346t;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.e.r */
/* compiled from: PG */
public final /* synthetic */ class C15315r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C15280ah f45982a;

    /* renamed from: b */
    public final /* synthetic */ C14292dv f45983b;

    /* renamed from: c */
    public final /* synthetic */ C14613ps f45984c;

    public /* synthetic */ C15315r(C15280ah ahVar, C14292dv dvVar, C14613ps psVar) {
        this.f45982a = ahVar;
        this.f45983b = dvVar;
        this.f45984c = psVar;
    }

    public final void onClick(View view) {
        int a;
        C15280ah ahVar = this.f45982a;
        C14292dv dvVar = this.f45983b;
        C14613ps psVar = this.f45984c;
        int a2 = C14291du.m30597a(dvVar.f43250p);
        if (a2 != 0 && a2 == 6) {
            C14986h hVar = ahVar.f45865b;
            C14216b bVar = dvVar.f43239e;
            if (bVar == null) {
                bVar = C14216b.f43007f;
            }
            String str = bVar.f43011c;
            C14216b bVar2 = dvVar.f43239e;
            if (bVar2 == null) {
                bVar2 = C14216b.f43007f;
            }
            hVar.mo21875g(C14738h.m31025c(str, bVar2.f43012d));
            return;
        }
        C14152v vVar = ahVar.f45867d;
        C37252a c = C15346t.m31929c(dvVar);
        C14216b bVar3 = dvVar.f43239e;
        if (bVar3 == null) {
            bVar3 = C14216b.f43007f;
        }
        String str2 = bVar3.f43011c;
        C14216b bVar4 = dvVar.f43239e;
        if (bVar4 == null) {
            bVar4 = C14216b.f43007f;
        }
        vVar.mo21478c(c, str2, bVar4.f43012d);
        int i = psVar.f44177c;
        int a3 = C14612pr.m30644a(i);
        if ((a3 != 0 && a3 == 3) || ((a = C14612pr.m30644a(i)) != 0 && a == 4)) {
            ahVar.f45848A = dvVar;
        }
        ahVar.f45865b.mo21875g(C14738h.m31026d(dvVar));
    }
}
