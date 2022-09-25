package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_GroupMetadata  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_GroupMetadata extends C$$AutoValue_GroupMetadata {
    public C$AutoValue_GroupMetadata(C58833ax axVar, boolean z, long j, String str, PeopleApiAffinity peopleApiAffinity, C58528ij ijVar) {
        super(axVar, z, j, str, peopleApiAffinity, ijVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof GroupMetadata)) {
            GroupMetadata groupMetadata = (GroupMetadata) obj;
            return C58832aw.m90831a(this.f110597a, groupMetadata.mo44930c()) && C58832aw.m90831a(Boolean.valueOf(this.f110598b), Boolean.valueOf(groupMetadata.mo44934f())) && C58832aw.m90831a(Long.valueOf(this.f110599c), Long.valueOf(groupMetadata.mo44928a())) && C58832aw.m90831a(this.f110600d, groupMetadata.mo44932e()) && C58832aw.m90831a(this.f110601e, groupMetadata.mo44929b()) && C58832aw.m90831a(this.f110602f, groupMetadata.mo44931d()) && C58832aw.m90831a(Integer.valueOf(this.f110775g), Integer.valueOf(groupMetadata.f110775g));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f110597a, Boolean.valueOf(this.f110598b), Long.valueOf(this.f110599c), this.f110600d, this.f110601e, this.f110602f, Integer.valueOf(this.f110775g)});
    }

    public final String toString() {
        String obj = this.f110597a.toString();
        boolean z = this.f110598b;
        long j = this.f110599c;
        String str = this.f110600d;
        String obj2 = this.f110601e.toString();
        String valueOf = String.valueOf(this.f110602f);
        int i = this.f110775g;
        return "GroupMetadata{size=" + obj + ", canExpandMembers=" + z + ", querySessionId=" + j + ", query=" + str + ", peopleApiAffinity=" + obj2 + ", provenances=" + valueOf + ", personLevelPosition=" + i + "}";
    }
}
