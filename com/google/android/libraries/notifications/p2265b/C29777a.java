package com.google.android.libraries.notifications.p2265b;

import android.content.Intent;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.p2292g.C30004l;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55568d;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.b.a */
/* compiled from: PG */
public final class C29777a extends C29779c {

    /* renamed from: a */
    public String f80680a;

    /* renamed from: b */
    public C29820k f80681b;

    /* renamed from: c */
    public List f80682c;

    /* renamed from: d */
    public Intent f80683d;

    /* renamed from: e */
    public C55568d f80684e;

    /* renamed from: f */
    public int f80685f;

    /* renamed from: g */
    private int f80686g;

    /* renamed from: h */
    private C55564bq f80687h;

    /* renamed from: i */
    private C30004l f80688i;

    /* renamed from: j */
    private boolean f80689j;

    /* renamed from: k */
    private byte f80690k;

    /* renamed from: l */
    private int f80691l;

    /* renamed from: a */
    public final C29780d mo34953a() {
        int i;
        List list;
        C55564bq bqVar;
        int i2;
        C30004l lVar;
        if (this.f80690k == 3 && (i = this.f80685f) != 0 && (list = this.f80682c) != null && (bqVar = this.f80687h) != null && (i2 = this.f80691l) != 0 && (lVar = this.f80688i) != null) {
            return new C29778b(i, this.f80686g, this.f80680a, this.f80681b, list, bqVar, i2, this.f80683d, lVar, this.f80684e, this.f80689j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f80685f == 0) {
            sb.append(" source");
        }
        if ((this.f80690k & 1) == 0) {
            sb.append(" type");
        }
        if (this.f80682c == null) {
            sb.append(" threads");
        }
        if (this.f80687h == null) {
            sb.append(" threadStateUpdate");
        }
        if (this.f80691l == 0) {
            sb.append(" removeReason");
        }
        if (this.f80688i == null) {
            sb.append(" localThreadState");
        }
        if ((this.f80690k & 2) == 0) {
            sb.append(" activityLaunched");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final List mo34954b() {
        List list = this.f80682c;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"threads\" has not been set");
    }

    /* renamed from: c */
    public final void mo34955c(boolean z) {
        this.f80689j = z;
        this.f80690k = (byte) (this.f80690k | 2);
    }

    /* renamed from: d */
    public final void mo34956d(C30004l lVar) {
        if (lVar != null) {
            this.f80688i = lVar;
            return;
        }
        throw new NullPointerException("Null localThreadState");
    }

    /* renamed from: e */
    public final void mo34957e(C55564bq bqVar) {
        if (bqVar != null) {
            this.f80687h = bqVar;
            return;
        }
        throw new NullPointerException("Null threadStateUpdate");
    }

    /* renamed from: f */
    public final void mo34958f(int i) {
        this.f80686g = i;
        this.f80690k = (byte) (this.f80690k | 1);
    }

    /* renamed from: g */
    public final void mo34959g(int i) {
        if (i != 0) {
            this.f80691l = i;
            return;
        }
        throw new NullPointerException("Null removeReason");
    }
}
