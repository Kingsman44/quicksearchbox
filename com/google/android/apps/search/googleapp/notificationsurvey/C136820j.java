package com.google.android.apps.search.googleapp.notificationsurvey;

import android.content.Context;
import android.support.p033v7.widget.AppCompatImageView;
import android.widget.LinearLayout;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.p375ai.p378b.C8178yk;

/* renamed from: com.google.android.apps.search.googleapp.notificationsurvey.j */
/* compiled from: PG */
public final class C136820j {

    /* renamed from: g */
    private static final int[] f372423g = {R.drawable.quantum_ic_sentiment_very_dissatisfied_grey600_48, R.drawable.quantum_ic_sentiment_dissatisfied_grey600_48, R.drawable.quantum_ic_sentiment_neutral_grey600_48, R.drawable.quantum_ic_sentiment_satisfied_grey600_48, R.drawable.quantum_ic_sentiment_very_satisfied_grey600_48};

    /* renamed from: a */
    final AppCompatImageView[] f372424a = new AppCompatImageView[5];

    /* renamed from: b */
    public final C28443m f372425b;

    /* renamed from: c */
    public final C28310af f372426c;

    /* renamed from: d */
    public final C28306ab f372427d;

    /* renamed from: e */
    public final boolean f372428e;

    /* renamed from: f */
    public C136816g f372429f;

    public C136820j(C28443m mVar, RatingView ratingView, C28310af afVar, C28306ab abVar, boolean z) {
        this.f372425b = mVar;
        this.f372426c = afVar;
        this.f372427d = abVar;
        this.f372428e = z;
        Context context = ratingView.getContext();
        int dimension = (int) context.getResources().getDimension(R.dimen.googleapp_notificationsurvey_smile_survey_icon_size);
        int a = C1878d.m5128a(context, R.color.googleapp_notificationsurvey_smile_survey_body);
        int i = 0;
        while (i < 5) {
            AppCompatImageView[] appCompatImageViewArr = this.f372424a;
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            appCompatImageView.setImageResource(f372423g[i]);
            appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(dimension, dimension, 1.0f));
            appCompatImageView.setColorFilter(a);
            int i2 = i + 1;
            appCompatImageView.setContentDescription(context.getString(R.string.googleapp_notificationsurvey_rating_views_content_description, new Object[]{Integer.valueOf(i2)}));
            appCompatImageViewArr[i] = appCompatImageView;
            ratingView.addView(this.f372424a[i]);
            i = i2;
        }
    }

    /* renamed from: a */
    public static boolean m222501a(C8178yk ykVar) {
        C60214n nVar;
        C60214n nVar2;
        if (ykVar.f28739b == 5) {
            nVar = (C60214n) ykVar.f28740c;
        } else {
            nVar = C60214n.f162914g;
        }
        if ((nVar.f162916a & 2048) == 0) {
            return false;
        }
        if (ykVar.f28739b == 5) {
            nVar2 = (C60214n) ykVar.f28740c;
        } else {
            nVar2 = C60214n.f162914g;
        }
        C60218r rVar = nVar2.f162921f;
        if (rVar == null) {
            rVar = C60218r.f162925d;
        }
        return (rVar.f162927a & 2) == 0;
    }
}
