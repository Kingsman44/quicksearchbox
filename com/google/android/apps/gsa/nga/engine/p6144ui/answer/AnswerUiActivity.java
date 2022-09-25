package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p033v7.app.C0395p;
import android.view.View;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.nga.engine.p5913am.p5935p.C74946b;
import com.google.android.apps.gsa.nga.engine.p5972aw.C75165g;
import com.google.android.apps.gsa.nga.p5887c.C74745a;
import com.google.android.apps.gsa.nga.shared.p6319ak.C80883c;
import com.google.android.apps.gsa.nga.shared.p6367t.C81506a;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.animation.impl.C147783f;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.AnswerUiActivity */
/* compiled from: PG */
public class AnswerUiActivity extends C0395p {

    /* renamed from: j */
    public C78032ae f214880j;

    /* renamed from: k */
    AnswerUiRenderer f214881k;

    public final void finish() {
        super.finish();
        overridePendingTransition(17432576, 17432577);
    }

    public final void onBackPressed() {
        AnswerUiRenderer answerUiRenderer = this.f214881k;
        answerUiRenderer.f214888d.mo71314d();
        answerUiRenderer.mo72977k();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.uiMode & 48;
        if (i == 16) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
        } else if (i == 32) {
            View decorView2 = getWindow().getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | -17);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.z);
        overridePendingTransition(17432576, 17432577);
        C78027a aVar = (C78027a) C74745a.m120861a(this);
        if (aVar != null) {
            aVar.mo72986pR(this);
            super.onCreate(bundle);
            setContentView((int) R.layout.activity_answer_ui);
            C78032ae aeVar = this.f214880j;
            View findViewById = findViewById(R.id.answer_activity_root);
            findViewById.getClass();
            C78078q qVar = (C78078q) aeVar.f214940a.mo17428b();
            qVar.getClass();
            C74946b bVar = (C74946b) aeVar.f214941b.mo17428b();
            bVar.getClass();
            C78037aj ajVar = (C78037aj) aeVar.f214942c.mo17428b();
            ajVar.getClass();
            C78075n nVar = (C78075n) aeVar.f214943d.mo17428b();
            nVar.getClass();
            C81506a aVar2 = (C81506a) aeVar.f214944e.mo17428b();
            aVar2.getClass();
            C78049av avVar = (C78049av) aeVar.f214945f.mo17428b();
            avVar.getClass();
            C147783f fVar = (C147783f) aeVar.f214946g.mo17428b();
            fVar.getClass();
            C78057bc bcVar = (C78057bc) aeVar.f214947h.mo17428b();
            bcVar.getClass();
            C75165g gVar = (C75165g) aeVar.f214948i.mo17428b();
            gVar.getClass();
            C80883c cVar = (C80883c) aeVar.f214949j.mo17428b();
            cVar.getClass();
            AnswerUiRenderer answerUiRenderer = new AnswerUiRenderer(this, this, findViewById, qVar, bVar, ajVar, nVar, aVar2, avVar, fVar, bcVar, gVar, cVar);
            this.f214881k = answerUiRenderer;
            answerUiRenderer.f214887c.getLifecycle().mo5790b(answerUiRenderer);
            return;
        }
        throw new IllegalStateException("Could not create injector for AnswerUiActivity.");
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        AnswerUiRenderer answerUiRenderer = this.f214881k;
        answerUiRenderer.f214887c.getLifecycle().mo5791c(answerUiRenderer);
        super.onDestroy();
    }
}
