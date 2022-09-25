package com.google.android.apps.search.assistant.verticals.ambient.feedback.full;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.p10018a.C131829n;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3886c.C50741bf;
import com.google.assistant.p3886c.C50743bh;
import com.google.assistant.p3886c.C50744bi;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.full.s */
/* compiled from: PG */
public final class C130639s {

    /* renamed from: a */
    public static final C59071e f357773a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.ambient.feedback.full.s");

    /* renamed from: b */
    public final Context f357774b;

    /* renamed from: c */
    public final Activity f357775c;

    /* renamed from: d */
    public final C130629i f357776d;

    /* renamed from: e */
    public final C130620aa f357777e;

    /* renamed from: f */
    public final boolean f357778f;

    /* renamed from: g */
    public final C50744bi f357779g;

    /* renamed from: h */
    public final C131829n f357780h;

    public C130639s(Context context, Activity activity, C130629i iVar, C130620aa aaVar, boolean z, C50744bi biVar, C131829n nVar) {
        this.f357774b = context;
        this.f357775c = activity;
        this.f357776d = iVar;
        this.f357777e = aaVar;
        this.f357778f = z;
        this.f357779g = biVar;
        this.f357780h = nVar;
    }

    /* renamed from: a */
    public static void m213039a(RadioGroup radioGroup, RadioButton radioButton, EditText editText) {
        radioGroup.setOnCheckedChangeListener(new C130630j(editText, radioButton));
    }

    /* renamed from: b */
    public static boolean m213040b(TextView textView, Optional optional) {
        if (optional.isEmpty()) {
            return false;
        }
        C50741bf bfVar = ((C50743bh) optional.get()).f132053a;
        if (bfVar == null) {
            bfVar = C50741bf.f132046c;
        }
        textView.setText(bfVar.f132049b);
        return true;
    }

    /* renamed from: c */
    public static boolean m213041c(RadioGroup radioGroup, TextView textView, Optional optional, LayoutInflater layoutInflater) {
        if (optional.isEmpty()) {
            return false;
        }
        C50741bf bfVar = ((C50743bh) optional.get()).f132053a;
        if (bfVar == null) {
            bfVar = C50741bf.f132046c;
        }
        radioGroup.setTag(bfVar.f132048a);
        C50741bf bfVar2 = ((C50743bh) optional.get()).f132053a;
        if (bfVar2 == null) {
            bfVar2 = C50741bf.f132046c;
        }
        textView.setText(bfVar2.f132049b);
        for (int i = 0; i < ((C50743bh) optional.get()).f132054b.size(); i++) {
            RadioButton radioButton = (RadioButton) layoutInflater.inflate(R.layout.assistant_ambient_feedback_radiobutton, radioGroup, false);
            radioButton.setTag(((C50741bf) ((C50743bh) optional.get()).f132054b.get(i)).f132048a);
            radioButton.setText(((C50741bf) ((C50743bh) optional.get()).f132054b.get(i)).f132049b);
            radioGroup.addView(radioButton, i);
        }
        return true;
    }
}
