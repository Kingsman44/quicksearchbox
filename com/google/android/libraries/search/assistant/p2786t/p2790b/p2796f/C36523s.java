package com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f;

import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.google.android.libraries.search.assistant.notification.data.AutoValue_StandardNotification;
import com.google.android.libraries.search.assistant.notification.data.C34882c;
import com.google.android.libraries.search.assistant.notification.p2711b.C34866n;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2792b.C36474e;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.t.b.f.s */
/* compiled from: PG */
public final /* synthetic */ class C36523s implements Function {

    /* renamed from: a */
    public final /* synthetic */ C36524t f95296a;

    public /* synthetic */ C36523s(C36524t tVar) {
        this.f95296a = tVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str;
        String str2;
        String str3;
        CharSequence charSequence;
        C36524t tVar = this.f95296a;
        StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
        C34882c cVar = new C34882c();
        C34866n.m63625f(tVar.f95298b, statusBarNotification, cVar);
        Bundle bundle = statusBarNotification.getNotification().extras;
        CharSequence charSequence2 = bundle.getCharSequence("android.text");
        if (charSequence2 == null) {
            return Optional.empty();
        }
        cVar.f92546k = charSequence2;
        CharSequence charSequence3 = bundle.getCharSequence("android.title");
        if (charSequence3 != null) {
            cVar.f92545j = Optional.m71637of(charSequence3);
        }
        if (cVar.f92547l == 1 && (str = cVar.f92536a) != null && (str2 = cVar.f92537b) != null && (str3 = cVar.f92542g) != null && (charSequence = cVar.f92546k) != null) {
            return Optional.m71637of(C36474e.m65029c(new AutoValue_StandardNotification(str, str2, cVar.f92538c, cVar.f92539d, cVar.f92540e, cVar.f92541f, str3, cVar.f92543h, cVar.f92544i, cVar.f92545j, charSequence)));
        }
        StringBuilder sb = new StringBuilder();
        if (cVar.f92536a == null) {
            sb.append(" appName");
        }
        if (cVar.f92537b == null) {
            sb.append(" packageName");
        }
        if (cVar.f92547l == 0) {
            sb.append(" doesAlert");
        }
        if (cVar.f92542g == null) {
            sb.append(" key");
        }
        if (cVar.f92546k == null) {
            sb.append(" contentBody");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
