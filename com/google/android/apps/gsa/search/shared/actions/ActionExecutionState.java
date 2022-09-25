package com.google.android.apps.gsa.search.shared.actions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.p4152bb.p4153a.C55244le;
import com.google.p4152bb.p4153a.C55305nl;
import java.util.Arrays;

/* compiled from: PG */
public class ActionExecutionState implements Parcelable, C90964a {
    public static final Parcelable.Creator CREATOR = new C87411d();

    /* renamed from: a */
    public byte f236004a;

    /* renamed from: b */
    public boolean f236005b;

    /* renamed from: c */
    private byte f236006c;

    /* renamed from: d */
    private C55244le f236007d;

    public ActionExecutionState() {
        this.f236004a = 3;
        this.f236006c = 1;
        this.f236005b = false;
        this.f236007d = null;
    }

    protected ActionExecutionState(Parcel parcel) {
        this.f236004a = 3;
        boolean z = true;
        this.f236006c = 1;
        this.f236005b = false;
        this.f236007d = null;
        this.f236006c = parcel.readByte();
        this.f236004a = parcel.readByte();
        this.f236005b = parcel.readByte() != 1 ? false : z;
        this.f236007d = (C55244le) ProtoLiteParcelable.m147135f(parcel, C55244le.f145466h);
    }

    /* renamed from: a */
    public final C55244le mo81111a(C55305nl nlVar) {
        if (nlVar != null) {
            if (mo81117f()) {
                if ((nlVar.f145691a & 1) == 0) {
                    return null;
                }
                C55244le leVar = nlVar.f145694d;
                return leVar == null ? C55244le.f145466h : leVar;
            } else if (mo81115e()) {
                if ((nlVar.f145691a & 4) == 0) {
                    return null;
                }
                C55244le leVar2 = nlVar.f145696f;
                return leVar2 == null ? C55244le.f145466h : leVar2;
            } else if (mo81123k()) {
                if ((nlVar.f145691a & 8) == 0) {
                    return null;
                }
                C55244le leVar3 = nlVar.f145697g;
                return leVar3 == null ? C55244le.f145466h : leVar3;
            } else if (mo81119h()) {
                if ((nlVar.f145691a & 2) == 0) {
                    return null;
                }
                C55244le leVar4 = nlVar.f145695e;
                return leVar4 == null ? C55244le.f145466h : leVar4;
            }
        }
        if (mo81113c()) {
            return this.f236007d;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo81112b(C55244le leVar) {
        if (leVar != null) {
            this.f236005b = true;
            mo81125m((byte) 6);
            this.f236007d = leVar;
        }
    }

    /* renamed from: c */
    public final boolean mo81113c() {
        return this.f236006c == 6;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo81115e() {
        return this.f236006c == 4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ActionExecutionState)) {
            return false;
        }
        ActionExecutionState actionExecutionState = (ActionExecutionState) obj;
        if (this.f236006c == actionExecutionState.f236006c && this.f236004a == actionExecutionState.f236004a && this.f236005b == actionExecutionState.f236005b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo81117f() {
        return this.f236006c == 2;
    }

    /* renamed from: g */
    public final boolean mo81118g() {
        return this.f236004a == 2;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        String str;
        String str2;
        C91005e c = fVar.mo85279c("state");
        byte b = this.f236006c;
        if (b == 1) {
            str = "ready";
        } else if (b == 2) {
            str = "done";
        } else if (b == 3) {
            str = "uncertain result";
        } else if (b == 4) {
            str = "canceled";
        } else if (b != 5) {
            str = "unknown (" + b + ")";
        } else {
            str = "error";
        }
        c.mo85276a(C90752i.m148229c(str));
        C91005e c2 = fVar.mo85279c("execution state");
        byte b2 = this.f236004a;
        if (b2 == 1) {
            str2 = "requested";
        } else if (b2 == 2) {
            str2 = "executing";
        } else if (b2 != 3) {
            str2 = "unknown (" + b2 + ")";
        } else {
            str2 = "none";
        }
        c2.mo85276a(C90752i.m148229c(str2));
        fVar.mo85279c("is executed").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f236005b)));
    }

    /* renamed from: h */
    public final boolean mo81119h() {
        return this.f236006c == 5;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Byte.valueOf(this.f236006c), Byte.valueOf(this.f236004a), Boolean.valueOf(this.f236005b)});
    }

    /* renamed from: i */
    public final boolean mo81121i() {
        return this.f236004a == 1;
    }

    /* renamed from: j */
    public final boolean mo81122j() {
        return this.f236006c == 1;
    }

    /* renamed from: k */
    public final boolean mo81123k() {
        return this.f236006c == 3;
    }

    /* renamed from: l */
    public final boolean mo81124l() {
        this.f236005b = mo81121i() || mo81118g();
        return mo81125m((byte) 1);
    }

    /* renamed from: m */
    public final boolean mo81125m(byte b) {
        boolean z = this.f236006c != b;
        this.f236006c = b;
        return z;
    }

    /* renamed from: n */
    public final void mo81126n() {
        this.f236005b = true;
        mo81125m((byte) 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionExecutionState[");
        if (mo81122j()) {
            sb.append("ready");
        } else if (mo81115e()) {
            sb.append("canceled");
        } else if (mo81117f()) {
            sb.append("done");
        } else if (mo81123k()) {
            sb.append("uncertain result");
        } else if (mo81119h()) {
            sb.append("execution error");
        } else {
            sb.append("unknown");
        }
        if (this.f236005b) {
            sb.append(", executed");
        }
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f236006c);
        parcel.writeByte(this.f236004a);
        parcel.writeByte(this.f236005b ? (byte) 1 : 0);
        ProtoLiteParcelable.m147140k(this.f236007d, parcel);
    }
}
