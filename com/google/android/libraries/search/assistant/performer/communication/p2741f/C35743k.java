package com.google.android.libraries.search.assistant.performer.communication.p2741f;

import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.f.k */
/* compiled from: PG */
public final /* synthetic */ class C35743k implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f93670a;

    public /* synthetic */ C35743k(String str) {
        this.f93670a = str;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        String str = this.f93670a;
        String str2 = (String) obj;
        String[] strArr = C35733aa.f93649a;
        if (str2 == null) {
            return false;
        }
        String quote = Pattern.quote(Normalizer.normalize(str, Normalizer.Form.NFKC).toLowerCase(Locale.ROOT));
        return Normalizer.normalize(str2, Normalizer.Form.NFKC).toLowerCase(Locale.ROOT).matches(".*\\b" + quote + "\\b.*");
    }
}
