package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.C1943i;
import androidx.core.p096h.C1954g;
import androidx.core.p096h.C1955h;
import androidx.core.widget.C2134u;
import androidx.core.widget.C2135v;
import androidx.core.widget.C2137x;
import androidx.core.widget.C2139z;
import androidx.p111g.p112a.C2253a;
import androidx.p111g.p113b.C2266i;
import androidx.p111g.p113b.C2267j;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: android.support.v7.widget.AppCompatTextView */
/* compiled from: PG */
public class AppCompatTextView extends TextView {
    private final C0779y mBackgroundTintHelper;
    private C0510ah mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future mPrecomputedTextFuture;
    private C0544bn mSuperCaller;
    private final C0536bf mTextClassifierHelper;
    private final C0543bm mTextHelper;

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                C1955h hVar = (C1955h) future.get();
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private C0510ah getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C0510ah(this);
        }
        return this.mEmojiTextViewHelper;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0779y yVar = this.mBackgroundTintHelper;
        if (yVar != null) {
            yVar.mo3306c();
        }
        C0543bm bmVar = this.mTextHelper;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        Method method = C0763jq.f2653a;
        return getSuperCaller().mo2573a();
    }

    public int getAutoSizeMinTextSize() {
        Method method = C0763jq.f2653a;
        return getSuperCaller().mo2574b();
    }

    public int getAutoSizeStepGranularity() {
        Method method = C0763jq.f2653a;
        return getSuperCaller().mo2575c();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        Method method = C0763jq.f2653a;
        return getSuperCaller().mo2584l();
    }

    public int getAutoSizeTextType() {
        Method method = C0763jq.f2653a;
        return getSuperCaller().mo2576d() == 1 ? 1 : 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        C2139z.m5937b(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public C0544bn getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new C0546bp(this);
        }
        return this.mSuperCaller;
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0733in inVar = this.mTextHelper.f2113a;
        if (inVar != null) {
            return inVar.f2591a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0733in inVar = this.mTextHelper.f2113a;
        if (inVar != null) {
            return inVar.f2592b;
        }
        return null;
    }

    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        return getSuperCaller().mo2577e();
    }

    public C1954g getTextMetricsParamsCompat() {
        return new C1954g(C2137x.m5933a(this));
    }

    public boolean isEmojiCompatEnabled() {
        return ((C2266i) getEmojiTextViewHelper().f2055a.f6359a).f6358a.f6357a;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0543bm.m1987e(this, onCreateInputConnection, editorInfo);
        C0511ai.m1907a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.mTextHelper != null) {
            Method method = C0763jq.f2653a;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mTextHelper != null) {
            Method method = C0763jq.f2653a;
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        C2267j jVar = getEmojiTextViewHelper().f2055a;
        C2253a aVar = C2253a.f6344b;
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        Method method = C0763jq.f2653a;
        getSuperCaller().mo2578f(i, i2, i3, i4);
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        Method method = C0763jq.f2653a;
        getSuperCaller().mo2579g(iArr, i);
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        Method method = C0763jq.f2653a;
        getSuperCaller().mo2580h(i);
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

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0543bm bmVar = this.mTextHelper;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0543bm bmVar = this.mTextHelper;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i != 0 ? C0678gm.m2375e().mo3100c(context, i) : null;
        Drawable c2 = i2 != 0 ? C0678gm.m2375e().mo3100c(context, i2) : null;
        Drawable c3 = i3 != 0 ? C0678gm.m2375e().mo3100c(context, i3) : null;
        if (i4 != 0) {
            drawable = C0678gm.m2375e().mo3100c(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(c, c2, c3, drawable);
        C0543bm bmVar = this.mTextHelper;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i != 0 ? C0678gm.m2375e().mo3100c(context, i) : null;
        Drawable c2 = i2 != 0 ? C0678gm.m2375e().mo3100c(context, i2) : null;
        Drawable c3 = i3 != 0 ? C0678gm.m2375e().mo3100c(context, i3) : null;
        if (i4 != 0) {
            drawable = C0678gm.m2375e().mo3100c(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(c, c2, c3, drawable);
        C0543bm bmVar = this.mTextHelper;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().f2055a.f6359a.mo5631a(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        C2267j jVar = getEmojiTextViewHelper().f2055a;
        C2253a aVar = C2253a.f6344b;
        super.setFilters(inputFilterArr);
    }

    public void setFirstBaselineToTopHeight(int i) {
        getSuperCaller().mo2581i(i);
    }

    public void setLastBaselineToBottomHeight(int i) {
        getSuperCaller().mo2582j(i);
    }

    public void setLineHeight(int i) {
        C2139z.m5936a(this, i);
    }

    public void setPrecomputedText(C1955h hVar) {
        throw null;
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0543bm bmVar = this.mTextHelper;
        if (bmVar.f2113a == null) {
            bmVar.f2113a = new C0733in();
        }
        C0733in inVar = bmVar.f2113a;
        inVar.f2591a = colorStateList;
        inVar.f2594d = colorStateList != null;
        bmVar.mo2572d();
        this.mTextHelper.mo2569a();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0543bm bmVar = this.mTextHelper;
        if (bmVar.f2113a == null) {
            bmVar.f2113a = new C0733in();
        }
        C0733in inVar = bmVar.f2113a;
        inVar.f2592b = mode;
        inVar.f2593c = mode != null;
        bmVar.mo2572d();
        this.mTextHelper.mo2569a();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0543bm bmVar = this.mTextHelper;
        if (bmVar != null) {
            bmVar.mo2571c(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        getSuperCaller().mo2583k(textClassifier);
    }

    public void setTextFuture(Future future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C1954g gVar) {
        TextDirectionHeuristic textDirectionHeuristic = gVar.f5871b;
        int i = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
        }
        C2134u.m5915g(this, i);
        getPaint().set(gVar.f5870a);
        C2135v.m5921e(this, gVar.f5872c);
        C2135v.m5924h(this, gVar.f5873d);
    }

    public void setTextSize(int i, float f) {
        Method method = C0763jq.f2653a;
        super.setTextSize(i, f);
    }

    public void setTypeface(Typeface typeface, int i) {
        if (!this.mIsSetTypefaceProcessing) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                typeface2 = C1943i.m5259a(getContext(), typeface, i);
            }
            this.mIsSetTypefaceProcessing = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.mIsSetTypefaceProcessing = false;
            }
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0732im.m2470a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        C0730ik.m2467d(this, getContext());
        C0779y yVar = new C0779y(this);
        this.mBackgroundTintHelper = yVar;
        yVar.mo3307d(attributeSet, i);
        C0543bm bmVar = new C0543bm(this);
        this.mTextHelper = bmVar;
        bmVar.mo2570b(attributeSet, i);
        bmVar.mo2569a();
        this.mTextClassifierHelper = new C0536bf();
        getEmojiTextViewHelper().mo2496a(attributeSet, i);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0543bm bmVar = this.mTextHelper;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0543bm bmVar = this.mTextHelper;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }
}
