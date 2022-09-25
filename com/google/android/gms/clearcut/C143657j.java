package com.google.android.gms.clearcut;

import android.os.SystemClock;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143854z;
import com.google.android.libraries.directboot.C20674d;
import com.google.common.base.C58881cr;
import com.google.common.p4552o.C60321oe;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.android.gms.clearcut.j */
/* compiled from: PG */
public final class C143657j {

    /* renamed from: a */
    public final C143658k f389459a;

    /* renamed from: b */
    public final C58881cr f389460b;

    /* renamed from: c */
    public final C58149a f389461c;

    /* renamed from: d */
    boolean f389462d;

    /* renamed from: e */
    public C60321oe f389463e;

    /* renamed from: f */
    public ArrayList f389464f;

    /* renamed from: g */
    public ArrayList f389465g;

    /* renamed from: h */
    public ArrayList f389466h;

    /* renamed from: i */
    public ArrayList f389467i;

    /* renamed from: j */
    public boolean f389468j;

    /* renamed from: k */
    public Set f389469k;

    /* renamed from: l */
    public String f389470l;

    /* renamed from: m */
    public String f389471m;

    /* renamed from: n */
    public C143623ad f389472n;

    /* renamed from: o */
    public int f389473o;

    public C143657j(C143658k kVar, C63088z zVar, C58881cr crVar) {
        C58149a aVar = (C58149a) C58150b.f155459k.createBuilder();
        this.f389461c = aVar;
        this.f389462d = false;
        this.f389463e = null;
        this.f389464f = null;
        this.f389465g = null;
        this.f389466h = null;
        this.f389467i = null;
        this.f389468j = true;
        this.f389459a = kVar;
        this.f389471m = kVar.f389487n;
        this.f389470l = kVar.f389488o;
        this.f389473o = kVar.f389489p;
        long currentTimeMillis = System.currentTimeMillis();
        aVar.copyOnWrite();
        C58150b bVar = (C58150b) aVar.instance;
        bVar.f155461a |= 1;
        bVar.f155462b = currentTimeMillis;
        long a = C143658k.m233372a(((C58150b) aVar.instance).f155462b);
        aVar.copyOnWrite();
        C58150b bVar2 = (C58150b) aVar.instance;
        bVar2.f155461a |= 65536;
        bVar2.f155467g = a;
        if (C20674d.m38855d(kVar.f389482i)) {
            aVar.copyOnWrite();
            C58150b bVar3 = (C58150b) aVar.instance;
            bVar3.f155461a |= 8388608;
            bVar3.f155469i = true;
        }
        if (SystemClock.elapsedRealtime() != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.copyOnWrite();
            C58150b bVar4 = (C58150b) aVar.instance;
            bVar4.f155461a |= 2;
            bVar4.f155463c = elapsedRealtime;
        }
        if (zVar != null) {
            aVar.copyOnWrite();
            C58150b bVar5 = (C58150b) aVar.instance;
            bVar5.f155461a |= 1024;
            bVar5.f155466f = zVar;
        }
        this.f389460b = crVar;
    }

    /* renamed from: a */
    public final C143854z mo118992a() {
        if (!this.f389462d) {
            this.f389462d = true;
            return this.f389459a.f389481h.mo118975a(this);
        }
        throw new IllegalStateException("do not reuse LogEventBuilder");
    }

    /* renamed from: b */
    public final void mo118993b(int[] iArr) {
        if (this.f389459a.mo119002k()) {
            throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
        } else if (iArr != null && (r0 = iArr.length) != 0) {
            if (this.f389466h == null) {
                this.f389466h = new ArrayList();
            }
            for (int valueOf : iArr) {
                this.f389466h.add(Integer.valueOf(valueOf));
            }
        }
    }

    /* renamed from: c */
    public final void mo118994c(String str) {
        if (!this.f389459a.mo119002k()) {
            if (this.f389465g == null) {
                this.f389465g = new ArrayList();
            }
            this.f389465g.add(str);
            return;
        }
        throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
    }

    /* renamed from: d */
    public final void mo118995d(int i) {
        if (this.f389464f == null) {
            this.f389464f = new ArrayList();
        }
        this.f389464f.add(Integer.valueOf(i));
    }

    /* renamed from: e */
    public final void mo118996e(String str) {
        if (this.f389459a.f389484k.contains(C143624ae.ACCOUNT_NAME)) {
            this.f389470l = str;
            return;
        }
        throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
    }

    /* renamed from: f */
    public final void mo118997f(String str) {
        if (!this.f389459a.mo119002k()) {
            C58149a aVar = this.f389461c;
            aVar.copyOnWrite();
            C58150b bVar = (C58150b) aVar.instance;
            C58150b bVar2 = C58150b.f155459k;
            str.getClass();
            bVar.f155461a |= 16777216;
            bVar.f155470j = str;
            return;
        }
        throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClearcutLogger.LogEventBuilder[uploadAccount: ");
        sb.append(this.f389470l);
        sb.append(", logSourceName: ");
        sb.append(this.f389471m);
        sb.append(", qosTier: ");
        int i = this.f389473o;
        int i2 = i - 1;
        String str = null;
        if (i != 0) {
            sb.append(i2);
            sb.append(", SourceExtensionByteStringProvider: ");
            sb.append(this.f389460b);
            sb.append(", veMessage: ");
            sb.append(this.f389463e);
            sb.append(", testCodes: ");
            ArrayList arrayList = this.f389464f;
            sb.append(arrayList != null ? C143658k.m233376g(arrayList) : null);
            sb.append(", mendelPackages: ");
            ArrayList arrayList2 = this.f389465g;
            sb.append(arrayList2 != null ? C143658k.m233376g(arrayList2) : null);
            sb.append(", experimentIds: ");
            ArrayList arrayList3 = this.f389466h;
            sb.append(arrayList3 != null ? C143658k.m233376g(arrayList3) : null);
            sb.append(", experimentTokens: ");
            ArrayList arrayList4 = this.f389467i;
            if (arrayList4 != null) {
                str = C143658k.m233376g(arrayList4);
            }
            sb.append(str);
            sb.append(", experimentTokensBytes: null, addPhenotype: ");
            C143840l lVar = C143658k.f389474a;
            sb.append(this.f389468j);
            sb.append(", logVerifier: ");
            sb.append(this.f389472n);
            sb.append("]");
            return sb.toString();
        }
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C143657j(C143658k kVar, byte[] bArr) {
        this(kVar, bArr != null ? C63088z.m96139A(bArr) : null, (C58881cr) null);
    }
}
