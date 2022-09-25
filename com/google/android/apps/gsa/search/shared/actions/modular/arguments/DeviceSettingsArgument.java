package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.base.C58838bb;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55175iq;
import com.google.p4152bb.p4153a.C55211jz;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55226kn;
import com.google.p4152bb.p4153a.C55228kp;
import com.google.p4152bb.p4153a.C55230kr;
import com.google.p4152bb.p4153a.C55231ks;
import com.google.p4152bb.p4153a.C55308no;
import com.google.p4152bb.p4153a.C55309np;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* compiled from: PG */
public class DeviceSettingsArgument extends Argument {
    public static final Parcelable.Creator CREATOR = new C87443g();

    /* renamed from: i */
    public boolean f236155i;

    /* renamed from: j */
    public boolean f236156j;

    /* renamed from: k */
    public int f236157k;

    /* renamed from: l */
    public boolean f236158l;

    /* renamed from: m */
    public int f236159m;

    /* renamed from: n */
    public C55175iq f236160n;

    /* renamed from: o */
    public final int f236161o;

    /* renamed from: p */
    public int f236162p = 1;

    /* renamed from: q */
    private C55309np f236163q;

    private DeviceSettingsArgument(DeviceSettingsArgument deviceSettingsArgument, int i) {
        super((Argument) deviceSettingsArgument, i);
        this.f236161o = deviceSettingsArgument.f236161o;
        this.f236155i = deviceSettingsArgument.f236155i;
        this.f236162p = deviceSettingsArgument.f236162p;
        this.f236157k = deviceSettingsArgument.f236157k;
        this.f236160n = deviceSettingsArgument.f236160n;
    }

    /* renamed from: C */
    public final boolean mo81263C() {
        return this.f236161o != 1;
    }

    /* renamed from: a */
    public final int mo81296a() {
        C58838bb.m90883r(this.f236161o == 7);
        C55309np npVar = this.f236163q;
        if (npVar == null || npVar.f145713a.size() == 0) {
            return 3;
        }
        int a = C55308no.m87664a(this.f236163q.f145713a.mo58914d(0));
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 3 : 1;
        }
        return 4;
    }

    /* renamed from: b */
    public final void mo81297b(int i) {
        this.f236162p = 6;
        this.f236157k = i;
    }

    /* renamed from: c */
    public final C87429c mo81250c(C87449m mVar, C55134hc hcVar, Resources resources) {
        C55133hb a = C55133hb.m87600a(hcVar.f145123c);
        if (a == null) {
            a = C55133hb.NONE;
        }
        return a == C55133hb.SETTING_ENABLED ? new C87429c(this.f236155i) : C87429c.f236122a;
    }

    /* renamed from: hB */
    public final boolean mo81260hB() {
        return false;
    }

    /* renamed from: m */
    public final Argument mo81278m(int i) {
        return new DeviceSettingsArgument(this, i);
    }

    /* renamed from: n */
    public final C55213ka mo81279n() {
        C55226kn knVar = (C55226kn) C55231ks.f145410h.createBuilder();
        int i = this.f236161o;
        knVar.copyOnWrite();
        C55231ks ksVar = (C55231ks) knVar.instance;
        ksVar.f145414b = i - 1;
        ksVar.f145413a |= 1;
        boolean z = this.f236155i;
        knVar.copyOnWrite();
        C55231ks ksVar2 = (C55231ks) knVar.instance;
        ksVar2.f145413a |= 2;
        ksVar2.f145415c = z;
        int i2 = this.f236162p;
        knVar.copyOnWrite();
        C55231ks ksVar3 = (C55231ks) knVar.instance;
        int i3 = i2 - 1;
        if (i2 != 0) {
            ksVar3.f145416d = i3;
            ksVar3.f145413a |= 4;
            int i4 = this.f236157k;
            knVar.copyOnWrite();
            C55231ks ksVar4 = (C55231ks) knVar.instance;
            ksVar4.f145413a |= 8;
            ksVar4.f145417e = i4;
            int i5 = this.f236159m;
            knVar.copyOnWrite();
            C55231ks ksVar5 = (C55231ks) knVar.instance;
            ksVar5.f145413a |= 16;
            ksVar5.f145418f = i5;
            if (this.f236163q != null) {
                knVar.mo58885m(C55309np.f145711c, this.f236163q);
            }
            C55211jz jzVar = (C55211jz) super.mo81279n().toBuilder();
            jzVar.mo58885m(C55231ks.f145411i, (C55231ks) knVar.build());
            return (C55213ka) jzVar.build();
        }
        throw null;
    }

    /* renamed from: p */
    public final Object mo81281p(C87440d dVar) {
        return dVar.mo81355b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147140k(mo81279n(), parcel);
    }

    public DeviceSettingsArgument(C55213ka kaVar) {
        super(kaVar);
        Object obj;
        Object obj2;
        C55175iq iqVar;
        boolean z = true;
        C62940bt r1 = C62942bv.checkIsLite(C55231ks.f145411i);
        kaVar.mo58887l(r1);
        Object l = kaVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C55231ks ksVar = (C55231ks) obj;
        C62940bt r12 = C62942bv.checkIsLite(C55309np.f145711c);
        ksVar.mo58887l(r12);
        Object l2 = ksVar.f169962ag.mo58854l(r12.f169971d);
        if (l2 == null) {
            obj2 = r12.f169969b;
        } else {
            obj2 = r12.mo58889c(l2);
        }
        this.f236163q = (C55309np) obj2;
        int a = C55228kp.m87625a(ksVar.f145414b);
        this.f236161o = a == 0 ? 1 : a;
        this.f236155i = ksVar.f145415c;
        int a2 = C55230kr.m87626a(ksVar.f145416d);
        this.f236162p = a2 == 0 ? 1 : a2;
        int i = ksVar.f145413a;
        this.f236156j = (i & 8) != 0;
        this.f236157k = ksVar.f145417e;
        this.f236158l = (i & 16) == 0 ? false : z;
        this.f236159m = ksVar.f145418f;
        if ((i & 32) != 0) {
            iqVar = ksVar.f145419g;
            if (iqVar == null) {
                iqVar = C55175iq.f145251b;
            }
        } else {
            iqVar = null;
        }
        this.f236160n = iqVar;
    }
}
