package androidx.constraintlayout.p079a.p082b;

import androidx.constraintlayout.p079a.C1649d;
import androidx.constraintlayout.p079a.C1654i;
import androidx.constraintlayout.p079a.p082b.p083a.C1617b;
import androidx.constraintlayout.p079a.p082b.p083a.C1618c;
import androidx.constraintlayout.p079a.p082b.p083a.C1621f;
import androidx.constraintlayout.widget.C1746e;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.a.b.g */
/* compiled from: PG */
public final class C1639g extends C1647o {

    /* renamed from: a */
    public final C1618c f4671a = new C1618c(this);

    /* renamed from: aN */
    public final C1649d f4672aN = new C1649d();

    /* renamed from: aO */
    public int f4673aO;

    /* renamed from: aP */
    public int f4674aP;

    /* renamed from: aQ */
    public int f4675aQ = 0;

    /* renamed from: aR */
    public int f4676aR = 0;

    /* renamed from: aS */
    C1635c[] f4677aS = new C1635c[4];

    /* renamed from: aT */
    C1635c[] f4678aT = new C1635c[4];

    /* renamed from: aU */
    public int f4679aU = 257;

    /* renamed from: aV */
    public boolean f4680aV = false;

    /* renamed from: aW */
    public boolean f4681aW = false;

    /* renamed from: aX */
    public WeakReference f4682aX = null;

    /* renamed from: aY */
    public WeakReference f4683aY = null;

    /* renamed from: aZ */
    public WeakReference f4684aZ = null;

    /* renamed from: b */
    public final C1621f f4685b = new C1621f(this);

    /* renamed from: ba */
    public WeakReference f4686ba = null;

    /* renamed from: bb */
    final HashSet f4687bb = new HashSet();

    /* renamed from: bc */
    public final C1617b f4688bc = new C1617b();

    /* renamed from: bd */
    public C1746e f4689bd = null;

    /* renamed from: c */
    public int f4690c;

    /* renamed from: d */
    public boolean f4691d = false;

    /* renamed from: S */
    public static void m4445S(C1638f fVar, C1746e eVar, C1617b bVar) {
        int i;
        int i2;
        if (eVar != null) {
            if (fVar.f4637aq == 8 || (fVar instanceof C1642j) || (fVar instanceof C1615a)) {
                bVar.f4490e = 0;
                bVar.f4491f = 0;
                return;
            }
            C1637e[] eVarArr = fVar.f4605Y;
            bVar.f4486a = eVarArr[0];
            bVar.f4487b = eVarArr[1];
            bVar.f4488c = fVar.mo4631i();
            bVar.f4489d = fVar.mo4630h();
            bVar.f4494i = false;
            bVar.f4495j = 0;
            boolean z = bVar.f4486a == C1637e.MATCH_CONSTRAINT;
            boolean z2 = bVar.f4487b == C1637e.MATCH_CONSTRAINT;
            boolean z3 = z && fVar.f4623ac > 0.0f;
            boolean z4 = z2 && fVar.f4623ac > 0.0f;
            if (z && fVar.mo4621G(0) && fVar.f4664t == 0 && !z3) {
                bVar.f4486a = C1637e.WRAP_CONTENT;
                if (z2 && fVar.f4665u == 0) {
                    bVar.f4486a = C1637e.FIXED;
                }
                z = false;
            }
            if (z2 && fVar.mo4621G(1) && fVar.f4665u == 0 && !z4) {
                bVar.f4487b = C1637e.WRAP_CONTENT;
                if (z && fVar.f4664t == 0) {
                    bVar.f4487b = C1637e.FIXED;
                }
                z2 = false;
            }
            if (fVar.mo4564f()) {
                bVar.f4486a = C1637e.FIXED;
                z = false;
            }
            if (fVar.mo4565g()) {
                bVar.f4487b = C1637e.FIXED;
                z2 = false;
            }
            if (z3) {
                if (fVar.f4666v[0] == 4) {
                    bVar.f4486a = C1637e.FIXED;
                } else if (!z2) {
                    if (bVar.f4487b == C1637e.FIXED) {
                        i2 = bVar.f4489d;
                    } else {
                        bVar.f4486a = C1637e.WRAP_CONTENT;
                        eVar.mo4865a(fVar, bVar);
                        i2 = bVar.f4491f;
                    }
                    bVar.f4486a = C1637e.FIXED;
                    bVar.f4488c = (int) (fVar.f4623ac * ((float) i2));
                }
            }
            if (z4) {
                if (fVar.f4666v[1] == 4) {
                    bVar.f4487b = C1637e.FIXED;
                } else if (!z) {
                    if (bVar.f4486a == C1637e.FIXED) {
                        i = bVar.f4488c;
                    } else {
                        bVar.f4487b = C1637e.WRAP_CONTENT;
                        eVar.mo4865a(fVar, bVar);
                        i = bVar.f4490e;
                    }
                    bVar.f4487b = C1637e.FIXED;
                    if (fVar.f4624ad == -1) {
                        bVar.f4489d = (int) (((float) i) / fVar.f4623ac);
                    } else {
                        bVar.f4489d = (int) (fVar.f4623ac * ((float) i));
                    }
                }
            }
            eVar.mo4865a(fVar, bVar);
            fVar.mo4618D(bVar.f4490e);
            fVar.mo4648z(bVar.f4491f);
            fVar.f4589I = bVar.f4493h;
            fVar.mo4645w(bVar.f4492g);
            bVar.f4495j = 0;
            boolean z5 = bVar.f4494i;
        }
    }

    /* renamed from: V */
    private final void m4446V(C1636d dVar, C1654i iVar) {
        this.f4672aN.mo4679g(iVar, this.f4672aN.mo4674b(dVar), 0, 5);
    }

    /* renamed from: W */
    private final void m4447W(C1636d dVar, C1654i iVar) {
        this.f4672aN.mo4679g(this.f4672aN.mo4674b(dVar), iVar, 0, 5);
    }

    /* renamed from: X */
    private final void m4448X() {
        this.f4675aQ = 0;
        this.f4676aR = 0;
    }

    /* renamed from: E */
    public final void mo4619E(boolean z, boolean z2) {
        super.mo4619E(z, z2);
        int size = this.f4756be.size();
        for (int i = 0; i < size; i++) {
            ((C1638f) this.f4756be.get(i)).mo4619E(z, z2);
        }
    }

    /* renamed from: P */
    public final void mo4649P(int i) {
        this.f4679aU = i;
        C1649d.f4760a = mo4650Q(512);
    }

    /* renamed from: Q */
    public final boolean mo4650Q(int i) {
        return (this.f4679aU & i) == i;
    }

