package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4552o.amo;

/* compiled from: PG */
public class ClientConfig implements Parcelable, C90964a {
    public static final Parcelable.Creator CREATOR = new C88485f();

    /* renamed from: a */
    public static final ClientConfig f236948a;

    /* renamed from: b */
    public final BitFlags f236949b;

    /* renamed from: c */
    public final BitFlags f236950c;

    /* renamed from: d */
    public final amo f236951d;

    /* renamed from: e */
    public final int f236952e;

    /* renamed from: f */
    public final String f236953f;

    /* renamed from: g */
    public final int f236954g;

    static {
        C88486g gVar = new C88486g();
        gVar.f239199a = 4398047069697L;
        gVar.f239201c = amo.HEADLESS;
        gVar.f239204f = "none";
        f236948a = new ClientConfig(gVar);
    }

    public ClientConfig(C88486g gVar) {
        this.f236949b = new BitFlags(ClientConfig.class, "FLAG_", gVar.f239199a);
        this.f236950c = new BitFlags(C88487h.class, "FLAG_", gVar.f239200b);
        amo amo = gVar.f239201c;
        amo.getClass();
        this.f236951d = amo;
        this.f236952e = gVar.f239202d;
        String str = gVar.f239204f;
        str.getClass();
        this.f236953f = str;
        this.f236954g = gVar.f239203e;
    }

    public ClientConfig(BitFlags bitFlags, BitFlags bitFlags2, amo amo, int i, String str, int i2) {
        this.f236949b = bitFlags;
        this.f236950c = bitFlags2;
        this.f236951d = amo;
        this.f236952e = i;
        this.f236953f = str;
        this.f236954g = i2;
    }

    /* renamed from: a */
    public static int m142636a(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return clientConfig.f236952e - clientConfig2.f236952e;
    }

    /* renamed from: A */
    public final boolean mo81871A() {
        return BitFlags.m148144f(this.f236949b.f253762b, 32);
    }

    /* renamed from: B */
    public final boolean mo81872B() {
        return BitFlags.m148144f(this.f236949b.f253762b, 70368744177664L);
    }

    /* renamed from: C */
    public final boolean mo81873C() {
        return BitFlags.m148144f(this.f236949b.f253762b, 2048);
    }

    /* renamed from: D */
    public final boolean mo81874D() {
        return BitFlags.m148144f(this.f236949b.f253762b, 4096);
    }

    /* renamed from: E */
    public final boolean mo81875E() {
        return BitFlags.m148144f(this.f236949b.f253762b, 8);
    }

    /* renamed from: F */
    public final boolean mo81876F() {
        return BitFlags.m148144f(this.f236949b.f253762b, 32768);
    }

    /* renamed from: G */
    public final boolean mo81877G() {
        return BitFlags.m148144f(this.f236949b.f253762b, 2);
    }

    /* renamed from: H */
    public final boolean mo81878H() {
        return BitFlags.m148144f(this.f236949b.f253762b, 512);
    }

    /* renamed from: I */
    public final boolean mo81879I() {
        return BitFlags.m148144f(this.f236949b.f253762b, 17592186044416L);
    }

    /* renamed from: J */
    public final boolean mo81880J() {
        return BitFlags.m148144f(this.f236949b.f253762b, 2251799813685248L);
    }

    /* renamed from: K */
    public final boolean mo81881K() {
        return BitFlags.m148144f(this.f236949b.f253762b, 524288);
    }

    /* renamed from: L */
    public final boolean mo81882L() {
        return BitFlags.m148144f(this.f236949b.f253762b, 1048576);
    }

    /* renamed from: M */
    public final boolean mo81883M() {
        return BitFlags.m148144f(this.f236949b.f253762b, 34359738368L);
    }

    /* renamed from: b */
    public final boolean mo81884b() {
        return BitFlags.m148144f(this.f236950c.f253762b, 16);
    }

