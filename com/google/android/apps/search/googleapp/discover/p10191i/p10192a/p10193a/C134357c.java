package com.google.android.apps.search.googleapp.discover.p10191i.p10192a.p10193a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.p033v7.widget.AppCompatImageView;
import android.util.TypedValue;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.google.apps.tiktok.media.C47449e;
import com.google.protos.youtube.elements.C66226em;
import java.util.ArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.discover.i.a.a.c */
/* compiled from: PG */
public final class C134357c extends C6407q {
    @C6117a(mo12871a = 0)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: A */
    float f365973A;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: B */
    int f365974B;
    @C6117a(mo12871a = 0)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: a */
    float f365975a;
    @C6117a(mo12871a = 0)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: b */
    float f365976b;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: c */
    C47449e f365977c;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: d */
    C66226em f365978d;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: e */
    String f365979e;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: f */
    boolean f365980f;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: g */
    boolean f365981g;

    public C134357c() {
        super("KenBurnsImage");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final int mo12793K() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final Object mo12797P(Context context) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C134355a aVar = new C134355a(context);
        aVar.addView(appCompatImageView);
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo12802V(C6411u uVar, Object obj) {
        float f;
        C134355a aVar = (C134355a) obj;
        float f2 = this.f365975a;
        float f3 = this.f365973A;
        int i = this.f365974B;
        boolean z = this.f365981g;
        boolean z2 = this.f365980f;
        if (!z) {
            aVar.mo111759a(z2);
        } else if (((double) f3) > 1.0d) {
            ImageView imageView = (ImageView) aVar.getChildAt(0);
            ArrayList arrayList = new ArrayList();
            if (i == 2) {
                f = ((float) aVar.getWidth()) * 0.5f * (f3 - 4.0f);
                i = 2;
            } else {
                f = 0.0f;
            }
            if (i == 3) {
                f = -(((float) aVar.getWidth()) * 0.5f * (f3 - 4.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(imageView, "translationX", new float[]{f}));
            arrayList.add(ObjectAnimator.ofFloat(imageView, "scaleX", new float[]{f3}));
            arrayList.add(ObjectAnimator.ofFloat(imageView, "scaleY", new float[]{f3}));
            aVar.f365966d = new AnimatorSet();
            aVar.f365966d.playTogether(arrayList);
            float scaleX = f2 * 1000.0f * ((f3 - imageView.getScaleX()) / (f3 - 4.0f));
            AnimatorSet animatorSet = aVar.f365966d;
            if (animatorSet != null) {
                animatorSet.setDuration((long) scaleX);
                aVar.f365966d.setInterpolator(new LinearInterpolator());
                aVar.f365966d.start();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo12805Y(C6411u uVar, Object obj) {
        C134355a aVar = (C134355a) obj;
        String str = this.f365979e;
        float f = this.f365976b;
        C66226em emVar = this.f365978d;
        C47449e eVar = this.f365977c;
        float applyDimension = TypedValue.applyDimension(1, f, uVar.f19009b.getResources().getDisplayMetrics());
        if (aVar.f365963a != applyDimension || !Objects.equals(aVar.f365964b, emVar)) {
            aVar.f365963a = applyDimension;
            aVar.f365964b = emVar;
            aVar.mo111761c();
            aVar.invalidate();
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) aVar.getChildAt(0);
        String str2 = aVar.f365965c;
        if (str2 != null && !str.equals(str2)) {
            aVar.mo111760b();
        }
        aVar.f365965c = str;
        eVar.mo51286a().mo11873k(str).mo12454r(appCompatImageView);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13057a((C6407q) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aB */
    public final void mo12808aB(Object obj) {
        ((C134355a) obj).mo111759a(this.f365980f);
    }

    /* renamed from: ao */
    public final int mo12824ao() {
        return 3;
    }

    /* renamed from: f */
    public final boolean mo13115f(C6407q qVar) {
        if (this == qVar) {
            return true;
        }
        if (qVar == null || getClass() != qVar.getClass()) {
            return false;
        }
        C134357c cVar = (C134357c) qVar;
        if (Float.compare(this.f365975a, cVar.f365975a) != 0 || Float.compare(this.f365976b, cVar.f365976b) != 0) {
            return false;
        }
        C47449e eVar = this.f365977c;
        if (eVar == null ? cVar.f365977c != null : !eVar.equals(cVar.f365977c)) {
            return false;
        }
        C66226em emVar = this.f365978d;
        if (emVar == null ? cVar.f365978d != null : !emVar.equals(cVar.f365978d)) {
            return false;
        }
        String str = this.f365979e;
        if (str == null ? cVar.f365979e != null : !str.equals(cVar.f365979e)) {
            return false;
        }
        int i = this.f365974B;
        if (i == 0 ? cVar.f365974B == 0 : i == cVar.f365974B) {
            return this.f365980f == cVar.f365980f && this.f365981g == cVar.f365981g && Float.compare(this.f365973A, cVar.f365973A) == 0;
        }
        return false;
    }
}
