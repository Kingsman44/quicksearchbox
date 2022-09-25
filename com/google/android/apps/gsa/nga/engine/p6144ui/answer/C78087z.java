package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.app.KeyguardManager;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.z */
/* compiled from: PG */
public final /* synthetic */ class C78087z implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ AnswerUiRenderer f215073a;

    public /* synthetic */ C78087z(AnswerUiRenderer answerUiRenderer) {
        this.f215073a = answerUiRenderer;
    }

    public final void accept(Object obj) {
        AnswerUiRenderer answerUiRenderer = this.f215073a;
        C78034ag agVar = (C78034ag) obj;
        answerUiRenderer.f214896l.mo124464f();
        answerUiRenderer.f214886b.getWindow().setSoftInputMode(true != agVar.mo73003i() ? 2 : 4);
        if (agVar.mo73002h()) {
            answerUiRenderer.f214886b.getWindow().addFlags(2621568);
        } else {
            KeyguardManager keyguardManager = (KeyguardManager) answerUiRenderer.f214886b.getSystemService(KeyguardManager.class);
            if (keyguardManager.isKeyguardLocked()) {
                keyguardManager.requestDismissKeyguard(answerUiRenderer.f214886b, (KeyguardManager.KeyguardDismissCallback) null);
            }
        }
        Optional b = agVar.mo72996b();
        if (b.isPresent()) {
            answerUiRenderer.f214891g.setText((CharSequence) b.get());
        } else {
            answerUiRenderer.f214891g.setText(BuildConfig.FLAVOR);
        }
        Optional e = agVar.mo72999e();
        if (e.isPresent()) {
            answerUiRenderer.f214894j.setText((CharSequence) e.get());
            answerUiRenderer.f214894j.setVisibility(0);
        } else {
            answerUiRenderer.f214894j.setVisibility(8);
        }
        answerUiRenderer.f214890f.setVisibility(true != agVar.mo73001g() ? 8 : 0);
        Optional d = agVar.mo72998d();
        Optional c = agVar.mo72997c();
        if (c.isPresent() || d.isPresent()) {
            answerUiRenderer.f214893i.setVisibility(0);
        } else {
            answerUiRenderer.f214893i.setVisibility(8);
        }
        answerUiRenderer.mo72976j();
        if (c.isPresent()) {
            C0154a aVar = new C0154a(answerUiRenderer.f214886b.mo545jw());
            aVar.mo689v(answerUiRenderer.f214893i.getId(), (Fragment) c.get(), (String) null);
            aVar.mo510g();
        } else if (d.isPresent()) {
            answerUiRenderer.f214893i.addView((View) d.get());
        }
        answerUiRenderer.f214892h.setOnTouchListener(new C78063bi(answerUiRenderer.f214886b, answerUiRenderer.f214898n));
        answerUiRenderer.f214892h.getViewTreeObserver().addOnGlobalLayoutListener(answerUiRenderer.f214897m);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
