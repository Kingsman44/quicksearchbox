package androidx.p124l.p126b;

import android.os.SystemClock;
import androidx.core.p094f.C1899l;
import com.google.android.libraries.social.licenses.C41958f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/* renamed from: androidx.l.b.a */
/* compiled from: PG */
public final class C2311a extends C2317g implements Runnable {

    /* renamed from: a */
    public boolean f6464a;

    /* renamed from: b */
    final /* synthetic */ C2312b f6465b;

    public C2311a(C2312b bVar) {
        this.f6465b = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo5687a() {
        try {
            C2312b bVar = this.f6465b;
            TreeSet treeSet = new TreeSet();
            treeSet.addAll(C41958f.m73472c(bVar.f6470d));
            return Collections.unmodifiableList(new ArrayList(treeSet));
        } catch (C1899l e) {
            if (this.f6482d.get()) {
                return null;
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo5688b(Object obj) {
        C2312b bVar = this.f6465b;
        if (bVar.f6466a != this) {
            bVar.mo5692b(this);
        } else if (!bVar.f6472f) {
            SystemClock.uptimeMillis();
            bVar.f6466a = null;
            bVar.mo5694d(obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo5689c() {
        this.f6465b.mo5692b(this);
    }

    public final void run() {
        this.f6464a = false;
        this.f6465b.mo5691a();
    }
}
