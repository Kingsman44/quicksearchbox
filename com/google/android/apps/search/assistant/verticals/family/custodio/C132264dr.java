package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p427am.p432b.p433a.C8652bd;
import com.google.p427am.p432b.p433a.C8654bf;
import com.google.p427am.p432b.p433a.C8662bn;
import com.google.p427am.p432b.p433a.C8672bx;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.dr */
/* compiled from: PG */
public final class C132264dr {

    /* renamed from: a */
    public static final C59071e f361006a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.dr");

    /* renamed from: b */
    public final CustodioValidatorFragment f361007b;

    /* renamed from: c */
    public final Bundle f361008c;

    /* renamed from: d */
    public final C46485f f361009d;

    /* renamed from: e */
    public final C46801dp f361010e;

    /* renamed from: f */
    public final C132140a f361011f;

    /* renamed from: g */
    public final C37215b f361012g;

    /* renamed from: h */
    public final C132265a f361013h;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.dr$a */
    /* compiled from: PG */
    final class C132265a implements C46792di {
        public C132265a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132264dr.f361006a.mo56225c()).mo56382g(th)).mo56372aa(39580)).mo56386p("Failed to validate Custodio flow!");
            C132264dr drVar = C132264dr.this;
            drVar.f361012g.mo19974a(C37176a.f97023di);
            drVar.f361009d.mo50482c(drVar.f361007b).mo50508d(R.id.assistant_custodio_validator_fragment_to_dialog, C132287ei.m214954a(drVar.f361007b.getString(R.string.assistant_custodio_fatal_error_title), drVar.f361007b.getString(R.string.assistant_custodio_fatal_error_body), drVar.f361007b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8662bn bnVar = ((C8672bx) obj).f29986a;
            if (bnVar != null) {
                C8654bf bfVar = bnVar.f29969c;
                if (bfVar == null) {
                    bfVar = C8654bf.f29945c;
                }
                String str = bnVar.f29967a;
                String str2 = bnVar.f29968b;
                String str3 = bnVar.f29970d;
                int a = C8652bd.m23364a(bfVar.f29947a);
                if (a == 0) {
                    a = 1;
                }
                int i = a - 2;
                Bundle a2 = C132287ei.m214954a(str, str2, str3, i != 1 ? i != 3 ? "action_finish_activity" : "action_perform_url_deeplink_and_finish" : "action_navigate_to_selector_fragment", (String) null, (String) null);
                int a3 = C8652bd.m23364a(bfVar.f29947a);
                if (a3 != 0 && a3 == 5) {
                    ((Bundle) Objects.requireNonNull(a2.getBundle("dialog_data_key"))).putString("param_perform_url_deeplink_url_key", bfVar.f29948b);
                }
                a2.putAll(C132264dr.this.f361008c);
                int a4 = C8652bd.m23364a(bfVar.f29947a);
                if (a4 != 0 && a4 == 3) {
                    C132264dr.this.f361012g.mo19974a(C37176a.f97013dY);
                } else {
                    C132264dr.this.f361012g.mo19974a(C37176a.f97014dZ);
                }
                C132264dr drVar = C132264dr.this;
                drVar.f361009d.mo50482c(drVar.f361007b).mo50508d(R.id.assistant_custodio_validator_fragment_to_dialog, a2);
                return;
            }
            C132264dr.this.f361012g.mo19974a(C37176a.f97012dX);
            C132264dr drVar2 = C132264dr.this;
            drVar2.f361009d.mo50482c(drVar2.f361007b).mo50508d(R.id.assistant_custodio_validator_fragment_to_selector, C132264dr.this.f361008c);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C132264dr(CustodioValidatorFragment custodioValidatorFragment, C46485f fVar, C46801dp dpVar, C132140a aVar, C37215b bVar) {
        this.f361007b = custodioValidatorFragment;
        Bundle arguments = custodioValidatorFragment.getArguments();
        this.f361008c = arguments == null ? new Bundle() : arguments;
        this.f361009d = fVar;
        this.f361010e = dpVar;
        this.f361011f = aVar;
        this.f361012g = bVar;
        this.f361013h = new C132265a();
    }
}
