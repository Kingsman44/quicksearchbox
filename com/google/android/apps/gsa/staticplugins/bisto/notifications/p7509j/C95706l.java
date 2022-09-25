package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.bisto.C89622at;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.C89683v;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90427h;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90432m;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90433n;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7503e.C95635d;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7504f.C95638b;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96470ba;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.j.l */
/* compiled from: PG */
public final class C95706l implements C89683v {

    /* renamed from: a */
    public static final C59071e f267942a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.j.l");

    /* renamed from: b */
    public static final Duration f267943b = Duration.ofMinutes(3);

    /* renamed from: c */
    public static final long f267944c = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: j */
    private static final String[] f267945j = {"serialized_identifier", "expiration_timestamp", "interruptive_notification_id", "state"};

    /* renamed from: d */
    public final Object f267946d = new Object();

    /* renamed from: e */
    public final Context f267947e;

    /* renamed from: f */
    public final C95635d f267948f;

    /* renamed from: g */
    public volatile boolean f267949g = false;

    /* renamed from: h */
    public volatile boolean f267950h = false;

    /* renamed from: i */
    public C124548d f267951i;

    /* renamed from: k */
    private final C89622at f267952k;

    /* renamed from: l */
    private final C95638b f267953l;

    /* renamed from: m */
    private final C21370a f267954m;

    /* renamed from: n */
    private final C89656k f267955n;

    /* renamed from: o */
    private final C84516aa f267956o;

    /* renamed from: p */
    private final C96470ba f267957p;

    /* renamed from: q */
    private final Set f267958q;

    public C95706l(Context context, C89622at atVar, C95635d dVar, C95638b bVar, C21370a aVar, C89656k kVar, C84516aa aaVar, C96470ba baVar, Set set) {
        this.f267947e = context;
        this.f267952k = atVar;
        this.f267948f = dVar;
        this.f267953l = bVar;
        this.f267954m = aVar;
        this.f267955n = kVar;
        this.f267956o = aaVar;
        this.f267957p = baVar;
        this.f267958q = set;
    }

    /* renamed from: h */
    private final SQLiteDatabase m158473h() {
        try {
            return this.f267948f.getWritableDatabase();
        } catch (SQLiteException e) {
            C59104x c = f267942a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EngagementTracker");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(16460)).mo56386p("Failed to get writeable database.");
            return null;
        }
    }

