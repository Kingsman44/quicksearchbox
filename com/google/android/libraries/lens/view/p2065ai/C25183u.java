package com.google.android.libraries.lens.view.p2065ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p033v7.app.C0392m;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.tracing.C47767de;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.libraries.lens.view.ai.u */
/* compiled from: PG */
public final class C25183u {

    /* renamed from: a */
    public final C25175m f68585a;

    /* renamed from: b */
    public final C28310af f68586b;

    /* renamed from: c */
    public final C28443m f68587c;

    /* renamed from: d */
    public final Context f68588d;

    /* renamed from: e */
    public final C47770dh f68589e;

    /* renamed from: f */
    public final C28306ab f68590f;

    /* renamed from: g */
    public final boolean f68591g;

    /* renamed from: h */
    public ImageView f68592h;

    /* renamed from: i */
    public ViewGroup f68593i;

    /* renamed from: j */
    public ValueAnimator f68594j;

    /* renamed from: k */
    public C0392m f68595k;

    /* renamed from: l */
    private PopupWindow f68596l;

    /* renamed from: m */
    private View.OnAttachStateChangeListener f68597m;

    public C25183u(C25175m mVar, C28310af afVar, C28443m mVar2, Context context, C47770dh dhVar, C28306ab abVar, boolean z) {
        this.f68585a = mVar;
        this.f68586b = afVar;
        this.f68587c = mVar2;
        this.f68588d = context;
        this.f68589e = dhVar;
        this.f68590f = abVar;
        this.f68591g = z;
    }

    /* renamed from: a */
    public final void mo30326a() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://support.google.com/assistant/?p=google_lens_donate"));
        this.f68588d.startActivity(intent);
    }

    /* renamed from: b */
    public final void mo30327b(boolean z) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        if (z) {
            ViewGroup viewGroup = this.f68593i;
            if (viewGroup != null) {
                if (viewGroup.isAttachedToWindow()) {
                    mo30328c();
                    return;
                }
                C25181s sVar = new C25181s(this);
                this.f68597m = sVar;
                this.f68593i.addOnAttachStateChangeListener(sVar);
                return;
            }
            return;
        }
        PopupWindow popupWindow = this.f68596l;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        ViewGroup viewGroup2 = this.f68593i;
        if (!(viewGroup2 == null || (onAttachStateChangeListener = this.f68597m) == null)) {
            viewGroup2.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        ValueAnimator valueAnimator = this.f68594j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: c */
    public final void mo30328c() {
        PopupWindow popupWindow = this.f68596l;
        if (popupWindow == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(String.valueOf(this.f68585a.getContext().getString(R.string.lens_donate_data_notification_text)).concat("  "));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(this.f68585a.getContext().getString(R.string.lens_donate_data_notification_learn_more));
            spannableStringBuilder.setSpan(new C47767de(this.f68589e, "Clicked Learn More span", new C25180r(this)), length, spannableStringBuilder.length(), 33);
            View inflate = LayoutInflater.from(this.f68588d).inflate(R.layout.donate_data_notification, this.f68593i, false);
            TextView textView = (TextView) inflate.findViewById(R.id.text);
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            popupWindow = new PopupWindow(inflate, -2, -2, false);
            this.f68596l = popupWindow;
        }
        popupWindow.showAtLocation(this.f68593i, 49, 0, 20);
        ValueAnimator valueAnimator = this.f68594j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 1});
        this.f68594j = ofInt;
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f68585a.getContext().getSystemService("accessibility");
        int i = 3000;
        if (accessibilityManager != null) {
            i = accessibilityManager.getRecommendedTimeoutMillis(3000, 6);
        }
        ofInt.setStartDelay((long) i);
        this.f68594j.addListener(new C25182t(this));
        this.f68594j.start();
    }
}
