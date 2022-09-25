package com.google.android.libraries.social.licenses;

import android.content.Context;
import androidx.p124l.p126b.C2311a;
import androidx.p124l.p126b.C2312b;
import java.util.List;

/* renamed from: com.google.android.libraries.social.licenses.b */
/* compiled from: PG */
public final class C41954b extends C2312b {

    /* renamed from: j */
    private List f109507j;

    public C41954b(Context context) {
        super(context.getApplicationContext());
    }

    /* renamed from: d */
    public final /* synthetic */ void mo5694d(Object obj) {
        List list = (List) obj;
        this.f109507j = list;
        super.mo5694d(list);
    }

    /* renamed from: e */
    public final void mo5695e() {
        List list = this.f109507j;
        if (list != null) {
            super.mo5694d(list);
            return;
        }
        mo5693c();
        this.f6466a = new C2311a(this);
        mo5691a();
    }
}
