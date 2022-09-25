package com.google.android.apps.gsa.assistant.shared.appactions.p5804c;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.textfield.TextInputEditText;

/* renamed from: com.google.android.apps.gsa.assistant.shared.appactions.c.b */
/* compiled from: PG */
public final /* synthetic */ class C73807b implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ j f195107a;

    /* renamed from: b */
    public final /* synthetic */ View.OnClickListener f195108b;

    /* renamed from: c */
    public final /* synthetic */ View.OnClickListener f195109c;

    public /* synthetic */ C73807b(j jVar, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        this.f195107a = jVar;
        this.f195108b = onClickListener;
        this.f195109c = onClickListener2;
    }

    public final void onShow(DialogInterface dialogInterface) {
        j jVar = this.f195107a;
        View.OnClickListener onClickListener = this.f195108b;
        View.OnClickListener onClickListener2 = this.f195109c;
        ((C0392m) jVar.d.get()).f1349a.f1110j.setOnClickListener(onClickListener);
        ((C0392m) jVar.d.get()).f1349a.f1113m.setOnClickListener(onClickListener2);
        ((TextInputEditText) ((View) jVar.c.get()).findViewById(R.id.shortcut_phrase_input)).setOnEditorActionListener(new C73809f(jVar));
    }
}
