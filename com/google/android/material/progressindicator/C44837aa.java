package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import androidx.p119j.p120a.p121a.C2300b;
import androidx.p198v.p199a.p200a.C4244c;
import com.google.android.material.p3505b.C44535e;
import java.util.Arrays;

/* renamed from: com.google.android.material.progressindicator.aa */
/* compiled from: PG */
final class C44837aa extends C44864v {

    /* renamed from: f */
    public static final /* synthetic */ int f116971f = 0;

    /* renamed from: g */
    private static final Property f116972g = new C44868z(Float.class);

    /* renamed from: a */
    public final C2300b f116973a;

    /* renamed from: b */
    public final C44849g f116974b;

    /* renamed from: c */
    public int f116975c = 1;

    /* renamed from: d */
    public boolean f116976d;

    /* renamed from: e */
    public float f116977e;

    /* renamed from: h */
    private ObjectAnimator f116978h;

    public C44837aa(C44842af afVar) {
        super(3);
        this.f116974b = afVar;
        this.f116973a = new C2300b();
    }

    /* renamed from: a */
    public final void mo48257a() {
        ObjectAnimator objectAnimator = this.f116978h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: b */
    public final void mo48258b(C4244c cVar) {
    }

    /* renamed from: c */
    public final void mo48259c() {
    }

    /* renamed from: d */
    public final void mo48260d() {
        if (this.f116978h == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f116972g, new float[]{0.0f, 1.0f});
            this.f116978h = ofFloat;
            ofFloat.setDuration(333);
            this.f116978h.setInterpolator((TimeInterpolator) null);
            this.f116978h.setRepeatCount(-1);
            this.f116978h.addListener(new C44867y(this));
        }
        this.f116976d = true;
        this.f116975c = 1;
        Arrays.fill(this.f117066l, C44535e.m78718a(this.f116974b.f117017c[0], this.f117064j.f117060i));
        this.f116978h.start();
    }

    /* renamed from: e */
    public final void mo48261e() {
    }
}
