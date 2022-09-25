package com.google.assistant.p3838ao.p3839a.p3840a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.assistant.p3838ao.p3839a.p3845e.C49555bl;
import java.util.regex.Pattern;
import p3186j$.util.function.Function;

/* renamed from: com.google.assistant.ao.a.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C49390ah implements Function {

    /* renamed from: a */
    public final /* synthetic */ C49555bl f127651a;

    public /* synthetic */ C49390ah(C49555bl blVar) {
        this.f127651a = blVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str;
        C49555bl blVar = this.f127651a;
        Uri uri = (Uri) obj;
        int i = blVar.f127866a;
        boolean z = true;
        if (i == 1) {
            str = Pattern.quote((String) blVar.f127867b);
        } else {
            str = i == 2 ? (String) blVar.f127867b : null;
        }
        String host = uri.getHost();
        if (str == null || TextUtils.isEmpty(host) || !host.matches(str)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
