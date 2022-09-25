package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.imageviewer.p1874a.C22823b;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.ConfirmationTray */
/* compiled from: PG */
public class ConfirmationTray extends RelativeLayout {

    /* renamed from: a */
    public View f322852a;

    /* renamed from: b */
    public TextView f322853b;

    /* renamed from: c */
    public TextView f322854c;

    /* renamed from: d */
    public C22823b f322855d;

    /* renamed from: e */
    public Runnable f322856e;

    /* renamed from: f */
    public Runnable f322857f;

    public ConfirmationTray(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo102698a() {
        if (getVisibility() == 0) {
            animate().translationY((float) getHeight()).setDuration(350).withEndAction(new C116451d(this)).start();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f322852a.setOnClickListener(new C89943l(new C116449b(this)));
        this.f322854c.setOnClickListener(new C89943l(new C116450c(this)));
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f322852a = findViewById(R.id.save_tray_change_list);
        this.f322853b = (TextView) findViewById(R.id.save_tray_message);
        TextView textView = (TextView) findViewById(R.id.tray_selected_list);
        this.f322854c = textView;
        C2043bi.m5526T(textView, new C116452e(this));
        TextView textView2 = this.f322854c;
        C28292j jVar = new C28292j(41015);
        jVar.mo33795i(5);
        C28295m.m52919e(textView2, jVar);
        View view = this.f322852a;
        C28292j jVar2 = new C28292j(35897);
        jVar2.mo33795i(5);
        C28295m.m52919e(view, jVar2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f322855d.onTouch(this, motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) || motionEvent.getActionMasked() == 0;
    }
}
