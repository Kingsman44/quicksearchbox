package androidx.slice.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.SliceItem;
import androidx.slice.p194a.C4101h;

/* compiled from: PG */
public class MessageView extends C4129ag {

    /* renamed from: a */
    private TextView f13183a;

    /* renamed from: b */
    private ImageView f13184b;

    public MessageView(Context context) {
        super(context);
    }

    /* renamed from: f */
    public final void mo8642f() {
    }

    /* renamed from: fz */
    public final void mo8643fz(C4130ah ahVar, boolean z, int i, int i2, C4141as asVar) {
        IconCompat iconCompat;
        Drawable d;
        SliceItem sliceItem = ahVar.f13268m;
        mo8709p(asVar);
        SliceItem d2 = C4101h.m11751d(sliceItem, "image", "source");
        if (!(d2 == null || (iconCompat = (IconCompat) d2.f13094d) == null || (d = iconCompat.mo5075d(getContext())) == null)) {
            int applyDimension = (int) TypedValue.applyDimension(1, 24.0f, getContext().getResources().getDisplayMetrics());
            Bitmap createBitmap = Bitmap.createBitmap(applyDimension, applyDimension, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            d.setBounds(0, 0, applyDimension, applyDimension);
            d.draw(canvas);
            this.f13184b.setImageBitmap(C4144av.m11882b(createBitmap));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String[] strArr = null;
        for (SliceItem sliceItem2 : C4101h.m11752e(sliceItem, "text", (String[]) null, (String[]) null)) {
            if (spannableStringBuilder.length() != 0) {
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(sliceItem2.mo8597e());
        }
        this.f13183a.setText(spannableStringBuilder.toString());
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f13183a = (TextView) findViewById(16908304);
        this.f13184b = (ImageView) findViewById(16908294);
    }
}
