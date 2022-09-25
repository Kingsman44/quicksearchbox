package androidx.emoji.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.p097i.C1974i;
import androidx.emoji.C2190a;

/* compiled from: PG */
public class EmojiExtractEditText extends ExtractEditText {

    /* renamed from: a */
    private C2219c f6269a;

    /* renamed from: b */
    private boolean f6270b;

    public EmojiExtractEditText(Context context) {
        super(context);
        m6110b((AttributeSet) null, 0, 0);
    }

    /* renamed from: a */
    private final C2219c m6109a() {
        if (this.f6269a == null) {
            this.f6269a = new C2219c(this);
        }
        return this.f6269a;
    }

    /* renamed from: b */
    private final void m6110b(AttributeSet attributeSet, int i, int i2) {
        if (!this.f6270b) {
            this.f6270b = true;
            int i3 = 0;
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2190a.f6211a, i, i2);
                i3 = obtainStyledAttributes.getInteger(0, Integer.MAX_VALUE);
                obtainStyledAttributes.recycle();
            }
            C2219c a = m6109a();
            C1974i.m5318f(i3, "maxEmojiCount should be greater than 0");
            ((C2217a) a.f6273a).f6272b.f6280a = i3;
            setKeyListener(super.getKeyListener());
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return m6109a().mo5535a(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    public final void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            keyListener = m6109a().f6273a.mo5534a(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6110b(attributeSet, 16842862, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6110b(attributeSet, i, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m6110b(attributeSet, i, i2);
    }
}
