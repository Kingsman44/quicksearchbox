package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment;

import com.google.android.apps.gsa.nga.api.a.bj;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125930s;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126324be;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.c */
/* compiled from: PG */
public final class C125708c {

    /* renamed from: a */
    public final Locale f346476a;

    /* renamed from: b */
    public final C60870cx f346477b;

    /* renamed from: c */
    public final bj f346478c;

    /* renamed from: d */
    public final C125930s f346479d;

    /* renamed from: e */
    public final List f346480e;

    /* renamed from: f */
    public final boolean f346481f;

    /* renamed from: g */
    private final C126324be f346482g;

    public C125708c(Locale locale, C60870cx cxVar, bj bjVar, C126324be beVar, C125930s sVar, List list, boolean z) {
        C69664n.m101061g(locale, "spokenLocale");
        C69664n.m101061g(cxVar, "directActionsSnapshot");
        C69664n.m101061g(bjVar, "orationContext");
        C69664n.m101061g(beVar, "textState");
        C69664n.m101061g(sVar, "clearSupport");
        C69664n.m101061g(list, "currentSuggestions");
        this.f346476a = locale;
        this.f346477b = cxVar;
        this.f346478c = bjVar;
        this.f346482g = beVar;
        this.f346479d = sVar;
        this.f346480e = list;
        this.f346481f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C125708c)) {
            return false;
        }
        C125708c cVar = (C125708c) obj;
        return C69664n.m101066l(this.f346476a, cVar.f346476a) && C69664n.m101066l(this.f346477b, cVar.f346477b) && C69664n.m101066l(this.f346478c, cVar.f346478c) && C69664n.m101066l(this.f346482g, cVar.f346482g) && this.f346479d == cVar.f346479d && C69664n.m101066l(this.f346480e, cVar.f346480e) && this.f346481f == cVar.f346481f;
    }

    public final int hashCode() {
        return (((((((((((this.f346476a.hashCode() * 31) + this.f346477b.hashCode()) * 31) + this.f346478c.hashCode()) * 31) + this.f346482g.hashCode()) * 31) + this.f346479d.hashCode()) * 31) + this.f346480e.hashCode()) * 31) + (this.f346481f ? 1 : 0);
    }

    public final String toString() {
        Locale locale = this.f346476a;
        C60870cx cxVar = this.f346477b;
        bj bjVar = this.f346478c;
        C126324be beVar = this.f346482g;
        C125930s sVar = this.f346479d;
        List list = this.f346480e;
        boolean z = this.f346481f;
        return "FulfillmentContext(spokenLocale=" + locale + ", directActionsSnapshot=" + cxVar + ", orationContext=" + bjVar + ", textState=" + beVar + ", clearSupport=" + sVar + ", currentSuggestions=" + list + ", supportsAutoCompleteOp=" + z + ")";
    }
}