    /* renamed from: R */
    public final void mo4651R(C1746e eVar) {
        this.f4689bd = eVar;
        this.f4685b.f4507g = eVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r3v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r24v22 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x05c7  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x05e6  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x05fc  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x061c  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x061e  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x062a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0644  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0646  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x064f  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:549:0x095a  */
    /* JADX WARNING: Removed duplicated region for block: B:558:0x097b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:577:0x09fa  */
    /* JADX WARNING: Removed duplicated region for block: B:580:0x0a17  */
    /* JADX WARNING: Removed duplicated region for block: B:581:0x0a25  */
    /* JADX WARNING: Removed duplicated region for block: B:583:0x0a28  */
    /* JADX WARNING: Removed duplicated region for block: B:597:0x0a68  */
    /* JADX WARNING: Removed duplicated region for block: B:598:0x0a6a  */
    /* JADX WARNING: Removed duplicated region for block: B:602:0x0a7a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4653d() {
        /*
            r26 = this;
            r7 = r26
            r8 = 0
            r7.f4625ae = r8
            r7.f4626af = r8
            r7.f4680aV = r8
            r7.f4681aW = r8
            java.util.ArrayList r0 = r7.f4756be
            int r9 = r0.size()
            int r0 = r26.mo4631i()
            int r0 = java.lang.Math.max(r8, r0)
            int r1 = r26.mo4630h()
            int r1 = java.lang.Math.max(r8, r1)
            androidx.constraintlayout.a.b.e[] r2 = r7.f4605Y
            r10 = 1
            r11 = r2[r10]
            r12 = r2[r8]
            int r2 = r7.f4690c
            if (r2 != 0) goto L_0x0236
            int r2 = r7.f4679aU
            boolean r2 = androidx.constraintlayout.p079a.p082b.C1644l.m4482b(r2, r10)
            if (r2 == 0) goto L_0x0236
            androidx.constraintlayout.widget.e r2 = r7.f4689bd
            androidx.constraintlayout.a.b.e[] r3 = r7.f4605Y
            r4 = r3[r8]
            r3 = r3[r10]
            androidx.constraintlayout.p079a.p082b.p083a.C1624i.f4523b = r8
            androidx.constraintlayout.p079a.p082b.p083a.C1624i.f4524c = r8
            r26.mo4643u()
            java.util.ArrayList r5 = r7.f4756be
            int r6 = r5.size()
            r14 = 0
        L_0x004a:
            if (r14 >= r6) goto L_0x0058
            java.lang.Object r15 = r5.get(r14)
            androidx.constraintlayout.a.b.f r15 = (androidx.constraintlayout.p079a.p082b.C1638f) r15
            r15.mo4643u()
            int r14 = r14 + 1
            goto L_0x004a
        L_0x0058:
            boolean r14 = r7.f4691d
            androidx.constraintlayout.a.b.e r15 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            if (r4 != r15) goto L_0x0066
            int r4 = r26.mo4631i()
            r7.mo4646x(r8, r4)
            goto L_0x006d
        L_0x0066:
            androidx.constraintlayout.a.b.d r4 = r7.f4594N
            r4.mo4605f(r8)
            r7.f4625ae = r8
        L_0x006d:
            r4 = 0
            r15 = 0
            r16 = 0
        L_0x0071:
            r17 = 1056964608(0x3f000000, float:0.5)
            if (r4 >= r6) goto L_0x00ce
            java.lang.Object r18 = r5.get(r4)
            r8 = r18
            androidx.constraintlayout.a.b.f r8 = (androidx.constraintlayout.p079a.p082b.C1638f) r8
            boolean r13 = r8 instanceof androidx.constraintlayout.p079a.p082b.C1642j
            if (r13 == 0) goto L_0x00bc
            androidx.constraintlayout.a.b.j r8 = (androidx.constraintlayout.p079a.p082b.C1642j) r8
            int r13 = r8.f4737aO
            if (r13 != r10) goto L_0x00ca
            int r13 = r8.f4739b
            r15 = -1
            if (r13 == r15) goto L_0x0091
            r8.mo4663a(r13)
        L_0x008f:
            r15 = 1
            goto L_0x00ca
        L_0x0091:
            int r13 = r8.f4740c
            if (r13 == r15) goto L_0x00a6
            boolean r13 = r26.mo4564f()
            if (r13 == 0) goto L_0x00a6
            int r13 = r26.mo4631i()
            int r15 = r8.f4740c
            int r13 = r13 - r15
            r8.mo4663a(r13)
            goto L_0x008f
        L_0x00a6:
            boolean r13 = r26.mo4564f()
            if (r13 == 0) goto L_0x008f
            float r13 = r8.f4735a
            int r15 = r26.mo4631i()
            float r15 = (float) r15
            float r13 = r13 * r15
            float r13 = r13 + r17
            int r13 = (int) r13
            r8.mo4663a(r13)
            goto L_0x008f
        L_0x00bc:
            boolean r13 = r8 instanceof androidx.constraintlayout.p079a.p082b.C1615a
            if (r13 == 0) goto L_0x00ca
            androidx.constraintlayout.a.b.a r8 = (androidx.constraintlayout.p079a.p082b.C1615a) r8
            int r8 = r8.mo4559a()
            if (r8 != 0) goto L_0x00ca
            r16 = 1
        L_0x00ca:
            int r4 = r4 + 1
            r8 = 0
            goto L_0x0071
        L_0x00ce:
            if (r15 == 0) goto L_0x00ec
            r4 = 0
        L_0x00d1:
            if (r4 >= r6) goto L_0x00ec
            java.lang.Object r8 = r5.get(r4)
            androidx.constraintlayout.a.b.f r8 = (androidx.constraintlayout.p079a.p082b.C1638f) r8
            boolean r13 = r8 instanceof androidx.constraintlayout.p079a.p082b.C1642j
            if (r13 == 0) goto L_0x00e8
            androidx.constraintlayout.a.b.j r8 = (androidx.constraintlayout.p079a.p082b.C1642j) r8
            int r13 = r8.f4737aO
            if (r13 != r10) goto L_0x00e8
            r13 = 0
            androidx.constraintlayout.p079a.p082b.p083a.C1624i.m4335a(r13, r8, r2, r14)
            goto L_0x00e9
        L_0x00e8:
            r13 = 0
        L_0x00e9:
            int r4 = r4 + 1
            goto L_0x00d1
        L_0x00ec:
            r13 = 0
            androidx.constraintlayout.p079a.p082b.p083a.C1624i.m4335a(r13, r7, r2, r14)
            if (r16 == 0) goto L_0x010e
            r4 = 0
        L_0x00f3:
            if (r4 >= r6) goto L_0x010e
            java.lang.Object r8 = r5.get(r4)
            androidx.constraintlayout.a.b.f r8 = (androidx.constraintlayout.p079a.p082b.C1638f) r8
            boolean r15 = r8 instanceof androidx.constraintlayout.p079a.p082b.C1615a
            if (r15 == 0) goto L_0x010a
            androidx.constraintlayout.a.b.a r8 = (androidx.constraintlayout.p079a.p082b.C1615a) r8
            int r15 = r8.mo4559a()
            if (r15 != 0) goto L_0x010a
            androidx.constraintlayout.p079a.p082b.p083a.C1624i.m4338d(r8, r2, r13, r14)
        L_0x010a:
            int r4 = r4 + 1
            r13 = 0
            goto L_0x00f3
        L_0x010e:
            androidx.constraintlayout.a.b.e r4 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            if (r3 != r4) goto L_0x011c
            int r3 = r26.mo4630h()
            r4 = 0
            r7.mo4647y(r4, r3)
            r3 = 0
            goto L_0x0126
        L_0x011c:
            r4 = 0
            androidx.constraintlayout.a.b.d r3 = r7.f4595O
            r3.mo4605f(r4)
            r7.f4626af = r4
            r3 = 0
            r4 = 0
        L_0x0126:
            r8 = 0
        L_0x0127:
            if (r4 >= r6) goto L_0x017e
            java.lang.Object r13 = r5.get(r4)
            androidx.constraintlayout.a.b.f r13 = (androidx.constraintlayout.p079a.p082b.C1638f) r13
            boolean r15 = r13 instanceof androidx.constraintlayout.p079a.p082b.C1642j
            if (r15 == 0) goto L_0x016e
            androidx.constraintlayout.a.b.j r13 = (androidx.constraintlayout.p079a.p082b.C1642j) r13
            int r15 = r13.f4737aO
            if (r15 != 0) goto L_0x017b
            int r3 = r13.f4739b
            r15 = -1
            if (r3 == r15) goto L_0x0143
            r13.mo4663a(r3)
        L_0x0141:
            r3 = 1
            goto L_0x017b
        L_0x0143:
            int r3 = r13.f4740c
            if (r3 == r15) goto L_0x0158
            boolean r3 = r26.mo4565g()
            if (r3 == 0) goto L_0x0158
            int r3 = r26.mo4630h()
            int r15 = r13.f4740c
            int r3 = r3 - r15
            r13.mo4663a(r3)
            goto L_0x0141
        L_0x0158:
            boolean r3 = r26.mo4565g()
            if (r3 == 0) goto L_0x0141
            float r3 = r13.f4735a
            int r15 = r26.mo4630h()
            float r15 = (float) r15
            float r3 = r3 * r15
            float r3 = r3 + r17
            int r3 = (int) r3
            r13.mo4663a(r3)
            goto L_0x0141
        L_0x016e:
            boolean r15 = r13 instanceof androidx.constraintlayout.p079a.p082b.C1615a
            if (r15 == 0) goto L_0x017b
            androidx.constraintlayout.a.b.a r13 = (androidx.constraintlayout.p079a.p082b.C1615a) r13
            int r13 = r13.mo4559a()
            if (r13 != r10) goto L_0x017b
            r8 = 1
        L_0x017b:
            int r4 = r4 + 1
            goto L_0x0127
        L_0x017e:
            if (r3 == 0) goto L_0x0199
            r3 = 0
        L_0x0181:
            if (r3 >= r6) goto L_0x0199
            java.lang.Object r4 = r5.get(r3)
            androidx.constraintlayout.a.b.f r4 = (androidx.constraintlayout.p079a.p082b.C1638f) r4
            boolean r13 = r4 instanceof androidx.constraintlayout.p079a.p082b.C1642j
            if (r13 == 0) goto L_0x0196
            androidx.constraintlayout.a.b.j r4 = (androidx.constraintlayout.p079a.p082b.C1642j) r4
            int r13 = r4.f4737aO
            if (r13 != 0) goto L_0x0196
            androidx.constraintlayout.p079a.p082b.p083a.C1624i.m4336b(r10, r4, r2)
        L_0x0196:
            int r3 = r3 + 1
            goto L_0x0181
        L_0x0199:
            r3 = 0
            androidx.constraintlayout.p079a.p082b.p083a.C1624i.m4336b(r3, r7, r2)
            if (r8 == 0) goto L_0x01ba
            r3 = 0
        L_0x01a0:
            if (r3 >= r6) goto L_0x01ba
            java.lang.Object r4 = r5.get(r3)
            androidx.constraintlayout.a.b.f r4 = (androidx.constraintlayout.p079a.p082b.C1638f) r4
            boolean r8 = r4 instanceof androidx.constraintlayout.p079a.p082b.C1615a
            if (r8 == 0) goto L_0x01b7
            androidx.constraintlayout.a.b.a r4 = (androidx.constraintlayout.p079a.p082b.C1615a) r4
            int r8 = r4.mo4559a()
            if (r8 != r10) goto L_0x01b7
            androidx.constraintlayout.p079a.p082b.p083a.C1624i.m4338d(r4, r2, r10, r14)
        L_0x01b7:
            int r3 = r3 + 1
            goto L_0x01a0
        L_0x01ba:
            r3 = 0
        L_0x01bb:
            if (r3 >= r6) goto L_0x01f3
            java.lang.Object r4 = r5.get(r3)
            androidx.constraintlayout.a.b.f r4 = (androidx.constraintlayout.p079a.p082b.C1638f) r4
            boolean r8 = r4.mo4625K()
            if (r8 == 0) goto L_0x01f0
            boolean r8 = androidx.constraintlayout.p079a.p082b.p083a.C1624i.m4337c(r4)
            if (r8 == 0) goto L_0x01f0
            androidx.constraintlayout.a.b.a.b r8 = androidx.constraintlayout.p079a.p082b.p083a.C1624i.f4522a
            m4445S(r4, r2, r8)
            boolean r8 = r4 instanceof androidx.constraintlayout.p079a.p082b.C1642j
            if (r8 == 0) goto L_0x01e9
            r8 = r4
            androidx.constraintlayout.a.b.j r8 = (androidx.constraintlayout.p079a.p082b.C1642j) r8
            int r8 = r8.f4737aO
            if (r8 != 0) goto L_0x01e4
            r8 = 0
            androidx.constraintlayout.p079a.p082b.p083a.C1624i.m4336b(r8, r4, r2)
            goto L_0x01f0
        L_0x01e4:
            r8 = 0
            androidx.constraintlayout.p079a.p082b.p083a.C1624i.m4335a(r8, r4, r2, r14)
            goto L_0x01f0
        L_0x01e9:
            r8 = 0
            androidx.constraintlayout.p079a.p082b.p083a.C1624i.m4335a(r8, r4, r2, r14)
            androidx.constraintlayout.p079a.p082b.p083a.C1624i.m4336b(r8, r4, r2)
        L_0x01f0:
            int r3 = r3 + 1
            goto L_0x01bb
        L_0x01f3:
            r2 = 0
        L_0x01f4:
            if (r2 >= r9) goto L_0x0236
            java.util.ArrayList r3 = r7.f4756be
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.a.b.f r3 = (androidx.constraintlayout.p079a.p082b.C1638f) r3
            boolean r4 = r3.mo4625K()
            if (r4 == 0) goto L_0x0233
            boolean r4 = r3 instanceof androidx.constraintlayout.p079a.p082b.C1642j
            if (r4 != 0) goto L_0x0233
            boolean r4 = r3 instanceof androidx.constraintlayout.p079a.p082b.C1615a
            if (r4 != 0) goto L_0x0233
            boolean r4 = r3 instanceof androidx.constraintlayout.p079a.p082b.C1646n
            if (r4 != 0) goto L_0x0233
            boolean r4 = r3.f4591K
            if (r4 != 0) goto L_0x0233
            androidx.constraintlayout.a.b.e[] r4 = r3.f4605Y
            r5 = 0
            r6 = r4[r5]
            r4 = r4[r10]
            androidx.constraintlayout.a.b.e r5 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r6 != r5) goto L_0x0229
            int r6 = r3.f4664t
            if (r6 == r10) goto L_0x0229
            if (r4 != r5) goto L_0x0229
            int r4 = r3.f4665u
            if (r4 != r10) goto L_0x0233
        L_0x0229:
            androidx.constraintlayout.a.b.a.b r4 = new androidx.constraintlayout.a.b.a.b
            r4.<init>()
            androidx.constraintlayout.widget.e r5 = r7.f4689bd
            m4445S(r3, r5, r4)
        L_0x0233:
            int r2 = r2 + 1
            goto L_0x01f4
        L_0x0236:
            r13 = 2
            if (r9 <= r13) goto L_0x0603
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r12 == r2) goto L_0x0249
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r11 != r2) goto L_0x0242
            goto L_0x0249
        L_0x0242:
            r10 = r1
            r16 = r9
            r8 = r11
            r9 = r0
            goto L_0x060a
        L_0x0249:
            int r2 = r7.f4679aU
            r3 = 1024(0x400, float:1.435E-42)
            boolean r2 = androidx.constraintlayout.p079a.p082b.C1644l.m4482b(r2, r3)
            if (r2 == 0) goto L_0x0603
            androidx.constraintlayout.widget.e r2 = r7.f4689bd
            java.util.ArrayList r3 = r7.f4756be
            int r4 = r3.size()
            r5 = 0
        L_0x025c:
            if (r5 >= r4) goto L_0x0282
            java.lang.Object r6 = r3.get(r5)
            androidx.constraintlayout.a.b.f r6 = (androidx.constraintlayout.p079a.p082b.C1638f) r6
            androidx.constraintlayout.a.b.e[] r15 = r7.f4605Y
            r16 = 0
            r8 = r15[r16]
            r15 = r15[r10]
            androidx.constraintlayout.a.b.e[] r13 = r6.f4605Y
            r14 = r13[r16]
            r13 = r13[r10]
            boolean r8 = androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4345c(r8, r15, r14, r13)
            if (r8 != 0) goto L_0x0279
        L_0x0278:
            goto L_0x0242
        L_0x0279:
            boolean r6 = r6 instanceof androidx.constraintlayout.p079a.p082b.C1641i
            if (r6 == 0) goto L_0x027e
            goto L_0x0278
        L_0x027e:
            int r5 = r5 + 1
            r13 = 2
            goto L_0x025c
        L_0x0282:
            r5 = 0
            r6 = 0
            r8 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r20 = 0
        L_0x028a:
            if (r5 >= r4) goto L_0x0373
            java.lang.Object r16 = r3.get(r5)
            r10 = r16
            androidx.constraintlayout.a.b.f r10 = (androidx.constraintlayout.p079a.p082b.C1638f) r10
            r16 = r9
            androidx.constraintlayout.a.b.e[] r9 = r7.f4605Y
            r22 = r1
            r19 = 0
            r1 = r9[r19]
            r21 = 1
            r9 = r9[r21]
            r23 = r11
            androidx.constraintlayout.a.b.e[] r11 = r10.f4605Y
            r24 = r0
            r0 = r11[r19]
            r11 = r11[r21]
            boolean r0 = androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4345c(r1, r9, r0, r11)
            if (r0 != 0) goto L_0x02b7
            androidx.constraintlayout.a.b.a.b r0 = r7.f4688bc
            m4445S(r10, r2, r0)
        L_0x02b7:
            boolean r0 = r10 instanceof androidx.constraintlayout.p079a.p082b.C1642j
            if (r0 == 0) goto L_0x02db
            r1 = r10
            androidx.constraintlayout.a.b.j r1 = (androidx.constraintlayout.p079a.p082b.C1642j) r1
            int r9 = r1.f4737aO
            if (r9 != 0) goto L_0x02cc
            if (r13 != 0) goto L_0x02c9
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x02c9:
            r13.add(r1)
        L_0x02cc:
            int r9 = r1.f4737aO
            r11 = 1
            if (r9 != r11) goto L_0x02db
            if (r6 != 0) goto L_0x02d8
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x02d8:
            r6.add(r1)
        L_0x02db:
            boolean r1 = r10 instanceof androidx.constraintlayout.p079a.p082b.C1643k
            if (r1 == 0) goto L_0x031f
            boolean r1 = r10 instanceof androidx.constraintlayout.p079a.p082b.C1615a
            if (r1 == 0) goto L_0x0308
            r1 = r10
            androidx.constraintlayout.a.b.a r1 = (androidx.constraintlayout.p079a.p082b.C1615a) r1
            int r9 = r1.mo4559a()
            if (r9 != 0) goto L_0x02f6
            if (r8 != 0) goto L_0x02f3
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x02f3:
            r8.add(r1)
        L_0x02f6:
            int r9 = r1.mo4559a()
            r11 = 1
            if (r9 != r11) goto L_0x031f
            if (r14 != 0) goto L_0x0304
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0304:
            r14.add(r1)
            goto L_0x031f
        L_0x0308:
            r1 = r10
            androidx.constraintlayout.a.b.k r1 = (androidx.constraintlayout.p079a.p082b.C1643k) r1
            if (r8 != 0) goto L_0x0312
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0312:
            r8.add(r1)
            if (r14 != 0) goto L_0x031c
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x031c:
            r14.add(r1)
        L_0x031f:
            androidx.constraintlayout.a.b.d r1 = r10.f4594N
            androidx.constraintlayout.a.b.d r1 = r1.f4571e
            if (r1 != 0) goto L_0x033b
            androidx.constraintlayout.a.b.d r1 = r10.f4596P
            androidx.constraintlayout.a.b.d r1 = r1.f4571e
            if (r1 != 0) goto L_0x033b
            if (r0 != 0) goto L_0x033b
            boolean r1 = r10 instanceof androidx.constraintlayout.p079a.p082b.C1615a
            if (r1 != 0) goto L_0x033b
            if (r15 != 0) goto L_0x0338
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x0338:
            r15.add(r10)
        L_0x033b:
            androidx.constraintlayout.a.b.d r1 = r10.f4595O
            androidx.constraintlayout.a.b.d r1 = r1.f4571e
            if (r1 != 0) goto L_0x0362
            androidx.constraintlayout.a.b.d r1 = r10.f4597Q
            androidx.constraintlayout.a.b.d r1 = r1.f4571e
            if (r1 != 0) goto L_0x0362
            androidx.constraintlayout.a.b.d r1 = r10.f4598R
            androidx.constraintlayout.a.b.d r1 = r1.f4571e
            if (r1 != 0) goto L_0x0362
            if (r0 != 0) goto L_0x0362
            boolean r0 = r10 instanceof androidx.constraintlayout.p079a.p082b.C1615a
            if (r0 != 0) goto L_0x0362
            r0 = r20
            if (r0 != 0) goto L_0x035e
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            r0 = r20
        L_0x035e:
            r0.add(r10)
            goto L_0x0364
        L_0x0362:
            r0 = r20
        L_0x0364:
            r20 = r0
            int r5 = r5 + 1
            r9 = r16
            r1 = r22
            r11 = r23
            r0 = r24
            r10 = 1
            goto L_0x028a
        L_0x0373:
            r24 = r0
            r22 = r1
            r16 = r9
            r23 = r11
            r0 = r20
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r6 == 0) goto L_0x0399
            int r2 = r6.size()
            r5 = 0
        L_0x0389:
            if (r5 >= r2) goto L_0x0399
            java.lang.Object r9 = r6.get(r5)
            androidx.constraintlayout.a.b.j r9 = (androidx.constraintlayout.p079a.p082b.C1642j) r9
            r10 = 0
            r11 = 0
            androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4343a(r9, r11, r1, r10)
            int r5 = r5 + 1
            goto L_0x0389
        L_0x0399:
            if (r8 == 0) goto L_0x03b7
            int r2 = r8.size()
            r5 = 0
        L_0x03a0:
            if (r5 >= r2) goto L_0x03b7
            java.lang.Object r6 = r8.get(r5)
            androidx.constraintlayout.a.b.k r6 = (androidx.constraintlayout.p079a.p082b.C1643k) r6
            r9 = 0
            r10 = 0
            androidx.constraintlayout.a.b.a.q r11 = androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4343a(r6, r10, r1, r9)
            r6.mo4666R(r1, r10, r11)
            r11.mo4593b(r1)
            int r5 = r5 + 1
            goto L_0x03a0
        L_0x03b7:
            r2 = 2
            androidx.constraintlayout.a.b.d r5 = r7.mo4626L(r2)
            java.util.HashSet r2 = r5.f4567a
            if (r2 == 0) goto L_0x03d8
            java.util.Iterator r2 = r2.iterator()
        L_0x03c4:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x03d8
            java.lang.Object r5 = r2.next()
            androidx.constraintlayout.a.b.d r5 = (androidx.constraintlayout.p079a.p082b.C1636d) r5
            androidx.constraintlayout.a.b.f r5 = r5.f4570d
            r6 = 0
            r8 = 0
            androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4343a(r5, r8, r1, r6)
            goto L_0x03c4
        L_0x03d8:
            r2 = 4
            androidx.constraintlayout.a.b.d r2 = r7.mo4626L(r2)
            java.util.HashSet r2 = r2.f4567a
            if (r2 == 0) goto L_0x03f9
            java.util.Iterator r2 = r2.iterator()
        L_0x03e5:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x03f9
            java.lang.Object r5 = r2.next()
            androidx.constraintlayout.a.b.d r5 = (androidx.constraintlayout.p079a.p082b.C1636d) r5
            androidx.constraintlayout.a.b.f r5 = r5.f4570d
            r6 = 0
            r8 = 0
            androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4343a(r5, r8, r1, r6)
            goto L_0x03e5
        L_0x03f9:
            r2 = 7
            androidx.constraintlayout.a.b.d r5 = r7.mo4626L(r2)
            java.util.HashSet r5 = r5.f4567a
            if (r5 == 0) goto L_0x041a
            java.util.Iterator r5 = r5.iterator()
        L_0x0406:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x041a
            java.lang.Object r6 = r5.next()
            androidx.constraintlayout.a.b.d r6 = (androidx.constraintlayout.p079a.p082b.C1636d) r6
            androidx.constraintlayout.a.b.f r6 = r6.f4570d
            r8 = 0
            r9 = 0
            androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4343a(r6, r8, r1, r9)
            goto L_0x0406
        L_0x041a:
            r8 = 0
            r9 = 0
            if (r15 == 0) goto L_0x0433
            int r5 = r15.size()
            r6 = 0
        L_0x0423:
            if (r6 >= r5) goto L_0x0433
            java.lang.Object r10 = r15.get(r6)
            androidx.constraintlayout.a.b.f r10 = (androidx.constraintlayout.p079a.p082b.C1638f) r10
            androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4343a(r10, r8, r1, r9)
            int r6 = r6 + 1
            r8 = 0
            r9 = 0
            goto L_0x0423
        L_0x0433:
            if (r13 == 0) goto L_0x044a
            int r5 = r13.size()
            r6 = 0
        L_0x043a:
            if (r6 >= r5) goto L_0x044a
            java.lang.Object r8 = r13.get(r6)
            androidx.constraintlayout.a.b.j r8 = (androidx.constraintlayout.p079a.p082b.C1642j) r8
            r9 = 0
            r10 = 1
            androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4343a(r8, r10, r1, r9)
            int r6 = r6 + 1
            goto L_0x043a
        L_0x044a:
            if (r14 == 0) goto L_0x0468
            int r5 = r14.size()
            r6 = 0
        L_0x0451:
            if (r6 >= r5) goto L_0x0468
            java.lang.Object r8 = r14.get(r6)
            androidx.constraintlayout.a.b.k r8 = (androidx.constraintlayout.p079a.p082b.C1643k) r8
            r9 = 0
            r10 = 1
            androidx.constraintlayout.a.b.a.q r11 = androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4343a(r8, r10, r1, r9)
            r8.mo4666R(r1, r10, r11)
            r11.mo4593b(r1)
            int r6 = r6 + 1
            goto L_0x0451
        L_0x0468:
            r5 = 3
            androidx.constraintlayout.a.b.d r6 = r7.mo4626L(r5)
            java.util.HashSet r5 = r6.f4567a
            if (r5 == 0) goto L_0x0489
            java.util.Iterator r5 = r5.iterator()
        L_0x0475:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0489
            java.lang.Object r6 = r5.next()
            androidx.constraintlayout.a.b.d r6 = (androidx.constraintlayout.p079a.p082b.C1636d) r6
            androidx.constraintlayout.a.b.f r6 = r6.f4570d
            r8 = 0
            r9 = 1
            androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4343a(r6, r9, r1, r8)
            goto L_0x0475
        L_0x0489:
            r5 = 6
            androidx.constraintlayout.a.b.d r5 = r7.mo4626L(r5)
            java.util.HashSet r5 = r5.f4567a
            if (r5 == 0) goto L_0x04aa
            java.util.Iterator r5 = r5.iterator()
        L_0x0496:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x04aa
            java.lang.Object r6 = r5.next()
            androidx.constraintlayout.a.b.d r6 = (androidx.constraintlayout.p079a.p082b.C1636d) r6
            androidx.constraintlayout.a.b.f r6 = r6.f4570d
            r8 = 0
            r9 = 1
            androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4343a(r6, r9, r1, r8)
            goto L_0x0496
        L_0x04aa:
            r5 = 5
            androidx.constraintlayout.a.b.d r5 = r7.mo4626L(r5)
            java.util.HashSet r5 = r5.f4567a
            if (r5 == 0) goto L_0x04cb
            java.util.Iterator r5 = r5.iterator()
        L_0x04b7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x04cb
            java.lang.Object r6 = r5.next()
            androidx.constraintlayout.a.b.d r6 = (androidx.constraintlayout.p079a.p082b.C1636d) r6
            androidx.constraintlayout.a.b.f r6 = r6.f4570d
            r8 = 0
            r9 = 1
            androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4343a(r6, r9, r1, r8)
            goto L_0x04b7
        L_0x04cb:
            androidx.constraintlayout.a.b.d r2 = r7.mo4626L(r2)
            java.util.HashSet r2 = r2.f4567a
            if (r2 == 0) goto L_0x04eb
            java.util.Iterator r2 = r2.iterator()
        L_0x04d7:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x04eb
            java.lang.Object r5 = r2.next()
            androidx.constraintlayout.a.b.d r5 = (androidx.constraintlayout.p079a.p082b.C1636d) r5
            androidx.constraintlayout.a.b.f r5 = r5.f4570d
            r6 = 0
            r8 = 1
            androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4343a(r5, r8, r1, r6)
            goto L_0x04d7
        L_0x04eb:
            r6 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0504
            int r2 = r0.size()
            r5 = 0
        L_0x04f4:
            if (r5 >= r2) goto L_0x0504
            java.lang.Object r9 = r0.get(r5)
            androidx.constraintlayout.a.b.f r9 = (androidx.constraintlayout.p079a.p082b.C1638f) r9
            androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4343a(r9, r8, r1, r6)
            int r5 = r5 + 1
            r6 = 0
            r8 = 1
            goto L_0x04f4
        L_0x0504:
            r0 = 0
        L_0x0505:
            if (r0 >= r4) goto L_0x0537
            java.lang.Object r2 = r3.get(r0)
            androidx.constraintlayout.a.b.f r2 = (androidx.constraintlayout.p079a.p082b.C1638f) r2
            androidx.constraintlayout.a.b.e[] r5 = r2.f4605Y
            r6 = 0
            r8 = r5[r6]
            androidx.constraintlayout.a.b.e r9 = androidx.constraintlayout.p079a.p082b.C1637e.MATCH_CONSTRAINT
            if (r8 != r9) goto L_0x0534
            r8 = 1
            r5 = r5[r8]
            if (r5 != r9) goto L_0x0534
            int r5 = r2.f4619aL
            androidx.constraintlayout.a.b.a.q r5 = androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4344b(r1, r5)
            int r2 = r2.f4620aM
            androidx.constraintlayout.a.b.a.q r2 = androidx.constraintlayout.p079a.p082b.p083a.C1625j.m4344b(r1, r2)
            if (r5 == 0) goto L_0x0534
            if (r2 == 0) goto L_0x0534
            r5.mo4594c(r6, r2)
            r6 = 2
            r2.f4534d = r6
            r1.remove(r5)
        L_0x0534:
            int r0 = r0 + 1
            goto L_0x0505
        L_0x0537:
            int r0 = r1.size()
            r2 = 1
            if (r0 > r2) goto L_0x0546
        L_0x053e:
            r10 = r22
            r8 = r23
            r9 = r24
            goto L_0x060a
        L_0x0546:
            androidx.constraintlayout.a.b.e[] r0 = r7.f4605Y
            r2 = 0
            r0 = r0[r2]
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r0 != r2) goto L_0x0582
            int r0 = r1.size()
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0556:
            if (r2 >= r0) goto L_0x0575
            java.lang.Object r5 = r1.get(r2)
            androidx.constraintlayout.a.b.a.q r5 = (androidx.constraintlayout.p079a.p082b.p083a.C1632q) r5
            int r6 = r5.f4534d
            r8 = 1
            if (r6 != r8) goto L_0x0564
            goto L_0x0572
        L_0x0564:
            androidx.constraintlayout.a.d r6 = r7.f4672aN
            r8 = 0
            int r6 = r5.mo4592a(r6, r8)
            if (r6 > r3) goto L_0x056e
            goto L_0x056f
        L_0x056e:
            r4 = r5
        L_0x056f:
            if (r6 <= r3) goto L_0x0572
            r3 = r6
        L_0x0572:
            int r2 = r2 + 1
            goto L_0x0556
        L_0x0575:
            if (r4 == 0) goto L_0x0582
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            androidx.constraintlayout.a.b.e[] r2 = r7.f4605Y
            r5 = 0
            r2[r5] = r0
            r7.mo4618D(r3)
            goto L_0x0583
        L_0x0582:
            r4 = 0
        L_0x0583:
            androidx.constraintlayout.a.b.e[] r0 = r7.f4605Y
            r2 = 1
            r0 = r0[r2]
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r0 != r2) goto L_0x05be
            int r0 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x0593:
            if (r2 >= r0) goto L_0x05b1
            java.lang.Object r6 = r1.get(r2)
            androidx.constraintlayout.a.b.a.q r6 = (androidx.constraintlayout.p079a.p082b.p083a.C1632q) r6
            int r8 = r6.f4534d
            if (r8 != 0) goto L_0x05a0
            goto L_0x05ae
        L_0x05a0:
            androidx.constraintlayout.a.d r8 = r7.f4672aN
            r9 = 1
            int r8 = r6.mo4592a(r8, r9)
            if (r8 > r3) goto L_0x05aa
            goto L_0x05ab
        L_0x05aa:
            r5 = r6
        L_0x05ab:
            if (r8 <= r3) goto L_0x05ae
            r3 = r8
        L_0x05ae:
            int r2 = r2 + 1
            goto L_0x0593
        L_0x05b1:
            if (r5 == 0) goto L_0x05be
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            androidx.constraintlayout.a.b.e[] r1 = r7.f4605Y
            r2 = 1
            r1[r2] = r0
            r7.mo4648z(r3)
            goto L_0x05bf
        L_0x05be:
            r5 = 0
        L_0x05bf:
            if (r4 != 0) goto L_0x05c3
            if (r5 == 0) goto L_0x053e
        L_0x05c3:
            androidx.constraintlayout.a.b.e r0 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r12 != r0) goto L_0x05dd
            int r0 = r26.mo4631i()
            r1 = r24
            if (r1 >= r0) goto L_0x05d8
            if (r1 <= 0) goto L_0x05d8
            r7.mo4618D(r1)
            r2 = 1
            r7.f4680aV = r2
            goto L_0x05df
        L_0x05d8:
            int r0 = r26.mo4631i()
            goto L_0x05e0
        L_0x05dd:
            r1 = r24
        L_0x05df:
            r0 = r1
        L_0x05e0:
            androidx.constraintlayout.a.b.e r1 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            r8 = r23
            if (r8 != r1) goto L_0x05fc
            int r1 = r26.mo4630h()
            r2 = r22
            if (r2 >= r1) goto L_0x05f7
            if (r2 <= 0) goto L_0x05f7
            r7.mo4648z(r2)
            r1 = 1
            r7.f4681aW = r1
            goto L_0x05fe
        L_0x05f7:
            int r1 = r26.mo4630h()
            goto L_0x05ff
        L_0x05fc:
            r2 = r22
        L_0x05fe:
            r1 = r2
        L_0x05ff:
            r9 = r0
            r10 = r1
            r0 = 1
            goto L_0x060b
        L_0x0603:
            r2 = r1
            r16 = r9
            r8 = r11
            r1 = r0
            r9 = r1
            r10 = r2
        L_0x060a:
            r0 = 0
        L_0x060b:
            r11 = 64
            boolean r1 = r7.mo4650Q(r11)
            if (r1 != 0) goto L_0x061e
            r1 = 128(0x80, float:1.794E-43)
            boolean r1 = r7.mo4650Q(r1)
            if (r1 == 0) goto L_0x061c
            goto L_0x061e
        L_0x061c:
            r1 = 0
            goto L_0x061f
        L_0x061e:
            r1 = 1
        L_0x061f:
            androidx.constraintlayout.a.d r2 = r7.f4672aN
            r3 = 0
            r2.f4766f = r3
            r2.f4767g = r3
            int r4 = r7.f4679aU
            if (r4 == 0) goto L_0x0630
            if (r1 == 0) goto L_0x0630
            r1 = 1
            r2.f4767g = r1
            goto L_0x0631
        L_0x0630:
            r1 = 1
        L_0x0631:
            java.util.ArrayList r13 = r7.f4756be
            androidx.constraintlayout.a.b.e[] r2 = r7.f4605Y
            r2 = r2[r3]
            androidx.constraintlayout.a.b.e r3 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r2 == r3) goto L_0x0646
            androidx.constraintlayout.a.b.e[] r2 = r7.f4605Y
            r2 = r2[r1]
            androidx.constraintlayout.a.b.e r1 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r2 != r1) goto L_0x0644
            goto L_0x0646
        L_0x0644:
            r14 = 0
            goto L_0x0647
        L_0x0646:
            r14 = 1
        L_0x0647:
            r26.m4448X()
            r15 = r16
            r1 = 0
        L_0x064d:
            if (r1 >= r15) goto L_0x0663
            java.util.ArrayList r2 = r7.f4756be
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.a.b.f r2 = (androidx.constraintlayout.p079a.p082b.C1638f) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.p079a.p082b.C1647o
            if (r3 == 0) goto L_0x0660
            androidx.constraintlayout.a.b.o r2 = (androidx.constraintlayout.p079a.p082b.C1647o) r2
            r2.mo4653d()
        L_0x0660:
            int r1 = r1 + 1
            goto L_0x064d
        L_0x0663:
            r16 = r0
            r0 = 0
            r1 = 1
        L_0x0667:
            if (r1 == 0) goto L_0x0a75
            r1 = 1
            int r6 = r0 + 1
            androidx.constraintlayout.a.d r0 = r7.f4672aN     // Catch:{ Exception -> 0x0926 }
            r0.mo4682j()     // Catch:{ Exception -> 0x0926 }
            r26.m4448X()     // Catch:{ Exception -> 0x0926 }
            androidx.constraintlayout.a.d r0 = r7.f4672aN     // Catch:{ Exception -> 0x0926 }
            r7.mo4639q(r0)     // Catch:{ Exception -> 0x0926 }
            r0 = 0
        L_0x067a:
            if (r0 >= r15) goto L_0x068c
            java.util.ArrayList r1 = r7.f4756be     // Catch:{ Exception -> 0x0926 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x0926 }
            androidx.constraintlayout.a.b.f r1 = (androidx.constraintlayout.p079a.p082b.C1638f) r1     // Catch:{ Exception -> 0x0926 }
            androidx.constraintlayout.a.d r2 = r7.f4672aN     // Catch:{ Exception -> 0x0926 }
            r1.mo4639q(r2)     // Catch:{ Exception -> 0x0926 }
            int r0 = r0 + 1
            goto L_0x067a
        L_0x068c:
            androidx.constraintlayout.a.d r0 = r7.f4672aN     // Catch:{ Exception -> 0x0926 }
            boolean r5 = r7.mo4650Q(r11)     // Catch:{ Exception -> 0x0926 }
            r7.mo4560b(r0, r5)     // Catch:{ Exception -> 0x0926 }
            java.util.ArrayList r1 = r7.f4756be     // Catch:{ Exception -> 0x0926 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x0926 }
            r2 = 0
            r3 = 0
        L_0x069d:
            if (r2 >= r1) goto L_0x06b9
            java.util.ArrayList r4 = r7.f4756be     // Catch:{ Exception -> 0x0926 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ Exception -> 0x0926 }
            androidx.constraintlayout.a.b.f r4 = (androidx.constraintlayout.p079a.p082b.C1638f) r4     // Catch:{ Exception -> 0x0926 }
            boolean[] r11 = r4.f4604X     // Catch:{ Exception -> 0x0926 }
            r19 = 0
            r11[r19] = r19     // Catch:{ Exception -> 0x0926 }
            r21 = 1
            r11[r21] = r19     // Catch:{ Exception -> 0x0926 }
            boolean r4 = r4 instanceof androidx.constraintlayout.p079a.p082b.C1615a     // Catch:{ Exception -> 0x0926 }
            r3 = r3 | r4
            int r2 = r2 + 1
            r11 = 64
            goto L_0x069d
        L_0x06b9:
            if (r3 == 0) goto L_0x0715
            r2 = 0
        L_0x06bc:
            if (r2 >= r1) goto L_0x0715
            java.util.ArrayList r3 = r7.f4756be     // Catch:{ Exception -> 0x0926 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ Exception -> 0x0926 }
            androidx.constraintlayout.a.b.f r3 = (androidx.constraintlayout.p079a.p082b.C1638f) r3     // Catch:{ Exception -> 0x0926 }
            boolean r4 = r3 instanceof androidx.constraintlayout.p079a.p082b.C1615a     // Catch:{ Exception -> 0x0926 }
            if (r4 == 0) goto L_0x070d
            androidx.constraintlayout.a.b.a r3 = (androidx.constraintlayout.p079a.p082b.C1615a) r3     // Catch:{ Exception -> 0x0926 }
            r4 = 0
        L_0x06cd:
            int r11 = r3.f4743bf     // Catch:{ Exception -> 0x0926 }
            if (r4 >= r11) goto L_0x070d
            androidx.constraintlayout.a.b.f[] r11 = r3.f4742be     // Catch:{ Exception -> 0x0926 }
            r11 = r11[r4]     // Catch:{ Exception -> 0x0926 }
            r22 = r6
            boolean r6 = r3.f4483b     // Catch:{ Exception -> 0x091b }
            if (r6 != 0) goto L_0x06e5
            boolean r6 = r11.mo4563e()     // Catch:{ Exception -> 0x091b }
            if (r6 != 0) goto L_0x06e5
            r23 = r3
            r3 = 3
            goto L_0x0706
        L_0x06e5:
            int r6 = r3.f4482a     // Catch:{ Exception -> 0x091b }
            r23 = r3
            if (r6 == 0) goto L_0x06fe
            r3 = 1
            if (r6 != r3) goto L_0x06ef
            goto L_0x06fe
        L_0x06ef:
            r3 = 2
            if (r6 == r3) goto L_0x06f6
            r3 = 3
            if (r6 != r3) goto L_0x0706
            goto L_0x06f7
        L_0x06f6:
            r3 = 3
        L_0x06f7:
            boolean[] r6 = r11.f4604X     // Catch:{ Exception -> 0x091b }
            r17 = 1
            r6[r17] = r17     // Catch:{ Exception -> 0x091b }
            goto L_0x0706
        L_0x06fe:
            r3 = 3
            r17 = 1
            boolean[] r6 = r11.f4604X     // Catch:{ Exception -> 0x091b }
            r11 = 0
            r6[r11] = r17     // Catch:{ Exception -> 0x091b }
        L_0x0706:
            int r4 = r4 + 1
            r6 = r22
            r3 = r23
            goto L_0x06cd
        L_0x070d:
            r22 = r6
            r3 = 3
            int r2 = r2 + 1
            r6 = r22
            goto L_0x06bc
        L_0x0715:
            r22 = r6
            r3 = 3
            java.util.HashSet r2 = r7.f4687bb     // Catch:{ Exception -> 0x091b }
            r2.clear()     // Catch:{ Exception -> 0x091b }
            r2 = 0
        L_0x071e:
            if (r2 < r1) goto L_0x08e8
        L_0x0720:
            java.util.HashSet r2 = r7.f4687bb     // Catch:{ Exception -> 0x091b }
            int r2 = r2.size()     // Catch:{ Exception -> 0x091b }
            if (r2 <= 0) goto L_0x078a
            java.util.HashSet r2 = r7.f4687bb     // Catch:{ Exception -> 0x091b }
            int r2 = r2.size()     // Catch:{ Exception -> 0x091b }
            java.util.HashSet r4 = r7.f4687bb     // Catch:{ Exception -> 0x091b }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x091b }
        L_0x0734:
            boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x091b }
            if (r6 == 0) goto L_0x0765
            java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x091b }
            androidx.constraintlayout.a.b.f r6 = (androidx.constraintlayout.p079a.p082b.C1638f) r6     // Catch:{ Exception -> 0x091b }
            androidx.constraintlayout.a.b.n r6 = (androidx.constraintlayout.p079a.p082b.C1646n) r6     // Catch:{ Exception -> 0x091b }
            java.util.HashSet r11 = r7.f4687bb     // Catch:{ Exception -> 0x091b }
            r23 = r4
            r3 = 0
        L_0x0747:
            int r4 = r6.f4743bf     // Catch:{ Exception -> 0x091b }
            if (r3 >= r4) goto L_0x0761
            androidx.constraintlayout.a.b.f[] r4 = r6.f4742be     // Catch:{ Exception -> 0x091b }
            r4 = r4[r3]     // Catch:{ Exception -> 0x091b }
            boolean r4 = r11.contains(r4)     // Catch:{ Exception -> 0x091b }
            if (r4 == 0) goto L_0x075e
            r6.mo4560b(r0, r5)     // Catch:{ Exception -> 0x091b }
            java.util.HashSet r3 = r7.f4687bb     // Catch:{ Exception -> 0x091b }
            r3.remove(r6)     // Catch:{ Exception -> 0x091b }
            goto L_0x0765
        L_0x075e:
            int r3 = r3 + 1
            goto L_0x0747
        L_0x0761:
            r4 = r23
            r3 = 3
            goto L_0x0734
        L_0x0765:
            java.util.HashSet r3 = r7.f4687bb     // Catch:{ Exception -> 0x091b }
            int r3 = r3.size()     // Catch:{ Exception -> 0x091b }
            if (r2 != r3) goto L_0x0788
            java.util.HashSet r2 = r7.f4687bb     // Catch:{ Exception -> 0x091b }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x091b }
        L_0x0773:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x091b }
            if (r3 == 0) goto L_0x0783
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x091b }
            androidx.constraintlayout.a.b.f r3 = (androidx.constraintlayout.p079a.p082b.C1638f) r3     // Catch:{ Exception -> 0x091b }
            r3.mo4560b(r0, r5)     // Catch:{ Exception -> 0x091b }
            goto L_0x0773
        L_0x0783:
            java.util.HashSet r2 = r7.f4687bb     // Catch:{ Exception -> 0x091b }
            r2.clear()     // Catch:{ Exception -> 0x091b }
        L_0x0788:
            r3 = 3
            goto L_0x0720
        L_0x078a:
            boolean r2 = androidx.constraintlayout.p079a.C1649d.f4760a     // Catch:{ Exception -> 0x091b }
            if (r2 == 0) goto L_0x07f0
            java.util.HashSet r11 = new java.util.HashSet     // Catch:{ Exception -> 0x07e4 }
            r11.<init>()     // Catch:{ Exception -> 0x07e4 }
            r2 = 0
        L_0x0794:
            if (r2 >= r1) goto L_0x07aa
            java.util.ArrayList r3 = r7.f4756be     // Catch:{ Exception -> 0x091b }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ Exception -> 0x091b }
            androidx.constraintlayout.a.b.f r3 = (androidx.constraintlayout.p079a.p082b.C1638f) r3     // Catch:{ Exception -> 0x091b }
            boolean r4 = r3.mo4620F()     // Catch:{ Exception -> 0x091b }
            if (r4 != 0) goto L_0x07a7
            r11.add(r3)     // Catch:{ Exception -> 0x091b }
        L_0x07a7:
            int r2 = r2 + 1
            goto L_0x0794
        L_0x07aa:
            androidx.constraintlayout.a.b.e[] r1 = r7.f4605Y     // Catch:{ Exception -> 0x07e4 }
            r2 = 0
            r1 = r1[r2]     // Catch:{ Exception -> 0x07e4 }
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT     // Catch:{ Exception -> 0x07e4 }
            if (r1 != r2) goto L_0x07b5
            r6 = 0
            goto L_0x07b6
        L_0x07b5:
            r6 = 1
        L_0x07b6:
            r23 = 0
            r1 = r26
            r2 = r26
            r17 = 3
            r3 = r0
            r4 = r11
            r24 = r13
            r13 = r5
            r5 = r6
            r25 = r10
            r10 = r22
            r6 = r23
            r1.mo4637o(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x08e5 }
            java.util.Iterator r1 = r11.iterator()     // Catch:{ Exception -> 0x08e5 }
        L_0x07d1:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x08e5 }
            if (r2 == 0) goto L_0x0846
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.b.f r2 = (androidx.constraintlayout.p079a.p082b.C1638f) r2     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.p079a.p082b.C1644l.m4481a(r7, r0, r2)     // Catch:{ Exception -> 0x08e5 }
            r2.mo4560b(r0, r13)     // Catch:{ Exception -> 0x08e5 }
            goto L_0x07d1
        L_0x07e4:
            r0 = move-exception
            r25 = r10
            r24 = r13
            r10 = r22
            r17 = 3
        L_0x07ed:
            r3 = 0
            goto L_0x092f
        L_0x07f0:
            r25 = r10
            r24 = r13
            r10 = r22
            r17 = 3
            r13 = r5
            r2 = 0
        L_0x07fa:
            if (r2 >= r1) goto L_0x0846
            java.util.ArrayList r3 = r7.f4756be     // Catch:{ Exception -> 0x08e5 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.b.f r3 = (androidx.constraintlayout.p079a.p082b.C1638f) r3     // Catch:{ Exception -> 0x08e5 }
            boolean r4 = r3 instanceof androidx.constraintlayout.p079a.p082b.C1639g     // Catch:{ Exception -> 0x08e5 }
            if (r4 == 0) goto L_0x0837
            androidx.constraintlayout.a.b.e[] r4 = r3.f4605Y     // Catch:{ Exception -> 0x08e5 }
            r5 = 0
            r6 = r4[r5]     // Catch:{ Exception -> 0x08e5 }
            r5 = 1
            r11 = r4[r5]     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.b.e r5 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT     // Catch:{ Exception -> 0x08e5 }
            if (r6 != r5) goto L_0x081a
            androidx.constraintlayout.a.b.e r22 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED     // Catch:{ Exception -> 0x08e5 }
            r19 = 0
            r4[r19] = r22     // Catch:{ Exception -> 0x08e5 }
        L_0x081a:
            if (r11 != r5) goto L_0x0822
            androidx.constraintlayout.a.b.e r5 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED     // Catch:{ Exception -> 0x08e5 }
            r21 = 1
            r4[r21] = r5     // Catch:{ Exception -> 0x08e5 }
        L_0x0822:
            r3.mo4560b(r0, r13)     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.b.e r4 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT     // Catch:{ Exception -> 0x08e5 }
            if (r6 != r4) goto L_0x082f
            androidx.constraintlayout.a.b.e[] r5 = r3.f4605Y     // Catch:{ Exception -> 0x08e5 }
            r19 = 0
            r5[r19] = r6     // Catch:{ Exception -> 0x08e5 }
        L_0x082f:
            if (r11 != r4) goto L_0x0843
            androidx.constraintlayout.a.b.e[] r3 = r3.f4605Y     // Catch:{ Exception -> 0x08e5 }
            r4 = 1
            r3[r4] = r11     // Catch:{ Exception -> 0x08e5 }
            goto L_0x0843
        L_0x0837:
            androidx.constraintlayout.p079a.p082b.C1644l.m4481a(r7, r0, r3)     // Catch:{ Exception -> 0x08e5 }
            boolean r4 = r3.mo4620F()     // Catch:{ Exception -> 0x08e5 }
            if (r4 != 0) goto L_0x0843
            r3.mo4560b(r0, r13)     // Catch:{ Exception -> 0x08e5 }
        L_0x0843:
            int r2 = r2 + 1
            goto L_0x07fa
        L_0x0846:
            int r1 = r7.f4675aQ     // Catch:{ Exception -> 0x08e5 }
            if (r1 <= 0) goto L_0x0850
            r1 = 0
            r2 = 0
            androidx.constraintlayout.p079a.p082b.C1634b.m4389a(r7, r0, r1, r2)     // Catch:{ Exception -> 0x08e2 }
            goto L_0x0851
        L_0x0850:
            r1 = 0
        L_0x0851:
            int r2 = r7.f4676aR     // Catch:{ Exception -> 0x08e2 }
            if (r2 <= 0) goto L_0x0859
            r2 = 1
            androidx.constraintlayout.p079a.p082b.C1634b.m4389a(r7, r0, r1, r2)     // Catch:{ Exception -> 0x08e2 }
        L_0x0859:
            java.lang.ref.WeakReference r0 = r7.f4682aX     // Catch:{ Exception -> 0x08e5 }
            if (r0 == 0) goto L_0x0879
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x08e5 }
            if (r0 == 0) goto L_0x0879
            java.lang.ref.WeakReference r0 = r7.f4682aX     // Catch:{ Exception -> 0x08e5 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.b.d r0 = (androidx.constraintlayout.p079a.p082b.C1636d) r0     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.d r1 = r7.f4672aN     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.b.d r2 = r7.f4595O     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.i r1 = r1.mo4674b(r2)     // Catch:{ Exception -> 0x08e5 }
            r7.m4447W(r0, r1)     // Catch:{ Exception -> 0x08e5 }
            r1 = 0
            r7.f4682aX = r1     // Catch:{ Exception -> 0x08e2 }
        L_0x0879:
            java.lang.ref.WeakReference r0 = r7.f4684aZ     // Catch:{ Exception -> 0x08e5 }
            if (r0 == 0) goto L_0x0899
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x08e5 }
            if (r0 == 0) goto L_0x0899
            java.lang.ref.WeakReference r0 = r7.f4684aZ     // Catch:{ Exception -> 0x08e5 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.b.d r0 = (androidx.constraintlayout.p079a.p082b.C1636d) r0     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.d r1 = r7.f4672aN     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.b.d r2 = r7.f4597Q     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.i r1 = r1.mo4674b(r2)     // Catch:{ Exception -> 0x08e5 }
            r7.m4446V(r0, r1)     // Catch:{ Exception -> 0x08e5 }
            r1 = 0
            r7.f4684aZ = r1     // Catch:{ Exception -> 0x08e2 }
        L_0x0899:
            java.lang.ref.WeakReference r0 = r7.f4683aY     // Catch:{ Exception -> 0x08e5 }
            if (r0 == 0) goto L_0x08b9
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x08e5 }
            if (r0 == 0) goto L_0x08b9
            java.lang.ref.WeakReference r0 = r7.f4683aY     // Catch:{ Exception -> 0x08e5 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.b.d r0 = (androidx.constraintlayout.p079a.p082b.C1636d) r0     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.d r1 = r7.f4672aN     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.b.d r2 = r7.f4594N     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.i r1 = r1.mo4674b(r2)     // Catch:{ Exception -> 0x08e5 }
            r7.m4447W(r0, r1)     // Catch:{ Exception -> 0x08e5 }
            r1 = 0
            r7.f4683aY = r1     // Catch:{ Exception -> 0x08e2 }
        L_0x08b9:
            java.lang.ref.WeakReference r0 = r7.f4686ba     // Catch:{ Exception -> 0x08e5 }
            if (r0 == 0) goto L_0x08da
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x08e5 }
            if (r0 == 0) goto L_0x08da
            java.lang.ref.WeakReference r0 = r7.f4686ba     // Catch:{ Exception -> 0x08e5 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.b.d r0 = (androidx.constraintlayout.p079a.p082b.C1636d) r0     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.d r1 = r7.f4672aN     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.b.d r2 = r7.f4596P     // Catch:{ Exception -> 0x08e5 }
            androidx.constraintlayout.a.i r1 = r1.mo4674b(r2)     // Catch:{ Exception -> 0x08e5 }
            r7.m4446V(r0, r1)     // Catch:{ Exception -> 0x08e5 }
            r3 = 0
            r7.f4686ba = r3     // Catch:{ Exception -> 0x0919 }
            goto L_0x08db
        L_0x08da:
            r3 = 0
        L_0x08db:
            androidx.constraintlayout.a.d r0 = r7.f4672aN     // Catch:{ Exception -> 0x0919 }
            r0.mo4681i()     // Catch:{ Exception -> 0x0919 }
            goto L_0x0941
        L_0x08e2:
            r0 = move-exception
            r3 = r1
            goto L_0x092f
        L_0x08e5:
            r0 = move-exception
            goto L_0x07ed
        L_0x08e8:
            r25 = r10
            r24 = r13
            r10 = r22
            r3 = 0
            r17 = 3
            r13 = r5
            java.util.ArrayList r4 = r7.f4756be     // Catch:{ Exception -> 0x0919 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ Exception -> 0x0919 }
            androidx.constraintlayout.a.b.f r4 = (androidx.constraintlayout.p079a.p082b.C1638f) r4     // Catch:{ Exception -> 0x0919 }
            boolean r5 = r4.mo4620F()     // Catch:{ Exception -> 0x0919 }
            if (r5 == 0) goto L_0x090d
            boolean r5 = r4 instanceof androidx.constraintlayout.p079a.p082b.C1646n     // Catch:{ Exception -> 0x0919 }
            if (r5 == 0) goto L_0x090a
            java.util.HashSet r5 = r7.f4687bb     // Catch:{ Exception -> 0x0919 }
            r5.add(r4)     // Catch:{ Exception -> 0x0919 }
            goto L_0x090d
        L_0x090a:
            r4.mo4560b(r0, r13)     // Catch:{ Exception -> 0x0919 }
        L_0x090d:
            int r2 = r2 + 1
            r22 = r10
            r5 = r13
            r13 = r24
            r10 = r25
            r3 = 3
            goto L_0x071e
        L_0x0919:
            r0 = move-exception
            goto L_0x092f
        L_0x091b:
            r0 = move-exception
            r25 = r10
            r24 = r13
            r10 = r22
            r3 = 0
            r17 = 3
            goto L_0x092f
        L_0x0926:
            r0 = move-exception
            r25 = r10
            r24 = r13
            r3 = 0
            r17 = 3
            r10 = r6
        L_0x092f:
            r0.printStackTrace()
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "EXCEPTION : "
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r2.concat(r0)
            r1.println(r0)
        L_0x0941:
            boolean[] r0 = androidx.constraintlayout.p079a.p082b.C1644l.f4744a
            r1 = 2
            r2 = 0
            r0[r1] = r2
            r1 = 64
            boolean r0 = r7.mo4650Q(r1)
            r7.mo4629O(r0)
            java.util.ArrayList r2 = r7.f4756be
            int r2 = r2.size()
            r4 = 0
            r5 = 0
        L_0x0958:
            if (r4 >= r2) goto L_0x0976
            java.util.ArrayList r6 = r7.f4756be
            java.lang.Object r6 = r6.get(r4)
            androidx.constraintlayout.a.b.f r6 = (androidx.constraintlayout.p079a.p082b.C1638f) r6
            r6.mo4629O(r0)
            int r11 = r6.f4656l
            r13 = -1
            if (r11 != r13) goto L_0x0971
            int r6 = r6.f4657m
            if (r6 == r13) goto L_0x096f
            goto L_0x0971
        L_0x096f:
            r6 = 0
            goto L_0x0972
        L_0x0971:
            r6 = 1
        L_0x0972:
            r5 = r5 | r6
            int r4 = r4 + 1
            goto L_0x0958
        L_0x0976:
            r13 = -1
            r0 = 8
            if (r14 == 0) goto L_0x09e9
            if (r10 >= r0) goto L_0x09e9
            boolean[] r2 = androidx.constraintlayout.p079a.p082b.C1644l.f4744a
            r4 = 2
            boolean r2 = r2[r4]
            if (r2 == 0) goto L_0x09ea
            r2 = 0
            r6 = 0
            r11 = 0
        L_0x0987:
            if (r2 >= r15) goto L_0x09ae
            java.util.ArrayList r1 = r7.f4756be
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.a.b.f r1 = (androidx.constraintlayout.p079a.p082b.C1638f) r1
            int r3 = r1.f4625ae
            int r18 = r1.mo4631i()
            int r3 = r3 + r18
            int r6 = java.lang.Math.max(r6, r3)
            int r3 = r1.f4626af
            int r1 = r1.mo4630h()
            int r3 = r3 + r1
            int r11 = java.lang.Math.max(r11, r3)
            int r2 = r2 + 1
            r1 = 64
            r3 = 0
            goto L_0x0987
        L_0x09ae:
            int r1 = r7.f4632al
            int r1 = java.lang.Math.max(r1, r6)
            int r2 = r7.f4633am
            int r2 = java.lang.Math.max(r2, r11)
            androidx.constraintlayout.a.b.e r3 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r12 != r3) goto L_0x09d1
            int r3 = r26.mo4631i()
            if (r3 >= r1) goto L_0x09d1
            r7.mo4618D(r1)
            androidx.constraintlayout.a.b.e[] r1 = r7.f4605Y
            androidx.constraintlayout.a.b.e r3 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            r5 = 0
            r1[r5] = r3
            r5 = 1
            r16 = 1
        L_0x09d1:
            androidx.constraintlayout.a.b.e r1 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r8 != r1) goto L_0x09ea
            int r1 = r26.mo4630h()
            if (r1 >= r2) goto L_0x09ea
            r7.mo4648z(r2)
            androidx.constraintlayout.a.b.e[] r1 = r7.f4605Y
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            r3 = 1
            r1[r3] = r2
            r5 = 1
            r16 = 1
            goto L_0x09ea
        L_0x09e9:
            r4 = 2
        L_0x09ea:
            int r1 = r7.f4632al
            int r2 = r26.mo4631i()
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r26.mo4631i()
            if (r1 <= r2) goto L_0x0a07
            r7.mo4618D(r1)
            androidx.constraintlayout.a.b.e[] r1 = r7.f4605Y
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            r3 = 0
            r1[r3] = r2
            r5 = 1
            r16 = 1
        L_0x0a07:
            int r1 = r7.f4633am
            int r2 = r26.mo4630h()
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r26.mo4630h()
            if (r1 <= r2) goto L_0x0a25
            r7.mo4648z(r1)
            androidx.constraintlayout.a.b.e[] r1 = r7.f4605Y
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            r3 = 1
            r1[r3] = r2
            r5 = 1
            r16 = 1
            goto L_0x0a26
        L_0x0a25:
            r3 = 1
        L_0x0a26:
            if (r16 != 0) goto L_0x0a64
            androidx.constraintlayout.a.b.e[] r1 = r7.f4605Y
            r2 = 0
            r6 = r1[r2]
            androidx.constraintlayout.a.b.e r11 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r6 != r11) goto L_0x0a45
            if (r9 <= 0) goto L_0x0a45
            int r6 = r26.mo4631i()
            if (r6 <= r9) goto L_0x0a45
            r7.f4680aV = r3
            androidx.constraintlayout.a.b.e r5 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            r1[r2] = r5
            r7.mo4618D(r9)
            r5 = 1
            r16 = 1
        L_0x0a45:
            androidx.constraintlayout.a.b.e[] r1 = r7.f4605Y
            r2 = r1[r3]
            androidx.constraintlayout.a.b.e r6 = androidx.constraintlayout.p079a.p082b.C1637e.WRAP_CONTENT
            if (r2 != r6) goto L_0x0a64
            if (r25 <= 0) goto L_0x0a64
            int r2 = r26.mo4630h()
            r6 = r25
            if (r2 <= r6) goto L_0x0a66
            r7.f4681aW = r3
            androidx.constraintlayout.a.b.e r2 = androidx.constraintlayout.p079a.p082b.C1637e.FIXED
            r1[r3] = r2
            r7.mo4648z(r6)
            r5 = 1
            r16 = 1
            goto L_0x0a66
        L_0x0a64:
            r6 = r25
        L_0x0a66:
            if (r10 <= r0) goto L_0x0a6a
            r0 = 0
            goto L_0x0a6b
        L_0x0a6a:
            r0 = 1
        L_0x0a6b:
            r1 = r0 & r5
            r0 = r10
            r13 = r24
            r11 = 64
            r10 = r6
            goto L_0x0667
        L_0x0a75:
            r1 = r13
            r7.f4756be = r1
            if (r16 == 0) goto L_0x0a82
            androidx.constraintlayout.a.b.e[] r0 = r7.f4605Y
            r1 = 0
            r0[r1] = r12
            r1 = 1
            r0[r1] = r8
        L_0x0a82:
            androidx.constraintlayout.a.d r0 = r7.f4672aN
            androidx.constraintlayout.a.c r0 = r0.f4770j
            r7.mo4644v(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p082b.C1639g.mo4653d():void");
    }

    /* renamed from: s */
    public final void mo4641s() {
        this.f4672aN.mo4682j();
        this.f4673aO = 0;
        this.f4674aP = 0;
        super.mo4641s();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4652a(C1638f fVar, int i) {
        if (i == 0) {
            int i2 = this.f4675aQ;
            C1635c[] cVarArr = this.f4678aT;
            int length = cVarArr.length;
            if (i2 + 1 >= length) {
                this.f4678aT = (C1635c[]) Arrays.copyOf(cVarArr, length + length);
            }
            C1635c[] cVarArr2 = this.f4678aT;
            int i3 = this.f4675aQ;
            cVarArr2[i3] = new C1635c(fVar, 0, this.f4691d);
            this.f4675aQ = i3 + 1;
            return;
        }
        int i4 = this.f4676aR;
        C1635c[] cVarArr3 = this.f4677aS;
        int length2 = cVarArr3.length;
        if (i4 + 1 >= length2) {
            this.f4677aS = (C1635c[]) Arrays.copyOf(cVarArr3, length2 + length2);
        }
        C1635c[] cVarArr4 = this.f4677aS;
        int i5 = this.f4676aR;
        cVarArr4[i5] = new C1635c(fVar, 1, this.f4691d);
        this.f4676aR = i5 + 1;
    }
}
