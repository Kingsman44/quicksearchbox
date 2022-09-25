package com.google.apps.tiktok.tracing;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.apps.tiktok.tracing.cj */
/* compiled from: PG */
public final /* synthetic */ class C47586cj implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123493a;

    /* renamed from: b */
    public final /* synthetic */ View.OnTouchListener f123494b;

    /* renamed from: c */
    public final /* synthetic */ String f123495c;

    public /* synthetic */ C47586cj(C47770dh dhVar, View.OnTouchListener onTouchListener, String str) {
        this.f123493a = dhVar;
        this.f123494b = onTouchListener;
        this.f123495c = str;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C47770dh dhVar = this.f123493a;
        View.OnTouchListener onTouchListener = this.f123494b;
        String str = this.f123495c;
        if (motionEvent.getActionMasked() == 3 && C47831fm.m85027v()) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        C47538ax c = dhVar.mo51613c(str);
        try {
            boolean onTouch = onTouchListener.onTouch(view, motionEvent);
            if (c == null) {
                return onTouch;
            }
            c.close();
            return onTouch;
        } catch (Throwable th) {
            C47574by.m84679a(th, th);
        }
        throw th;
    }
}
