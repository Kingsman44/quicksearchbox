package com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C1877c;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83996h;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.checkableflip.CheckableFlipComponent */
/* compiled from: PG */
public class CheckableFlipComponent extends AppCompatImageButton {

    /* renamed from: a */
    public Drawable f228787a;

    /* renamed from: b */
    public boolean f228788b;

    /* renamed from: c */
    public C84004c f228789c;

    /* renamed from: d */
    public boolean f228790d;

    /* renamed from: e */
    public int f228791e;

    /* renamed from: f */
    public boolean f228792f;

    /* renamed from: g */
    public C83996h f228793g;

    /* renamed from: h */
    private Drawable f228794h;

    /* renamed from: i */
    private int f228795i;

    /* renamed from: j */
    private float f228796j;

    /* renamed from: k */
    private int f228797k;

    /* renamed from: l */
    private float f228798l;

    /* renamed from: m */
    private int f228799m;

    public CheckableFlipComponent(Context context) {
        super(context);
        m133851c(context, (AttributeSet) null, 0);
    }

    /* renamed from: c */
    private final void m133851c(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C84008g.f228854a, i, 0);
            try {
                this.f228799m = obtainStyledAttributes.getDimensionPixelSize(3, 100);
                Drawable drawable = obtainStyledAttributes.getDrawable(8);
                this.f228787a = drawable;
                if (drawable == null) {
                    this.f228787a = C1877c.m5125a(context, R.drawable.transparent_200);
                }
                this.f228790d = obtainStyledAttributes.getBoolean(6, false);
                this.f228791e = obtainStyledAttributes.getColor(5, C1878d.m5128a(getContext(), R.color.quantum_grey500));
                this.f228798l = obtainStyledAttributes.getFloat(7, 1.0f);
                Drawable drawable2 = obtainStyledAttributes.getDrawable(2);
                this.f228794h = drawable2;
                if (drawable2 == null) {
                    this.f228794h = C1877c.m5125a(context, R.drawable.transparent_200);
                }
                this.f228795i = obtainStyledAttributes.getColor(0, C1878d.m5128a(getContext(), R.color.google_blue500));
                this.f228796j = obtainStyledAttributes.getFloat(1, 1.0f);
                this.f228797k = obtainStyledAttributes.getInt(4, 350);
                mo77428b();
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: a */
    public final void mo77427a(boolean z) {
        C84004c cVar = this.f228789c;
        if (cVar.f228852f == z) {
            cVar.mo77452a();
        }
        this.f228788b = z;
    }

    /* renamed from: b */
    public final void mo77428b() {
        C84005d dVar;
        if (this.f228790d) {
            Drawable drawable = this.f228787a;
            int i = this.f228791e;
            float f = this.f228798l;
            C84005d dVar2 = new C84005d(i, drawable);
            dVar2.mo77455a(1.0f);
            dVar2.mo77456b(f);
            dVar = dVar2;
        } else {
            dVar = this.f228787a;
        }
        C84004c cVar = new C84004c(dVar, this.f228794h, this.f228795i, this.f228796j, this.f228797k);
        this.f228789c = cVar;
        setImageDrawable(cVar);
        super.setOnClickListener(new C83988a(this));
        mo77427a(this.f228788b);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f228799m, View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(this.f228799m, View.MeasureSpec.getMode(i2)));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        Bitmap bitmap = savedState.f228801b;
        Bitmap bitmap2 = savedState.f228802c;
        this.f228787a = new BitmapDrawable(getResources(), bitmap);
        this.f228794h = new BitmapDrawable(getResources(), bitmap2);
        boolean z = savedState.f228800a;
        this.f228788b = z;
        mo77427a(z);
        this.f228798l = savedState.f228803d;
        this.f228796j = savedState.f228804e;
        this.f228790d = savedState.f228805f;
        this.f228791e = savedState.f228806g;
        this.f228795i = savedState.f228807h;
        this.f228797k = savedState.f228808i;
        mo77428b();
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f228800a = this.f228788b;
        Bitmap b = C90772bp.m148294b(this.f228787a);
        b.getClass();
        savedState.f228801b = b;
        Bitmap b2 = C90772bp.m148294b(this.f228794h);
        b2.getClass();
        savedState.f228802c = b2;
        savedState.f228803d = this.f228798l;
        savedState.f228804e = this.f228796j;
        savedState.f228805f = this.f228790d;
        savedState.f228806g = this.f228791e;
        savedState.f228807h = this.f228795i;
        savedState.f228808i = this.f228797k;
        return savedState;
    }

    public CheckableFlipComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkableFlipComponentStyle);
        m133851c(context, attributeSet, R.attr.checkableFlipComponentStyle);
    }

    public CheckableFlipComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m133851c(context, attributeSet, i);
    }

    /* renamed from: com.google.android.apps.gsa.opaonboarding.ui.checkableflip.CheckableFlipComponent$SavedState */
    /* compiled from: PG */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C84003b();

        /* renamed from: a */
        boolean f228800a;

        /* renamed from: b */
        Bitmap f228801b;

        /* renamed from: c */
        Bitmap f228802c;

        /* renamed from: d */
        float f228803d;

        /* renamed from: e */
        float f228804e;

        /* renamed from: f */
        boolean f228805f;

        /* renamed from: g */
        int f228806g;

        /* renamed from: h */
        int f228807h;

        /* renamed from: i */
        int f228808i;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f228801b = (Bitmap) parcel.readParcelable(CheckableFlipComponent.class.getClassLoader());
            this.f228802c = (Bitmap) parcel.readParcelable(CheckableFlipComponent.class.getClassLoader());
            this.f228803d = parcel.readFloat();
            this.f228804e = parcel.readFloat();
            boolean z = true;
            this.f228805f = parcel.readInt() != 0;
            this.f228806g = parcel.readInt();
            this.f228807h = parcel.readInt();
            this.f228808i = parcel.readInt();
            this.f228800a = parcel.readInt() == 0 ? false : z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f228801b, i);
            parcel.writeParcelable(this.f228802c, i);
            parcel.writeFloat(this.f228803d);
            parcel.writeFloat(this.f228804e);
            parcel.writeInt(this.f228805f ? 1 : 0);
            parcel.writeInt(this.f228806g);
            parcel.writeInt(this.f228807h);
            parcel.writeInt(this.f228808i);
            parcel.writeInt(this.f228800a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
