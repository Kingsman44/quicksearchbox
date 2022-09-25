package com.facebook.litho.widget;

import android.content.Context;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji.widget.C2219c;

/* renamed from: com.facebook.litho.widget.dy */
/* compiled from: PG */
final class C6520dy extends C6519dx {

    /* renamed from: j */
    private C2219c f19404j;

    /* renamed from: k */
    private boolean f19405k;

    public C6520dy(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2219c mo13609a() {
        if (this.f19404j == null) {
            this.f19404j = new C2219c(this);
        }
        return this.f19404j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13610b() {
        if (!this.f19405k) {
            this.f19405k = true;
            setKeyListener(super.getKeyListener());
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        return this.f19405k ? mo13609a().mo5535a(onCreateInputConnection, editorInfo) : onCreateInputConnection;
    }

    public final void setKeyListener(KeyListener keyListener) {
        if (this.f19405k && keyListener != null) {
            keyListener = mo13609a().f6273a.mo5534a(keyListener);
        }
        super.setKeyListener(keyListener);
    }
}
