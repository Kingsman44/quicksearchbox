package com.google.apps.tiktok.tracing.contrib.androidx.p3699d;

import androidx.viewpager2.widget.C4313p;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.androidx.d.b */
/* compiled from: PG */
public final class C47620b extends C4313p {

    /* renamed from: a */
    final /* synthetic */ C4313p f123547a;

    /* renamed from: b */
    final /* synthetic */ String f123548b;

    /* renamed from: c */
    final /* synthetic */ C47627i f123549c;

    public C47620b(C47627i iVar, C4313p pVar, String str) {
        this.f123549c = iVar;
        this.f123547a = pVar;
        this.f123548b = str;
    }

    /* renamed from: a */
    public final void mo9201a(int i) {
        if (C47831fm.m85027v()) {
            this.f123547a.mo9201a(i);
            return;
        }
        C47538ax e = this.f123549c.f123557a.mo51615e(this.f123548b.concat(":onPageScrollStateChanged"), C47562bm.f123426a);
        try {
            this.f123547a.mo9201a(i);
            if (e != null) {
                e.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47619a.m84709a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo9202b(int i) {
        if (C47831fm.m85027v()) {
            this.f123547a.mo9202b(i);
            return;
        }
        C47538ax e = this.f123549c.f123557a.mo51615e(this.f123548b.concat(":onPageSelected"), C47562bm.f123426a);
        try {
            this.f123547a.mo9202b(i);
            if (e != null) {
                e.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47619a.m84709a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo9233d(int i, float f, int i2) {
        if (C47831fm.m85027v()) {
            this.f123547a.mo9233d(i, f, i2);
            return;
        }
        C47538ax e = this.f123549c.f123557a.mo51615e(this.f123548b.concat(":onPageScrolled"), C47562bm.f123426a);
        try {
            this.f123547a.mo9233d(i, f, i2);
            if (e != null) {
                e.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47619a.m84709a(th, th);
        }
        throw th;
    }
}
