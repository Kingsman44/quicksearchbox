package kotlinx.coroutines;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.cu */
/* compiled from: PG */
public abstract class C71648cu extends C71398ae implements C71615bp, C71636ci {

    /* renamed from: d */
    public C71665da f191086d;

    /* renamed from: e */
    public final C71665da mo62883e() {
        C71665da daVar = this.f191086d;
        if (daVar != null) {
            return daVar;
        }
        C69664n.m101065k("job");
        return null;
    }

    /* renamed from: lS */
    public final C71670df mo62840lS() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c A[ADDED_TO_REGION] */
    /* renamed from: lT */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62732lT() {
        /*
            r4 = this;
            kotlinx.coroutines.da r0 = r4.mo62883e()
        L_0x0004:
            java.lang.Object r1 = r0.mo62913mh()
            boolean r2 = r1 instanceof kotlinx.coroutines.C71648cu
            if (r2 == 0) goto L_0x001a
            if (r1 == r4) goto L_0x000f
            goto L_0x0029
        L_0x000f:
            kotlinx.a.e r2 = r0.f191118d
            kotlinx.coroutines.bs r3 = kotlinx.coroutines.C71666db.f191125g
            boolean r1 = r2.mo62679d(r1, r3)
            if (r1 == 0) goto L_0x0004
            goto L_0x0029
        L_0x001a:
            boolean r0 = r1 instanceof kotlinx.coroutines.C71636ci
            if (r0 == 0) goto L_0x0029
            kotlinx.coroutines.ci r1 = (kotlinx.coroutines.C71636ci) r1
            kotlinx.coroutines.df r0 = r1.mo62840lS()
            if (r0 == 0) goto L_0x0029
            r4.mo62944lV()
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71648cu.mo62732lT():void");
    }

    /* renamed from: lU */
    public final boolean mo62841lU() {
        return true;
    }

    public final String toString() {
        String a = C71601bb.m104526a(this);
        String b = C71601bb.m104527b(this);
        String b2 = C71601bb.m104527b(mo62883e());
        return a + "@" + b + "[job@" + b2 + "]";
    }
}
