package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C1882h;
import androidx.core.p098j.C2043bi;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p245f.C4948e;
import com.airbnb.lottie.p245f.C4954k;
import com.airbnb.lottie.p246g.C4958c;
import com.airbnb.lottie.p246g.C4960e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.p1708c.p1711c.C20755e;
import java.io.ByteArrayInputStream;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: a */
    public static final C4827ae f15135a = new C4841c();

    /* renamed from: b */
    public C4827ae f15136b;

    /* renamed from: c */
    public int f15137c = 0;

    /* renamed from: d */
    public final C4825ac f15138d = new C4825ac();

    /* renamed from: e */
    public boolean f15139e = true;

    /* renamed from: f */
    public final Set f15140f = new HashSet();

    /* renamed from: g */
    public C4964k f15141g;

    /* renamed from: h */
    private final C4827ae f15142h = new C4895d(this);

    /* renamed from: i */
    private final C4827ae f15143i = new C4902e(this);

    /* renamed from: j */
    private boolean f15144j;

    /* renamed from: k */
    private String f15145k;

    /* renamed from: l */
    private int f15146l;

    /* renamed from: m */
    private boolean f15147m = false;

    /* renamed from: n */
    private boolean f15148n = false;

    /* renamed from: o */
    private boolean f15149o = false;

    /* renamed from: p */
    private boolean f15150p = false;

    /* renamed from: q */
    private boolean f15151q = false;

    /* renamed from: r */
    private int f15152r = 0;

    /* renamed from: s */
    private C4833ak f15153s;

    /* renamed from: t */
    private int f15154t = 1;

    public LottieAnimationView(Context context) {
        super(context);
        m13292r((AttributeSet) null, R.attr.lottieAnimationViewStyle);
    }

    /* renamed from: p */
    private final void m13290p() {
        C4833ak akVar = this.f15153s;
        if (akVar != null) {
            akVar.mo9795g(this.f15142h);
            this.f15153s.mo9794f(this.f15143i);
        }
    }

    /* renamed from: r */
    private final void m13292r(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C4835am.f15405a, i, 0);
        this.f15139e = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(10);
        boolean hasValue2 = obtainStyledAttributes.hasValue(5);
        boolean hasValue3 = obtainStyledAttributes.hasValue(16);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(10, 0);
                if (resourceId != 0) {
                    mo9698i(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(5);
                if (string2 != null) {
                    mo9700j(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(16)) != null) {
                mo9702l(string);
            }
            this.f15137c = obtainStyledAttributes.getResourceId(4, 0);
            if (obtainStyledAttributes.getBoolean(0, false)) {
                this.f15149o = true;
                this.f15151q = true;
            }
            if (obtainStyledAttributes.getBoolean(8, false)) {
                this.f15138d.f15342b.setRepeatCount(-1);
            }
            if (obtainStyledAttributes.hasValue(13)) {
                this.f15138d.f15342b.setRepeatMode(obtainStyledAttributes.getInt(13, 1));
            }
            if (obtainStyledAttributes.hasValue(12)) {
                this.f15138d.f15342b.setRepeatCount(obtainStyledAttributes.getInt(12, -1));
            }
            if (obtainStyledAttributes.hasValue(15)) {
                this.f15138d.f15342b.f15712b = obtainStyledAttributes.getFloat(15, 1.0f);
            }
            this.f15138d.f15348h = obtainStyledAttributes.getString(7);
            this.f15138d.mo9773j(obtainStyledAttributes.getFloat(9, 0.0f));
            boolean z2 = obtainStyledAttributes.getBoolean(3, false);
            C4825ac acVar = this.f15138d;
            if (acVar.f15350j != z2) {
                acVar.f15350j = z2;
                if (acVar.f15341a != null) {
                    acVar.mo9757b();
                }
            }
            if (obtainStyledAttributes.hasValue(2)) {
                C4837ao aoVar = new C4837ao(C1882h.m5138d(getContext(), obtainStyledAttributes.getResourceId(2, -1)).getDefaultColor());
                C4890e eVar = new C4890e("**");
                C4958c cVar = new C4958c(aoVar);
                this.f15138d.mo9756a(eVar, C4829ag.f15366E, cVar);
            }
            if (obtainStyledAttributes.hasValue(14)) {
                this.f15138d.f15343c = obtainStyledAttributes.getFloat(14, 1.0f);
            }
            if (obtainStyledAttributes.hasValue(11)) {
                int i2 = obtainStyledAttributes.getInt(11, 0);
                C4836an.m13492a();
                if (i2 >= 3) {
                    i2 = 0;
                }
                this.f15154t = C4836an.m13492a()[i2];
                m13291q();
            }
            this.f15138d.f15345e = obtainStyledAttributes.getBoolean(6, false);
            obtainStyledAttributes.recycle();
            C4825ac acVar2 = this.f15138d;
            if (C4954k.m13719b(getContext()) != 0.0f) {
                z = true;
            }
            acVar2.f15344d = Boolean.valueOf(z).booleanValue();
            m13291q();
            this.f15144j = true;
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    /* renamed from: s */
    private final void m13293s() {
        boolean k = this.f15138d.mo9774k();
        m13290p();
        super.setImageDrawable((Drawable) null);
        C4825ac acVar = this.f15138d;
        m13290p();
        super.setImageDrawable(acVar);
        if (k) {
            this.f15138d.mo9762f();
        }
    }

    /* renamed from: a */
    public void mo9689a(Animator.AnimatorListener animatorListener) {
        this.f15138d.f15342b.addListener(animatorListener);
    }

    /* renamed from: b */
    public final void mo9690b(C4890e eVar, Object obj, C4960e eVar2) {
        this.f15138d.mo9756a(eVar, obj, new C4961h(eVar2));
    }

    public final void buildDrawingCache(boolean z) {
        this.f15152r++;
        super.buildDrawingCache(z);
        if (this.f15152r == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            this.f15154t = 2;
            m13291q();
        }
        this.f15152r--;
        C4838b.m13493a();
    }

    /* renamed from: c */
    public final void mo9692c() {
        this.f15149o = false;
        this.f15148n = false;
        this.f15147m = false;
        C4825ac acVar = this.f15138d;
        acVar.f15346f.clear();
        C4948e eVar = acVar.f15342b;
        eVar.mo9860a();
        eVar.mo9883i(true);
        m13291q();
    }

    @Deprecated
    /* renamed from: d */
    public final void mo9693d(boolean z) {
        this.f15138d.f15342b.setRepeatCount(true != z ? 0 : -1);
    }

    /* renamed from: e */
    public final void mo9694e() {
        this.f15151q = false;
        this.f15149o = false;
        this.f15148n = false;
        this.f15147m = false;
        this.f15138d.mo9759d();
        m13291q();
    }

    /* renamed from: f */
    public final void mo9695f() {
        if (isShown()) {
            this.f15138d.mo9761e();
            m13291q();
            return;
        }
        this.f15147m = true;
    }

    /* renamed from: g */
    public void mo9696g(Animator.AnimatorListener animatorListener) {
        this.f15138d.f15342b.removeListener(animatorListener);
    }

    /* renamed from: h */
    public final void mo9697h() {
        if (isShown()) {
            this.f15138d.mo9762f();
            m13291q();
            return;
        }
        this.f15147m = false;
        this.f15148n = true;
    }

    /* renamed from: i */
    public final void mo9698i(int i) {
        C4833ak akVar;
        this.f15146l = i;
        this.f15145k = null;
        if (isInEditMode()) {
            akVar = new C4833ak(new C4943f(this, i), true);
        } else if (this.f15139e) {
            Context context = getContext();
            akVar = C4972s.m13751i(context, i, C4972s.m13754l(context, i));
        } else {
            akVar = C4972s.m13751i(getContext(), i, (String) null);
        }
        mo9704n(akVar);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C4825ac acVar = this.f15138d;
        if (drawable2 == acVar) {
            super.invalidateDrawable(acVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* renamed from: j */
    public final void mo9700j(String str) {
        C4833ak akVar;
        this.f15145k = str;
        this.f15146l = 0;
        if (isInEditMode()) {
            akVar = new C4833ak(new C4955g(this, str), true);
        } else {
            akVar = this.f15139e ? C4972s.m13748f(getContext(), str) : C4972s.m13749g(getContext(), str, (String) null);
        }
        mo9704n(akVar);
    }

    /* renamed from: k */
    public final void mo9701k(String str, String str2) {
        mo9704n(C4972s.m13750h(new ByteArrayInputStream(str.getBytes()), str2));
    }

    /* renamed from: l */
    public final void mo9702l(String str) {
        mo9704n(this.f15139e ? C4972s.m13752j(getContext(), str) : C4972s.m13753k(getContext(), str, (String) null));
    }

    /* renamed from: m */
    public final void mo9703m(C4964k kVar) {
        this.f15138d.setCallback(this);
        this.f15141g = kVar;
        this.f15150p = true;
        boolean l = this.f15138d.mo9775l(kVar);
        this.f15150p = false;
        m13291q();
        if (getDrawable() == this.f15138d) {
            if (!l) {
                return;
            }
        } else if (!l) {
            m13293s();
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        for (C20755e eVar : this.f15140f) {
            eVar.f58089a.x = (float) kVar.f15759h.width();
        }
    }

    /* renamed from: n */
    public final void mo9704n(C4833ak akVar) {
        this.f15141g = null;
        this.f15138d.mo9758c();
        m13290p();
        akVar.mo9793e(this.f15142h);
        akVar.mo9792d(this.f15143i);
        this.f15153s = akVar;
    }

    /* renamed from: o */
    public final void mo9705o(float f) {
        this.f15138d.f15343c = f;
        if (getDrawable() == this.f15138d) {
            m13293s();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        if (this.f15151q || this.f15149o) {
            mo9695f();
            this.f15151q = false;
            this.f15149o = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (this.f15138d.mo9774k()) {
            mo9692c();
            this.f15149o = true;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f15155a;
        this.f15145k = str;
        if (!TextUtils.isEmpty(str)) {
            mo9700j(this.f15145k);
        }
        int i = savedState.f15156b;
        this.f15146l = i;
        if (i != 0) {
            mo9698i(i);
        }
        this.f15138d.mo9773j(savedState.f15157c);
        if (savedState.f15158d) {
            mo9695f();
        }
        C4825ac acVar = this.f15138d;
        acVar.f15348h = savedState.f15159e;
        acVar.f15342b.setRepeatMode(savedState.f15160f);
        this.f15138d.f15342b.setRepeatCount(savedState.f15161g);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f15155a = this.f15145k;
        savedState.f15156b = this.f15146l;
        savedState.f15157c = this.f15138d.f15342b.mo9874d();
        boolean z = true;
        if (!this.f15138d.mo9774k() && (C2043bi.m5569aw(this) || !this.f15149o)) {
            z = false;
        }
        savedState.f15158d = z;
        C4825ac acVar = this.f15138d;
        savedState.f15159e = acVar.f15348h;
        savedState.f15160f = acVar.f15342b.getRepeatMode();
        savedState.f15161g = this.f15138d.f15342b.getRepeatCount();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        if (this.f15144j) {
            if (isShown()) {
                if (this.f15148n) {
                    mo9697h();
                } else if (this.f15147m) {
                    mo9695f();
                }
                this.f15148n = false;
                this.f15147m = false;
            } else if (this.f15138d.mo9774k()) {
                mo9694e();
                this.f15148n = true;
            }
        }
    }

    public final void setImageBitmap(Bitmap bitmap) {
        m13290p();
        super.setImageBitmap(bitmap);
    }

    public final void setImageDrawable(Drawable drawable) {
        m13290p();
        super.setImageDrawable(drawable);
    }

    public final void setImageResource(int i) {
        m13290p();
        super.setImageResource(i);
    }

    public final void unscheduleDrawable(Drawable drawable) {
        C4825ac acVar;
        if (!this.f15150p && drawable == (acVar = this.f15138d) && acVar.mo9774k()) {
            mo9694e();
        } else if (!this.f15150p && (drawable instanceof C4825ac)) {
            C4825ac acVar2 = (C4825ac) drawable;
            if (acVar2.mo9774k()) {
                acVar2.mo9759d();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    /* renamed from: q */
    private final void m13291q() {
        C4964k kVar;
        int i = this.f15154t;
        int i2 = i - 1;
        if (i != 0) {
            int i3 = 2;
            if (i2 == 0 ? !((kVar = this.f15141g) == null || kVar.f15763l <= 4) : i2 != 1) {
                i3 = 1;
            }
            if (i3 != getLayerType()) {
                setLayerType(i3, (Paint) null);
                return;
            }
            return;
        }
        throw null;
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13292r(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    /* compiled from: PG */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C4962i();

        /* renamed from: a */
        String f15155a;

        /* renamed from: b */
        int f15156b;

        /* renamed from: c */
        float f15157c;

        /* renamed from: d */
        boolean f15158d;

        /* renamed from: e */
        String f15159e;

        /* renamed from: f */
        int f15160f;

        /* renamed from: g */
        int f15161g;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f15155a = parcel.readString();
            this.f15157c = parcel.readFloat();
            this.f15158d = parcel.readInt() != 1 ? false : true;
            this.f15159e = parcel.readString();
            this.f15160f = parcel.readInt();
            this.f15161g = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f15155a);
            parcel.writeFloat(this.f15157c);
            parcel.writeInt(this.f15158d ? 1 : 0);
            parcel.writeString(this.f15159e);
            parcel.writeInt(this.f15160f);
            parcel.writeInt(this.f15161g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13292r(attributeSet, i);
    }
}
