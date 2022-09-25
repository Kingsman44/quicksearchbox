package androidx.slice.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class RemoteInputView extends LinearLayout implements View.OnClickListener, TextWatcher {

    /* renamed from: a */
    RemoteEditText f13185a;

    /* renamed from: b */
    private ImageButton f13186b;

    /* compiled from: PG */
    public class RemoteEditText extends EditText {

        /* renamed from: a */
        RemoteInputView f13187a;

        public RemoteEditText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            getBackground();
        }

        /* renamed from: b */
        private final void m11814b() {
            if (this.f13187a != null || isTemporarilyDetached()) {
                isTemporarilyDetached();
            } else if (isFocusable() && isEnabled()) {
                mo8660a();
                RemoteInputView remoteInputView = this.f13187a;
                if (remoteInputView != null) {
                    remoteInputView.setVisibility(4);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo8660a() {
            setFocusableInTouchMode(false);
            setFocusable(false);
            setCursorVisible(false);
            setBackground((Drawable) null);
        }

        public final void getFocusedRect(Rect rect) {
            super.getFocusedRect(rect);
            rect.top = getScrollY();
            rect.bottom = getScrollY() + (getBottom() - getTop());
        }

        public final void onCommitCompletion(CompletionInfo completionInfo) {
            clearComposingText();
            setText(completionInfo.getText());
            setSelection(getText().length());
        }

        /* access modifiers changed from: protected */
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            if (!z) {
                m11814b();
            }
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i == 4) {
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }

        public final boolean onKeyUp(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return super.onKeyUp(i, keyEvent);
            }
            m11814b();
            return true;
        }

        /* access modifiers changed from: protected */
        public final void onVisibilityChanged(View view, int i) {
            super.onVisibilityChanged(view, i);
            if (!isShown()) {
                m11814b();
            }
        }
    }

    public RemoteInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void afterTextChanged(Editable editable) {
        this.f13186b.setEnabled(this.f13185a.getText().length() != 0);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void dispatchFinishTemporaryDetach() {
        if (isAttachedToWindow()) {
            RemoteEditText remoteEditText = this.f13185a;
            attachViewToParent(remoteEditText, 0, remoteEditText.getLayoutParams());
        } else {
            removeDetachedView(this.f13185a, false);
        }
        super.dispatchFinishTemporaryDetach();
    }

    public final void dispatchStartTemporaryDetach() {
        super.dispatchStartTemporaryDetach();
        detachViewFromParent(this.f13185a);
    }

    public final void onClick(View view) {
        if (view == this.f13186b) {
            new Bundle();
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.remote_input_progress);
        ImageButton imageButton = (ImageButton) findViewById(R.id.remote_input_send);
        this.f13186b = imageButton;
        imageButton.setOnClickListener(this);
        RemoteEditText remoteEditText = (RemoteEditText) getChildAt(0);
        this.f13185a = remoteEditText;
        remoteEditText.setOnEditorActionListener(new C4159o(this));
        this.f13185a.addTextChangedListener(this);
        this.f13185a.mo8660a();
        this.f13185a.f13187a = this;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
}
