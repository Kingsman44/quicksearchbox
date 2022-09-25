package com.google.android.apps.gsa.staticplugins.hotwordenrollment.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* compiled from: PG */
public class EnterHotwordMigrationActivity extends C101796l {

    /* renamed from: j */
    public C68214a f283921j;

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C58976aa aaVar = C58975e.f156826a;
        if (i == 1230) {
            finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.ab);
        C58976aa aaVar = C58975e.f156826a;
        super.onCreate(bundle);
        ((C118827a) this.f283921j.mo27525b()).mo77944g(C118569b.VOICE_MATCH_DEEPLINK_HEY_GOOGLE_MIGRATION_COUNT, C118575h.VOICE_MATCH_ENROLLMENT).mo104025g(1);
        C18509a c = C18522b.m35986c();
        c.mo24023e("hey_migration_retrain_deep_link");
        ((C18523c) c).f52492a = "speaker_id_enrollment";
        startActivityForResult(c.mo24020b().mo24031a().putExtra("finish_after_retrain", true), 1230);
    }
}
