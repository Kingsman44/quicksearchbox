package com.google.android.apps.gsa.opa;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.opa.j */
/* compiled from: PG */
public final /* synthetic */ class C83712j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C83722r f228164a;

    public /* synthetic */ C83712j(C83722r rVar) {
        this.f228164a = rVar;
    }

    public final Object call() {
        C83722r rVar = this.f228164a;
        rVar.f228184m = (C83816y) C83817z.f228433c.createBuilder();
        ((C118831d) rVar.f228179h.mo6453a()).mo104025g(1);
        if (!((C90021c) rVar.f228172a.mo27525b()).mo79746e(C90014bt.f247326ez)) {
            C58976aa aaVar = C58975e.f156826a;
            ((C118831d) rVar.f228180i.mo6453a()).mo104025g(0);
            return C118826c.f331422a;
        }
        C89994f fVar = (C89994f) rVar.f228175d.mo27525b();
        if (fVar.mo83848K()) {
            C58976aa aaVar2 = C58975e.f156826a;
            ((C118831d) rVar.f228181j.mo6453a()).mo104025g(1);
            return C118826c.f331422a;
        }
        C89949q.m146523g(1367);
        SharedPreferences.Editor edit = ((SharedPreferences) rVar.f228174c.mo27525b()).edit();
        edit.putBoolean("user_profile_lang_speaker_id_model_transition_task", true);
        String af = fVar.mo83886af();
        String concat = "speaker_model_".concat(String.valueOf(af));
        C58976aa aaVar3 = C58975e.f156826a;
        String string = ((SharedPreferences) rVar.f228174c.mo27525b()).getString(concat, (String) null);
        if (string == null) {
            edit.apply();
            ((C118831d) rVar.f228182k.mo6453a()).mo104025g(1);
            return C118826c.f331422a;
        }
        HashSet hashSet = new HashSet();
        for (String g : ((C86054o) rVar.f228173b.mo27525b()).mo79685s()) {
            String str = "speaker_model_" + af + ":" + rVar.f228176e.d(C58837ba.m90858g(g)).toLanguageTag();
            if (hashSet.add(str)) {
                edit.putString(str, string);
            }
        }
        edit.putStringSet(concat, (Set) null).apply();
        C89949q.m146523g(1366);
        ((C118831d) rVar.f228183l.mo6453a()).mo104025g(1);
        return C118826c.f331422a;
    }
}
