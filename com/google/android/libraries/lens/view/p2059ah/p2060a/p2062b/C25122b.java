package com.google.android.libraries.lens.view.p2059ah.p2060a.p2062b;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24464s;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24470y;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24471z;
import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.android.libraries.lens.view.utils.C28136y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import java.util.Locale;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.lens.view.ah.a.b.b */
/* compiled from: PG */
public final /* synthetic */ class C25122b implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C25128h f68420a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f68421b;

    public /* synthetic */ C25122b(C25128h hVar, C58495hd hdVar) {
        this.f68420a = hVar;
        this.f68421b = hdVar;
    }

    public final void accept(Object obj, Object obj2) {
        C25128h hVar = this.f68420a;
        C58495hd hdVar = this.f68421b;
        Locale locale = (Locale) obj;
        if (!C25327c.DOWNLOADED.equals((C25327c) obj2)) {
            return;
        }
        if (!hdVar.containsKey(locale) || (hdVar.get(locale) != C25327c.DOWNLOADED && hdVar.get(locale) != C25327c.DOWNLOADING)) {
            Locale e = C28136y.m52434e(locale);
            if (!e.equals(Locale.ENGLISH)) {
                hVar.f68434h.mo30246a(C28136y.m52430a(locale), 1, false);
            }
            e.getLanguage();
            C24470y yVar = (C24470y) C24471z.f66980d.createBuilder();
            C24464s sVar = (C24464s) C24465t.f66964f.createBuilder();
            sVar.copyOnWrite();
            C24465t tVar = (C24465t) sVar.instance;
            tVar.f66966a |= 1;
            tVar.f66967b = "ocr_multiscript_tflite";
            String locale2 = e.toString();
            sVar.copyOnWrite();
            C24465t tVar2 = (C24465t) sVar.instance;
            locale2.getClass();
            tVar2.f66966a |= 4;
            tVar2.f66969d = locale2;
            C24465t tVar3 = (C24465t) sVar.build();
            yVar.copyOnWrite();
            C24471z zVar = (C24471z) yVar.instance;
            tVar3.getClass();
            zVar.f66983b = tVar3;
            zVar.f66982a |= 1;
            C60856cj.m92911t(hVar.f68431e.mo33131g(C58485gu.m89846n((C24471z) yVar.build()), hVar.f68433g), C47810es.m84974n(new C25125e(e)), hVar.f68429c);
            if (!Locale.ENGLISH.equals(e)) {
                String a = C28136y.m52430a(e);
                String str = (String) hVar.f68432f.mo31240b().get(a);
                if (str == null) {
                    ((C58970a) ((C58970a) C25128h.f68427a.mo56225c()).mo56372aa(49818)).mo56389s("No Language Model exists for language code:%s", a);
                    return;
                }
                C24470y yVar2 = (C24470y) C24471z.f66980d.createBuilder();
                C24464s sVar2 = (C24464s) C24465t.f66964f.createBuilder();
                sVar2.copyOnWrite();
                C24465t tVar4 = (C24465t) sVar2.instance;
                tVar4.f66966a |= 1;
                tVar4.f66967b = str;
                String languageTag = e.toLanguageTag();
                sVar2.copyOnWrite();
                C24465t tVar5 = (C24465t) sVar2.instance;
                languageTag.getClass();
                tVar5.f66966a |= 4;
                tVar5.f66969d = languageTag;
                C24465t tVar6 = (C24465t) sVar2.build();
                yVar2.copyOnWrite();
                C24471z zVar2 = (C24471z) yVar2.instance;
                tVar6.getClass();
                zVar2.f66983b = tVar6;
                zVar2.f66982a |= 1;
                C60856cj.m92911t(hVar.f68431e.mo33131g(C58485gu.m89846n((C24471z) yVar2.build()), hVar.f68433g), C47810es.m84974n(new C25126f(e)), hVar.f68429c);
            }
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
