package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3109b.p3110a;

import android.text.TextUtils;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40327r;
import com.google.android.libraries.search.video.players.C41592w;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.b.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C39969a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C39970b f105081a;

    /* renamed from: b */
    public final /* synthetic */ Object f105082b;

    public /* synthetic */ C39969a(C39970b bVar, Object obj) {
        this.f105081a = bVar;
        this.f105082b = obj;
    }

    public final void run() {
        C39970b bVar = this.f105081a;
        Object obj = this.f105082b;
        String b = bVar.f105083a.mo42102b(obj);
        if (!TextUtils.isEmpty(b)) {
            C40327r rVar = bVar.f105085c;
            C69664n.m101061g(b, "key");
            C41592w wVar = (C41592w) rVar.f105932c.get(b);
            if (wVar != null) {
                bVar.f105083a.mo42103c(obj, wVar, bVar.f105084b);
                return;
            }
            throw new C21260bc("Cannot find VideoType instance via the provided key: ".concat(String.valueOf(b)));
        }
        throw new C21260bc("Element key is required for video control commands");
    }
}
