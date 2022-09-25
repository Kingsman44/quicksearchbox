package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.AppCompatImageView */
/* compiled from: PG */
public class AppCompatImageView extends ImageView {

    /* renamed from: a */
    private final C0779y f1804a;

    /* renamed from: b */
    private final C0512aj f1805b;

    /* renamed from: c */
    private boolean f1806c;

    public AppCompatImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0779y yVar = this.f1804a;
        if (yVar != null) {
            yVar.mo3306c();
        }
        C0512aj ajVar = this.f1805b;
        if (ajVar != null) {
            ajVar.mo2498b();
        }
    }

    public final boolean hasOverlappingRendering() {
        return this.f1805b.mo2501e() && super.hasOverlappingRendering();
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0779y yVar = this.f1804a;
        if (yVar != null) {
            yVar.mo3312i();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0779y yVar = this.f1804a;
        if (yVar != null) {
            yVar.mo3308e(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0512aj ajVar = this.f1805b;
        if (ajVar != null) {
            ajVar.mo2498b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        C0512aj ajVar = this.f1805b;
        if (!(ajVar == null || drawable == null || this.f1806c)) {
            ajVar.f2058b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        C0512aj ajVar2 = this.f1805b;
        if (ajVar2 != null) {
            ajVar2.mo2498b();
            if (!this.f1806c) {
                this.f1805b.mo2497a();
            }
        }
    }

    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1806c = true;
    }

    public void setImageResource(int i) {
        C0512aj ajVar = this.f1805b;
        if (ajVar != null) {
            ajVar.mo2500d(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0512aj ajVar = this.f1805b;
        if (ajVar != null) {
            ajVar.mo2498b();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0732im.m2470a(context);
        this.f1806c = false;
        C0730ik.m2467d(this, getContext());
        C0779y yVar = new C0779y(this);
        this.f1804a = yVar;
        yVar.mo3307d(attributeSet, i);
        C0512aj ajVar = new C0512aj(this);
        this.f1805b = ajVar;
        ajVar.mo2499c(attributeSet, i);
    }
}
