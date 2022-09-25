package com.google.android.material.internal;

import android.content.Context;
import android.text.TextPaint;
import com.google.android.material.p3512i.C44698h;
import com.google.android.material.p3512i.C44699i;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.internal.ba */
/* compiled from: PG */
public final class C44729ba {

    /* renamed from: a */
    public final TextPaint f116589a = new TextPaint(1);

    /* renamed from: b */
    public final C44699i f116590b = new C44726ay(this);

    /* renamed from: c */
    public boolean f116591c = true;

    /* renamed from: d */
    public WeakReference f116592d = new WeakReference((Object) null);

    /* renamed from: e */
    public C44698h f116593e;

    /* renamed from: f */
    private float f116594f;

    public C44729ba(C44727az azVar) {
        this.f116592d = new WeakReference(azVar);
    }

    /* renamed from: a */
    public final float mo48041a(String str) {
        if (!this.f116591c) {
            return this.f116594f;
        }
        float measureText = str == null ? 0.0f : this.f116589a.measureText(str, 0, str.length());
        this.f116594f = measureText;
        this.f116591c = false;
        return measureText;
    }

    /* renamed from: b */
    public final void mo48042b(C44698h hVar, Context context) {
        if (this.f116593e != hVar) {
            this.f116593e = hVar;
            if (hVar != null) {
                hVar.mo47996e(context, this.f116589a, this.f116590b);
                C44727az azVar = (C44727az) this.f116592d.get();
                if (azVar != null) {
                    this.f116589a.drawableState = azVar.getState();
                }
                hVar.mo47995d(context, this.f116589a, this.f116590b);
                this.f116591c = true;
            }
            C44727az azVar2 = (C44727az) this.f116592d.get();
            if (azVar2 != null) {
                azVar2.mo47478c();
                azVar2.onStateChange(azVar2.getState());
            }
        }
    }
}
