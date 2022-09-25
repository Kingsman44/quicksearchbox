package com.google.android.apps.search.podcasts.language.p10578b;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.podcasts.language.p10577a.C140516a;
import com.google.android.apps.search.podcasts.language.p10577a.C140519d;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.p4017at.p4082j.p4083a.C54359bl;
import java.text.Normalizer;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.podcasts.language.b.l */
/* compiled from: PG */
public final class C140532l {

    /* renamed from: a */
    public final C140459au f381678a;

    /* renamed from: b */
    public final Executor f381679b;

    /* renamed from: c */
    public final Context f381680c;

    /* renamed from: d */
    public final C46778cv f381681d;

    /* renamed from: e */
    public final C140536p f381682e;

    /* renamed from: f */
    public Set f381683f;

    /* renamed from: g */
    public final C140516a f381684g = new C140516a((byte[]) null);

    /* renamed from: h */
    public final C47632e f381685h = new C47632e();

    /* renamed from: i */
    private final Pattern f381686i = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

    /* renamed from: j */
    private final Pattern f381687j = Pattern.compile("[()]");

    public C140532l(C140459au auVar, Executor executor, Context context, C46778cv cvVar, C140536p pVar) {
        C69664n.m101061g(auVar, "syncablePreferencesManager");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f381678a = auVar;
        this.f381679b = executor;
        this.f381680c = context;
        this.f381681d = cvVar;
        this.f381682e = pVar;
    }

    /* renamed from: c */
    public static final C140519d m228238c(C54359bl blVar, boolean z, Set set) {
        boolean contains = set.contains(blVar.f142797a);
        boolean z2 = true;
        if (!contains && set.size() >= 2) {
            z2 = false;
        }
        return new C140519d(blVar, z, contains, z2);
    }

    /* renamed from: d */
    public static final boolean m228239d(C54359bl blVar, List list) {
        return list.contains(blVar.f142797a);
    }

    /* renamed from: a */
    public final String mo115717a(String str) {
        String replaceAll = this.f381687j.matcher(this.f381686i.matcher(Normalizer.normalize(str, Normalizer.Form.NFD)).replaceAll(BuildConfig.FLAVOR)).replaceAll(BuildConfig.FLAVOR);
        C69664n.m101060f(replaceAll, "regexPatternParenthesis.…er(string).replaceAll(\"\")");
        Locale locale = Locale.getDefault();
        C69664n.m101060f(locale, "getDefault()");
        String lowerCase = replaceAll.toLowerCase(locale);
        C69664n.m101060f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* renamed from: b */
    public final boolean mo115718b(C54359bl blVar, String str) {
        String a = mo115717a(str);
        String str2 = blVar.f142798b;
        C69664n.m101060f(str2, "languageDisplayName");
        if (C69764m.m101205y(mo115717a(str2), a, false)) {
            return true;
        }
        String str3 = blVar.f142799c;
        C69664n.m101060f(str3, "deviceLanguageTranslation");
        if (C69764m.m101205y(mo115717a(str3), a, false)) {
            return true;
        }
        return false;
    }
}
