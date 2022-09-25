package androidx.work.impl.background.systemalarm;

/* renamed from: androidx.work.impl.background.systemalarm.i */
/* compiled from: PG */
final class C4529i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4533m f14322a;

    public C4529i(C4533m mVar) {
        this.f14322a = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01b7, code lost:
        if ("ACTION_SCHEDULE_WORK".equals(r11) == false) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01b9, code lost:
        r0 = androidx.work.impl.background.systemalarm.C4523c.m12879g(r9);
        r2 = androidx.work.C4380ad.m12560h();
        r7 = androidx.work.impl.background.systemalarm.C4523c.f14298a;
        r9 = new java.lang.StringBuilder();
        r9.append("Handling schedule work for ");
        r9.append(r0);
        r2.mo9309a(r7, "Handling schedule work for ".concat(r0.toString()));
        r2 = r3.f14331e.f14143e;
        r2.mo8181p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r7 = r2.mo9364F().mo9422b(r0.f14269a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01ec, code lost:
        if (r7 != null) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01ee, code lost:
        r3 = androidx.work.C4380ad.m12560h();
        r5 = androidx.work.impl.background.systemalarm.C4523c.f14298a;
        r3.mo9314f(r5, "Skipping scheduling " + r0 + " because it's no longer in the DB");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r2.mo8183r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0218, code lost:
        if (r7.f14218c.mo9323a() == false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x021a, code lost:
        r3 = androidx.work.C4380ad.m12560h();
        r5 = androidx.work.impl.background.systemalarm.C4523c.f14298a;
        r3.mo9314f(r5, "Skipping scheduling " + r0 + "because it is finished.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x023a, code lost:
        r9 = r7.mo9413a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0242, code lost:
        if (r7.mo9415d() != false) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0244, code lost:
        r5 = androidx.work.C4380ad.m12560h();
        r7 = androidx.work.impl.background.systemalarm.C4523c.f14298a;
        r5.mo9309a(r7, "Setting up Alarms for " + r0 + "at " + r9);
        androidx.work.impl.background.systemalarm.C4522b.m12871b(r8.f14299b, r3.f14331e, r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x026e, code lost:
        r7 = androidx.work.C4380ad.m12560h();
        r11 = androidx.work.impl.background.systemalarm.C4523c.f14298a;
        r7.mo9309a(r11, "Opportunistically setting an alarm for " + r0 + "at " + r9);
        androidx.work.impl.background.systemalarm.C4522b.m12871b(r8.f14299b, r3.f14331e, r0, r9);
        r3.f14336j.f14488c.execute(new androidx.work.impl.background.systemalarm.C4530j(r3, androidx.work.impl.background.systemalarm.C4523c.m12874b(r8.f14299b), r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x02a9, code lost:
        r2.mo8188w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x02b9, code lost:
        if ("ACTION_DELAY_MET".equals(r11) == false) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02bb, code lost:
        r2 = r8.f14301d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02bd, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r0 = androidx.work.impl.background.systemalarm.C4523c.m12879g(r9);
        r7 = androidx.work.C4380ad.m12560h();
        r9 = androidx.work.impl.background.systemalarm.C4523c.f14298a;
        r7.mo9309a(r9, "Handing delay met for " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02e2, code lost:
        if (r8.f14300c.containsKey(r0) != false) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02e4, code lost:
        r7 = new androidx.work.impl.background.systemalarm.C4528h(r8.f14299b, r5, r3, r8.f14302e.mo9562b(r0));
        r8.f14300c.put(r0, r7);
        r0 = r7.f14312d.f14269a;
        r3 = r7.f14310b;
        r7.f14318j = androidx.work.impl.utils.C4582ac.m12985a(r3, r0 + " (" + r7.f14311c + ")");
        r3 = androidx.work.C4380ad.m12560h();
        r5 = androidx.work.impl.background.systemalarm.C4528h.f14309a;
        r3.mo9309a(r5, "Acquiring wakelock " + r7.f14318j + "for WorkSpec " + r0);
        r7.f14318j.acquire();
        r3 = r7.f14313e.f14331e.f14143e.mo9364F().mo9422b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0354, code lost:
        if (r3 != null) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0356, code lost:
        r7.f14316h.execute(new androidx.work.impl.background.systemalarm.C4526f(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0361, code lost:
        r5 = r3.mo9415d();
        r7.f14319k = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0367, code lost:
        if (r5 != false) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0369, code lost:
        androidx.work.C4380ad.m12560h().mo9309a(androidx.work.impl.background.systemalarm.C4528h.f14309a, "No constraints for ".concat(java.lang.String.valueOf(r0)));
        r7.mo9387e(java.util.Collections.singletonList(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0384, code lost:
        r7.f14314f.mo9389a(java.util.Collections.singletonList(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x038e, code lost:
        r3 = androidx.work.C4380ad.m12560h();
        r5 = androidx.work.impl.background.systemalarm.C4523c.f14298a;
        r3.mo9309a(r5, "WorkSpec " + r0 + " is is already being handled for ACTION_DELAY_MET");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x03ad, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x03b9, code lost:
        if ("ACTION_STOP_WORK".equals(r11) == false) goto L_0x0426;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x03bb, code lost:
        r0 = r9.getExtras();
        r5 = r0.getString("KEY_WORKSPEC_ID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x03cb, code lost:
        if (r0.containsKey("KEY_WORKSPEC_GENERATION") == false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x03cd, code lost:
        r0 = r0.getInt("KEY_WORKSPEC_GENERATION");
        r9 = new java.util.ArrayList(1);
        r0 = r8.f14302e.mo9561a(new androidx.work.impl.p207b.C4509r(r5, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x03e3, code lost:
        if (r0 == null) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x03e5, code lost:
        r9.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x03e9, code lost:
        r9 = r8.f14302e.mo9563c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x03ef, code lost:
        r0 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x03f7, code lost:
        if (r0.hasNext() == false) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x03f9, code lost:
        r2 = (androidx.work.impl.C4620v) r0.next();
        androidx.work.C4380ad.m12560h().mo9309a(androidx.work.impl.background.systemalarm.C4523c.f14298a, "Handing stopWork work for ".concat(java.lang.String.valueOf(r5)));
        r3.f14331e.mo9395o(r2);
        androidx.work.impl.background.systemalarm.C4522b.m12870a(r8.f14299b, r3.f14331e, r2.f14519a);
        r3.mo9473a(r2.f14519a, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x042c, code lost:
        if ("ACTION_EXECUTION_COMPLETED".equals(r11) == false) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x042e, code lost:
        r0 = androidx.work.impl.background.systemalarm.C4523c.m12879g(r9);
        r2 = r9.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        r3 = androidx.work.C4380ad.m12560h();
        r7 = androidx.work.impl.background.systemalarm.C4523c.f14298a;
        r3.mo9309a(r7, "Handling onExecutionCompleted " + r9 + ", " + r5);
        r8.mo9473a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0462, code lost:
        r0 = androidx.work.C4380ad.m12560h();
        r2 = androidx.work.impl.background.systemalarm.C4523c.f14298a;
        r3 = new java.lang.StringBuilder();
        r3.append("Ignoring intent ");
        r3.append(r9);
        r0.mo9314f(r2, "Ignoring intent ".concat(java.lang.String.valueOf(r9)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r0 = "Handling reschedule "
            java.lang.String r2 = "Handling constraints changed "
            java.lang.String r3 = "Acquiring operation wake lock ("
            androidx.work.impl.background.systemalarm.m r4 = r1.f14322a
            java.util.List r4 = r4.f14333g
            monitor-enter(r4)
            androidx.work.impl.background.systemalarm.m r5 = r1.f14322a     // Catch:{ all -> 0x053c }
            java.util.List r6 = r5.f14333g     // Catch:{ all -> 0x053c }
            r7 = 0
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x053c }
            android.content.Intent r6 = (android.content.Intent) r6     // Catch:{ all -> 0x053c }
            r5.f14334h = r6     // Catch:{ all -> 0x053c }
            monitor-exit(r4)     // Catch:{ all -> 0x053c }
            androidx.work.impl.background.systemalarm.m r4 = r1.f14322a
            android.content.Intent r4 = r4.f14334h
            if (r4 == 0) goto L_0x053b
            java.lang.String r4 = r4.getAction()
            androidx.work.impl.background.systemalarm.m r5 = r1.f14322a
            android.content.Intent r5 = r5.f14334h
            java.lang.String r6 = "KEY_START_ID"
            int r5 = r5.getIntExtra(r6, r7)
            androidx.work.ad r6 = androidx.work.C4380ad.m12560h()
            java.lang.String r8 = androidx.work.impl.background.systemalarm.C4533m.f14327a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Processing command "
            r9.<init>(r10)
            androidx.work.impl.background.systemalarm.m r10 = r1.f14322a
            android.content.Intent r10 = r10.f14334h
            r9.append(r10)
            java.lang.String r10 = ", "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            r6.mo9309a(r8, r9)
            androidx.work.impl.background.systemalarm.m r6 = r1.f14322a
            android.content.Context r6 = r6.f14328b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            java.lang.String r9 = " ("
            r8.append(r9)
            r8.append(r5)
            java.lang.String r9 = ")"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.os.PowerManager$WakeLock r6 = androidx.work.impl.utils.C4582ac.m12985a(r6, r8)
            androidx.work.ad r8 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x04cf }
            java.lang.String r9 = androidx.work.impl.background.systemalarm.C4533m.f14327a     // Catch:{ all -> 0x04cf }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x04cf }
            r10.<init>(r3)     // Catch:{ all -> 0x04cf }
            r10.append(r4)     // Catch:{ all -> 0x04cf }
            java.lang.String r3 = ") "
            r10.append(r3)     // Catch:{ all -> 0x04cf }
            r10.append(r6)     // Catch:{ all -> 0x04cf }
            java.lang.String r3 = r10.toString()     // Catch:{ all -> 0x04cf }
            r8.mo9309a(r9, r3)     // Catch:{ all -> 0x04cf }
            r6.acquire()     // Catch:{ all -> 0x04cf }
            androidx.work.impl.background.systemalarm.m r3 = r1.f14322a     // Catch:{ all -> 0x04cf }
            androidx.work.impl.background.systemalarm.c r8 = r3.f14332f     // Catch:{ all -> 0x04cf }
            android.content.Intent r9 = r3.f14334h     // Catch:{ all -> 0x04cf }
            java.lang.String r10 = " , requires KEY_WORKSPEC_ID ."
            java.lang.String r11 = r9.getAction()     // Catch:{ all -> 0x04cf }
            java.lang.String r12 = "ACTION_CONSTRAINTS_CHANGED"
            boolean r12 = r12.equals(r11)     // Catch:{ all -> 0x04cf }
            if (r12 == 0) goto L_0x0162
            androidx.work.ad r0 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x04cf }
            java.lang.String r10 = androidx.work.impl.background.systemalarm.C4523c.f14298a     // Catch:{ all -> 0x04cf }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x04cf }
            r11.<init>(r2)     // Catch:{ all -> 0x04cf }
            java.lang.String r2 = "Handling constraints changed "
            r11.append(r9)     // Catch:{ all -> 0x04cf }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x04cf }
            java.lang.String r2 = r2.concat(r9)     // Catch:{ all -> 0x04cf }
            r0.mo9309a(r10, r2)     // Catch:{ all -> 0x04cf }
            java.lang.String r0 = androidx.work.impl.background.systemalarm.C4525e.f14306a     // Catch:{ all -> 0x04cf }
            android.content.Context r0 = r8.f14299b     // Catch:{ all -> 0x04cf }
            androidx.work.impl.ag r2 = r3.f14331e     // Catch:{ all -> 0x04cf }
            androidx.work.impl.a.b.p r2 = r2.f14150l     // Catch:{ all -> 0x04cf }
            androidx.work.impl.a.e r8 = new androidx.work.impl.a.e     // Catch:{ all -> 0x04cf }
            r9 = 0
            r8.<init>(r2, r9)     // Catch:{ all -> 0x04cf }
            androidx.work.impl.ag r2 = r3.f14331e     // Catch:{ all -> 0x04cf }
            androidx.work.impl.WorkDatabase r2 = r2.f14143e     // Catch:{ all -> 0x04cf }
            androidx.work.impl.b.af r2 = r2.mo9364F()     // Catch:{ all -> 0x04cf }
            java.util.List r2 = r2.mo9427g()     // Catch:{ all -> 0x04cf }
            androidx.work.impl.background.systemalarm.ConstraintProxy.m12865a(r0, r2)     // Catch:{ all -> 0x04cf }
            r8.mo9389a(r2)     // Catch:{ all -> 0x04cf }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x04cf }
            int r10 = r2.size()     // Catch:{ all -> 0x04cf }
            r9.<init>(r10)     // Catch:{ all -> 0x04cf }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04cf }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x04cf }
        L_0x00f3:
            boolean r12 = r2.hasNext()     // Catch:{ all -> 0x04cf }
            if (r12 == 0) goto L_0x0119
            java.lang.Object r12 = r2.next()     // Catch:{ all -> 0x04cf }
            androidx.work.impl.b.ae r12 = (androidx.work.impl.p207b.C4470ae) r12     // Catch:{ all -> 0x04cf }
            java.lang.String r13 = r12.f14217b     // Catch:{ all -> 0x04cf }
            long r14 = r12.mo9413a()     // Catch:{ all -> 0x04cf }
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00f3
            boolean r14 = r12.mo9415d()     // Catch:{ all -> 0x04cf }
            if (r14 == 0) goto L_0x0115
            boolean r13 = r8.mo9391c(r13)     // Catch:{ all -> 0x04cf }
            if (r13 == 0) goto L_0x00f3
        L_0x0115:
            r9.add(r12)     // Catch:{ all -> 0x04cf }
            goto L_0x00f3
        L_0x0119:
            int r2 = r9.size()     // Catch:{ all -> 0x04cf }
        L_0x011d:
            if (r7 >= r2) goto L_0x015d
            java.lang.Object r10 = r9.get(r7)     // Catch:{ all -> 0x04cf }
            androidx.work.impl.b.ae r10 = (androidx.work.impl.p207b.C4470ae) r10     // Catch:{ all -> 0x04cf }
            java.lang.String r11 = r10.f14217b     // Catch:{ all -> 0x04cf }
            androidx.work.impl.b.r r10 = androidx.work.impl.p207b.C4486au.m12791a(r10)     // Catch:{ all -> 0x04cf }
            android.content.Intent r10 = androidx.work.impl.background.systemalarm.C4523c.m12875c(r0, r10)     // Catch:{ all -> 0x04cf }
            androidx.work.ad r12 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x04cf }
            java.lang.String r13 = androidx.work.impl.background.systemalarm.C4525e.f14306a     // Catch:{ all -> 0x04cf }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x04cf }
            r14.<init>()     // Catch:{ all -> 0x04cf }
            java.lang.String r15 = "Creating a delay_met command for workSpec with id ("
            r14.append(r15)     // Catch:{ all -> 0x04cf }
            r14.append(r11)     // Catch:{ all -> 0x04cf }
            java.lang.String r11 = ")"
            r14.append(r11)     // Catch:{ all -> 0x04cf }
            java.lang.String r11 = r14.toString()     // Catch:{ all -> 0x04cf }
            r12.mo9309a(r13, r11)     // Catch:{ all -> 0x04cf }
            androidx.work.impl.utils.b.b r11 = r3.f14336j     // Catch:{ all -> 0x04cf }
            java.util.concurrent.Executor r11 = r11.f14488c     // Catch:{ all -> 0x04cf }
            androidx.work.impl.background.systemalarm.j r12 = new androidx.work.impl.background.systemalarm.j     // Catch:{ all -> 0x04cf }
            r12.<init>(r3, r10, r5)     // Catch:{ all -> 0x04cf }
            r11.execute(r12)     // Catch:{ all -> 0x04cf }
            int r7 = r7 + 1
            goto L_0x011d
        L_0x015d:
            r8.mo9390b()     // Catch:{ all -> 0x04cf }
            goto L_0x049e
        L_0x0162:
            java.lang.String r2 = "ACTION_RESCHEDULE"
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x04cf }
            if (r2 == 0) goto L_0x018e
            androidx.work.ad r2 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x04cf }
            java.lang.String r7 = androidx.work.impl.background.systemalarm.C4523c.f14298a     // Catch:{ all -> 0x04cf }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x04cf }
            r8.<init>(r0)     // Catch:{ all -> 0x04cf }
            r8.append(r9)     // Catch:{ all -> 0x04cf }
            java.lang.String r0 = ", "
            r8.append(r0)     // Catch:{ all -> 0x04cf }
            r8.append(r5)     // Catch:{ all -> 0x04cf }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x04cf }
            r2.mo9309a(r7, r0)     // Catch:{ all -> 0x04cf }
            androidx.work.impl.ag r0 = r3.f14331e     // Catch:{ all -> 0x04cf }
            r0.mo9393m()     // Catch:{ all -> 0x04cf }
            goto L_0x049e
        L_0x018e:
            android.os.Bundle r0 = r9.getExtras()     // Catch:{ all -> 0x04cf }
            r2 = 1
            java.lang.String[] r12 = new java.lang.String[r2]     // Catch:{ all -> 0x04cf }
            java.lang.String r13 = "KEY_WORKSPEC_ID"
            r12[r7] = r13     // Catch:{ all -> 0x04cf }
            if (r0 == 0) goto L_0x0481
            boolean r13 = r0.isEmpty()     // Catch:{ all -> 0x04cf }
            if (r13 == 0) goto L_0x01a3
            goto L_0x0481
        L_0x01a3:
            r13 = 0
        L_0x01a4:
            if (r13 > 0) goto L_0x01b1
            r14 = r12[r13]     // Catch:{ all -> 0x04cf }
            java.lang.Object r14 = r0.get(r14)     // Catch:{ all -> 0x04cf }
            if (r14 == 0) goto L_0x0481
            int r13 = r13 + 1
            goto L_0x01a4
        L_0x01b1:
            java.lang.String r0 = "ACTION_SCHEDULE_WORK"
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x04cf }
            if (r0 == 0) goto L_0x02b3
            androidx.work.impl.b.r r0 = androidx.work.impl.background.systemalarm.C4523c.m12879g(r9)     // Catch:{ all -> 0x04cf }
            androidx.work.ad r2 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x04cf }
            java.lang.String r7 = androidx.work.impl.background.systemalarm.C4523c.f14298a     // Catch:{ all -> 0x04cf }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x04cf }
            r9.<init>()     // Catch:{ all -> 0x04cf }
            java.lang.String r10 = "Handling schedule work for "
            r9.append(r10)     // Catch:{ all -> 0x04cf }
            r9.append(r0)     // Catch:{ all -> 0x04cf }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x04cf }
            java.lang.String r9 = r10.concat(r9)     // Catch:{ all -> 0x04cf }
            r2.mo9309a(r7, r9)     // Catch:{ all -> 0x04cf }
            androidx.work.impl.ag r2 = r3.f14331e     // Catch:{ all -> 0x04cf }
            androidx.work.impl.WorkDatabase r2 = r2.f14143e     // Catch:{ all -> 0x04cf }
            r2.mo8181p()     // Catch:{ all -> 0x04cf }
            androidx.work.impl.b.af r7 = r2.mo9364F()     // Catch:{ all -> 0x02ae }
            java.lang.String r9 = r0.f14269a     // Catch:{ all -> 0x02ae }
            androidx.work.impl.b.ae r7 = r7.mo9422b(r9)     // Catch:{ all -> 0x02ae }
            if (r7 != 0) goto L_0x0212
            androidx.work.ad r3 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x02ae }
            java.lang.String r5 = androidx.work.impl.background.systemalarm.C4523c.f14298a     // Catch:{ all -> 0x02ae }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ae }
            r7.<init>()     // Catch:{ all -> 0x02ae }
            java.lang.String r8 = "Skipping scheduling "
            r7.append(r8)     // Catch:{ all -> 0x02ae }
            r7.append(r0)     // Catch:{ all -> 0x02ae }
            java.lang.String r0 = " because it's no longer in the DB"
            r7.append(r0)     // Catch:{ all -> 0x02ae }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x02ae }
            r3.mo9314f(r5, r0)     // Catch:{ all -> 0x02ae }
        L_0x020d:
            r2.mo8183r()     // Catch:{ all -> 0x04cf }
            goto L_0x049e
        L_0x0212:
            androidx.work.ar r9 = r7.f14218c     // Catch:{ all -> 0x02ae }
            boolean r9 = r9.mo9323a()     // Catch:{ all -> 0x02ae }
            if (r9 == 0) goto L_0x023a
            androidx.work.ad r3 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x02ae }
            java.lang.String r5 = androidx.work.impl.background.systemalarm.C4523c.f14298a     // Catch:{ all -> 0x02ae }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ae }
            r7.<init>()     // Catch:{ all -> 0x02ae }
            java.lang.String r8 = "Skipping scheduling "
            r7.append(r8)     // Catch:{ all -> 0x02ae }
            r7.append(r0)     // Catch:{ all -> 0x02ae }
            java.lang.String r0 = "because it is finished."
            r7.append(r0)     // Catch:{ all -> 0x02ae }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x02ae }
            r3.mo9314f(r5, r0)     // Catch:{ all -> 0x02ae }
            goto L_0x020d
        L_0x023a:
            long r9 = r7.mo9413a()     // Catch:{ all -> 0x02ae }
            boolean r7 = r7.mo9415d()     // Catch:{ all -> 0x02ae }
            if (r7 != 0) goto L_0x026e
            androidx.work.ad r5 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x02ae }
            java.lang.String r7 = androidx.work.impl.background.systemalarm.C4523c.f14298a     // Catch:{ all -> 0x02ae }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ae }
            r11.<init>()     // Catch:{ all -> 0x02ae }
            java.lang.String r12 = "Setting up Alarms for "
            r11.append(r12)     // Catch:{ all -> 0x02ae }
            r11.append(r0)     // Catch:{ all -> 0x02ae }
            java.lang.String r12 = "at "
            r11.append(r12)     // Catch:{ all -> 0x02ae }
            r11.append(r9)     // Catch:{ all -> 0x02ae }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x02ae }
            r5.mo9309a(r7, r11)     // Catch:{ all -> 0x02ae }
            android.content.Context r5 = r8.f14299b     // Catch:{ all -> 0x02ae }
            androidx.work.impl.ag r3 = r3.f14331e     // Catch:{ all -> 0x02ae }
            androidx.work.impl.background.systemalarm.C4522b.m12871b(r5, r3, r0, r9)     // Catch:{ all -> 0x02ae }
            goto L_0x02a9
        L_0x026e:
            androidx.work.ad r7 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x02ae }
            java.lang.String r11 = androidx.work.impl.background.systemalarm.C4523c.f14298a     // Catch:{ all -> 0x02ae }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ae }
            r12.<init>()     // Catch:{ all -> 0x02ae }
            java.lang.String r13 = "Opportunistically setting an alarm for "
            r12.append(r13)     // Catch:{ all -> 0x02ae }
            r12.append(r0)     // Catch:{ all -> 0x02ae }
            java.lang.String r13 = "at "
            r12.append(r13)     // Catch:{ all -> 0x02ae }
            r12.append(r9)     // Catch:{ all -> 0x02ae }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x02ae }
            r7.mo9309a(r11, r12)     // Catch:{ all -> 0x02ae }
            android.content.Context r7 = r8.f14299b     // Catch:{ all -> 0x02ae }
            androidx.work.impl.ag r11 = r3.f14331e     // Catch:{ all -> 0x02ae }
            androidx.work.impl.background.systemalarm.C4522b.m12871b(r7, r11, r0, r9)     // Catch:{ all -> 0x02ae }
            android.content.Context r0 = r8.f14299b     // Catch:{ all -> 0x02ae }
            android.content.Intent r0 = androidx.work.impl.background.systemalarm.C4523c.m12874b(r0)     // Catch:{ all -> 0x02ae }
            androidx.work.impl.utils.b.b r7 = r3.f14336j     // Catch:{ all -> 0x02ae }
            java.util.concurrent.Executor r7 = r7.f14488c     // Catch:{ all -> 0x02ae }
            androidx.work.impl.background.systemalarm.j r8 = new androidx.work.impl.background.systemalarm.j     // Catch:{ all -> 0x02ae }
            r8.<init>(r3, r0, r5)     // Catch:{ all -> 0x02ae }
            r7.execute(r8)     // Catch:{ all -> 0x02ae }
        L_0x02a9:
            r2.mo8188w()     // Catch:{ all -> 0x02ae }
            goto L_0x020d
        L_0x02ae:
            r0 = move-exception
            r2.mo8183r()     // Catch:{ all -> 0x04cf }
            throw r0     // Catch:{ all -> 0x04cf }
        L_0x02b3:
            java.lang.String r0 = "ACTION_DELAY_MET"
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x04cf }
            if (r0 == 0) goto L_0x03b3
            java.lang.Object r2 = r8.f14301d     // Catch:{ all -> 0x04cf }
            monitor-enter(r2)     // Catch:{ all -> 0x04cf }
            androidx.work.impl.b.r r0 = androidx.work.impl.background.systemalarm.C4523c.m12879g(r9)     // Catch:{ all -> 0x03b0 }
            androidx.work.ad r7 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x03b0 }
            java.lang.String r9 = androidx.work.impl.background.systemalarm.C4523c.f14298a     // Catch:{ all -> 0x03b0 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x03b0 }
            r10.<init>()     // Catch:{ all -> 0x03b0 }
            java.lang.String r11 = "Handing delay met for "
            r10.append(r11)     // Catch:{ all -> 0x03b0 }
            r10.append(r0)     // Catch:{ all -> 0x03b0 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x03b0 }
            r7.mo9309a(r9, r10)     // Catch:{ all -> 0x03b0 }
            java.util.Map r7 = r8.f14300c     // Catch:{ all -> 0x03b0 }
            boolean r7 = r7.containsKey(r0)     // Catch:{ all -> 0x03b0 }
            if (r7 != 0) goto L_0x038e
            androidx.work.impl.background.systemalarm.h r7 = new androidx.work.impl.background.systemalarm.h     // Catch:{ all -> 0x03b0 }
            android.content.Context r9 = r8.f14299b     // Catch:{ all -> 0x03b0 }
            androidx.work.impl.w r10 = r8.f14302e     // Catch:{ all -> 0x03b0 }
            androidx.work.impl.v r10 = r10.mo9562b(r0)     // Catch:{ all -> 0x03b0 }
            r7.<init>(r9, r5, r3, r10)     // Catch:{ all -> 0x03b0 }
            java.util.Map r3 = r8.f14300c     // Catch:{ all -> 0x03b0 }
            r3.put(r0, r7)     // Catch:{ all -> 0x03b0 }
            androidx.work.impl.b.r r0 = r7.f14312d     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = r0.f14269a     // Catch:{ all -> 0x03b0 }
            android.content.Context r3 = r7.f14310b     // Catch:{ all -> 0x03b0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x03b0 }
            r5.<init>()     // Catch:{ all -> 0x03b0 }
            r5.append(r0)     // Catch:{ all -> 0x03b0 }
            java.lang.String r8 = " ("
            r5.append(r8)     // Catch:{ all -> 0x03b0 }
            int r8 = r7.f14311c     // Catch:{ all -> 0x03b0 }
            r5.append(r8)     // Catch:{ all -> 0x03b0 }
            java.lang.String r8 = ")"
            r5.append(r8)     // Catch:{ all -> 0x03b0 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x03b0 }
            android.os.PowerManager$WakeLock r3 = androidx.work.impl.utils.C4582ac.m12985a(r3, r5)     // Catch:{ all -> 0x03b0 }
            r7.f14318j = r3     // Catch:{ all -> 0x03b0 }
            androidx.work.ad r3 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x03b0 }
            java.lang.String r5 = androidx.work.impl.background.systemalarm.C4528h.f14309a     // Catch:{ all -> 0x03b0 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x03b0 }
            r8.<init>()     // Catch:{ all -> 0x03b0 }
            java.lang.String r9 = "Acquiring wakelock "
            r8.append(r9)     // Catch:{ all -> 0x03b0 }
            android.os.PowerManager$WakeLock r9 = r7.f14318j     // Catch:{ all -> 0x03b0 }
            r8.append(r9)     // Catch:{ all -> 0x03b0 }
            java.lang.String r9 = "for WorkSpec "
            r8.append(r9)     // Catch:{ all -> 0x03b0 }
            r8.append(r0)     // Catch:{ all -> 0x03b0 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x03b0 }
            r3.mo9309a(r5, r8)     // Catch:{ all -> 0x03b0 }
            android.os.PowerManager$WakeLock r3 = r7.f14318j     // Catch:{ all -> 0x03b0 }
            r3.acquire()     // Catch:{ all -> 0x03b0 }
            androidx.work.impl.background.systemalarm.m r3 = r7.f14313e     // Catch:{ all -> 0x03b0 }
            androidx.work.impl.ag r3 = r3.f14331e     // Catch:{ all -> 0x03b0 }
            androidx.work.impl.WorkDatabase r3 = r3.f14143e     // Catch:{ all -> 0x03b0 }
            androidx.work.impl.b.af r3 = r3.mo9364F()     // Catch:{ all -> 0x03b0 }
            androidx.work.impl.b.ae r3 = r3.mo9422b(r0)     // Catch:{ all -> 0x03b0 }
            if (r3 != 0) goto L_0x0361
            java.util.concurrent.Executor r0 = r7.f14316h     // Catch:{ all -> 0x03b0 }
            androidx.work.impl.background.systemalarm.f r3 = new androidx.work.impl.background.systemalarm.f     // Catch:{ all -> 0x03b0 }
            r3.<init>(r7)     // Catch:{ all -> 0x03b0 }
            r0.execute(r3)     // Catch:{ all -> 0x03b0 }
            goto L_0x03ad
        L_0x0361:
            boolean r5 = r3.mo9415d()     // Catch:{ all -> 0x03b0 }
            r7.f14319k = r5     // Catch:{ all -> 0x03b0 }
            if (r5 != 0) goto L_0x0384
            androidx.work.ad r5 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x03b0 }
            java.lang.String r8 = androidx.work.impl.background.systemalarm.C4528h.f14309a     // Catch:{ all -> 0x03b0 }
            java.lang.String r9 = "No constraints for "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = r9.concat(r0)     // Catch:{ all -> 0x03b0 }
            r5.mo9309a(r8, r0)     // Catch:{ all -> 0x03b0 }
            java.util.List r0 = java.util.Collections.singletonList(r3)     // Catch:{ all -> 0x03b0 }
            r7.mo9387e(r0)     // Catch:{ all -> 0x03b0 }
            goto L_0x03ad
        L_0x0384:
            androidx.work.impl.a.e r0 = r7.f14314f     // Catch:{ all -> 0x03b0 }
            java.util.List r3 = java.util.Collections.singletonList(r3)     // Catch:{ all -> 0x03b0 }
            r0.mo9389a(r3)     // Catch:{ all -> 0x03b0 }
            goto L_0x03ad
        L_0x038e:
            androidx.work.ad r3 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x03b0 }
            java.lang.String r5 = androidx.work.impl.background.systemalarm.C4523c.f14298a     // Catch:{ all -> 0x03b0 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x03b0 }
            r7.<init>()     // Catch:{ all -> 0x03b0 }
            java.lang.String r8 = "WorkSpec "
            r7.append(r8)     // Catch:{ all -> 0x03b0 }
            r7.append(r0)     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = " is is already being handled for ACTION_DELAY_MET"
            r7.append(r0)     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x03b0 }
            r3.mo9309a(r5, r0)     // Catch:{ all -> 0x03b0 }
        L_0x03ad:
            monitor-exit(r2)     // Catch:{ all -> 0x03b0 }
            goto L_0x049e
        L_0x03b0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03b0 }
            throw r0     // Catch:{ all -> 0x04cf }
        L_0x03b3:
            java.lang.String r0 = "ACTION_STOP_WORK"
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x04cf }
            if (r0 == 0) goto L_0x0426
            android.os.Bundle r0 = r9.getExtras()     // Catch:{ all -> 0x04cf }
            java.lang.String r5 = "KEY_WORKSPEC_ID"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ all -> 0x04cf }
            java.lang.String r9 = "KEY_WORKSPEC_GENERATION"
            boolean r9 = r0.containsKey(r9)     // Catch:{ all -> 0x04cf }
            if (r9 == 0) goto L_0x03e9
            java.lang.String r9 = "KEY_WORKSPEC_GENERATION"
            int r0 = r0.getInt(r9)     // Catch:{ all -> 0x04cf }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x04cf }
            r9.<init>(r2)     // Catch:{ all -> 0x04cf }
            androidx.work.impl.w r2 = r8.f14302e     // Catch:{ all -> 0x04cf }
            androidx.work.impl.b.r r10 = new androidx.work.impl.b.r     // Catch:{ all -> 0x04cf }
            r10.<init>(r5, r0)     // Catch:{ all -> 0x04cf }
            androidx.work.impl.v r0 = r2.mo9561a(r10)     // Catch:{ all -> 0x04cf }
            if (r0 == 0) goto L_0x03ef
            r9.add(r0)     // Catch:{ all -> 0x04cf }
            goto L_0x03ef
        L_0x03e9:
            androidx.work.impl.w r0 = r8.f14302e     // Catch:{ all -> 0x04cf }
            java.util.List r9 = r0.mo9563c(r5)     // Catch:{ all -> 0x04cf }
        L_0x03ef:
            java.util.Iterator r0 = r9.iterator()     // Catch:{ all -> 0x04cf }
        L_0x03f3:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x04cf }
            if (r2 == 0) goto L_0x049e
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x04cf }
            androidx.work.impl.v r2 = (androidx.work.impl.C4620v) r2     // Catch:{ all -> 0x04cf }
            androidx.work.ad r9 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x04cf }
            java.lang.String r10 = androidx.work.impl.background.systemalarm.C4523c.f14298a     // Catch:{ all -> 0x04cf }
            java.lang.String r11 = "Handing stopWork work for "
            java.lang.String r12 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x04cf }
            java.lang.String r11 = r11.concat(r12)     // Catch:{ all -> 0x04cf }
            r9.mo9309a(r10, r11)     // Catch:{ all -> 0x04cf }
            androidx.work.impl.ag r9 = r3.f14331e     // Catch:{ all -> 0x04cf }
            r9.mo9395o(r2)     // Catch:{ all -> 0x04cf }
            android.content.Context r9 = r8.f14299b     // Catch:{ all -> 0x04cf }
            androidx.work.impl.ag r10 = r3.f14331e     // Catch:{ all -> 0x04cf }
            androidx.work.impl.b.r r11 = r2.f14519a     // Catch:{ all -> 0x04cf }
            androidx.work.impl.background.systemalarm.C4522b.m12870a(r9, r10, r11)     // Catch:{ all -> 0x04cf }
            androidx.work.impl.b.r r2 = r2.f14519a     // Catch:{ all -> 0x04cf }
            r3.mo9473a(r2, r7)     // Catch:{ all -> 0x04cf }
            goto L_0x03f3
        L_0x0426:
            java.lang.String r0 = "ACTION_EXECUTION_COMPLETED"
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x04cf }
            if (r0 == 0) goto L_0x0462
            androidx.work.impl.b.r r0 = androidx.work.impl.background.systemalarm.C4523c.m12879g(r9)     // Catch:{ all -> 0x04cf }
            android.os.Bundle r2 = r9.getExtras()     // Catch:{ all -> 0x04cf }
            java.lang.String r3 = "KEY_NEEDS_RESCHEDULE"
            boolean r2 = r2.getBoolean(r3)     // Catch:{ all -> 0x04cf }
            androidx.work.ad r3 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x04cf }
            java.lang.String r7 = androidx.work.impl.background.systemalarm.C4523c.f14298a     // Catch:{ all -> 0x04cf }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x04cf }
            r10.<init>()     // Catch:{ all -> 0x04cf }
            java.lang.String r11 = "Handling onExecutionCompleted "
            r10.append(r11)     // Catch:{ all -> 0x04cf }
            r10.append(r9)     // Catch:{ all -> 0x04cf }
            java.lang.String r9 = ", "
            r10.append(r9)     // Catch:{ all -> 0x04cf }
            r10.append(r5)     // Catch:{ all -> 0x04cf }
            java.lang.String r5 = r10.toString()     // Catch:{ all -> 0x04cf }
            r3.mo9309a(r7, r5)     // Catch:{ all -> 0x04cf }
            r8.mo9473a(r0, r2)     // Catch:{ all -> 0x04cf }
            goto L_0x049e
        L_0x0462:
            androidx.work.ad r0 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x04cf }
            java.lang.String r2 = androidx.work.impl.background.systemalarm.C4523c.f14298a     // Catch:{ all -> 0x04cf }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x04cf }
            r3.<init>()     // Catch:{ all -> 0x04cf }
            java.lang.String r5 = "Ignoring intent "
            r3.append(r5)     // Catch:{ all -> 0x04cf }
            r3.append(r9)     // Catch:{ all -> 0x04cf }
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x04cf }
            java.lang.String r3 = r5.concat(r3)     // Catch:{ all -> 0x04cf }
            r0.mo9314f(r2, r3)     // Catch:{ all -> 0x04cf }
            goto L_0x049e
        L_0x0481:
            androidx.work.ad r0 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x04cf }
            java.lang.String r2 = androidx.work.impl.background.systemalarm.C4523c.f14298a     // Catch:{ all -> 0x04cf }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x04cf }
            r3.<init>()     // Catch:{ all -> 0x04cf }
            java.lang.String r5 = "Invalid request for "
            r3.append(r5)     // Catch:{ all -> 0x04cf }
            r3.append(r11)     // Catch:{ all -> 0x04cf }
            r3.append(r10)     // Catch:{ all -> 0x04cf }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x04cf }
            r0.mo9311c(r2, r3)     // Catch:{ all -> 0x04cf }
        L_0x049e:
            androidx.work.ad r0 = androidx.work.C4380ad.m12560h()
            java.lang.String r2 = androidx.work.impl.background.systemalarm.C4533m.f14327a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Releasing operation wake lock ("
            r3.<init>(r5)
            r3.append(r4)
            java.lang.String r4 = ") "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r0.mo9309a(r2, r3)
            r6.release()
            androidx.work.impl.background.systemalarm.m r0 = r1.f14322a
            androidx.work.impl.utils.b.b r2 = r0.f14336j
            java.util.concurrent.Executor r2 = r2.f14488c
            androidx.work.impl.background.systemalarm.l r3 = new androidx.work.impl.background.systemalarm.l
            r3.<init>(r0)
        L_0x04cb:
            r2.execute(r3)
            return
        L_0x04cf:
            r0 = move-exception
            androidx.work.ad r2 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x0509 }
            java.lang.String r3 = androidx.work.impl.background.systemalarm.C4533m.f14327a     // Catch:{ all -> 0x0509 }
            java.lang.String r5 = "Unexpected error in onHandleIntent"
            r2.mo9312d(r3, r5, r0)     // Catch:{ all -> 0x0509 }
            androidx.work.ad r0 = androidx.work.C4380ad.m12560h()
            java.lang.String r2 = androidx.work.impl.background.systemalarm.C4533m.f14327a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Releasing operation wake lock ("
            r3.<init>(r5)
            r3.append(r4)
            java.lang.String r4 = ") "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r0.mo9309a(r2, r3)
            r6.release()
            androidx.work.impl.background.systemalarm.m r0 = r1.f14322a
            androidx.work.impl.utils.b.b r2 = r0.f14336j
            java.util.concurrent.Executor r2 = r2.f14488c
            androidx.work.impl.background.systemalarm.l r3 = new androidx.work.impl.background.systemalarm.l
            r3.<init>(r0)
            goto L_0x04cb
        L_0x0509:
            r0 = move-exception
            androidx.work.ad r2 = androidx.work.C4380ad.m12560h()
            java.lang.String r3 = androidx.work.impl.background.systemalarm.C4533m.f14327a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Releasing operation wake lock ("
            r5.<init>(r7)
            r5.append(r4)
            java.lang.String r4 = ") "
            r5.append(r4)
            r5.append(r6)
            java.lang.String r4 = r5.toString()
            r2.mo9309a(r3, r4)
            r6.release()
            androidx.work.impl.background.systemalarm.m r2 = r1.f14322a
            androidx.work.impl.utils.b.b r3 = r2.f14336j
            java.util.concurrent.Executor r3 = r3.f14488c
            androidx.work.impl.background.systemalarm.l r4 = new androidx.work.impl.background.systemalarm.l
            r4.<init>(r2)
            r3.execute(r4)
            throw r0
        L_0x053b:
            return
        L_0x053c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x053c }
            goto L_0x0540
        L_0x053f:
            throw r0
        L_0x0540:
            goto L_0x053f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.C4529i.run():void");
    }
}
