package androidx.media3.common.p136b;

import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: androidx.media3.common.b.t */
/* compiled from: PG */
public final class C2632t {

    /* renamed from: a */
    public final C2616d f7296a;

    /* renamed from: b */
    public final C2626n f7297b;

    /* renamed from: c */
    public final C2630r f7298c;

    /* renamed from: d */
    public final CopyOnWriteArraySet f7299d;

    /* renamed from: e */
    private final ArrayDeque f7300e;

    /* renamed from: f */
    private final ArrayDeque f7301f;

    /* renamed from: g */
    private boolean f7302g;

    public C2632t(Looper looper, C2616d dVar, C2630r rVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, rVar);
    }

    /* renamed from: b */
    public final void mo6203b() {
        if (!this.f7301f.isEmpty()) {
            if (!this.f7297b.mo6165d()) {
                C2626n nVar = this.f7297b;
                nVar.mo6172k(nVar.mo6162a(0));
            }
            boolean isEmpty = this.f7300e.isEmpty();
            this.f7300e.addAll(this.f7301f);
            this.f7301f.clear();
            if (!(!isEmpty)) {
                while (!this.f7300e.isEmpty()) {
                    ((Runnable) this.f7300e.peekFirst()).run();
                    this.f7300e.removeFirst();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo6204c(int i, C2629q qVar) {
        this.f7301f.add(new C2628p(new CopyOnWriteArraySet(this.f7299d), i, qVar));
    }

    /* renamed from: d */
    public final void mo6205d() {
        Iterator it = this.f7299d.iterator();
        while (it.hasNext()) {
            ((C2631s) it.next()).mo6199a(this.f7298c);
        }
        this.f7299d.clear();
        this.f7302g = true;
    }

    /* renamed from: e */
    public final void mo6206e(Object obj) {
        Iterator it = this.f7299d.iterator();
        while (it.hasNext()) {
            C2631s sVar = (C2631s) it.next();
            if (sVar.f7292a.equals(obj)) {
                sVar.mo6199a(this.f7298c);
                this.f7299d.remove(sVar);
            }
        }
    }

    public C2632t(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, C2616d dVar, C2630r rVar) {
        this.f7296a = dVar;
        this.f7299d = copyOnWriteArraySet;
        this.f7298c = rVar;
        this.f7300e = new ArrayDeque();
        this.f7301f = new ArrayDeque();
        this.f7297b = dVar.mo6160b(looper, new C2627o(this));
    }

    /* renamed from: a */
    public final void mo6202a(Object obj) {
        if (!this.f7302g) {
            obj.getClass();
            this.f7299d.add(new C2631s(obj));
        }
    }
}
