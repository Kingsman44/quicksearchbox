package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import android.graphics.Bitmap;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.assistant.invocation.assistdata.api.C33523e;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2621b.C33731b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.ah */
/* compiled from: PG */
final class C121882ah extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ Bitmap f338202a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121882ah(Bitmap bitmap) {
        super(1);
        this.f338202a = bitmap;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C121984bs bsVar = (C121984bs) obj;
        C69664n.m101061g(bsVar, "$this$withCurrentCachesSafe");
        Bitmap bitmap = this.f338202a;
        if (bitmap != null) {
            bsVar.f338511b.mo39051c(bitmap);
        } else {
            C33731b bVar = bsVar.f338511b;
            C33523e eVar = new C33523e((String) null, (Throwable) null);
            ((C58970a) ((C58970a) ((C58970a) C33731b.f90089b.mo56226d()).mo56382g(eVar)).mo56372aa(51271)).mo56386p("#onResourceError");
            bVar.f90091d = C60856cj.m92899h(eVar);
            for (C2164c d : bVar.f90090c) {
                d.mo5439d(eVar);
            }
            bVar.f90090c.clear();
        }
        return C69788q.f186170a;
    }
}
