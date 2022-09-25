package androidx.p182p;

import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.C4050e;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: androidx.p.ak */
/* compiled from: PG */
public final class C3928ak extends C4050e {

    /* renamed from: a */
    public C3963p f12572a;

    /* renamed from: b */
    public final C3926ai f12573b;

    /* renamed from: c */
    public final String f12574c;

    /* renamed from: d */
    public final String f12575d;

    public C3928ak(C3963p pVar, C3926ai aiVar, String str, String str2) {
        super(aiVar.f12569a);
        this.f12572a = pVar;
        this.f12573b = aiVar;
        this.f12574c = str;
        this.f12575d = str2;
    }

    /* renamed from: b */
    public final void mo8198b(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.f12574c;
        dVar2.f12902a.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0031 A[EDGE_INSN: B:58:0x0031->B:16:0x0031 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8197a(androidx.p186q.p187a.C4049d r13, int r14, int r15) {
        /*
            r12 = this;
            androidx.p.p r0 = r12.f12572a
            if (r0 == 0) goto L_0x00ba
            androidx.p.ae r0 = r0.f12660d
            if (r14 != r15) goto L_0x000c
            h.a.am r0 = p5462h.p5463a.C69496am.f185918a
            goto L_0x007f
        L_0x000c:
            r1 = 0
            r2 = 1
            if (r15 <= r14) goto L_0x0012
            r3 = 1
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r14
        L_0x0019:
            if (r3 == 0) goto L_0x001e
            if (r5 >= r15) goto L_0x0020
            goto L_0x0022
        L_0x001e:
            if (r5 > r15) goto L_0x0022
        L_0x0020:
            r0 = r4
            goto L_0x007f
        L_0x0022:
            java.util.Map r6 = r0.f12554a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r6.get(r7)
            java.util.TreeMap r6 = (java.util.TreeMap) r6
            r7 = 0
            if (r6 != 0) goto L_0x0033
        L_0x0031:
            r0 = r7
            goto L_0x007f
        L_0x0033:
            if (r3 == 0) goto L_0x003a
            java.util.NavigableSet r8 = r6.descendingKeySet()
            goto L_0x003e
        L_0x003a:
            java.util.Set r8 = r6.keySet()
        L_0x003e:
            java.util.Iterator r8 = r8.iterator()
        L_0x0042:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x007b
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.String r10 = "targetVersion"
            if (r3 == 0) goto L_0x0060
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            int r10 = r9.intValue()
            int r11 = r5 + 1
            if (r11 > r10) goto L_0x0042
            if (r10 > r15) goto L_0x0042
            goto L_0x006b
        L_0x0060:
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            int r10 = r9.intValue()
            if (r15 > r10) goto L_0x0042
            if (r10 >= r5) goto L_0x0042
        L_0x006b:
            java.lang.Object r5 = r6.get(r9)
            p5462h.p5473f.p5475b.C69664n.m101058d(r5)
            r4.add(r5)
            int r5 = r9.intValue()
            r6 = 1
            goto L_0x007c
        L_0x007b:
            r6 = 0
        L_0x007c:
            if (r6 != 0) goto L_0x0019
            goto L_0x0031
        L_0x007f:
            if (r0 == 0) goto L_0x00ba
            androidx.p.ai r14 = r12.f12573b
            r14.mo8195e(r13)
            java.util.Iterator r14 = r0.iterator()
        L_0x008a:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x009a
            java.lang.Object r15 = r14.next()
            androidx.p.b.a r15 = (androidx.p182p.p184b.C3937a) r15
            r15.mo8220a(r13)
            goto L_0x008a
        L_0x009a:
            androidx.p.ai r14 = r12.f12573b
            androidx.p.aj r14 = r14.mo8191a(r13)
            boolean r15 = r14.f12570a
            if (r15 == 0) goto L_0x00a8
            r12.mo8198b(r13)
            return
        L_0x00a8:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.f12571b
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r15 = "Migration didn't properly handle: "
            java.lang.String r14 = r15.concat(r14)
            r13.<init>(r14)
            throw r13
        L_0x00ba:
            androidx.p.p r0 = r12.f12572a
            if (r0 == 0) goto L_0x00df
            if (r14 <= r15) goto L_0x00c4
            boolean r1 = r0.f12667k
            if (r1 != 0) goto L_0x00d4
        L_0x00c4:
            boolean r1 = r0.f12666j
            if (r1 == 0) goto L_0x00d4
            java.util.Set r0 = r0.f12668l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00df
        L_0x00d4:
            androidx.p.ai r14 = r12.f12573b
            r14.mo8193c(r13)
            androidx.p.ai r14 = r12.f12573b
            r14.mo8192b(r13)
            return
        L_0x00df:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "A migration from "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = " to "
            r0.append(r14)
            r0.append(r15)
            java.lang.String r14 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r13.<init>(r14)
            goto L_0x0101
        L_0x0100:
            throw r13
        L_0x0101:
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p182p.C3928ak.mo8197a(androidx.q.a.d, int, int):void");
    }
}
