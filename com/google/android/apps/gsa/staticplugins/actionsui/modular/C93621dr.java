package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.widget.EditText;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.dr */
/* compiled from: PG */
final class C93621dr extends C93631ea {

    /* renamed from: a */
    final /* synthetic */ StringArgumentView f261357a;

    public C93621dr(StringArgumentView stringArgumentView) {
        this.f261357a = stringArgumentView;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo87963b(Argument argument) {
        StringArgument stringArgument = (StringArgument) argument;
        StringArgumentView stringArgumentView = this.f261357a;
        stringArgumentView.f261105c = true;
        EditText editText = stringArgumentView.f261103a;
        editText.setSelection(editText.length());
        this.f261357a.mo87732f();
        this.f261357a.f261103a.requestFocus();
    }
}
