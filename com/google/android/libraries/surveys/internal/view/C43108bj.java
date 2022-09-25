package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1877c;
import androidx.core.content.C1878d;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import com.google.android.material.card.MaterialCardView;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.p4281bu.p4282a.C56550cg;
import com.google.p4281bu.p4282a.C56551ch;
import java.text.NumberFormat;

/* renamed from: com.google.android.libraries.surveys.internal.view.bj */
/* compiled from: PG */
public final class C43108bj extends LinearLayout {

    /* renamed from: b */
    public static final /* synthetic */ int f112745b = 0;

    /* renamed from: c */
    private static final C58485gu f112746c = C58485gu.m89850r(Integer.valueOf(R.drawable.very_dissatisfied), Integer.valueOf(R.drawable.dissatisfied), Integer.valueOf(R.drawable.neutral), Integer.valueOf(R.drawable.satisfied), Integer.valueOf(R.drawable.very_satisfied));

    /* renamed from: a */
    public C43107bi f112747a;

    /* renamed from: d */
    private C56551ch f112748d;

    public C43108bj(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.survey_question_rating_container, this, true);
    }

    /* renamed from: a */
    public static void m76063a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setOnClickListener((View.OnClickListener) null);
            viewGroup.getChildAt(i).setClickable(false);
        }
    }

    /* renamed from: b */
    public static void m76064b(ViewGroup viewGroup, int i, Drawable drawable, Drawable drawable2) {
        int i2 = 0;
        while (i2 < viewGroup.getChildCount()) {
            ((ImageView) viewGroup.getChildAt(i2).findViewById(R.id.survey_rating_image_icon)).setImageDrawable(i2 >= i ? drawable : drawable2);
            i2++;
        }
    }

    /* renamed from: d */
    public static boolean m76065d(MotionEvent motionEvent, View view) {
        return motionEvent.getX() >= 0.0f && motionEvent.getX() < ((float) view.getWidth()) && motionEvent.getY() >= 0.0f && motionEvent.getY() < ((float) view.getHeight());
    }

    /* renamed from: e */
    private final Drawable m76066e(int i, int i2) {
        return C43066o.m75981b(C1877c.m5125a(getContext(), i), getContext(), i2);
    }

    /* renamed from: f */
    private final void m76067f(View view, int i, int i2, int i3) {
        String str;
        NumberFormat instance = NumberFormat.getInstance(getContext().getResources().getConfiguration().getLocales().get(0));
        String format = instance.format((long) i);
        String format2 = instance.format((long) i2);
        String string = getContext().getString(R.string.survey_num_rating, new Object[]{format, format2});
        if (i3 == 4) {
            string = getResources().getQuantityString(R.plurals.survey_star_rating, i, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            i3 = 4;
        }
        if (i == 1) {
            string = string + " " + this.f112748d.f151011d;
        } else if (i == i2) {
            string = string + " " + this.f112748d.f151012e;
        }
        if (i3 == 3) {
            Context context = getContext();
            Object[] objArr = new Object[3];
            objArr[0] = format;
            objArr[1] = format2;
            if (i == 1) {
                str = getContext().getString(R.string.survey_very_dissatisfied);
            } else if (i == 2) {
                str = getContext().getString(R.string.survey_somewhat_dissatisfied);
            } else if (i == 3) {
                str = getContext().getString(R.string.survey_neutral);
            } else if (i == 4) {
                str = getContext().getString(R.string.survey_somewhat_satisfied);
            } else if (i != 5) {
                str = BuildConfig.FLAVOR;
            } else {
                str = getContext().getString(R.string.survey_very_satisfied);
            }
            objArr[2] = str;
            string = context.getString(R.string.survey_smiley_rating, objArr);
        }
        view.setContentDescription(string);
    }

    /* renamed from: c */
    public final void mo46169c(C56551ch chVar) {
        C56551ch chVar2 = chVar;
        this.f112748d = chVar2;
        int i = chVar2.f151009b;
        if (i < 5 || i > 7) {
            throw new IllegalArgumentException("Number of ratings must be between 5 and 7.");
        }
        TextView textView = (TextView) findViewById(R.id.survey_rating_low_value_text);
        String str = chVar2.f151011d;
        textView.setText(str);
        textView.setContentDescription(str);
        TextView textView2 = (TextView) findViewById(R.id.survey_rating_high_value_text);
        String str2 = chVar2.f151012e;
        textView2.setText(str2);
        textView2.setContentDescription(str2);
        int i2 = chVar2.f151008a;
        int a = C56550cg.m88210a(i2);
        int i3 = R.id.survey_rating_image_icon;
        int i4 = R.id.survey_rating_image_layout;
        int i5 = R.layout.survey_question_rating_image_item;
        if (a != 0 && a == 3) {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.survey_rating_images_container);
            LayoutInflater from = LayoutInflater.from(getContext());
            int i6 = ((C58724pq) f112746c).f156474d;
            int i7 = 0;
            while (i7 < i6) {
                View inflate = from.inflate(R.layout.survey_question_rating_image_item, viewGroup, false);
                if (i7 == 0) {
                    inflate.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    i7 = 0;
                }
                FrameLayout frameLayout = (FrameLayout) inflate.findViewById(i4);
                ImageView imageView = (ImageView) frameLayout.findViewById(i3);
                imageView.setImageDrawable(C43066o.m75981b(C1877c.m5125a(getContext(), ((Integer) f112746c.get(i7)).intValue()), getContext(), C1878d.m5128a(getContext(), R.color.survey_grey_icon_color)));
                i7++;
                imageView.setTag(Integer.valueOf(i7));
                m76067f(imageView, i7, i6, 3);
                frameLayout.setOnTouchListener(new C43103be(this, frameLayout, imageView));
                frameLayout.setOnClickListener(new C43104bf(this, viewGroup, i7));
                viewGroup.addView(inflate);
                i3 = R.id.survey_rating_image_icon;
                i4 = R.id.survey_rating_image_layout;
            }
            return;
        }
        int a2 = C56550cg.m88210a(i2);
        if (a2 != 0 && a2 == 5) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.survey_rating_images_container);
            LayoutInflater from2 = LayoutInflater.from(getContext());
            int i8 = this.f112748d.f151009b;
            int i9 = 0;
            while (i9 < i8) {
                View inflate2 = from2.inflate(R.layout.survey_question_rating_number_item, viewGroup2, false);
                if (i9 == 0) {
                    inflate2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    i9 = 0;
                }
                FrameLayout frameLayout2 = (FrameLayout) inflate2.findViewById(R.id.survey_rating_number_layout);
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.survey_rating_number_large_button_horizontal_padding);
                viewGroup2.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                MaterialCardView materialCardView = (MaterialCardView) frameLayout2.findViewById(R.id.survey_rating_number_card);
                int dimension = (int) getResources().getDimension(R.dimen.survey_rating_number_large_side_length);
                ViewGroup.LayoutParams layoutParams = materialCardView.getLayoutParams();
                layoutParams.width = dimension;
                layoutParams.height = dimension;
                materialCardView.setLayoutParams(layoutParams);
                TextView textView3 = (TextView) materialCardView.findViewById(R.id.survey_rating_number_text);
                i9++;
                textView3.setTag(Integer.valueOf(i9));
                textView3.setText(String.valueOf(i9));
                m76067f(textView3, i9, i8, 5);
                frameLayout2.setOnTouchListener(new C43099ba(this, frameLayout2, materialCardView, textView3));
                frameLayout2.setOnClickListener(new C43100bb(this, viewGroup2, i9));
                viewGroup2.addView(inflate2);
            }
            return;
        }
        int a3 = C56550cg.m88210a(i2);
        if (a3 != 0 && a3 == 4) {
            int a4 = C1878d.m5128a(getContext(), R.color.survey_accent_color);
            Drawable e = m76066e(R.drawable.quantum_ic_star_border_grey600_36, C1878d.m5128a(getContext(), R.color.survey_grey_icon_color));
            Drawable e2 = m76066e(R.drawable.quantum_ic_star_grey600_36, a4);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.survey_rating_images_container);
            LayoutInflater from3 = LayoutInflater.from(getContext());
            int i10 = this.f112748d.f151009b;
            int i11 = 0;
            while (i11 < i10) {
                View inflate3 = from3.inflate(i5, viewGroup3, false);
                if (i11 == 0) {
                    inflate3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    i11 = 0;
                }
                FrameLayout frameLayout3 = (FrameLayout) inflate3.findViewById(R.id.survey_rating_image_layout);
                int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.survey_rating_image_large_button_horizontal_padding);
                viewGroup3.setPadding(dimensionPixelOffset2, 0, dimensionPixelOffset2, 0);
                ImageView imageView2 = (ImageView) frameLayout3.findViewById(R.id.survey_rating_image_icon);
                imageView2.setImageDrawable(e);
                i11++;
                imageView2.setTag(Integer.valueOf(i11));
                m76067f(imageView2, i11, i10, 4);
                frameLayout3.setOnTouchListener(new C43105bg(frameLayout3, viewGroup3, e, e2, i11));
                frameLayout3.setOnClickListener(new C43106bh(this, viewGroup3, i11));
                viewGroup3.addView(inflate3);
                i5 = R.layout.survey_question_rating_image_item;
            }
        }
    }
}
