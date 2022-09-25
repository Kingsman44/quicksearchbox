package com.google.android.libraries.home.p1940a.p1943c;

import com.evernote.android.state.BuildConfig;
import java.util.Collection;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.aq */
/* compiled from: PG */
public final class C23414aq implements C23571er {

    /* renamed from: a */
    public static final C23413ap f63984a = new C23413ap();

    /* renamed from: b */
    public static final C23412ao f63985b = new C23412ao(BuildConfig.FLAVOR, false);

    /* renamed from: c */
    private final C23412ao f63986c;

    public C23414aq(C23412ao aoVar) {
        C69664n.m101061g(aoVar, "deviceLinkParameter");
        this.f63986c = aoVar;
    }

    /* renamed from: a */
    public final C23574eu mo28848a() {
        return C23574eu.DEVICE_LINKS;
    }

    /* renamed from: b */
    public final Collection mo28849b() {
        return C69540x.m100944b(this.f63986c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23414aq) && C69664n.m101066l(this.f63986c, ((C23414aq) obj).f63986c);
    }

    public final int hashCode() {
        return this.f63986c.hashCode();
    }

    public final String toString() {
        C23412ao aoVar = this.f63986c;
        return "HomeAutomationDeviceLinksTrait(deviceLinkParameter=" + aoVar + ")";
    }
}
