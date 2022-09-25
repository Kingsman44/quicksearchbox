package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.p9446a;

import com.google.android.apps.gsa.nga.api.a.bj;
import com.google.android.apps.gsa.nga.engine.dictation.h;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125038d;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125041g;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125042h;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125521a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.C125712a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.C125727f;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125929r;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9464a.C125971a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126174c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9481b.C126319a;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.a.i */
/* compiled from: PG */
public final class C125721i implements C125712a {

    /* renamed from: a */
    public static final C59071e f346501a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.a.i");

    /* renamed from: b */
    public static final C125521a f346502b = new C125521a(C125038d.f344972d);

    /* renamed from: c */
    public final Locale f346503c;

    /* renamed from: d */
    public final C126174c f346504d;

    /* renamed from: e */
    public final C125971a f346505e;

    /* renamed from: f */
    public final C125929r f346506f;

    /* renamed from: g */
    public final boolean f346507g;

    /* renamed from: h */
    public final Executor f346508h;

    /* renamed from: i */
    public final C46423aj f346509i;

    public C125721i(Locale locale, bj bjVar, C126174c cVar, C125971a aVar, C125727f fVar, C125929r rVar, boolean z, Executor executor) {
        this.f346503c = locale;
        this.f346504d = cVar;
        this.f346505e = aVar;
        this.f346506f = rVar;
        this.f346507g = z;
        this.f346508h = executor;
        this.f346509i = new C46423aj(new C125717e(fVar, locale, bjVar), executor);
    }

    /* renamed from: a */
    public static C51809dy m205703a(String str, String str2, List list, h hVar, boolean z, boolean z2) {
        C125041g gVar = (C125041g) C125042h.f344983g.createBuilder();
        gVar.copyOnWrite();
        str.getClass();
        ((C125042h) gVar.instance).f344985a = str;
        gVar.copyOnWrite();
        str2.getClass();
        ((C125042h) gVar.instance).f344986b = str2;
        gVar.copyOnWrite();
        ((C125042h) gVar.instance).f344988d = hVar.getNumber();
        gVar.copyOnWrite();
        C125042h hVar2 = (C125042h) gVar.instance;
        C62971cq cqVar = hVar2.f344987c;
        if (!cqVar.mo58948c()) {
            hVar2.f344987c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) hVar2.f344987c);
        gVar.copyOnWrite();
        ((C125042h) gVar.instance).f344989e = z2;
        gVar.copyOnWrite();
        ((C125042h) gVar.instance).f344990f = z;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "java.com.google.android.apps.search.assistant.surfaces.dictation.proto.internal.SuggestEmojiClientOpArgs";
        C63088z byteString = ((C125042h) gVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        return C126319a.m206547b("keyboard.SUGGEST_EMOJI", "suggest_emoji_args", (C52230ka) jzVar.build());
    }

    /* renamed from: b */
    public static C58485gu m205704b(List list) {
        return (C58485gu) Collection.EL.stream(list).filter(C125713a.f346488a).map(C125714b.f346489a).collect(C58370cn.f155946a);
    }
}
