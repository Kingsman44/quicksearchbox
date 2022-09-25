package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j.C102166bj;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.p4184bj.p4193c.p4195b.p4196a.C55914b;
import dagger.C68214a;

/* compiled from: PG */
public class VAAConsentActivity extends C102243z {

    /* renamed from: k */
    public C0167am f283230k;

    /* renamed from: l */
    public C68214a f283231l;

    /* renamed from: m */
    private C102166bj f283232m;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.aa);
        super.onCreate(bundle);
        setContentView((int) R.layout.vaa_consent_activity);
        this.f283230k.setTheme(2132150879);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        ((C89859i) this.f283231l.mo27525b()).mo83702b(C89849ae.VAA_CONSENT_DEEPLINK_START);
        C102166bj bjVar = new C102166bj();
        this.f283232m = bjVar;
        bjVar.setArguments(getIntent().getExtras());
        C0154a aVar = new C0154a(this.f283230k.mo545jw());
        aVar.mo511h(R.id.vaa_consent_fragment_container, this.f283232m, (String) null, 1);
        aVar.mo509f();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C89849ae aeVar;
        super.onDestroy();
        C102166bj bjVar = this.f283232m;
        if (bjVar != null) {
            if (bjVar.f285009i == 1) {
                aeVar = C89849ae.VAA_CONSENT_DEEPLINK_EXIT;
            } else {
                aeVar = C89849ae.VAA_CONSENT_DEEPLINK_COMPLETE;
            }
            C89859i iVar = (C89859i) this.f283231l.mo27525b();
            C89856f fVar = new C89856f();
            fVar.f246201a = aeVar;
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            C55914b bVar = (C55914b) getIntent().getSerializableExtra("entry_point");
            if (bVar != null) {
                ajVar.copyOnWrite();
                C59687cb cbVar = (C59687cb) ajVar.instance;
                cbVar.f160108at = bVar.f148838j;
                cbVar.f160122c |= 1024;
            }
            String stringExtra = getIntent().getStringExtra("utm_source");
            if (stringExtra != null) {
                ajVar.copyOnWrite();
                C59687cb cbVar2 = (C59687cb) ajVar.instance;
                cbVar2.f160122c |= 2048;
                cbVar2.f160109au = stringExtra;
            }
            fVar.f246203c = (C59687cb) ajVar.build();
            iVar.mo74236a(fVar.mo83699a());
        }
    }
}
