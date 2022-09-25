package com.google.android.libraries.search.silk.p3162a.p3171i;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.core.content.p090a.C1847b;
import androidx.core.content.p090a.C1848c;
import androidx.core.graphics.drawable.IconCompat;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4308m.C56741b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.silk.a.i.b */
/* compiled from: PG */
public final /* synthetic */ class C40600b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C40603e f106554a;

    /* renamed from: b */
    public final /* synthetic */ C56741b f106555b;

    /* renamed from: c */
    public final /* synthetic */ Intent f106556c;

    public /* synthetic */ C40600b(C40603e eVar, C56741b bVar, Intent intent) {
        this.f106554a = eVar;
        this.f106555b = bVar;
        this.f106556c = intent;
    }

    public final C60870cx apply(Object obj) {
        String str;
        C40603e eVar = this.f106554a;
        C56741b bVar = this.f106555b;
        Intent intent = this.f106556c;
        Bitmap bitmap = (Bitmap) obj;
        Context context = eVar.f106564c;
        if ((bVar.f151433a & 8) != 0) {
            str = bVar.f151437e;
        } else {
            str = bVar.f151434b;
        }
        C1848c cVar = new C1848c();
        cVar.f5711a = context;
        cVar.f5712b = str;
        C1847b.m5066b(intent, cVar);
        cVar.f5714d = bVar.f151434b;
        cVar.f5716f = IconCompat.m5204g(bitmap);
        return C60856cj.m92908q(C2169h.m6027a(new C40599a(eVar, C1847b.m5065a(cVar))), 30, TimeUnit.SECONDS, eVar.f106565d);
    }
}
