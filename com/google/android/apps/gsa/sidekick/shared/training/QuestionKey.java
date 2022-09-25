package com.google.android.apps.gsa.sidekick.shared.training;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.p375ai.p378b.C7917ot;
import com.google.p375ai.p378b.C7918ou;
import com.google.protobuf.C62971cq;
import java.util.Arrays;

/* compiled from: PG */
public class QuestionKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C91923c();

    /* renamed from: a */
    private final C7918ou f256345a;

    public QuestionKey(C7918ou ouVar) {
        ouVar.getClass();
        this.f256345a = ouVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionKey)) {
            return false;
        }
        C7918ou ouVar = ((QuestionKey) obj).f256345a;
        if (this.f256345a.f27832g.equals(ouVar.f27832g)) {
            C62971cq cqVar = this.f256345a.f27828c;
            C62971cq cqVar2 = ouVar.f27828c;
            if (cqVar.size() == cqVar2.size()) {
                int i = 0;
                while (i < cqVar.size()) {
                    C7917ot otVar = (C7917ot) cqVar.get(i);
                    C7917ot otVar2 = (C7917ot) cqVar2.get(i);
                    int i2 = otVar.f27820a;
                    if ((i2 & 4) == 0 && (i2 & 8) == 0) {
                        int i3 = otVar2.f27820a;
                        if ((i3 & 4) == 0 && (i3 & 8) == 0) {
                            i++;
                        }
                    }
                    if (new C91921a(otVar).equals(new C91921a(otVar2))) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f256345a.f27832g.mo59174N());
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56103c("templateId", String.valueOf(this.f256345a.f27827b));
        b.mo56102b("fingerprint", new String(this.f256345a.f27832g.mo59174N()));
        return b.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147140k(this.f256345a, parcel);
    }
}
