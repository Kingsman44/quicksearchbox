package com.google.android.libraries.onegoogle.accountmenu.cards;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.onegoogle.account.disc.C30194av;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.ab */
/* compiled from: PG */
final class C30347ab implements C2333ah {

    /* renamed from: a */
    public final String f82065a;

    /* renamed from: b */
    final /* synthetic */ C30348ac f82066b;

    /* renamed from: c */
    public int f82067c;

    /* renamed from: d */
    private final C30349ad f82068d;

    /* renamed from: e */
    private final C30455w f82069e;

    /* renamed from: f */
    private final C30194av f82070f;

    /* renamed from: g */
    private C30346aa f82071g;

    /* renamed from: h */
    private C58833ax f82072h = C58836b.f156633a;

    public C30347ab(C30348ac acVar, C30349ad adVar, String str) {
        this.f82066b = acVar;
        this.f82068d = adVar;
        this.f82069e = new C30455w(adVar);
        this.f82070f = new C30458z(adVar);
        this.f82065a = str;
    }

    /* renamed from: b */
    public final void mo35911b() {
        C30346aa aaVar = this.f82071g;
        if (aaVar != null) {
            aaVar.f82063a = true;
            this.f82071g = null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.google.android.libraries.onegoogle.account.disc.av] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: hX */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo774hX(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.android.libraries.onegoogle.accountmenu.cards.s r9 = (com.google.android.libraries.onegoogle.accountmenu.cards.C30451s) r9
            r8.mo35911b()
            com.google.android.libraries.onegoogle.accountmenu.cards.w r0 = r8.f82069e
            long r1 = com.google.android.libraries.onegoogle.accountmenu.cards.C30348ac.f82073b
            int r1 = r9.mo36040b()
            r2 = 4
            if (r1 == r2) goto L_0x0011
            goto L_0x003d
        L_0x0011:
            com.google.common.base.ax r1 = r9.mo36039a()
            boolean r1 = r1.mo56113h()
            java.lang.String r3 = "Can't update progress ring without upload info present."
            com.google.common.base.C58838bb.m90869d(r1, r3)
            com.google.common.base.ax r1 = r9.mo36039a()
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.onegoogle.accountmenu.cards.t r1 = (com.google.android.libraries.onegoogle.accountmenu.cards.C30452t) r1
            r1.mo36042b()
            com.google.android.libraries.onegoogle.accountmenu.cards.r r3 = r0.f82268b
            if (r3 == 0) goto L_0x0032
            r3.mo36037a()
        L_0x0032:
            com.google.android.libraries.onegoogle.accountmenu.cards.ad r3 = r0.f82267a
            r1.mo36041a()
            java.lang.String r1 = r3.mo35925n()
            r0.f82269c = r1
        L_0x003d:
            int r0 = r8.f82067c
            r1 = 3
            if (r0 == r2) goto L_0x0053
            int r0 = r9.mo36040b()
            if (r0 == r1) goto L_0x0049
            goto L_0x0053
        L_0x0049:
            com.google.android.libraries.onegoogle.accountmenu.cards.ac r9 = r8.f82066b
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            androidx.lifecycle.ag r9 = r9.f81607a
            com.google.android.libraries.onegoogle.common.C30931r.m57728a(r9, r0)
            return
        L_0x0053:
            int r0 = r8.f82067c
            int r2 = r9.mo36040b()
            r3 = 0
            r4 = 2
            r5 = 0
            if (r0 == r2) goto L_0x011e
            java.lang.String r0 = r8.f82065a
            com.google.android.libraries.onegoogle.accountmenu.cards.ac r2 = r8.f82066b
            java.util.Map r2 = r2.f82075d
            java.lang.Object r0 = r2.get(r0)
            com.google.android.libraries.onegoogle.accountmenu.cards.db.e r0 = (com.google.android.libraries.onegoogle.accountmenu.cards.p2355db.C30426e) r0
            if (r0 != 0) goto L_0x006e
            r0 = 0
            goto L_0x0072
        L_0x006e:
            int r0 = r0.mo35998d()
        L_0x0072:
            int r2 = r9.mo36040b()
            if (r0 == r2) goto L_0x0092
            com.google.android.libraries.onegoogle.accountmenu.cards.ac r2 = r8.f82066b
            java.util.Map r2 = r2.f82075d
            java.lang.String r6 = r8.f82065a
            java.lang.Object r2 = r2.remove(r6)
            com.google.android.libraries.onegoogle.accountmenu.cards.db.e r2 = (com.google.android.libraries.onegoogle.accountmenu.cards.p2355db.C30426e) r2
            if (r2 == 0) goto L_0x0092
            com.google.android.libraries.onegoogle.accountmenu.cards.ac r6 = r8.f82066b
            java.util.concurrent.Executor r6 = r6.f82083f
            com.google.android.libraries.onegoogle.accountmenu.cards.x r7 = new com.google.android.libraries.onegoogle.accountmenu.cards.x
            r7.<init>(r8, r2)
            r6.execute(r7)
        L_0x0092:
            int r2 = r9.mo36040b()
            if (r0 != r2) goto L_0x00b7
            com.google.android.libraries.onegoogle.accountmenu.cards.ac r0 = r8.f82066b
            java.util.Map r0 = r0.f82075d
            java.lang.String r2 = r8.f82065a
            java.lang.Object r0 = r0.get(r2)
            com.google.android.libraries.onegoogle.accountmenu.cards.db.e r0 = (com.google.android.libraries.onegoogle.accountmenu.cards.p2355db.C30426e) r0
            if (r0 != 0) goto L_0x00a7
            goto L_0x00b7
        L_0x00a7:
            int r0 = r0.mo35998d()
            boolean r0 = com.google.android.libraries.onegoogle.accountmenu.cards.C30348ac.m56513c(r0)
            if (r0 != 0) goto L_0x00b7
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            r8.f82072h = r0
            goto L_0x011e
        L_0x00b7:
            com.google.android.libraries.onegoogle.accountmenu.cards.ad r0 = r8.f82068d
            int r2 = r9.mo36040b()
            int r6 = r2 + -1
            if (r2 == 0) goto L_0x011d
            r2 = 1
            if (r6 == r2) goto L_0x0101
            if (r6 == r4) goto L_0x00f6
            if (r6 == r1) goto L_0x00ee
            r2 = 5
            if (r6 == r2) goto L_0x00e5
            r2 = 6
            if (r6 == r2) goto L_0x00da
            r2 = 8
            if (r6 == r2) goto L_0x00e5
            r2 = 9
            if (r6 == r2) goto L_0x00da
            r0 = r5
            r2 = r0
            r6 = r2
            goto L_0x010b
        L_0x00da:
            android.graphics.drawable.Drawable r2 = r0.mo35916e()
            java.lang.String r0 = r0.mo35921j()
            com.google.android.libraries.onegoogle.account.disc.aa r6 = com.google.android.libraries.onegoogle.account.disc.C30173aa.PAUSED_UPLOAD_ARROW
            goto L_0x010b
        L_0x00e5:
            com.google.android.libraries.onegoogle.account.disc.z r0 = r0.mo35917f()
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x011a
        L_0x00ee:
            android.graphics.drawable.Drawable r2 = r0.mo35914c()
            com.google.android.libraries.onegoogle.account.disc.aa r6 = com.google.android.libraries.onegoogle.account.disc.C30173aa.UPLOAD_ARROW
            r0 = r5
            goto L_0x010b
        L_0x00f6:
            android.graphics.drawable.Drawable r2 = r0.mo35912a()
            java.lang.String r0 = r0.mo35919h()
            com.google.android.libraries.onegoogle.account.disc.aa r6 = com.google.android.libraries.onegoogle.account.disc.C30173aa.COMPLETED_CHECKMARK
            goto L_0x010b
        L_0x0101:
            android.graphics.drawable.Drawable r2 = r0.mo35915d()
            java.lang.String r0 = r0.mo35920i()
            com.google.android.libraries.onegoogle.account.disc.aa r6 = com.google.android.libraries.onegoogle.account.disc.C30173aa.SYNCING_OFF
        L_0x010b:
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            if (r2 == 0) goto L_0x0119
            com.google.android.libraries.onegoogle.account.disc.i r7 = new com.google.android.libraries.onegoogle.account.disc.i
            r7.<init>(r2, r0, r6)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r7)
            goto L_0x011a
        L_0x0119:
            r0 = r7
        L_0x011a:
            r8.f82072h = r0
            goto L_0x011e
        L_0x011d:
            throw r5
        L_0x011e:
            com.google.android.libraries.onegoogle.accountmenu.cards.w r0 = r8.f82069e
            com.google.android.libraries.onegoogle.account.disc.av r2 = r8.f82070f
            int r6 = r9.mo36040b()
            int r7 = r6 + -1
            if (r6 == 0) goto L_0x0190
            if (r7 == r4) goto L_0x0134
            if (r7 == r1) goto L_0x0131
            r0 = r5
            r2 = r0
            goto L_0x0136
        L_0x0131:
            java.lang.String r2 = r0.f82269c
            goto L_0x0136
        L_0x0134:
            r0 = r2
            r2 = r5
        L_0x0136:
            if (r0 != 0) goto L_0x013b
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x0144
        L_0x013b:
            com.google.android.libraries.onegoogle.account.disc.l r4 = new com.google.android.libraries.onegoogle.account.disc.l
            r4.<init>(r5, r0, r2, r3)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r4)
        L_0x0144:
            com.google.android.libraries.onegoogle.accountmenu.cards.ac r2 = r8.f82066b
            com.google.common.base.ax r3 = r8.f82072h
            boolean r3 = r3.mo56113h()
            if (r3 == 0) goto L_0x016c
            com.google.android.libraries.onegoogle.account.disc.j r3 = new com.google.android.libraries.onegoogle.account.disc.j
            r3.<init>()
            com.google.common.base.ax r4 = r8.f82072h
            if (r4 == 0) goto L_0x0164
            r3.f81671a = r4
            r3.f81672b = r0
            com.google.android.libraries.onegoogle.account.disc.ac r0 = r3.mo35622a()
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x016e
        L_0x0164:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r0 = "Null badgeContent"
            r9.<init>(r0)
            throw r9
        L_0x016c:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x016e:
            androidx.lifecycle.ag r2 = r2.f81607a
            com.google.android.libraries.onegoogle.common.C30931r.m57728a(r2, r0)
            int r0 = r9.mo36040b()
            if (r0 != r1) goto L_0x0189
            com.google.android.libraries.onegoogle.accountmenu.cards.aa r0 = new com.google.android.libraries.onegoogle.accountmenu.cards.aa
            r0.<init>(r8)
            r8.f82071g = r0
            long r1 = com.google.android.libraries.onegoogle.accountmenu.cards.C30348ac.f82073b
            android.os.Handler r3 = com.google.android.libraries.p1623at.p1632e.C19559g.m37302a()
            r3.postDelayed(r0, r1)
        L_0x0189:
            int r9 = r9.mo36040b()
            r8.f82067c = r9
            return
        L_0x0190:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.accountmenu.cards.C30347ab.mo774hX(java.lang.Object):void");
    }
}
