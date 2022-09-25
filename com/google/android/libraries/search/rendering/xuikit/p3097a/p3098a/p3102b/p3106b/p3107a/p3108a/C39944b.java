package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3107a.p3108a;

import android.net.Uri;
import com.bumptech.glide.p282c.p283a.C5528f;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.b.a.a.b */
/* compiled from: PG */
public final class C39944b implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ List f104993a;

    /* renamed from: b */
    final /* synthetic */ C39945c f104994b;

    public C39944b(C39945c cVar, List list) {
        this.f104994b = cVar;
        this.f104993a = list;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C39945c cVar = this.f104994b;
        List<String> list = this.f104993a;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.isEmpty()) {
                arrayList.add(C60856cj.m92900i(C39945c.f104995a));
            } else {
                C47449e eVar = cVar.f104997c;
                arrayList.add(C5528f.m14300b(C5528f.m14299a(eVar.mo51286a().mo11870h(Uri.parse(str)))));
            }
        }
        return new C46463o(new C60817ay(C47633f.m84733g(C60856cj.m92906o(arrayList)).mo51515h(new C39943a(this), this.f104994b.f104998d)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo18088c() {
        return "XUiKitMavatarIconsDrawableList";
    }
}
