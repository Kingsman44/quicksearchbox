package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.p3925d.C51776b;
import com.google.assistant.p3897e.p3921j.p3925d.C51778d;
import com.google.assistant.p3897e.p3921j.p3925d.C51780f;
import com.google.assistant.p3897e.p3921j.p3925d.C51782h;
import com.google.assistant.p3897e.p3921j.p3926e.C51910dq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class InterpreterKeyboardInputView extends RelativeLayout {

    /* renamed from: a */
    private static final C59071e f314738a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterKeyboardInputView");

    /* renamed from: b */
    private final View f314739b;

    /* renamed from: c */
    private final Animation f314740c;

    /* renamed from: d */
    private final Animation f314741d;

    /* renamed from: e */
    private final Animation f314742e;

    /* renamed from: f */
    private boolean f314743f;

    /* renamed from: g */
    private Boolean f314744g;

    /* renamed from: h */
    private C113707x f314745h;

    /* renamed from: i */
    private String f314746i;

    public InterpreterKeyboardInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f314739b = LayoutInflater.from(context).inflate(R.layout.interpreter_keyboard_input, this, true);
        this.f314740c = AnimationUtils.loadAnimation(context, R.anim.interpreter_fade_in);
        this.f314741d = AnimationUtils.loadAnimation(context, R.anim.interpreter_fade_out);
        this.f314742e = AnimationUtils.loadAnimation(context, R.anim.interpreter_mode_change_fade_out);
    }

    /* renamed from: a */
    public final EditText mo100398a() {
        return (EditText) this.f314739b.findViewById(R.id.keyboard_main_text);
    }

    /* renamed from: b */
    public final TextView mo100399b() {
        return (TextView) this.f314739b.findViewById(R.id.keyboard_cancel_button);
    }

    /* renamed from: c */
    public final TextView mo100400c() {
        return (TextView) this.f314739b.findViewById(R.id.keyboard_commit_button);
    }

    /* renamed from: d */
    public final TextView mo100401d() {
        return (TextView) this.f314739b.findViewById(R.id.keyboard_lang_name);
    }

    /* renamed from: e */
    public final void mo100402e(C21370a aVar, boolean z, C113707x xVar) {
        int i;
        this.f314743f = z;
        this.f314745h = xVar;
        mo100398a().setMovementMethod(new ScrollingMovementMethod());
        if (z) {
            i = C19391a.m36980a(getContext(), R.attr.colorPrimary);
        } else {
            i = C19391a.m36980a(getContext(), R.attr.colorSecondary);
        }
        mo100399b().setTextColor(C19391a.m36980a(getContext(), R.attr.colorOnBackground));
        mo100400c().setTextColor(i);
        mo100401d().setTextColor(i);
        mo100399b().setOnClickListener(new C113685bj(aVar, new C113702s(this, xVar)));
        mo100400c().setOnClickListener(new C113685bj(aVar, new C113703t(this)));
        mo100398a().setOnEditorActionListener(new C113704u(this));
        mo100398a().setHintTextColor(C19391a.m36980a(getContext(), R.attr.colorHairline));
        this.f314742e.setAnimationListener(new C113705v(this));
        this.f314741d.setAnimationListener(new C113706w(this));
    }

    /* renamed from: f */
    public final void mo100403f() {
        if (mo100398a().getText().length() == 0) {
            C59104x d = f314738a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "InterpreterKeyInptView");
            ((C59052c) ((C59052c) d).mo56372aa(28228)).mo56386p("Ignoring translate tap with no input.");
        } else if (this.f314746i != null && this.f314745h != null) {
            C58976aa aaVar = C58975e.f156826a;
            this.f314745h.mo100329b(mo100398a().getText().toString(), this.f314746i);
        }
    }

    /* renamed from: g */
    public final void mo100404g(String str) {
        mo100398a().requestFocus();
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(mo100398a(), 1);
        EditText a = mo100398a();
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        a.setText(str);
        mo100398a().setSelection(mo100398a().length());
    }

    /* renamed from: h */
    public final void mo100405h() {
        C58976aa aaVar = C58975e.f156826a;
        mo100398a().setText(BuildConfig.FLAVOR);
    }

    /* renamed from: i */
    public final void mo100406i(C51910dq dqVar) {
        String str;
        C51780f fVar;
        boolean z = this.f314743f;
        if (z) {
            str = dqVar.f136163c;
        } else {
            str = dqVar.f136164d;
        }
        this.f314746i = str;
        if (z) {
            C51776b bVar = dqVar.f136165e;
            if (bVar == null) {
                bVar = C51776b.f135842e;
            }
            fVar = bVar.f135845b;
            if (fVar == null) {
                fVar = C51780f.f135862d;
            }
        } else {
            C51776b bVar2 = dqVar.f136165e;
            if (bVar2 == null) {
                bVar2 = C51776b.f135842e;
            }
            fVar = bVar2.f135846c;
            if (fVar == null) {
                fVar = C51780f.f135862d;
            }
        }
        TextView d = mo100401d();
        C51782h hVar = fVar.f135865b;
        if (hVar == null) {
            hVar = C51782h.f135867c;
        }
        d.setText(hVar.f135870b);
        C51778d dVar = fVar.f135866c;
        if (dVar == null) {
            dVar = C51778d.f135848m;
        }
        EditText a = mo100398a();
        C51782h hVar2 = dVar.f135852c;
        if (hVar2 == null) {
            hVar2 = C51782h.f135867c;
        }
        a.setHint(hVar2.f135870b);
        TextView b = mo100399b();
        C51782h hVar3 = dVar.f135861l;
        if (hVar3 == null) {
            hVar3 = C51782h.f135867c;
        }
        b.setText(hVar3.f135870b);
        TextView c = mo100400c();
        C51782h hVar4 = dVar.f135860k;
        if (hVar4 == null) {
            hVar4 = C51782h.f135867c;
        }
        c.setText(hVar4.f135870b);
    }

    /* renamed from: j */
    public final void mo100407j() {
        C58976aa aaVar = C58975e.f156826a;
        Boolean bool = this.f314744g;
        if (bool == null || !bool.booleanValue()) {
            this.f314740c.cancel();
            this.f314741d.cancel();
            this.f314740c.reset();
            startAnimation(this.f314740c);
            setVisibility(0);
            this.f314744g = true;
        }
    }

    /* renamed from: k */
    public final void mo100408k(int i) {
        C58976aa aaVar = C58975e.f156826a;
        Boolean bool = this.f314744g;
        if (bool == null || bool.booleanValue()) {
            this.f314744g = false;
            this.f314740c.cancel();
            this.f314741d.cancel();
            this.f314742e.cancel();
            if (i == 1) {
                setVisibility(8);
            } else if (i == 3) {
                this.f314742e.reset();
                startAnimation(this.f314742e);
            } else {
                this.f314741d.reset();
                startAnimation(this.f314741d);
            }
        }
    }
}