    /* renamed from: c */
    public final boolean mo81885c() {
        return BitFlags.m148144f(this.f236949b.f253762b, 16777216);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo81887e() {
        return BitFlags.m148144f(this.f236949b.f253762b, 8589934592L);
    }

    /* renamed from: f */
    public final boolean mo81888f() {
        return BitFlags.m148144f(this.f236949b.f253762b, 137438953472L);
    }

    /* renamed from: g */
    public final boolean mo81889g() {
        return BitFlags.m148144f(this.f236949b.f253762b, 4);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ClientConfig");
        fVar.mo85279c("flags").mo85276a(C90752i.m148229c(this.f236949b.mo85048b()));
        fVar.mo85279c("suggest flags").mo85276a(C90752i.m148229c(this.f236950c.mo85048b()));
        fVar.mo85279c("client stats").mo85276a(C90752i.m148229c(this.f236951d.name()));
        fVar.mo85279c("session controller").mo85276a(C90752i.m148229c(this.f236953f));
    }

    /* renamed from: h */
    public final boolean mo81890h() {
        return BitFlags.m148144f(this.f236949b.f253762b, 256);
    }

    /* renamed from: i */
    public final boolean mo81891i() {
        return BitFlags.m148144f(this.f236949b.f253762b, 268435456);
    }

    /* renamed from: j */
    public final boolean mo81892j() {
        return BitFlags.m148144f(this.f236949b.f253762b, 67108864);
    }

    /* renamed from: k */
    public final boolean mo81893k() {
        return BitFlags.m148144f(this.f236949b.f253762b, 2147483648L);
    }

    /* renamed from: l */
    public final boolean mo81894l() {
        return BitFlags.m148144f(this.f236949b.f253762b, 4503599627370496L);
    }

    /* renamed from: m */
    public final boolean mo81895m() {
        return BitFlags.m148144f(this.f236949b.f253762b, 8796093022208L);
    }

    /* renamed from: n */
    public final boolean mo81896n() {
        return BitFlags.m148144f(this.f236949b.f253762b, 536870912);
    }

    /* renamed from: o */
    public final boolean mo81897o() {
        return BitFlags.m148144f(this.f236949b.f253762b, 140737488355328L);
    }

    /* renamed from: p */
    public final boolean mo81898p() {
        return this.f236951d.equals(amo.ANDROID_AUTO_EMBEDDED);
    }

    /* renamed from: q */
    public final boolean mo81899q() {
        return this.f236951d.equals(amo.BISTO);
    }

    /* renamed from: r */
    public final boolean mo81900r() {
        return BitFlags.m148144f(this.f236949b.f253762b, 33554432);
    }

    /* renamed from: s */
    public final boolean mo81901s() {
        return BitFlags.m148144f(this.f236949b.f253762b, 64);
    }

    /* renamed from: t */
    public final boolean mo81902t() {
        return BitFlags.m148144f(this.f236949b.f253762b, 1);
    }

    public final String toString() {
        String b = this.f236949b.mo85048b();
        String b2 = this.f236950c.mo85048b();
        String name = this.f236951d.name();
        String str = this.f236953f;
        int i = this.f236954g;
        return "ClientConfig[mFlags=" + b + " mSuggestFlags=" + b2 + " mClientId=" + name + " mSessionType=" + str + " publicSearchServiceCallerUid=" + i + "]";
    }

    /* renamed from: u */
    public final boolean mo81904u() {
        return this.f236951d.equals(amo.OPA_ANDROID);
    }

    /* renamed from: v */
    public final boolean mo81905v() {
        return this.f236951d.equals(amo.TI_SID_ENROLLMENT);
    }

    /* renamed from: w */
    public final boolean mo81906w() {
        return BitFlags.m148144f(this.f236949b.f253762b, 128);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f236949b, 0);
        parcel.writeParcelable(this.f236950c, 0);
        parcel.writeInt(this.f236951d.f159234au);
        parcel.writeInt(this.f236952e);
        parcel.writeString(this.f236953f);
        parcel.writeInt(this.f236954g);
    }

    /* renamed from: x */
    public final boolean mo81908x() {
        return BitFlags.m148144f(this.f236949b.f253762b, 131072);
    }

    /* renamed from: y */
    public final boolean mo81909y() {
        return BitFlags.m148144f(this.f236949b.f253762b, 8192);
    }

    /* renamed from: z */
    public final boolean mo81910z() {
        return BitFlags.m148144f(this.f236949b.f253762b, 16384);
    }
}
