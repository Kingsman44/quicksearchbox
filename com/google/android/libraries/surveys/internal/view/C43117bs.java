package com.google.android.libraries.surveys.internal.view;

import android.view.View;
import android.widget.EditText;
import androidx.core.content.C1878d;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.p4281bu.p4282a.C56585k;
import java.util.List;

/* renamed from: com.google.android.libraries.surveys.internal.view.bs */
/* compiled from: PG */
public final /* synthetic */ class C43117bs implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C43122bx f112767a;

    /* renamed from: b */
    public final /* synthetic */ EditText f112768b;

    /* renamed from: c */
    public final /* synthetic */ List f112769c;

    /* renamed from: d */
    public final /* synthetic */ int f112770d;

    public /* synthetic */ C43117bs(C43122bx bxVar, EditText editText, List list, int i) {
        this.f112767a = bxVar;
        this.f112768b = editText;
        this.f112769c = list;
        this.f112770d = i;
    }

    public final void onFocusChange(View view, boolean z) {
        C43122bx bxVar = this.f112767a;
        EditText editText = this.f112768b;
        List list = this.f112769c;
        int i = this.f112770d;
        if (z) {
            editText.setHintTextColor(C1878d.m5128a(bxVar.getContext(), R.color.survey_hint_text_color));
            bxVar.f112783a.mo46130a(new C43121bw(4, BuildConfig.FLAVOR, ((C56585k) list.get(i)).f151079b));
            return;
        }
        editText.setHintTextColor(C1878d.m5128a(bxVar.getContext(), R.color.survey_hint_text_unfocused_color));
    }
}
