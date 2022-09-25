package com.google.android.libraries.onegoogle.account.policyfooter;

import android.widget.TextView;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.onegoogle.account.policyfooter.h */
/* compiled from: PG */
class C30248h {

    /* renamed from: a */
    final /* synthetic */ PolicyFooterView f81778a;

    public C30248h(PolicyFooterView policyFooterView) {
        this.f81778a = policyFooterView;
    }

    /* renamed from: a */
    public void mo35758a() {
    }

    /* renamed from: b */
    public void mo35759b(int i) {
        this.f81778a.mo35730e(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo35760c(TextView textView, int i) {
        CharSequence text = textView.getText();
        textView.setText(BuildConfig.FLAVOR);
        this.f81778a.mo35730e(i);
        textView.setText(text);
    }
}
