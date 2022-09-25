package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.android.p3287a.C42162a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4575r.C60757n;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.p4431a.C57877c;
import java.util.concurrent.TimeUnit;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69299g;

/* compiled from: PG */
public final class ClientConfigInternal implements Parcelable, C42266as {
    public static final Parcelable.Creator CREATOR = new C42268au();

    /* renamed from: a */
    public static final long f110695a = TimeUnit.DAYS.toMillis(1);

    /* renamed from: b */
    public static final long f110696b = (TimeUnit.DAYS.toMillis(1) / 2);

    /* renamed from: c */
    public static final long f110697c = TimeUnit.DAYS.toMillis(14);

    /* renamed from: d */
    public static final ClassLoader f110698d = ClientConfigInternal.class.getClassLoader();

    /* renamed from: A */
    public final boolean f110699A;

    /* renamed from: B */
    public final C42275ba f110700B;

    /* renamed from: C */
    public final boolean f110701C;

    /* renamed from: D */
    public final boolean f110702D;

    /* renamed from: E */
    public final boolean f110703E;

    /* renamed from: F */
    public final SessionContextRuleSet f110704F;

    /* renamed from: G */
    public final Experiments f110705G;

    /* renamed from: H */
    public final C58528ij f110706H;

    /* renamed from: I */
    public final boolean f110707I;

    /* renamed from: J */
    public final boolean f110708J;

    /* renamed from: K */
    public final C58528ij f110709K;

    /* renamed from: L */
    public final boolean f110710L;

    /* renamed from: M */
    public final boolean f110711M;

    /* renamed from: N */
    public final boolean f110712N;

    /* renamed from: O */
    public final int f110713O;

    /* renamed from: P */
    public final int f110714P;

    /* renamed from: Q */
    public final int f110715Q;

    /* renamed from: R */
    public final int f110716R;

    /* renamed from: S */
    public final int f110717S;

    /* renamed from: T */
    public final int f110718T;

    /* renamed from: e */
    public final boolean f110719e;

    /* renamed from: f */
    public final ClientId f110720f;

    /* renamed from: g */
    public final int f110721g;

    /* renamed from: h */
    public final C57877c f110722h;

    /* renamed from: i */
    public final C58833ax f110723i;

    /* renamed from: j */
    public final boolean f110724j;

    /* renamed from: k */
    public final C58528ij f110725k;

    /* renamed from: l */
    public final boolean f110726l;

    /* renamed from: m */
    public final boolean f110727m;

    /* renamed from: n */
    public final long f110728n;

    /* renamed from: o */
    public final long f110729o;

    /* renamed from: p */
    public final boolean f110730p;

    /* renamed from: q */
    public final C58528ij f110731q;

    /* renamed from: r */
    public final boolean f110732r;

    /* renamed from: s */
    public final SocialAffinityAllEventSource f110733s;

    /* renamed from: t */
    public final String f110734t;

    /* renamed from: u */
    public final String f110735u;

    /* renamed from: v */
    public final C58528ij f110736v;

    /* renamed from: w */
    public final boolean f110737w;

    /* renamed from: x */
    public final boolean f110738x;

    /* renamed from: y */
    public final C42276bb f110739y;

    /* renamed from: z */
    public final boolean f110740z;

    static {
        TimeUnit.HOURS.toMillis(1);
        TimeUnit.DAYS.toMillis(7);
        TimeUnit.DAYS.toMillis(30);
    }

