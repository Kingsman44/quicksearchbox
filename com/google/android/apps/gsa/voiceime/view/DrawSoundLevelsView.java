package com.google.android.apps.gsa.voiceime.view;

import android.animation.TimeAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.gsa.shared.util.C90758bb;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;

/* compiled from: PG */
public class DrawSoundLevelsView extends View {

    /* renamed from: a */
    int f331100a;

    /* renamed from: b */
    protected final int f331101b;

    /* renamed from: c */
    public C90758bb f331102c;

    /* renamed from: d */
    protected Paint f331103d;

    /* renamed from: e */
    protected int f331104e;

    /* renamed from: f */
    private TimeAnimator f331105f;

    /* renamed from: g */
    private int f331106g;

    /* renamed from: h */
    private int f331107h;

    /* renamed from: com.google.android.apps.gsa.voiceime.view.DrawSoundLevelsView$a */
    /* compiled from: PG */
    public interface C118697a {
    }

    public DrawSoundLevelsView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private final void m197031a() {
        if (!this.f331105f.isStarted()) {
            this.f331105f.start();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m197031a();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f331105f.cancel();
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        if (isEnabled()) {
            canvas.drawColor(this.f331104e);
            int width = getWidth();
            int i = this.f331101b;
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) (((((width - i) * this.f331100a) / 100) + i) / 2), this.f331103d);
            return;
        }
        canvas.drawColor(this.f331106g);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f331108a) {
            m197031a();
        }
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f331108a = this.f331105f.isStarted();
        return savedState;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            m197031a();
        } else {
            this.f331105f.cancel();
        }
    }

    /* compiled from: PG */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C118699b();

        /* renamed from: a */
        boolean f331108a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f331108a = parcel.readInt() != 1 ? false : true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f331108a ? (byte) 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public DrawSoundLevelsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawSoundLevelsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C47266f.m84076a(context, C118697a.class);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C118700c.f331110a, i, 0);
        this.f331104e = obtainStyledAttributes.getColor(1, context.getResources().getColor(R.color.ime_semi_transparent_background));
        this.f331106g = obtainStyledAttributes.getColor(0, -1);
        this.f331107h = obtainStyledAttributes.getColor(3, -1);
        this.f331101b = BitmapFactory.decodeResource(getResources(), obtainStyledAttributes.getResourceId(2, R.drawable.ime_btn_off)).getWidth();
        obtainStyledAttributes.recycle();
        C90758bb bbVar = new C90758bb();
        this.f331102c = bbVar;
        bbVar.mo85096c(0);
        TimeAnimator timeAnimator = new TimeAnimator();
        this.f331105f = timeAnimator;
        timeAnimator.setRepeatCount(-1);
        this.f331105f.setDuration(1000);
        this.f331105f.setTimeListener(new C118698a(this));
        Paint paint = new Paint(1);
        this.f331103d = paint;
        paint.setColor(this.f331107h);
        m197031a();
    }
}
