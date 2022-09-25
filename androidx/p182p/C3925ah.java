package androidx.p182p;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.C4054i;
import androidx.p186q.p187a.C4056k;
import androidx.p186q.p187a.C4057l;
import androidx.p186q.p187a.p188a.C4035d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p3186j$.util.DesugarCollections;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69497an;
import p5462h.p5463a.C69498ao;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.ah */
/* compiled from: PG */
public abstract class C3925ah {

    /* renamed from: a */
    public volatile C4049d f12557a;

    /* renamed from: b */
    public Executor f12558b;

    /* renamed from: c */
    public Executor f12559c;

    /* renamed from: d */
    public C4054i f12560d;

    /* renamed from: e */
    public final C3972y f12561e = mo8176b();

    /* renamed from: f */
    public boolean f12562f;

    /* renamed from: g */
    public List f12563g;

    /* renamed from: h */
    public final Map f12564h = new LinkedHashMap();

    /* renamed from: i */
    public C3938c f12565i;

    /* renamed from: j */
    public final Map f12566j;

    /* renamed from: k */
    private final ReentrantReadWriteLock f12567k = new ReentrantReadWriteLock();

    /* renamed from: l */
    private final ThreadLocal f12568l = new ThreadLocal();

    public C3925ah() {
        C69664n.m101060f(DesugarCollections.synchronizedMap(new LinkedHashMap()), "synchronizedMap(mutableMapOf())");
        this.f12566j = new LinkedHashMap();
    }

    /* renamed from: J */
    public final Cursor mo8166J(C4056k kVar, CancellationSignal cancellationSignal) {
        C69664n.m101061g(kVar, "query");
        mo8174R();
        mo8175S();
        if (cancellationSignal != null) {
            Cursor c = mo8167K().mo8208a().mo8243c(kVar, cancellationSignal);
            C69664n.m101060f(c, "{\n            openHelper…(query, signal)\n        }");
            return c;
        }
        Cursor a = mo8167K().mo8208a().mo8241a(kVar);
        C69664n.m101060f(a, "{\n            openHelper…se.query(query)\n        }");
        return a;
    }

    /* renamed from: K */
    public final C4054i mo8167K() {
        C4054i iVar = this.f12560d;
        if (iVar != null) {
            return iVar;
        }
        C69664n.m101065k("internalOpenHelper");
        return null;
    }

    /* renamed from: L */
    public final C4057l mo8168L(String str) {
        C69664n.m101061g(str, "sql");
        mo8174R();
        mo8175S();
        C4057l d = mo8167K().mo8208a().mo8245d(str);
        C69664n.m101060f(d, "openHelper.writableDatabase.compileStatement(sql)");
        return d;
    }

    /* renamed from: M */
    public final Object mo8169M(Callable callable) {
        C69664n.m101061g(callable, "body");
        mo8181p();
        try {
            Object call = callable.call();
            mo8188w();
            return call;
        } finally {
            mo8183r();
        }
    }

    /* renamed from: N */
    public final Object mo8170N(Class cls, C4054i iVar) {
        if (cls.isInstance(iVar)) {
            return iVar;
        }
        if (iVar instanceof C3964q) {
            return mo8170N(cls, ((C3964q) iVar).mo8209b());
        }
        return null;
    }

    /* renamed from: O */
    public final Executor mo8171O() {
        Executor executor = this.f12558b;
        if (executor != null) {
            return executor;
        }
        C69664n.m101065k("internalQueryExecutor");
        return null;
    }

    /* renamed from: P */
    public final Executor mo8172P() {
        Executor executor = this.f12559c;
        if (executor != null) {
            return executor;
        }
        C69664n.m101065k("internalTransactionExecutor");
        return null;
    }

    /* renamed from: Q */
    public final Lock mo8173Q() {
        ReentrantReadWriteLock.ReadLock readLock = this.f12567k.readLock();
        C69664n.m101060f(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    /* renamed from: R */
    public final void mo8174R() {
        if (!this.f12562f && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: S */
    public final void mo8175S() {
        if (!mo8189x() && this.f12568l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C3972y mo8176b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C4054i mo8177c(C3963p pVar);

    /* renamed from: h */
    public List mo8178h(Map map) {
        C69664n.m101061g(map, "autoMigrationSpecs");
        return C69496am.f185918a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Map mo8179i() {
        return C69497an.f185919a;
    }

    /* renamed from: j */
    public Set mo8180j() {
        return C69498ao.f185920a;
    }

    /* renamed from: p */
    public final void mo8181p() {
        mo8174R();
        C3938c cVar = this.f12565i;
        if (cVar == null) {
            mo8184s();
        } else {
            cVar.mo8222b(new C3923af(this));
        }
    }

    /* renamed from: q */
    public final void mo8182q() {
        if (mo8190y()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.f12567k.writeLock();
            C69664n.m101060f(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                C3972y yVar = this.f12561e;
                C3973z zVar = yVar.f12684g;
                yVar.f12684g = null;
                mo8167K().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    /* renamed from: r */
    public final void mo8183r() {
        C3938c cVar = this.f12565i;
        if (cVar == null) {
            mo8185t();
        } else {
            cVar.mo8222b(new C3924ag(this));
        }
    }

    /* renamed from: s */
    public final void mo8184s() {
        mo8174R();
        C4049d a = mo8167K().mo8208a();
        C69664n.m101060f(a, "openHelper.writableDatabase");
        this.f12561e.mo8312b(a);
        if (a.mo8253l()) {
            a.mo8247f();
        } else {
            a.mo8246e();
        }
    }

    /* renamed from: t */
    public final void mo8185t() {
        mo8167K().mo8208a().mo8248g();
        if (!mo8189x()) {
            C3972y yVar = this.f12561e;
            if (yVar.f12680c.compareAndSet(false, true)) {
                C3938c cVar = yVar.f12679b;
                if (cVar != null) {
                    cVar.mo8221a();
                }
                yVar.f12678a.mo8171O().execute(yVar.f12686i);
            }
        }
    }

    /* renamed from: u */
    public final void mo8186u(C4049d dVar) {
        C3972y yVar = this.f12561e;
        synchronized (yVar.f12685h) {
            if (yVar.f12681d) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            ((C4035d) dVar).f12902a.execSQL("PRAGMA temp_store = MEMORY;");
            ((C4035d) dVar).f12902a.execSQL("PRAGMA recursive_triggers='ON';");
            ((C4035d) dVar).f12902a.execSQL("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            yVar.mo8312b(dVar);
            yVar.f12682e = dVar.mo8245d("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            yVar.f12681d = true;
        }
    }

    /* renamed from: v */
    public final void mo8187v(Runnable runnable) {
        C69664n.m101061g(runnable, "body");
        mo8181p();
        try {
            runnable.run();
            mo8188w();
        } finally {
            mo8183r();
        }
    }

    /* renamed from: w */
    public final void mo8188w() {
        mo8167K().mo8208a().mo8250i();
    }

    /* renamed from: x */
    public final boolean mo8189x() {
        return mo8167K().mo8208a().mo8251j();
    }

    /* renamed from: y */
    public final boolean mo8190y() {
        Boolean bool;
        C3938c cVar = this.f12565i;
        if (cVar != null) {
            bool = Boolean.valueOf(!cVar.f12606i);
        } else {
            C4049d dVar = this.f12557a;
            bool = dVar != null ? Boolean.valueOf(((C4035d) dVar).f12902a.isOpen()) : null;
        }
        return C69664n.m101066l(bool, true);
    }
}
