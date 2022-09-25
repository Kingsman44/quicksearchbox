package com.google.android.apps.search.podcasts.library.showsubscriptions;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.DialogVisualElements;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.podcasts.library.showsubscriptions.e */
/* compiled from: PG */
final class C140624e implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ C140627h f381919a;

    /* renamed from: b */
    final /* synthetic */ View f381920b;

    /* renamed from: c */
    final /* synthetic */ C0392m f381921c;

    public C140624e(C140627h hVar, View view, C0392m mVar) {
        this.f381919a = hVar;
        this.f381920b = view;
        this.f381921c = mVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C140627h hVar = this.f381919a;
        View view = this.f381920b;
        C0392m mVar = this.f381921c;
        DialogVisualElements.m53173a(hVar.f381925a, mVar, new C140623d(hVar));
        Button button = mVar.f1349a.f1110j;
        C69664n.m101060f(button, "alertDialog.getButton(Dialog.BUTTON_POSITIVE)");
        TextView textView = (TextView) view.findViewById(R.id.podcasts_custom_feed_input);
        textView.addTextChangedListener(new C140626g(button));
        textView.requestFocus();
        String str = hVar.f381931g.f381915a;
        C69664n.m101060f(str, "addCustomFeedArgs.feedUrl");
        if (!C69764m.m101229h(str)) {
            textView.append(hVar.f381931g.f381915a);
        }
        CharSequence text = textView.getText();
        C69664n.m101060f(text, "text");
        button.setEnabled(text.length() > 0);
    }
}
