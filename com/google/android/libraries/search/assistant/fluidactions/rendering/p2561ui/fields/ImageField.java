package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.LottieImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51014de;
import com.google.assistant.p3897e.p3902c.p3907c.C51018di;
import com.google.assistant.p3897e.p3921j.p3926e.C51940et;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ImageField */
/* compiled from: PG */
public final class ImageField extends LinearLayout implements C33177b {

    /* renamed from: d */
    private static final C59071e f89116d = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ImageField");

    /* renamed from: a */
    public C51941eu f89117a;

    /* renamed from: b */
    public C33182g f89118b;

    /* renamed from: c */
    public C32942a f89119c;

    /* renamed from: e */
    private ImageComponent f89120e = null;

    /* renamed from: f */
    private LottieImageComponent f89121f = null;

    public ImageField(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m61787a(C51018di diVar) {
        ImageComponent imageComponent;
        C51940et etVar;
        if (this.f89117a != null && (imageComponent = this.f89120e) != null) {
            imageComponent.setVisibility(0);
            if ((diVar.f132838a & 2) == 0) {
                C51941eu euVar = this.f89117a;
                if (euVar.f136275c == 24) {
                    etVar = (C51940et) euVar.f136276d;
                } else {
                    etVar = C51940et.f136268b;
                }
                if (etVar.f136270a.size() <= 0) {
                    return;
                }
            }
            this.f89120e.setOnClickListener(new C33307bm(this));
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo38561b(C33176f fVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo38562c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo38563d(boolean z) {
    }

    /* renamed from: e */
    public final void mo38564e(C33180e eVar) {
        C51018di diVar;
        C51941eu euVar = this.f89117a;
        if (euVar == null || this.f89118b == null || this.f89120e == null || this.f89121f == null) {
            ((C59052c) ((C59052c) f89116d.mo56226d()).mo56372aa(51086)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89117a = euVar2;
            this.f89118b.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89117a;
        if (euVar3.f136277e == 14) {
            diVar = (C51018di) euVar3.f136278f;
        } else {
            diVar = C51018di.f132836d;
        }
        if ((diVar.f132838a & 1) != 0) {
            C51012dc dcVar = diVar.f132839b;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            if ((dcVar.f132815a & 1) != 0) {
                C51012dc dcVar2 = diVar.f132839b;
                int a = C51014de.m86008a((dcVar2 == null ? C51012dc.f132813k : dcVar2).f132816b);
                if (a != 0 && a == 2) {
                    if (dcVar2 == null) {
                        dcVar2 = C51012dc.f132813k;
                    }
                    if ((dcVar2.f132815a & 16) != 0) {
                        this.f89121f.setVisibility(0);
                        LottieImageComponent lottieImageComponent = this.f89121f;
                        C51012dc dcVar3 = diVar.f132839b;
                        if (dcVar3 == null) {
                            dcVar3 = C51012dc.f132813k;
                        }
                        String str = dcVar3.f132820f;
                        LottieAnimationView lottieAnimationView = lottieImageComponent.f88971a;
                        if (lottieAnimationView != null) {
                            lottieAnimationView.mo9701k(str, (String) null);
                            lottieImageComponent.f88971a.mo9693d(true);
                            lottieImageComponent.f88971a.mo9695f();
                            lottieImageComponent.f88971a.setScaleType(ImageView.ScaleType.FIT_START);
                            lottieImageComponent.addView(lottieImageComponent.f88971a);
                        }
                        if ((diVar.f132838a & 2) != 0) {
                            this.f89121f.setOnClickListener(new C33307bm(this));
                        }
                        this.f89121f.getLayoutParams().height = (int) getContext().getResources().getDimension(R.dimen.fa_image_field_size);
                        this.f89121f.requestLayout();
                        return;
                    }
                }
            }
            C51012dc dcVar4 = diVar.f132839b;
            if ((2 & (dcVar4 == null ? C51012dc.f132813k : dcVar4).f132815a) == 0) {
                if (((dcVar4 == null ? C51012dc.f132813k : dcVar4).f132815a & 2048) == 0) {
                    if (((dcVar4 == null ? C51012dc.f132813k : dcVar4).f132815a & 32) != 0) {
                        ImageComponent imageComponent = this.f89120e;
                        imageComponent.f88960e = true;
                        if (dcVar4 == null) {
                            dcVar4 = C51012dc.f132813k;
                        }
                        imageComponent.mo38649b(dcVar4, (Drawable) null);
                        m61787a(diVar);
                        return;
                    }
                    return;
                }
            }
            ImageComponent imageComponent2 = this.f89120e;
            if (dcVar4 == null) {
                dcVar4 = C51012dc.f132813k;
            }
            imageComponent2.mo38649b(dcVar4, (Drawable) null);
            m61787a(diVar);
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void mo38565f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo38566g() {
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f89120e = (ImageComponent) findViewById(R.id.fa_image_field_image_component);
        this.f89121f = (LottieImageComponent) findViewById(R.id.fa_image_field_lottie_image_component);
    }

    public ImageField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImageField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ImageField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
