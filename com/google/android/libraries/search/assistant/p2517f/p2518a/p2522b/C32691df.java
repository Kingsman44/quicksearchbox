package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.evernote.android.state.BuildConfig;
import java.util.List;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69734n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.df */
/* compiled from: PG */
public final class C32691df {

    /* renamed from: a */
    public static final C32688dc f87607a = new C32688dc();

    /* renamed from: b */
    public static final List f87608b = C69496am.f185918a;

    /* renamed from: c */
    public final List f87609c;

    public /* synthetic */ C32691df(List list) {
        this.f87609c = list;
    }

    /* renamed from: a */
    public static final String m60594a(List list) {
        if (list.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        return C69734n.m101146n(C69734n.m101143k(C69540x.m100847ac(list), C32690de.f87606a), " ", " [CONTEXT ", " ]", 56);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C32691df) && C69664n.m101066l(this.f87609c, ((C32691df) obj).f87609c);
    }

    public final int hashCode() {
        return this.f87609c.hashCode();
    }

    public final String toString() {
        List list = this.f87609c;
        return "LogTags(tags=" + list + ")";
    }
}
