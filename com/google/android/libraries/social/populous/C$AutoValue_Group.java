package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.core.GroupMetadata;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.social.populous.$AutoValue_Group  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_Group extends Group {

    /* renamed from: a */
    public final String f110324a;

    /* renamed from: b */
    public final String f110325b;

    /* renamed from: c */
    public final GroupMetadata f110326c;

    /* renamed from: d */
    public final C58485gu f110327d;

    /* renamed from: e */
    public final C58485gu f110328e;

    public C$AutoValue_Group(String str, String str2, GroupMetadata groupMetadata, C58485gu guVar, C58485gu guVar2) {
        if (str != null) {
            this.f110324a = str;
            if (str2 != null) {
                this.f110325b = str2;
                if (groupMetadata != null) {
                    this.f110326c = groupMetadata;
                    if (guVar != null) {
                        this.f110327d = guVar;
                        if (guVar2 != null) {
                            this.f110328e = guVar2;
                            return;
                        }
                        throw new NullPointerException("Null membersSnippet");
                    }
                    throw new NullPointerException("Null origins");
                }
                throw new NullPointerException("Null metadata");
            }
            throw new NullPointerException("Null groupId");
        }
        throw new NullPointerException("Null key");
    }

    /* renamed from: a */
    public final GroupMetadata mo44780a() {
        return this.f110326c;
    }

    /* renamed from: b */
    public final C58485gu mo44781b() {
        return this.f110328e;
    }

    /* renamed from: c */
    public final C58485gu mo44782c() {
        return this.f110327d;
    }

    /* renamed from: d */
    public final String mo44783d() {
        return this.f110325b;
    }

    /* renamed from: e */
    public final String mo44784e() {
        return this.f110324a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Group) {
            Group group = (Group) obj;
            return this.f110324a.equals(group.mo44784e()) && this.f110325b.equals(group.mo44783d()) && this.f110326c.equals(group.mo44780a()) && C58597ky.m90218i(this.f110327d, group.mo44782c()) && C58597ky.m90218i(this.f110328e, group.mo44781b());
        }
    }

    public final int hashCode() {
        return ((((((((this.f110324a.hashCode() ^ 1000003) * 1000003) ^ this.f110325b.hashCode()) * 1000003) ^ this.f110326c.hashCode()) * 1000003) ^ this.f110327d.hashCode()) * 1000003) ^ this.f110328e.hashCode();
    }

    public final String toString() {
        String str = this.f110324a;
        String str2 = this.f110325b;
        String obj = this.f110326c.toString();
        String obj2 = this.f110327d.toString();
        String obj3 = this.f110328e.toString();
        return "Group{key=" + str + ", groupId=" + str2 + ", metadata=" + obj + ", origins=" + obj2 + ", membersSnippet=" + obj3 + "}";
    }
}