    /* renamed from: i */
    private final C95696b m158474i(Cursor cursor) {
        C90427h hVar;
        String str;
        String[] split = cursor.getString(cursor.getColumnIndex("serialized_identifier")).split(C90427h.f252607a, 4);
        int length = split.length;
        if (length < 3) {
            hVar = null;
        } else {
            String str2 = split[0];
            String str3 = split[1];
            boolean parseBoolean = Boolean.parseBoolean(split[2]);
            if (length == 3) {
                str = null;
            } else {
                str = split[3];
            }
            hVar = new C90427h(str2, str3, parseBoolean, str);
        }
        if (hVar == null) {
            C89655j.m145957a("Unable to deserialize identifier");
            return null;
        }
        Long d = C95635d.m158332d(cursor, "expiration_timestamp");
        return new C95696b(this, hVar, this.f267954m, this.f267955n, cursor.getInt(cursor.getColumnIndex("state")), C95635d.m158332d(cursor, "interruptive_notification_id"), d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        return r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95696b mo89660b(com.google.android.apps.gsa.shared.notificationlistening.common.C90427h r13) {
        /*
            r12 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Object r0 = r12.f267946d
            monitor-enter(r0)
            com.google.android.apps.gsa.staticplugins.bisto.notifications.e.d r1 = r12.f267948f     // Catch:{ all -> 0x009d }
            android.database.sqlite.SQLiteDatabase r2 = r1.getReadableDatabase()     // Catch:{ all -> 0x009d }
            r1 = 0
            java.lang.String[] r4 = f267945j     // Catch:{ SQLException -> 0x005e }
            r3 = 1
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLException -> 0x005e }
            java.lang.String r3 = r13.mo84153a()     // Catch:{ SQLException -> 0x005e }
            r5 = 0
            r6[r5] = r3     // Catch:{ SQLException -> 0x005e }
            java.lang.String r3 = "engagement"
            java.lang.String r5 = "serialized_identifier=?"
            r7 = 0
            r8 = 0
            java.lang.String r9 = "1"
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLException -> 0x005e }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLException -> 0x005e }
            if (r2 == 0) goto L_0x0046
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.b r2 = r12.m158474i(r1)     // Catch:{ SQLException -> 0x005e }
            if (r2 != 0) goto L_0x003f
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.b r2 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.b     // Catch:{ SQLException -> 0x005e }
            com.google.android.libraries.f.a r6 = r12.f267954m     // Catch:{ SQLException -> 0x005e }
            com.google.android.apps.gsa.shared.bisto.k r7 = r12.f267955n     // Catch:{ SQLException -> 0x005e }
            r8 = 1
            r9 = 0
            r10 = 0
            r3 = r2
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLException -> 0x005e }
        L_0x003f:
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ all -> 0x009d }
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            return r2
        L_0x0046:
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.b r2 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.b     // Catch:{ SQLException -> 0x005e }
            com.google.android.libraries.f.a r6 = r12.f267954m     // Catch:{ SQLException -> 0x005e }
            com.google.android.apps.gsa.shared.bisto.k r7 = r12.f267955n     // Catch:{ SQLException -> 0x005e }
            r8 = 1
            r9 = 0
            r10 = 0
            r3 = r2
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLException -> 0x005e }
            if (r1 == 0) goto L_0x005a
            r1.close()     // Catch:{ all -> 0x009d }
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            return r2
        L_0x005c:
            r13 = move-exception
            goto L_0x0097
        L_0x005e:
            r2 = move-exception
            com.google.common.f.e r3 = f267942a     // Catch:{ all -> 0x005c }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x005c }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x005c }
            java.lang.String r5 = "EngagementTracker"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x005c }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x005c }
            com.google.common.f.x r2 = r3.mo56382g(r2)     // Catch:{ all -> 0x005c }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x005c }
            r3 = 16468(0x4054, float:2.3077E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x005c }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "Exception reading from database."
            r2.mo56386p(r3)     // Catch:{ all -> 0x005c }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.b r2 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.b     // Catch:{ all -> 0x005c }
            com.google.android.libraries.f.a r7 = r12.f267954m     // Catch:{ all -> 0x005c }
            com.google.android.apps.gsa.shared.bisto.k r8 = r12.f267955n     // Catch:{ all -> 0x005c }
            r9 = 1
            r10 = 0
            r11 = 0
            r4 = r2
            r5 = r12
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x0095
            r1.close()     // Catch:{ all -> 0x009d }
        L_0x0095:
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            return r2
        L_0x0097:
            if (r1 == 0) goto L_0x009c
            r1.close()     // Catch:{ all -> 0x009d }
        L_0x009c:
            throw r13     // Catch:{ all -> 0x009d }
        L_0x009d:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l.mo89660b(com.google.android.apps.gsa.shared.notificationlistening.common.h):com.google.android.apps.gsa.staticplugins.bisto.notifications.j.b");
    }

    /* renamed from: c */
    public final void mo89661c(C90421b bVar, int i, boolean z) {
        C90433n nVar = bVar.f252594o;
        if (nVar != null) {
            C90432m mVar = new C90432m(i, z, this.f267954m.mo26870b());
            nVar.mo84167b(mVar);
            this.f267948f.mo89592o(new C95700f(this, mVar, nVar));
            return;
        }
        C59104x c = f267942a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "EngagementTracker");
        ((C59052c) ((C59052c) c).mo56372aa(16483)).mo56389s("Missing playbackState for %s", bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = f267942a.mo56226d();
        r2.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "EngagementTracker");
        r1 = (com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(16485);
        r2 = "fail transaction";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r3 = f267942a.mo56226d();
        r3.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "EngagementTracker");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r1)).mo56372aa(16488)).mo56386p("fail transaction");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c5, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x002a, B:19:0x0055] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89662d() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f267946d
            monitor-enter(r0)
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00c6 }
            android.database.sqlite.SQLiteDatabase r1 = r6.m158473h()     // Catch:{ all -> 0x00c6 }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            return
        L_0x000d:
            r1.beginTransactionNonExclusive()     // Catch:{ all -> 0x00c6 }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLException -> 0x0054 }
            com.google.android.libraries.f.a r3 = r6.f267954m     // Catch:{ SQLException -> 0x0054 }
            long r3 = r3.mo26870b()     // Catch:{ SQLException -> 0x0054 }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ SQLException -> 0x0054 }
            r4 = 0
            r2[r4] = r3     // Catch:{ SQLException -> 0x0054 }
            java.lang.String r3 = "engagement"
            java.lang.String r4 = "expiration_timestamp<=?"
            r1.delete(r3, r4, r2)     // Catch:{ SQLException -> 0x0054 }
            r1.setTransactionSuccessful()     // Catch:{ SQLException -> 0x0054 }
            r1.endTransaction()     // Catch:{ SQLiteDiskIOException -> 0x002e }
            goto L_0x009c
        L_0x002e:
            r1 = move-exception
            com.google.common.f.e r2 = f267942a     // Catch:{ all -> 0x00c6 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x00c6 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = "EngagementTracker"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x00c6 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00c6 }
            com.google.common.f.x r1 = r2.mo56382g(r1)     // Catch:{ all -> 0x00c6 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00c6 }
            r2 = 16485(0x4065, float:2.31E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x00c6 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "fail transaction"
        L_0x004e:
            r1.mo56386p(r2)     // Catch:{ all -> 0x00c6 }
            goto L_0x009c
        L_0x0052:
            r2 = move-exception
            goto L_0x009e
        L_0x0054:
            r2 = move-exception
            com.google.common.f.e r3 = f267942a     // Catch:{ all -> 0x0052 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x0052 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0052 }
            java.lang.String r5 = "EngagementTracker"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x0052 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0052 }
            com.google.common.f.x r2 = r3.mo56382g(r2)     // Catch:{ all -> 0x0052 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0052 }
            r3 = 16486(0x4066, float:2.3102E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x0052 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0052 }
            java.lang.String r3 = "Unable to clear expired engagements from database."
            r2.mo56386p(r3)     // Catch:{ all -> 0x0052 }
            r1.endTransaction()     // Catch:{ SQLiteDiskIOException -> 0x007b }
            goto L_0x009c
        L_0x007b:
            r1 = move-exception
            com.google.common.f.e r2 = f267942a     // Catch:{ all -> 0x00c6 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x00c6 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = "EngagementTracker"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x00c6 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00c6 }
            com.google.common.f.x r1 = r2.mo56382g(r1)     // Catch:{ all -> 0x00c6 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00c6 }
            r2 = 16487(0x4067, float:2.3103E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x00c6 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "fail transaction"
            goto L_0x004e
        L_0x009c:
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            return
        L_0x009e:
            r1.endTransaction()     // Catch:{ SQLiteDiskIOException -> 0x00a2 }
            goto L_0x00c5
        L_0x00a2:
            r1 = move-exception
            com.google.common.f.e r3 = f267942a     // Catch:{ all -> 0x00c6 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x00c6 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = "EngagementTracker"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x00c6 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00c6 }
            com.google.common.f.x r1 = r3.mo56382g(r1)     // Catch:{ all -> 0x00c6 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00c6 }
            r3 = 16488(0x4068, float:2.3105E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r3)     // Catch:{ all -> 0x00c6 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00c6 }
            java.lang.String r3 = "fail transaction"
            r1.mo56386p(r3)     // Catch:{ all -> 0x00c6 }
        L_0x00c5:
            throw r2     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x00ca
        L_0x00c9:
            throw r1
        L_0x00ca:
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l.mo89662d():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = f267942a.mo56226d();
        r2.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "EngagementTracker");
        r1 = (com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(16492);
        r2 = "fail transaction";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r3 = f267942a.mo56226d();
        r3.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "EngagementTracker");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r1)).mo56372aa(16495)).mo56386p("fail transaction");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0019, B:19:0x0044] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo89663e() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f267946d
            monitor-enter(r0)
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00b5 }
            android.database.sqlite.SQLiteDatabase r1 = r6.m158473h()     // Catch:{ all -> 0x00b5 }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
            return
        L_0x000d:
            r1.beginTransaction()     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "engagement"
            r3 = 0
            r1.delete(r2, r3, r3)     // Catch:{ SQLException -> 0x0043 }
            r1.setTransactionSuccessful()     // Catch:{ SQLException -> 0x0043 }
            r1.endTransaction()     // Catch:{ SQLiteDiskIOException -> 0x001d }
            goto L_0x008b
        L_0x001d:
            r1 = move-exception
            com.google.common.f.e r2 = f267942a     // Catch:{ all -> 0x00b5 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x00b5 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00b5 }
            java.lang.String r4 = "EngagementTracker"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x00b5 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00b5 }
            com.google.common.f.x r1 = r2.mo56382g(r1)     // Catch:{ all -> 0x00b5 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00b5 }
            r2 = 16492(0x406c, float:2.311E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x00b5 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "fail transaction"
        L_0x003d:
            r1.mo56386p(r2)     // Catch:{ all -> 0x00b5 }
            goto L_0x008b
        L_0x0041:
            r2 = move-exception
            goto L_0x008d
        L_0x0043:
            r2 = move-exception
            com.google.common.f.e r3 = f267942a     // Catch:{ all -> 0x0041 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x0041 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0041 }
            java.lang.String r5 = "EngagementTracker"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x0041 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0041 }
            com.google.common.f.x r2 = r3.mo56382g(r2)     // Catch:{ all -> 0x0041 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0041 }
            r3 = 16493(0x406d, float:2.3112E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x0041 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = "Failed to clear engagement storage."
            r2.mo56386p(r3)     // Catch:{ all -> 0x0041 }
            r1.endTransaction()     // Catch:{ SQLiteDiskIOException -> 0x006a }
            goto L_0x008b
        L_0x006a:
            r1 = move-exception
            com.google.common.f.e r2 = f267942a     // Catch:{ all -> 0x00b5 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x00b5 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00b5 }
            java.lang.String r4 = "EngagementTracker"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x00b5 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00b5 }
            com.google.common.f.x r1 = r2.mo56382g(r1)     // Catch:{ all -> 0x00b5 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00b5 }
            r2 = 16494(0x406e, float:2.3113E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x00b5 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "fail transaction"
            goto L_0x003d
        L_0x008b:
            monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
            return
        L_0x008d:
            r1.endTransaction()     // Catch:{ SQLiteDiskIOException -> 0x0091 }
            goto L_0x00b4
        L_0x0091:
            r1 = move-exception
            com.google.common.f.e r3 = f267942a     // Catch:{ all -> 0x00b5 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x00b5 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00b5 }
            java.lang.String r5 = "EngagementTracker"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x00b5 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00b5 }
            com.google.common.f.x r1 = r3.mo56382g(r1)     // Catch:{ all -> 0x00b5 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00b5 }
            r3 = 16495(0x406f, float:2.3114E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r3)     // Catch:{ all -> 0x00b5 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00b5 }
            java.lang.String r3 = "fail transaction"
            r1.mo56386p(r3)     // Catch:{ all -> 0x00b5 }
        L_0x00b4:
            throw r2     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
            goto L_0x00b9
        L_0x00b8:
            throw r1
        L_0x00b9:
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l.mo89663e():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r5 = f267942a.mo56226d();
        r5.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "EngagementTracker");
        r4 = (com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r4)).mo56372aa(16509);
        r5 = "fail transaction";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r5.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r6 = f267942a.mo56226d();
        r6.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "EngagementTracker");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r5)).mo56372aa(16512)).mo56386p("fail transaction");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0113, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r5 = f267942a.mo56226d();
        r5.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "EngagementTracker");
        r4 = (com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r4)).mo56372aa(16503);
        r5 = "fail transaction";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0137, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r4.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0187, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r6 = f267942a.mo56226d();
        r6.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "EngagementTracker");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r4)).mo56372aa(16506)).mo56386p("fail transaction");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01aa, code lost:
        throw r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:12:0x0026, B:20:0x0051] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:56:0x010f, B:64:0x013a] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89664f(com.google.android.apps.gsa.shared.notificationlistening.common.C90427h r4, int r5, java.lang.Long r6, java.lang.Long r7) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != r0) goto L_0x00c5
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Object r1 = r3.f267946d
            monitor-enter(r1)
            android.database.sqlite.SQLiteDatabase r5 = r3.m158473h()     // Catch:{ all -> 0x00c2 }
            if (r5 != 0) goto L_0x0010
            monitor-exit(r1)     // Catch:{ all -> 0x00c2 }
            return
        L_0x0010:
            r5.beginTransactionNonExclusive()     // Catch:{ all -> 0x00c2 }
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLException -> 0x0050 }
            java.lang.String r4 = r4.mo84153a()     // Catch:{ SQLException -> 0x0050 }
            r7 = 0
            r6[r7] = r4     // Catch:{ SQLException -> 0x0050 }
            java.lang.String r4 = "engagement"
            java.lang.String r7 = "serialized_identifier=?"
            r5.delete(r4, r7, r6)     // Catch:{ SQLException -> 0x0050 }
            r5.setTransactionSuccessful()     // Catch:{ SQLException -> 0x0050 }
            r5.endTransaction()     // Catch:{ SQLiteDiskIOException -> 0x002a }
            goto L_0x0098
        L_0x002a:
            r4 = move-exception
            com.google.common.f.e r5 = f267942a     // Catch:{ all -> 0x00c2 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x00c2 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = "EngagementTracker"
            r5.mo56378ag(r6, r7)     // Catch:{ all -> 0x00c2 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x00c2 }
            com.google.common.f.x r4 = r5.mo56382g(r4)     // Catch:{ all -> 0x00c2 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x00c2 }
            r5 = 16509(0x407d, float:2.3134E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x00c2 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x00c2 }
            java.lang.String r5 = "fail transaction"
        L_0x004a:
            r4.mo56386p(r5)     // Catch:{ all -> 0x00c2 }
            goto L_0x0098
        L_0x004e:
            r4 = move-exception
            goto L_0x009a
        L_0x0050:
            r4 = move-exception
            com.google.common.f.e r6 = f267942a     // Catch:{ all -> 0x004e }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x004e }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "EngagementTracker"
            r6.mo56378ag(r7, r0)     // Catch:{ all -> 0x004e }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x004e }
            com.google.common.f.x r4 = r6.mo56382g(r4)     // Catch:{ all -> 0x004e }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x004e }
            r6 = 16510(0x407e, float:2.3135E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r6)     // Catch:{ all -> 0x004e }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x004e }
            java.lang.String r6 = "Unable to clear item from database."
            r4.mo56386p(r6)     // Catch:{ all -> 0x004e }
            r5.endTransaction()     // Catch:{ SQLiteDiskIOException -> 0x0077 }
            goto L_0x0098
        L_0x0077:
            r4 = move-exception
            com.google.common.f.e r5 = f267942a     // Catch:{ all -> 0x00c2 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x00c2 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = "EngagementTracker"
            r5.mo56378ag(r6, r7)     // Catch:{ all -> 0x00c2 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x00c2 }
            com.google.common.f.x r4 = r5.mo56382g(r4)     // Catch:{ all -> 0x00c2 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x00c2 }
            r5 = 16511(0x407f, float:2.3137E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x00c2 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x00c2 }
            java.lang.String r5 = "fail transaction"
            goto L_0x004a
        L_0x0098:
            monitor-exit(r1)     // Catch:{ all -> 0x00c2 }
            return
        L_0x009a:
            r5.endTransaction()     // Catch:{ SQLiteDiskIOException -> 0x009e }
            goto L_0x00c1
        L_0x009e:
            r5 = move-exception
            com.google.common.f.e r6 = f267942a     // Catch:{ all -> 0x00c2 }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x00c2 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "EngagementTracker"
            r6.mo56378ag(r7, r0)     // Catch:{ all -> 0x00c2 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x00c2 }
            com.google.common.f.x r5 = r6.mo56382g(r5)     // Catch:{ all -> 0x00c2 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x00c2 }
            r6 = 16512(0x4080, float:2.3138E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ all -> 0x00c2 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = "fail transaction"
            r5.mo56386p(r6)     // Catch:{ all -> 0x00c2 }
        L_0x00c1:
            throw r4     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c2 }
            throw r4
        L_0x00c5:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Object r0 = r3.f267946d
            monitor-enter(r0)
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x01ab }
            r1.<init>()     // Catch:{ all -> 0x01ab }
            java.lang.String r2 = "serialized_identifier"
            java.lang.String r4 = r4.mo84153a()     // Catch:{ all -> 0x01ab }
            r1.put(r2, r4)     // Catch:{ all -> 0x01ab }
            java.lang.String r4 = "state"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x01ab }
            r1.put(r4, r5)     // Catch:{ all -> 0x01ab }
            if (r6 != 0) goto L_0x00e9
            java.lang.String r4 = "interruptive_notification_id"
            r1.putNull(r4)     // Catch:{ all -> 0x01ab }
            goto L_0x00ee
        L_0x00e9:
            java.lang.String r4 = "interruptive_notification_id"
            r1.put(r4, r6)     // Catch:{ all -> 0x01ab }
        L_0x00ee:
            if (r7 != 0) goto L_0x00f6
            java.lang.String r4 = "expiration_timestamp"
            r1.putNull(r4)     // Catch:{ all -> 0x01ab }
            goto L_0x00fb
        L_0x00f6:
            java.lang.String r4 = "expiration_timestamp"
            r1.put(r4, r7)     // Catch:{ all -> 0x01ab }
        L_0x00fb:
            android.database.sqlite.SQLiteDatabase r4 = r3.m158473h()     // Catch:{ all -> 0x01ab }
            if (r4 != 0) goto L_0x0103
            monitor-exit(r0)     // Catch:{ all -> 0x01ab }
            return
        L_0x0103:
            r4.beginTransactionNonExclusive()     // Catch:{ all -> 0x01ab }
            java.lang.String r5 = "engagement"
            r6 = 0
            r4.replaceOrThrow(r5, r6, r1)     // Catch:{ SQLException -> 0x0139 }
            r4.setTransactionSuccessful()     // Catch:{ SQLException -> 0x0139 }
            r4.endTransaction()     // Catch:{ SQLiteDiskIOException -> 0x0113 }
            goto L_0x0181
        L_0x0113:
            r4 = move-exception
            com.google.common.f.e r5 = f267942a     // Catch:{ all -> 0x01ab }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x01ab }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01ab }
            java.lang.String r7 = "EngagementTracker"
            r5.mo56378ag(r6, r7)     // Catch:{ all -> 0x01ab }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x01ab }
            com.google.common.f.x r4 = r5.mo56382g(r4)     // Catch:{ all -> 0x01ab }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x01ab }
            r5 = 16503(0x4077, float:2.3126E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x01ab }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x01ab }
            java.lang.String r5 = "fail transaction"
        L_0x0133:
            r4.mo56386p(r5)     // Catch:{ all -> 0x01ab }
            goto L_0x0181
        L_0x0137:
            r5 = move-exception
            goto L_0x0183
        L_0x0139:
            r5 = move-exception
            com.google.common.f.e r6 = f267942a     // Catch:{ all -> 0x0137 }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x0137 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0137 }
            java.lang.String r1 = "EngagementTracker"
            r6.mo56378ag(r7, r1)     // Catch:{ all -> 0x0137 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x0137 }
            com.google.common.f.x r5 = r6.mo56382g(r5)     // Catch:{ all -> 0x0137 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0137 }
            r6 = 16504(0x4078, float:2.3127E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ all -> 0x0137 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0137 }
            java.lang.String r6 = "Unable to store item into database."
            r5.mo56386p(r6)     // Catch:{ all -> 0x0137 }
            r4.endTransaction()     // Catch:{ SQLiteDiskIOException -> 0x0160 }
            goto L_0x0181
        L_0x0160:
            r4 = move-exception
            com.google.common.f.e r5 = f267942a     // Catch:{ all -> 0x01ab }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x01ab }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01ab }
            java.lang.String r7 = "EngagementTracker"
            r5.mo56378ag(r6, r7)     // Catch:{ all -> 0x01ab }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x01ab }
            com.google.common.f.x r4 = r5.mo56382g(r4)     // Catch:{ all -> 0x01ab }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x01ab }
            r5 = 16505(0x4079, float:2.3128E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x01ab }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x01ab }
            java.lang.String r5 = "fail transaction"
            goto L_0x0133
        L_0x0181:
            monitor-exit(r0)     // Catch:{ all -> 0x01ab }
            return
        L_0x0183:
            r4.endTransaction()     // Catch:{ SQLiteDiskIOException -> 0x0187 }
            goto L_0x01aa
        L_0x0187:
            r4 = move-exception
            com.google.common.f.e r6 = f267942a     // Catch:{ all -> 0x01ab }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x01ab }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01ab }
            java.lang.String r1 = "EngagementTracker"
            r6.mo56378ag(r7, r1)     // Catch:{ all -> 0x01ab }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x01ab }
            com.google.common.f.x r4 = r6.mo56382g(r4)     // Catch:{ all -> 0x01ab }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x01ab }
            r6 = 16506(0x407a, float:2.313E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r6)     // Catch:{ all -> 0x01ab }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x01ab }
            java.lang.String r6 = "fail transaction"
            r4.mo56386p(r6)     // Catch:{ all -> 0x01ab }
        L_0x01aa:
            throw r5     // Catch:{ all -> 0x01ab }
        L_0x01ab:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01ab }
            goto L_0x01af
        L_0x01ae:
            throw r4
        L_0x01af:
            goto L_0x01ae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l.mo89664f(com.google.android.apps.gsa.shared.notificationlistening.common.h, int, java.lang.Long, java.lang.Long):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0159  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95705k mo89665g(com.google.android.apps.gsa.shared.notificationlistening.common.C90421b r13) {
        /*
            r12 = this;
            boolean r0 = r13.f252587h
            r1 = 1
            r2 = 4
            if (r0 != 0) goto L_0x000e
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a r13 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a
            r13.<init>(r2, r1)
            return r13
        L_0x000e:
            com.google.android.apps.gsa.shared.bisto.k r0 = r12.f267955n
            r3 = 153(0x99, float:2.14E-43)
            boolean r0 = r0.mo83555j(r3)
            r3 = 2
            if (r0 == 0) goto L_0x003e
            android.content.Context r0 = r12.f267947e
            java.lang.String r4 = "android.permission.READ_PHONE_STATE"
            int r0 = androidx.core.content.C1882h.m5137c(r0, r4)
            if (r0 != 0) goto L_0x0024
            goto L_0x003e
        L_0x0024:
            com.google.common.f.e r13 = f267942a
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "EngagementTracker"
            r13.mo56378ag(r0, r1)
            java.lang.String r0 = "Set to fetch because phone call permissions not granted."
            r1 = 16481(0x4061, float:2.3095E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r1)).mo56386p(r0)
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a r13 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a
            r13.<init>(r2, r3)
            return r13
        L_0x003e:
            com.google.android.apps.gsa.shared.bisto.at r0 = r12.f267952k
            java.lang.String r4 = r13.mo84145c()
            android.service.notification.NotificationListenerService$RankingMap r5 = r0.mo83487b()
            boolean r0 = r0.mo83491f(r4, r5)
            r4 = 3
            if (r0 == 0) goto L_0x022f
            java.lang.String r0 = r13.f252591l
            android.content.Context r5 = r12.f267947e     // Catch:{ NameNotFoundException -> 0x0082 }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0082 }
            boolean r0 = r5.isPackageSuspended(r0)     // Catch:{ NameNotFoundException -> 0x0082 }
            if (r0 != 0) goto L_0x005e
            goto L_0x0097
        L_0x005e:
            com.google.common.f.e r0 = f267942a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "EngagementTracker"
            r0.mo56378ag(r1, r3)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 16479(0x405f, float:2.3092E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = "Set to fetch because package is suspended (%s)."
            java.lang.String r13 = r13.f252591l
            r0.mo56389s(r1, r13)
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a r13 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a
            r13.<init>(r2, r2)
            return r13
        L_0x0082:
            r0 = move-exception
            com.google.common.f.e r5 = f267942a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "EngagementTracker"
            r5.mo56378ag(r6, r7)
            java.lang.String r6 = "Failed to check for package being suspended."
            r7 = 16513(0x4081, float:2.314E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r7)).mo56386p(r6)
        L_0x0097:
            boolean r0 = r12.f267949g
            if (r0 != 0) goto L_0x00a4
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a r13 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a
            r0 = 5
            r13.<init>(r2, r0)
            return r13
        L_0x00a4:
            boolean r0 = r12.f267950h
            if (r0 != 0) goto L_0x0226
            android.content.Context r0 = r12.f267947e
            java.lang.String r5 = "audio"
            java.lang.Object r0 = r0.getSystemService(r5)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            int r5 = r0.getRingerMode()
            int r0 = r0.getStreamVolume(r4)
            if (r5 == 0) goto L_0x021d
            if (r0 > 0) goto L_0x00c0
            goto L_0x021d
        L_0x00c0:
            com.google.android.apps.gsa.search.core.aj.aa r0 = r12.f267956o
            boolean r0 = r0.mo78229c()
            if (r0 != 0) goto L_0x00eb
            com.google.android.apps.gsa.staticplugins.bisto.notifications.f.b r0 = r12.f267953l
            dagger.a r0 = r0.f267680a
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.notifications.f.a r0 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7504f.C95637a) r0
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r0 = r0.mo89601a()
            if (r0 == 0) goto L_0x00e1
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r0 = r0.mo106513k()
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r5 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q.CAR_ACCESSORY
            if (r0 != r5) goto L_0x00e1
            goto L_0x00eb
        L_0x00e1:
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a r13 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a
            r0 = 8
            r13.<init>(r2, r0)
            return r13
        L_0x00eb:
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r0 = r12.f267951i
            r5 = 0
            if (r0 == 0) goto L_0x010b
            com.google.android.d.ee r0 = r0.mo106460A()
            com.google.android.d.ee r6 = com.google.android.p10712d.C142407ee.HFP_STATE_UNSPECIFIED
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x010b
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r0 = r12.f267951i
            com.google.android.d.ee r0 = r0.mo106460A()
            com.google.android.d.ee r6 = com.google.android.p10712d.C142407ee.HFP_STATE_ACTIVE
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0131
            goto L_0x013e
        L_0x010b:
            com.google.android.apps.gsa.shared.bisto.at r0 = r12.f267952k
            android.service.notification.StatusBarNotification[] r0 = r0.mo83492g()
            if (r0 == 0) goto L_0x013e
            int r6 = r0.length
            r7 = 0
        L_0x0115:
            if (r7 >= r6) goto L_0x013e
            r8 = r0[r7]
            java.util.Set r9 = r12.f267958q
            java.util.Iterator r9 = r9.iterator()
        L_0x011f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x013b
            java.lang.Object r10 = r9.next()
            com.google.android.apps.gsa.staticplugins.bisto.notifications.c.b r10 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7501c.C95554b) r10
            boolean r10 = r10.mo89446a(r8)
            if (r10 == 0) goto L_0x011f
        L_0x0131:
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a r13 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a
            r0 = 9
            r13.<init>(r2, r0)
            return r13
        L_0x013b:
            int r7 = r7 + 1
            goto L_0x0115
        L_0x013e:
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r0 = r12.f267951i
            if (r0 == 0) goto L_0x0159
            com.google.android.d.dm r0 = r0.mo106527y()
            com.google.android.d.dm r6 = com.google.android.p10712d.C142388dm.ACTIVE_AUDIO_SOURCE_SECONDARY
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x014f
            goto L_0x0159
        L_0x014f:
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a r13 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a
            r0 = 10
            r13.<init>(r2, r0)
            return r13
        L_0x0159:
            com.google.android.apps.gsa.shared.bisto.k r0 = r12.f267955n
            boolean r0 = r0.mo83561p()
            if (r0 == 0) goto L_0x01aa
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r0 = r12.f267951i
            if (r0 != 0) goto L_0x0181
            com.google.common.f.e r13 = f267942a
            com.google.common.f.x r13 = r13.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "EngagementTracker"
            r13.mo56378ag(r0, r1)
            java.lang.String r0 = "Set to fetch because we don't have device info to check PR/unlock."
            r1 = 16472(0x4058, float:2.3082E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r1)).mo56386p(r0)
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a r13 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a
            r0 = 11
            r13.<init>(r2, r0)
            return r13
        L_0x0181:
            com.google.android.apps.gsa.staticplugins.bisto.util.ba r2 = r12.f267957p
            boolean r0 = r0.mo106487aa()
            int r0 = r2.mo90164a(r0)
            if (r0 != 0) goto L_0x018e
            goto L_0x01aa
        L_0x018e:
            com.google.common.f.e r13 = f267942a
            com.google.common.f.x r13 = r13.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "EngagementTracker"
            r13.mo56378ag(r1, r2)
            java.lang.String r1 = "Set to chime as personal results require permission (%d)."
            r2 = 16471(0x4057, float:2.3081E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r2)).mo56387q(r1, r0)
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a r13 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a
            r0 = 12
            r13.<init>(r3, r0)
            return r13
        L_0x01aa:
            com.google.android.apps.gsa.staticplugins.bisto.notifications.f.b r0 = r12.f267953l
            boolean r0 = r0.mo89602a()
            if (r0 != 0) goto L_0x01b3
            goto L_0x0213
        L_0x01b3:
            boolean r0 = r13 instanceof com.google.android.apps.gsa.shared.notificationlistening.common.C90425f
            if (r0 == 0) goto L_0x01bf
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a r13 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a
            r0 = 200(0xc8, float:2.8E-43)
            r13.<init>(r1, r0)
            return r13
        L_0x01bf:
            com.google.android.apps.gsa.shared.bisto.k r0 = r12.f267955n
            java.util.Set r0 = com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94644h.m156132a(r0)
            java.lang.String r2 = r13.f252591l
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0213
            com.google.android.apps.gsa.shared.notificationlistening.common.h r0 = r13.mo84131b()
            java.lang.Object r2 = r12.f267946d
            monitor-enter(r2)
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.b r0 = r12.mo89660b(r0)     // Catch:{ all -> 0x0210 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0210 }
            long r6 = r13.mo84144a()     // Catch:{ all -> 0x0210 }
            java.lang.Long r13 = r0.f267921c     // Catch:{ all -> 0x0210 }
            if (r13 == 0) goto L_0x01f4
            long r8 = r13.longValue()     // Catch:{ all -> 0x0210 }
            com.google.android.libraries.f.a r13 = r0.f267919a     // Catch:{ all -> 0x0210 }
            long r10 = r13.mo26870b()     // Catch:{ all -> 0x0210 }
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 > 0) goto L_0x01f4
            r13 = 0
            r0.mo89650a(r1, r13)     // Catch:{ all -> 0x0210 }
        L_0x01f4:
            int r13 = r0.f267920b     // Catch:{ all -> 0x0210 }
            if (r13 == 0) goto L_0x0206
            if (r13 == r3) goto L_0x0204
            if (r13 == r4) goto L_0x0204
            java.lang.Long r13 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0210 }
            r0.mo89650a(r3, r13)     // Catch:{ all -> 0x0210 }
            goto L_0x0207
        L_0x0204:
            r1 = 3
            goto L_0x0207
        L_0x0206:
            r1 = 0
        L_0x0207:
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a r13 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a     // Catch:{ all -> 0x0210 }
            r0 = 900(0x384, float:1.261E-42)
            r13.<init>(r1, r0)     // Catch:{ all -> 0x0210 }
            monitor-exit(r2)     // Catch:{ all -> 0x0210 }
            return r13
        L_0x0210:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0210 }
            throw r13
        L_0x0213:
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a r13 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a
            r0 = 13
            r13.<init>(r3, r0)
            return r13
        L_0x021d:
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a r13 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a
            r0 = 7
            r13.<init>(r2, r0)
            return r13
        L_0x0226:
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a r13 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a
            r0 = 6
            r13.<init>(r2, r0)
            return r13
        L_0x022f:
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a r13 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a
            r13.<init>(r2, r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l.mo89665g(com.google.android.apps.gsa.shared.notificationlistening.common.b):com.google.android.apps.gsa.staticplugins.bisto.notifications.j.k");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (r0 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r0 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94644h.m156132a(r9.f267955n);
        r2 = new java.lang.StringBuilder();
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0083, code lost:
        if (r0.hasNext() == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0085, code lost:
        r3 = (java.lang.CharSequence) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        r2.append(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        if (r0.hasNext() == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        r2.append(",");
        r3 = (java.lang.CharSequence) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009e, code lost:
        r0 = r2.toString();
        r10.println("Spoken Notification Apps: " + r0);
     */
    /* renamed from: iq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83403iq(com.google.android.apps.gsa.shared.bisto.C89619aq r10, boolean r11) {
        /*
            r9 = this;
            java.lang.Object r11 = r9.f267946d
            monitor-enter(r11)
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00be }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.e.d r0 = r9.f267948f     // Catch:{ all -> 0x00be }
            android.database.sqlite.SQLiteDatabase r1 = r0.getReadableDatabase()     // Catch:{ all -> 0x00be }
            r0 = 0
            java.lang.String r2 = "engagement"
            java.lang.String[] r3 = f267945j     // Catch:{ SQLException -> 0x0048 }
            r4 = 0
            r5 = 0
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLException -> 0x0048 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLException -> 0x0048 }
        L_0x001b:
            boolean r1 = r0.moveToNext()     // Catch:{ SQLException -> 0x0048 }
            if (r1 == 0) goto L_0x0040
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.b r1 = r9.m158474i(r0)     // Catch:{ SQLException -> 0x0048 }
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = r1.toString()     // Catch:{ SQLException -> 0x0048 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLException -> 0x0048 }
            r2.<init>()     // Catch:{ SQLException -> 0x0048 }
            java.lang.String r3 = "Engagement: "
            r2.append(r3)     // Catch:{ SQLException -> 0x0048 }
            r2.append(r1)     // Catch:{ SQLException -> 0x0048 }
            java.lang.String r1 = r2.toString()     // Catch:{ SQLException -> 0x0048 }
            r10.println(r1)     // Catch:{ SQLException -> 0x0048 }
            goto L_0x001b
        L_0x0040:
            if (r0 == 0) goto L_0x006e
        L_0x0042:
            r0.close()     // Catch:{ all -> 0x00be }
            goto L_0x006e
        L_0x0046:
            r10 = move-exception
            goto L_0x00b8
        L_0x0048:
            r1 = move-exception
            com.google.common.f.e r2 = f267942a     // Catch:{ all -> 0x0046 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x0046 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "EngagementTracker"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x0046 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0046 }
            com.google.common.f.x r1 = r2.mo56382g(r1)     // Catch:{ all -> 0x0046 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0046 }
            r2 = 16490(0x406a, float:2.3107E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0046 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = "Unable to dump engagements."
            r1.mo56386p(r2)     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x006e
            goto L_0x0042
        L_0x006e:
            com.google.android.apps.gsa.shared.bisto.k r0 = r9.f267955n     // Catch:{ all -> 0x00be }
            java.util.Set r0 = com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94644h.m156132a(r0)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = ","
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            r2.<init>()     // Catch:{ all -> 0x00be }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00be }
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x009e
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x00be }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x00be }
        L_0x008b:
            r2.append(r3)     // Catch:{ all -> 0x00be }
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x009e
            r2.append(r1)     // Catch:{ all -> 0x00be }
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x00be }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x00be }
            goto L_0x008b
        L_0x009e:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00be }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            r1.<init>()     // Catch:{ all -> 0x00be }
            java.lang.String r2 = "Spoken Notification Apps: "
            r1.append(r2)     // Catch:{ all -> 0x00be }
            r1.append(r0)     // Catch:{ all -> 0x00be }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00be }
            r10.println(r0)     // Catch:{ all -> 0x00be }
            monitor-exit(r11)     // Catch:{ all -> 0x00be }
            return
        L_0x00b8:
            if (r0 == 0) goto L_0x00bd
            r0.close()     // Catch:{ all -> 0x00be }
        L_0x00bd:
            throw r10     // Catch:{ all -> 0x00be }
        L_0x00be:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00be }
            goto L_0x00c2
        L_0x00c1:
            throw r10
        L_0x00c2:
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l.mo83403iq(com.google.android.apps.gsa.shared.bisto.aq, boolean):void");
    }
}
