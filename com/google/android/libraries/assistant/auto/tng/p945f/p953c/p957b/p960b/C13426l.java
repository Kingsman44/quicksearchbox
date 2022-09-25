package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p960b;

import android.content.Context;
import android.media.MediaPlayer;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.C12154a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12169a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12170b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12171c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12174f;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.notification.data.p2713a.C34879g;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35627at;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35628au;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60870cx;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62731b;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62733d;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62734e;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62736g;
import com.google.speech.p5208h.p5210b.C66572b;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p5535j.p5536a.p5543b.C70967n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.b.l */
/* compiled from: PG */
public final class C13426l implements C35628au {

    /* renamed from: a */
    public static final C59071e f41243a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.f.c.b.b.l");

    /* renamed from: b */
    public final Context f41244b;

    /* renamed from: c */
    public MediaPlayer f41245c;

    /* renamed from: d */
    public final Executor f41246d;

    /* renamed from: e */
    public final C60836bq f41247e = new C60836bq();

    /* renamed from: f */
    private final C12154a f41248f;

    /* renamed from: g */
    private final C15481g f41249g;

    /* renamed from: h */
    private final Boolean f41250h;

    /* renamed from: i */
    private final Boolean f41251i;

    public C13426l(Context context, C12154a aVar, C15481g gVar, Executor executor, Boolean bool, Boolean bool2) {
        this.f41244b = context;
        this.f41248f = aVar;
        this.f41249g = gVar;
        this.f41246d = executor;
        this.f41250h = bool;
        this.f41251i = bool2;
    }

    /* renamed from: a */
    public final C60870cx mo21073a(BundledMessageNotification bundledMessageNotification, String str) {
        String str2;
        if (C34879g.m63708b(bundledMessageNotification).isPresent()) {
            Context context = this.f41244b;
            StringBuilder sb = new StringBuilder();
            C58485gu guVar = (C58485gu) Collection.EL.stream(bundledMessageNotification.mo39538a()).map(new C13416b(context)).collect(C58370cn.f155946a);
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) guVar.get(i));
                sb.append(". ");
            }
            str2 = sb.toString();
        } else {
            str2 = C34879g.m63711e(bundledMessageNotification);
        }
        C12171c cVar = (C12171c) C12174f.f38872d.createBuilder();
        cVar.copyOnWrite();
        C12174f fVar = (C12174f) cVar.instance;
        fVar.f38876c = 2;
        fVar.f38874a = 2 | fVar.f38874a;
        C67187ae aeVar = (C67187ae) C67190ah.f182619q.createBuilder();
        aeVar.copyOnWrite();
        C67190ah ahVar = (C67190ah) aeVar.instance;
        str2.getClass();
        ahVar.f182622a |= 1;
        ahVar.f182625d = str2;
        aeVar.copyOnWrite();
        C67190ah ahVar2 = (C67190ah) aeVar.instance;
        str.getClass();
        ahVar2.f182622a |= 8192;
        ahVar2.f182632k = str;
        C67190ah ahVar3 = (C67190ah) aeVar.build();
        cVar.copyOnWrite();
        C12174f fVar2 = (C12174f) cVar.instance;
        ahVar3.getClass();
        fVar2.f38875b = ahVar3;
        fVar2.f38874a |= 1;
        return this.f41248f.mo20461b((C12174f) cVar.build(), C70967n.MESSAGE_READ_OFFLINE).mo20381a();
    }

    /* renamed from: b */
    public final C60870cx mo21074b(BundledMessageNotification bundledMessageNotification, List list, String str, String str2) {
        C37258g gVar;
        C62731b bVar = (C62731b) C62734e.f169440g.createBuilder();
        String d = C34879g.m63710d(bundledMessageNotification);
        bVar.copyOnWrite();
        C62734e eVar = (C62734e) bVar.instance;
        d.getClass();
        eVar.f169442a |= 1;
        eVar.f169443b = d;
        C62733d dVar = C62733d.CHRONOLOGICAL;
        bVar.copyOnWrite();
        C62734e eVar2 = (C62734e) bVar.instance;
        eVar2.f169446e = dVar.f169439c;
        eVar2.f169442a |= 4;
        bVar.mo58628a(list);
        C34879g.m63708b(bundledMessageNotification).ifPresent(new C13415a(bVar));
        if (this.f41250h.booleanValue()) {
            bVar.copyOnWrite();
            C62734e eVar3 = (C62734e) bVar.instance;
            eVar3.f169442a |= 16;
            eVar3.f169447f = true;
        }
        C12169a aVar = (C12169a) C12170b.f38866c.createBuilder();
        C66572b a = C35627at.m64008a(bVar, str, str2);
        aVar.copyOnWrite();
        C12170b bVar2 = (C12170b) aVar.instance;
        a.getClass();
        bVar2.f38869b = a;
        bVar2.f38868a |= 1;
        C12170b bVar3 = (C12170b) aVar.build();
        boolean equals = str2.equals("notification_announce_v2");
        C12154a aVar2 = this.f41248f;
        C15481g gVar2 = this.f41249g;
        if (equals) {
            gVar = C37179a.f97648eH;
        } else {
            gVar = C37179a.f97432aD;
        }
        return aVar2.mo20460a(bVar3, gVar2, gVar, equals ? C70967n.NOTIFICATION_ANNOUNCE : C70967n.MESSAGE_READ_ONLINE).mo20381a();
    }

    /* renamed from: c */
    public final C60870cx mo21075c(BundledMessageNotification bundledMessageNotification, String str, String str2) {
        if (str2.equals("messaging_v2")) {
            this.f41249g.mo22352b(C37179a.f97431aC);
        } else if (str2.equals("notification_announce_v2")) {
            this.f41249g.mo22352b(C37179a.f97647eG);
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(bundledMessageNotification.mo39538a()).map(C13422h.f41235a).collect(C58370cn.f155946a);
        if (!this.f41251i.booleanValue()) {
            return mo21074b(bundledMessageNotification, guVar, str, str2);
        }
        ArrayList arrayList = new ArrayList();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C62736g gVar = (C62736g) guVar.get(i);
            if (gVar.f169453d.equals("audio")) {
                arrayList.add(new C13425k(C58485gu.m89846n(gVar), "audio"));
            } else if (arrayList.isEmpty() || !((C13425k) C58557jl.m90131l(arrayList)).f41242b.equals("text/plain")) {
                arrayList.add(new C13425k(new ArrayList(C58485gu.m89846n(gVar)), "text/plain"));
            } else {
                ((C13425k) C58557jl.m90131l(arrayList)).f41241a.add(gVar);
            }
        }
        return C47638k.m84752c((C58485gu) Collection.EL.stream(arrayList).map(new C13423i(this, bundledMessageNotification, str, str2)).collect(C58370cn.f155946a)).mo51521b(new C13424j(this), this.f41246d);
    }
}
