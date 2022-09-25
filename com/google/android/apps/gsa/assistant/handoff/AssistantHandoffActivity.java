package com.google.android.apps.gsa.assistant.handoff;

import android.accounts.Account;
import android.accounts.AccountsException;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3862au.C50520d;
import com.google.assistant.p3862au.C50522f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
public class AssistantHandoffActivity extends C9451ah {

    /* renamed from: a */
    public static final C59071e f32838a = C59071e.m91332i("com.google.android.apps.gsa.assistant.handoff.AssistantHandoffActivity");

    /* renamed from: b */
    public static final AtomicReference f32839b = new AtomicReference(C58836b.f156633a);

    /* renamed from: c */
    boolean f32840c;

    /* renamed from: d */
    public C84413ad f32841d;

    /* renamed from: e */
    public C9492y f32842e;

    /* renamed from: f */
    public C91090a f32843f;

    /* renamed from: g */
    public C86054o f32844g;

    /* renamed from: h */
    public Set f32845h;

    /* renamed from: i */
    public C22871g f32846i;

    /* renamed from: j */
    public C22871g f32847j;

    /* renamed from: k */
    public int f32848k = 0;

    /* renamed from: l */
    public int f32849l = 0;

    /* renamed from: m */
    public String f32850m;

    /* renamed from: a */
    public static int m23957a(Intent intent, String str) {
        if (intent.getData() != null && !TextUtils.isEmpty(intent.getData().getQueryParameter(str))) {
            try {
                return Integer.parseInt(intent.getData().getQueryParameter(str));
            } catch (NumberFormatException e) {
                C59104x d = f32838a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AssistantHandoffActvt");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(225)).mo56352E("Failed to parse %s query parameter, using default value %d", str, 0);
            }
        }
        if (intent.hasExtra(str)) {
            return intent.getIntExtra(str, 0);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        C60870cx cxVar;
        C60870cx cxVar2;
        super.onActivityResult(i, i2, intent);
        for (C9444aa aaVar : this.f32845h) {
            if (aaVar.f32858c.f32951j == i) {
                C9448ae a = aaVar.mo17685a(i2, intent);
                C58833ax b = a.mo17693b();
                if (this.f32848k == 1 && this.f32849l == 1 && b.mo56113h()) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    Intent intent2 = (Intent) a.mo17694c().mo56109e(new Intent());
                    intent2.putExtra("assistant_handoff_result_request", C23245b.m43556a((C50522f) b.mo56107c()));
                    setResult(a.mo17692a(), intent2);
                    finish();
                } else if (this.f32848k != 1 || (!((i3 = this.f32849l) == 2 || i3 == 0) || !b.mo56113h() || TextUtils.isEmpty(this.f32850m))) {
                    C58976aa aaVar3 = C58975e.f156826a;
                    setResult(a.mo17692a(), (Intent) a.mo17694c().mo56111f());
                    finish();
                } else {
                    C58976aa aaVar4 = C58975e.f156826a;
                    C50520d dVar = (C50520d) ((C50522f) b.mo56107c()).toBuilder();
                    String str = this.f32850m;
                    str.getClass();
                    dVar.copyOnWrite();
                    ((C50522f) dVar.instance).f131503a = str;
                    C50522f fVar = (C50522f) dVar.build();
                    C22871g gVar = this.f32846i;
                    C9492y yVar = this.f32842e;
                    if (fVar.f131504b.isEmpty() || fVar.f131503a.isEmpty()) {
                        cxVar = C60856cj.m92899h(new IllegalArgumentException("Illegal HandoffResultRequest provided."));
                    } else {
                        C90929bz bzVar = (C90929bz) yVar.f32939d.mo27525b();
                        C90929bz bzVar2 = (C90929bz) yVar.f32939d.mo27525b();
                        Account a2 = ((C86054o) yVar.f32940e.mo27525b()).mo79668a();
                        if (a2 == null) {
                            cxVar2 = C60856cj.m92899h(new AccountsException("Can't get account name for the current user."));
                        } else {
                            cxVar2 = ((C86054o) yVar.f32940e.mo27525b()).mo79671e(yVar.f32937b.mo79758x(C90014bt.f247534iv), a2, new C91032p());
                        }
                        cxVar = bzVar.mo85140e(bzVar2.mo85140e(cxVar2, new C9491x(yVar)), new C9490w(fVar));
                    }
                    gVar.mo28211k(cxVar, "AssistantHandoffActivity setResult", new C9474g(this, a));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.b);
        super.onCreate(bundle);
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f32840c = bundle.getBoolean("browser_flow_started");
        this.f32848k = bundle.getInt("resume", 0);
        this.f32849l = bundle.getInt("resume_type", 0);
        this.f32850m = bundle.getString("state");
        for (C9444aa aaVar : this.f32845h) {
            aaVar.f32859d = bundle.getBoolean(aaVar.f32858c.name());
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        C58976aa aaVar = C58975e.f156826a;
        this.f32847j.mo28212l("Check caller signature", new C9473f(this));
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("browser_flow_started", this.f32840c);
        bundle.putInt("resume", this.f32848k);
        bundle.putInt("resume_type", this.f32849l);
        bundle.putString("state", this.f32850m);
        for (C9444aa aaVar : this.f32845h) {
            bundle.putBoolean(aaVar.f32858c.name(), aaVar.f32859d);
        }
    }
}
