package com.google.ads.interactivemedia.p367v3.internal;

import android.app.Activity;
import android.app.Application;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.google.ads.interactivemedia.p367v3.impl.data.C6707a;
import com.google.ads.interactivemedia.p367v3.impl.data.C6725ar;
import com.google.ads.interactivemedia.p367v3.impl.data.C6726as;
import com.google.ads.interactivemedia.p367v3.impl.data.C6734b;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ali */
/* compiled from: PG */
public final class ali implements amz {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ane f20876a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f20877b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final View f20878c;

    /* renamed from: d */
    private final alg f20879d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public alf f20880e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Activity f20881f = null;

    /* renamed from: g */
    private boolean f20882g = false;

    public ali(String str, ane ane, View view) {
        alh alh = new alh((byte[]) null);
        this.f20877b = str;
        this.f20876a = ane;
        this.f20878c = view;
        this.f20879d = alh;
    }

    /* renamed from: n */
    private static int m18934n(int i, float f) {
        return (int) Math.ceil((double) (((float) i) / f));
    }

    /* renamed from: o */
    private static C6726as m18935o(C6726as asVar, float f) {
        C6725ar builder = C6726as.builder();
        builder.left(m18934n(asVar.left(), f));
        builder.top(m18934n(asVar.top(), f));
        builder.height(m18934n(asVar.height(), f));
        builder.width(m18934n(asVar.width(), f));
        return builder.build();
    }

    /* renamed from: p */
    private final DisplayMetrics m18936p() {
        return this.f20878c.getContext().getResources().getDisplayMetrics();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14910a(boolean z) {
        this.f20882g = z;
    }

    /* renamed from: b */
    public final void mo14911b() {
        this.f20876a.mo15002h(this, this.f20877b);
    }

    /* renamed from: c */
    public final void mo14912c() {
        this.f20876a.mo15003i(this.f20877b);
    }

    /* renamed from: d */
    public final void mo14913d() {
        Application h;
        if (this.f20882g && (h = C7458yy.m22585h(this.f20878c.getContext())) != null) {
            alf alf = new alf(this);
            this.f20880e = alf;
            h.registerActivityLifecycleCallbacks(alf);
        }
    }

    /* renamed from: e */
    public final void mo14914e() {
        alf alf;
        Application h = C7458yy.m22585h(this.f20878c.getContext());
        if (h != null && (alf = this.f20880e) != null) {
            h.unregisterActivityLifecycleCallbacks(alf);
        }
    }

    /* renamed from: f */
    public final C6734b mo14915f(String str, String str2, String str3) {
        double d;
        C6726as o = m18935o(C6726as.builder().locationOnScreenOfView(this.f20878c).build(), m18936p().density);
        Rect rect = new Rect();
        boolean globalVisibleRect = this.f20878c.getGlobalVisibleRect(rect);
        IBinder windowToken = this.f20878c.getWindowToken();
        boolean z = false;
        if (!globalVisibleRect || windowToken == null || !this.f20878c.isShown()) {
            rect.set(0, 0, 0, 0);
        }
        C6725ar builder = C6726as.builder();
        builder.left(rect.left);
        builder.top(rect.top);
        builder.height(rect.height());
        builder.width(rect.width());
        C6726as o2 = m18935o(builder.build(), m18936p().density);
        boolean aw = C2043bi.m5569aw(this.f20878c);
        if (!this.f20878c.getGlobalVisibleRect(new Rect()) || !this.f20878c.isShown()) {
            z = true;
        }
        AudioManager audioManager = (AudioManager) this.f20878c.getContext().getSystemService("audio");
        if (audioManager != null) {
            double streamVolume = (double) audioManager.getStreamVolume(3);
            double streamMaxVolume = (double) audioManager.getStreamMaxVolume(3);
            Double.isNaN(streamVolume);
            Double.isNaN(streamMaxVolume);
            d = streamVolume / streamMaxVolume;
        } else {
            d = C59203do.f157270a;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C6707a builder2 = C6734b.builder();
        builder2.queryId(str);
        builder2.eventId(str2);
        builder2.appState(str3);
        builder2.nativeTime(currentTimeMillis);
        builder2.nativeVolume(d);
        builder2.nativeViewAttached(aw);
        builder2.nativeViewHidden(z);
        builder2.nativeViewBounds(o);
        builder2.nativeViewVisibleBounds(o2);
        return builder2.build();
    }

    /* renamed from: g */
    public final void mo14916g(String str, String str2) {
        this.f20876a.mo15008n(new amx(amv.activityMonitor, amw.viewability, this.f20877b, mo14915f(str, str2, BuildConfig.FLAVOR)));
    }
}
