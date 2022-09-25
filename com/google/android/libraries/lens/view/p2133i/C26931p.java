package com.google.android.libraries.lens.view.p2133i;

import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26897b;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* renamed from: com.google.android.libraries.lens.view.i.p */
/* compiled from: PG */
final class C26931p {

    /* renamed from: a */
    final View f73372a;

    /* renamed from: b */
    final View f73373b;

    /* renamed from: c */
    final View f73374c;

    /* renamed from: d */
    final LinearProgressIndicator f73375d;

    /* renamed from: e */
    final RecyclerView f73376e;

    /* renamed from: f */
    final TextView f73377f;

    /* renamed from: g */
    final Button f73378g;

    /* renamed from: h */
    final View f73379h;

    /* renamed from: i */
    final View f73380i;

    /* renamed from: j */
    final TextView f73381j;

    /* renamed from: k */
    final View f73382k;

    /* renamed from: l */
    int f73383l;

    public C26931p(View view) {
        this.f73372a = view;
        View findViewById = view.findViewById(R.id.device_picker_bottom_sheet);
        findViewById.getClass();
        this.f73373b = findViewById;
        View findViewById2 = view.findViewById(R.id.device_picker_list_container);
        findViewById2.getClass();
        this.f73374c = findViewById2;
        View findViewById3 = view.findViewById(R.id.refresh_indicator);
        findViewById3.getClass();
        this.f73375d = (LinearProgressIndicator) findViewById3;
        View findViewById4 = view.findViewById(R.id.device_picker_list);
        findViewById4.getClass();
        this.f73376e = (RecyclerView) findViewById4;
        View findViewById5 = view.findViewById(R.id.helper_item_explainer);
        findViewById5.getClass();
        this.f73377f = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.refresh_button);
        findViewById6.getClass();
        this.f73378g = (Button) findViewById6;
        View findViewById7 = view.findViewById(R.id.device_picker_zero_state_container);
        findViewById7.getClass();
        this.f73379h = findViewById7;
        View findViewById8 = view.findViewById(R.id.zero_state_retry_button);
        findViewById8.getClass();
        this.f73380i = findViewById8;
        View findViewById9 = view.findViewById(R.id.zero_state_signin_guidance);
        findViewById9.getClass();
        this.f73381j = (TextView) findViewById9;
        View findViewById10 = view.findViewById(R.id.device_picker_loading_container);
        findViewById10.getClass();
        this.f73382k = findViewById10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo32313a(int i) {
        int i2 = i - 1;
        C26897b bVar = C26897b.READY_TO_SEND;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return this.f73379h;
        } else {
            if (i2 == 1) {
                return this.f73382k;
            }
            if (i2 == 2) {
                return this.f73374c;
            }
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo32314b(int i, C28310af afVar, C28306ab abVar) {
        mo32313a(i).setVisibility(0);
        abVar.mo33801b(this.f73379h, afVar.mo33805a(C28427h.m53115a(96676)));
        abVar.mo33801b(this.f73380i, afVar.mo33805a(C28427h.m53115a(96677)));
        abVar.mo33801b(this.f73378g, afVar.mo33805a(C28427h.m53115a(101001)));
        this.f73383l = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo32315c(int i) {
        int i2 = this.f73383l;
        if (i2 != i) {
            mo32313a(i2).setVisibility(8);
            mo32313a(i).setVisibility(0);
            if (i == 2) {
                this.f73373b.setMinimumHeight(0);
            } else {
                this.f73373b.setMinimumHeight((int) (((float) this.f73372a.getHeight()) * 0.2f));
            }
            this.f73383l = i;
        }
    }
}
