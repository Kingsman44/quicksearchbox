package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80784fe;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80786fg;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.material.chip.Chip;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.c */
/* compiled from: PG */
final class C81697c {

    /* renamed from: a */
    public static final C59071e f223438a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.c");

    /* renamed from: b */
    public final ColorStateList f223439b;

    /* renamed from: c */
    private final C91189au f223440c;

    /* renamed from: d */
    private C60870cx f223441d = C60856cj.m92898g();

    public C81697c(Context context, C91189au auVar) {
        this.f223440c = auVar;
        this.f223439b = ColorStateList.valueOf(C19391a.m36980a(context, R.attr.colorPrimary));
    }

    /* renamed from: a */
    static Uri m129838a(Icon icon) {
        return Uri.parse(String.format("android.resource://%s/%s", new Object[]{icon.getResPackage(), Integer.valueOf(icon.getResId())}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo75244b(Chip chip, C80784fe feVar, int i) {
        C60870cx cxVar;
        C80786fg b = feVar.mo74604b();
        if (b != null) {
            this.f223441d.cancel(true);
            int b2 = b.mo74401b();
            int i2 = b2 - 1;
            if (b2 != 0) {
                if (i2 == 0) {
                    cxVar = this.f223440c.mo85418e(Uri.parse(b.mo74409d()), i);
                } else if (i2 == 1) {
                    cxVar = this.f223440c.mo85418e(m129838a(b.mo74400a()), i);
                } else if (i2 == 2) {
                    cxVar = this.f223440c.mo85418e(m129838a(b.mo74405c()), i);
                } else {
                    throw new AssertionError();
                }
                this.f223441d = cxVar;
                this.f223440c.mo85428r(cxVar, "ImageLoader.loadImage", new C81696b(this, b, chip));
                return;
            }
            throw null;
        }
        chip.mo47694q((Drawable) null);
    }
}
