package com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9720d;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9013a.C119671a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9014b.C119672a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9015c.C119673a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9015c.C119675c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9015c.C119677e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9015c.C119678f;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9015c.C119679g;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.assistant.p2703l.C34790d;
import com.google.android.libraries.search.assistant.p2703l.C34793g;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51971fx;
import p5488io.grpc.C70851i;
import p5488io.grpc.p5533i.C70852a;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.d.a */
/* compiled from: PG */
public final /* synthetic */ class C128429a implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C128434f f353202a;

    /* renamed from: b */
    public final /* synthetic */ C51971fx f353203b;

    public /* synthetic */ C128429a(C128434f fVar, C51971fx fxVar) {
        this.f353202a = fVar;
        this.f353203b = fxVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C128434f fVar = this.f353202a;
        String str = this.f353203b.f136386e;
        C119671a aVar = fVar.f353218f;
        C51809dy dyVar = fVar.f353216d;
        C34790d dVar = aVar.f333468a;
        C33480d dVar2 = C119672a.f333470b;
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        C119675c cVar2 = (C119675c) C70852a.m103707c(new C119673a(), dVar.mo39512a((C34793g) dVar2.mo38883d(dwVar.f135932a)), C70851i.f189015a);
        C119678f fVar2 = (C119678f) C119679g.f333474b.createBuilder();
        fVar2.copyOnWrite();
        str.getClass();
        ((C119679g) fVar2.instance).f333476a = str;
        C128433e eVar = new C128433e(fVar, cVar);
        C70876o.m103763d(cVar2.f189039a.mo39510a(C119677e.m198605a(), cVar2.f189040b), (C119679g) fVar2.build(), eVar, true);
        return "SearchResultPagePerformer: Streaming HTML";
    }
}
