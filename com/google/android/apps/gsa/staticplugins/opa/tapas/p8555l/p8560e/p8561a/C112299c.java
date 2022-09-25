package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a;

import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5185c.C66310a;
import com.google.research.p5181a.p5185c.C66312c;
import com.google.research.p5181a.p5185c.C66313d;
import com.google.research.p5181a.p5185c.C66316g;
import com.google.research.p5181a.p5185c.C66317h;
import com.google.research.p5181a.p5185c.C66318i;
import com.google.research.p5181a.p5185c.C66319j;
import com.google.research.p5181a.p5185c.C66321l;
import com.google.research.p5181a.p5185c.C66322m;
import com.google.research.p5181a.p5185c.C66323n;
import com.google.research.p5181a.p5186d.C66343o;
import com.google.research.p5181a.p5188f.C66376a;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.a.c */
/* compiled from: PG */
public final class C112299c extends C66316g implements C66323n {

    /* renamed from: a */
    public final List f311638a = new ArrayList();

    /* renamed from: b */
    public C66323n f311639b = null;

    /* renamed from: c */
    public int f311640c = 0;

    public C112299c() {
        this.f180330k.clear();
    }

    /* renamed from: g */
    public static C112299c m186142g() {
        C112299c cVar = new C112299c();
        cVar.mo99489h(new C66310a());
        cVar.mo99489h(new C66319j());
        cVar.mo99489h(new C66313d());
        cVar.mo99489h(new C66321l());
        cVar.mo99489h(new C66318i());
        cVar.mo99489h(new C66312c());
        cVar.mo99489h(new C66322m());
        cVar.mo99489h(new C66317h());
        return cVar;
    }

    /* renamed from: a */
    public final int mo59505a() {
        return this.f311640c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C66343o mo59507c(C66278a aVar, C66376a aVar2) {
        C66343o oVar = new C66343o(1, this.f311640c);
        int i = 0;
        for (C66316g gVar : this.f311638a) {
            double[] dArr = gVar.mo59527p(aVar, aVar2).f180409c;
            for (int i2 = 0; i2 < dArr.length; i2++) {
                oVar.f180409c[i2 + i] = dArr[i2];
            }
            i += gVar.mo59505a();
        }
        return oVar;
    }

    /* renamed from: d */
    public final String mo59509d() {
        return "aggregator";
    }

    /* renamed from: e */
    public final int mo99487e() {
        return this.f311638a.size();
    }

    /* renamed from: f */
    public final C112299c clone() {
        C112299c cVar = new C112299c();
        for (C66316g b : this.f311638a) {
            cVar.mo99489h(b.clone());
        }
        return cVar;
    }

    /* renamed from: h */
    public final void mo99489h(C66316g gVar) {
        this.f311638a.add(gVar);
        gVar.mo59526l(this);
        this.f311640c += gVar.mo59505a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59514i(java.io.DataInputStream r9) {
        /*
            r8 = this;
            java.util.List r0 = r8.f311638a
            r0.clear()
            r0 = 0
            r8.f311640c = r0
            int r1 = r9.readInt()
            r2 = 0
        L_0x000d:
            if (r2 >= r1) goto L_0x007e
            java.lang.String r3 = r9.readUTF()
            com.google.research.a.c.g r4 = com.google.research.p5181a.p5185c.C66316g.m96951o(r3)
            if (r4 != 0) goto L_0x0075
            int r4 = r3.hashCode()
            r5 = -1822088061(0xffffffff93652483, float:-2.8921865E-27)
            r6 = 2
            r7 = 1
            if (r4 == r5) goto L_0x0043
            r5 = -1024363476(0xffffffffc2f1742c, float:-120.7269)
            if (r4 == r5) goto L_0x0039
            r5 = 1541155077(0x5bdc2905, float:1.23939193E17)
            if (r4 == r5) goto L_0x002f
            goto L_0x004d
        L_0x002f:
            java.lang.String r4 = "FOREGROUND_APP"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x004d
            r4 = 0
            goto L_0x004e
        L_0x0039:
            java.lang.String r4 = "BATTERY_PERCENTAGE"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x004d
            r4 = 2
            goto L_0x004e
        L_0x0043:
            java.lang.String r4 = "BATTERY_CHARGING"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = -1
        L_0x004e:
            if (r4 == 0) goto L_0x0070
            if (r4 == r7) goto L_0x006a
            if (r4 != r6) goto L_0x005a
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.a.b r4 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.a.b
            r4.<init>()
            goto L_0x0075
        L_0x005a:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Cannot find extractor with "
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            r9.<init>(r0)
            throw r9
        L_0x006a:
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.a.a r4 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.a.a
            r4.<init>()
            goto L_0x0075
        L_0x0070:
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.a.d r4 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.a.d
            r4.<init>()
        L_0x0075:
            r4.mo59514i(r9)
            r8.mo99489h(r4)
            int r2 = r2 + 1
            goto L_0x000d
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a.C112299c.mo59514i(java.io.DataInputStream):void");
    }

    /* renamed from: j */
    public final void mo59523j(C66316g gVar, int i) {
        C66316g gVar2;
        Iterator it = this.f311638a.iterator();
        int i2 = 0;
        while (it.hasNext() && (gVar2 = (C66316g) it.next()) != gVar) {
            i2 += gVar2.mo59505a();
        }
        int i3 = i + i2;
        C66323n nVar = this.f311639b;
        if (nVar != null) {
            nVar.mo59523j(this, i3);
        }
    }

    /* renamed from: k */
    public final void mo59516k(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.f311638a.size());
        for (C66316g gVar : this.f311638a) {
            String q = C66316g.m96952q(gVar);
            if (q == null) {
                q = gVar.mo59509d();
            }
            dataOutputStream.writeUTF(q);
            gVar.mo59516k(dataOutputStream);
        }
    }

    /* renamed from: l */
    public final void mo59526l(C66323n nVar) {
        this.f311639b = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo59524m(boolean z) {
        for (C66316g gVar : this.f311638a) {
            this.f180330k.putAll(gVar.f180330k);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (C66316g append : this.f311638a) {
            sb.append(append);
        }
        return sb.toString();
    }
}
