package com.google.android.apps.gsa.nga.engine.understanding.p6241h.p6242a;

import android.content.res.Resources;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.geniefm.C76095a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80410ab;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80443w;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80446z;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.p3296e.p3299c.C42454ae;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4537i.C59290o;
import com.google.common.util.concurrent.C60827bh;
import com.google.common.util.concurrent.C60916ec;
import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;
import p3186j$.util.stream.IntStream;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.h.a.g */
/* compiled from: PG */
public final class C79149g {

    /* renamed from: b */
    public static final /* synthetic */ int f217559b = 0;

    /* renamed from: c */
    private static final Pattern f217560c = Pattern.compile("[\\?!\\^@#&*\\+\\-_,.:;\\(\\)\\\"/\\\\\\[\\]]", 2);

    /* renamed from: d */
    private static final Pattern f217561d = Pattern.compile("\\p{M}");

    /* renamed from: e */
    private static final Pattern f217562e = Pattern.compile("['`0-9]", 2);

    /* renamed from: a */
    public final C59290o f217563a;

    /* renamed from: f */
    private final C76095a f217564f;

    /* renamed from: g */
    private final C81515c f217565g;

    public C79149g(C59290o oVar, C76095a aVar, C81515c cVar) {
        this.f217563a = oVar;
        this.f217564f = aVar;
        this.f217565g = cVar;
    }

    /* renamed from: c */
    private final C58528ij m127075c(Locale locale) {
        try {
            C58528ij H = C58528ij.m90008H(this.f217565g.mo75123c(locale, R.array.keywords_extractor_email_stopwords));
            H.size();
            return H;
        } catch (Resources.NotFoundException | C60827bh | C60916ec unused) {
            return C58733pz.f156496a;
        }
    }

    /* renamed from: a */
    public final C58528ij mo73816a(String str, Locale locale) {
        return (C58528ij) mo73817b(str, locale).map(new C79148f(this)).collect(C58370cn.f155947b);
    }

    /* renamed from: b */
    public final Stream mo73817b(String str, Locale locale) {
        Stream stream;
        C58528ij c = m127075c(locale);
        String lowerCase = f217561d.matcher(Normalizer.normalize(f217560c.matcher(f217562e.matcher(str).replaceAll(BuildConfig.FLAVOR)).replaceAll(" "), Normalizer.Form.NFKD)).replaceAll(BuildConfig.FLAVOR).toLowerCase(locale);
        StringBuilder sb = new StringBuilder();
        for (char c2 : lowerCase.toCharArray()) {
            if (c2 == 223) {
                sb.append("ss");
            } else if (c2 == 230) {
                sb.append(C42454ae.f111366a);
            } else if (c2 == 248) {
                sb.append('o');
            } else if (c2 != 322) {
                sb.append(c2);
            } else {
                sb.append('l');
            }
        }
        String sb2 = sb.toString();
        C76095a aVar = this.f217564f;
        C80443w wVar = (C80443w) C80446z.f220797e.createBuilder();
        String languageTag = locale.toLanguageTag();
        wVar.copyOnWrite();
        C80446z zVar = (C80446z) wVar.instance;
        languageTag.getClass();
        zVar.f220799a |= 4;
        zVar.f220802d = languageTag;
        wVar.copyOnWrite();
        C80446z zVar2 = (C80446z) wVar.instance;
        zVar2.f220800b = 1;
        zVar2.f220801c = sb2;
        C80410ab b = aVar.mo72047b((C80446z) wVar.build());
        if (b == null) {
            stream = Stream.CC.empty();
        } else {
            stream = IntStream.CC.range(0, b.f220685a.size()).filter(new C79146d(b)).mapToObj(new C79147e(b));
        }
        return stream.filter(new C79143a(c)).filter(C79144b.f217554a).filter(C79145c.f217555a);
    }
}
