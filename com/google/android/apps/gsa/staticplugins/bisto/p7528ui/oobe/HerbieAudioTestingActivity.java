package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.C90779c;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.HerbieAudioTestingActivity */
/* compiled from: PG */
public class HerbieAudioTestingActivity extends C96297il {

    /* renamed from: b */
    private static final C59071e f268952b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.HerbieAudioTestingActivity");

    /* renamed from: a */
    public C68214a f268953a;

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.Q);
        super.onCreate(bundle);
        C90779c.m148334a(this, 1);
        requestWindowFeature(1);
        String stringExtra = getIntent().getStringExtra("key_device_id");
        if (stringExtra == null) {
            C59104x d = f268952b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HerbieATActivity");
            ((C59052c) ((C59052c) d).mo56372aa(17001)).mo56386p("Cannot continue without a device id");
            finish();
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("key_device_id", stringExtra);
        C124548d b = ((C89492cd) this.f268953a.mo27525b()).mo83401b(stringExtra);
        if (b == null) {
            C59104x d2 = f268952b.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "HerbieATActivity");
            ((C59052c) ((C59052c) d2).mo56372aa(17000)).mo56386p("Cannot continue without device info");
            finish();
            return;
        }
        String str = true != C124707e.INPUT_ONLY_MODE.equals(b.mo106508g()) ? "HerbieAuxAudioTesting" : "HerbieBtAudioTesting";
        C83879am o = C83880an.m133553o();
        C83940g gVar = (C83940g) o;
        gVar.f228605a = str;
        gVar.f228607c = new C83938e(0, (String) null, (String) null);
        gVar.f228606b = bundle2;
        gVar.f228610f = C58833ax.m90834k(C96331js.m159639a(b.mo106513k()));
        C59566v vVar = (C59566v) C59567w.f158058g.createBuilder();
        C9439b bVar = C9439b.BISTO_ONBOARDING;
        vVar.copyOnWrite();
        C59567w wVar = (C59567w) vVar.instance;
        wVar.f158062c = bVar.f32835aq;
        wVar.f158060a |= 2;
        o.mo77222b((C59567w) vVar.build());
        startActivityForResult(o.mo77221a().mo77240n(), 1);
    }
}
