package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122180a;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122181b;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122197r;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122198s;
import com.google.android.libraries.mdi.C28593a;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C28597c;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C28703ai;
import com.google.android.libraries.mdi.download.C28706al;
import com.google.android.libraries.mdi.download.C28707am;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.assistant.p3793ae.p3794a.C48773e;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4537i.C59294s;
import com.google.common.p4575r.C60754k;
import com.google.common.p4575r.C60755l;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3186j$.nio.charset.StandardCharsets;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.function.ToIntFunction;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.c.b.f.an */
/* compiled from: PG */
public final class C17136an {

    /* renamed from: a */
    public static final C59071e f49821a = C59071e.m91332i("com.google.android.libraries.assistant.c.b.f.an");

    /* renamed from: b */
    public static final Pattern f49822b = Pattern.compile("\\d+(\\.\\d+)*");

    /* renamed from: c */
    private static final C58869cf f49823c = C58869cf.m90937c(C58837ba.m90854c("\\."));

    /* renamed from: a */
    public static C122181b m34266a(Optional optional) {
        C122180a aVar = (C122180a) C122181b.f338867b.createBuilder();
        Objects.requireNonNull(aVar);
        optional.ifPresent(new C17131ai(aVar));
        return (C122181b) aVar.build();
    }

    /* renamed from: b */
    public static C122198s m34267b(Optional optional) {
        C122197r rVar = (C122197r) C122198s.f338900b.createBuilder();
        Objects.requireNonNull(rVar);
        optional.ifPresent(new C17125ac(rVar));
        return (C122198s) rVar.build();
    }

    /* renamed from: c */
    public static C29690f m34268c(C29690f fVar) {
        if (fVar == null) {
            return null;
        }
        if (C17160w.m34311b(fVar)) {
            return fVar;
        }
        C28597c cVar = (C28597c) fVar.toBuilder();
        cVar.copyOnWrite();
        ((C29690f) cVar.instance).f80416g = C29690f.emptyProtobufList();
        for (C28595b bVar : fVar.f80416g) {
            C28593a aVar = (C28593a) bVar.toBuilder();
            String str = bVar.f77798b;
            int lastIndexOf = str.lastIndexOf("_sothash_");
            if (lastIndexOf != -1) {
                str = str.substring(0, lastIndexOf);
            }
            aVar.copyOnWrite();
            C28595b bVar2 = (C28595b) aVar.instance;
            str.getClass();
            bVar2.f77797a |= 1;
            bVar2.f77798b = str;
            cVar.copyOnWrite();
            C29690f fVar2 = (C29690f) cVar.instance;
            C28595b bVar3 = (C28595b) aVar.build();
            bVar3.getClass();
            fVar2.mo34847a();
            fVar2.f80416g.add(bVar3);
        }
        return (C29690f) cVar.build();
    }

    /* renamed from: d */
    public static C28708an m34269d(C28708an anVar) {
        C28707am amVar = (C28707am) anVar.toBuilder();
        amVar.copyOnWrite();
        ((C28708an) amVar.instance).f78003h = C28708an.emptyProtobufList();
        for (C28706al alVar : anVar.f78003h) {
            C28703ai aiVar = (C28703ai) alVar.toBuilder();
            String str = alVar.f77979b + "_sothash_" + alVar.f77983f;
            aiVar.copyOnWrite();
            C28706al alVar2 = (C28706al) aiVar.instance;
            alVar2.f77978a |= 1;
            alVar2.f77979b = str;
            amVar.mo34328b(aiVar);
        }
        return (C28708an) amVar.build();
    }

    /* renamed from: e */
    public static C60755l m34270e(String str) {
        C60754k b = C60755l.m92735b();
        for (String parseInt : f49823c.mo56153g(str)) {
            b.mo57180b(Integer.parseInt(parseInt));
        }
        return b.mo57179a();
    }

    /* renamed from: f */
    public static Optional m34271f(C122198s sVar) {
        return Optional.m71637of(sVar).filter(C17129ag.f49813a).map(C17130ah.f49814a);
    }

    /* renamed from: g */
    public static Optional m34272g(String str) {
        Optional empty = Optional.empty();
        if (str.contains(":")) {
            String[] split = str.split(":", 2);
            return Optional.m71637of(new Account(split[1], split[0]));
        } else if (str.isEmpty()) {
            return empty;
        } else {
            ((C59052c) ((C59052c) f49821a.mo56226d()).mo56372aa(42628)).mo56389s("Account string can't be parsed, missing a colon. Given string %s", str);
            return empty;
        }
    }

    /* renamed from: h */
    public static File m34273h(Context context) {
        return new File(context.getFilesDir(), "pablo_configs");
    }

    /* renamed from: i */
    public static File m34274i(Context context, String str) {
        return new File(m34273h(context), String.valueOf(str).concat(".binarypb"));
    }

    /* renamed from: j */
    public static String m34275j(Context context) {
        try {
            Matcher matcher = f49822b.matcher(context.getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 0).versionName);
            if (!matcher.find()) {
                return "0";
            }
            return matcher.group();
        } catch (PackageManager.NameNotFoundException unused) {
            return "0";
        }
    }

    /* renamed from: k */
    public static String m34276k(C29690f fVar) {
        return m34281p(fVar, C17134al.f49819a, C17163z.f49869a, C17123aa.f49807a, C17124ab.f49808a);
    }

    /* renamed from: l */
    public static String m34277l(C28708an anVar) {
        return m34281p(anVar, C17162y.f49868a, C17126ad.f49810a, C17127ae.f49811a, C17128af.f49812a);
    }

    /* renamed from: m */
    public static String m34278m(Optional optional) {
        return (String) optional.map(C17133ak.f49818a).orElse(BuildConfig.FLAVOR);
    }

    /* renamed from: n */
    public static boolean m34279n(Optional optional, Locale locale, String str) {
        return ((Boolean) optional.map(new C17132aj(locale, str)).orElse(true)).booleanValue();
    }

    /* renamed from: o */
    public static boolean m34280o(C48773e eVar, String str) {
        String trim = eVar.f126202c.trim();
        if (trim.isEmpty()) {
            return true;
        }
        Pattern pattern = f49822b;
        if (!pattern.matcher(trim).matches()) {
            ((C59052c) ((C59052c) f49821a.mo56226d()).mo56372aa(42630)).mo56359L("Failed to parse min_apk_version of group '%s': '%s' (doesn't match '%s')", eVar.f126200a, trim, pattern.pattern());
            return false;
        } else if (C17135am.f49820a.compare(trim, str) <= 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: p */
    private static String m34281p(Object obj, Function function, ToIntFunction toIntFunction, Function function2, Function function3) {
        int applyAsInt = toIntFunction.applyAsInt(obj);
        String nVar = C59294s.m92133c().mo56759a((String) Collection.EL.stream((List) function2.apply(obj)).map(function3).collect(Collectors.joining(";")), StandardCharsets.UTF_8).toString();
        return String.format(Locale.US, "%s_%d_%s", new Object[]{(String) function.apply(obj), Integer.valueOf(applyAsInt), nVar});
    }
}
