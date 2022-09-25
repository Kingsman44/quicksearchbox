package com.google.android.apps.gsa.search.core;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.shared.p7037e.C89720f;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.b */
/* compiled from: PG */
final class C85642b extends C90953s {

    /* renamed from: a */
    final /* synthetic */ String f231479a;

    /* renamed from: b */
    final /* synthetic */ Intent f231480b;

    /* renamed from: c */
    final /* synthetic */ C85676c f231481c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85642b(C85676c cVar, String str, Intent intent) {
        super("AgsaJavascriptExt");
        this.f231481c = cVar;
        this.f231479a = str;
        this.f231480b = intent;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo76757c(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable == null) {
            C59104x c = C85676c.f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) c).mo56372aa(7267)).mo56386p("JavascriptInterface: failed to install shortcut.");
            return;
        }
        ((C89720f) this.f231481c.f231613c.mo27525b()).mo83611a(this.f231479a, ((BitmapDrawable) drawable).getBitmap(), this.f231480b);
    }
}
