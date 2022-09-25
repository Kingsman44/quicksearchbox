package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.AppCompatImageButton */
/* compiled from: PG */
public class AppCompatImageButton extends ImageButton {
    private final C0779y mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C0512aj mImageHelper;

    public AppCompatImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0779y yVar = this.mBackgroundTintHelper;
        if (yVar != null) {
            yVar.mo3306c();
        }
        C0512aj ajVar = this.mImageHelper;
        if (ajVar != null) {
            ajVar.mo2498b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0779y yVar = this.mBackgroundTintHelper;
        if (yVar != null) {
            return yVar.mo3304a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0779y yVar = this.mBackgroundTintHelper;
        if (yVar != null) {
            return yVar.mo3305b();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0733in inVar;
        C0512aj ajVar = this.mImageHelper;
        if (ajVar == null || (inVar = ajVar.f2057a) == null) {
            return null;
        }
        return inVar.f2591a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0733in inVar;
        C0512aj ajVar = this.mImageHelper;
        if (ajVar == null || (inVar = ajVar.f2057a) == null) {
            return null;
        }
        return inVar.f2592b;
    }

    public boolean hasOverlappingRendering() {
        return this.mImageHelper.mo2501e() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0779y yVar = this.mBackgroundTintHelper;
        if (yVar != null) {
            yVar.mo3312i();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0779y yVar = this.mBackgroundTintHelper;
        if (yVar != null) {
            yVar.mo3308e(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0512aj ajVar = this.mImageHelper;
        if (ajVar != null) {
            ajVar.mo2498b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        C0512aj ajVar = this.mImageHelper;
        if (!(ajVar == null || drawable == null || this.mHasLevel)) {
            ajVar.f2058b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        C0512aj ajVar2 = this.mImageHelper;
        if (ajVar2 != null) {
            ajVar2.mo2498b();
            if (!this.mHasLevel) {
                this.mImageHelper.mo2497a();
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    public void setImageResource(int i) {
        this.mImageHelper.mo2500d(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0512aj ajVar = this.mImageHelper;
        if (ajVar != null) {
            ajVar.mo2498b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0779y yVar = this.mBackgroundTintHelper;
        if (yVar != null) {
            yVar.mo3310g(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0779y yVar = this.mBackgroundTintHelper;
        if (yVar != null) {
            yVar.mo3311h(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0512aj ajVar = this.mImageHelper;
        if (ajVar != null) {
            if (ajVar.f2057a == null) {
                ajVar.f2057a = new C0733in();
            }
            C0733in inVar = ajVar.f2057a;
            inVar.f2591a = colorStateList;
            inVar.f2594d = true;
            ajVar.mo2498b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0512aj ajVar = this.mImageHelper;
        if (ajVar != null) {
            if (ajVar.f2057a == null) {
                ajVar.f2057a = new C0733in();
            }
            C0733in inVar = ajVar.f2057a;
            inVar.f2592b = mode;
            inVar.f2593c = true;
            ajVar.mo2498b();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0732im.m2470a(context);
        this.mHasLevel = false;
        C0730ik.m2467d(this, getContext());
        C0779y yVar = new C0779y(this);
        this.mBackgroundTintHelper = yVar;
        yVar.mo3307d(attributeSet, i);
        C0512aj ajVar = new C0512aj(this);
        this.mImageHelper = ajVar;
        ajVar.mo2499c(attributeSet, i);
    }
}
