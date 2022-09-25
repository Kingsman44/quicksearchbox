package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110423j;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110424k;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.e */
/* compiled from: PG */
final class C110094e extends View {

    /* renamed from: e */
    private static final C59071e f306738e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.e");

    /* renamed from: a */
    float f306739a;

    /* renamed from: b */
    float f306740b;

    /* renamed from: c */
    public float f306741c;

    /* renamed from: d */
    public float f306742d;

    /* renamed from: f */
    private final Bitmap f306743f;

    /* renamed from: g */
    private final Bitmap f306744g;

    /* renamed from: h */
    private final DisplayMetrics f306745h = getResources().getDisplayMetrics();

    /* renamed from: i */
    private final ImageView f306746i;

    /* renamed from: j */
    private final int f306747j;

    public C110094e(Context context, AttributeSet attributeSet, C110424k kVar) {
        super(context, attributeSet);
        int i;
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.minute_hand);
        this.f306743f = decodeResource;
        int floor = (int) Math.floor((double) (((float) decodeResource.getHeight()) * 0.042283952f));
        this.f306747j = floor;
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.hour_hand);
        ImageView imageView = new ImageView(context);
        this.f306746i = imageView;
        imageView.setBackgroundResource(R.drawable.hour_hand);
        if (kVar == null) {
            i = decodeResource2.getHeight();
        } else {
            C110423j jVar = kVar.f307801a;
            i = Math.max(((int) C91115n.m148870b((float) (Math.min(jVar.f307793l, jVar.f307794m) / 2), context)) + floor, (int) (((float) decodeResource2.getHeight()) * 0.7f));
        }
        imageView.layout(0, 0, decodeResource2.getWidth(), i);
        Bitmap decodeResource3 = BitmapFactory.decodeResource(getResources(), R.drawable.clock_bg);
        if (kVar != null) {
            float b = C91115n.m148870b((float) kVar.f307801a.f307795n, context);
            float b2 = C91115n.m148870b((float) kVar.f307801a.f307796o, context);
            float max = Math.max(b / ((float) decodeResource3.getWidth()), 1.0f);
            float max2 = Math.max(b2 / ((float) decodeResource3.getHeight()), 1.0f);
            Matrix matrix = new Matrix();
            matrix.postScale(max * 1.2f, max2 * 1.2f);
            this.f306744g = Bitmap.createBitmap(decodeResource3, 0, 0, decodeResource3.getWidth(), decodeResource3.getHeight(), matrix, true);
            return;
        }
        this.f306744g = decodeResource3;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(this.f306741c, this.f306742d);
        try {
            canvas.drawBitmap(this.f306744g, (float) ((this.f306745h.widthPixels - this.f306744g.getWidth()) / 2), (float) ((this.f306745h.heightPixels - this.f306744g.getHeight()) / 2), (Paint) null);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f306738e.mo56225c()).mo56382g(e)).mo56372aa(25676)).mo56386p("Background failed to render. Proceed without a background.");
        }
        canvas.restore();
        canvas.save();
        canvas.translate(this.f306741c, this.f306742d);
        canvas.rotate(this.f306740b, (float) (this.f306745h.widthPixels / 2), (float) (this.f306745h.heightPixels / 2));
        canvas.drawBitmap(this.f306743f, (float) ((this.f306745h.widthPixels / 2) - (this.f306743f.getWidth() / 2)), (float) ((this.f306745h.heightPixels - this.f306743f.getHeight()) / 2), (Paint) null);
        canvas.restore();
        canvas.save();
        canvas.translate(((float) ((this.f306745h.widthPixels / 2) - (this.f306746i.getWidth() / 2))) + this.f306741c, ((float) (((this.f306745h.heightPixels / 2) - this.f306746i.getHeight()) + this.f306747j)) + this.f306742d);
        canvas.rotate(this.f306739a, (float) (this.f306746i.getWidth() / 2), (float) (this.f306746i.getHeight() - this.f306747j));
        this.f306746i.draw(canvas);
        canvas.restore();
    }
}
