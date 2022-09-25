package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.c.i */
/* compiled from: PG */
public final class C11321i extends C0673gh implements View.OnClickListener {

    /* renamed from: a */
    public final TextView f36787a;

    /* renamed from: b */
    public final ImageComponent f36788b;

    /* renamed from: c */
    final /* synthetic */ C11322j f36789c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11321i(C11322j jVar, View view) {
        super(view);
        this.f36789c = jVar;
        this.f36787a = (TextView) view.findViewById(R.id.title);
        this.f36788b = (ImageComponent) view.findViewById(R.id.icon);
        view.setOnClickListener(this);
    }

    public final void onClick(View view) {
        int bindingAdapterPosition = getBindingAdapterPosition();
        C11322j jVar = this.f36789c;
        jVar.f36791b.f36794b.mo19758a((C51027dr) jVar.f36790a.get(bindingAdapterPosition), bindingAdapterPosition);
        this.f36789c.f36791b.dismiss();
    }
}
