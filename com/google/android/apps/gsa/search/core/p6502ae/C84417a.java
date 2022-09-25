package com.google.android.apps.gsa.search.core.p6502ae;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89987az;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.googlequicksearchbox.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a */
/* compiled from: PG */
public final class C84417a {

    /* renamed from: a */
    public static final C84417a f229698a = new C84417a("suggest_query", new GlobalSearchApplicationInfo((String) null, (String) null, R.string.icing_on_device_web_suggest_corpus_label, R.string.icing_on_device_web_suggest_corpus_description, R.drawable.ic_device_source_apps_normal, "android.intent.action.MAIN", (String) null, (String) null));

    /* renamed from: b */
    public static final C84417a f229699b = new C84417a("gmail", new GlobalSearchApplicationInfo("com.google.android.gm", (String) null, R.string.icing_gmail_corpus_label, R.string.icing_gmail_corpus_description, R.drawable.ic_action_email_normal, "android.intent.action.MAIN", (String) null, (String) null));

    /* renamed from: c */
    public static final C84417a f229700c = new C84417a("sms", new GlobalSearchApplicationInfo("com.google.android.gms", (String) null, R.string.icing_sms_corpus_label, R.string.icing_sms_corpus_description, R.drawable.ic_sms_black_grey, "android.intent.action.MAIN", (String) null, (String) null));

    /* renamed from: d */
    public final String f229701d;

    /* renamed from: e */
    public final GlobalSearchApplicationInfo f229702e;

    public C84417a(String str, GlobalSearchApplicationInfo globalSearchApplicationInfo) {
        this.f229701d = str;
        this.f229702e = globalSearchApplicationInfo;
    }

    /* renamed from: a */
    public static Set m134730a(C86124t tVar) {
        HashSet hashSet = new HashSet();
        if (tVar.mo79746e(C89987az.f246748a)) {
            hashSet.add(f229699b);
            hashSet.add(f229700c);
        }
        hashSet.add(f229698a);
        return hashSet;
    }

    public final String toString() {
        String str = this.f229701d;
        return "InternalCorpus[" + str + "]";
    }
}
