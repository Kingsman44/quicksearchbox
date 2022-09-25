package com.google.android.apps.gsa.staticplugins.nowcards.p8119i;

import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58597ky;
import java.text.DecimalFormat;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.c */
/* compiled from: PG */
public final class C105045c {

    /* renamed from: a */
    public static final DecimalFormat f292750a = new DecimalFormat("0.0");

    /* renamed from: b */
    public static final Double f292751b = Double.valueOf(1.0d);

    /* renamed from: c */
    public static final Double f292752c = Double.valueOf(5.0d);

    /* renamed from: d */
    private static final List f292753d = C58597ky.m90212c(Integer.valueOf(R.drawable.star_rating_1), Integer.valueOf(R.drawable.star_rating_1_5), Integer.valueOf(R.drawable.star_rating_2), Integer.valueOf(R.drawable.star_rating_2_5), Integer.valueOf(R.drawable.star_rating_3), Integer.valueOf(R.drawable.star_rating_3_5), Integer.valueOf(R.drawable.star_rating_4), Integer.valueOf(R.drawable.star_rating_4_5), Integer.valueOf(R.drawable.star_rating_5));

    /* renamed from: a */
    public static int m174267a(double d) {
        int round = ((int) Math.round(d + d)) - 2;
        boolean z = true;
        C58838bb.m90868c(round >= 0);
        List list = f292753d;
        if (round >= list.size()) {
            z = false;
        }
        C58838bb.m90868c(z);
        return ((Integer) list.get(round)).intValue();
    }
}
