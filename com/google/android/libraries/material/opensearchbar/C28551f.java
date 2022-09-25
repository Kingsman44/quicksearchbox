package com.google.android.libraries.material.opensearchbar;

import android.support.p033v7.widget.ActionMenuView;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.C44735bg;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.material.opensearchbar.f */
/* compiled from: PG */
public final /* synthetic */ class C28551f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OpenSearchView f77630a;

    public /* synthetic */ C28551f(OpenSearchView openSearchView) {
        this.f77630a = openSearchView;
    }

    public final void onClick(View view) {
        OpenSearchView openSearchView = this.f77630a;
        int i = openSearchView.f77616r;
        if (i == 0) {
            throw null;
        } else if (i != 4 && i != 3) {
            C28571z zVar = openSearchView.f77612n;
            if (zVar.f77657e != null) {
                OpenSearchView openSearchView2 = zVar.f77653a;
                if (openSearchView2.mo34109k()) {
                    openSearchView2.mo34104f();
                }
                zVar.f77653a.mo34110l(3);
                Menu g = zVar.f77655c.mo2393g();
                if (g != null) {
                    g.clear();
                }
                int i2 = zVar.f77657e.f77587E;
                if (i2 == -1 || !zVar.f77653a.f77615q) {
                    zVar.f77655c.setVisibility(8);
                } else {
                    zVar.f77655c.mo2404n(i2);
                    ActionMenuView a = C44735bg.m79302a(zVar.f77655c);
                    if (a != null) {
                        for (int i3 = 0; i3 < a.getChildCount(); i3++) {
                            View childAt = a.getChildAt(i3);
                            childAt.setClickable(false);
                            childAt.setFocusable(false);
                            childAt.setFocusableInTouchMode(false);
                        }
                    }
                    zVar.f77655c.setVisibility(0);
                }
                zVar.f77656d.setText(zVar.f77657e.f77584B.getText());
                EditText editText = zVar.f77656d;
                editText.setSelection(editText.getText().length());
                zVar.f77654b.setVisibility(4);
                zVar.f77654b.post(new C28560o(zVar));
            } else {
                OpenSearchView openSearchView3 = zVar.f77653a;
                if (openSearchView3.mo34109k()) {
                    Objects.requireNonNull(openSearchView3);
                    openSearchView3.postDelayed(new C28564s(openSearchView3), 150);
                }
                zVar.f77654b.setVisibility(4);
                zVar.f77654b.post(new C28565t(zVar));
            }
            openSearchView.mo34105g(true);
        }
    }
}
