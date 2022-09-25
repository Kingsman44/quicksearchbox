package com.google.android.apps.search.assistant.surfaces.p9485e.p9486a;

import kotlinx.coroutines.p5574b.C71588o;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69645ab;
import p5462h.p5473f.p5475b.C69646ac;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.a.al */
/* compiled from: PG */
final class C126384al implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C69645ab f348107a;

    /* renamed from: b */
    final /* synthetic */ C69646ac f348108b;

    /* renamed from: c */
    final /* synthetic */ int f348109c;

    /* renamed from: d */
    final /* synthetic */ C71588o f348110d;

    public C126384al(C69645ab abVar, C69646ac acVar, int i, C71588o oVar) {
        this.f348107a = abVar;
        this.f348108b = acVar;
        this.f348109c = i;
        this.f348110d = oVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        return mo107581b(((C126378af) obj).f348087a, gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107581b(double r10, p5462h.p5466c.C69577g r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126383ak
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.surfaces.e.a.ak r0 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126383ak) r0
            int r1 = r0.f348106d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f348106d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.e.a.ak r0 = new com.google.android.apps.search.assistant.surfaces.e.a.ak
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f348104b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f348106d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            java.lang.Object r10 = r0.f348103a
            p5462h.C69714l.m101134b(r12)
            goto L_0x00a8
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0033:
            p5462h.C69714l.m101134b(r12)
            h.f.b.ab r12 = r9.f348107a
            double r5 = r12.f186024a
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x004b
            r7 = 4607173411600762667(0x3feff7ced916872b, double:0.999)
            double r5 = r5 * r7
            r7 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            goto L_0x0057
        L_0x004b:
            r7 = 4606732058837280358(0x3fee666666666666, double:0.95)
            double r5 = r5 * r7
            r7 = 4587366580439587226(0x3fa999999999999a, double:0.05)
        L_0x0057:
            double r7 = r7 * r10
            double r5 = r5 + r7
            r12.f186024a = r5
            h.f.b.ac r12 = r9.f348108b
            int r2 = r12.f186025a
            int r2 = r2 + r4
            r12.f186025a = r2
            int r12 = r9.f348109c
            if (r2 != r12) goto L_0x00b0
            kotlinx.coroutines.b.o r12 = r9.f348110d
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0097
            double r10 = r10 / r5
            r5 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0097
            double r10 = java.lang.Math.log10(r10)
            r5 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r10 = r10 * r5
            r7 = -4611686018427387904(0xc000000000000000, double:-2.0)
            double r10 = java.lang.Math.max(r10, r7)
            double r10 = java.lang.Math.min(r10, r5)
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r10 + r5
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r10 = r10 * r5
            r5 = 4622945017495814144(0x4028000000000000, double:12.0)
            double r10 = r10 / r5
            int r10 = (int) r10
            goto L_0x0098
        L_0x0097:
            r10 = 0
        L_0x0098:
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            r0.f348103a = r9
            r0.f348106d = r4
            java.lang.Object r10 = r12.mo20883a(r11, r0)
            if (r10 == r1) goto L_0x00af
            r10 = r9
        L_0x00a8:
            com.google.android.apps.search.assistant.surfaces.e.a.al r10 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126384al) r10
            h.f.b.ac r10 = r10.f348108b
            r10.f186025a = r3
            goto L_0x00b0
        L_0x00af:
            return r1
        L_0x00b0:
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126384al.mo107581b(double, h.c.g):java.lang.Object");
    }
}
