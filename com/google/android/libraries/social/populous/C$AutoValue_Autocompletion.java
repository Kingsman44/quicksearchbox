package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.p3269d.p3270a.C41932g;
import com.google.android.libraries.social.populous.core.C42309ch;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.$AutoValue_Autocompletion  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_Autocompletion extends Autocompletion {

    /* renamed from: a */
    public final C42309ch f110319a;

    /* renamed from: b */
    public final C58485gu f110320b;

    /* renamed from: c */
    public final Person f110321c;

    /* renamed from: d */
    public final Group f110322d;

    /* renamed from: e */
    public final C41932g f110323e;

    public C$AutoValue_Autocompletion(C42309ch chVar, C58485gu guVar, Person person, Group group, C41932g gVar) {
        if (chVar != null) {
            this.f110319a = chVar;
            if (guVar != null) {
                this.f110320b = guVar;
                this.f110321c = person;
                this.f110322d = group;
                this.f110323e = gVar;
                return;
            }
            throw new NullPointerException("Null matchesList");
        }
        throw new NullPointerException("Null objectType");
    }

    /* renamed from: a */
    public final Group mo44772a() {
        return this.f110322d;
    }

    /* renamed from: b */
    public final Person mo44773b() {
        return this.f110321c;
    }

    /* renamed from: c */
    public final C42309ch mo44774c() {
        return this.f110319a;
    }

    /* renamed from: d */
    public final C41932g mo44775d() {
        return this.f110323e;
    }

    /* renamed from: e */
    public final C58485gu mo44776e() {
        return this.f110320b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f110322d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r1 = r4.f110323e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f110321c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.social.populous.Autocompletion
            r2 = 0
            if (r1 == 0) goto L_0x0064
            com.google.android.libraries.social.populous.Autocompletion r5 = (com.google.android.libraries.social.populous.Autocompletion) r5
            com.google.android.libraries.social.populous.core.ch r1 = r4.f110319a
            com.google.android.libraries.social.populous.core.ch r3 = r5.mo44774c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0064
            com.google.common.b.gu r1 = r4.f110320b
            com.google.common.b.gu r3 = r5.mo44776e()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x0064
            com.google.android.libraries.social.populous.Person r1 = r4.f110321c
            if (r1 != 0) goto L_0x002e
            com.google.android.libraries.social.populous.Person r1 = r5.mo44773b()
            if (r1 != 0) goto L_0x0064
            goto L_0x0038
        L_0x002e:
            com.google.android.libraries.social.populous.Person r3 = r5.mo44773b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0064
        L_0x0038:
            com.google.android.libraries.social.populous.Group r1 = r4.f110322d
            if (r1 != 0) goto L_0x0043
            com.google.android.libraries.social.populous.Group r1 = r5.mo44772a()
            if (r1 != 0) goto L_0x0064
            goto L_0x004d
        L_0x0043:
            com.google.android.libraries.social.populous.Group r3 = r5.mo44772a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0064
        L_0x004d:
            com.google.android.libraries.social.d.a.g r1 = r4.f110323e
            if (r1 != 0) goto L_0x0058
            com.google.android.libraries.social.d.a.g r5 = r5.mo44775d()
            if (r5 != 0) goto L_0x0064
            goto L_0x0063
        L_0x0058:
            com.google.android.libraries.social.d.a.g r5 = r5.mo44775d()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            return r0
        L_0x0064:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.C$AutoValue_Autocompletion.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (((this.f110319a.hashCode() ^ 1000003) * 1000003) ^ this.f110320b.hashCode()) * 1000003;
        Person person = this.f110321c;
        int i3 = 0;
        if (person == null) {
            i = 0;
        } else {
            i = person.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        Group group = this.f110322d;
        if (group == null) {
            i2 = 0;
        } else {
            i2 = group.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        C41932g gVar = this.f110323e;
        if (gVar != null) {
            i3 = gVar.hashCode();
        }
        return i5 ^ i3;
    }

    public final String toString() {
        String obj = this.f110319a.toString();
        String obj2 = this.f110320b.toString();
        String valueOf = String.valueOf(this.f110321c);
        String valueOf2 = String.valueOf(this.f110322d);
        String valueOf3 = String.valueOf(this.f110323e);
        return "Autocompletion{objectType=" + obj + ", matchesList=" + obj2 + ", person=" + valueOf + ", group=" + valueOf2 + ", customResult=" + valueOf3 + "}";
    }
}
