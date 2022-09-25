package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;
import java.util.List;
import p5462h.C69685i;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69659i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.translation.InterpreterOtherTranslationView */
/* compiled from: PG */
public final class InterpreterOtherTranslationView extends LinearLayout {

    /* renamed from: a */
    public static final C59071e f356568a = C59071e.m91331h();

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InterpreterOtherTranslationView(Context context) {
        this(context, (AttributeSet) null, 0, 0, 14, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InterpreterOtherTranslationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InterpreterOtherTranslationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterpreterOtherTranslationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C69664n.m101061g(context, "context");
        LayoutInflater.from(context).inflate(R.layout.assistant_interpreter_other_translation, this, true);
    }

    /* renamed from: a */
    public final List mo109429a() {
        View findViewById = findViewById(R.id.assistant_interpreter_other_translation_0);
        C69664n.m101060f(findViewById, "findViewById(R.id.assist…eter_other_translation_0)");
        View findViewById2 = findViewById(R.id.assistant_interpreter_other_translation_1);
        C69664n.m101060f(findViewById2, "findViewById(R.id.assist…eter_other_translation_1)");
        View findViewById3 = findViewById(R.id.assistant_interpreter_other_translation_2);
        C69664n.m101060f(findViewById3, "findViewById(R.id.assist…eter_other_translation_2)");
        return C69540x.m100947e(findViewById, findViewById2, findViewById3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InterpreterOtherTranslationView(Context context, AttributeSet attributeSet, int i, int i2, int i3, C69659i iVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* renamed from: b */
    public final C69685i mo109430b(int i) {
        if (i == 0) {
            return new C69685i(findViewById(R.id.assistant_interpreter_other_translation_0_word), findViewById(R.id.assistant_interpreter_other_translation_0_back_translations));
        }
        if (i != 1) {
            return new C69685i(findViewById(R.id.assistant_interpreter_other_translation_2_word), findViewById(R.id.assistant_interpreter_other_translation_2_back_translations));
        }
        return new C69685i(findViewById(R.id.assistant_interpreter_other_translation_1_word), findViewById(R.id.assistant_interpreter_other_translation_1_back_translations));
    }
}
