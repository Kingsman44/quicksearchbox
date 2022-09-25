package com.google.android.apps.search.pronunciationlearning.p10638ui.shared;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141513f;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.shared.g */
/* compiled from: PG */
public final class C141517g implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141513f f384138a;

    public C141517g(C141513f fVar) {
        this.f384138a = fVar;
    }

    public final void onClick(View view) {
        boolean z;
        C69664n.m101061g(view, "v");
        C141513f fVar = this.f384138a;
        TextView textView = (TextView) view;
        TextView textView2 = fVar.f384132e;
        CharSequence charSequence = null;
        String str = (String) (textView2 != null ? textView2.getText() : null);
        if (str == null) {
            str = "____";
        }
        CharSequence text = textView.getText();
        C69664n.m101059e(text, "null cannot be cast to non-null type kotlin.String");
        C47393f.m84237h(new C141513f.C141516c(str, (String) text), textView);
        if (C69664n.m101066l(fVar.f384132e, textView)) {
            fVar.mo116543a();
            z = false;
        } else {
            fVar.mo116543a();
            fVar.f384132e = textView;
            z = true;
            textView.setSelected(true);
        }
        C47393f.m84237h(new C141513f.C141515b(z), textView);
        C59052c cVar = (C59052c) C141513f.f384128a.mo56224b();
        TextView textView3 = fVar.f384132e;
        if (textView3 != null) {
            charSequence = textView3.getText();
        }
        cVar.mo56379ah(new C59094n(41718));
        cVar.mo56389s("Current word chip selected value: %s", charSequence);
    }
}
