package com.google.android.libraries.social.peoplekit.avatars.viewcontrollers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p033v7.widget.AppCompatImageView;
import android.support.p033v7.widget.C0678gm;
import android.util.AttributeSet;
import androidx.core.content.C1878d;
import androidx.core.graphics.C1924a;
import com.google.android.googlequicksearchbox.R;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public final class AvatarView extends AppCompatImageView {

    /* renamed from: a */
    public Bitmap f109750a;

    /* renamed from: b */
    boolean f109751b = false;

    /* renamed from: c */
    private final RectF f109752c = new RectF();

    /* renamed from: d */
    private final RectF f109753d = new RectF();

    /* renamed from: e */
    private final Matrix f109754e = new Matrix();

    /* renamed from: f */
    private final Paint f109755f;

    /* renamed from: g */
    private BitmapShader f109756g;

    /* renamed from: h */
    private Bitmap f109757h;

    /* renamed from: i */
    private int f109758i;

    /* renamed from: j */
    private boolean f109759j = true;

    public AvatarView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f109755f = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
        m73567c();
    }

    /* renamed from: b */
    private final Bitmap m73566b(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if ((drawable instanceof BitmapDrawable) && !this.f109751b) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            return Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private final void m73567c() {
        Drawable c = C0678gm.m2375e().mo3100c(getContext(), R.drawable.peoplekit_default_avatar);
        this.f109750a = m73566b(c);
        Canvas canvas = new Canvas(this.f109750a);
        c.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        c.draw(canvas);
        this.f109756g = new BitmapShader(this.f109750a, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    }

    /* renamed from: d */
    private final void m73568d() {
        Bitmap bitmap = this.f109757h;
        if (bitmap != null) {
            this.f109756g = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        }
    }

    /* renamed from: e */
    private final void m73569e(Canvas canvas, Bitmap bitmap, Paint paint) {
        this.f109754e.reset();
        this.f109752c.set(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        this.f109753d.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
        this.f109754e.setRectToRect(this.f109752c, this.f109753d, Matrix.ScaleToFit.FILL);
        this.f109756g.setLocalMatrix(this.f109754e);
        paint.setShader(this.f109756g);
        canvas.drawCircle(this.f109753d.centerX(), this.f109753d.centerY(), this.f109753d.width() / 2.0f, paint);
    }

    /* renamed from: a */
    public final void mo44500a(boolean z, int i, boolean z2) {
        this.f109751b = z;
        this.f109758i = i;
        this.f109759j = z2;
        if (z && this.f109750a == null) {
            m73567c();
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        canvas.clipRect(0, 0, getHeight(), getWidth());
        if (this.f109751b) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(this.f109758i);
            paint.setAlpha(PrivateKeyType.INVALID);
            int height = getHeight();
            int width = getWidth();
            canvas.drawCircle(((float) width) / 2.0f, ((float) height) / 2.0f, ((float) Math.min(height, width)) / 2.0f, paint);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setFilterBitmap(true);
            paint2.setDither(true);
            paint2.setColor(C1878d.m5128a(getContext(), R.color.quantum_white_100));
            if (this.f109759j) {
                paint2.setAlpha(C1924a.m5183b(this.f109758i) > 0.4000000059604645d ? 242 : 204);
            }
            if (this.f109750a == null) {
                m73567c();
            }
            m73569e(canvas, this.f109750a, paint2);
            return;
        }
        Bitmap bitmap = this.f109757h;
        if (bitmap != null) {
            m73569e(canvas, bitmap, this.f109755f);
        }
    }

    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f109757h = bitmap;
        m73568d();
    }

    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f109757h = m73566b(drawable);
        m73568d();
    }

    public final void setImageResource(int i) {
        super.setImageResource(i);
        this.f109757h = m73566b(getDrawable());
        m73568d();
    }

    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f109757h = uri != null ? m73566b(getDrawable()) : null;
        m73568d();
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f109755f = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
        m73567c();
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f109755f = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
        m73567c();
    }
}
