package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class InterpreterAlternativeTranslationsView extends LinearLayout {

    /* renamed from: a */
    public static final C59071e f314709a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterAlternativeTranslationsView");

    /* renamed from: b */
    public String f314710b;

    public InterpreterAlternativeTranslationsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.interpreter_alternative_translations, this, true);
    }

    /* renamed from: a */
    public final TextView mo100368a() {
        return (TextView) findViewById(R.id.alternative_translation_header);
    }

    /* renamed from: b */
    public final List mo100369b() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(findViewById(R.id.alternative_translation_0));
        arrayList.add(findViewById(R.id.alternative_translation_1));
        arrayList.add(findViewById(R.id.alternative_translation_2));
        return arrayList;
    }

    /* renamed from: c */
    public final List mo100370c(int i) {
        ArrayList arrayList = new ArrayList(1);
        if (i == 0) {
            arrayList.add((TextView) findViewById(R.id.alternative_translation_0_word));
            arrayList.add((TextView) findViewById(R.id.alternative_translation_0_back_translations));
        } else if (i == 1) {
            arrayList.add((TextView) findViewById(R.id.alternative_translation_1_word));
            arrayList.add((TextView) findViewById(R.id.alternative_translation_1_back_translations));
        } else if (i == 2) {
            arrayList.add((TextView) findViewById(R.id.alternative_translation_2_word));
            arrayList.add((TextView) findViewById(R.id.alternative_translation_2_back_translations));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void mo100371d() {
        List b = mo100369b();
        for (int i = 0; i < b.size(); i++) {
            ((View) b.get(i)).setVisibility(8);
            for (TextView textView : mo100370c(i)) {
                textView.setText(BuildConfig.FLAVOR);
                textView.setVisibility(8);
            }
        }
    }
}
