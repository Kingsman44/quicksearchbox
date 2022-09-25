package org.p5633c.p5634a.p5640f;

import android.support.p033v7.widget.LinearLayoutManager;
import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.f.a */
/* compiled from: PG */
final class C72271a {

    /* renamed from: a */
    public final long f192353a;

    /* renamed from: b */
    public final C72288l f192354b;

    /* renamed from: c */
    C72271a f192355c;

    /* renamed from: d */
    private String f192356d;

    /* renamed from: e */
    private int f192357e = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: f */
    private int f192358f = LinearLayoutManager.INVALID_OFFSET;

    public C72271a(C72288l lVar, long j) {
        this.f192353a = j;
        this.f192354b = lVar;
    }

    /* renamed from: a */
    public final int mo63651a(long j) {
        C72271a aVar = this.f192355c;
        if (aVar != null && j >= aVar.f192353a) {
            return aVar.mo63651a(j);
        }
        int i = this.f192357e;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int a = this.f192354b.mo37823a(this.f192353a);
        this.f192357e = a;
        return a;
    }

    /* renamed from: b */
    public final int mo63652b(long j) {
        C72271a aVar = this.f192355c;
        if (aVar != null && j >= aVar.f192353a) {
            return aVar.mo63652b(j);
        }
        int i = this.f192358f;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int b = this.f192354b.mo37824b(this.f192353a);
        this.f192358f = b;
        return b;
    }

    /* renamed from: c */
    public final String mo63653c(long j) {
        C72271a aVar = this.f192355c;
        if (aVar != null && j >= aVar.f192353a) {
            return aVar.mo63653c(j);
        }
        if (this.f192356d == null) {
            this.f192356d = this.f192354b.mo37830g(this.f192353a);
        }
        return this.f192356d;
    }
}
