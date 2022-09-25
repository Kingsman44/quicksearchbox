package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class InterpreterSmartRepliesView extends LinearLayout {

    /* renamed from: a */
    public static final C59071e f314784a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterSmartRepliesView");

    public InterpreterSmartRepliesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.interpreter_smart_replies, this, true);
    }

    /* renamed from: a */
    public final List mo100444a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add((TextView) findViewById(R.id.interpreter_smart_reply_0));
        arrayList.add((TextView) findViewById(R.id.interpreter_smart_reply_1));
        arrayList.add((TextView) findViewById(R.id.interpreter_smart_reply_2));
        return arrayList;
    }

    /* renamed from: b */
    public final void mo100445b() {
        for (TextView textView : mo100444a()) {
            textView.setText(BuildConfig.FLAVOR);
            textView.setVisibility(8);
        }
        findViewById(R.id.interpreter_speaking_practice_suggestion).setVisibility(8);
    }
}
