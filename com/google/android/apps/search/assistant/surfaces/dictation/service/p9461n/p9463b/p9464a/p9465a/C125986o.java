package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9464a.p9465a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125058am;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125059an;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125136dj;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125137dk;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125139dm;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125144dr;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125145ds;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9457c.p9459b.C125907a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9464a.C125971a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126174c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.text.BreakIterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.a.a.o */
/* compiled from: PG */
public final class C125986o implements C125971a {

    /* renamed from: a */
    public static final C59071e f347218a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.a.a.o");

    /* renamed from: b */
    public static final Duration f347219b = Duration.ofMillis(100);

    /* renamed from: j */
    private static final Pattern f347220j = Pattern.compile("\\p{L}");

    /* renamed from: c */
    public final C126174c f347221c;

    /* renamed from: d */
    public final C125973b f347222d;

    /* renamed from: e */
    public final C125973b f347223e;

    /* renamed from: f */
    public final C125973b f347224f;

    /* renamed from: g */
    public final Executor f347225g;

    /* renamed from: h */
    public final C60888db f347226h;

    /* renamed from: i */
    public final C125907a f347227i;

    public C125986o(C125907a aVar, C126174c cVar, C125973b bVar, C125973b bVar2, C125973b bVar3, Executor executor, C60888db dbVar) {
        this.f347227i = aVar;
        this.f347221c = cVar;
        this.f347222d = bVar;
        this.f347223e = bVar2;
        this.f347224f = bVar3;
        this.f347225g = executor;
        this.f347226h = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo107219a(String str) {
        C125058am amVar = (C125058am) C125059an.f345031b.createBuilder();
        amVar.copyOnWrite();
        str.getClass();
        ((C125059an) amVar.instance).f345033a = str;
        return this.f347223e.mo107223a((C125059an) amVar.build(), new C125977f(this));
    }

    /* renamed from: b */
    public final C60870cx mo107220b(String str, Locale locale) {
        if (!str.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            BreakIterator sentenceInstance = BreakIterator.getSentenceInstance(locale);
            sentenceInstance.setText(str);
            int last = sentenceInstance.last();
            int previous = sentenceInstance.previous();
            while (true) {
                int i = previous;
                int i2 = last;
                last = i;
                if (last == -1) {
                    str = sb.toString().trim();
                    break;
                }
                String replaceAll = str.substring(last, i2).replaceAll("\\p{Punct}", BuildConfig.FLAVOR);
                if (f347220j.matcher(replaceAll).find()) {
                    str = String.valueOf(replaceAll).concat(sb.toString());
                    break;
                }
                sb.insert(0, replaceAll);
                previous = sentenceInstance.previous();
            }
        }
        if (str.isEmpty()) {
            return C60856cj.m92900i(C125139dm.f345214b);
        }
        C125136dj djVar = (C125136dj) C125137dk.f345211b.createBuilder();
        djVar.copyOnWrite();
        str.getClass();
        ((C125137dk) djVar.instance).f345213a = str;
        return this.f347222d.mo107223a((C125137dk) djVar.build(), new C125985n(this));
    }

    /* renamed from: c */
    public final C60870cx mo107221c(String str) {
        C125144dr drVar = (C125144dr) C125145ds.f345225b.createBuilder();
        drVar.copyOnWrite();
        str.getClass();
        ((C125145ds) drVar.instance).f345227a = str;
        return this.f347224f.mo107223a((C125145ds) drVar.build(), new C125974c(this));
    }

    /* renamed from: d */
    public final C60870cx mo107222d(String str, String str2) {
        return C47633f.m84733g(C60856cj.m92900i(this.f347227i.f346990a)).mo51516i(new C125980i(str, str2), this.f347225g).mo51515h(new C125981j(this), this.f347225g).mo51513e(Exception.class, new C125982k(this), this.f347225g);
    }
}
