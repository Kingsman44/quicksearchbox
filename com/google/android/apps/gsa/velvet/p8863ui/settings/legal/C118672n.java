package com.google.android.apps.gsa.velvet.p8863ui.settings.legal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.legal.n */
/* compiled from: PG */
public final class C118672n extends C118661c {

    /* renamed from: a */
    public final Object f331052a = new Object();

    /* renamed from: b */
    public boolean f331053b;

    /* renamed from: c */
    public String f331054c;

    /* renamed from: d */
    private TextView f331055d;

    /* renamed from: e */
    private View f331056e;

    /* renamed from: f */
    private View f331057f;

    /* renamed from: d */
    public final void mo103851d(String str) {
        TextView textView = this.f331055d;
        textView.getClass();
        textView.setText(str);
        View view = this.f331057f;
        view.getClass();
        view.setVisibility(0);
        View view2 = this.f331056e;
        view2.getClass();
        view2.setVisibility(8);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.gsa_license_text, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.gsa_license_text_textview);
        this.f331055d = textView;
        textView.getClass();
        View findViewById = inflate.findViewById(R.id.gsa_license_text_progress_container);
        this.f331056e = findViewById;
        findViewById.getClass();
        findViewById.setVisibility(0);
        View findViewById2 = inflate.findViewById(R.id.gsa_license_text_scrollview);
        this.f331057f = findViewById2;
        findViewById2.getClass();
        findViewById2.setVisibility(8);
        synchronized (this.f331052a) {
            this.f331053b = true;
            String str = this.f331054c;
            if (str != null) {
                mo103851d(str);
                this.f331054c = null;
            }
        }
        return inflate;
    }

    public final void onDestroyView() {
        synchronized (this.f331052a) {
            this.f331053b = false;
        }
        this.f331055d = null;
        this.f331056e = null;
        this.f331057f = null;
        super.onDestroyView();
    }
}
