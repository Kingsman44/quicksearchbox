package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7041h.C89776h;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.assistant.p3886c.C50749bn;
import p3186j$.time.Instant;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.e.b */
/* compiled from: PG */
public abstract class C131233b {
    /* renamed from: d */
    public static C131233b m213726d(C50749bn bnVar) {
        boolean z;
        String str;
        Instant instant;
        Instant instant2;
        long j;
        Instant ofEpochSecond;
        C123787p pVar;
        Instant ofEpochSecond2;
        C123787p pVar2;
        String str2;
        C123787p pVar3;
        long j2;
        boolean e;
        C89776h hVar;
        C89776h hVar2;
        C89776h hVar3;
        Instant instant3 = Instant.EPOCH;
        Instant instant4 = Instant.EPOCH;
        int i = bnVar.f132066a;
        if (i == 1) {
            ofEpochSecond = Instant.ofEpochSecond(((C89776h) bnVar.f132067b).f242985e);
            if (bnVar.f132066a == 1) {
                hVar = (C89776h) bnVar.f132067b;
            } else {
                hVar = C89776h.f242979p;
            }
            ofEpochSecond2 = Instant.ofEpochSecond(hVar.f242986f);
            int i2 = bnVar.f132066a;
            if (i2 == 1) {
                hVar2 = (C89776h) bnVar.f132067b;
            } else {
                hVar2 = C89776h.f242979p;
            }
            str2 = hVar2.f242984d;
            if (i2 == 1) {
                hVar3 = (C89776h) bnVar.f132067b;
            } else {
                hVar3 = C89776h.f242979p;
            }
            j2 = hVar3.f242982b;
            e = m213727e(bnVar);
        } else if (i == 2) {
            ofEpochSecond = Instant.ofEpochSecond(((C123787p) bnVar.f132067b).f341954e);
            if (bnVar.f132066a == 2) {
                pVar = (C123787p) bnVar.f132067b;
            } else {
                pVar = C123787p.f341948n;
            }
            ofEpochSecond2 = Instant.ofEpochSecond(pVar.f341955f);
            int i3 = bnVar.f132066a;
            if (i3 == 2) {
                pVar2 = (C123787p) bnVar.f132067b;
            } else {
                pVar2 = C123787p.f341948n;
            }
            str2 = pVar2.f341953d;
            if (i3 == 2) {
                pVar3 = (C123787p) bnVar.f132067b;
            } else {
                pVar3 = C123787p.f341948n;
            }
            j2 = pVar3.f341951b;
            e = m213727e(bnVar);
        } else {
            instant2 = instant3;
            instant = instant4;
            j = 0;
            str = BuildConfig.FLAVOR;
            z = false;
            return new C131232a(j, instant2, instant, str, z);
        }
        z = e;
        instant2 = ofEpochSecond;
        instant = ofEpochSecond2;
        j = j2;
        str = str2;
        return new C131232a(j, instant2, instant, str, z);
    }

    /* renamed from: e */
    public static boolean m213727e(C50749bn bnVar) {
        String str;
        int i = bnVar.f132066a;
        if (i == 1) {
            str = ((C89776h) bnVar.f132067b).f242993m;
        } else {
            str = i == 2 ? ((C123787p) bnVar.f132067b).f341960k : BuildConfig.FLAVOR;
        }
        return str.startsWith("_6tlnaqrle5p6cpb4dhmj4phpe");
    }

    /* renamed from: a */
    public abstract Instant mo110121a();

    /* renamed from: b */
    public abstract Instant mo110122b();

    /* renamed from: c */
    public abstract String mo110123c();

    public final boolean equals(Object obj) {
        if (!(obj instanceof C131233b)) {
            return false;
        }
        C131233b bVar = (C131233b) obj;
        if ((!bVar.mo110123c().isEmpty() || !bVar.mo110122b().equals(Instant.EPOCH) || !bVar.mo110121a().equals(Instant.EPOCH)) && mo110123c().equals(bVar.mo110123c()) && mo110122b().equals(bVar.mo110122b()) && mo110121a().equals(bVar.mo110121a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(mo110123c(), mo110122b(), mo110121a());
    }
}
