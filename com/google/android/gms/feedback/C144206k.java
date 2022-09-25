package com.google.android.gms.feedback;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.internal.C143918bg;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.p10905k.C146609h;

/* renamed from: com.google.android.gms.feedback.k */
/* compiled from: PG */
public final class C144206k extends C143847s {
    public C144206k(Context context) {
        super(context, (Activity) null, C144205j.f390619b, C143724i.f389627f, C143846r.f389923a);
        C146609h.f395979a = context.getApplicationContext().getContentResolver();
    }

    /* renamed from: a */
    public static Bitmap m234449a(Activity activity) {
        try {
            return m234450b(activity.getWindow().getDecorView().getRootView());
        } catch (Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    /* renamed from: b */
    public static Bitmap m234450b(View view) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Error | Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    /* renamed from: c */
    public final C146006ab mo119739c(FeedbackOptions feedbackOptions) {
        return C143918bg.m233956b(C144205j.m234446c(this.f389929D, feedbackOptions));
    }

    /* renamed from: d */
    public final C146006ab mo119740d(FeedbackOptions feedbackOptions) {
        return C143918bg.m233956b(C144205j.m234447d(this.f389929D, feedbackOptions));
    }
}
