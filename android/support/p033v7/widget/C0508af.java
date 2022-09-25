package android.support.p033v7.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.p097i.C1969d;
import androidx.core.p098j.C2012af;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2090e;
import androidx.core.p098j.C2091f;
import androidx.core.p098j.C2092g;
import androidx.core.p098j.C2096k;
import androidx.core.p098j.p101c.C2063b;
import androidx.core.p098j.p101c.C2064c;
import androidx.core.widget.C2113aa;
import androidx.core.widget.C2139z;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.af */
/* compiled from: PG */
public class C0508af extends EditText implements C2012af {

    /* renamed from: a */
    private final C0779y f2048a;

    /* renamed from: b */
    private final C0543bm f2049b;

    /* renamed from: c */
    private final C2113aa f2050c;

    /* renamed from: d */
    private final C0509ag f2051d;

    /* renamed from: e */
    private C0507ae f2052e;

    public C0508af(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private final C0507ae mo91146b() {
        if (this.f2052e == null) {
            this.f2052e = new C0507ae(this);
        }
        return this.f2052e;
    }

    /* renamed from: a */
    public final C2096k mo2480a(C2096k kVar) {
        return this.f2050c.mo5174a(this, kVar);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0779y yVar = this.f2048a;
        if (yVar != null) {
            yVar.mo3306c();
        }
        C0543bm bmVar = this.f2049b;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        C2139z.m5937b(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    public final TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] aD;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0543bm.m1987e(this, onCreateInputConnection, editorInfo);
        C0511ai.m1907a(onCreateInputConnection, editorInfo, this);
        if (!(onCreateInputConnection == null || Build.VERSION.SDK_INT > 30 || (aD = C2043bi.m5537aD(this)) == null)) {
            editorInfo.contentMimeTypes = aD;
            C2063b bVar = new C2063b(this);
            C1969d.m5306a(editorInfo, "editorInfo must be non-null");
            onCreateInputConnection = new C2064c(onCreateInputConnection, bVar);
        }
        return this.f2051d.f2053a.mo5622a(onCreateInputConnection);
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && C2043bi.m5537aD(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                new StringBuilder("Can't handle drop: no activity: view=").append(this);
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=".concat(toString()));
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                C0518ap.m1919a(dragEvent, this, activity);
                return true;
            }
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        ClipData clipData;
        C2091f fVar;
        if (Build.VERSION.SDK_INT < 31 && C2043bi.m5537aD(this) != null) {
            if (i != 16908322) {
                if (i == 16908337) {
                    i = 16908337;
                }
            }
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                clipData = null;
            } else {
                clipData = clipboardManager.getPrimaryClip();
            }
            if (clipData != null && clipData.getItemCount() > 0) {
                if (Build.VERSION.SDK_INT >= 31) {
                    fVar = new C2090e(clipData, 1);
                } else {
                    fVar = new C2092g(clipData, 1);
                }
                fVar.mo5260c(i == 16908322 ? 0 : 1);
                C2043bi.m5592u(this, fVar.mo5258a());
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0779y yVar = this.f2048a;
        if (yVar != null) {
            yVar.mo3312i();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0779y yVar = this.f2048a;
        if (yVar != null) {
            yVar.mo3308e(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0543bm bmVar = this.f2049b;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0543bm bmVar = this.f2049b;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(C0509ag.m1904c(keyListener));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0543bm bmVar = this.f2049b;
        if (bmVar != null) {
            bmVar.mo2571c(context, i);
        }
    }

    public final void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public C0508af(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0508af(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0732im.m2470a(context);
        C0730ik.m2467d(this, getContext());
        C0779y yVar = new C0779y(this);
        this.f2048a = yVar;
        yVar.mo3307d(attributeSet, i);
        C0543bm bmVar = new C0543bm(this);
        this.f2049b = bmVar;
        bmVar.mo2570b(attributeSet, i);
        bmVar.mo2569a();
        this.f2050c = new C2113aa();
        C0509ag agVar = new C0509ag(this);
        this.f2051d = agVar;
        agVar.mo2495a(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (C0509ag.m1903b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener c = C0509ag.m1904c(keyListener);
            if (c != keyListener) {
                super.setKeyListener(c);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }
}
