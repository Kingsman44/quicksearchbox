package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;
import com.google.android.apps.gsa.assistant.shared.p.e;
import com.google.android.apps.gsa.shared.logger.p7064i.C89922b;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107654an;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107662av;
import com.google.android.libraries.performance.primes.metrics.p2414h.C31499r;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.OpaEditText */
/* compiled from: PG */
public class OpaEditText extends EditText {

    /* renamed from: a */
    public C113714b f314917a;

    /* renamed from: b */
    public C58833ax f314918b;

    /* renamed from: c */
    public C38802e f314919c;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.OpaEditText$a */
    /* compiled from: PG */
    public interface C113712a {
        /* renamed from: qP */
        void mo100559qP(OpaEditText opaEditText);
    }

    public OpaEditText(Context context) {
        super(context);
        m188269a();
    }

    /* renamed from: a */
    private final void m188269a() {
        ((C113712a) C47266f.m84076a(getContext(), C113712a.class)).mo100559qP(this);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C58833ax axVar = this.f314918b;
        if (axVar != null && axVar.mo56113h()) {
            ((C89922b) axVar.mo56107c()).mo83760d();
            this.f314919c.mo41634h();
            C31499r.f84816a.mo37197a((Activity) null);
        }
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C113714b bVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (bVar = this.f314917a) != null) {
            C107654an anVar = (C107654an) bVar;
            anVar.f299487a.f299505N.mo101383a();
            C58976aa aaVar = C58975e.f156826a;
            anVar.f299487a.mo96195w();
            if (!anVar.f299487a.mo96131aD()) {
                anVar.f299487a.mo96104C(true);
                ((C107662av) anVar.f299487a.f299593p.mo27525b()).mo96209e(Optional.empty());
            } else {
                if (!anVar.f299487a.f299582e.mo79746e(C90029ch.f248277bk)) {
                    anVar.f299487a.mo96193u();
                }
                anVar.f299487a.mo96105D(e.b);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public OpaEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m188269a();
    }

    public OpaEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m188269a();
    }
}
