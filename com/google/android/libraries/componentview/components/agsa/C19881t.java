package com.google.android.libraries.componentview.components.agsa;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.componentview.components.agsa.p1684a.C19849h;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20609ci;
import com.google.common.base.C58837ba;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.agsa.t */
/* compiled from: PG */
public class C19881t extends C20061bs {

    /* renamed from: a */
    public final C20609ci f55605a;

    /* renamed from: b */
    private LinearLayout f55606b;

    /* renamed from: c */
    private NativePaginatorView f55607c;

    /* renamed from: d */
    private LinearLayout f55608d;

    /* renamed from: e */
    private TextView f55609e;

    /* renamed from: f */
    private String f55610f;

    public C19881t(Context context, C56425d dVar, C20601ca caVar, C20609ci ciVar, C20566at atVar) {
        super(context, dVar, caVar);
        this.f55605a = ciVar;
    }

    /* renamed from: e */
    public final View mo25110e(Context context) {
        C20520h.m38497b(3, "NativeFooterComponent", (Throwable) null, "Creating native footer component.", new Object[0]);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.native_footer, (ViewGroup) null);
        this.f55606b = linearLayout;
        NativePaginatorView nativePaginatorView = (NativePaginatorView) linearLayout.findViewById(R.id.native_paginator);
        this.f55607c = nativePaginatorView;
        nativePaginatorView.f55465h = (TextView) nativePaginatorView.findViewById(R.id.paginator_page_number_text_view);
        nativePaginatorView.f55466i = nativePaginatorView.findViewById(R.id.paginator_previous_page_button);
        C19886y yVar = new C19886y(nativePaginatorView);
        nativePaginatorView.f55466i.setOnTouchListener(yVar);
        nativePaginatorView.f55466i.setOnClickListener(yVar);
        nativePaginatorView.f55467j = nativePaginatorView.findViewById(R.id.paginator_first_page_button);
        C19885x xVar = new C19885x(nativePaginatorView);
        nativePaginatorView.f55467j.setOnTouchListener(xVar);
        nativePaginatorView.f55467j.setOnClickListener(xVar);
        nativePaginatorView.f55468k = nativePaginatorView.findViewById(R.id.paginator_next_page_button);
        C19887z zVar = new C19887z(nativePaginatorView);
        nativePaginatorView.f55468k.setOnTouchListener(zVar);
        nativePaginatorView.f55468k.setOnClickListener(zVar);
        nativePaginatorView.f55471n = nativePaginatorView.f55464g.getResources().getString(R.string.paginator_next);
        nativePaginatorView.f55472o = nativePaginatorView.f55464g.getResources().getString(R.string.paginator_page_number);
        LinearLayout linearLayout2 = (LinearLayout) this.f55606b.findViewById(R.id.native_terms_link_container);
        this.f55608d = linearLayout2;
        this.f55609e = (TextView) linearLayout2.findViewById(R.id.terms_link_url);
        this.f55610f = context.getResources().getString(R.string.terms_link);
        return this.f55606b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        String str;
        C62940bt r0 = C62942bv.checkIsLite(C19849h.f55498o);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C19849h hVar = (C19849h) obj;
        if ((hVar.f55500a & 4096) != 0) {
            if (hVar.f55512m != (this.f56304o.getResources().getConfiguration().getLayoutDirection() == 1)) {
                ((ImageView) this.f55606b.findViewById(R.id.paginator_next_chevron)).setImageResource(R.drawable.quantum_ic_chevron_left_white_24);
                ((ImageView) this.f55606b.findViewById(R.id.paginator_prev_chevron)).setImageResource(R.drawable.quantum_ic_chevron_right_white_24);
                ((ImageView) this.f55606b.findViewById(R.id.paginator_first_page_chevron1)).setImageResource(R.drawable.quantum_ic_chevron_right_white_24);
                ((ImageView) this.f55606b.findViewById(R.id.paginator_first_page_chevron2)).setImageResource(R.drawable.quantum_ic_chevron_right_white_24);
            }
        }
        int i = hVar.f55500a;
        if ((i & 512) != 0) {
            this.f55610f = hVar.f55510k;
        }
        int i2 = 8;
        if ((i & 256) != 0) {
            String str2 = hVar.f55509j;
            String str3 = this.f55610f;
            TextView textView = this.f55609e;
            C19880s sVar = new C19880s(this, str2);
            SpannableString spannableString = new SpannableString(str3);
            spannableString.setSpan(sVar, 0, str3.length(), 33);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString, TextView.BufferType.SPANNABLE);
            this.f55608d.setVisibility(0);
        } else {
            this.f55608d.setVisibility(8);
        }
        int i3 = hVar.f55500a;
        if ((i3 & 2) == 0 && (i3 & 4) == 0) {
            this.f55607c.setVisibility(8);
            return;
        }
        if ((i3 & 8) != 0) {
            this.f55607c.f55471n = hVar.f55504e;
        }
        if ((i3 & 16) != 0) {
            this.f55607c.f55472o = hVar.f55505f;
        }
        if ((i3 & 32) != 0) {
            this.f55606b.findViewById(R.id.paginator_previous_page_button).setContentDescription(hVar.f55506g);
        }
        if ((hVar.f55500a & 64) != 0) {
            this.f55606b.findViewById(R.id.paginator_next_page_button).setContentDescription(hVar.f55507h);
        }
        if ((hVar.f55500a & 128) != 0) {
            this.f55606b.findViewById(R.id.paginator_first_page_button).setContentDescription(hVar.f55508i);
        }
        String e = C58837ba.m90856e(hVar.f55502c);
        C19879r rVar = new C19879r(this, hVar.f55503d, C58837ba.m90856e(hVar.f55511l));
        NativePaginatorView nativePaginatorView = this.f55607c;
        nativePaginatorView.f55473p = rVar;
        int i4 = hVar.f55501b;
        boolean z = e != null;
        nativePaginatorView.f55469l = i4;
        nativePaginatorView.f55470m = z;
        if (!(nativePaginatorView.f55466i == null || nativePaginatorView.f55467j == null || nativePaginatorView.f55468k == null || nativePaginatorView.f55465h == null)) {
            boolean z2 = i4 != 0;
            boolean z3 = i4 == 0;
            nativePaginatorView.setClickable(z3);
            nativePaginatorView.setFocusable(z3);
            nativePaginatorView.setFocusableInTouchMode(z3);
            nativePaginatorView.f55465h.setClickable(z2);
            nativePaginatorView.f55465h.setFocusable(z2);
            nativePaginatorView.f55465h.setFocusableInTouchMode(z2);
            nativePaginatorView.f55468k.setClickable(z2);
            nativePaginatorView.f55468k.setFocusable(z2);
            nativePaginatorView.f55468k.setFocusableInTouchMode(z2);
            View view = nativePaginatorView.f55467j;
            if (i4 > 1) {
                i2 = 0;
            }
            view.setVisibility(i2);
            float f = 2.0f;
            ((LinearLayout.LayoutParams) nativePaginatorView.f55466i.getLayoutParams()).weight = i4 > 1 ? 1.0f : 2.0f;
            int i5 = 4;
            nativePaginatorView.f55466i.setVisibility(i4 == 0 ? 4 : 0);
            View view2 = nativePaginatorView.f55468k;
            if (e != null) {
                i5 = 0;
            }
            view2.setVisibility(i5);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) nativePaginatorView.f55465h.getLayoutParams();
            layoutParams.width = i4 == 0 ? -2 : 0;
            if (i4 == 0) {
                f = 0.0f;
            }
            layoutParams.weight = f;
            TextView textView2 = nativePaginatorView.f55465h;
            if (i4 == 0) {
                str = nativePaginatorView.f55471n;
            } else {
                str = String.format(nativePaginatorView.f55472o, new Object[]{Integer.valueOf(i4 + 1)});
            }
            textView2.setText(str);
        }
        if (hVar.f55501b > 0 || e != null) {
            this.f55607c.setVisibility(0);
        }
    }
}
