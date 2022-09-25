package com.google.android.apps.gsa.staticplugins.p8163o;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.a */
/* compiled from: PG */
public final /* synthetic */ class C105775a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C105831c f295131a;

    /* renamed from: b */
    public final /* synthetic */ String f295132b;

    public /* synthetic */ C105775a(C105831c cVar, String str) {
        this.f295131a = cVar;
        this.f295132b = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C105831c cVar = this.f295131a;
        String str = this.f295132b;
        Drawable drawable = (Drawable) obj;
        if (drawable instanceof BitmapDrawable) {
            cVar.f295242i.put(str, ((BitmapDrawable) drawable).getBitmap());
        } else {
            ((C59052c) ((C59052c) C105831c.f295234a.mo56225c()).mo56372aa(14049)).mo56389s("Failed to load notification icon from URI %s", str);
            cVar.f295242i.put(str, (Object) null);
        }
        cVar.f295241h.remove(str);
    }
}
