package com.google.android.libraries.assistant.assistantactions.rendering.p639c.p640a;

import android.animation.TimeAnimator;
import android.support.p031v4.app.C0167am;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p633d.C11270g;
import com.google.android.libraries.assistant.assistantactions.rendering.p638b.C11286d;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11300h;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11301i;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.AudioRecorderField;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ButtonField;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.C11403j;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.EditableTextField;
import com.google.android.libraries.material.featurehighlight.C28521c;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.c.a.a */
/* compiled from: PG */
public final class C11292a implements C11300h {

    /* renamed from: a */
    public final C11286d f36722a = new C11286d();

    /* renamed from: b */
    private final C11270g f36723b;

    /* renamed from: c */
    private boolean f36724c;

    public C11292a(C11270g gVar) {
        this.f36723b = gVar;
    }

    /* renamed from: C */
    public final /* synthetic */ void mo19699C(boolean z) {
    }

    /* renamed from: D */
    public final boolean mo19700D() {
        return this.f36724c;
    }

    /* renamed from: E */
    public final boolean mo19701E(String str) {
        return C11286d.f36705a.contains(str);
    }

    /* renamed from: F */
    public final boolean mo19702F(String str) {
        return C11286d.f36706b.contains(str);
    }

    /* renamed from: G */
    public final boolean mo19703G(C51809dy dyVar) {
        return this.f36722a.mo19694d(dyVar);
    }

    /* renamed from: H */
    public final boolean mo19704H(String str, String str2) {
        C11286d dVar = this.f36722a;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C58833ax b = dVar.mo19693b();
        if (!b.mo56113h()) {
            return false;
        }
        ((EditableTextField) b.mo56107c()).mo19850c(str);
        return true;
    }

    /* renamed from: I */
    public final /* synthetic */ boolean mo19705I() {
        return false;
    }

    /* renamed from: J */
    public final boolean mo19706J(String str, String str2, String str3) {
        C58833ax b = this.f36722a.mo19693b();
        if (!b.mo56113h()) {
            return false;
        }
        EditableTextField editableTextField = (EditableTextField) b.mo56107c();
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.append(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder.append(str2);
            }
            editableTextField.mo19850c(spannableStringBuilder.toString());
        }
        return true;
    }

    /* renamed from: K */
    public final int mo19707K() {
        return 2;
    }

    /* renamed from: b */
    public final View mo19708b(C0167am amVar, C11301i iVar, C11054a aVar) {
        this.f36724c = true;
        return this.f36722a.mo19692a(amVar, iVar, aVar, this.f36723b);
    }

    /* renamed from: i */
    public final /* synthetic */ C28521c mo19709i(String str) {
        return null;
    }

    /* renamed from: q */
    public final void mo19710q() {
        this.f36724c = false;
        for (ButtonField buttonField : this.f36722a.f36709d) {
            buttonField.f36920c.mo19777a();
        }
    }

    /* renamed from: r */
    public final /* synthetic */ void mo19711r() {
    }

    /* renamed from: B */
    public final void mo19698B(int i) {
        AudioRecorderField audioRecorderField;
        if (i == 2) {
            AudioRecorderField audioRecorderField2 = this.f36722a.f36710e;
            if (audioRecorderField2 != null && audioRecorderField2.f36907i == 1) {
                audioRecorderField2.mo19812d();
                audioRecorderField2.f36900b.setText("00:00");
                audioRecorderField2.f36903e = true;
                if (audioRecorderField2.f36904f == null) {
                    audioRecorderField2.f36904f = new TimeAnimator();
                }
                audioRecorderField2.f36904f.setTimeListener(new C11403j(audioRecorderField2));
                audioRecorderField2.f36904f.start();
                audioRecorderField2.mo19814f(2);
            }
        } else if (i == 9 && (audioRecorderField = this.f36722a.f36710e) != null && audioRecorderField.f36907i == 2 && audioRecorderField.f36903e) {
            audioRecorderField.f36903e = false;
            TimeAnimator timeAnimator = audioRecorderField.f36904f;
            if (timeAnimator != null) {
                timeAnimator.end();
            }
            audioRecorderField.mo19812d();
            audioRecorderField.mo19814f(1);
        }
    }
}
