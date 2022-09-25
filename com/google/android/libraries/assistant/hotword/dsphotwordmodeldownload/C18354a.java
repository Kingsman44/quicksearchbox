package com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload;

import android.webkit.URLUtil;
import com.google.android.apps.gsa.speech.hotword.C92354c;
import com.google.android.libraries.mdi.download.C28703ai;
import com.google.android.libraries.mdi.download.C28706al;
import com.google.android.libraries.mdi.download.C28707am;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28713as;
import com.google.android.libraries.mdi.download.C28716av;
import com.google.android.libraries.mdi.download.C29343e;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.a */
/* compiled from: PG */
public final /* synthetic */ class C18354a implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ List f52070a;

    /* renamed from: b */
    public final /* synthetic */ Integer f52071b;

    /* renamed from: c */
    public final /* synthetic */ C29409fd f52072c;

    public /* synthetic */ C18354a(List list, Integer num, C29409fd fdVar) {
        this.f52070a = list;
        this.f52071b = num;
        this.f52072c = fdVar;
    }

    public final void accept(Object obj, Object obj2) {
        int i;
        List list = this.f52070a;
        Integer num = this.f52071b;
        C29409fd fdVar = this.f52072c;
        String str = (String) obj;
        String str2 = (String) obj2;
        C58974d dVar = C18359e.f52077a;
        int intValue = num.intValue();
        if (intValue != 0) {
            i = 101;
            if (intValue != 100) {
                i = intValue != 101 ? 0 : 102;
            }
        } else {
            i = 1;
        }
        if (!URLUtil.isValidUrl(str2)) {
            ((C58970a) ((C58970a) C18359e.f52077a.mo56225c()).mo56372aa(47298)).mo56354G("Invalid URL for %s model: %s! This model will not be downloaded or updated", str, str2);
        }
        C28707am amVar = (C28707am) C28708an.f77994l.createBuilder();
        String e = C92354c.m151659e(i, str);
        amVar.copyOnWrite();
        C28708an anVar = (C28708an) amVar.instance;
        e.getClass();
        anVar.f77996a |= 1;
        anVar.f77997b = e;
        C28713as asVar = (C28713as) C28716av.f78018d.createBuilder();
        asVar.copyOnWrite();
        C28716av avVar = (C28716av) asVar.instance;
        avVar.f78021b = 1;
        avVar.f78020a |= 1;
        asVar.copyOnWrite();
        C28716av avVar2 = (C28716av) asVar.instance;
        avVar2.f78022c = 1;
        avVar2.f78020a |= 2;
        amVar.copyOnWrite();
        C28708an anVar2 = (C28708an) amVar.instance;
        C28716av avVar3 = (C28716av) asVar.build();
        avVar3.getClass();
        anVar2.f78002g = avVar3;
        anVar2.f77996a |= 1024;
        C28703ai aiVar = (C28703ai) C28706al.f77976q.createBuilder();
        aiVar.copyOnWrite();
        C28706al alVar = (C28706al) aiVar.instance;
        alVar.f77978a |= 1;
        alVar.f77979b = "dsp_hotword.data";
        aiVar.copyOnWrite();
        C28706al alVar2 = (C28706al) aiVar.instance;
        str2.getClass();
        alVar2.f77978a |= 2;
        alVar2.f77980c = str2;
        aiVar.copyOnWrite();
        C28706al alVar3 = (C28706al) aiVar.instance;
        alVar3.f77982e = 1;
        alVar3.f77978a |= 8;
        amVar.mo34328b(aiVar);
        amVar.copyOnWrite();
        C28708an anVar3 = (C28708an) amVar.instance;
        anVar3.f77996a |= 256;
        anVar3.f78001f = 86400;
        C28708an anVar4 = (C28708an) amVar.build();
        C29343e eVar = new C29343e();
        eVar.mo34326b(anVar4);
        C60870cx a = fdVar.mo34712a(eVar.mo34325a());
        C60856cj.m92911t(a, C47810es.m84974n(new C18358d(anVar4)), C60826bg.f164896a);
        list.add(a);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
