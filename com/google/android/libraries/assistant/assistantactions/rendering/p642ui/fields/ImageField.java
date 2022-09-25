package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.LottieImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51014de;
import com.google.assistant.p3897e.p3902c.p3907c.C51018di;
import com.google.assistant.p3897e.p3921j.p3926e.C51940et;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ImageField */
/* compiled from: PG */
public class ImageField extends C11407n {

    /* renamed from: a */
    public C58485gu f37000a = C58485gu.m89845m();

    /* renamed from: b */
    private ImageComponent f37001b;

    /* renamed from: c */
    private LottieImageComponent f37002c;

    public ImageField(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m27051a(C51018di diVar) {
        this.f37001b.setVisibility(0);
        if ((diVar.f132838a & 2) != 0 || !this.f37000a.isEmpty()) {
            this.f37001b.setOnClickListener(new C11369bb(this));
        }
    }

    /* renamed from: b */
    public final void mo19809b() {
        C51940et etVar;
        C51018di diVar;
        C11295c cVar = this.f37153l;
        if (cVar != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136275c == 24) {
                etVar = (C51940et) euVar.f136276d;
            } else {
                etVar = C51940et.f136268b;
            }
            this.f37000a = C58485gu.m89842j(etVar.f136270a);
            C51941eu euVar2 = this.f37153l.f36729a;
            if (euVar2.f136277e == 14) {
                diVar = (C51018di) euVar2.f136278f;
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
                            this.f37002c.setVisibility(0);
                            LottieImageComponent lottieImageComponent = this.f37002c;
                            C51012dc dcVar3 = diVar.f132839b;
                            if (dcVar3 == null) {
                                dcVar3 = C51012dc.f132813k;
                            }
                            lottieImageComponent.f36869a.mo9701k(dcVar3.f132820f, (String) null);
                            lottieImageComponent.f36869a.mo9693d(true);
                            lottieImageComponent.f36869a.mo9695f();
                            lottieImageComponent.f36869a.setScaleType(ImageView.ScaleType.FIT_START);
                            lottieImageComponent.addView(lottieImageComponent.f36869a);
                            if ((diVar.f132838a & 2) != 0) {
                                this.f37002c.setOnClickListener(new C11369bb(this));
                            }
                            this.f37002c.getLayoutParams().height = (int) getContext().getResources().getDimension(R.dimen.image_field_size);
                            this.f37002c.requestLayout();
                            return;
                        }
                    }
                }
                C51012dc dcVar4 = diVar.f132839b;
                if ((2 & (dcVar4 == null ? C51012dc.f132813k : dcVar4).f132815a) == 0) {
                    if (((dcVar4 == null ? C51012dc.f132813k : dcVar4).f132815a & 2048) == 0) {
                        if (((dcVar4 == null ? C51012dc.f132813k : dcVar4).f132815a & 32) != 0) {
                            ImageComponent imageComponent = this.f37001b;
                            imageComponent.f36858e = true;
                            if (dcVar4 == null) {
                                dcVar4 = C51012dc.f132813k;
                            }
                            imageComponent.mo19786b(dcVar4, (Drawable) null);
                            m27051a(diVar);
                            return;
                        }
                        return;
                    }
                }
                ImageComponent imageComponent2 = this.f37001b;
                if (dcVar4 == null) {
                    dcVar4 = C51012dc.f132813k;
                }
                imageComponent2.mo19786b(dcVar4, (Drawable) null);
                m27051a(diVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f37001b = (ImageComponent) findViewById(R.id.image_field_image_component);
        this.f37002c = (LottieImageComponent) findViewById(R.id.image_field_lottie_image_component);
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
