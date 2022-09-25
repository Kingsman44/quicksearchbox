package com.google.apps.tiktok.tracing;

import android.widget.SeekBar;

/* renamed from: com.google.apps.tiktok.tracing.cw */
/* compiled from: PG */
public final class C47758cw implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    boolean f123738a;

    /* renamed from: b */
    C47538ax f123739b;

    /* renamed from: c */
    final /* synthetic */ SeekBar.OnSeekBarChangeListener f123740c;

    /* renamed from: d */
    final /* synthetic */ String f123741d;

    /* renamed from: e */
    final /* synthetic */ C47770dh f123742e;

    public C47758cw(C47770dh dhVar, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, String str) {
        this.f123742e = dhVar;
        this.f123740c = onSeekBarChangeListener;
        this.f123741d = str;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (C47831fm.m85027v() || !z) {
            this.f123740c.onProgressChanged(seekBar, i, z);
            return;
        } else if (this.f123738a) {
            C47538ax y = C47831fm.m85030y(this.f123739b);
            try {
                this.f123740c.onProgressChanged(seekBar, i, true);
                return;
            } finally {
                C47831fm.m85030y(y);
            }
        } else {
            C47538ax c = this.f123742e.mo51613c(this.f123741d.concat("#onProgressChanged"));
            try {
                this.f123740c.onProgressChanged(seekBar, i, true);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        }
        throw th;
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f123738a = true;
        C47572bw d = C47831fm.m85009d();
        this.f123739b = this.f123742e.mo51613c(this.f123741d.concat("#onStartTrackingTouch"));
        try {
            this.f123740c.onStartTrackingTouch(seekBar);
        } finally {
            C47831fm.m85030y(d);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f123738a = false;
        C47538ax y = C47831fm.m85030y(this.f123739b);
        try {
            this.f123740c.onStopTrackingTouch(seekBar);
        } finally {
            C47831fm.m85030y(y);
            this.f123739b = null;
        }
    }
}
