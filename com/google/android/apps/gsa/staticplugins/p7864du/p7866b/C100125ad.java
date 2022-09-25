package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7178p.C91071a;
import com.google.android.apps.gsa.shared.util.p7178p.C91072b;
import com.google.android.apps.gsa.store.C118309ag;
import com.google.android.apps.gsa.store.C118312c;
import com.google.android.apps.gsa.store.C118316g;
import com.google.android.apps.gsa.store.C118329t;
import com.google.android.apps.gsa.store.C118334w;
import com.google.android.apps.gsa.store.C118335x;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.ad */
/* compiled from: PG */
public final class C100125ad implements C118312c, C91072b {

    /* renamed from: a */
    public static final C59071e f279965a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.du.b.ad");

    /* renamed from: b */
    static final long f279966b = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: c */
    static final C58485gu f279967c = C58485gu.m89847o("blob_table_key_index", "attribute_table_blob_attribute_index");

    /* renamed from: d */
    static final C58485gu f279968d = C58485gu.m89849q("blob_table_blob_path_index", "blob_table_expire_index", "attribute_table_id_index", "attribute_table_index");

    /* renamed from: e */
    public final C21370a f279969e;

    /* renamed from: f */
    public final Object f279970f = new Object();

    /* renamed from: g */
    public final C100190p f279971g;

    /* renamed from: h */
    public final C100127af f279972h;

    /* renamed from: i */
    public final C118827a f279973i;

    /* renamed from: j */
    public final C118575h f279974j;

    /* renamed from: k */
    public final C118561t f279975k;

    /* renamed from: l */
    public final AtomicInteger f279976l = new AtomicInteger();

    /* renamed from: m */
    public final C22871g f279977m;

    /* renamed from: n */
    public final AtomicBoolean f279978n = new AtomicBoolean();

    /* renamed from: o */
    protected final C100181g f279979o;

    /* renamed from: p */
    public long f279980p;

    /* renamed from: q */
    protected C100186l f279981q;

    /* renamed from: r */
    public final C84466a f279982r;

    /* renamed from: s */
    public final C100147az f279983s;

    /* renamed from: t */
    private final C22871g f279984t;

    /* renamed from: u */
    private boolean f279985u;

    protected C100125ad(C100190p pVar, C100127af afVar, C21370a aVar, String str, C100147az azVar, C84466a aVar2, C118575h hVar, C118827a aVar3, C118561t tVar, C91071a aVar4, C100181g gVar, C22871g gVar2, C22871g gVar3) {
        this.f279969e = aVar;
        this.f279971g = pVar;
        this.f279972h = afVar;
        this.f279981q = new C100186l(afVar, str, pVar);
        this.f279983s = azVar;
        this.f279982r = aVar2;
        this.f279973i = aVar3;
        this.f279974j = hVar;
        this.f279975k = tVar;
        this.f279979o = gVar;
        this.f279977m = gVar2;
        this.f279984t = gVar3;
        if (aVar4 != null) {
            aVar4.mo85337a(this);
        }
    }

