package com.google.android.apps.gsa.speech.setupwizard;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.p3555d.C45301i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* compiled from: PG */
public class HotwordSetupWizardActivity extends C92649a {

    /* renamed from: d */
    private static final C59071e f258624d = C59071e.m91332i("com.google.android.apps.gsa.speech.setupwizard.HotwordSetupWizardActivity");

    /* renamed from: a */
    public C92486a f258625a;

    /* renamed from: b */
    public C86054o f258626b;

    /* renamed from: c */
    public C68214a f258627c;

    /* renamed from: e */
    private C91090a f258628e;

    public final void onActivityResult(int i, int i2, Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        super.onActivityResult(i, i2, intent);
        C91090a aVar = this.f258628e;
        if (aVar != null) {
            aVar.mo85356g(i, i2, intent, aVar.f254379a);
        }
    }

    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.N);
        C58976aa aaVar = C58975e.f156826a;
        super.onCreate(bundle);
        if (BitFlags.m148144f((long) getIntent().getFlags(), 33554432)) {
            setTheme(2132150212);
            setContentView(R.layout.opa_hotword_setup_wizard);
            GlifLayout glifLayout = (GlifLayout) findViewById(R.id.root);
            ((C45301i) glifLayout.mo49129j(C45301i.class)).mo49235c(true);
            ((C45301i) glifLayout.mo49129j(C45301i.class)).mo49233a();
        } else {
            setContentView(R.layout.hotword_setup_wizard);
            if (((ProgressBar) findViewById(R.id.progress_bar)) == null) {
                throw null;
            }
        }
        C91090a aVar = new C91090a(this, this, 1000);
        this.f258628e = aVar;
        aVar.mo85358i(bundle);
        if (C90772bp.m148283J(this)) {
            new AlertDialog.Builder(this).setTitle(getString(R.string.hotword_setup_wizard_low_ram_device_title, new Object[]{this.f258625a.mo87230d()})).setMessage(R.string.hotword_setup_wizard_low_ram_device_message).setNeutralButton(R.string.hotword_setup_wizard_dismiss_button, (DialogInterface.OnClickListener) null).setOnDismissListener(new C92650b(this)).show();
        } else if (this.f258626b.mo79668a() != null) {
            C74554t i = C74555u.m120572i();
            i.mo70869c(C9439b.ANDROID_SETUP_WIZARD);
            Intent h = i.mo70882h();
            if (BitFlags.m148144f((long) getIntent().getFlags(), 33554432)) {
                h.addFlags(33554432);
                this.f258628e.mo65089a(h);
                finish();
                return;
            }
            this.f258628e.mo65090b(h, new C92651c(this));
        } else {
            C59104x c = f258624d.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HotwordSetupWActivity");
            ((C59052c) ((C59052c) c).mo56372aa(13024)).mo56386p("No account found, can't fetch Audio History.");
            Toast.makeText(this, R.string.cloud_search_history_fetch_failed_toast, 0).show();
            setResult(2);
            finish();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f258628e.mo85357h(bundle);
    }
}