    public ClientConfigInternal(boolean z, ClientId clientId, int i, int i2, C57877c cVar, C58833ax axVar, int i3, boolean z2, C58528ij ijVar, boolean z3, boolean z4, long j, long j2, boolean z5, C58528ij ijVar2, boolean z6, int i4, SocialAffinityAllEventSource socialAffinityAllEventSource, String str, String str2, C58528ij ijVar3, boolean z7, boolean z8, C42276bb bbVar, boolean z9, int i5, int i6, boolean z10, C42275ba baVar, boolean z11, boolean z12, boolean z13, SessionContextRuleSet sessionContextRuleSet, Experiments experiments, C58528ij ijVar4, boolean z14, int i7, boolean z15, C58528ij ijVar5, boolean z16, boolean z17, boolean z18) {
        int i8 = i2;
        int i9 = i3;
        int i10 = i4;
        int i11 = i5;
        int i12 = i6;
        this.f110719e = z;
        clientId.getClass();
        this.f110720f = clientId;
        this.f110721g = i;
        if (i8 != 0) {
            this.f110713O = i8;
            cVar.getClass();
            this.f110722h = cVar;
            axVar.getClass();
            this.f110723i = axVar;
            if (i9 != 0) {
                this.f110714P = i9;
                this.f110724j = z2;
                ijVar.getClass();
                this.f110725k = ijVar;
                this.f110726l = z3;
                this.f110727m = z4;
                this.f110728n = j;
                this.f110729o = j2;
                this.f110730p = z5;
                ijVar2.getClass();
                this.f110731q = ijVar2;
                this.f110732r = z6;
                if (i10 != 0) {
                    this.f110715Q = i10;
                    socialAffinityAllEventSource.getClass();
                    this.f110733s = socialAffinityAllEventSource;
                    str.getClass();
                    this.f110734t = str;
                    str2.getClass();
                    this.f110735u = str2;
                    ijVar3.getClass();
                    this.f110736v = ijVar3;
                    this.f110737w = z7;
                    this.f110738x = z8;
                    bbVar.getClass();
                    this.f110739y = bbVar;
                    this.f110740z = z9;
                    if (i11 != 0) {
                        this.f110716R = i11;
                        if (i12 != 0) {
                            this.f110717S = i12;
                            this.f110699A = z10;
                            baVar.getClass();
                            this.f110700B = baVar;
                            this.f110701C = z11;
                            this.f110702D = z12;
                            this.f110703E = z13;
                            sessionContextRuleSet.getClass();
                            this.f110704F = sessionContextRuleSet;
                            experiments.getClass();
                            this.f110705G = experiments;
                            ijVar4.getClass();
                            this.f110706H = ijVar4;
                            this.f110707I = z14;
                            this.f110718T = i7;
                            this.f110708J = z15;
                            ijVar5.getClass();
                            this.f110709K = ijVar5;
                            this.f110710L = z16;
                            this.f110711M = z17;
                            this.f110712N = z18;
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: c */
    public static C42269av m74302c() {
        return new C42269av();
    }

    /* renamed from: a */
    public final ClientId mo45104a() {
        return this.f110720f;
    }

    /* renamed from: b */
    public final int mo45105b() {
        return C69299g.f185427a.mo6453a().mo60969d() ? C60757n.m92748i(C69299g.f185427a.mo6453a().mo60967b()) : this.f110721g;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientConfigInternal) {
            ClientConfigInternal clientConfigInternal = (ClientConfigInternal) obj;
            return this.f110719e == clientConfigInternal.f110719e && this.f110720f.equals(clientConfigInternal.f110720f) && this.f110721g == clientConfigInternal.f110721g && this.f110713O == clientConfigInternal.f110713O && this.f110722h.equals(clientConfigInternal.f110722h) && this.f110723i.equals(clientConfigInternal.f110723i) && this.f110714P == clientConfigInternal.f110714P && this.f110724j == clientConfigInternal.f110724j && this.f110725k.equals(clientConfigInternal.f110725k) && this.f110726l == clientConfigInternal.f110726l && this.f110727m == clientConfigInternal.f110727m && this.f110728n == clientConfigInternal.f110728n && this.f110729o == clientConfigInternal.f110729o && this.f110730p == clientConfigInternal.f110730p && this.f110731q.equals(clientConfigInternal.f110731q) && this.f110732r == clientConfigInternal.f110732r && this.f110715Q == clientConfigInternal.f110715Q && this.f110733s.equals(clientConfigInternal.f110733s) && this.f110734t.equals(clientConfigInternal.f110734t) && this.f110735u.equals(clientConfigInternal.f110735u) && this.f110736v.equals(clientConfigInternal.f110736v) && this.f110737w == clientConfigInternal.f110737w && this.f110738x == clientConfigInternal.f110738x && this.f110739y.equals(clientConfigInternal.f110739y) && this.f110740z == clientConfigInternal.f110740z && this.f110716R == clientConfigInternal.f110716R && this.f110717S == clientConfigInternal.f110717S && this.f110699A == clientConfigInternal.f110699A && this.f110700B.equals(clientConfigInternal.f110700B) && this.f110701C == clientConfigInternal.f110701C && this.f110702D == clientConfigInternal.f110702D && this.f110703E == clientConfigInternal.f110703E && this.f110704F.equals(clientConfigInternal.f110704F) && this.f110705G.equals(clientConfigInternal.f110705G) && this.f110706H.equals(clientConfigInternal.f110706H) && this.f110707I == clientConfigInternal.f110707I && this.f110718T == clientConfigInternal.f110718T && this.f110708J == clientConfigInternal.f110708J && this.f110709K.equals(clientConfigInternal.f110709K) && this.f110710L == clientConfigInternal.f110710L && this.f110711M == clientConfigInternal.f110711M && this.f110712N == clientConfigInternal.f110712N;
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((((((((((((((((true != this.f110719e ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f110720f.f110766z.hashCode()) * 1000003) ^ this.f110721g) * 1000003) ^ this.f110713O) * 1000003) ^ this.f110722h.hashCode()) * 1000003) ^ this.f110723i.hashCode()) * 1000003) ^ this.f110714P) * 1000003) ^ (true != this.f110724j ? 1237 : 1231)) * 1000003) ^ this.f110725k.hashCode()) * 1000003) ^ (true != this.f110726l ? 1237 : 1231)) * 1000003;
        int i2 = true != this.f110727m ? 1237 : 1231;
        long j = this.f110728n;
        long j2 = this.f110729o;
        int hashCode2 = (((((((((((((((((((((((((((((((((((((((((((((((((((hashCode ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ (true != this.f110730p ? 1237 : 1231)) * 1000003) ^ this.f110731q.hashCode()) * 1000003) ^ (true != this.f110732r ? 1237 : 1231)) * 1000003) ^ this.f110715Q) * 1000003) ^ this.f110733s.hashCode()) * 1000003) ^ this.f110734t.hashCode()) * 1000003) ^ this.f110735u.hashCode()) * 1000003) ^ this.f110736v.hashCode()) * 1000003) ^ (true != this.f110737w ? 1237 : 1231)) * 1000003) ^ (true != this.f110738x ? 1237 : 1231)) * 1000003) ^ this.f110739y.hashCode()) * 1000003) ^ (true != this.f110740z ? 1237 : 1231)) * 1000003) ^ this.f110716R) * 1000003) ^ this.f110717S) * 1000003) ^ (true != this.f110699A ? 1237 : 1231)) * 1000003) ^ this.f110700B.hashCode()) * 1000003) ^ (true != this.f110701C ? 1237 : 1231)) * 1000003) ^ (true != this.f110702D ? 1237 : 1231)) * 1000003) ^ (true != this.f110703E ? 1237 : 1231)) * 1000003) ^ this.f110704F.hashCode()) * 1000003) ^ this.f110705G.f110773a.f110851a.hashCode()) * 1000003) ^ this.f110706H.hashCode()) * 1000003) ^ (true != this.f110707I ? 1237 : 1231)) * 1000003;
        int i3 = this.f110718T;
        if (i3 != 0) {
            int hashCode3 = (((((((((hashCode2 ^ i3) * 1000003) ^ (true != this.f110708J ? 1237 : 1231)) * 1000003) ^ this.f110709K.hashCode()) * 1000003) ^ (true != this.f110710L ? 1237 : 1231)) * 1000003) ^ (true != this.f110711M ? 1237 : 1231)) * 1000003;
            if (true == this.f110712N) {
                i = 1231;
            }
            return hashCode3 ^ i;
        }
        throw null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(Boolean.valueOf(this.f110719e));
        parcel.writeParcelable(this.f110720f, 0);
        parcel.writeInt(this.f110721g);
        int i2 = this.f110713O;
        if (i2 != 1) {
            parcel.writeInt(i2 - 2);
            parcel.writeInt(this.f110722h.f154831dp);
            C42162a.m74083g(parcel, this.f110723i);
            parcel.writeInt(this.f110714P - 1);
            parcel.writeValue(Boolean.valueOf(this.f110724j));
            C42162a.m74081e(parcel, this.f110725k);
            parcel.writeValue(Boolean.valueOf(this.f110726l));
            parcel.writeValue(Boolean.valueOf(this.f110727m));
            parcel.writeLong(this.f110728n);
            parcel.writeLong(this.f110729o);
            parcel.writeValue(Boolean.valueOf(this.f110730p));
            C42162a.m74084h(parcel, this.f110731q);
            parcel.writeValue(Boolean.valueOf(this.f110732r));
            parcel.writeInt(this.f110715Q - 1);
            parcel.writeParcelable(this.f110733s, 0);
            parcel.writeString(this.f110734t);
            parcel.writeString(this.f110735u);
            parcel.writeStringList(this.f110736v.mo55229u());
            parcel.writeValue(Boolean.valueOf(this.f110737w));
            parcel.writeValue(Boolean.valueOf(this.f110738x));
            parcel.writeInt(this.f110739y.ordinal());
            parcel.writeValue(Boolean.valueOf(this.f110740z));
            parcel.writeInt(this.f110716R - 1);
            parcel.writeInt(this.f110717S - 1);
            parcel.writeValue(Boolean.valueOf(this.f110699A));
            parcel.writeInt(this.f110700B.ordinal());
            parcel.writeValue(Boolean.valueOf(this.f110701C));
            parcel.writeValue(Boolean.valueOf(this.f110702D));
            parcel.writeValue(Boolean.valueOf(this.f110703E));
            parcel.writeParcelable(this.f110704F, 0);
            parcel.writeParcelable(this.f110705G, 0);
            C42162a.m74084h(parcel, this.f110706H);
            parcel.writeValue(Boolean.valueOf(this.f110707I));
            parcel.writeInt(C42263ap.m74420a(this.f110718T));
            parcel.writeValue(Boolean.valueOf(this.f110708J));
            C42162a.m74084h(parcel, this.f110709K);
            parcel.writeInt(this.f110710L ? 1 : 0);
            parcel.writeValue(Boolean.valueOf(this.f110711M));
            parcel.writeInt(this.f110712N ? 1 : 0);
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
