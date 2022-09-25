package com.google.android.apps.gsa.staticplugins.p7554bs.p7556b;

import android.content.SharedPreferences;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.view.p2067ak.C25254cf;
import com.google.android.libraries.lens.view.p2067ak.C25255cg;
import com.google.android.libraries.lens.view.p2067ak.C25256ch;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.b.b */
/* compiled from: PG */
public final /* synthetic */ class C96701b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C96703d f270524a;

    public /* synthetic */ C96701b(C96703d dVar) {
        this.f270524a = dVar;
    }

    public final Object apply(Object obj) {
        C96703d dVar = this.f270524a;
        String str = (String) ((C58833ax) obj).mo56111f();
        C58526ih ihVar = new C58526ih();
        String d = C25256ch.m46638d(str);
        if (dVar.f270527a.contains(d)) {
            ihVar.mo55373c(d);
        }
        Set<String> keySet = dVar.f270527a.getAll().keySet();
        C58800sl lA = C25256ch.m46635a(keySet, str).iterator();
        while (lA.hasNext()) {
            ihVar.mo55373c(C25256ch.m46637c(str, (String) lA.next()));
        }
        String concat = "lens_confirmation_dialog_shown".concat(String.valueOf(str));
        C58800sl lA2 = ((C58528ij) Collection.EL.stream(keySet).filter(new C25254cf(concat)).map(new C25255cg(concat)).collect(C58370cn.f155947b)).iterator();
        while (lA2.hasNext()) {
            ihVar.mo55373c("lens_confirmation_dialog_shown" + str + ((String) lA2.next()));
        }
        C58528ij f = ihVar.mo55486f();
        if (f.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        SharedPreferences.Editor edit = dVar.f270527a.edit();
        C58800sl lA3 = f.iterator();
        while (lA3.hasNext()) {
            edit.remove((String) lA3.next());
        }
        if (edit.commit()) {
            return BuildConfig.FLAVOR;
        }
        throw new IllegalStateException("Failed to cleanup account keys");
    }
}
