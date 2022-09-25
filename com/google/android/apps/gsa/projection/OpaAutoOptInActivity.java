package com.google.android.apps.gsa.projection;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.carassistant.p6778b.C85688c;
import com.google.android.apps.gsa.search.core.carassistant.p6778b.C85689d;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.opa.p8363f.C109029a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* compiled from: PG */
public class OpaAutoOptInActivity extends C84194f {

    /* renamed from: f */
    private static final C59071e f229154f = C59071e.m91332i("com.google.android.apps.gsa.projection.OpaAutoOptInActivity");

    /* renamed from: a */
    public C86124t f229155a;

    /* renamed from: b */
    public C84413ad f229156b;

    /* renamed from: c */
    public C68214a f229157c;

    /* renamed from: d */
    public C85689d f229158d;

    /* renamed from: e */
    public C109029a f229159e;

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        if (i == 0) {
            setResult(i2, intent);
            finish();
            return;
        }
        int i3 = 0;
        if (i == 1) {
            if (i2 != -1 && (i2 == 0 || i2 == 1)) {
                i3 = 2;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("opt_in_result", i3);
            intent2.putExtra("opa_opt_in_result", i2);
            setResult(-1, intent2);
            finish();
            return;
        }
        ((C59052c) ((C59052c) f229154f.mo56226d()).mo56372aa(7090)).mo56359L("onActivityResult was neither called by Now opt-in activity nor Opa opt-in activityrequestCode: (%d), resultCode: (%d), intent data: (%s)", valueOf, valueOf2, intent);
        setResult(0);
    }

    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.D);
        super.onCreate(bundle);
        if (!"com.google.android.apps.opa.OPT_IN_1P".equals(getIntent().getAction())) {
            ((C59052c) ((C59052c) f229154f.mo56226d()).mo56372aa(7095)).mo56354G("Action (%s) does not match expected action (%s)", getIntent().getAction(), "com.google.android.apps.opa.OPT_IN_1P");
            setResult(0);
            finish();
            return;
        }
        C90476a aVar = C91018d.f254254a;
        if (this.f229156b.mo77970g(this)) {
            boolean e = this.f229155a.mo79746e(C90086ek.f250444dJ);
            C109029a aVar2 = this.f229159e;
            int g = aVar2.mo97402g(((C86054o) this.f229157c.mo27525b()).mo79668a());
            boolean z = !aVar2.mo97403h(g) || g == 5 || g == 6 || g == 7;
            if (!e || !z) {
                Intent intent = new Intent();
                intent.setAction("com.google.android.apps.now.OPT_IN_1P");
                intent.setPackage("com.google.android.googlequicksearchbox");
                intent.putExtras(getIntent());
                startActivityForResult(intent, 0);
                return;
            }
            C85689d dVar = this.f229158d;
            if (dVar.f231722b.mo79743a(C90086ek.f250473dm) > 0 || dVar.f231722b.mo79743a(C90086ek.f250463dc) > 0) {
                dVar.f231721a.mo46039a(C85688c.f231719a, C60826bg.f164896a);
            } else {
                C60870cx cxVar = C60866ct.f164955a;
            }
            C89949q.m146523g(1469);
            if (this.f229155a.mo79746e(C90086ek.f250447dM)) {
                Intent intent2 = null;
                if (getIntent().getIntArrayExtra("requested_settings") == null) {
                    C83879am o = C83880an.m133553o();
                    C83940g gVar = (C83940g) o;
                    gVar.f228605a = "Auto.Onboarding";
                    gVar.f228607c = new C83938e(0, (String) null, (String) null);
                    C59566v vVar = (C59566v) C59567w.f158058g.createBuilder();
                    C9439b bVar = C9439b.AUTO_ONBOARDING;
                    vVar.copyOnWrite();
                    C59567w wVar = (C59567w) vVar.instance;
                    wVar.f158062c = bVar.f32835aq;
                    wVar.f158060a |= 2;
                    o.mo77222b((C59567w) vVar.build());
                    intent2 = o.mo77221a().mo77240n();
                }
                if (intent2 == null) {
                    setResult(0);
                    finish();
                    return;
                }
                startActivityForResult(intent2, 1);
                return;
            }
            setResult(0);
            finish();
            return;
        }
        ((C59052c) ((C59052c) f229154f.mo56226d()).mo56372aa(7094)).mo56389s("Caller %s not google signed, use startActivityForResult?", getCallingActivity());
        setResult(0);
        finish();
    }
}
