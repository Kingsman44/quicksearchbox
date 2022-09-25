package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import android.content.Context;
import com.google.android.apps.gsa.nga.api.a.af;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62971cq;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.at */
/* compiled from: PG */
public final class C126311at {

    /* renamed from: a */
    private final Context f347969a;

    public C126311at(Context context) {
        C69664n.m101061g(context, "applicationContext");
        this.f347969a = context;
    }

    /* renamed from: a */
    public final Locale mo107522a(af afVar) {
        C69664n.m101061g(afVar, "configuration");
        String str = afVar.b;
        C69664n.m101060f(str, "configuration.getPrimaryLocaleLanguageTag()");
        if (str.length() == 0) {
            C59052c cVar = (C59052c) C126312au.f347970a.mo56226d();
            cVar.mo56374ac(1, TimeUnit.MINUTES);
            C62971cq cqVar = afVar.a;
            C69664n.m101060f(cqVar, "localesList");
            cVar.mo56379ah(new C59094n(37007));
            cVar.mo56389s("Got an empty primary language tag from keyboard, falling back to system locale. Keyboard config: %s [SD]", "locales=" + C69540x.m100851ag(cqVar, ",", (CharSequence) null, (CharSequence) null, (C69626l) null, 62) + "; primary_locale_language_tag=" + afVar.b + "; field_type=" + afVar.d + "; foreground_package=" + afVar.e + "; field_requests_no_mic=" + afVar.g + "; editor_ime_action=" + afVar.h + "; keyboard_version_code=" + afVar.l);
            return mo107523b();
        }
        Locale forLanguageTag = Locale.forLanguageTag(str);
        C69664n.m101060f(forLanguageTag, "forLanguageTag(primaryKeyboardLanguageTag)");
        return forLanguageTag;
    }

    /* renamed from: b */
    public final Locale mo107523b() {
        Locale locale = this.f347969a.getResources().getConfiguration().getLocales().get(0);
        C69664n.m101060f(locale, "applicationContext.resou….configuration.locales[0]");
        return locale;
    }
}
