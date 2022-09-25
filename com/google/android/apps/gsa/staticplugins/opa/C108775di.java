package com.google.android.apps.gsa.staticplugins.opa;

import android.content.SharedPreferences;
import android.view.View;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108248bs;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108250bu;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import com.google.android.apps.gsa.staticplugins.opa.greeting.C109105b;
import com.google.android.apps.gsa.staticplugins.opa.util.C113880k;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.di */
/* compiled from: PG */
final class C108775di implements C22869e {

    /* renamed from: a */
    final /* synthetic */ C109040fj f302499a;

    public C108775di(C109040fj fjVar) {
        this.f302499a = fjVar;
    }

    public final void run() {
        int i;
        int i2;
        SharedPreferences.Editor edit = ((SharedPreferences) this.f302499a.f303251aK.mo27525b()).edit();
        if ((this.f302499a.f303323bd.f303833j == C113984c.TRY_BEFORE_YOU_BUY_QUERY_SUGGESTION_FOR_NEW_USERS || this.f302499a.f303323bd.f303833j == C113984c.TRY_BEFORE_YOU_BUY_QUERY_SUGGESTION_FOR_ACTIVATED_USERS) && (i2 = ((SharedPreferences) this.f302499a.f303251aK.mo27525b()).getInt("opa_greeting_with_query_suggestion_for_tbyb_remaining_count", -1)) > 0) {
            edit.putInt("opa_greeting_with_query_suggestion_for_tbyb_remaining_count", i2 - 1);
        }
        edit.apply();
        C109040fj fjVar = this.f302499a;
        if (fjVar.f303323bd.f303833j == C113984c.UPGRADED_USER_WITH_TIMEOUT_TO_QUERY_SUGGESTION) {
            fjVar.mo97541n();
            this.f302499a.f303448m.mo28213m("startSecondGreetingPhase", 3000, new C108773dg(this));
        }
        View findViewById = this.f302499a.f303238X.mo96181i().findViewById(R.id.opa_search_plate);
        if (findViewById != null) {
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C108774dh(this, findViewById));
        }
        C109040fj fjVar2 = this.f302499a;
        if (!fjVar2.mo97517bi() && (fjVar2.f303323bd.f303833j != C113984c.TRY_BEFORE_YOU_BUY_VIDEO || fjVar2.f303455t.mo79746e(C90014bt.f247439hF))) {
            this.f302499a.mo97427O();
        } else {
            this.f302499a.mo97459aU();
        }
        View view = this.f302499a.f303221G;
        if (view != null) {
            view.setVisibility(8);
        }
        this.f302499a.mo97431S(true);
        this.f302499a.f303238X.mo96143aP();
        C109105b bVar = this.f302499a.f303323bd;
        C113984c cVar = bVar.f303833j;
        if (cVar == C113984c.TRY_BEFORE_YOU_BUY_SUGGESTION) {
            if (cVar == C113984c.TRY_BEFORE_YOU_BUY_SUGGESTION && (i = bVar.f303836m) != 1 && i != 5 && bVar.f303827d.mo79746e(C90014bt.f247115b) && !((C113880k) bVar.f303828e.mo27525b()).mo100740f()) {
                C109040fj fjVar3 = this.f302499a;
                ArrayList arrayList = new ArrayList();
                arrayList.add(((C108250bu) fjVar3.f303321bb.mo27525b()).mo96700a(C108248bs.REMIND_LEARN_OPA_LATER, new Object[0]));
                arrayList.add(((C108250bu) fjVar3.f303321bb.mo27525b()).mo96700a(C108248bs.WARMER_WELCOME, new Object[0]));
                fjVar3.f303450o.mo95361C(arrayList);
            } else {
                C109040fj fjVar4 = this.f302499a;
                if (fjVar4.f303455t.mo79746e(C90014bt.f247149bh) && fjVar4.mo97517bi()) {
                    fjVar4.f303450o.mo95361C(Arrays.asList(new C108430ik[]{((C108250bu) fjVar4.f303321bb.mo27525b()).mo96700a(C108248bs.TRAIN_VOICE_MATCH, new Object[0])}));
                }
                C109040fj fjVar5 = this.f302499a;
                if (fjVar5.f303455t.mo79746e(C90014bt.f247149bh) && fjVar5.mo97517bi()) {
                    fjVar5.f303450o.mo95361C(Arrays.asList(new C108430ik[]{((C108250bu) fjVar5.f303321bb.mo27525b()).mo96700a(C108248bs.TURN_OFF_HOTWORD, new Object[0])}));
                }
                this.f302499a.mo97438Z();
            }
            this.f302499a.mo97437Y();
        }
    }
}
