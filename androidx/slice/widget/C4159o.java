package androidx.slice.widget;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: androidx.slice.widget.o */
/* compiled from: PG */
final class C4159o implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ RemoteInputView f13388a;

    public C4159o(RemoteInputView remoteInputView) {
        this.f13388a = remoteInputView;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int keyCode;
        boolean z = keyEvent == null && (i == 6 || i == 5 || i == 4);
        boolean z2 = keyEvent != null && ((keyCode = keyEvent.getKeyCode()) == 23 || keyCode == 62 || keyCode == 66 || keyCode == 160) && keyEvent.getAction() == 0;
        if (!z && !z2) {
            return false;
        }
        if (this.f13388a.f13185a.length() <= 0) {
            return true;
        }
        new Bundle();
        throw null;
    }
}