    /* renamed from: o */
    private final SQLiteDatabase m165931o(Callable callable) {
        try {
            return (SQLiteDatabase) callable.call();
        } catch (SQLiteDatabaseCorruptException e) {
            C59104x c = f279965a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SqliteContentStore");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(33199)).mo56386p("Corrupt database found");
            this.f279981q.close();
            if (this.f279981q.getDatabaseName() != null) {
                this.f279972h.getDatabasePath(this.f279981q.getDatabaseName()).delete();
            }
            return (SQLiteDatabase) callable.call();
        } catch (SQLiteFullException e2) {
            this.f279975k.mo103754e(C118522by.TRIM_FROM_DISK, C118472ag.f328819i);
            throw e2;
        } catch (SQLiteException e3) {
            C59104x c2 = f279965a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "SqliteContentStore");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e3)).mo56372aa(33200)).mo56386p("Error getting database");
            if (mo91768n()) {
                return null;
            }
            C58838bb.m90883r(!this.f279985u);
            C100190p pVar = this.f279971g;
            boolean z = pVar.f280213a;
            this.f279985u = true;
            this.f279981q = new C100186l(this.f279972h, (String) null, pVar);
            return (SQLiteDatabase) callable.call();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final SQLiteDatabase mo91757a() {
        SQLiteDatabase o;
        synchronized (this.f279970f) {
            try {
                o = m165931o(new C100196v(this));
            } catch (Exception e) {
                C59104x c = f279965a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SqliteContentStore");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(33201)).mo56386p("Error creating database connection");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final SQLiteDatabase mo91758b() {
        SQLiteDatabase o;
        synchronized (this.f279970f) {
            try {
                o = m165931o(new C100195u(this));
            } catch (Exception e) {
                C59104x c = f279965a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SqliteContentStore");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(33202)).mo56386p("Error creating database connection");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o;
    }

    /* renamed from: c */
    public final C118316g mo91759c() {
        return new C118316g();
    }

    /* renamed from: e */
    public final C118329t mo91760e() {
        return new C118329t();
    }

    /* renamed from: f */
    public final void mo76735f() {
        this.f279983s.mo91777b();
        synchronized (this.f279970f) {
            int i = this.f279976l.get();
            int a = this.f279983s.mo91776a();
            if (i == 0 && a == 0) {
                C58976aa aaVar = C58975e.f156826a;
                try {
                    mo91767m();
                } catch (Exception e) {
                    C59104x c = f279965a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "SqliteContentStore");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(33208)).mo56386p("Error in onTrimMemory");
                }
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
            }
        }
    }

    /* renamed from: g */
    public final C118335x mo91761g() {
        return new C118335x();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        String databaseName;
        boolean z;
        String str;
        synchronized (this.f279970f) {
            databaseName = this.f279981q.getDatabaseName();
            z = this.f279981q.f280209a;
        }
        long j = 0;
        if (databaseName != null) {
            C60870cx a = this.f279977m.mo28201a("SqliteContentStore#calculateSize", new C100192r(this, databaseName));
            C91018d.m148680c();
            try {
                j = ((Long) C60856cj.m92910s(C90877ak.m148471e(a, 100, TimeUnit.MILLISECONDS, this.f279984t))).longValue();
            } catch (Exception e) {
                C59104x c = f279965a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SqliteContentStore");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(33204)).mo56386p("Error determining database size");
            }
        }
        fVar.mo85291r("SqliteContentStore");
        fVar.mo85279c("dbFileName").mo85276a(C90752i.m148229c(this.f279972h.f279996a));
        C91005e c2 = fVar.mo85279c("dbFileSize");
        if (j < 1024) {
            str = String.format("%dB", new Object[]{Long.valueOf(j)});
        } else if (j < 1048576) {
            str = String.format("%dKB", new Object[]{Long.valueOf(j >> 10)});
        } else {
            str = String.format("%dMB", new Object[]{Long.valueOf((j >> 10) >> 10)});
        }
        c2.mo85276a(C90752i.m148229c(str));
        fVar.mo85279c("isEphemeral").mo85276a(C90752i.m148228b(Boolean.valueOf(mo91768n())));
        fVar.mo85279c("isDowngraded").mo85276a(C90752i.m148228b(Boolean.valueOf(z)));
        fVar.mo85279c("numberOfOpenIterators").mo85276a(C90752i.m148230d(Integer.valueOf(this.f279983s.mo91776a())));
        fVar.mo85279c("numberOfPendingOperations").mo85276a(C90752i.m148230d(Integer.valueOf(this.f279976l.get())));
        return;
    }

    /* renamed from: h */
    public final C60870cx mo91762h(C118309ag... agVarArr) {
        this.f279983s.mo91777b();
        return C60922j.m93044g(mo91766l(new C100197w(this, agVarArr)), new C100198x(this), C60826bg.f164896a);
    }

    /* renamed from: i */
    public final C60870cx mo91763i(C118334w wVar) {
        return mo91766l(new C100193s(this, wVar));
    }

    /* renamed from: j */
    public final C60870cx mo91764j() {
        C118335x xVar = new C118335x();
        xVar.f328478e = false;
        return mo91763i(xVar.mo103674a());
    }

    /* renamed from: k */
    public final C60870cx mo91765k(String str) {
        C118335x xVar = new C118335x();
        xVar.f328477d.mo55396h(Arrays.asList(new String[]{str}));
        C60870cx g = C60922j.m93044g(mo91763i(xVar.mo103674a()), new C100200z(str), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final C60870cx mo91766l(Callable callable) {
        this.f279976l.getAndIncrement();
        try {
            return C60922j.m93044g((C60870cx) callable.call(), new C100191q(this), C60826bg.f164896a);
        } catch (Exception e) {
            this.f279976l.getAndDecrement();
            C59104x c = f279965a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SqliteContentStore");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(33203)).mo56386p("Error in callable");
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo91767m() {
        synchronized (this.f279970f) {
            this.f279981q.close();
        }
    }

    /* renamed from: n */
    public final boolean mo91768n() {
        boolean z;
        synchronized (this.f279970f) {
            z = this.f279985u;
        }
        return z;
    }
}
