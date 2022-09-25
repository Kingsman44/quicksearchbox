package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.p5964av.C75158f;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.KeyboardHandler */
/* compiled from: PG */
final class KeyboardHandler {

    /* renamed from: a */
    public final View f214915a;

    /* renamed from: b */
    public final C2391v f214916b;

    /* renamed from: c */
    public final C22871g f214917c;

    /* renamed from: d */
    public final C75158f f214918d;

    /* renamed from: e */
    public final InputMethodManager f214919e;

    /* renamed from: f */
    public final C75155d f214920f = new C78048au(this);

    /* renamed from: g */
    public final C2376g f214921g = new C2376g() {
        /* renamed from: gV */
        public final void mo3520gV(C2391v vVar) {
            KeyboardHandler keyboardHandler = KeyboardHandler.this;
            keyboardHandler.f214918d.mo71506b(keyboardHandler.f214920f);
        }

        /* renamed from: gW */
        public final void mo3521gW(C2391v vVar) {
            vVar.getLifecycle().mo5791c(KeyboardHandler.this.f214921g);
            KeyboardHandler keyboardHandler = KeyboardHandler.this;
            keyboardHandler.f214918d.mo71507c(keyboardHandler.f214920f);
        }

        /* renamed from: gX */
        public final /* synthetic */ void mo3522gX(C2391v vVar) {
        }

        /* renamed from: gY */
        public final /* synthetic */ void mo3523gY(C2391v vVar) {
        }

        /* renamed from: gZ */
        public final /* synthetic */ void mo3524gZ(C2391v vVar) {
        }

        /* renamed from: ha */
        public final /* synthetic */ void mo3525ha(C2391v vVar) {
        }
    };

    public KeyboardHandler(Context context, C2391v vVar, View view, C22871g gVar, C75158f fVar) {
        this.f214915a = view;
        this.f214919e = (InputMethodManager) context.getSystemService("input_method");
        this.f214916b = vVar;
        this.f214917c = gVar;
        this.f214918d = fVar;
    }
}
